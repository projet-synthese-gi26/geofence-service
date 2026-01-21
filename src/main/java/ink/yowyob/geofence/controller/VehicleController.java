package ink.yowyob.geofence.controller;

import ink.yowyob.geofence.dto.request.VehicleDTORequest;
import ink.yowyob.geofence.dto.response.MultipleVehicleDTOResponse;
import ink.yowyob.geofence.dto.response.VehicleDTOResponse;
import ink.yowyob.geofence.model.User;
import ink.yowyob.geofence.repository.UserRepository;
import ink.yowyob.geofence.service.FileStorageService;
import ink.yowyob.geofence.service.Implementation.VehicleServiceImpl;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.http.codec.multipart.FilePart;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.ReactiveSecurityContextHolder;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;
import reactor.core.scheduler.Schedulers;

import java.io.IOException;
import java.util.UUID;

/**
 * @apiDefine UserPermission
 * @apiPermission user
 * @apiHeader {String} Authorization Bearer token (JWT)
 * @apiHeaderExample {json} Header-Example:
 * {
 * "Authorization": "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9..."
 * }
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
 * @apiDefine VehicleObject
 * @apiSuccess {String} id Identifiant unique du véhicule
 * @apiSuccess {String} brand Marque du véhicule
 * @apiSuccess {String} model Modèle du véhicule
 * @apiSuccess {String} licensePlate Plaque d'immatriculation
 * @apiSuccess {String} [description] Description du véhicule
 * @apiSuccess {String} [imageUrl] URL de l'image du véhicule
 * @apiSuccess {Object} user Propriétaire du véhicule
 * @apiSuccess {Object[]} geofenceZones Zones de géofence associées
 */

@Slf4j
@RestController
@RequestMapping("/api/vehicle")
@RequiredArgsConstructor
public class VehicleController {
    private final VehicleServiceImpl vehicleService;
    private final FileStorageService fileStorageService;
    private final UserRepository userRepository;

    private Mono<User> getCurrentUser() {
        return ReactiveSecurityContextHolder.getContext()
                .map(SecurityContext::getAuthentication)
                .map(Authentication::getName)
                .flatMap(username -> Mono.fromCallable(() -> {
                    var user = userRepository.findByUsername(username)
                            .orElseThrow(() -> new RuntimeException("Utilisateur non trouvé"));
                    log.info(user.getUsername());
                    return user;
                }).subscribeOn(Schedulers.boundedElastic()));
    }

    /**
     * @api {get} /vehicle Récupérer mes véhicules
     * @apiName GetMyVehicles
     * @apiGroup Vehicles
     * @apiVersion 1.0.0
     * @apiDescription Récupère la liste des véhicules de l'utilisateur connecté
     *
     * @apiUse UserPermission
     *
     * @apiSuccess {Object[]} vehicles Liste des véhicules
     * @apiUse VehicleObject
     *
     * @apiSuccessExample {json} Success-Response:
     *     HTTP/1.1 200 OK
     *     {
     *       "vehicles": [
     *         {
     *           "id": "123e4567-e89b-12d3-a456-426614174000",
     *           "brand": "Toyota",
     *           "model": "Camry",
     *           "licensePlate": "AB-123-CD",
     *           "description": "Véhicule de service",
     *           "imageUrl": "http://localhost:8080/uploads/vehicles/123e4567.jpg",
     *           "user": {
     *             "uuid": "456e7890-e89b-12d3-a456-426614174001",
     *             "username": "jeandupont"
     *           },
     *           "geofenceZones": []
     *         }
     *       ]
     *     }
     *
     * @apiUse ErrorResponse
     */
    @GetMapping
    public Mono<ResponseEntity<MultipleVehicleDTOResponse>> index() {
        return getCurrentUser()
                .flatMap(user -> Mono.fromCallable(() -> vehicleService.getMyVehicles(user))
                        .subscribeOn(Schedulers.boundedElastic()))
                .map(ResponseEntity::ok);
    }

