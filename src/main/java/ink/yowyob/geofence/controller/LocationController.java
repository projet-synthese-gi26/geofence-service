package ink.yowyob.geofence.controller;

import ink.yowyob.geofence.dto.request.CreateApiKeyRequest;
import ink.yowyob.geofence.dto.request.LocationUpdateRequest;
import ink.yowyob.geofence.dto.response.*;
import ink.yowyob.geofence.model.User;
import ink.yowyob.geofence.repository.UserRepository;
import ink.yowyob.geofence.service.LocationService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.ReactiveSecurityContextHolder;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;
import reactor.core.scheduler.Schedulers;

import java.util.UUID;

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

@RestController
@RequiredArgsConstructor
public class LocationController {

    private final LocationService locationService;
    private final UserRepository userRepository;

    private Mono<User> getCurrentUser() {
        return ReactiveSecurityContextHolder.getContext()
                .map(SecurityContext::getAuthentication)
                .map(Authentication::getName)
                .flatMap(username -> Mono.fromCallable(() ->
                        userRepository.findByUsername(username)
                                .orElseThrow(() -> new RuntimeException("Utilisateur non trouvé"))
                ).subscribeOn(Schedulers.boundedElastic()));
    }

    /**
     * @api {post} /api/public/location/update Mise à jour position (Public)
     * @apiName UpdateLocationFromDevice
     * @apiGroup Locations
     * @apiVersion 1.0.0
     * @apiDescription Met à jour la position d'un véhicule depuis un appareil mobile (accès public avec clé API)
     *
     * @apiHeader {String} X-API-Key Clé API du véhicule (requis)
     * @apiHeaderExample {json} Header-Example:
     *     {
     *       "X-API-Key": "vk_a1b2c3d4e5f6789012345678901234567890123456789012345678901234"
     *     }
     *
     * @apiBody {Number{-90,90}} latitude Latitude de la position (requis)
     * @apiBody {Number{-180,180}} longitude Longitude de la position (requis)
     * @apiBody {Number} [speed] Vitesse en km/h
     * @apiBody {Number{0,360}} [heading] Direction en degrés
     * @apiBody {Number} [altitude] Altitude en mètres
     * @apiBody {Number} [accuracy] Précision en mètres
     * @apiBody {String} [source] Source de la position (GPS, NETWORK, etc.)
     *
     * @apiParamExample {json} Request-Example:
     *     {
     *       "latitude": 11.5167,
     *       "longitude": 3.8667,
     *       "speed": 45.5,
     *       "heading": 180.0,
     *       "altitude": 200.0,
     *       "accuracy": 5.0,
     *       "source": "GPS"
     *     }
     *
     * @apiSuccess {Boolean} success Succès de la mise à jour
     * @apiSuccess {String} message Message de confirmation
     * @apiSuccess {Object} location Position enregistrée
     * @apiSuccess {Object[]} alertsGenerated Alertes générées
     *
     * @apiSuccessExample {json} Success-Response:
     *     HTTP/1.1 200 OK
     *     {
     *       "success": true,
     *       "message": "Position mise à jour avec succès",
     *       "location": {
     *         "id": "123e4567-e89b-12d3-a456-426614174000",
     *         "position": {
     *           "coordinates": [3.8667, 11.5167]
     *         },
     *         "vehicle": {
     *           "id": "456e7890-e89b-12d3-a456-426614174001",
     *           "licensePlate": "AB-123-CD"
     *         },
     *         "timestamp": "2024-01-08T10:30:00Z",
     *         "speed": 45.5
     *       },
     *       "alertsGenerated": []
     *     }
     *
     * @apiError (Error 401) Unauthorized Clé API invalide, inactive ou expirée
     * @apiError (Error 400) BadRequest Données de position invalides
     * @apiUse ErrorResponse
     */
    @PostMapping("/api/public/location/update")
    public Mono<ResponseEntity<LocationUpdateResponse>> updateLocationFromDevice(
            @RequestHeader("X-API-Key") String apiKey,
            @Valid @RequestBody LocationUpdateRequest request) {
        return Mono.fromCallable(() -> locationService.updateLocationFromDevice(apiKey, request))
                .subscribeOn(Schedulers.boundedElastic())
                .map(ResponseEntity::ok);
    }

