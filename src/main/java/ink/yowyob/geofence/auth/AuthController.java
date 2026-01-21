package ink.yowyob.geofence.auth;

import ink.yowyob.geofence.dto.request.AuthRequest.LoginDTO;
import ink.yowyob.geofence.dto.request.AuthRequest.RegisterDTO;
import ink.yowyob.geofence.dto.response.AuthResponse;
import ink.yowyob.geofence.dto.response.RegisterResponse;
import ink.yowyob.geofence.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.ReactiveSecurityContextHolder;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;
import reactor.core.scheduler.Schedulers;

/**
 * @apiDefine UserPermission
 * @apiPermission user
 * @apiHeader {String} Authorization Bearer token (JWT)
 * @apiHeaderExample {json} Header-Example:
 *     {
 *       "Authorization": "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9..."
 *     }
 */

/**
 * @apiDefine AdminPermission
 * @apiPermission admin
 * @apiHeader {String} Authorization Bearer token (JWT) - Rôle ADMIN requis
 * @apiHeaderExample {json} Header-Example:
 *     {
 *       "Authorization": "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9..."
 *     }
 */

/**
 * @apiDefine ManagerPermission
 * @apiPermission manager
 * @apiHeader {String} Authorization Bearer token (JWT) - Rôle ADMIN ou MANAGER requis
 * @apiHeaderExample {json} Header-Example:
 *     {
 *       "Authorization": "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9..."
 *     }
 */

/**
 * @apiDefine ErrorResponse
 * @apiError (Error 4xx) {Number} status Code d'erreur HTTP
 * @apiError (Error 4xx) {String} message Message d'erreur
 * @apiErrorExample {json} Error-Response:
 *     HTTP/1.1 400 Bad Request
 *     {
 *       "status": 400,
 *       "message": "Données invalides"
 *     }
 */

/**
 * @apiDefine UserObject
 * @apiSuccess {String} uuid Identifiant unique de l'utilisateur
 * @apiSuccess {String} username Nom d'utilisateur
 * @apiSuccess {String} firstname Prénom
 * @apiSuccess {String} lastname Nom de famille
 * @apiSuccess {String} phoneNumber Numéro de téléphone
 * @apiSuccess {String} email Adresse email
 * @apiSuccess {String} DOB Date de naissance (YYYY-MM-DD)
 * @apiSuccess {String="USER","MANAGER","ADMIN"} Role Rôle de l'utilisateur
 */

@RestController
@RequestMapping("/api/auth")
@RequiredArgsConstructor
public class AuthController {
    private final AuthService authService;
    private final UserRepository userRepository;

    /**
     * @api {post} /auth/register Inscription
     * @apiName Register
     * @apiGroup Authentication
     * @apiVersion 1.0.0
     * @apiDescription Créer un nouveau compte utilisateur
     *
     * @apiBody {String{2-50}} firstname Prénom (requis)
     * @apiBody {String{2-50}} lastname Nom de famille (requis)
     * @apiBody {String{3-30}} username Nom d'utilisateur unique (requis)
     * @apiBody {String} phoneNumber Numéro de téléphone unique (requis)
     * @apiBody {String} email Adresse email valide unique (requis)
     * @apiBody {String{8-}} password Mot de passe (min 8 caractères, 1 majuscule, 1 minuscule, 1 chiffre, 1 caractère spécial) (requis)
     * @apiBody {String} password_confirmation Confirmation du mot de passe (requis)
     * @apiBody {String} DOB Date de naissance au format YYYY-MM-DD (requis)
     *
     * @apiParamExample {json} Request-Example:
     *     {
     *       "firstname": "Jean",
     *       "lastname": "Dupont",
     *       "username": "jeandupont",
     *       "phoneNumber": "+237123456789",
     *       "email": "jean.dupont@example.com",
     *       "password": "MonMotDePasse123!",
     *       "password_confirmation": "MonMotDePasse123!",
     *       "DOB": "1990-01-15"
     *     }
     *
     * @apiSuccess (201) {Boolean} success Succès de l'inscription
     * @apiSuccess (201) {String} message Message de confirmation
     * @apiSuccess (201) {Object} user Données de l'utilisateur créé
     * @apiUse UserObject
     *
     * @apiSuccessExample {json} Success-Response:
     *     HTTP/1.1 201 Created
     *     {
     *       "success": true,
     *       "message": "utilisateur enregistrer avec succes",
     *       "user": {
     *         "uuid": "123e4567-e89b-12d3-a456-426614174000",
     *         "username": "jeandupont",
     *         "firstname": "Jean",
     *         "lastname": "Dupont",
     *         "phoneNumber": "+237123456789",
     *         "email": "jean.dupont@example.com",
     *         "DOB": "1990-01-15",
     *         "Role": "USER"
     *       }
     *     }
     *
     * @apiError (Error 409) Conflict Utilisateur déjà existant
     * @apiError (Error 400) BadRequest Mots de passe non identiques ou données invalides
     * @apiUse ErrorResponse
     */
    @PostMapping("/register")
    public Mono<ResponseEntity<RegisterResponse>> register(@RequestBody RegisterDTO registerDTO) {
        return Mono.fromCallable(() -> authService.register(registerDTO))
                .subscribeOn(Schedulers.boundedElastic())
                .map(result -> ResponseEntity.status(201).body(result));
    }

