package ink.yowyob.geofence.controller;

import ink.yowyob.geofence.dto.PointDTO;
import ink.yowyob.geofence.model.User;
import ink.yowyob.geofence.service.RouteDeviationDetectionService;
import ink.yowyob.geofence.service.RouteService;
import ink.yowyob.geofence.repository.UserRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.ReactiveSecurityContextHolder;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.time.Duration;
import java.util.UUID;

@RestController
@RequestMapping("/api/route-monitoring")
@AllArgsConstructor
@Slf4j
public class RouteDeviationController {
    
    private final RouteDeviationDetectionService deviationService;
    private final RouteService routeService;
    private final UserRepository userRepository;
    
    /**
     * Stream en temps réel des alertes de déviation pour un véhicule
     */
    @GetMapping(value = "/vehicle/{vehicleId}/deviations", produces = MediaType.TEXT_EVENT_STREAM_VALUE)
    public Flux<RouteDeviationDetectionService.RouteDeviationAlert> streamVehicleDeviations(@PathVariable UUID vehicleId) {
        log.info("Démarrage du stream de déviations pour le véhicule: {}", vehicleId);
        
        return deviationService.monitorVehicleDeviations(vehicleId)
            .doOnNext(alert -> log.info("Alerte de déviation émise: {}", alert))
            .doOnError(error -> log.error("Erreur dans le stream de déviations: ", error))
            .onErrorResume(error -> Flux.empty());
    }
    
    /**
     * Stream du statut de suivi pour un véhicule
     */
    @GetMapping(value = "/vehicle/{vehicleId}/tracking-status", produces = MediaType.TEXT_EVENT_STREAM_VALUE)
    public Flux<RouteDeviationDetectionService.RouteTrackingStatus> streamTrackingStatus(@PathVariable UUID vehicleId) {
        return Flux.interval(Duration.ofSeconds(10))
            .flatMap(tick -> deviationService.getVehicleRouteTrackingStatus(vehicleId))
            .doOnError(error -> log.error("Erreur dans le stream de statut de suivi: ", error))
            .onErrorResume(error -> Flux.empty());
    }
    
    /**
     * Vérifier manuellement si un véhicule dévie de sa route
     */
    @PostMapping("/vehicle/{vehicleId}/check-deviation")
    public Mono<ResponseEntity<RouteDeviationDetectionService.RouteDeviationAlert>> checkVehicleDeviation(
            @PathVariable UUID vehicleId,
            @RequestBody PointDTO currentPosition) {
        
        return deviationService.checkVehicleDeviation(vehicleId, routeService.convertToPoint(currentPosition))
            .map(alert -> alert != null ? 
                ResponseEntity.ok(alert) : 
                ResponseEntity.noContent().<RouteDeviationDetectionService.RouteDeviationAlert>build())
            .defaultIfEmpty(ResponseEntity.noContent().build());
    }
    
    /**
     * Stream de toutes les alertes de déviation (pour admin/monitoring)
     */
    @GetMapping(value = "/all-deviations", produces = MediaType.TEXT_EVENT_STREAM_VALUE)
    public Flux<RouteDeviationDetectionService.RouteDeviationAlert> streamAllDeviations() {
        return Flux.interval(Duration.ofSeconds(60))
            .flatMap(tick -> deviationService.detectAllVehicleDeviations())
            .doOnError(error -> log.error("Erreur dans le stream de toutes les déviations: ", error))
            .onErrorResume(error -> Flux.empty());
    }
    
    /**
     * Obtenir les alertes récentes pour l'utilisateur connecté
     */
    @GetMapping("/recent-alerts")
    public Flux<RouteDeviationDetectionService.RouteDeviationAlert> getRecentAlerts(
            @RequestParam(defaultValue = "24") int limitHours) {
        
        return getCurrentUser()
            .flatMapMany(user -> deviationService.getRecentDeviationAlerts(user.getUuid(), limitHours));
    }
    
    /**
     * Marquer une alerte comme traitée
     */
    @PostMapping("/alerts/{alertId}/mark-handled")
    public Mono<ResponseEntity<Void>> markAlertAsHandled(@PathVariable UUID alertId) {
        return deviationService.markAlertAsHandled(alertId)
            .then(Mono.just(ResponseEntity.ok().<Void>build()));
    }
    
    /**
     * Configurer les paramètres de détection pour un véhicule
     */
    @PostMapping("/vehicle/{vehicleId}/configure")
    public Mono<ResponseEntity<Void>> configureDeviationSettings(
            @PathVariable UUID vehicleId,
            @RequestParam Double toleranceMeters,
            @RequestParam(defaultValue = "30") Integer checkIntervalSeconds) {
        
        return deviationService.configureDeviationSettings(vehicleId, toleranceMeters, checkIntervalSeconds)
            .then(Mono.just(ResponseEntity.ok().<Void>build()));
    }
    
    /**
     * Prédire une déviation potentielle
     */
    @PostMapping("/vehicle/{vehicleId}/predict-deviation")
    public Mono<ResponseEntity<Boolean>> predictDeviation(
            @PathVariable UUID vehicleId,
            @RequestParam Double currentLng,
            @RequestParam Double currentLat,
            @RequestParam Double nextLng,
            @RequestParam Double nextLat) {
        
        PointDTO currentPos = new PointDTO(java.util.List.of(currentLng, currentLat));
        PointDTO nextPos = new PointDTO(java.util.List.of(nextLng, nextLat));
        
        return deviationService.predictPotentialDeviation(
                vehicleId, 
                routeService.convertToPoint(currentPos),
                routeService.convertToPoint(nextPos))
            .map(ResponseEntity::ok);
    }
    
    /**
     * Stream de statut combiné pour le dashboard
     */
    @GetMapping(value = "/dashboard/live-status", produces = MediaType.TEXT_EVENT_STREAM_VALUE)
    public Flux<DashboardStatus> streamDashboardStatus() {
        return getCurrentUser()
            .flatMapMany(user -> {
                // Obtenir tous les véhicules de l'utilisateur et surveiller leurs statuts
                return Flux.interval(Duration.ofSeconds(15))
                    .flatMap(tick -> 
                        deviationService.detectAllVehicleDeviations()
                            .filter(alert -> alert.vehicleId() != null) // Filtrer pour les véhicules de l'utilisateur
                            .collectList()
                            .map(alerts -> new DashboardStatus(
                                alerts.size(),
                                alerts.stream().mapToLong(alert -> "CRITICAL".equals(alert.severity()) ? 1 : 0).sum(),
                                java.time.LocalDateTime.now()
                            ))
                    );
            });
    }
    
    /**
     * DTO pour le statut du dashboard
     */
    public record DashboardStatus(
        long totalAlerts,
        long criticalAlerts,
        java.time.LocalDateTime lastUpdate
    ) {}
    
    /**
     * Méthode utilitaire pour obtenir l'utilisateur actuel
     */
    private Mono<User> getCurrentUser() {
        return ReactiveSecurityContextHolder.getContext()
            .cast(SecurityContext.class)
            .map(SecurityContext::getAuthentication)
            .cast(Authentication.class)
            .map(Authentication::getName)
            .flatMap(username -> Mono.fromCallable(() -> 
                userRepository.findByUsername(username)
                    .orElseThrow(() -> new RuntimeException("Utilisateur non trouvé"))
            ));
    }
}