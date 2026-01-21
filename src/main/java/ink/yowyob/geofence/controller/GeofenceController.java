package ink.yowyob.geofence.controller;

import ink.yowyob.geofence.dto.request.GeofenceZoneDTORequest;
import ink.yowyob.geofence.dto.response.CircleGeofenceZoneDTOResponse;
import ink.yowyob.geofence.dto.response.GeofenceZoneDTOResponse;
import ink.yowyob.geofence.dto.response.MultipleGeofenceZoneDTOResponse;
import ink.yowyob.geofence.dto.response.PolygonGeofenceZoneDTOResponse;
import ink.yowyob.geofence.repository.UserRepository;
import ink.yowyob.geofence.service.Implementation.GeofenceServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.ReactiveSecurityContextHolder;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;
import reactor.core.scheduler.Schedulers;

import java.util.List;
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
 * @apiDefine GeofenceObject
 * @apiSuccess {String} id Identifiant unique de la zone
 * @apiSuccess {String} title Titre de la zone
 * @apiSuccess {String} [description] Description de la zone
 * @apiSuccess {String="circle","polygon"} type Type de géofence
 * @apiSuccess {Object} user Propriétaire de la zone
 * @apiSuccess {Object[]} vehicles Véhicules associés à cette zone
 */

@RestController
@RequestMapping("/api/geofence")
@RequiredArgsConstructor
public class GeofenceController {
    private final GeofenceServiceImpl geofenceService;
    private final UserRepository userRepository;

    /**
     * @api {get} /geofence Récupérer mes géofences
     * @apiName GetMyGeofences
     * @apiGroup Geofences
     * @apiVersion 1.0.0
     * @apiDescription Récupère toutes les zones de géofence de l'utilisateur connecté
     *
     * @apiUse UserPermission
     *
     * @apiSuccess {Object[]} polygons Liste des zones polygonales
     * @apiSuccess {Object[]} circles Liste des zones circulaires
     * @apiUse GeofenceObject
     *
     * @apiSuccessExample {json} Success-Response:
     *     HTTP/1.1 200 OK
     *     {
     *       "polygons": [],
     *       "circles": [
     *         {
     *           "id": "123e4567-e89b-12d3-a456-426614174000",
     *           "title": "Zone Bureau",
     *           "description": "Périmètre autorisé autour du bureau",
     *           "type": "circle",
     *           "center": {
     *             "coordinates": [3.8667, 11.5167]
     *           },
     *           "radius": 500.0,
     *           "user": {
     *             "uuid": "456e7890-e89b-12d3-a456-426614174001",
     *             "username": "jeandupont"
     *           },
     *           "vehicles": []
     *         }
     *       ]
     *     }
     *
     * @apiUse ErrorResponse
     */
    @GetMapping
    public Mono<ResponseEntity<MultipleGeofenceZoneDTOResponse>> index() {
        return ReactiveSecurityContextHolder.getContext()
                .map(SecurityContext::getAuthentication)
                .map(Authentication::getName)
                .flatMap(username -> Mono.fromCallable(() -> {
                    var user = userRepository.findByUsername(username)
                            .orElseThrow(() -> new RuntimeException("Utilisateur non trouvé"));
                    return geofenceService.getMyGeofenceZones(user);
                }))
                .subscribeOn(Schedulers.boundedElastic())
                .map(result -> ResponseEntity.status(200).body(result));
    }

