package ink.yowyob.geofence.controller;

import ink.yowyob.geofence.dto.response.DashboardStatsDTO;
import ink.yowyob.geofence.repository.UserRepository;
import ink.yowyob.geofence.service.DashboardService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.ReactiveSecurityContextHolder;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;
import reactor.core.scheduler.Schedulers;

@RestController
@RequestMapping("/api/dashboard")
@RequiredArgsConstructor
public class DashboardController {
    
    private final DashboardService dashboardService;
    private final UserRepository userRepository;

    /**
     * Récupérer les statistiques du dashboard
     */
    @GetMapping("/stats")
    public Mono<ResponseEntity<DashboardStatsDTO>> getDashboardStats() {
        return ReactiveSecurityContextHolder.getContext()
                .map(SecurityContext::getAuthentication)
                .map(Authentication::getName)
                .flatMap(username -> Mono.fromCallable(() -> {
                    var user = userRepository.findByUsername(username)
                            .orElseThrow(() -> new RuntimeException("Utilisateur non trouvé"));
                    return dashboardService.getUserDashboardStats(user);
                }))
                .subscribeOn(Schedulers.boundedElastic())
                .map(ResponseEntity::ok);
    }
}