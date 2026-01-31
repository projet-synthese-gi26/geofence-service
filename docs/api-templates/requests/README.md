# API request templates (création)

But: j'ai généré des templates JSON complets pour toutes les requêtes de création (sauf `auth`). Ils couvrent les champs "intelligents" (temporels / conditionnels) et les formes géométriques conformes aux DTOs.

## Structure
- `/docs/api-templates/requests/geofence/` — `circle-create.json`, `polygon-create.json`, `fork-geofence.json`, `share-geofence.json`, `create-invite-link.json`
- `/docs/api-templates/requests/vehicle/` — `vehicle-create.json`
- `/docs/api-templates/requests/route/` — `route-create.json`, `route-segment-create.json`
- `/docs/api-templates/requests/location/` — `location-update.json`
- `/docs/api-templates/requests/user/` — `update-user-role.json`

---

## Exemples cURL rapides ✅
(Remplace `{{BASE}}` par `http://localhost:8080/api` et `{{TOKEN}}` par un JWT valide)

- Créer une géofence (circle)
  curl -X POST "{{BASE}}/geofence" \
    -H "Authorization: Bearer {{TOKEN}}" \
    -H "Content-Type: application/json" \
    --data-binary @docs/api-templates/requests/geofence/circle-create.json

- Créer une géofence (polygon)
  curl -X POST "{{BASE}}/geofence" -H "Authorization: Bearer {{TOKEN}}" -H "Content-Type: application/json" --data-binary @docs/api-templates/requests/geofence/polygon-create.json

- Fork de géofence
  curl -X POST "{{BASE}}/geofence/fork" -H "Authorization: Bearer {{TOKEN}}" -H "Content-Type: application/json" --data-binary @docs/api-templates/requests/geofence/fork-geofence.json

- Partager une géofence
  curl -X POST "{{BASE}}/geofence/{zoneId}/share" -H "Authorization: Bearer {{TOKEN}}" -H "Content-Type: application/json" --data-binary @docs/api-templates/requests/geofence/share-geofence.json

- Créer un véhicule
  curl -X POST "{{BASE}}/vehicles" -H "Authorization: Bearer {{TOKEN}}" -H "Content-Type: application/json" --data-binary @docs/api-templates/requests/vehicle/vehicle-create.json

- Créer une route (avec segment)
  curl -X POST "{{BASE}}/routes" -H "Authorization: Bearer {{TOKEN}}" -H "Content-Type: application/json" --data-binary @docs/api-templates/requests/route/route-create.json

- Mise à jour position (device → serveur)
  curl -X POST "{{BASE}}/locations" -H "Authorization: Bearer {{TOKEN}}" -H "Content-Type: application/json" --data-binary @docs/api-templates/requests/location/location-update.json

- Mettre à jour le rôle d'un utilisateur (admin)
  curl -X PUT "{{BASE}}/users/{userId}/role" -H "Authorization: Bearer {{TOKEN}}" -H "Content-Type: application/json" --data-binary @docs/api-templates/requests/user/update-user-role.json

---

## Notes importantes ⚠️
- Les templates incluent toutes les propriétés définies dans les DTOs (temporelles, conditionnelles, géométrie). Supprime les champs optionnels si tu veux une requête minimale.
- Les coordonnées sont au format [longitude, latitude] (conforme aux DTOs : `PointDTO`, `PolygonDTO`, `LineStringDTO`).
- Pour les UUID / dates, remplace les exemples par des valeurs réelles.

---

Si tu veux :
1) que je génère des fichiers Postman / Insomnia importables — je peux le faire ;
2) ajouter des exemples minimaux (+ validations attendues) pour chaque endpoint — je peux l'ajouter. 💡