    /**
     * @api {post} /auth/login Connexion
     * @apiName Login
     * @apiGroup Authentication
     * @apiVersion 1.0.0
     * @apiDescription Authentifier un utilisateur avec nom d'utilisateur/email/téléphone et mot de passe
     *
     * @apiBody {String="username","email","phone"} type Type d'authentification (requis)
     * @apiBody {String} [username] Nom d'utilisateur (si type="username")
     * @apiBody {String} [email] Adresse email (si type="email")
     * @apiBody {String} [phoneNumber] Numéro de téléphone (si type="phone")
     * @apiBody {String} password Mot de passe (requis)
     *
     * @apiParamExample {json} Request-Example (Username):
     *     {
     *       "type": "username",
     *       "username": "jeandupont",
     *       "password": "MonMotDePasse123!"
     *     }
     *
     * @apiParamExample {json} Request-Example (Email):
     *     {
     *       "type": "email",
     *       "email": "jean.dupont@example.com",
     *       "password": "MonMotDePasse123!"
     *     }
     *
     * @apiParamExample {json} Request-Example (Phone):
     *     {
     *       "type": "phone",
     *       "phoneNumber": "+237123456789",
     *       "password": "MonMotDePasse123!"
     *     }
     *
     * @apiSuccess {Object} userDTO Données de l'utilisateur
     * @apiSuccess {String} token Token JWT d'authentification
     * @apiUse UserObject
     *
     * @apiSuccessExample {json} Success-Response:
     *     HTTP/1.1 200 OK
     *     {
     *       "userDTO": {
     *         "uuid": "123e4567-e89b-12d3-a456-426614174000",
     *         "username": "jeandupont",
     *         "firstname": "Jean",
     *         "lastname": "Dupont",
     *         "phoneNumber": "+237123456789",
     *         "email": "jean.dupont@example.com",
     *         "DOB": "1990-01-15",
     *         "Role": "USER"
     *       },
     *       "token": "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9..."
     *     }
     *
     * @apiError (Error 401) Unauthorized Identifiants invalides
     * @apiError (Error 400) BadRequest Type d'authentification invalide ou données manquantes
     * @apiUse ErrorResponse
     */
    @PostMapping("/login")
    public Mono<ResponseEntity<AuthResponse>> login(@RequestBody LoginDTO loginDTO) {
        return Mono.fromCallable(() -> authService.login(loginDTO))
                .subscribeOn(Schedulers.boundedElastic())
                .map(ResponseEntity::ok);
    }

    /**
     * @api {get} /auth/verify-user Vérifier l'utilisateur
     * @apiName VerifyUser
     * @apiGroup Authentication
     * @apiVersion 1.0.0
     * @apiDescription Récupérer les informations de l'utilisateur connecté et générer un nouveau token
     *
     * @apiUse UserPermission
     *
     * @apiSuccess {Object} userDTO Données de l'utilisateur
     * @apiSuccess {String} token Nouveau token JWT
     *
     * @apiSuccessExample {json} Success-Response:
     *     HTTP/1.1 200 OK
     *     {
     *       "userDTO": {
     *         "uuid": "123e4567-e89b-12d3-a456-426614174000",
     *         "username": "jeandupont",
     *         "firstname": "Jean",
     *         "lastname": "Dupont",
     *         "phoneNumber": "+237123456789",
     *         "email": "jean.dupont@example.com",
     *         "DOB": "1990-01-15",
     *         "Role": "USER"
     *       },
     *       "token": "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9..."
     *     }
     *
     * @apiError (Error 401) Unauthorized Token invalide ou expiré
     * @apiError (Error 404) NotFound Utilisateur non trouvé
     * @apiUse ErrorResponse
     */
    @GetMapping("/verify-user")
    public Mono<ResponseEntity<AuthResponse>> getCurrentUser() {
        return ReactiveSecurityContextHolder.getContext()
                .map(SecurityContext::getAuthentication)
                .map(Authentication::getName)
                .flatMap(username -> Mono.fromCallable(() -> {
                            var user = userRepository.findByUsername(username)
                                    .orElseThrow(() -> new RuntimeException("Utilisateur non trouvé"));
                    return authService.getCurrentUser(user);
                }))
                .subscribeOn(Schedulers.boundedElastic())
                .map(ResponseEntity::ok);
    }
}