    /**
     * @api {get} /vehicle/admin Récupérer tous les véhicules (Admin)
     * @apiName GetAllVehicles
     * @apiGroup Vehicles
     * @apiVersion 1.0.0
     * @apiDescription Récupère la liste de tous les véhicules du système (accès admin/manager uniquement)
     *
     * @apiUse ManagerPermission
     *
     * @apiSuccess {Object[]} vehicles Liste de tous les véhicules
     * @apiUse VehicleObject
     *
     * @apiSuccessExample {json} Success-Response:
     *     HTTP/1.1 200 OK
     *     {
     *       "vehicles": [
     *         {
     *           "id": "123e4567-e89b-12d3-a456-426614174000",
     *           "brand": "Toyota",
     *           "model": "Camry",
     *           "licensePlate": "AB-123-CD",
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
    public Mono<ResponseEntity<MultipleVehicleDTOResponse>> admin() {
        return getCurrentUser()
                .flatMap(user -> Mono.fromCallable(() -> vehicleService.getVehicles(user))
                        .subscribeOn(Schedulers.boundedElastic()))
                .map(ResponseEntity::ok);
    }

    /**
     * @api {post} /vehicle Créer un véhicule
     * @apiName CreateVehicle
     * @apiGroup Vehicles
     * @apiVersion 1.0.0
     * @apiDescription Créer un nouveau véhicule avec image optionnelle
     *
     * @apiUse UserPermission
     *
     * @apiBody {String} vehicle Données du véhicule (JSON) (requis)
     * @apiBody {File} [image] Image du véhicule (JPG, PNG, max 10MB)
     *
     * @apiParamExample {json} vehicle-Example:
     *     {
     *       "brand": "Toyota",
     *       "model": "Camry",
     *       "licensePlate": "AB-123-CD",
     *       "description": "Véhicule de service"
     *     }
     *
     * @apiSuccess (201) {Object} vehicle Données du véhicule créé
     * @apiUse VehicleObject
     *
     * @apiError (Error 400) BadRequest Données invalides
     * @apiUse ErrorResponse
     */
    @PostMapping(consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
    public Mono<ResponseEntity<VehicleDTOResponse>> create(
            @RequestPart("vehicle") VehicleDTORequest vehicleDTORequest,
            @RequestPart(value = "image", required = false) Mono<FilePart> image
    ) {
        return getCurrentUser()
                .flatMap(user -> Mono.fromCallable(() -> vehicleService.createVehicle(vehicleDTORequest, user))
                        .subscribeOn(Schedulers.boundedElastic())
                        .flatMap(response -> {
                            return image
                                    .flatMap(img -> fileStorageService.storeVehicleImageReactive(img, response.id())
                                            .map(imageUrl -> vehicleService.updateVehicleImage(response.id(), imageUrl, user)))
                                    .defaultIfEmpty(response);
                        }))
                .map(response -> ResponseEntity.status(201).body(response));
    }

    /**
     * @api {get} /vehicle/:vehicleId Récupérer un véhicule
     * @apiName GetVehicle
     * @apiGroup Vehicles
     * @apiVersion 1.0.0
     * @apiDescription Récupère les détails d'un véhicule spécifique
     *
     * @apiUse UserPermission
     *
     * @apiParam (Path) {String} vehicleId Identifiant unique du véhicule
     *
     * @apiSuccess {Object} vehicle Données du véhicule
     * @apiUse VehicleObject
     *
     * @apiError (Error 404) NotFound Véhicule non trouvé
     * @apiError (Error 403) Forbidden Accès refusé
     * @apiUse ErrorResponse
     */
    @GetMapping("/{vehicleId}")
    public Mono<ResponseEntity<VehicleDTOResponse>> getVehicle(
            @PathVariable UUID vehicleId
    ) {
        return getCurrentUser()
                .flatMap(user -> Mono.fromCallable(() -> vehicleService.getVehicle(vehicleId, user))
                        .subscribeOn(Schedulers.boundedElastic()))
                .map(response -> ResponseEntity.status(200).body(response));
    }

    /**
     * @api {put} /vehicle/:vehicleId Modifier un véhicule
     * @apiName UpdateVehicle
     * @apiGroup Vehicles
     * @apiVersion 1.0.0
     * @apiDescription Modifier un véhicule existant
     *
     * @apiUse UserPermission
     *
     * @apiParam (Path) {String} vehicleId Identifiant unique du véhicule
     *
     * @apiBody {Object} vehicle Nouvelles données du véhicule
     * @apiBody {File} [image] Nouvelle image du véhicule
     *
     * @apiSuccess {Object} vehicle Données du véhicule modifié
     * @apiUse VehicleObject
     *
     * @apiError (Error 404) NotFound Véhicule non trouvé
     * @apiError (Error 403) Forbidden Accès refusé
     * @apiUse ErrorResponse
     */
    @PutMapping(value = "/{vehicleId}", consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
    public Mono<ResponseEntity<VehicleDTOResponse>> editVehicle(
            @PathVariable UUID vehicleId,
            @RequestPart("vehicle") VehicleDTORequest vehicleDTORequest,
            @RequestPart(value = "image", required = false) FilePart image
    ) {
        return getCurrentUser()
                .flatMap(user -> Mono.fromCallable(() -> vehicleService.editVehicle(vehicleDTORequest, vehicleId, user))
                        .subscribeOn(Schedulers.boundedElastic())
                        .flatMap(response -> {
                            if (image != null) {
                                return Mono.fromCallable(() -> {
                                            try {
                                                String imageUrl = fileStorageService.storeVehicleImageFromFilePart(image, vehicleId);
                                                return vehicleService.updateVehicleImage(vehicleId, imageUrl, user);
                                            } catch (IOException e) {
                                                return response; // Return original response on error
                                            }
                                        })
                                        .subscribeOn(Schedulers.boundedElastic());
                            }
                            return Mono.just(response);
                        }))
                .map(response -> ResponseEntity.status(200).body(response));
    }

    /**
     * @api {delete} /vehicle/:vehicleId Supprimer un véhicule
     * @apiName DeleteVehicle
     * @apiGroup Vehicles
     * @apiVersion 1.0.0
     * @apiDescription Supprimer un véhicule et son image associée
     *
     * @apiUse UserPermission
     *
     * @apiParam (Path) {String} vehicleId Identifiant unique du véhicule
     *
     * @apiSuccessExample {json} Success-Response:
     *     HTTP/1.1 204 No Content
     *
     * @apiError (Error 404) NotFound Véhicule non trouvé
     * @apiError (Error 403) Forbidden Accès refusé
     * @apiUse ErrorResponse
     */
    @DeleteMapping("/{vehicleId}")
    public Mono<ResponseEntity<Void>> deleteVehicle(
            @PathVariable UUID vehicleId
    ) {
        return getCurrentUser()
                .flatMap(user -> Mono.fromCallable(() -> {
                    // Récupérer le véhicule pour obtenir l'URL de l'image à supprimer
                    VehicleDTOResponse vehicle = vehicleService.getVehicle(vehicleId, user);

                    // Supprimer l'image si elle existe
                    if (vehicle.imageUrl() != null) {
                        fileStorageService.deleteVehicleImage(vehicle.imageUrl());
                    }

                    // Supprimer le véhicule
                    vehicleService.deleteVehicle(vehicleId, user);
                    return ResponseEntity.status(204).<Void>build();
                }))
                .subscribeOn(Schedulers.boundedElastic());
    }

    /**
     * @api {post} /vehicle/:vehicleId/image Mettre à jour l'image du véhicule
     * @apiName UpdateVehicleImage
     * @apiGroup Vehicles
     * @apiVersion 1.0.0
     * @apiDescription Met à jour uniquement l'image d'un véhicule existant
     *
     * @apiUse UserPermission
     *
     * @apiParam (Path) {String} vehicleId Identifiant unique du véhicule
     *
     * @apiBody {File} image Nouvelle image du véhicule (requis)
     *
     * @apiSuccess {Object} vehicle Données du véhicule avec nouvelle image
     * @apiUse VehicleObject
     *
     * @apiError (Error 404) NotFound Véhicule non trouvé
     * @apiUse ErrorResponse
     */
    @PostMapping("/{vehicleId}/image")
    public Mono<ResponseEntity<VehicleDTOResponse>> updateVehicleImage(
            @PathVariable UUID vehicleId,
            @RequestPart("image") FilePart image
    ) {
        return getCurrentUser()
                .flatMap(user -> Mono.fromCallable(() -> {
                            try {
                                String imageUrl = fileStorageService.storeVehicleImageFromFilePart(image, vehicleId);
                                return vehicleService.updateVehicleImage(vehicleId, imageUrl, user);
                            } catch (IOException e) {
                                throw new RuntimeException("Failed to store image", e);
                            }
                        })
                        .subscribeOn(Schedulers.boundedElastic()))
                .map(ResponseEntity::ok)
                .onErrorReturn(ResponseEntity.internalServerError().build());
    }

    /**
     * @api {post} /vehicle/:vehicleId/geofence/:type/:zoneId Assigner à une zone
     * @apiName AssignVehicleToGeofence
     * @apiGroup Vehicles
     * @apiVersion 1.0.0
     * @apiDescription Assigner un véhicule à une zone de géofence
     *
     * @apiUse UserPermission
     *
     * @apiParam (Path) {String} vehicleId Identifiant du véhicule
     * @apiParam (Path) {String="c","p"} type Type de zone (c=circle, p=polygon)
     * @apiParam (Path) {String} zoneId Identifiant de la zone
     *
     * @apiSuccess {Object} vehicle Données du véhicule mis à jour
     * @apiUse VehicleObject
     *
     * @apiError (Error 404) NotFound Véhicule ou zone non trouvé(e)
     * @apiError (Error 403) Forbidden Accès refusé
     * @apiUse ErrorResponse
     */
    @PostMapping("/{vehicleId}/geofence/{type}/{zoneId}")
    public Mono<ResponseEntity<VehicleDTOResponse>> assignToGeofenceZone(
            @PathVariable UUID vehicleId,
            @PathVariable String type,
            @PathVariable UUID zoneId
    ) {
        return getCurrentUser()
                .flatMap(user -> Mono.fromCallable(() -> vehicleService.assignToGeofenceZone(vehicleId, zoneId, type, user))
                        .subscribeOn(Schedulers.boundedElastic()))
                .map(response -> ResponseEntity.status(200).body(response));
    }

    /**
     * @api {delete} /vehicle/:vehicleId/geofence/:zoneId Retirer d'une zone
     * @apiName RemoveVehicleFromGeofence
     * @apiGroup Vehicles
     * @apiVersion 1.0.0
     * @apiDescription Retirer un véhicule d'une zone de géofence
     *
     * @apiUse UserPermission
     *
     * @apiParam (Path) {String} vehicleId Identifiant du véhicule
     * @apiParam (Path) {String} zoneId Identifiant de la zone de géofence
     *
     * @apiSuccess {Object} vehicle Données du véhicule mis à jour
     * @apiUse VehicleObject
     *
     * @apiSuccessExample {json} Success-Response:
     *     HTTP/1.1 200 OK
     *     {
     *       "id": "123e4567-e89b-12d3-a456-426614174000",
     *       "brand": "Toyota",
     *       "model": "Camry",
     *       "licensePlate": "AB-123-CD",
     *       "geofenceZones": []
     *     }
     *
     * @apiError (Error 404) NotFound Véhicule ou zone non trouvé(e)
     * @apiError (Error 403) Forbidden Accès refusé
     * @apiUse ErrorResponse
     */
    @DeleteMapping("/{vehicleId}/geofence/{zoneId}")
    public Mono<ResponseEntity<VehicleDTOResponse>> removeFromGeofenceZone(
            @PathVariable UUID vehicleId,
            @PathVariable UUID zoneId
    ) {
        return getCurrentUser()
                .flatMap(user -> Mono.fromCallable(() -> vehicleService.removeFromGeofenceZone(vehicleId, zoneId, user))
                        .subscribeOn(Schedulers.boundedElastic()))
                .map(response -> ResponseEntity.status(200).body(response));
    }
}