    /**
     * @api {get} /geofence/admin Récupérer toutes les géofences (Admin)
     * @apiName GetAllGeofences
     * @apiGroup Geofences
     * @apiVersion 1.0.0
     * @apiDescription Récupère toutes les zones de géofence du système (accès admin/manager uniquement)
     *
     * @apiUse ManagerPermission
     *
     * @apiSuccess {Object[]} polygons Liste de toutes les zones polygonales
     * @apiSuccess {Object[]} circles Liste de toutes les zones circulaires
     * @apiUse GeofenceObject
     *
     * @apiSuccessExample {json} Success-Response:
     *     HTTP/1.1 200 OK
     *     {
     *       "polygons": [
     *         {
     *           "id": "456e7890-e89b-12d3-a456-426614174001",
     *           "title": "Zone Entrepôt",
     *           "type": "polygon",
     *           "user": {
     *             "username": "mariemartin"
     *           }
     *         }
     *       ],
     *       "circles": [
     *         {
     *           "id": "123e4567-e89b-12d3-a456-426614174000",
     *           "title": "Zone Bureau",
     *           "type": "circle",
     *           "user": {
     *             "username": "jeandupont"
     *           }
     *         }
     *       ]
     *     }
     *
     * @apiError (Error 403) Forbidden Accès refusé - Droits insuffisants
     * @apiUse ErrorResponse
     */
    @GetMapping("/admin")
    @PreAuthorize("hasRole('ADMIN') or hasRole('MANAGER')")
    public Mono<ResponseEntity<MultipleGeofenceZoneDTOResponse>> admin() {
        return Mono.fromCallable(() -> geofenceService.getGeofenceZones())
                .subscribeOn(Schedulers.boundedElastic())
                .map(result -> ResponseEntity.status(200).body(result));
    }

    /**
     * @api {get} /geofence/circles Récupérer mes zones circulaires
     * @apiName GetMyCircles
     * @apiGroup Geofences
     * @apiVersion 1.0.0
     * @apiDescription Récupère uniquement les zones circulaires de l'utilisateur connecté
     *
     * @apiUse UserPermission
     *
     * @apiSuccess {Object[]} circles Liste des zones circulaires
     * @apiSuccess {String} circles.id Identifiant de la zone
     * @apiSuccess {String} circles.title Titre de la zone
     * @apiSuccess {String} circles.type Type "circle"
     * @apiSuccess {Object} circles.center Centre de la zone
     * @apiSuccess {Number} circles.radius Rayon en mètres
     * @apiSuccess {Object} circles.user Propriétaire
     * @apiSuccess {Object[]} circles.vehicles Véhicules associés
     *
     * @apiSuccessExample {json} Success-Response:
     *     HTTP/1.1 200 OK
     *     [
     *       {
     *         "id": "123e4567-e89b-12d3-a456-426614174000",
     *         "title": "Zone Bureau",
     *         "type": "circle",
     *         "center": {
     *           "coordinates": [3.8667, 11.5167]
     *         },
     *         "radius": 500.0,
     *         "user": {
     *           "username": "jeandupont"
     *         },
     *         "vehicles": []
     *       }
     *     ]
     *
     * @apiUse ErrorResponse
     */
    @GetMapping("/circles")
    public Mono<ResponseEntity<List<CircleGeofenceZoneDTOResponse>>> getCircles() {
        return Mono.fromCallable(() -> geofenceService.getCirclesGeofenceZone())
                .subscribeOn(Schedulers.boundedElastic())
                .map(result -> ResponseEntity.status(200).body(result));
    }

    /**
     * @api {get} /geofence/polygons Récupérer mes zones polygonales
     * @apiName GetMyPolygons
     * @apiGroup Geofences
     * @apiVersion 1.0.0
     * @apiDescription Récupère uniquement les zones polygonales de l'utilisateur connecté
     *
     * @apiUse UserPermission
     *
     * @apiSuccess {Object[]} polygons Liste des zones polygonales
     * @apiSuccess {String} polygons.id Identifiant de la zone
     * @apiSuccess {String} polygons.title Titre de la zone
     * @apiSuccess {String} polygons.type Type "polygon"
     * @apiSuccess {Object} polygons.polygon Géométrie du polygone
     * @apiSuccess {Object} polygons.user Propriétaire
     * @apiSuccess {Object[]} polygons.vehicles Véhicules associés
     *
     * @apiSuccessExample {json} Success-Response:
     *     HTTP/1.1 200 OK
     *     [
     *       {
     *         "id": "456e7890-e89b-12d3-a456-426614174001",
     *         "title": "Zone Entrepôt",
     *         "type": "polygon",
     *         "polygon": {
     *           "coordinates": [[[3.866, 11.516], [3.867, 11.516], [3.867, 11.517], [3.866, 11.517], [3.866, 11.516]]]
     *         },
     *         "user": {
     *           "username": "jeandupont"
     *         },
     *         "vehicles": []
     *       }
     *     ]
     *
     * @apiUse ErrorResponse
     */
    @GetMapping("/polygons")
    public Mono<ResponseEntity<List<PolygonGeofenceZoneDTOResponse>>> getPolygons() {
        return Mono.fromCallable(() -> geofenceService.getPolygonsGeofenceZone())
                .subscribeOn(Schedulers.boundedElastic())
                .map(result -> ResponseEntity.status(200).body(result));
    }