    /**
     * @api {get} /api/location/vehicle/:vehicleId/history Historique des positions
     * @apiName GetLocationHistory
     * @apiGroup Locations
     * @apiVersion 1.0.0
     * @apiDescription Récupère l'historique des positions d'un véhicule avec pagination
     *
     * @apiUse UserPermission
     *
     * @apiParam (Path) {String} vehicleId Identifiant du véhicule
     * @apiQuery {Number{0-}} [page=0] Numéro de page
     * @apiQuery {Number{1-100}} [size=20] Nombre d'éléments par page
     *
     * @apiSuccess {Object[]} locations Liste des positions
     * @apiSuccess {Number} totalItems Nombre d'éléments dans la page
     * @apiSuccess {Number} page Numéro de page actuel
     * @apiSuccess {Number} size Taille de la page
     * @apiSuccess {Number} totalElements Nombre total d'éléments
     * @apiSuccess {Number} totalPages Nombre total de pages
     *
     * @apiSuccessExample {json} Success-Response:
     *     HTTP/1.1 200 OK
     *     {
     *       "locations": [
     *         {
     *           "id": "123e4567-e89b-12d3-a456-426614174000",
     *           "position": {
     *             "coordinates": [3.8667, 11.5167]
     *           },
     *           "vehicle": {
     *             "licensePlate": "AB-123-CD"
     *           },
     *           "timestamp": "2024-01-08T10:30:00Z",
     *           "speed": 45.5
     *         }
     *       ],
     *       "totalItems": 1,
     *       "page": 0,
     *       "size": 20,
     *       "totalElements": 1,
     *       "totalPages": 1
     *     }
     *
     * @apiError (Error 404) NotFound Véhicule non trouvé
     * @apiError (Error 403) Forbidden Accès refusé
     * @apiUse ErrorResponse
     */
    @GetMapping("/api/location/vehicle/{vehicleId}/history")
    @PreAuthorize("hasRole('USER')")
    public Mono<ResponseEntity<LocationListResponse>> getLocationHistory(
            @PathVariable UUID vehicleId,
            @RequestParam(defaultValue = "0") int page,
            @RequestParam(defaultValue = "20") int size) {
        return getCurrentUser()
                .flatMap(user -> Mono.fromCallable(() -> locationService.getLocationHistory(vehicleId, page, size, user)))
                .subscribeOn(Schedulers.boundedElastic())
                .map(ResponseEntity::ok);
    }

    /**
     * @api {get} /api/location/vehicle/:vehicleId/latest Dernière position
     * @apiName GetLatestLocation
     * @apiGroup Locations
     * @apiVersion 1.0.0
     * @apiDescription Récupère la dernière position connue d'un véhicule
     *
     * @apiUse UserPermission
     *
     * @apiParam (Path) {String} vehicleId Identifiant du véhicule
     *
     * @apiSuccess {String} id Identifiant de la position
     * @apiSuccess {Object} position Coordonnées géographiques
     * @apiSuccess {Object} vehicle Informations du véhicule
     * @apiSuccess {String} timestamp Horodatage de la position
     * @apiSuccess {Number} [speed] Vitesse
     * @apiSuccess {Number} [heading] Direction
     * @apiSuccess {Number} [altitude] Altitude
     * @apiSuccess {Number} [accuracy] Précision
     * @apiSuccess {String} [source] Source de la position
     *
     * @apiError (Error 404) NotFound Véhicule ou position non trouvé
     * @apiError (Error 403) Forbidden Accès refusé
     * @apiUse ErrorResponse
     */
    @GetMapping("/api/location/vehicle/{vehicleId}/latest")
    @PreAuthorize("hasRole('USER')")
    public Mono<ResponseEntity<LocationDTO>> getLatestLocation(@PathVariable UUID vehicleId) {
        return getCurrentUser()
                .flatMap(user -> Mono.fromCallable(() -> locationService.getLatestLocation(vehicleId, user)))
                .subscribeOn(Schedulers.boundedElastic())
                .map(ResponseEntity::ok);
    }

