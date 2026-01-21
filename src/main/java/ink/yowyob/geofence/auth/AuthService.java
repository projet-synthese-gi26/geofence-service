package ink.yowyob.geofence.auth;

import ink.yowyob.geofence.dto.request.AuthRequest.*;
import ink.yowyob.geofence.dto.response.AuthResponse;
import ink.yowyob.geofence.dto.response.RegisterResponse;
import ink.yowyob.geofence.model.User;

public interface AuthService {
    RegisterResponse register(RegisterDTO registerDTO);

    AuthResponse login(LoginDTO loginDTO);

    User loginEmail(LoginEmailDTO loginEmailDTO);
    User loginUsername(LoginUsernameDTO loginUsernameDTO);
    User loginPhone(LoginPhoneNumberDTO loginPhoneNumberDTO);
    AuthResponse getCurrentUser(User user);
}