    /**
     * @api {post} /geofence Créer une géofence
     * @apiName CreateGeofence
     * @apiGroup Geofences
     * @apiVersion 1.0.0
     * @apiDescription Créer une nouvelle zone de géofence (circulaire ou polygonale)
     *
     * @apiUse UserPermission
     *
     * @apiBody {String="circle","polygon"} type Type de géofence (requis)
     * @apiBody {String{2-100}} title Titre de la zone (requis)
     * @apiBody {String} [description] Description de la zone
     * @apiBody {Object} [center] Centre de la zone (requis pour type="circle")
     * @apiBody {Number[]} center.coordinates Coordonnées [longitude, latitude]
     * @apiBody {Number{1-}} [radius] Rayon en mètres (requis pour type="circle")
     * @apiBody {Object} [polygon] Géométrie du polygone (requis pour type="polygon")
     * @apiBody {Array} polygon.coordinates Coordonnées du polygone
     *
     * @apiParamExample {json} Request-Example (Circle):
     *     {
     *       "type": "circle",
     *       "title": "Zone Bureau",
     *       "description": "Périmètre autorisé",
     *       "center": {
     *         "coordinates": [3.8667, 11.5167]
     *       },
     *       "radius": 500.0
     *     }
     *
     * @apiSuccess (201) {Object} geofence Zone de géofence créée
     * @apiUse GeofenceObject
     *
     * @apiError (Error 400) BadRequest Données invalides
     * @apiUse ErrorResponse
     */
    @PostMapping
    public Mono<ResponseEntity<GeofenceZoneDTOResponse>> create(
            @RequestBody GeofenceZoneDTORequest geofenceZoneDTORequest
    ) {
        return ReactiveSecurityContextHolder.getContext()
                .map(SecurityContext::getAuthentication)
                .map(Authentication::getName)
                .flatMap(username -> Mono.fromCallable(() -> {
                            var user = userRepository.findByUsername(username)
                                    .orElseThrow(() -> new RuntimeException("Utilisateur non trouvé"));
                            return geofenceService.createGeofenceZone(geofenceZoneDTORequest,user);
                }))
                .subscribeOn(Schedulers.boundedElastic())
                .map(result -> ResponseEntity.status(201).body(result));
    }

    /**
     * @api {get} /geofence/:type/:zoneId Récupérer une géofence
     * @apiName GetGeofence
     * @apiGroup Geofences
     * @apiVersion 1.0.0
     * @apiDescription Récupère les détails d'une zone de géofence
     *
     * @apiUse UserPermission
     *
     * @apiParam (Path) {String="c","p"} type Type de zone (c=circle, p=polygon)
     * @apiParam (Path) {String} zoneId Identifiant de la zone
     *
     * @apiSuccess {Object} geofence Données de la zone
     * @apiUse GeofenceObject
     *
     * @apiError (Error 404) NotFound Zone non trouvée
     * @apiUse ErrorResponse
     */
    @GetMapping(path="{type}/{zoneId}")
    public Mono<ResponseEntity<GeofenceZoneDTOResponse>> getZone(
            @PathVariable UUID zoneId,
            @PathVariable String type
    ) {
        return Mono.fromCallable(() -> geofenceService.getGeofenceZone(zoneId, type))
                .subscribeOn(Schedulers.boundedElastic())
                .map(result -> ResponseEntity.status(200).body(result));
    }