    /**
     * @api {delete} /api/location/:locationId Supprimer une position
     * @apiName DeleteLocation
     * @apiGroup Locations
     * @apiVersion 1.0.0
     * @apiDescription Supprimer une position spécifique
     *
     * @apiUse UserPermission
     *
     * @apiParam (Path) {String} locationId Identifiant de la position
     *
     * @apiSuccessExample {json} Success-Response:
     *     HTTP/1.1 204 No Content
     *
     * @apiError (Error 404) NotFound Position non trouvée
     * @apiError (Error 403) Forbidden Accès refusé
     * @apiUse ErrorResponse
     */
    @DeleteMapping("/api/location/{locationId}")
    @PreAuthorize("hasRole('USER')")
    public Mono<ResponseEntity<Void>> deleteLocation(@PathVariable UUID locationId) {
        return getCurrentUser()
                .flatMap(user -> Mono.fromCallable(() -> {
                    locationService.deleteLocation(locationId, user);
                    return ResponseEntity.noContent().<Void>build();
                }))
                .subscribeOn(Schedulers.boundedElastic());
    }

    /**
     * @api {post} /api/location/api-key Générer une clé API
     * @apiName GenerateApiKey
     * @apiGroup API Keys
     * @apiVersion 1.0.0
     * @apiDescription Génère une nouvelle clé API pour un véhicule
     *
     * @apiUse UserPermission
     *
     * @apiBody {String} vehicleId Identifiant du véhicule (requis)
     * @apiBody {String} [expiresAt] Date d'expiration (ISO 8601)
     *
     * @apiParamExample {json} Request-Example:
     *     {
     *       "vehicleId": "123e4567-e89b-12d3-a456-426614174000",
     *       "expiresAt": "2024-12-31T23:59:59Z"
     *     }
     *
     * @apiSuccess {String} id Identifiant de la clé
     * @apiSuccess {String} apiKey Clé API générée
     * @apiSuccess {Object} vehicle Véhicule associé
     * @apiSuccess {Boolean} isActive Clé active
     * @apiSuccess {String} createdAt Date de création
     * @apiSuccess {String} [expiresAt] Date d'expiration
     * @apiSuccess {Boolean} isValid Clé valide
     *
     * @apiSuccessExample {json} Success-Response:
     *     HTTP/1.1 201 Created
     *     {
     *       "id": "456e7890-e89b-12d3-a456-426614174001",
     *       "apiKey": "vk_a1b2c3d4e5f6789012345678901234567890123456789012345678901234",
     *       "vehicle": {
     *         "id": "123e4567-e89b-12d3-a456-426614174000",
     *         "licensePlate": "AB-123-CD"
     *       },
     *       "isActive": true,
     *       "createdAt": "2024-01-08T10:30:00Z",
     *       "expiresAt": "2024-12-31T23:59:59Z",
     *       "isValid": true
     *     }
     *
     * @apiError (Error 404) NotFound Véhicule non trouvé
     * @apiError (Error 403) Forbidden Accès refusé
     * @apiUse ErrorResponse
     */
    @PostMapping("/api/location/api-key")
    @PreAuthorize("hasRole('USER')")
    public Mono<ResponseEntity<VehicleApiKeyDTO>> generateApiKey(@Valid @RequestBody CreateApiKeyRequest request) {
        return getCurrentUser()
                .flatMap(user -> Mono.fromCallable(() -> locationService.generateApiKey(request, user)))
                .subscribeOn(Schedulers.boundedElastic())
                .map(result -> ResponseEntity.status(201).body(result));
    }

