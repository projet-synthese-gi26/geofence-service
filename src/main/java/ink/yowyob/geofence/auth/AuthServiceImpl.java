package ink.yowyob.geofence.auth;

import ink.yowyob.geofence.Enum.UserRole;
import ink.yowyob.geofence.dto.request.AuthRequest.*;
import ink.yowyob.geofence.dto.response.AuthResponse;
import ink.yowyob.geofence.dto.response.RegisterResponse;
import ink.yowyob.geofence.dto.response.UserDTO;
import ink.yowyob.geofence.exception.BadCredentialsException;
import ink.yowyob.geofence.exception.PasswordMismatchException;
import ink.yowyob.geofence.exception.UserAlreadyExistsException;
import ink.yowyob.geofence.model.Role;
import ink.yowyob.geofence.model.User;
import ink.yowyob.geofence.repository.RoleRepository;
import ink.yowyob.geofence.repository.UserRepository;
import ink.yowyob.geofence.security.JwtService;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Objects;
import java.util.Optional;

@Service
@Transactional
@RequiredArgsConstructor
public class AuthServiceImpl implements AuthService {

    private static final Logger log = LoggerFactory.getLogger(AuthServiceImpl.class);
    private final UserRepository userRepository;
    private final BCryptPasswordEncoder passwordEncoder;
    private final RoleRepository roleRepository;
    private final JwtService jwtService;

    @Override
    public RegisterResponse register(RegisterDTO registerDTO) {
        Optional<User> user = this.userRepository.findByEmailOrPhoneNumberOrUsername(registerDTO.email(),registerDTO.phoneNumber(), registerDTO.username());

        if (user.isPresent()) {
            User existingUser = user.get();
            if (existingUser.getEmail().equals(registerDTO.email())) {
                throw new UserAlreadyExistsException("Un utilisateur avec cet email existe déjà.");
            } else if (existingUser.getPhoneNumber().equals(registerDTO.phoneNumber())) {
                throw new UserAlreadyExistsException("Un utilisateur avec ce numéro de téléphone existe déjà.");
            } else if (existingUser.getUsername().equals(registerDTO.username())) {
                throw new UserAlreadyExistsException("Un utilisateur avec ce nom d'utilisateur existe déjà.");
            }
        }

        if(!Objects.equals(registerDTO.password_confirmation(), registerDTO.password())) {
            throw new PasswordMismatchException();
        }

        User newUser = new User();
        newUser.setUsername(registerDTO.username());
        newUser.setEmail(registerDTO.email());
        newUser.setPhoneNumber(registerDTO.phoneNumber());
        newUser.setPassword(this.passwordEncoder.encode(registerDTO.password()));
        newUser.setDOB(registerDTO.DOB());
        newUser.setFirstname(registerDTO.firstname());
        newUser.setLastname(registerDTO.lastname());

        Role userRole = roleRepository.findByName(UserRole.USER)
                .orElseGet(() -> {
                    Role newRole = new Role();
                    newRole.setName(UserRole.USER);
                    return roleRepository.save(newRole);
                });
        newUser.setRole(userRole);
        newUser.setEnabled(true); // Activé par défaut pour simplifier

        User saveUser = userRepository.save(newUser);
        return new RegisterResponse(
                true,
                "utilisateur enregistrer avec succes",
                new UserDTO(
                        saveUser.getUuid(),
                        saveUser.getUsername(),
                        saveUser.getFirstname(),
                        saveUser.getLastname(),
                        saveUser.getPhoneNumber(),
                        saveUser.getEmail(),
                        saveUser.getDOB(),
                        saveUser.getRole().getName()
                )
        );
    }

    @Override
    public AuthResponse login(LoginDTO loginDTO) {
        User user;
        switch (loginDTO) {
            case LoginUsernameDTO loginUsernameDTO -> user = loginUsername(loginUsernameDTO);
            case LoginEmailDTO loginEmailDTO -> user = loginEmail(loginEmailDTO);
            case LoginPhoneNumberDTO loginPhoneNumberDTO -> user = loginPhone(loginPhoneNumberDTO);
            case null, default -> throw new BadCredentialsException("the provided information are not good verify it and try again");
        }

        String token = jwtService.generate(user.getUsername()).get("bearer");

        return new AuthResponse(
                new UserDTO(
                        user.getUuid(),
                        user.getUsername(),
                        user.getFirstname(),
                        user.getLastname(),
                        user.getPhoneNumber(),
                        user.getEmail(),
                        user.getDOB(),
                        user.getRole().getName()
                ),
                token);
    }

    @Override
    public User loginEmail(LoginEmailDTO loginEmailDTO) {
        Optional<User> user = userRepository.findByEmail(loginEmailDTO.email());

        if (user.isEmpty() || !this.passwordEncoder.matches(loginEmailDTO.password(), user.get().getPassword())) {
            throw new BadCredentialsException("the provided information are not good verify it and try again");
        }
        return user.get();
    }

    @Override
    public User loginUsername(LoginUsernameDTO loginUsernameDTO) {
        Optional<User> user = userRepository.findByUsername(loginUsernameDTO.username());

        if (user.isEmpty() || !this.passwordEncoder.matches(loginUsernameDTO.password(), user.get().getPassword())) {
            throw new BadCredentialsException("the provided information are not good verify it and try again");
        }
        return user.get();
    }

    @Override
    public User loginPhone(LoginPhoneNumberDTO loginPhoneNumberDTO) {
        Optional<User> user = userRepository.findByPhoneNumber(loginPhoneNumberDTO.phoneNumber());

        if (user.isEmpty() || !this.passwordEncoder.matches(loginPhoneNumberDTO.password(), user.get().getPassword())) {
            throw new BadCredentialsException("the provided information are not good verify it and try again");
        }
        return user.get();
    }

    @Override
    public AuthResponse getCurrentUser(User user) {
        // Récupérer le nom d'utilisateur depuis le contexte de sécurité
//        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
//        String username = authentication.getName();
//
//        // Charger l'utilisateur complet depuis la base de données
//        User user = userRepository.findByUsername(username)
//                .orElseThrow(() -> new UsernameNotFoundException("Utilisateur non trouvé"));

        // Générer un nouveau token JWT
        String token = jwtService.generate(user.getUsername()).get("bearer");

        // Créer et retourner la réponse contenant les détails utilisateur et le nouveau token
        return new AuthResponse(
                new UserDTO(
                        user.getUuid(),
                        user.getUsername(),
                        user.getFirstname(),
                        user.getLastname(),
                        user.getPhoneNumber(),
                        user.getEmail(),
                        user.getDOB(),
                        user.getRole().getName()
                ),
                token
        );
    }
}