    /**
     * @api {put} /geofence/:type/:zoneId Modifier une géofence
     * @apiName UpdateGeofence
     * @apiGroup Geofences
     * @apiVersion 1.0.0
     * @apiDescription Modifier une zone de géofence existante
     *
     * @apiUse UserPermission
     *
     * @apiParam (Path) {String="c","p"} type Type de zone (c=circle, p=polygon)
     * @apiParam (Path) {String} zoneId Identifiant de la zone
     *
     * @apiBody {String="circle","polygon"} [type] Type de géofence
     * @apiBody {String{2-100}} [title] Nouveau titre de la zone
     * @apiBody {String} [description] Nouvelle description de la zone
     * @apiBody {Object} [center] Nouveau centre de la zone (pour type="circle")
     * @apiBody {Number[]} center.coordinates Coordonnées [longitude, latitude]
     * @apiBody {Number{1-}} [radius] Nouveau rayon en mètres (pour type="circle")
     * @apiBody {Object} [polygon] Nouvelle géométrie du polygone (pour type="polygon")
     * @apiBody {Array} polygon.coordinates Coordonnées du polygone
     *
     * @apiSuccess {Object} geofence Zone modifiée
     * @apiUse GeofenceObject
     *
     * @apiError (Error 404) NotFound Zone non trouvée
     * @apiError (Error 403) Forbidden Accès refusé
     * @apiUse ErrorResponse
     */
    @PutMapping(path="{type}/{zoneId}")
    public Mono<ResponseEntity<GeofenceZoneDTOResponse>> editZone(
            @PathVariable UUID zoneId,
            @PathVariable String type,
            @RequestBody GeofenceZoneDTORequest geofenceZoneDTORequest
    ) {
        return ReactiveSecurityContextHolder.getContext()
                .map(SecurityContext::getAuthentication)
                .map(Authentication::getName)
                .flatMap(username -> Mono.fromCallable(() -> {
                            var user = userRepository.findByUsername(username)
                                    .orElseThrow(() -> new RuntimeException("Utilisateur non trouvé"));
                            return geofenceService.editGeofenceZone(geofenceZoneDTORequest, zoneId, type,user);
                }))
                .subscribeOn(Schedulers.boundedElastic())
                .map(result -> ResponseEntity.status(200).body(result));
    }


    /**
     * @api {delete} /geofence/:type/:zoneId Supprimer une géofence
     * @apiName DeleteGeofence
     * @apiGroup Geofences
     * @apiVersion 1.0.0
     * @apiDescription Supprimer une zone de géofence
     *
     * @apiUse UserPermission
     *
     * @apiParam (Path) {String="c","p"} type Type de zone (c=circle, p=polygon)
     * @apiParam (Path) {String} zoneId Identifiant de la zone
     *
     * @apiSuccessExample {json} Success-Response:
     *     HTTP/1.1 204 No Content
     *
     * @apiError (Error 404) NotFound Zone non trouvée
     * @apiError (Error 403) Forbidden Accès refusé
     * @apiUse ErrorResponse
     */
    @DeleteMapping(path="{type}/{zoneId}")
    public Mono<ResponseEntity<Void>> deleteZone(
            @PathVariable UUID zoneId,
            @PathVariable String type
    ) {
        return ReactiveSecurityContextHolder.getContext()
                .map(SecurityContext::getAuthentication)
                .map(Authentication::getName)
                .flatMap(username -> Mono.fromCallable(() -> {
                    var user = userRepository.findByUsername(username)
                            .orElseThrow(() -> new RuntimeException("Utilisateur non trouvé"));
                    geofenceService.deleteGeofenceZone(zoneId, type, user);
                    return ResponseEntity.noContent().build();
                }))
                .subscribeOn(Schedulers.boundedElastic())
                .then(Mono.just(ResponseEntity.noContent().build()));
    }
}