    /**
     * @api {get} /api/location/vehicle/:vehicleId/api-key Récupérer la clé API
     * @apiName GetApiKeyForVehicle
     * @apiGroup API Keys
     * @apiVersion 1.0.0
     * @apiDescription Récupère la clé API d'un véhicule
     *
     * @apiUse UserPermission
     *
     * @apiParam (Path) {String} vehicleId Identifiant du véhicule
     *
     * @apiSuccess {Object} apiKey Informations de la clé API
     *
     * @apiError (Error 404) NotFound Véhicule ou clé API non trouvé
     * @apiError (Error 403) Forbidden Accès refusé
     * @apiUse ErrorResponse
     */
    @GetMapping("/api/location/vehicle/{vehicleId}/api-key")
    @PreAuthorize("hasRole('USER')")
    public Mono<ResponseEntity<VehicleApiKeyDTO>> getApiKeyForVehicle(@PathVariable UUID vehicleId) {
        return getCurrentUser()
                .flatMap(user -> Mono.fromCallable(() -> locationService.getApiKeyForVehicle(vehicleId, user)))
                .subscribeOn(Schedulers.boundedElastic())
                .map(ResponseEntity::ok);
    }

    /**
     * @api {delete} /api/location/vehicle/:vehicleId/api-key Révoquer la clé API
     * @apiName RevokeApiKey
     * @apiGroup API Keys
     * @apiVersion 1.0.0
     * @apiDescription Révoque/désactive la clé API d'un véhicule
     *
     * @apiUse UserPermission
     *
     * @apiParam (Path) {String} vehicleId Identifiant du véhicule
     *
     * @apiSuccessExample {json} Success-Response:
     *     HTTP/1.1 204 No Content
     *
     * @apiError (Error 404) NotFound Véhicule non trouvé
     * @apiError (Error 403) Forbidden Accès refusé
     * @apiUse ErrorResponse
     */
    @DeleteMapping("/api/location/vehicle/{vehicleId}/api-key")
    @PreAuthorize("hasRole('USER')")
    public Mono<ResponseEntity<Void>> revokeApiKey(@PathVariable UUID vehicleId) {
        return getCurrentUser()
                .flatMap(user -> Mono.fromCallable(() -> {
                    locationService.revokeApiKey(vehicleId, user);
                    return ResponseEntity.noContent().<Void>build();
                }
                ))
                .subscribeOn(Schedulers.boundedElastic());
    }

    /**
     * @api {get} /api/location/my-api-keys Mes clés API
     * @apiName GetMyApiKeys
     * @apiGroup API Keys
     * @apiVersion 1.0.0
     * @apiDescription Récupère toutes les clés API de l'utilisateur connecté
     *
     * @apiUse UserPermission
     *
     * @apiSuccess {Object[]} apiKeys Liste des clés API
     * @apiSuccess {Number} totalItems Nombre total de clés
     *
     * @apiSuccessExample {json} Success-Response:
     *     HTTP/1.1 200 OK
     *     {
     *       "apiKeys": [
     *         {
     *           "id": "456e7890-e89b-12d3-a456-426614174001",
     *           "apiKey": "vk_a1b2c3d4e5f6789012345678901234567890123456789012345678901234",
     *           "vehicle": {
     *             "licensePlate": "AB-123-CD"
     *           },
     *           "isActive": true,
     *           "isValid": true
     *         }
     *       ],
     *       "totalItems": 1
     *     }
     *
     * @apiUse ErrorResponse
     */
    @GetMapping("/api/location/my-api-keys")
    @PreAuthorize("hasRole('USER')")
    public Mono<ResponseEntity<ApiKeyListResponse>> getMyApiKeys() {
        return getCurrentUser()
                .flatMap(user -> Mono.fromCallable(() -> locationService.getMyApiKeys(user)))
                .subscribeOn(Schedulers.boundedElastic())
                .map(ResponseEntity::ok);
    }
}