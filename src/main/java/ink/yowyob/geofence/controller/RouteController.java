package ink.yowyob.geofence.controller;

import ink.yowyob.geofence.dto.PointDTO;
import ink.yowyob.geofence.dto.request.RouteDTORequest;
import ink.yowyob.geofence.dto.response.MultipleRoutesDTOResponse;
import ink.yowyob.geofence.dto.response.RouteDTOResponse;
import ink.yowyob.geofence.model.User;
import ink.yowyob.geofence.service.RouteService;
import ink.yowyob.geofence.repository.UserRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.ReactiveSecurityContextHolder;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/routes")
@AllArgsConstructor
@Slf4j
public class RouteController {
    
    private final RouteService routeService;
    private final UserRepository userRepository;
    
    /**
     * Créer une nouvelle route
     */
    @PostMapping
    public Mono<ResponseEntity<RouteDTOResponse>> createRoute(@RequestBody RouteDTORequest routeRequest) {
        log.info("Requête de création de route reçue: nom={}, segments={}", 
            routeRequest.name(), 
            routeRequest.authorizedSegments() != null ? routeRequest.authorizedSegments().size() : 0);
        
        return getCurrentUser()
            .flatMap(user -> {
                log.info("Utilisateur authentifié: {}", user.getUsername());
                return routeService.createRoute(routeRequest, user);
            })
            .map(route -> ResponseEntity.status(HttpStatus.CREATED).body(route))
            .onErrorResume(ex -> {
                log.error("Erreur lors de la création de la route: ", ex);
                return Mono.just(ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build());
            });
    }
    
    /**
     * Obtenir toutes les routes de l'utilisateur connecté
     */
    @GetMapping
    public Mono<ResponseEntity<MultipleRoutesDTOResponse>> getUserRoutes() {
        return getCurrentUser()
            .flatMap(routeService::getUserRoutes)
            .map(ResponseEntity::ok)
            .onErrorReturn(ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build());
    }
    
    /**
     * Obtenir toutes les routes (admin uniquement)
     */
    @GetMapping("/all")
    public Mono<ResponseEntity<MultipleRoutesDTOResponse>> getAllRoutes() {
        return routeService.getAllRoutes()
            .map(ResponseEntity::ok)
            .onErrorReturn(ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build());
    }
    
    /**
     * Obtenir une route par ID
     */
    @GetMapping("/{routeId}")
    public Mono<ResponseEntity<RouteDTOResponse>> getRoute(@PathVariable UUID routeId) {
        return routeService.getRoute(routeId)
            .map(ResponseEntity::ok)
            .onErrorReturn(ResponseEntity.notFound().build());
    }
    
    /**
     * Mettre à jour une route
     */
    @PutMapping("/{routeId}")
    public Mono<ResponseEntity<RouteDTOResponse>> updateRoute(
            @PathVariable UUID routeId, 
            @RequestBody RouteDTORequest routeRequest) {
        return getCurrentUser()
            .flatMap(user -> routeService.updateRoute(routeId, routeRequest, user))
            .map(ResponseEntity::ok)
            .onErrorReturn(ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build());
    }
    
    /**
     * Supprimer une route
     */
    @DeleteMapping("/{routeId}")
    public Mono<ResponseEntity<Void>> deleteRoute(@PathVariable UUID routeId) {
        return getCurrentUser()
            .flatMap(user -> routeService.deleteRoute(routeId, user))
            .then(Mono.just(ResponseEntity.noContent().<Void>build()))
            .onErrorReturn(ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build());
    }
    
    /**
     * Rechercher des routes par mot-clé
     */
    @GetMapping("/search")
    public Mono<ResponseEntity<MultipleRoutesDTOResponse>> searchRoutes(@RequestParam String keyword) {
        return getCurrentUser()
            .flatMap(user -> routeService.searchRoutes(keyword, user))
            .map(ResponseEntity::ok)
            .onErrorReturn(ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build());
    }
    
    /**
     * Obtenir les routes actives d'un véhicule
     */
    @GetMapping("/vehicle/{vehicleId}")
    public Flux<RouteDTOResponse> getActiveRoutesByVehicle(@PathVariable UUID vehicleId) {
        return routeService.getActiveRoutesByVehicle(vehicleId);
    }
    
