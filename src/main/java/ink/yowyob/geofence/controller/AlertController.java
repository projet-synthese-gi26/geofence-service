package ink.yowyob.geofence.controller;

import ink.yowyob.geofence.dto.response.AlertDTO;
import ink.yowyob.geofence.dto.response.AlertListResponse;
import ink.yowyob.geofence.repository.UserRepository;
import ink.yowyob.geofence.service.Implementation.AlertServiceImpl;
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
 * @apiDefine AlertObject
 * @apiSuccess {String} id Identifiant unique de l'alerte
 * @apiSuccess {String="ZONE_EXIT","ZONE_ENTER","SPEED_LIMIT","BATTERY_LOW","SYSTEM_ERROR"} type Type d'alerte
 * @apiSuccess {String} timestamp Date et heure de l'alerte (ISO 8601)
 * @apiSuccess {String} message Message de l'alerte
 * @apiSuccess {Object} [location] Localisation de l'alerte
 * @apiSuccess {Object} vehicle Véhicule concerné
 * @apiSuccess {Object} [geofenceZone] Zone de géofence concernée
 */

@RestController
@RequestMapping("/api/alerts")
@RequiredArgsConstructor
public class AlertController {
    private final AlertServiceImpl alertService;
    private final UserRepository userRepository;

    /**
     * @api {get} /alerts Récupérer mes alertes
     * @apiName GetMyAlerts
     * @apiGroup Alerts
     * @apiVersion 1.0.0
     * @apiDescription Récupère la liste des alertes de l'utilisateur connecté avec pagination
     *
     * @apiUse UserPermission
     *
     * @apiQuery {Number{0-}} [page=0] Numéro de page (commence à 0)
     * @apiQuery {Number{1-100}} [size=20] Nombre d'éléments par page
     *
     * @apiSuccess {Object[]} alerts Liste des alertes
     * @apiSuccess {Number} totalItems Nombre total d'alertes
     *
     * @apiUse AlertObject
     * @apiUse ErrorResponse
     *
     * @apiSuccessExample {json} Success-Response:
     *     HTTP/1.1 200 OK
     *     {
     *       "alerts": [
     *         {
     *           "id": "123e4567-e89b-12d3-a456-426614174000",
     *           "type": "ZONE_EXIT",
     *           "timestamp": "2024-01-08T10:30:00Z",
     *           "message": "Véhicule sorti de la zone autorisée",
     *           "location": {
     *             "coordinates": [3.8667, 11.5167]
     *           },
     *           "vehicle": {
     *             "id": "456e7890-e89b-12d3-a456-426614174001",
     *             "brand": "Toyota",
     *             "model": "Camry",
     *             "licensePlate": "AB-123-CD"
     *           },
     *           "geofenceZone": {
     *             "id": "789e0123-e89b-12d3-a456-426614174002",
     *             "title": "Zone Bureau",
     *             "type": "circle"
     *           }
     *         }
     *       ],
     *       "totalItems": 1
     *     }
     */
    @GetMapping
    public Mono<ResponseEntity<AlertListResponse>> getMyAlerts(
            @RequestParam(defaultValue = "0") Integer page,
            @RequestParam(defaultValue = "20") Integer size
    ) {
        return ReactiveSecurityContextHolder.getContext()
                .map(SecurityContext::getAuthentication)
                .map(Authentication::getName)
                .flatMap(username -> Mono.fromCallable(() -> {
                    var user = userRepository.findByUsername(username)
                            .orElseThrow(() -> new RuntimeException("Utilisateur non trouvé"));
                    return alertService.getMyAlerts(page, size, user);
                }))
                .subscribeOn(Schedulers.boundedElastic())
                .map(ResponseEntity::ok);
    }

    /**
     * @api {get} /alerts/admin Récupérer toutes les alertes (Admin)
     * @apiName GetAllAlerts
     * @apiGroup Alerts
     * @apiVersion 1.0.0
     * @apiDescription Récupère toutes les alertes du système (accès admin/manager uniquement)
     *
     * @apiUse ManagerPermission
     *
     * @apiQuery {Number{0-}} [page=0] Numéro de page
     * @apiQuery {Number{1-100}} [size=20] Nombre d'éléments par page
     *
     * @apiSuccess {Object[]} alerts Liste de toutes les alertes
     * @apiSuccess {Number} totalItems Nombre total d'alertes
     *
     * @apiUse AlertObject
     * @apiUse ErrorResponse
     *
     * @apiError (Error 403) Forbidden Accès refusé - Droits insuffisants
     */
    @GetMapping("/admin")
    @PreAuthorize("hasRole('ADMIN') or hasRole('MANAGER')")
    public Mono<ResponseEntity<AlertListResponse>> getAllAlerts(
            @RequestParam(defaultValue = "0") Integer page,
            @RequestParam(defaultValue = "20") Integer size
    ) {
        return Mono.fromCallable(() -> alertService.getAllAlerts(page, size))
                .subscribeOn(Schedulers.boundedElastic())
                .map(ResponseEntity::ok);
    }

    /**
     * @api {get} /alerts/:alertId Récupérer une alerte
     * @apiName GetAlert
     * @apiGroup Alerts
     * @apiVersion 1.0.0
     * @apiDescription Récupère les détails d'une alerte spécifique
     *
     * @apiUse UserPermission
     *
     * @apiParam (Path) {String} alertId Identifiant unique de l'alerte
     *
     * @apiUse AlertObject
     * @apiUse ErrorResponse
     *
     * @apiError (Error 404) NotFound Alerte non trouvée
     */
    @GetMapping("/{alertId}")
    public Mono<ResponseEntity<AlertDTO>> getAlert(@PathVariable UUID alertId) {
        return Mono.fromCallable(() -> alertService.getAlert(alertId))
                .subscribeOn(Schedulers.boundedElastic())
                .map(ResponseEntity::ok);
    }
}