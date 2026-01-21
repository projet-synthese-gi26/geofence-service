package ink.yowyob.geofence.repository;

import ink.yowyob.geofence.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Optional;
import java.util.UUID;

public interface UserRepository extends JpaRepository<User, UUID> {
   Optional <User> findByUsername(String username);
   
   @Query("SELECT u FROM User u JOIN FETCH u.role WHERE u.username = :username")
   Optional<User> findByUsernameWithRole(@Param("username") String username);
   
   Optional <User> findByEmail(String email);
   Optional <User> findByPhoneNumber(String phoneNumber);
   Optional <User> findByEmailOrPhoneNumberOrUsername(String email, String phoneNumber, String username);
}