    /**
     * Assigner un véhicule à une route
     */
    @PostMapping("/{routeId}/assign-vehicle/{vehicleId}")
    public Mono<ResponseEntity<RouteDTOResponse>> assignVehicleToRoute(
            @PathVariable UUID routeId, 
            @PathVariable UUID vehicleId) {
        return getCurrentUser()
            .flatMap(user -> routeService.assignVehicleToRoute(routeId, vehicleId, user))
            .map(ResponseEntity::ok)
            .onErrorReturn(ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build());
    }
    
    /**
     * Retirer un véhicule d'une route
     */
    @DeleteMapping("/{routeId}/remove-vehicle/{vehicleId}")
    public Mono<ResponseEntity<RouteDTOResponse>> removeVehicleFromRoute(
            @PathVariable UUID routeId, 
            @PathVariable UUID vehicleId) {
        return getCurrentUser()
            .flatMap(user -> routeService.removeVehicleFromRoute(routeId, vehicleId, user))
            .map(ResponseEntity::ok)
            .onErrorReturn(ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build());
    }
    
    /**
     * Vérifier si un véhicule est sur sa route assignée
     */
    @PostMapping("/vehicle/{vehicleId}/check-position")
    public Mono<ResponseEntity<Boolean>> checkVehiclePosition(
            @PathVariable UUID vehicleId, 
            @RequestBody PointDTO currentPosition) {
        return routeService.isVehicleOnRoute(vehicleId, routeService.convertToPoint(currentPosition))
            .map(ResponseEntity::ok)
            .onErrorReturn(ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(false));
    }
    
    /**
     * Calculer la distance de déviation d'un véhicule par rapport à une route
     */
    @PostMapping("/{routeId}/deviation-distance")
    public Mono<ResponseEntity<Double>> calculateDeviationDistance(
            @PathVariable UUID routeId, 
            @RequestBody PointDTO currentPosition) {
        return routeService.calculateDeviationDistance(routeId, routeService.convertToPoint(currentPosition))
            .map(ResponseEntity::ok)
            .onErrorReturn(ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(Double.MAX_VALUE));
    }
    
    /**
     * Détecter les déviations de route d'un véhicule
     */
    @PostMapping("/vehicle/{vehicleId}/detect-deviations")
    public Flux<UUID> detectRouteDeviations(
            @PathVariable UUID vehicleId, 
            @RequestBody PointDTO currentPosition,
            @RequestParam(defaultValue = "100.0") Double toleranceMeters) {
        return routeService.detectRouteDeviations(vehicleId, routeService.convertToPoint(currentPosition), toleranceMeters);
    }
    
    /**
     * Calculer le pourcentage de progression d'un véhicule sur une route
     */
    @PostMapping("/{routeId}/progress")
    public Mono<ResponseEntity<Double>> calculateRouteProgress(
            @PathVariable UUID routeId, 
            @RequestBody PointDTO currentPosition) {
        return routeService.calculateRouteProgress(routeId, routeService.convertToPoint(currentPosition))
            .map(ResponseEntity::ok)
            .onErrorReturn(ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(0.0));
    }
    
    /**
     * Suggérer des routes alternatives
     */
    @PostMapping("/suggest-alternatives")
    public Mono<ResponseEntity<List<RouteDTOResponse>>> suggestAlternativeRoutes(
            @RequestParam Double startLng,
            @RequestParam Double startLat,
            @RequestParam Double endLng,
            @RequestParam Double endLat) {
        
        PointDTO startPoint = new PointDTO(List.of(startLng, startLat));
        PointDTO endPoint = new PointDTO(List.of(endLng, endLat));
        
        return getCurrentUser()
            .flatMap(user -> routeService.suggestAlternativeRoutes(
                routeService.convertToPoint(startPoint), 
                routeService.convertToPoint(endPoint), 
                user))
            .map(ResponseEntity::ok)
            .onErrorReturn(ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(List.of()));
    }
    
    /**
     * Optimiser les segments d'une route
     */
    @PostMapping("/{routeId}/optimize")
    public Mono<ResponseEntity<RouteDTOResponse>> optimizeRouteSegments(@PathVariable UUID routeId) {
        return getCurrentUser()
            .flatMap(user -> routeService.optimizeRouteSegments(routeId, user))
            .map(ResponseEntity::ok)
            .onErrorReturn(ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build());
    }
    
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
                userRepository.findByUsernameWithRole(username)
                    .orElseThrow(() -> new RuntimeException("Utilisateur non trouvé"))
            ));
    }
}