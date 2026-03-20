# Contexte Complet du Projet

**Projet:** geofence-service  
**Date de génération:** 20/03/2026 22:48:58  
**Chemin:** D:\Projets\Scolaire\Reseau\Litige\geofence-service

---

## Table des matières
1. [Structure du projet](#structure-du-projet)
2. [Contenu des fichiers](#contenu-des-fichiers)
3. [Statistiques](#statistiques)

---

## Structure du projet

```
├── .github
│   └── workflows
│       └── ci-cd.yml
├── docker
│   ├── docker-compose-stack.yml
│   ├── docker-compose.yml
│   └── Dockerfile
├── docs
│   ├── api-templates
│   │   └── requests
│   │       ├── geofence
│   │       │   ├── circle-create.json
│   │       │   ├── create-invite-link.json
│   │       │   ├── curl-user-requests.txt
│   │       │   ├── fork-geofence.json
│   │       │   ├── polygon-create.json
│   │       │   └── share-geofence.json
│   │       ├── location
│   │       │   └── location-update.json
│   │       ├── route
│   │       │   ├── route-create.json
│   │       │   └── route-segment-create.json
│   │       ├── user
│   │       │   └── update-user-role.json
│   │       ├── vehicle
│   │       │   └── vehicle-create.json
│   │       └── README.md
│   ├── assets
│   │   ├── android-chrome-192x192.png
│   │   ├── android-chrome-512x512.png
│   │   ├── apple-touch-icon.png
│   │   ├── bootstrap.min.css
│   │   ├── bootstrap.min.css.map
│   │   ├── favicon-16x16.png
│   │   ├── favicon-32x32.png
│   │   ├── favicon.ico
│   │   ├── glyphicons-halflings-regular.eot
│   │   ├── glyphicons-halflings-regular.svg
│   │   ├── glyphicons-halflings-regular.ttf
│   │   ├── glyphicons-halflings-regular.woff
│   │   ├── glyphicons-halflings-regular.woff2
│   │   ├── main.bundle.js
│   │   ├── main.css
│   │   ├── prism-diff-highlight.css
│   │   ├── prism-toolbar.css
│   │   └── prism.css
│   └── index.html
├── gitlab-ci
│   ├── build.gitlab-ci.yml
│   ├── ci_settings.xml
│   ├── deploy.gitlab-ci.yml
│   ├── docker-build.gitlab-ci.yml
│   ├── general.gitlab-ci.yml
│   └── package.gitlab-ci.yml
├── lib
│   ├── ugeojson-builder-0.0.1-SNAPSHOT.jar
│   ├── ugeojson-math-0.0.1-SNAPSHOT.jar
│   ├── ugeojson-model-0.0.1-SNAPSHOT.jar
│   └── ugeojson-parser-0.0.1-SNAPSHOT.jar
├── nginx
│   └── nginx.conf
├── scripts
│   ├── clean.sh
│   ├── init-db.sql
│   ├── migration-geofence-intelligent.sql
│   ├── start-prod.sh
│   ├── start.sh
│   └── stop.sh
├── src
│   ├── components
│   │   └── ui
│   │       ├── ConfirmDialog.tsx
│   │       ├── LoadingSpinner.tsx
│   │       └── SearchBar.tsx
│   ├── main
│   │   ├── java
│   │   │   └── ink
│   │   │       └── yowyob
│   │   │           └── geofence
│   │   │               ├── auth
│   │   │               │   ├── AuthController.java
│   │   │               │   ├── AuthService.java
│   │   │               │   └── AuthServiceImpl.java
│   │   │               ├── components
│   │   │               │   └── RoleInitializer.java
│   │   │               ├── config
│   │   │               │   ├── JwtConfig.java
│   │   │               │   ├── WebFluxConfig.java
│   │   │               │   └── WebSocketConfig.java
│   │   │               ├── controller
│   │   │               │   ├── advice
│   │   │               │   │   └── ApplicationControllerAdvice.java
│   │   │               │   ├── AlertController.java
│   │   │               │   ├── DashboardController.java
│   │   │               │   ├── DocumentationController.java
│   │   │               │   ├── GeofenceController.java
│   │   │               │   ├── GeofenceForkController.java
│   │   │               │   ├── GeofenceInviteLinkController.java
│   │   │               │   ├── GeofenceSharingController.java
│   │   │               │   ├── LocationController.java
│   │   │               │   ├── RouteController.java
│   │   │               │   ├── RouteDeviationController.java
│   │   │               │   ├── StatisticsController.java
│   │   │               │   ├── UserController.java
│   │   │               │   ├── UserManagementController.java
│   │   │               │   └── VehicleController.java
│   │   │               ├── dto
│   │   │               │   ├── request
│   │   │               │   │   ├── AuthRequest
│   │   │               │   │   │   ├── AuthenticationDTO.java
│   │   │               │   │   │   ├── LoginDTO.java
│   │   │               │   │   │   ├── LoginEmailDTO.java
│   │   │               │   │   │   ├── LoginPhoneNumberDTO.java
│   │   │               │   │   │   ├── LoginUsernameDTO.java
│   │   │               │   │   │   └── RegisterDTO.java
│   │   │               │   │   ├── CircleGeofenceZoneDTORequest.java
│   │   │               │   │   ├── CreateApiKeyRequest.java
│   │   │               │   │   ├── CreateInviteLinkRequest.java
│   │   │               │   │   ├── ForkGeofenceRequest.java
│   │   │               │   │   ├── GeofenceZoneDTORequest.java
│   │   │               │   │   ├── LocationUpdateRequest.java
│   │   │               │   │   ├── PolygonGeofenceZoneDTORequest.java
│   │   │               │   │   ├── RouteDTORequest.java
│   │   │               │   │   ├── RouteSegmentDTORequest.java
│   │   │               │   │   ├── ShareGeofenceRequest.java
│   │   │               │   │   ├── UpdateUserRoleRequest.java
│   │   │               │   │   └── VehicleDTORequest.java
│   │   │               │   ├── response
│   │   │               │   │   ├── AlertCountDTO.java
│   │   │               │   │   ├── AlertDTO.java
│   │   │               │   │   ├── AlertListResponse.java
│   │   │               │   │   ├── ApiKeyListResponse.java
│   │   │               │   │   ├── AuthResponse.java
│   │   │               │   │   ├── CircleGeofenceZoneDTOResponse.java
│   │   │               │   │   ├── DashboardStatsDTO.java
│   │   │               │   │   ├── ErrorEntity.java
│   │   │               │   │   ├── GeofenceForkDTO.java
│   │   │               │   │   ├── GeofenceForkInfoDTO.java
│   │   │               │   │   ├── GeofenceForkListResponse.java
│   │   │               │   │   ├── GeofenceShareDTO.java
│   │   │               │   │   ├── GeofenceShareListResponse.java
│   │   │               │   │   ├── GeofenceWithForkInfoDTO.java
│   │   │               │   │   ├── GeofenceZoneDTOResponse.java
│   │   │               │   │   ├── GeofenceZoneSimpleDTO.java
│   │   │               │   │   ├── InviteLinkDetailsResponse.java
│   │   │               │   │   ├── InviteLinkDTO.java
│   │   │               │   │   ├── InviteLinkListResponse.java
│   │   │               │   │   ├── LocationDTO.java
│   │   │               │   │   ├── LocationListResponse.java
│   │   │               │   │   ├── LocationUpdateResponse.java
│   │   │               │   │   ├── MultipleGeofenceZoneDTOResponse.java
│   │   │               │   │   ├── MultipleRoutesDTOResponse.java
│   │   │               │   │   ├── MultipleVehicleDTOResponse.java
│   │   │               │   │   ├── PolygonGeofenceZoneDTOResponse.java
│   │   │               │   │   ├── RegisterResponse.java
│   │   │               │   │   ├── RouteDTOResponse.java
│   │   │               │   │   ├── RouteSegmentDTOResponse.java
│   │   │               │   │   ├── SimpleVehicleDTO.java
│   │   │               │   │   ├── SystemStatisticsDTO.java
│   │   │               │   │   ├── UserDTO.java
│   │   │               │   │   ├── UserListResponse.java
│   │   │               │   │   ├── UserStatisticsDTO.java
│   │   │               │   │   ├── VehicleApiKeyDTO.java
│   │   │               │   │   ├── VehicleDTOResponse.java
│   │   │               │   │   └── VehicleStatisticsDTO.java
│   │   │               │   ├── LineStringDTO.java
│   │   │               │   ├── PointDTO.java
│   │   │               │   └── PolygonDTO.java
│   │   │               ├── Enum
│   │   │               │   ├── AlertTypeEnum.java
│   │   │               │   ├── DayOfWeek.java
│   │   │               │   ├── ShareStatus.java
│   │   │               │   └── UserRole.java
│   │   │               ├── exception
│   │   │               │   ├── BadCredentialsException.java
│   │   │               │   ├── PasswordMismatchException.java
│   │   │               │   ├── ResourceNotFoundException.java
│   │   │               │   └── UserAlreadyExistsException.java
│   │   │               ├── mapper
│   │   │               │   ├── AlertDTOMapper.java
│   │   │               │   ├── CircleDTOMapper.java
│   │   │               │   ├── GeofenceForkDTOMapper.java
│   │   │               │   ├── GeofenceShareDTOMapper.java
│   │   │               │   ├── InviteLinkDTOMapper.java
│   │   │               │   ├── LocationDTOMapper.java
│   │   │               │   ├── PolygonDTOMapper.java
│   │   │               │   ├── RouteDTOMapper.java
│   │   │               │   ├── RouteSegmentDTOMapper.java
│   │   │               │   ├── UserDTOMapper.java
│   │   │               │   ├── VehicleApiKeyDTOMapper.java
│   │   │               │   └── VehicleDTOMapper.java
│   │   │               ├── model
│   │   │               │   ├── Alert.java
│   │   │               │   ├── AlertType.java
│   │   │               │   ├── CircleGeofenceZone.java
│   │   │               │   ├── GeofenceFork.java
│   │   │               │   ├── GeofenceInviteLink.java
│   │   │               │   ├── GeofenceShare.java
│   │   │               │   ├── GeofenceZone.java
│   │   │               │   ├── Location.java
│   │   │               │   ├── Organization.java
│   │   │               │   ├── OrganizationUser.java
│   │   │               │   ├── PolygonGeofenceZone.java
│   │   │               │   ├── Role.java
│   │   │               │   ├── Route.java
│   │   │               │   ├── RouteSegment.java
│   │   │               │   ├── User.java
│   │   │               │   ├── Validation.java
│   │   │               │   ├── Vehicle.java
│   │   │               │   └── VehicleApiKey.java
│   │   │               ├── repository
│   │   │               │   ├── AlertRepository.java
│   │   │               │   ├── AlertTypeRepository.java
│   │   │               │   ├── CircleGeofenceZoneRepository.java
│   │   │               │   ├── GeofenceForkRepository.java
│   │   │               │   ├── GeofenceInviteLinkRepository.java
│   │   │               │   ├── GeofenceShareRepository.java
│   │   │               │   ├── GeofenceZoneRepository.java
│   │   │               │   ├── LocationRepository.java
│   │   │               │   ├── PolygonGeofenceZoneRepository.java
│   │   │               │   ├── RoleRepository.java
│   │   │               │   ├── RouteRepository.java
│   │   │               │   ├── RouteSegmentRepository.java
│   │   │               │   ├── UserRepository.java
│   │   │               │   ├── VehicleApiKeyRepository.java
│   │   │               │   └── VehicleRepository.java
│   │   │               ├── security
│   │   │               │   ├── ConfigurationSecurityApplication.java
│   │   │               │   ├── JwtAuthenticationException.java
│   │   │               │   ├── JwtAuthenticationManager.java
│   │   │               │   ├── JwtServerAuthenticationConverter.java
│   │   │               │   ├── JwtService.java
│   │   │               │   └── JwtToken.java
│   │   │               ├── service
│   │   │               │   ├── Implementation
│   │   │               │   │   ├── AlertServiceImpl.java
│   │   │               │   │   ├── DashboardServiceImpl.java
│   │   │               │   │   ├── GeofenceForkServiceImpl.java
│   │   │               │   │   ├── GeofenceInviteLinkServiceImpl.java
│   │   │               │   │   ├── GeofenceServiceImpl.java
│   │   │               │   │   ├── GeofenceSharingServiceImpl.java
│   │   │               │   │   ├── LocationServiceImpl.java
│   │   │               │   │   ├── RealTimeServiceImpl.java
│   │   │               │   │   ├── RouteDeviationDetectionServiceImpl.java
│   │   │               │   │   ├── RouteServiceImpl.java
│   │   │               │   │   ├── StatisticsServiceImpl.java
│   │   │               │   │   ├── UserManagementServiceImpl.java
│   │   │               │   │   ├── UserServiceImpl.java
│   │   │               │   │   └── VehicleServiceImpl.java
│   │   │               │   ├── AlertService.java
│   │   │               │   ├── DashboardService.java
│   │   │               │   ├── FileStorageService.java
│   │   │               │   ├── GeofenceForkService.java
│   │   │               │   ├── GeofenceInviteLinkService.java
│   │   │               │   ├── GeofenceService.java
│   │   │               │   ├── GeofenceSharingService.java
│   │   │               │   ├── LocationService.java
│   │   │               │   ├── RealTimeService.java
│   │   │               │   ├── RouteDeviationDetectionService.java
│   │   │               │   ├── RouteService.java
│   │   │               │   ├── StatisticsService.java
│   │   │               │   ├── UserManagementService.java
│   │   │               │   ├── UserService.java
│   │   │               │   └── VehicleService.java
│   │   │               ├── util
│   │   │               │   └── DayOfWeekParser.java
│   │   │               ├── _apidoc.js
│   │   │               └── GeofenceApplication.java
│   │   └── resources
│   │       ├── db
│   │       │   └── changelog
│   │       │       ├── changes
│   │       │       │   └── V1.0-create-initial-schema.xml
│   │       │       └── db.changelog-master.xml
│   │       ├── application.yml
│   │       └── prod.application.yml
│   ├── services
│   │   └── authService.ts
│   ├── test
│   │   └── java
│   │       └── com
│   │           └── reseau
│   │               └── geofence
│   │                   └── GeofenceApplicationTests.java
│   └── types
│       ├── auth.ts
│       └── enums.ts
├── uploads
│   └── vehicles
│       ├── 174c0e1b-3183-4d4f-a143-431fac1d5a8a.png
│       ├── acb1227e-fc38-4f5d-bfcd-7a62f2ae7b78.png
│       ├── c09d1031-b63f-4447-afeb-9f3822ae89e9.jpg
│       ├── e1e81386-9181-4808-8a67-6803b9c539b7.jpg
│       ├── e1e81386-9181-4808-8a67-6803b9c539b7.png
│       ├── ebcefd79-fd89-426b-89ea-a0ad335ce282.jpg
│       └── ec331947-e24b-4f95-8b81-9d4bc33a87e5.jpg
├── .dockerignore
├── .env.docker
├── .env.docker.example
├── .env.example
├── .gitattributes
├── .gitignore
├── .gitlab-ci.yml
├── apidoc.json
├── docker-compose.prod.yml
├── docker-compose.yml
├── DOCKER.md
├── Dockerfile
├── docs.zip
├── footer.md
├── generate.js
├── geofence.drawio.png
├── GUIDE_DEPLOIEMENT.md
├── header.md
├── mvnw
├── mvnw.cmd
├── pom.xml
└── README.md
```

---

## Contenu des fichiers

### 📄 .github\workflows\ci-cd.yml

```yaml
name: Spring Boot CI/CD

on:
  push:
    branches:
      - "**"
jobs:
  pipeline:
    uses: projet-synthese-gi26/workflows/.github/workflows/spring-boot-ci-cd.yml@main
    with:
      app_name: geofence-service
    secrets: inherit          # passe TOUS les secrets automatiquement

```

*Lignes: 13*

---

### 📄 .gitlab-ci.yml

```yaml
include:
  - local: "/gitlab-ci/general.gitlab-ci.yml"
  - local: "/gitlab-ci/build.gitlab-ci.yml"
  - local: "/gitlab-ci/docker-build.gitlab-ci.yml"
  - local: "/gitlab-ci/package.gitlab-ci.yml"
  - local: "/gitlab-ci/deploy.gitlab-ci.yml"

```

*Lignes: 7*

---

### 📄 apidoc.json

```json
{
  "name": "Geofence API",
  "version": "1.0.0",
  "description": "API de gestion de géofences pour le suivi de véhicules",
  "title": "Geofence Management API",
  "url": "http://localhost:8081/api",
  "sampleUrl": "http://localhost:8081/api",
  "defaultVersion": "1.0.0",
  "generator": {
    "name": "apidoc",
    "time": "2025-01-08T10:00:00.000Z",
    "url": "http://apidocjs.com",
    "version": "0.29.0"
  },
  "order": [
    "Authentication",
    "Vehicles",
    "Geofences",
    "Geofence Sharing",
    "Invite Links",
    "Geofence Fork",
    "Alerts",
    "Statistics",
    "User Management"
  ],
  "header": {
    "title": "Getting Started",
    "filename": "header.md"
  },
  "footer": {
    "title": "Additional Information",
    "filename": "footer.md"
  }
}
```

*Lignes: 34*

---

### 📄 docker\docker-compose-stack.yml

```yaml
services:
  # SERVER: CONFIG SERVER -----------------------------------------------------------
  geofence-service:
    image: ${IMAGE_TAG}
    environment:
      - SPRING_PROFILES_ACTIVE=${SPRING_PROFILES_ACTIVE}
      - DB_URL=${POSTGRES_GEOFENCE_URL}
      - DB_USERNAME=${POSTGRES_USER}
      - DB_PASSWORD=${POSTGRES_PASSWORD}
    ports:
      - target: 8081
        published: ${GEOFENCE_SERVICE_PORT}
        protocol: tcp
        mode: host
    networks:
      - openia-main-network

networks:
  openia-main-network:
    external: true

```

*Lignes: 21*

---

### 📄 docker\docker-compose.yml

```yaml
services:
  organization-service:
    image: yowyob/geofence-service
    container_name: yowyob-geofence-service
    build:
      context: ../
      dockerfile: docker/Dockerfile
    environment:
      - CONFIG_SERVER_URL=${CONFIG_SERVER_URL}
    networks:
      - openia-main-network
    ports:
      - 8089:8081
# NETWORKS ------------------------------------------------------------------------
networks:
  openia-main-network:
    external: true
```

*Lignes: 17*

---

### 📄 docker-compose.prod.yml

```yaml
# docker-compose.prod.yml

services:
  postgres:
    image: postgis/postgis:15-3.4
    container_name: geofence-postgres-prod
    environment:
      POSTGRES_DB: ${DB_NAME}
      POSTGRES_USER: ${DB_USERNAME}
      POSTGRES_PASSWORD: ${DB_PASSWORD}
    volumes:
      - postgres_prod_data:/var/lib/postgresql/data
      - ./scripts/init-db.sql:/docker-entrypoint-initdb.d/01-init.sql
      - ./backups:/backups
    networks:
      - geofence-network
    restart: always
    healthcheck:
      test: ["CMD-SHELL", "pg_isready -U ${DB_USERNAME} -d ${DB_NAME}"]
      interval: 30s
      timeout: 10s
      retries: 5

  api:
    build:
      context: .
      dockerfile: Dockerfile
    container_name: geofence-api-prod
    environment:
      DB_URL: jdbc:postgresql://postgres:5432/${DB_NAME}
      DB_USERNAME: ${DB_USERNAME}
      DB_PASSWORD: ${DB_PASSWORD}
      JWT_ENCRYPTION_KEY: ${JWT_ENCRYPTION_KEY}
      MAIL_HOST: ${MAIL_HOST}
      MAIL_PORT: ${MAIL_PORT}
      MAIL_USERNAME: ${MAIL_USERNAME}
      MAIL_PASSWORD: ${MAIL_PASSWORD}
      FRONTEND_URL: ${FRONTEND_URL}
      UPLOAD_DIR: /app/uploads
      SERVER_PORT: 8081
      SPRING_PROFILES_ACTIVE: prod
      JAVA_OPTS: "-Xms1g -Xmx2g -XX:+UseG1GC"
    ports:
      - "8081:8081"
    volumes:
      - uploads_prod_data:/app/uploads
      - ./logs:/app/logs
    networks:
      - geofence-network
    depends_on:
      postgres:
        condition: service_healthy
    restart: always

  # Reverse proxy Nginx (optionnel)
  nginx:
    image: nginx:alpine
    container_name: geofence-nginx
    ports:
      - "80:80"
      - "443:443"
    volumes:
      - ./nginx/nginx.conf:/etc/nginx/nginx.conf
      - ./nginx/ssl:/etc/nginx/ssl
    networks:
      - geofence-network
    depends_on:
      - api
    restart: always
    profiles:
      - nginx

volumes:
  postgres_prod_data:
  uploads_prod_data:

networks:
  geofence-network:
    driver: bridge

```

*Lignes: 80*

---

### 📄 docker-compose.yml

```yaml
# docker-compose.yml

services:
  # Base de données PostgreSQL + PostGIS
  postgres:
    image: postgis/postgis:15-3.4
    container_name: geofence-postgres
    environment:
      POSTGRES_DB: geofence_db
      POSTGRES_USER: postgres
      POSTGRES_PASSWORD: postgres123
      POSTGRES_INITDB_ARGS: "--encoding=UTF8 --locale=C"
    ports:
      - "5432:5432"
    volumes:
      - postgres_data:/var/lib/postgresql/data
      - ./scripts/init-db.sql:/docker-entrypoint-initdb.d/01-init.sql
    networks:
      - geofence-network
    restart: unless-stopped
    healthcheck:
      test: ["CMD-SHELL", "pg_isready -U postgres -d geofence_db"]
      interval: 10s
      timeout: 5s
      retries: 5

  # Application Spring Boot
  api:
    build:
      context: .
      dockerfile: Dockerfile
    container_name: geofence-api
    environment:
      # Base de données
      DB_URL: jdbc:postgresql://postgres:5432/geofence_db
      DB_USERNAME: postgres
      DB_PASSWORD: postgres123

      # JWT
      JWT_ENCRYPTION_KEY: ${JWT_ENCRYPTION_KEY:-608f36e92dc66d97d5933f0e6371893cb4fc05b3aa8f8de64014732472303a7c}

      # Application
      FRONTEND_URL: ${FRONTEND_URL:-http://localhost:3000}
      UPLOAD_DIR: /app/uploads
      SERVER_PORT: 8081

      # Spring profiles
      SPRING_PROFILES_ACTIVE: docker
    ports:
      - "8081:8081"
    volumes:
      - uploads_data:/app/uploads
    networks:
      - geofence-network
    depends_on:
      postgres:
        condition: service_healthy
    restart: unless-stopped
    healthcheck:
      test: ["CMD", "curl", "-f", "http://localhost:8081/actuator/health"]
      interval: 30s
      timeout: 10s
      retries: 3
      start_period: 60s

  # Interface d'administration PostgreSQL (optionnel)
  pgadmin:
    image: dpage/pgadmin4:latest
    container_name: geofence-pgadmin
    environment:
      PGADMIN_DEFAULT_EMAIL: admin@geofence.com
      PGADMIN_DEFAULT_PASSWORD: admin123
      PGADMIN_CONFIG_SERVER_MODE: 'False'
    ports:
      - "5050:80"
    networks:
      - geofence-network
    depends_on:
      - postgres
    restart: unless-stopped
    profiles:
      - tools

volumes:
  postgres_data:
    driver: local
  uploads_data:
    driver: local

networks:
  geofence-network:
    driver: bridge

```

*Lignes: 93*

---

### 📄 DOCKER.md

```markdown
# 🐳 Docker Setup pour Geofence API

## Quick Start

1. **Configuration**:
   ```bash
   cp .env.docker.example .env.docker
   # Éditez .env.docker avec vos paramètres
   ```

2. **Démarrage développement**:
   ```bash
   ./scripts/start.sh
   ```

3. **Accès**:
   - API: http://localhost:8081
   - Docs: http://localhost:8081/api/v1/docs/index.html
   - PgAdmin: http://localhost:5050

## Scripts disponibles

- `./scripts/start.sh` - Démarrer en développement
- `./scripts/start-prod.sh` - Démarrer en production
- `./scripts/stop.sh` - Arrêter tous les services
- `./scripts/clean.sh` - Nettoyer complètement

## Commandes utiles

```bash
# Voir les logs
docker-compose logs -f api

# Entrer dans le conteneur
docker-compose exec api bash

# Backup de la base
docker-compose exec postgres pg_dump -U postgres geofence_db > backup.sql

# Monitoring
docker stats
```

## Production

1. Configurez les variables d'environnement
2. Changez les mots de passe par défaut
3. Lancez: `./scripts/start-prod.sh`

⚠️ **Important**: Changez TOUJOURS `JWT_ENCRYPTION_KEY` et `DB_PASSWORD` en production !

```

*Lignes: 51*

---

### 📄 docs\api-templates\requests\geofence\circle-create.json

```json
{
  "type": "circle",
  "title": "Zone Bureau",
  "description": "Périmètre autorisé autour du bureau",
  "center": { "coordinates": [3.8667, 11.5167] },
  "radius": 500.0,

  "isTemporalEnabled": true,
  "startTime": "08:00",
  "endTime": "18:00",
  "activeDays": ["MON","TUE","WED","THU","FRI"],

  "isConditionalEnabled": true,
  "maxSpeed": 80.0,
  "maxDwellTime": 3600,
  "minDwellTime": 60
}
```

*Lignes: 17*

---

### 📄 docs\api-templates\requests\geofence\create-invite-link.json

```json
{
  "geofenceId": "123e4567-e89b-12d3-a456-426614174000",
  "geofenceType": "c",
  "expiresAt": "2025-12-31T23:59:59",
  "canEdit": true,
  "maxUses": 5
}
```

*Lignes: 7*

---

### 📄 docs\api-templates\requests\geofence\curl-user-requests.txt

```text
# Geofence API — Exemples curl (utilisateur `user`)

creation
{
  "type": "polygon",
  "title": "Zone Entrepôt - Test",
  "description": "Zone polygonale de test",
  "isTemporalEnabled": false,
  "isConditionalEnabled": true,
  "startTime": null,
  "endTime": null,
  "polygon": {
    "type": "Polygon",
    "coordinates": [
      [[3.866, 11.516], [3.867, 11.516], [3.867, 11.517], [3.866, 11.517], [3.866, 11.516]]
    ]
  }
}

Base : {{API_URL}} (ex. http://localhost:8080)
Header d'authentification : Authorization: Bearer {{TOKEN}}

---
1) Récupérer toutes mes géofences
GET /api/geofence

curl -s -X GET "{{API_URL}}/geofence" \
  -H "Authorization: Bearer {{TOKEN}}" \
  -H "Accept: application/json"

---
2) Récupérer mes zones circulaires
GET /api/geofence/circles

curl -s -X GET "{{API_URL}}/geofence/circles" \
  -H "Authorization: Bearer {{TOKEN}}" \
  -H "Accept: application/json"

---
3) Récupérer mes zones polygonales
GET /api/geofence/polygons

curl -s -X GET "{{API_URL}}/geofence/polygons" \
  -H "Authorization: Bearer {{TOKEN}}" \
  -H "Accept: application/json"

---
4) Récupérer une géofence (par type + id)
GET /api/geofence/{type}/{zoneId}
- {type} = "c" pour circle, "p" pour polygon

# Exemple (récupérer un cercle)
curl -s -X GET "{{API_URL}}/geofence/c/123e4567-e89b-12d3-a456-426614174000" \
  -H "Authorization: Bearer {{TOKEN}}" \
  -H "Accept: application/json"

---
5) Modifier une géofence
PUT /api/geofence/{type}/{zoneId}
- envoie uniquement les champs à modifier (partial update via DTO supporté)

# Exemple (modifier un cercle)
curl -s -X PUT "{{API_URL}}/geofence/c/123e4567-e89b-12d3-a456-426614174000" \
  -H "Authorization: Bearer {{TOKEN}}" \
  -H "Content-Type: application/json" \
  -d '{
    "title": "Zone Bureau - MAJ",
    "description": "Nouvelle description",
    "isConditionalEnabled": true,
    "radius": 400.0
  }'

# Exemple (modifier un polygone)
curl -s -X PUT "{{API_URL}}/geofence/p/456e7890-e89b-12d3-a456-426614174001" \
  -H "Authorization: Bearer {{TOKEN}}" \
  -H "Content-Type: application/json" \
  -d '{
    "title": "Zone Entrepôt - MAJ",
    "polygon": {
      "type": "Polygon",
      "coordinates": [ [[3.866, 11.516],[3.867, 11.516],[3.867,11.517],[3.866,11.517],[3.866,11.516]]] 
    },
    "isTemporalEnabled": true
  }'

---
6) Supprimer une géofence
DELETE /api/geofence/{type}/{zoneId}

curl -s -X DELETE "{{API_URL}}/geofence/c/123e4567-e89b-12d3-a456-426614174000" \
  -H "Authorization: Bearer {{TOKEN}}"

---
7) Récupérer toutes mes alertes (paginated)
GET /api/alerts?page=0&size=20

curl -s -X GET "{{API_URL}}/alerts?page=0&size=20" \
  -H "Authorization: Bearer {{TOKEN}}" \
  -H "Accept: application/json"

---
Notes rapides:
- Toujours envoyer les booléens comme le DTO attend: ex. "isConditionalEnabled" et "isTemporalEnabled" (camelCase avec le préfixe "is").
- Coordonnées: [longitude, latitude]
- Codes de réponse usuels: 200 (OK), 201 (Created), 204 (No Content pour DELETE), 400/401/403/404/500 selon cas.

Tester rapidement (exécution non interactive):
- Pour debug 401: vérifier le token via /auth/verify-user ou relancer /auth/login
- Pour debug 400/500: coller le JSON envoyé et vérifier les champs obligatoires (center+radius pour circle, polygon.coordinates pour polygon)

Fichier créé pour usage direct dans Postman / script shell.

```

*Lignes: 112*

---

### 📄 docs\api-templates\requests\geofence\fork-geofence.json

```json
{
  "geofenceId": "123e4567-e89b-12d3-a456-426614174000",
  "geofenceType": "c",             
  "newTitle": "Ma Zone Bureau (fork)",
  "newDescription": "Adaptée pour la livraison nocturne",
  "forkReason": "Besoin d'un rayon différent et horaire spécifique"
}
```

*Lignes: 7*

---

### 📄 docs\api-templates\requests\geofence\polygon-create.json

```json
{
  "type": "polygon",
  "title": "Zone Entrepôt",
  "description": "Aire de stockage — accès restreint",
  "polygon": {
    "coordinates": [
      [
        [3.8660, 11.5160],
        [3.8670, 11.5160],
        [3.8670, 11.5170],
        [3.8660, 11.5170],
        [3.8660, 11.5160]
      ]
    ]
  },

  "isTemporalEnabled": false,
  "startTime": null,
  "endTime": null,
  "activeDays": null,

  "isConditionalEnabled": true,
  "maxSpeed": 20.0,
  "maxDwellTime": 7200,
  "minDwellTime": 30
}
```

*Lignes: 26*

---

### 📄 docs\api-templates\requests\geofence\share-geofence.json

```json
{
  "targetUserId": "456e7890-e89b-12d3-a456-426614174001",
  "expiresAt": "2026-12-31T23:59:59",
  "canEdit": false
}
```

*Lignes: 5*

---

### 📄 docs\api-templates\requests\location\location-update.json

```json
{
  "latitude": 11.5167,
  "longitude": 3.8667,
  "speed": 45.5,
  "heading": 120.0,
  "altitude": 350.0,
  "accuracy": 5.0,
  "source": "gps-tracker-01"
}
```

*Lignes: 9*

---

### 📄 docs\api-templates\requests\README.md

```markdown
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

```

*Lignes: 56*

---

### 📄 docs\api-templates\requests\route\route-create.json

```json
{
  "name": "Trajet Centre -> Entrepôt",
  "description": "Itinéraire standard pour livraisons matinales",
  "startPoint": { "coordinates": [3.8600, 11.5100] },
  "startAddress": "Centre-ville, 1 Rue Principale",
  "endPoint": { "coordinates": [3.8700, 11.5200] },
  "endAddress": "Entrepôt Sud",
  "estimatedDistance": 12000.0,
  "estimatedDuration": 1800,
  "deviationTolerance": 250.0,

  "isTemporalEnabled": true,
  "startTime": "06:00",
  "endTime": "10:00",
  "activeDays": ["MON","TUE","WED","THU","FRI"],

  "authorizedSegments": [
    {
      "name": "Segment A",
      "description": "Route via pont",
      "pathLine": { "coordinates": [[3.861,11.511],[3.862,11.512],[3.863,11.513]] },
      "segmentOrder": 1,
      "segmentType": "MAIN",
      "priority": 10,
      "speedLimit": 50.0,
      "estimatedTime": 600,
      "isActive": true
    }
  ],

  "isActive": true
}
```

*Lignes: 32*

---

### 📄 docs\api-templates\requests\route\route-segment-create.json

```json
{
  "name": "Segment A",
  "description": "Branche principale",
  "pathLine": { "coordinates": [[3.861,11.511],[3.862,11.512],[3.863,11.513]] },
  "segmentOrder": 1,
  "segmentType": "MAIN",
  "priority": 5,
  "speedLimit": 60.0,
  "estimatedTime": 600,
  "isActive": true
}
```

*Lignes: 11*

---

### 📄 docs\api-templates\requests\user\update-user-role.json

```json
{
  "role": "MANAGER"
}
```

*Lignes: 3*

---

### 📄 docs\api-templates\requests\vehicle\vehicle-create.json

```json
{
  "brand": "Toyota",
  "model": "Hilux 2020",
  "licensePlate": "AB-123-CD",
  "description": "Véhicule de livraison — zone nord",
  "geofenceZoneIds": [
    "123e4567-e89b-12d3-a456-426614174000",
    "456e7890-e89b-12d3-a456-426614174001"
  ]
}
```

*Lignes: 10*

---

### 📄 footer.md

```markdown
---

## Support

For technical support or questions about this API:

- **Email**: support@geofence-api.com
- **Documentation**: [Full API Docs](http://localhost:8081/api-docs)
- **GitHub**: [Source Code](https://github.com/your-org/geofence-api)

## Rate Limits

- **Standard**: 1000 requests per hour
- **Premium**: 10000 requests per hour

---

© 2025 Geofence Management API. All rights reserved.
```

*Lignes: 18*

---

### 📄 gitlab-ci\build.gitlab-ci.yml

```yaml
build:
  stage: build
  tags: [yowyob]
  script:
    - mvn $MAVEN_CLI_OPTS compile
```

*Lignes: 5*

---

### 📄 gitlab-ci\ci_settings.xml

```xml
<settings xmlns="http://maven.apache.org/SETTINGS/1.1.0" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
  xsi:schemaLocation="http://maven.apache.org/SETTINGS/1.1.0 http://maven.apache.org/xsd/settings-1.1.0.xsd">
  <servers>
    <server>
      <id>gitlab-maven</id>
      <username>${CI_INC_GROUP_DEPLOY_USER}</username>
      <password>${CI_INC_GROUP_DEPLOY_TOKEN}</password>
      <configuration>
        <authenticationInfo>
          <userName>${CI_INC_GROUP_DEPLOY_USER}</userName>
          <password>${CI_INC_GROUP_DEPLOY_TOKEN}</password>
        </authenticationInfo>
        <httpHeaders>
          <property>
            <name>${CI_INC_GROUP_DEPLOY_USER}</name>
            <value>${CI_INC_GROUP_DEPLOY_TOKEN}</value>
          </property>
        </httpHeaders>
      </configuration>
    </server>
  </servers>
</settings>
```

*Lignes: 22*

---

### 📄 gitlab-ci\deploy.gitlab-ci.yml

```yaml
deploy:
  stage: deploy
  tags: [yowyob-cmd]
  dependencies:
    - docker-build
  before_script:
    - echo "$CI_REGISTRY_PASSWORD" | docker login "$CI_REGISTRY" -u "$CI_REGISTRY_USER" --password-stdin
  script:
    - docker pull "$IMAGE_TAG" || true
    - docker stack deploy -c docker/docker-compose-stack.yml "$SERVICE_STACK_NAME" --with-registry-auth
  rules:
    - if: '$CI_COMMIT_REF_NAME == "master"'
      variables:
        DEPLOYMENT_ENVIRONMENT: "production"
        ENVIRONMENT: "production"
    - when: always


```

*Lignes: 18*

---

### 📄 gitlab-ci\docker-build.gitlab-ci.yml

```yaml
docker-build:
  stage: docker-build
  tags: [yowyob-cmd]
  dependencies:
    - package
  script:
    - echo "Deploying to $SPRING_PROFILES_ACTIVE environment..."
    - echo "$CI_REGISTRY_PASSWORD" | docker login $CI_REGISTRY -u "$CI_REGISTRY_USER" --password-stdin
    - docker rmi "$IMAGE_TAG" || true
    - >-
      docker buildx build .
      --file docker/Dockerfile
      --no-cache
      --build-arg JAVA_OPTS="$JAVA_OPTS"
      --build-arg SPRING_PROFILES_ACTIVE="$SPRING_PROFILES_ACTIVE"
      --build-arg POSTGRES_GEOFENCE_URL="$POSTGRES_GEOFENCE_URL"
      --build-arg POSTGRES_USER="$POSTGRES_USER"
      --build-arg POSTGRES_PASSWORD="$POSTGRES_PASSWORD"
      --tag $IMAGE_TAG
      --push
    - docker image prune --force
    - echo "Deployment complete"
  rules:
    - if: '$CI_COMMIT_REF_NAME == "master"'
      variables:
        SPRING_PROFILES_ACTIVE: "production"
```

*Lignes: 26*

---

### 📄 gitlab-ci\general.gitlab-ci.yml

```yaml
variables:
  ENV_NAME: $CI_COMMIT_BRANCH
  GIT_STRATEGY: clone
  GIT_SUBMODULE_STRATEGY: recursive
  SPRING_PROFILES_ACTIVE: production
  MAVEN_OPTS: >-
    -Dmaven.repo.local=.m2/repository
  MAVEN_CLI_OPTS: >-
    -DskipTests
    -s gitlab-ci/ci_settings.xml

before_script:
  - |
    echo "Attempting to remove packages with groupId $REMOVE_GROUP_ID from Maven cache"
    if [ -d ".m2/repository/${REMOVE_GROUP_ID//./\/}" ]; then
      find .m2/repository/${REMOVE_GROUP_ID//./\/} -type d -exec rm -rf {} + 2>/dev/null || true
      echo "Packages removed successfully"
    else
      echo "Directory .m2/repository/${REMOVE_GROUP_ID//./\/} not found. Nothing to remove."
    fi
 

image: maven:latest
cache:
  paths:
    - .m2/repository

stages:
  - build
  - package
  - docker-build
  - deploy
```

*Lignes: 32*

---

### 📄 gitlab-ci\package.gitlab-ci.yml

```yaml
package:
  stage: package
  tags: [yowyob]
  dependencies:
    - build
  script:
    - mvn $MAVEN_CLI_OPTS clean compile install
    - mvn $MAVEN_CLI_OPTS deploy -DretryFailedDeploymentCount=3
  artifacts:
    paths:
      - target/*.jar
  only:
    - master
    - dev
```

*Lignes: 14*

---

### 📄 GUIDE_DEPLOIEMENT.md

```markdown
# Guide de Déploiement - Geofence Reactive

## Prérequis

### 1. Installation de PostgreSQL

```bash
# Mise à jour des paquets
sudo apt update

# Installation de PostgreSQL
sudo apt install postgresql postgresql-contrib
```

### 2. Installation de PostGIS

```bash
# Installation de PostGIS pour PostgreSQL
sudo apt install postgis postgresql-postgis
```

## Configuration de la Base de Données

### 1. Connexion à PostgreSQL

```bash
# Se connecter à PostgreSQL en tant qu'utilisateur postgres
sudo -u postgres psql
```

### 2. Création de la Base de Données

```sql
-- Créer une nouvelle base de données
CREATE DATABASE geofence_db;

-- Créer un utilisateur pour l'application
CREATE USER geofence_user WITH PASSWORD 'votre_mot_de_passe';

-- Accorder les privilèges sur la base de données
GRANT ALL PRIVILEGES ON DATABASE geofence_db TO geofence_user;

-- Se connecter à la base de données
\c geofence_db;

-- Activer l'extension PostGIS
CREATE EXTENSION POSTGIS;

-- Vérifier l'installation de PostGIS
SELECT PostGIS_Version();
```

### 3. Quitter PostgreSQL

```sql
\q
```

## Configuration Spring Boot

### 1. Configuration application.properties

```properties
# Configuration de la base de données PostgreSQL
spring.datasource.url=jdbc:postgresql://localhost:5432/geofence_db
spring.datasource.username=geofence_user
spring.datasource.password=votre_mot_de_passe
spring.datasource.driver-class-name=org.postgresql.Driver

# Configuration JPA/Hibernate
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.format_sql=true
spring.jpa.database-platform=org.hibernate.spatial.dialect.postgis.PostgisPG95Dialect

# Configuration des logs
logging.level.org.hibernate.SQL=DEBUG
logging.level.org.hibernate.type.descriptor.sql.BasicBinder=TRACE
```

### 2. Dépendances nécessaires (pom.xml)

Assurez-vous d'avoir ces dépendances dans votre `pom.xml` :

```xml
<dependencies>
    <!-- Spring Boot Starter Data JPA -->
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-data-jpa</artifactId>
    </dependency>
    
    <!-- PostgreSQL Driver -->
    <dependency>
        <groupId>org.postgresql</groupId>
        <artifactId>postgresql</artifactId>
        <scope>runtime</scope>
    </dependency>
    
    <!-- Hibernate Spatial pour PostGIS -->
    <dependency>
        <groupId>org.hibernate</groupId>
        <artifactId>hibernate-spatial</artifactId>
    </dependency>
</dependencies>
```

## Lancement de l'Application

### 1. Compilation et exécution

```bash
# Compilation du projet
mvn clean compile

# Lancement de l'application
mvn spring-boot:run
```

### 2. Vérification

- L'application devrait démarrer sur `http://localhost:8081`
- Vérifiez les logs pour confirmer la connexion à la base de données
- Les tables devraient être créées automatiquement grâce à `spring.jpa.hibernate.ddl-auto=update`

## Commandes Utiles

### PostgreSQL

```bash
# Redémarrer PostgreSQL
sudo systemctl restart postgresql

# Vérifier le statut
sudo systemctl status postgresql

# Se connecter à une base spécifique
psql -h localhost -U geofence_user -d geofence_db
```

### PostGIS

```sql
-- Vérifier les extensions installées
SELECT * FROM pg_extension;

-- Lister les fonctions PostGIS disponibles
SELECT proname FROM pg_proc WHERE proname LIKE 'st_%';
```

## Troubleshooting

### Problèmes courants

1. **Erreur de connexion** : Vérifiez que PostgreSQL est démarré et que les credentials sont corrects
2. **Extension PostGIS manquante** : Assurez-vous que PostGIS est installé et activé dans la base
3. **Port occupé** : Changez le port dans `application.properties` si nécessaire

### Logs à vérifier

- Logs de PostgreSQL : `/var/log/postgresql/`
- Logs Spring Boot : Console de l'application
```

*Lignes: 162*

---

### 📄 header.md

```markdown
# Welcome to Geofence Management API

This API provides comprehensive geofencing capabilities for vehicle tracking and management.

## Quick Start

1. Obtain your API key from the authentication endpoint
2. Include the Bearer token in all requests
3. Base URL: `http://localhost:8080/api`

## Authentication

All endpoints require a JWT Bearer token in the Authorization header:
```

*Lignes: 13*

---

### 📄 pom.xml

```xml
<?xml version="1.0" encoding="UTF-8"?>
<project xmlns="http://maven.apache.org/POM/4.0.0" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
	xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 https://maven.apache.org/xsd/maven-4.0.0.xsd">
	<modelVersion>4.0.0</modelVersion>
	<parent>
		<groupId>org.springframework.boot</groupId>
		<artifactId>spring-boot-starter-parent</artifactId>
		<version>3.4.3</version>
		<relativePath/> <!-- lookup parent from repository -->
	</parent>
	<groupId>inc.yowyob</groupId>
	<artifactId>geofence</artifactId>
	<version>0.0.1-SNAPSHOT</version>
	<name>geofence-service</name>
	<description>geofence api poject</description>
	<url/>
	<licenses>
		<license/>
	</licenses>
	<developers>
		<developer/>
	</developers>
	<scm>
		<connection/>
		<developerConnection/>
		<tag/>
		<url/>
	</scm>
	<properties>
		<java.version>21</java.version>
		<project.build.sourceEncoding>UTF-8</project.build.sourceEncoding>
		<project.reporting.outputEncoding>UTF-8</project.reporting.outputEncoding>
		<maven.compiler.encoding>UTF-8</maven.compiler.encoding>
	</properties>
	<dependencies>

		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-data-jpa</artifactId>
		</dependency>
		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-security</artifactId>
		</dependency>
		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-actuator</artifactId>
		</dependency>
		<dependency>
			<groupId>io.micrometer</groupId>
			<artifactId>micrometer-registry-prometheus</artifactId>
		</dependency>
		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-websocket</artifactId>
		</dependency>
		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-webflux</artifactId>
			<exclusions>
				<exclusion>
					<groupId>org.springframework.boot</groupId>
					<artifactId>spring-boot-starter-tomcat</artifactId>
				</exclusion>
			</exclusions>
		</dependency>

		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-devtools</artifactId>
			<scope>runtime</scope>
			<optional>true</optional>
		</dependency>
		<!-- LIQUIBASE (Migration DB) -->
		<dependency>
			<groupId>org.liquibase</groupId>
			<artifactId>liquibase-core</artifactId>
		</dependency>
		<dependency>
			<groupId>org.postgresql</groupId>
			<artifactId>postgresql</artifactId>
			<version>42.7.7</version> <!-- Force une version sans faille connue -->
			<scope>runtime</scope>
		</dependency>
		<dependency>
			<groupId>org.projectlombok</groupId>
			<artifactId>lombok</artifactId>
			<optional>true</optional>
		</dependency>
		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-test</artifactId>
			<scope>test</scope>
		</dependency>
		<dependency>
			<groupId>org.springframework.security</groupId>
			<artifactId>spring-security-test</artifactId>
			<scope>test</scope>
		</dependency>
		<dependency>
			<groupId>com.auth0</groupId>
			<artifactId>java-jwt</artifactId>
			<version>4.4.0</version>
		</dependency>
		<dependency>
			<groupId>io.jsonwebtoken</groupId>
			<artifactId>jjwt-api</artifactId>
			<version>0.11.5</version>
		</dependency>
		<dependency>
			<groupId>io.jsonwebtoken</groupId>
			<artifactId>jjwt-impl</artifactId>
			<version>0.11.5</version>
		</dependency>
		<dependency>
			<groupId>io.jsonwebtoken</groupId>
			<artifactId>jjwt-jackson</artifactId>
			<version>0.11.5</version>
		</dependency>
		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-validation</artifactId>
		</dependency>

		<dependency>
			<groupId>org.hibernate</groupId>
			<artifactId>hibernate-spatial</artifactId>
			<version>6.6.8.Final</version>
		</dependency>

		<dependency>
			<groupId>org.geolatte</groupId>
			<artifactId>geolatte-geom</artifactId>
			<version>1.9.0</version>
		</dependency>


		<dependency>
			<groupId>org.ugeojson</groupId>
			<artifactId>ugeojson-parser</artifactId>
			<version>0.0.1-SNAPSHOT</version>
			<scope>system</scope>
			<systemPath>${project.basedir}/lib/ugeojson-parser-0.0.1-SNAPSHOT.jar</systemPath>
		</dependency>

		<dependency>
			<groupId>org.ugeojson</groupId>
			<artifactId>ugeojson-builder</artifactId>
			<version>0.0.1-SNAPSHOT</version>
			<scope>system</scope>
			<systemPath>${project.basedir}/lib/ugeojson-builder-0.0.1-SNAPSHOT.jar</systemPath>
		</dependency>

		<dependency>
			<groupId>org.ugeojson</groupId>
			<artifactId>ugeojson-math</artifactId>
			<version>0.0.1-SNAPSHOT</version>
			<scope>system</scope>
			<systemPath>${project.basedir}/lib/ugeojson-math-0.0.1-SNAPSHOT.jar</systemPath>
		</dependency>

		<dependency>
			<groupId>org.postgis</groupId>
			<artifactId>postgis-jdbc</artifactId>
			<version>1.3.3</version>
		</dependency>

		<dependency>
			<groupId>io.github.cdimascio</groupId>
			<artifactId>dotenv-java</artifactId>
			<version>3.0.0</version>
		</dependency>
	</dependencies>

	<build>
		<plugins>
			<plugin>
				<groupId>org.springframework.boot</groupId>
				<artifactId>spring-boot-maven-plugin</artifactId>
				<configuration>
					<excludes>
						<exclude>
							<groupId>org.projectlombok</groupId>
							<artifactId>lombok</artifactId>
						</exclude>
					</excludes>
				</configuration>
			</plugin>
			<plugin>
				<groupId>org.springframework.boot</groupId>
				<artifactId>spring-boot-maven-plugin</artifactId>
				<configuration>
					<mainClass>ink.yowyob.geofence.GeofenceApplication</mainClass>
				</configuration>
			</plugin>
		</plugins>
	</build>
</project>

```

*Lignes: 199*

---

### 📄 README.md

```markdown
# 🌍 Geofence API 

Un système complet de géofencing en temps réel pour le suivi et la gestion de véhicules avec zones géographiques personnalisables. (test)

![Java](https://img.shields.io/badge/Java-21-orange)
![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3.4.3-green)
![PostgreSQL](https://img.shields.io/badge/PostgreSQL-PostGIS-blue)
![License](https://img.shields.io/badge/License-MIT-yellow)

## 📋 Table des matières

- [Aperçu](#aperçu)
- [Fonctionnalités](#fonctionnalités)
- [Architecture technique](#architecture-technique)
- [Installation](#installation)
- [Configuration](#configuration)
- [API Documentation](#api-documentation)
- [Utilisation](#utilisation)
- [Développement](#développement)
- [Déploiement](#déploiement)
- [Contribution](#contribution)

## 🎯 Aperçu

**Geofence API** est une solution backend complète pour la gestion de zones géographiques (géofences) et le suivi de véhicules en temps réel. Elle permet aux utilisateurs de créer des zones de surveillance, recevoir des alertes automatiques, et partager des géofences avec d'autres utilisateurs.

### Cas d'usage

- 🚚 **Logistique** : Suivi de flotte avec alertes d'entrée/sortie de zones
- 🏢 **Entreprises** : Surveillance de véhicules d'entreprise
- 👨‍👩‍👧‍👦 **Familial** : Suivi sécurisé de véhicules familiaux
- 🏗️ **Chantiers** : Surveillance d'équipements mobiles
- 🚌 **Transport public** : Gestion de zones de service

## ✨ Fonctionnalités

### 🔐 Authentification & Autorisation
- Authentification JWT avec refresh tokens
- Système de rôles (USER, MANAGER, ADMIN)
- Login via username, email ou téléphone
- Gestion sécurisée des sessions

### 🚗 Gestion des véhicules
- CRUD complet des véhicules
- Upload et gestion d'images
- Génération d'API keys pour devices mobiles
- Association avec zones de géofence

### 🗺️ Géofencing avancé
- **Zones circulaires** : Centre + rayon
- **Zones polygonales** : Formes complexes
- **Fork de géofences** : Copie et modification de zones existantes
- **Partage collaboratif** : Invitation et permissions

### 📍 Suivi de position
- API publique pour mise à jour depuis devices
- Historique complet des positions
- Calcul automatique des entrées/sorties de zones
- Support de métadonnées (vitesse, direction, altitude)

### 🚨 Système d'alertes
- Alertes temps réel (WebSocket)
- Types : ZONE_ENTER, ZONE_EXIT, SPEED_LIMIT, BATTERY_LOW
- Notifications push et email
- Historique des alertes

### 🤝 Collaboration
- **Partage de géofences** avec permissions
- **Liens d'invitation** publics avec expiration
- **Système d'approbation** pour invitations
- Gestion des droits d'édition

### 📊 Analytics & Reporting
- Statistiques utilisateur et système
- Métriques par véhicule
- Rapports d'activité
- Dashboard administrateur

## 🏗️ Architecture technique

### Stack technologique

**Backend**
- **Framework** : Spring Boot 3.4.3 (WebFlux - Réactif)
- **Sécurité** : Spring Security avec JWT
- **Base de données** : PostgreSQL + PostGIS (données géographiques)
- **ORM** : Hibernate Spatial
- **Validation** : Spring Validation
- **Mail** : Spring Mail
- **WebSocket** : Spring WebSocket (STOMP)

**Géospatial**
- **PostGIS** : Extensions géographiques PostgreSQL
- **JTS Topology Suite** : Calculs géométriques
- **Hibernate Spatial** : Mapping objet-spatial

**Infrastructure**
- **Serveur** : Netty (réactif)
- **CORS** : Configuration WebFlux
- **Documentation** : ApiDoc intégrée
- **Environment** : Dotenv pour variables

### Architecture réactive

```
Client Request → WebFlux Router → Service Layer → Repository → PostgreSQL
                      ↓
                 WebSocket → Real-time Alerts
```

## 🚀 Installation

### Prérequis

- **Java 21+**
- **Maven 3.6+**
- **PostgreSQL 12+** avec **PostGIS 3.0+**
- **Git**

### 1. Cloner le projet

```bash
git clone https://github.com/votre-username/geofence-api.git
cd geofence-api
```

### 2. Configuration de la base de données

```sql
-- Créer la base de données
CREATE DATABASE geofence_db;

-- Activer PostGIS
\c geofence_db;
CREATE EXTENSION postgis;
CREATE EXTENSION postgis_topology;
```

### 3. Variables d'environnement

```bash
# Copier le fichier d'exemple
cp .env.example .env
```

Éditez `.env` avec vos paramètres :

```env
# Database
DB_URL=jdbc:postgresql://localhost:5432/geofence_db
DB_USERNAME=postgres
DB_PASSWORD=votre_mot_de_passe

# JWT
JWT_ENCRYPTION_KEY=votre_cle_jwt_securisee_64_caracteres

# Mail (Gmail exemple)
MAIL_HOST=smtp.gmail.com
MAIL_PORT=587
MAIL_USERNAME=votre_email@gmail.com
MAIL_PASSWORD=votre_app_password

# Application
FRONTEND_URL=http://localhost:3000
UPLOAD_DIR=./uploads
SERVER_PORT=8080
```

### 4. Installation et démarrage

```bash
# Installer les dépendances
mvn clean install

# Démarrer l'application
mvn spring-boot:run
```

L'API sera disponible sur `http://localhost:8080`

## ⚙️ Configuration

### Variables d'environnement

| Variable | Description | Valeur par défaut |
|----------|-------------|-------------------|
| `DB_URL` | URL de la base PostgreSQL | `jdbc:postgresql://localhost:5432/geofence_db` |
| `DB_USERNAME` | Nom d'utilisateur BDD | `postgres` |
| `DB_PASSWORD` | Mot de passe BDD | - |
| `JWT_ENCRYPTION_KEY` | Clé de chiffrement JWT | - |
| `MAIL_HOST` | Serveur SMTP | `smtp.gmail.com` |
| `MAIL_PORT` | Port SMTP | `587` |
| `MAIL_USERNAME` | Email d'envoi | - |
| `MAIL_PASSWORD` | Mot de passe email | - |
| `FRONTEND_URL` | URL du frontend | `http://localhost:3000` |
| `UPLOAD_DIR` | Dossier d'upload | `./uploads` |
| `SERVER_PORT` | Port du serveur | `8080` |

### Configuration Gmail

Pour utiliser Gmail comme serveur SMTP :

1. Activez la **2FA** sur votre compte Gmail
2. Générez un **mot de passe d'application**
3. Utilisez ce mot de passe dans `MAIL_PASSWORD`

## 📚 API Documentation

### Accès à la documentation

- **URL** : `http://localhost:8080/api/v1/docs/index.html`
- **Format** : Documentation interactive avec exemples
- **Authentification** : Incluez le token JWT dans l'en-tête `Authorization: Bearer <token>`

### Endpoints principaux

#### Authentification
```http
POST /api/auth/register    # Inscription
POST /api/auth/login       # Connexion
GET  /api/auth/verify-user # Vérification token
```

#### Géofences
```http
GET    /api/geofence                    # Mes géofences
POST   /api/geofence                    # Créer géofence
GET    /api/geofence/{type}/{id}        # Détails géofence
PUT    /api/geofence/{type}/{id}        # Modifier géofence
DELETE /api/geofence/{type}/{id}        # Supprimer géofence
```

#### Véhicules
```http
GET    /api/vehicle           # Mes véhicules
POST   /api/vehicle           # Créer véhicule (avec image)
GET    /api/vehicle/{id}      # Détails véhicule
PUT    /api/vehicle/{id}      # Modifier véhicule
DELETE /api/vehicle/{id}      # Supprimer véhicule
```

#### Positions (API publique)
```http
POST /api/public/location/update  # Mise à jour position (API Key)
GET  /api/location/vehicle/{id}/history  # Historique
GET  /api/location/vehicle/{id}/latest   # Dernière position
```

## 🔧 Utilisation

### 1. Créer un compte

```bash
curl -X POST http://localhost:8080/api/auth/register \
  -H "Content-Type: application/json" \
  -d '{
    "firstname": "John",
    "lastname": "Doe",
    "username": "johndoe",
    "email": "john@example.com",
    "phoneNumber": "+1234567890",
    "password": "SecurePass123!",
    "password_confirmation": "SecurePass123!",
    "DOB": "1990-01-01"
  }'
```

### 2. Se connecter

```bash
curl -X POST http://localhost:8080/api/auth/login \
  -H "Content-Type: application/json" \
  -d '{
    "type": "username",
    "username": "johndoe",
    "password": "SecurePass123!"
  }'
```

### 3. Créer une géofence circulaire

```bash
curl -X POST http://localhost:8080/api/geofence \
  -H "Authorization: Bearer YOUR_JWT_TOKEN" \
  -H "Content-Type: application/json" \
  -d '{
    "type": "circle",
    "title": "Zone Bureau",
    "description": "Périmètre autorisé",
    "center": {
      "coordinates": [3.8667, 11.5167]
    },
    "radius": 500.0
  }'
```

### 4. Créer un véhicule

```bash
curl -X POST http://localhost:8080/api/vehicle \
  -H "Authorization: Bearer YOUR_JWT_TOKEN" \
  -F 'vehicle={"brand":"Toyota","model":"Camry","licensePlate":"AB-123-CD"};type=application/json' \
  -F 'image=@vehicle_photo.jpg'
```

### 5. Mise à jour de position depuis un device

```bash
curl -X POST http://localhost:8080/api/public/location/update \
  -H "X-API-Key: YOUR_VEHICLE_API_KEY" \
  -H "Content-Type: application/json" \
  -d '{
    "latitude": 11.5167,
    "longitude": 3.8667,
    "speed": 45.5,
    "heading": 180.0
  }'
```

## 👨‍💻 Développement

### Structure du projet

```
src/
├── main/java/com/reseau/geofence/
│   ├── auth/                 # Authentification
│   ├── config/              # Configurations
│   ├── controller/          # Contrôleurs REST
│   ├── dto/                 # Objects de transfert
│   ├── exception/           # Gestion d'erreurs
│   ├── mapper/              # Mappers DTO/Entity
│   ├── model/               # Entités JPA
│   ├── repository/          # Repositories JPA
│   ├── security/            # Sécurité JWT
│   └── service/             # Services métier
├── main/resources/
│   ├── application.properties
│   └── static/docs/         # Documentation API
└── lib/                     # Dépendances locales
```

### Démarrage en mode développement

```bash
# Avec rechargement automatique
mvn spring-boot:run -Dspring-boot.run.jvmArguments="-Dspring.profiles.active=dev"

# Avec debug
mvn spring-boot:run -Dspring-boot.run.jvmArguments="-Xdebug -Xrunjdwp:transport=dt_socket,server=y,suspend=n,address=5005"
```

### Tests

```bash
# Tests unitaires
mvn test

# Tests d'intégration
mvn verify

# Coverage
mvn jacoco:report
```

### Profils Spring

- **dev** : Développement local
- **test** : Tests automatisés
- **prod** : Production

## 🚀 Déploiement

### Docker

```dockerfile
FROM openjdk:21-jdk-slim

COPY target/geofence-0.0.1-SNAPSHOT.jar app.jar
COPY lib/ /app/lib/

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "/app.jar"]
```

```bash
# Build
docker build -t geofence-api .

# Run
docker run -p 8080:8080 --env-file .env geofence-api
```

### Docker Compose

```yaml
version: '3.8'
services:
  db:
    image: postgis/postgis:15-3.3
    environment:
      POSTGRES_DB: geofence_db
      POSTGRES_USER: postgres
      POSTGRES_PASSWORD: password
    ports:
      - "5432:5432"

  api:
    build: .
    ports:
      - "8080:8080"
    depends_on:
      - db
    env_file:
      - .env
```

### Production

1. **Construire le JAR**
   ```bash
   mvn clean package -Pprod
   ```

2. **Variables d'environnement de production**
   ```env
   DB_URL=jdbc:postgresql://prod-db:5432/geofence_db
   JWT_ENCRYPTION_KEY=votre_cle_production_ultra_securisee
   ```

3. **Lancement**
   ```bash
   java -jar -Dspring.profiles.active=prod target/geofence-0.0.1-SNAPSHOT.jar
   ```

## 🤝 Contribution

### Guidelines

1. **Fork** le projet
2. Créez une **branche feature** (`git checkout -b feature/AmazingFeature`)
3. **Committez** vos changements (`git commit -m 'Add some AmazingFeature'`)
4. **Push** vers la branche (`git push origin feature/AmazingFeature`)
5. Ouvrez une **Pull Request**

### Standards de code

- **Java** : Suivre les conventions Oracle
- **Commits** : Format conventionnel (`feat:`, `fix:`, `docs:`)
- **Tests** : Minimum 80% de couverture
- **Documentation** : Commenter les méthodes publiques

### Issues et bugs

Utilisez les **GitHub Issues** avec les labels appropriés :
- 🐛 `bug` : Bugs à corriger
- ✨ `enhancement` : Nouvelles fonctionnalités
- 📚 `documentation` : Améliorations de doc
- 🔧 `refactor` : Refactoring de code

## 📄 Licence

Ce projet est sous licence **MIT**. Voir le fichier [LICENSE](LICENSE) pour plus de détails.

## 📞 Support

- **Email** : support@geofence-api.com
- **Documentation** : [API Docs](http://localhost:8080/api/v1/docs/index.html)
- **Issues** : [GitHub Issues](https://github.com/votre-username/geofence-api/issues)



---

**Fait avec ❤️ par [KAMGA CHEUKO FRANKLIN DAVY]**

> 🌟 Si ce projet vous aide, n'hésitez pas à lui donner une étoile !
```

*Lignes: 478*

---

### 📄 scripts\init-db.sql

```sql
-- scripts/init-db.sql

-- Activer PostGIS
CREATE EXTENSION IF NOT EXISTS postgis;
CREATE EXTENSION IF NOT EXISTS postgis_topology;

-- Vérifier l'installation
SELECT PostGIS_Full_Version();

-- Créer des index spatiaux si nécessaire
-- (Hibernate les créera automatiquement, mais on peut les optimiser)

-- Log de confirmation
\echo 'PostGIS extensions installed successfully!';

```

*Lignes: 15*

---

### 📄 scripts\migration-geofence-intelligent.sql

```sql
-- Migration pour ajouter les fonctionnalités de géofence intelligente
-- Date: 2025-01-29

-- Ajouter les nouvelles colonnes aux tables circle_geofence_zone et polygon_geofence_zone

-- Pour circle_geofence_zone
ALTER TABLE circle_geofence_zone 
ADD COLUMN IF NOT EXISTS is_temporal_enabled BOOLEAN DEFAULT false,
ADD COLUMN IF NOT EXISTS start_time TIME,
ADD COLUMN IF NOT EXISTS end_time TIME,
ADD COLUMN IF NOT EXISTS is_conditional_enabled BOOLEAN DEFAULT false,
ADD COLUMN IF NOT EXISTS max_speed DOUBLE PRECISION,
ADD COLUMN IF NOT EXISTS max_dwell_time INTEGER,
ADD COLUMN IF NOT EXISTS min_dwell_time INTEGER,
ADD COLUMN IF NOT EXISTS created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
ADD COLUMN IF NOT EXISTS updated_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
ADD COLUMN IF NOT EXISTS is_active BOOLEAN DEFAULT true;

-- Pour polygon_geofence_zone
ALTER TABLE polygon_geofence_zone 
ADD COLUMN IF NOT EXISTS is_temporal_enabled BOOLEAN DEFAULT false,
ADD COLUMN IF NOT EXISTS start_time TIME,
ADD COLUMN IF NOT EXISTS end_time TIME,
ADD COLUMN IF NOT EXISTS is_conditional_enabled BOOLEAN DEFAULT false,
ADD COLUMN IF NOT EXISTS max_speed DOUBLE PRECISION,
ADD COLUMN IF NOT EXISTS max_dwell_time INTEGER,
ADD COLUMN IF NOT EXISTS min_dwell_time INTEGER,
ADD COLUMN IF NOT EXISTS created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
ADD COLUMN IF NOT EXISTS updated_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
ADD COLUMN IF NOT EXISTS is_active BOOLEAN DEFAULT true;

-- Créer la table pour les jours actifs (pour chaque zone)
CREATE TABLE IF NOT EXISTS geofence_active_days (
    geofence_id UUID NOT NULL,
    day_of_week VARCHAR(20) NOT NULL,
    FOREIGN KEY (geofence_id) REFERENCES circle_geofence_zone(id) ON DELETE CASCADE
);

-- Ajouter la contrainte pour polygon_geofence_zone aussi
-- Note: Dans une vraie migration, on utiliserait une approche différente pour la FK polymorphe

-- Ajouter de nouvelles colonnes à la table Alert pour les données enrichies
ALTER TABLE alert 
ADD COLUMN IF NOT EXISTS speed DOUBLE PRECISION,
ADD COLUMN IF NOT EXISTS dwell_time_minutes INTEGER,
ADD COLUMN IF NOT EXISTS is_read BOOLEAN DEFAULT false,
ADD COLUMN IF NOT EXISTS severity VARCHAR(20) DEFAULT 'INFO',
ADD COLUMN IF NOT EXISTS additional_data TEXT;

-- Mettre à jour les données existantes pour avoir des valeurs par défaut cohérentes
UPDATE circle_geofence_zone 
SET is_active = true, 
    is_temporal_enabled = false, 
    is_conditional_enabled = false,
    created_at = COALESCE(created_at, CURRENT_TIMESTAMP),
    updated_at = COALESCE(updated_at, CURRENT_TIMESTAMP)
WHERE is_active IS NULL;

UPDATE polygon_geofence_zone 
SET is_active = true, 
    is_temporal_enabled = false, 
    is_conditional_enabled = false,
    created_at = COALESCE(created_at, CURRENT_TIMESTAMP),
    updated_at = COALESCE(updated_at, CURRENT_TIMESTAMP)
WHERE is_active IS NULL;

-- Insérer les jours par défaut (tous les jours de la semaine) pour les zones existantes
INSERT INTO geofence_active_days (geofence_id, day_of_week)
SELECT id, 'MONDAY' FROM circle_geofence_zone WHERE id NOT IN (SELECT geofence_id FROM geofence_active_days);

INSERT INTO geofence_active_days (geofence_id, day_of_week)
SELECT id, 'TUESDAY' FROM circle_geofence_zone WHERE id NOT IN (SELECT geofence_id FROM geofence_active_days WHERE day_of_week = 'TUESDAY');

INSERT INTO geofence_active_days (geofence_id, day_of_week)
SELECT id, 'WEDNESDAY' FROM circle_geofence_zone WHERE id NOT IN (SELECT geofence_id FROM geofence_active_days WHERE day_of_week = 'WEDNESDAY');

INSERT INTO geofence_active_days (geofence_id, day_of_week)
SELECT id, 'THURSDAY' FROM circle_geofence_zone WHERE id NOT IN (SELECT geofence_id FROM geofence_active_days WHERE day_of_week = 'THURSDAY');

INSERT INTO geofence_active_days (geofence_id, day_of_week)
SELECT id, 'FRIDAY' FROM circle_geofence_zone WHERE id NOT IN (SELECT geofence_id FROM geofence_active_days WHERE day_of_week = 'FRIDAY');

INSERT INTO geofence_active_days (geofence_id, day_of_week)
SELECT id, 'SATURDAY' FROM circle_geofence_zone WHERE id NOT IN (SELECT geofence_id FROM geofence_active_days WHERE day_of_week = 'SATURDAY');

INSERT INTO geofence_active_days (geofence_id, day_of_week)
SELECT id, 'SUNDAY' FROM circle_geofence_zone WHERE id NOT IN (SELECT geofence_id FROM geofence_active_days WHERE day_of_week = 'SUNDAY');

-- Log de confirmation
SELECT 'Migration des géofences intelligentes terminée!' AS status;
```

*Lignes: 90*

---

### 📄 src\main\java\ink\yowyob\geofence\auth\AuthController.java

```java
package ink.yowyob.geofence.auth;

import ink.yowyob.geofence.dto.request.AuthRequest.LoginDTO;
import ink.yowyob.geofence.dto.request.AuthRequest.RegisterDTO;
import ink.yowyob.geofence.dto.response.AuthResponse;
import ink.yowyob.geofence.dto.response.RegisterResponse;
import ink.yowyob.geofence.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.ReactiveSecurityContextHolder;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;
import reactor.core.scheduler.Schedulers;

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
 * @apiDefine UserObject
 * @apiSuccess {String} uuid Identifiant unique de l'utilisateur
 * @apiSuccess {String} username Nom d'utilisateur
 * @apiSuccess {String} firstname Prénom
 * @apiSuccess {String} lastname Nom de famille
 * @apiSuccess {String} phoneNumber Numéro de téléphone
 * @apiSuccess {String} email Adresse email
 * @apiSuccess {String} DOB Date de naissance (YYYY-MM-DD)
 * @apiSuccess {String="USER","MANAGER","ADMIN"} Role Rôle de l'utilisateur
 */

@RestController
@RequestMapping("/api/auth")
@RequiredArgsConstructor
public class AuthController {
    private final AuthService authService;
    private final UserRepository userRepository;

    /**
     * @api {post} /auth/register Inscription
     * @apiName Register
     * @apiGroup Authentication
     * @apiVersion 1.0.0
     * @apiDescription Créer un nouveau compte utilisateur
     *
     * @apiBody {String{2-50}} firstname Prénom (requis)
     * @apiBody {String{2-50}} lastname Nom de famille (requis)
     * @apiBody {String{3-30}} username Nom d'utilisateur unique (requis)
     * @apiBody {String} phoneNumber Numéro de téléphone unique (requis)
     * @apiBody {String} email Adresse email valide unique (requis)
     * @apiBody {String{8-}} password Mot de passe (min 8 caractères, 1 majuscule, 1 minuscule, 1 chiffre, 1 caractère spécial) (requis)
     * @apiBody {String} password_confirmation Confirmation du mot de passe (requis)
     * @apiBody {String} DOB Date de naissance au format YYYY-MM-DD (requis)
     *
     * @apiParamExample {json} Request-Example:
     *     {
     *       "firstname": "Jean",
     *       "lastname": "Dupont",
     *       "username": "jeandupont",
     *       "phoneNumber": "+237123456789",
     *       "email": "jean.dupont@example.com",
     *       "password": "MonMotDePasse123!",
     *       "password_confirmation": "MonMotDePasse123!",
     *       "DOB": "1990-01-15"
     *     }
     *
     * @apiSuccess (201) {Boolean} success Succès de l'inscription
     * @apiSuccess (201) {String} message Message de confirmation
     * @apiSuccess (201) {Object} user Données de l'utilisateur créé
     * @apiUse UserObject
     *
     * @apiSuccessExample {json} Success-Response:
     *     HTTP/1.1 201 Created
     *     {
     *       "success": true,
     *       "message": "utilisateur enregistrer avec succes",
     *       "user": {
     *         "uuid": "123e4567-e89b-12d3-a456-426614174000",
     *         "username": "jeandupont",
     *         "firstname": "Jean",
     *         "lastname": "Dupont",
     *         "phoneNumber": "+237123456789",
     *         "email": "jean.dupont@example.com",
     *         "DOB": "1990-01-15",
     *         "Role": "USER"
     *       }
     *     }
     *
     * @apiError (Error 409) Conflict Utilisateur déjà existant
     * @apiError (Error 400) BadRequest Mots de passe non identiques ou données invalides
     * @apiUse ErrorResponse
     */
    @PostMapping("/register")
    public Mono<ResponseEntity<RegisterResponse>> register(@RequestBody RegisterDTO registerDTO) {
        return Mono.fromCallable(() -> authService.register(registerDTO))
                .subscribeOn(Schedulers.boundedElastic())
                .map(result -> ResponseEntity.status(201).body(result));
    }

    /**
     * @api {post} /auth/login Connexion
     * @apiName Login
     * @apiGroup Authentication
     * @apiVersion 1.0.0
     * @apiDescription Authentifier un utilisateur avec nom d'utilisateur/email/téléphone et mot de passe
     *
     * @apiBody {String="username","email","phone"} type Type d'authentification (requis)
     * @apiBody {String} [username] Nom d'utilisateur (si type="username")
     * @apiBody {String} [email] Adresse email (si type="email")
     * @apiBody {String} [phoneNumber] Numéro de téléphone (si type="phone")
     * @apiBody {String} password Mot de passe (requis)
     *
     * @apiParamExample {json} Request-Example (Username):
     *     {
     *       "type": "username",
     *       "username": "jeandupont",
     *       "password": "MonMotDePasse123!"
     *     }
     *
     * @apiParamExample {json} Request-Example (Email):
     *     {
     *       "type": "email",
     *       "email": "jean.dupont@example.com",
     *       "password": "MonMotDePasse123!"
     *     }
     *
     * @apiParamExample {json} Request-Example (Phone):
     *     {
     *       "type": "phone",
     *       "phoneNumber": "+237123456789",
     *       "password": "MonMotDePasse123!"
     *     }
     *
     * @apiSuccess {Object} userDTO Données de l'utilisateur
     * @apiSuccess {String} token Token JWT d'authentification
     * @apiUse UserObject
     *
     * @apiSuccessExample {json} Success-Response:
     *     HTTP/1.1 200 OK
     *     {
     *       "userDTO": {
     *         "uuid": "123e4567-e89b-12d3-a456-426614174000",
     *         "username": "jeandupont",
     *         "firstname": "Jean",
     *         "lastname": "Dupont",
     *         "phoneNumber": "+237123456789",
     *         "email": "jean.dupont@example.com",
     *         "DOB": "1990-01-15",
     *         "Role": "USER"
     *       },
     *       "token": "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9..."
     *     }
     *
     * @apiError (Error 401) Unauthorized Identifiants invalides
     * @apiError (Error 400) BadRequest Type d'authentification invalide ou données manquantes
     * @apiUse ErrorResponse
     */
    @PostMapping("/login")
    public Mono<ResponseEntity<AuthResponse>> login(@RequestBody LoginDTO loginDTO) {
        return Mono.fromCallable(() -> authService.login(loginDTO))
                .subscribeOn(Schedulers.boundedElastic())
                .map(ResponseEntity::ok);
    }

    /**
     * @api {get} /auth/verify-user Vérifier l'utilisateur
     * @apiName VerifyUser
     * @apiGroup Authentication
     * @apiVersion 1.0.0
     * @apiDescription Récupérer les informations de l'utilisateur connecté et générer un nouveau token
     *
     * @apiUse UserPermission
     *
     * @apiSuccess {Object} userDTO Données de l'utilisateur
     * @apiSuccess {String} token Nouveau token JWT
     *
     * @apiSuccessExample {json} Success-Response:
     *     HTTP/1.1 200 OK
     *     {
     *       "userDTO": {
     *         "uuid": "123e4567-e89b-12d3-a456-426614174000",
     *         "username": "jeandupont",
     *         "firstname": "Jean",
     *         "lastname": "Dupont",
     *         "phoneNumber": "+237123456789",
     *         "email": "jean.dupont@example.com",
     *         "DOB": "1990-01-15",
     *         "Role": "USER"
     *       },
     *       "token": "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9..."
     *     }
     *
     * @apiError (Error 401) Unauthorized Token invalide ou expiré
     * @apiError (Error 404) NotFound Utilisateur non trouvé
     * @apiUse ErrorResponse
     */
    @GetMapping("/verify-user")
    public Mono<ResponseEntity<AuthResponse>> getCurrentUser() {
        return ReactiveSecurityContextHolder.getContext()
                .map(SecurityContext::getAuthentication)
                .map(Authentication::getName)
                .flatMap(username -> Mono.fromCallable(() -> {
                            var user = userRepository.findByUsername(username)
                                    .orElseThrow(() -> new RuntimeException("Utilisateur non trouvé"));
                    return authService.getCurrentUser(user);
                }))
                .subscribeOn(Schedulers.boundedElastic())
                .map(ResponseEntity::ok);
    }
}
```

*Lignes: 249*

---

### 📄 src\main\java\ink\yowyob\geofence\auth\AuthService.java

```java
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

```

*Lignes: 18*

---

### 📄 src\main\java\ink\yowyob\geofence\auth\AuthServiceImpl.java

```java
package ink.yowyob.geofence.auth;

import ink.yowyob.geofence.Enum.UserRole;
import ink.yowyob.geofence.dto.request.AuthRequest.*;
import ink.yowyob.geofence.dto.response.AuthResponse;
import ink.yowyob.geofence.dto.response.RegisterResponse;
import ink.yowyob.geofence.dto.response.UserDTO;
import ink.yowyob.geofence.exception.BadCredentialsException;
import ink.yowyob.geofence.exception.PasswordMismatchException;
import ink.yowyob.geofence.exception.UserAlreadyExistsException;
import ink.yowyob.geofence.model.Role;
import ink.yowyob.geofence.model.User;
import ink.yowyob.geofence.repository.RoleRepository;
import ink.yowyob.geofence.repository.UserRepository;
import ink.yowyob.geofence.security.JwtService;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Objects;
import java.util.Optional;

@Service
@Transactional
@RequiredArgsConstructor
public class AuthServiceImpl implements AuthService {

    private static final Logger log = LoggerFactory.getLogger(AuthServiceImpl.class);
    private final UserRepository userRepository;
    private final BCryptPasswordEncoder passwordEncoder;
    private final RoleRepository roleRepository;
    private final JwtService jwtService;

    @Override
    public RegisterResponse register(RegisterDTO registerDTO) {
        Optional<User> user = this.userRepository.findByEmailOrPhoneNumberOrUsername(registerDTO.email(),registerDTO.phoneNumber(), registerDTO.username());

        if (user.isPresent()) {
            User existingUser = user.get();
            if (existingUser.getEmail().equals(registerDTO.email())) {
                throw new UserAlreadyExistsException("Un utilisateur avec cet email existe déjà.");
            } else if (existingUser.getPhoneNumber().equals(registerDTO.phoneNumber())) {
                throw new UserAlreadyExistsException("Un utilisateur avec ce numéro de téléphone existe déjà.");
            } else if (existingUser.getUsername().equals(registerDTO.username())) {
                throw new UserAlreadyExistsException("Un utilisateur avec ce nom d'utilisateur existe déjà.");
            }
        }

        if(!Objects.equals(registerDTO.password_confirmation(), registerDTO.password())) {
            throw new PasswordMismatchException();
        }

        User newUser = new User();
        newUser.setUsername(registerDTO.username());
        newUser.setEmail(registerDTO.email());
        newUser.setPhoneNumber(registerDTO.phoneNumber());
        newUser.setPassword(this.passwordEncoder.encode(registerDTO.password()));
        newUser.setDOB(registerDTO.DOB());
        newUser.setFirstname(registerDTO.firstname());
        newUser.setLastname(registerDTO.lastname());

        Role userRole = roleRepository.findByName(UserRole.USER)
                .orElseGet(() -> {
                    Role newRole = new Role();
                    newRole.setName(UserRole.USER);
                    return roleRepository.save(newRole);
                });
        newUser.setRole(userRole);
        newUser.setEnabled(true); // Activé par défaut pour simplifier

        User saveUser = userRepository.save(newUser);
        return new RegisterResponse(
                true,
                "utilisateur enregistrer avec succes",
                new UserDTO(
                        saveUser.getUuid(),
                        saveUser.getUsername(),
                        saveUser.getFirstname(),
                        saveUser.getLastname(),
                        saveUser.getPhoneNumber(),
                        saveUser.getEmail(),
                        saveUser.getDOB(),
                        saveUser.getRole().getName()
                )
        );
    }

    @Override
    public AuthResponse login(LoginDTO loginDTO) {
        User user;
        switch (loginDTO) {
            case LoginUsernameDTO loginUsernameDTO -> user = loginUsername(loginUsernameDTO);
            case LoginEmailDTO loginEmailDTO -> user = loginEmail(loginEmailDTO);
            case LoginPhoneNumberDTO loginPhoneNumberDTO -> user = loginPhone(loginPhoneNumberDTO);
            case null, default -> throw new BadCredentialsException("the provided information are not good verify it and try again");
        }

        String token = jwtService.generate(user.getUsername()).get("bearer");

        return new AuthResponse(
                new UserDTO(
                        user.getUuid(),
                        user.getUsername(),
                        user.getFirstname(),
                        user.getLastname(),
                        user.getPhoneNumber(),
                        user.getEmail(),
                        user.getDOB(),
                        user.getRole().getName()
                ),
                token);
    }

    @Override
    public User loginEmail(LoginEmailDTO loginEmailDTO) {
        Optional<User> user = userRepository.findByEmail(loginEmailDTO.email());

        if (user.isEmpty() || !this.passwordEncoder.matches(loginEmailDTO.password(), user.get().getPassword())) {
            throw new BadCredentialsException("the provided information are not good verify it and try again");
        }
        return user.get();
    }

    @Override
    public User loginUsername(LoginUsernameDTO loginUsernameDTO) {
        Optional<User> user = userRepository.findByUsername(loginUsernameDTO.username());

        if (user.isEmpty() || !this.passwordEncoder.matches(loginUsernameDTO.password(), user.get().getPassword())) {
            throw new BadCredentialsException("the provided information are not good verify it and try again");
        }
        return user.get();
    }

    @Override
    public User loginPhone(LoginPhoneNumberDTO loginPhoneNumberDTO) {
        Optional<User> user = userRepository.findByPhoneNumber(loginPhoneNumberDTO.phoneNumber());

        if (user.isEmpty() || !this.passwordEncoder.matches(loginPhoneNumberDTO.password(), user.get().getPassword())) {
            throw new BadCredentialsException("the provided information are not good verify it and try again");
        }
        return user.get();
    }

    @Override
    public AuthResponse getCurrentUser(User user) {
        // Récupérer le nom d'utilisateur depuis le contexte de sécurité
//        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
//        String username = authentication.getName();
//
//        // Charger l'utilisateur complet depuis la base de données
//        User user = userRepository.findByUsername(username)
//                .orElseThrow(() -> new UsernameNotFoundException("Utilisateur non trouvé"));

        // Générer un nouveau token JWT
        String token = jwtService.generate(user.getUsername()).get("bearer");

        // Créer et retourner la réponse contenant les détails utilisateur et le nouveau token
        return new AuthResponse(
                new UserDTO(
                        user.getUuid(),
                        user.getUsername(),
                        user.getFirstname(),
                        user.getLastname(),
                        user.getPhoneNumber(),
                        user.getEmail(),
                        user.getDOB(),
                        user.getRole().getName()
                ),
                token
        );
    }
}
```

*Lignes: 175*

---

### 📄 src\main\java\ink\yowyob\geofence\components\RoleInitializer.java

```java
package ink.yowyob.geofence.components;

import ink.yowyob.geofence.Enum.UserRole;
import ink.yowyob.geofence.model.Role;
import ink.yowyob.geofence.repository.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class RoleInitializer implements CommandLineRunner {

    @Autowired
    private RoleRepository roleRepository;

    @Override
    public void run(String... args) throws Exception {
        // Vérifier si le rôle UTILISATEUR existe déjà
        if (roleRepository.findByName(UserRole.USER).isEmpty()) {
            Role userRole = new Role();
            userRole.setName(UserRole.USER);
            roleRepository.save(userRole);
        }

        if (roleRepository.findByName(UserRole.ADMIN).isEmpty()) {
            Role userRole1 = new Role();
            userRole1.setName(UserRole.ADMIN);
            roleRepository.save(userRole1);
        }

        if (roleRepository.findByName(UserRole.MANAGER).isEmpty()) {
            Role userRole1 = new Role();
            userRole1.setName(UserRole.MANAGER);
            roleRepository.save(userRole1);
        }
    }
}

```

*Lignes: 38*

---

### 📄 src\main\java\ink\yowyob\geofence\config\JwtConfig.java

```java
package ink.yowyob.geofence.config;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Getter
@Configuration
public class JwtConfig {

    @Value("${jwt.encryption.key}")
    private String encryptionKey;

}


```

*Lignes: 16*

---

### 📄 src\main\java\ink\yowyob\geofence\config\WebFluxConfig.java

```java
package ink.yowyob.geofence.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.config.ResourceHandlerRegistry;
import org.springframework.web.reactive.config.WebFluxConfigurer;

@Configuration
public class WebFluxConfig implements WebFluxConfigurer {

    @Value("${file.upload-dir:./uploads}")
    private String uploadDir;

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        // Uploads
        registry.addResourceHandler("/uploads/**")
                .addResourceLocations("file:" + uploadDir + "/");

        // Documentation
        registry.addResourceHandler("/api/v1/docs/**")
                .addResourceLocations("classpath:/static/docs/", "classpath:/static/api/v1/docs/", "file:docs/")
                .setCacheControl(org.springframework.http.CacheControl.noCache());

        registry.addResourceHandler("/docs/**")
                .addResourceLocations("classpath:/static/docs/", "classpath:/static/api/v1/docs/", "file:docs/")
                .setCacheControl(org.springframework.http.CacheControl.noCache());
    }
}
```

*Lignes: 29*

---

### 📄 src\main\java\ink\yowyob\geofence\config\WebSocketConfig.java

```java
package ink.yowyob.geofence.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.messaging.simp.config.MessageBrokerRegistry;
import org.springframework.web.socket.config.annotation.EnableWebSocketMessageBroker;
import org.springframework.web.socket.config.annotation.StompEndpointRegistry;
import org.springframework.web.socket.config.annotation.WebSocketMessageBrokerConfigurer;

@Configuration
@EnableWebSocketMessageBroker
public class WebSocketConfig implements WebSocketMessageBrokerConfigurer {

    @Override
    public void registerStompEndpoints(StompEndpointRegistry registry) {
        registry.addEndpoint("/ws")
                .setAllowedOriginPatterns("*")
                .withSockJS();
    }

    @Override
    public void configureMessageBroker(MessageBrokerRegistry registry) {
        registry.enableSimpleBroker("/topic", "/queue");
        registry.setApplicationDestinationPrefixes("/app");
        registry.setUserDestinationPrefix("/user");
    }
}
```

*Lignes: 26*

---

### 📄 src\main\java\ink\yowyob\geofence\controller\advice\ApplicationControllerAdvice.java

```java
package ink.yowyob.geofence.controller.advice;

import ink.yowyob.geofence.dto.response.ErrorEntity;
import ink.yowyob.geofence.exception.BadCredentialsException;
import ink.yowyob.geofence.exception.PasswordMismatchException;
import ink.yowyob.geofence.exception.UserAlreadyExistsException;
import io.jsonwebtoken.ExpiredJwtException;
import org.springframework.http.HttpStatus;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.web.bind.annotation.*;

@RestControllerAdvice
public class ApplicationControllerAdvice {

    @ResponseStatus(HttpStatus.CONFLICT)
    @ExceptionHandler({UserAlreadyExistsException.class})
    public @ResponseBody ErrorEntity handleException(UserAlreadyExistsException exception) {
        return new ErrorEntity(HttpStatus.CONFLICT.value(), exception.getMessage());
    }

    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler({PasswordMismatchException.class})
    public @ResponseBody ErrorEntity handleException(PasswordMismatchException exception) {
        return new ErrorEntity(HttpStatus.BAD_REQUEST.value(), exception.getMessage());
    }

    @ResponseStatus(HttpStatus.UNAUTHORIZED)
    @ExceptionHandler({BadCredentialsException.class})
    public @ResponseBody ErrorEntity handleException(BadCredentialsException exception) {
        return new ErrorEntity(HttpStatus.BAD_REQUEST.value(), exception.getMessage());
    }

    @ResponseStatus(HttpStatus.NOT_FOUND)
    @ExceptionHandler({UsernameNotFoundException.class})
    public @ResponseBody ErrorEntity handleException(UsernameNotFoundException exception) {
        return new ErrorEntity(HttpStatus.NOT_FOUND.value(), exception.getMessage());
    }

    @ResponseStatus(HttpStatus.FORBIDDEN)
    @ExceptionHandler({ExpiredJwtException.class})
    public @ResponseBody ErrorEntity handleException(ExpiredJwtException exception) {
        return new ErrorEntity(HttpStatus.FORBIDDEN.value(), exception.getMessage());
    }

}

```

*Lignes: 46*

---

### 📄 src\main\java\ink\yowyob\geofence\controller\AlertController.java

```java
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
```

*Lignes: 195*

---

### 📄 src\main\java\ink\yowyob\geofence\controller\DashboardController.java

```java
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
```

*Lignes: 39*

---

### 📄 src\main\java\ink\yowyob\geofence\controller\DocumentationController.java

```java
package ink.yowyob.geofence.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;
import java.net.URI;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

@RestController
public class DocumentationController {

    @GetMapping("/")
    public Mono<ResponseEntity<Void>> redirectRoot() {
        return Mono.just(ResponseEntity.status(HttpStatus.FOUND)
                .location(URI.create("/api/v1/docs/index.html"))
                .build());
    }

    @GetMapping("/api")
    public Mono<ResponseEntity<Void>> redirectApi() {
        return Mono.just(ResponseEntity.status(HttpStatus.FOUND)
                .location(URI.create("/api/v1/docs/index.html"))
                .build());
    }

    @GetMapping("/api/v1/docs")
    public Mono<ResponseEntity<Void>> redirectDocs() {
        return Mono.just(ResponseEntity.status(HttpStatus.FOUND)
                .location(URI.create("/api/v1/docs/index.html"))
                .build());
    }
}
```

*Lignes: 33*

---

### 📄 src\main\java\ink\yowyob\geofence\controller\GeofenceController.java

```java
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

```

*Lignes: 434*

---

### 📄 src\main\java\ink\yowyob\geofence\controller\GeofenceForkController.java

```java
package ink.yowyob.geofence.controller;

import ink.yowyob.geofence.dto.request.ForkGeofenceRequest;
import ink.yowyob.geofence.dto.response.GeofenceForkDTO;
import ink.yowyob.geofence.dto.response.GeofenceForkInfoDTO;
import ink.yowyob.geofence.dto.response.GeofenceForkListResponse;
import ink.yowyob.geofence.dto.response.GeofenceWithForkInfoDTO;
import ink.yowyob.geofence.repository.UserRepository;
import ink.yowyob.geofence.service.GeofenceForkService;
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

@RestController
@RequestMapping("/api/geofence/fork")
@RequiredArgsConstructor
public class GeofenceForkController {

    private final GeofenceForkService forkService;
    private final UserRepository userRepository;

    /**
     * @api {post} /geofence/fork Créer un fork de géofence
     * @apiName ForkGeofence
     * @apiGroup Geofence Fork
     * @apiVersion 1.0.0
     * @apiDescription Créer une copie (fork) d'une géofence existante
     *
     * @apiUse UserPermission
     *
     * @apiBody {String} geofenceId Identifiant de la géofence à forker (requis)
     * @apiBody {String="c","p"} geofenceType Type de géofence (requis)
     * @apiBody {String{1-100}} newTitle Nouveau titre pour le fork (requis)
     * @apiBody {String{0-500}} [newDescription] Nouvelle description
     * @apiBody {String{0-500}} [forkReason] Raison du fork
     *
     * @apiParamExample {json} Request-Example:
     *     {
     *       "geofenceId": "123e4567-e89b-12d3-a456-426614174000",
     *       "geofenceType": "c",
     *       "newTitle": "Ma Zone Bureau",
     *       "newDescription": "Version personnalisée de la zone bureau",
     *       "forkReason": "Adaptation aux besoins spécifiques"
     *     }
     *
     * @apiSuccess {String} id Identifiant du fork
     * @apiSuccess {Object} originalGeofence Géofence originale
     * @apiSuccess {Object} forkedGeofence Nouvelle géofence créée
     * @apiSuccess {Object} forkedBy Utilisateur ayant créé le fork
     * @apiSuccess {String} forkedAt Date de création du fork
     * @apiSuccess {String} [forkReason] Raison du fork
     *
     * @apiSuccessExample {json} Success-Response:
     *     HTTP/1.1 200 OK
     *     {
     *       "id": "789e0123-e89b-12d3-a456-426614174002",
     *       "originalGeofence": {
     *         "id": "123e4567-e89b-12d3-a456-426614174000",
     *         "title": "Zone Bureau",
     *         "type": "circle"
     *       },
     *       "forkedGeofence": {
     *         "id": "456e7890-e89b-12d3-a456-426614174001",
     *         "title": "Ma Zone Bureau",
     *         "type": "circle"
     *       },
     *       "forkedBy": {
     *         "username": "mariemartin"
     *       },
     *       "forkedAt": "2024-01-08T10:30:00Z",
     *       "forkReason": "Adaptation aux besoins spécifiques"
     *     }
     *
     * @apiError (Error 404) NotFound Géofence non trouvée
     * @apiError (Error 403) Forbidden Accès refusé à cette géofence
     * @apiUse ErrorResponse
     */
    @PostMapping
    @PreAuthorize("hasRole('USER')")
    public Mono<ResponseEntity<GeofenceForkDTO>> forkGeofence(@Valid @RequestBody ForkGeofenceRequest request) {
        return ReactiveSecurityContextHolder.getContext()
                .map(SecurityContext::getAuthentication)
                .map(Authentication::getName)
                .flatMap(username -> Mono.fromCallable(() -> {
                    var user = userRepository.findByUsername(username)
                            .orElseThrow(() -> new RuntimeException("Utilisateur non trouvé"));
                            return forkService.forkGeofence(request, user);
                        }
                ))
                .subscribeOn(Schedulers.boundedElastic())
                .map(ResponseEntity::ok);
    }

    /**
     * @api {get} /geofence/fork/of/:geofenceId Forks d'une géofence
     * @apiName GetForksOfGeofence
     * @apiGroup Geofence Fork
     * @apiVersion 1.0.0
     * @apiDescription Récupère tous les forks d'une géofence spécifique
     *
     * @apiUse UserPermission
     *
     * @apiParam (Path) {String} geofenceId Identifiant de la géofence originale
     *
     * @apiSuccess {Object[]} forks Liste des forks
     * @apiSuccess {Number} totalItems Nombre total de forks
     *
     * @apiUse ErrorResponse
     */
    @GetMapping("/of/{geofenceId}")
    @PreAuthorize("hasRole('USER')")
    public Mono<ResponseEntity<GeofenceForkListResponse>> getForksOfGeofence(@PathVariable UUID geofenceId) {
        return Mono.fromCallable(() -> forkService.getForksOfGeofence(geofenceId))
                .subscribeOn(Schedulers.boundedElastic())
                .map(ResponseEntity::ok);
    }

    /**
     * @api {get} /geofence/fork/my-forks Mes forks
     * @apiName GetMyForks
     * @apiGroup Geofence Fork
     * @apiVersion 1.0.0
     * @apiDescription Récupère tous les forks créés par l'utilisateur connecté
     *
     * @apiUse UserPermission
     *
     * @apiSuccess {Object[]} forks Liste des forks créés
     * @apiSuccess {Number} totalItems Nombre total de forks
     *
     * @apiUse ErrorResponse
     */
    @GetMapping("/my-forks")
    @PreAuthorize("hasRole('USER')")
    public Mono<ResponseEntity<GeofenceForkListResponse>> getMyForks() {
        return ReactiveSecurityContextHolder.getContext()
                .map(SecurityContext::getAuthentication)
                .map(Authentication::getName)
                .flatMap(username -> Mono.fromCallable(() -> {
                    var user = userRepository.findByUsername(username)
                            .orElseThrow(() -> new RuntimeException("Utilisateur non trouvé"));
                    return forkService.getMyForks(user);
                }))
                .subscribeOn(Schedulers.boundedElastic())
                .map(ResponseEntity::ok);
    }

    /**
     * @api {get} /geofence/fork/info/:geofenceId/:geofenceType Informations de fork
     * @apiName GetForkInfo
     * @apiGroup Geofence Fork
     * @apiVersion 1.0.0
     * @apiDescription Récupère les informations de fork d'une géofence (si c'est un fork)
     *
     * @apiUse UserPermission
     *
     * @apiParam (Path) {String} geofenceId Identifiant de la géofence
     * @apiParam (Path) {String="c","p"} geofenceType Type de géofence
     *
     * @apiSuccess {String} originalId Identifiant de la géofence originale
     * @apiSuccess {String} originalTitle Titre de la géofence originale
     * @apiSuccess {Object} originalOwner Propriétaire original
     * @apiSuccess {String} forkedAt Date de création du fork
     * @apiSuccess {String} [forkReason] Raison du fork
     *
     * @apiError (Error 404) NotFound Géofence non trouvée ou n'est pas un fork
     * @apiUse ErrorResponse
     */
    @GetMapping("/info/{geofenceId}/{geofenceType}")
    @PreAuthorize("hasRole('USER')")
    public Mono<ResponseEntity<GeofenceForkInfoDTO>> getForkInfo(
            @PathVariable UUID geofenceId,
            @PathVariable String geofenceType) {
        return Mono.fromCallable(() -> forkService.getForkInfo(geofenceId, geofenceType))
                .subscribeOn(Schedulers.boundedElastic())
                .map(forkInfo -> {
                    if (forkInfo == null) {
                        return ResponseEntity.notFound().<GeofenceForkInfoDTO>build();
                    }
                    return ResponseEntity.ok(forkInfo);
                });
    }

    /**
     * @api {get} /geofence/fork/details/:geofenceId/:geofenceType Détails avec info fork
     * @apiName GetGeofenceWithForkInfo
     * @apiGroup Geofence Fork
     * @apiVersion 1.0.0
     * @apiDescription Récupère les détails d'une géofence avec ses informations de fork
     *
     * @apiUse UserPermission
     *
     * @apiParam (Path) {String} geofenceId Identifiant de la géofence
     * @apiParam (Path) {String="c","p"} geofenceType Type de géofence
     *
     * @apiSuccess {String} id Identifiant de la géofence
     * @apiSuccess {String} title Titre de la géofence
     * @apiSuccess {String} [description] Description
     * @apiSuccess {String="circle","polygon"} type Type de géofence
     * @apiSuccess {Object} owner Propriétaire
     * @apiSuccess {Boolean} isOriginal Cette géofence a des forks
     * @apiSuccess {Boolean} isFork Cette géofence est un fork
     * @apiSuccess {Object} [forkInfo] Informations du fork (si isFork=true)
     * @apiSuccess {Number} forkCount Nombre de forks de cette géofence
     *
     * @apiSuccessExample {json} Success-Response:
     *     HTTP/1.1 200 OK
     *     {
     *       "id": "123e4567-e89b-12d3-a456-426614174000",
     *       "title": "Zone Bureau",
     *       "description": "Périmètre autorisé",
     *       "type": "circle",
     *       "owner": {
     *         "username": "jeandupont"
     *       },
     *       "isOriginal": true,
     *       "isFork": false,
     *       "forkInfo": null,
     *       "forkCount": 3
     *     }
     *
     * @apiError (Error 404) NotFound Géofence non trouvée
     * @apiUse ErrorResponse
     */
    @GetMapping("/details/{geofenceId}/{geofenceType}")
    @PreAuthorize("hasRole('USER')")
    public Mono<ResponseEntity<GeofenceWithForkInfoDTO>> getGeofenceWithForkInfo(
            @PathVariable UUID geofenceId,
            @PathVariable String geofenceType) {
        return Mono.fromCallable(() -> forkService.getGeofenceWithForkInfo(geofenceId, geofenceType))
                .subscribeOn(Schedulers.boundedElastic())
                .map(ResponseEntity::ok);
    }

    /**
     * @api {delete} /geofence/fork/:forkId Supprimer un fork
     * @apiName DeleteFork
     * @apiGroup Geofence Fork
     * @apiVersion 1.0.0
     * @apiDescription Supprimer un fork et la géofence associée
     *
     * @apiUse UserPermission
     *
     * @apiParam (Path) {String} forkId Identifiant du fork
     *
     * @apiSuccessExample {json} Success-Response:
     *     HTTP/1.1 204 No Content
     *
     * @apiError (Error 404) NotFound Fork non trouvé
     * @apiError (Error 403) Forbidden Vous n'êtes pas le créateur de ce fork
     * @apiUse ErrorResponse
     */
    @DeleteMapping("/{forkId}")
    @PreAuthorize("hasRole('USER')")
    public Mono<ResponseEntity<Void>> deleteFork(@PathVariable UUID forkId) {
        return ReactiveSecurityContextHolder.getContext()
                .map(SecurityContext::getAuthentication)
                .map(Authentication::getName)
                .flatMap(username -> Mono.fromCallable(() -> {
                    var user = userRepository.findByUsername(username)
                            .orElseThrow(() -> new RuntimeException("Utilisateur non trouvé"));
                    forkService.deleteFork(forkId, user);
                    return ResponseEntity.noContent().<Void>build();
                }))
                .subscribeOn(Schedulers.boundedElastic());
    }

}
```

*Lignes: 318*

---

### 📄 src\main\java\ink\yowyob\geofence\controller\GeofenceInviteLinkController.java

```java
package ink.yowyob.geofence.controller;

import ink.yowyob.geofence.dto.request.CreateInviteLinkRequest;
import ink.yowyob.geofence.dto.response.InviteLinkDTO;
import ink.yowyob.geofence.dto.response.InviteLinkDetailsResponse;
import ink.yowyob.geofence.dto.response.InviteLinkListResponse;
import ink.yowyob.geofence.model.User;
import ink.yowyob.geofence.repository.UserRepository;
import ink.yowyob.geofence.service.GeofenceInviteLinkService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
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

@RestController
@RequestMapping("/api/geofence/invite")
@RequiredArgsConstructor
public class GeofenceInviteLinkController {

    private final GeofenceInviteLinkService inviteLinkService;
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
     * @api {post} /geofence/invite Créer un lien d'invitation
     * @apiName CreateInviteLink
     * @apiGroup Invite Links
     * @apiVersion 1.0.0
     * @apiDescription Créer un lien d'invitation pour partager une géofence publiquement
     *
     * @apiUse UserPermission
     *
     * @apiBody {String} geofenceId Identifiant de la géofence (requis)
     * @apiBody {String="c","p"} geofenceType Type de géofence (requis)
     * @apiBody {String} [expiresAt] Date d'expiration (ISO 8601)
     * @apiBody {Boolean} [canEdit=false] Autoriser la modification
     * @apiBody {Number{-1,1-}} [maxUses=-1] Nombre max d'utilisations (-1 = illimité)
     *
     * @apiParamExample {json} Request-Example:
     *     {
     *       "geofenceId": "123e4567-e89b-12d3-a456-426614174000",
     *       "geofenceType": "c",
     *       "expiresAt": "2024-12-31T23:59:59Z",
     *       "canEdit": false,
     *       "maxUses": 10
     *     }
     *
     * @apiSuccess {String} id Identifiant du lien
     * @apiSuccess {String} inviteCode Code d'invitation (12 caractères)
     * @apiSuccess {String} geofenceId Identifiant de la géofence
     * @apiSuccess {String} geofenceType Type de géofence
     * @apiSuccess {Object} createdBy Utilisateur créateur
     * @apiSuccess {String} createdAt Date de création
     * @apiSuccess {String} [expiresAt] Date d'expiration
     * @apiSuccess {Boolean} canEdit Autorisation de modification
     * @apiSuccess {Boolean} isActive Lien actif
     * @apiSuccess {Number} maxUses Nombre max d'utilisations
     * @apiSuccess {Number} currentUses Nombre d'utilisations actuelles
     * @apiSuccess {Boolean} canBeUsed Lien utilisable
     *
     * @apiSuccessExample {json} Success-Response:
     *     HTTP/1.1 200 OK
     *     {
     *       "id": "456e7890-e89b-12d3-a456-426614174001",
     *       "inviteCode": "ABC123XYZ789",
     *       "geofenceId": "123e4567-e89b-12d3-a456-426614174000",
     *       "geofenceType": "c",
     *       "createdBy": {
     *         "username": "jeandupont"
     *       },
     *       "createdAt": "2024-01-08T10:30:00Z",
     *       "expiresAt": "2024-12-31T23:59:59Z",
     *       "canEdit": false,
     *       "isActive": true,
     *       "maxUses": 10,
     *       "currentUses": 0,
     *       "canBeUsed": true
     *     }
     *
     * @apiError (Error 404) NotFound Géofence non trouvée
     * @apiError (Error 403) Forbidden Vous n'êtes pas propriétaire de cette géofence
     * @apiUse ErrorResponse
     */
    @PostMapping
    public Mono<ResponseEntity<InviteLinkDTO>> createInviteLink(@Valid @RequestBody CreateInviteLinkRequest request) {
        return getCurrentUser()
                .flatMap(user -> Mono.fromCallable(() -> inviteLinkService.createInviteLink(request, user))
                        .subscribeOn(Schedulers.boundedElastic()))
                .map(ResponseEntity::ok);
    }

    /**
     * @api {get} /geofence/invite/:inviteCode Détails d'un lien d'invitation
     * @apiName GetInviteLinkDetails
     * @apiGroup Invite Links
     * @apiVersion 1.0.0
     * @apiDescription Récupère les détails d'un lien d'invitation (accès public)
     *
     * @apiParam (Path) {String} inviteCode Code d'invitation (12 caractères)
     *
     * @apiSuccess {Object} inviteLink Détails du lien
     * @apiSuccess {Object} geofenceZone Géofence associée
     * @apiSuccess {String} fullInviteUrl URL complète d'invitation
     *
     * @apiSuccessExample {json} Success-Response:
     *     HTTP/1.1 200 OK
     *     {
     *       "inviteLink": {
     *         "inviteCode": "ABC123XYZ789",
     *         "canEdit": false,
     *         "maxUses": 10,
     *         "currentUses": 3,
     *         "canBeUsed": true
     *       },
     *       "geofenceZone": {
     *         "id": "123e4567-e89b-12d3-a456-426614174000",
     *         "title": "Zone Bureau",
     *         "type": "circle"
     *       },
     *       "fullInviteUrl": "http://localhost:3000/invite/ABC123XYZ789"
     *     }
     *
     * @apiError (Error 404) NotFound Lien non trouvé ou expiré
     * @apiUse ErrorResponse
     */
    @GetMapping("/{inviteCode}")
    public Mono<ResponseEntity<InviteLinkDetailsResponse>> getInviteLinkDetails(@PathVariable String inviteCode) {
        return Mono.fromCallable(() -> inviteLinkService.getInviteLinkDetails(inviteCode))
                .subscribeOn(Schedulers.boundedElastic())
                .map(ResponseEntity::ok);
    }

    /**
     * @api {post} /geofence/invite/join/:inviteCode Rejoindre via invitation
     * @apiName JoinGeofenceViaInvite
     * @apiGroup Invite Links
     * @apiVersion 1.0.0
     * @apiDescription Rejoindre une géofence en utilisant un code d'invitation
     *
     * @apiUse UserPermission
     *
     * @apiParam (Path) {String} inviteCode Code d'invitation
     *
     * @apiSuccessExample {json} Success-Response:
     *     HTTP/1.1 200 OK
     *
     * @apiError (Error 404) NotFound Lien non trouvé ou expiré
     * @apiError (Error 400) BadRequest Lien non valide ou limite atteinte
     * @apiError (Error 409) Conflict Vous avez déjà accès à cette géofence
     * @apiUse ErrorResponse
     */
    @PostMapping("/join/{inviteCode}")
    public Mono<ResponseEntity<Void>> joinGeofenceViaInvite(@PathVariable String inviteCode) {
        return getCurrentUser()
                .flatMap(user -> Mono.fromCallable(() -> {
                    inviteLinkService.joinGeofenceViaInvite(inviteCode, user);
                    return ResponseEntity.ok().<Void>build();
                }).subscribeOn(Schedulers.boundedElastic()));
    }

    /**
     * @api {get} /geofence/invite/my-links Mes liens d'invitation
     * @apiName GetMyInviteLinks
     * @apiGroup Invite Links
     * @apiVersion 1.0.0
     * @apiDescription Récupère tous les liens d'invitation créés par l'utilisateur
     *
     * @apiUse UserPermission
     *
     * @apiSuccess {Object[]} inviteLinks Liste des liens d'invitation
     * @apiSuccess {Number} totalItems Nombre total de liens
     *
     * @apiUse ErrorResponse
     */
    @GetMapping("/my-links")
    public Mono<ResponseEntity<InviteLinkListResponse>> getMyInviteLinks() {
        return getCurrentUser()
                .flatMap(user -> Mono.fromCallable(() -> inviteLinkService.getMyInviteLinks(user))
                        .subscribeOn(Schedulers.boundedElastic()))
                .map(ResponseEntity::ok);
    }

    /**
     * @api {get} /geofence/invite/geofence/:geofenceId/:geofenceType Liens d'une géofence
     * @apiName GetInviteLinksForGeofence
     * @apiGroup Invite Links
     * @apiVersion 1.0.0
     * @apiDescription Récupère tous les liens d'invitation actifs pour une géofence spécifique
     *
     * @apiUse UserPermission
     *
     * @apiParam (Path) {String} geofenceId Identifiant de la géofence
     * @apiParam (Path) {String="c","p"} geofenceType Type de géofence
     *
     * @apiSuccess {Object[]} inviteLinks Liste des liens d'invitation
     * @apiSuccess {Number} totalItems Nombre total de liens
     *
     * @apiSuccessExample {json} Success-Response:
     *     HTTP/1.1 200 OK
     *     {
     *       "inviteLinks": [
     *         {
     *           "id": "456e7890-e89b-12d3-a456-426614174001",
     *           "inviteCode": "ABC123XYZ789",
     *           "canEdit": false,
     *           "maxUses": 10,
     *           "currentUses": 3,
     *           "isActive": true,
     *           "canBeUsed": true
     *         }
     *       ],
     *       "totalItems": 1
     *     }
     *
     * @apiError (Error 404) NotFound Géofence non trouvée
     * @apiError (Error 403) Forbidden Vous n'êtes pas propriétaire de cette géofence
     * @apiUse ErrorResponse
     */
    @GetMapping("/geofence/{geofenceId}/{geofenceType}")
    public Mono<ResponseEntity<InviteLinkListResponse>> getInviteLinksForGeofence(
            @PathVariable UUID geofenceId, @PathVariable String geofenceType) {
        return getCurrentUser()
                .flatMap(user -> Mono.fromCallable(() -> inviteLinkService.getInviteLinksForGeofence(geofenceId, geofenceType, user))
                        .subscribeOn(Schedulers.boundedElastic()))
                .map(ResponseEntity::ok);
    }


    /**
     * @api {put} /geofence/invite/:inviteCode/deactivate Désactiver un lien
     * @apiName DeactivateInviteLink
     * @apiGroup Invite Links
     * @apiVersion 1.0.0
     * @apiDescription Désactiver un lien d'invitation sans le supprimer
     *
     * @apiUse UserPermission
     *
     * @apiParam (Path) {String} inviteCode Code d'invitation à désactiver
     *
     * @apiSuccessExample {json} Success-Response:
     *     HTTP/1.1 200 OK
     *
     * @apiError (Error 404) NotFound Lien d'invitation non trouvé
     * @apiError (Error 403) Forbidden Vous n'êtes pas le créateur de ce lien
     * @apiUse ErrorResponse
     */
    @PutMapping("/{inviteCode}/deactivate")
    public Mono<ResponseEntity<Void>> deactivateInviteLink(@PathVariable String inviteCode) {
        return getCurrentUser()
                .flatMap(user -> Mono.fromCallable(() -> {
                    inviteLinkService.deactivateInviteLink(inviteCode, user);
                    return ResponseEntity.ok().<Void>build();
                }).subscribeOn(Schedulers.boundedElastic()));
    }

    /**
     * @api {delete} /geofence/invite/:inviteLinkId Supprimer un lien d'invitation
     * @apiName DeleteInviteLink
     * @apiGroup Invite Links
     * @apiVersion 1.0.0
     * @apiDescription Supprimer définitivement un lien d'invitation
     *
     * @apiUse UserPermission
     *
     * @apiParam (Path) {String} inviteLinkId Identifiant du lien d'invitation
     *
     * @apiSuccessExample {json} Success-Response:
     *     HTTP/1.1 204 No Content
     *
     * @apiError (Error 404) NotFound Lien d'invitation non trouvé
     * @apiError (Error 403) Forbidden Vous n'êtes pas le créateur de ce lien
     * @apiUse ErrorResponse
     */
    @DeleteMapping("/{inviteLinkId}")
    public Mono<ResponseEntity<Void>> deleteInviteLink(@PathVariable UUID inviteLinkId) {
        return getCurrentUser()
                .flatMap(user -> Mono.fromCallable(() -> {
                    inviteLinkService.deleteInviteLink(inviteLinkId, user);
                    return ResponseEntity.noContent().<Void>build();
                }).subscribeOn(Schedulers.boundedElastic()));
    }
}
```

*Lignes: 340*

---

### 📄 src\main\java\ink\yowyob\geofence\controller\GeofenceSharingController.java

```java
package ink.yowyob.geofence.controller;

import ink.yowyob.geofence.dto.request.ShareGeofenceRequest;
import ink.yowyob.geofence.dto.response.GeofenceShareDTO;
import ink.yowyob.geofence.dto.response.GeofenceShareListResponse;
import ink.yowyob.geofence.model.User;
import ink.yowyob.geofence.repository.UserRepository;
import ink.yowyob.geofence.service.Implementation.GeofenceSharingServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
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

@RestController
@RequestMapping("/api/geofence/share")
@RequiredArgsConstructor
public class GeofenceSharingController {
    private final GeofenceSharingServiceImpl geofenceSharingService;
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
     * @api {post} /geofence/share/:type/:geofenceId Partager une géofence
     * @apiName ShareGeofence
     * @apiGroup Geofence Sharing
     * @apiVersion 1.0.0
     * @apiDescription Partager une zone de géofence avec un autre utilisateur
     *
     * @apiUse UserPermission
     *
     * @apiParam (Path) {String} geofenceId Identifiant de la zone à partager
     * @apiParam (Path) {String="c","p"} type Type de zone (c=circle, p=polygon)
     *
     * @apiBody {String} targetUserId Identifiant de l'utilisateur cible (requis)
     * @apiBody {String} [expiresAt] Date d'expiration du partage (ISO 8601)
     * @apiBody {Boolean} [canEdit=false] Autoriser la modification
     *
     * @apiParamExample {json} Request-Example:
     *     {
     *       "targetUserId": "456e7890-e89b-12d3-a456-426614174001",
     *       "expiresAt": "2024-12-31T23:59:59Z",
     *       "canEdit": true
     *     }
     *
     * @apiSuccess (201) {String} id Identifiant du partage
     * @apiSuccess (201) {Object} geofenceZone Zone partagée
     * @apiSuccess (201) {Object} sharedBy Utilisateur qui partage
     * @apiSuccess (201) {Object} sharedWith Utilisateur qui reçoit
     * @apiSuccess (201) {String} sharedAt Date de partage
     * @apiSuccess (201) {String} [expiresAt] Date d'expiration
     * @apiSuccess (201) {Boolean} canEdit Autorisation de modification
     * @apiSuccess (201) {String="PENDING","ACCEPTED","REFUSED"} status Statut du partage
     *
     * @apiSuccessExample {json} Success-Response:
     *     HTTP/1.1 201 Created
     *     {
     *       "id": "789e0123-e89b-12d3-a456-426614174002",
     *       "geofenceZone": {
     *         "id": "123e4567-e89b-12d3-a456-426614174000",
     *         "title": "Zone Bureau",
     *         "type": "circle"
     *       },
     *       "sharedBy": {
     *         "uuid": "456e7890-e89b-12d3-a456-426614174001",
     *         "username": "jeandupont"
     *       },
     *       "sharedWith": {
     *         "uuid": "012e3456-e89b-12d3-a456-426614174003",
     *         "username": "mariemartin"
     *       },
     *       "sharedAt": "2024-01-08T10:30:00Z",
     *       "expiresAt": "2024-12-31T23:59:59Z",
     *       "canEdit": true,
     *       "status": "PENDING",
     *       "respondedAt": null
     *     }
     *
     * @apiError (Error 404) NotFound Zone ou utilisateur non trouvé
     * @apiError (Error 403) Forbidden Accès refusé - Vous n'êtes pas propriétaire
     * @apiUse ErrorResponse
     */
    @PostMapping("/{type}/{geofenceId}")
    public Mono<ResponseEntity<GeofenceShareDTO>> shareGeofence(
            @PathVariable UUID geofenceId, @PathVariable String type,
            @RequestBody ShareGeofenceRequest request) {
        return getCurrentUser()
                .flatMap(user -> Mono.fromCallable(() -> geofenceSharingService.shareGeofence(geofenceId, type, request, user))
                        .subscribeOn(Schedulers.boundedElastic()))
                .map(result -> ResponseEntity.status(201).body(result));
    }

    /**
     * @api {put} /geofence/share/:shareId Modifier un partage
     * @apiName UpdateGeofenceShare
     * @apiGroup Geofence Sharing
     * @apiVersion 1.0.0
     * @apiDescription Modifier les paramètres d'un partage existant
     *
     * @apiUse UserPermission
     *
     * @apiParam (Path) {String} shareId Identifiant du partage
     *
     * @apiBody {String} [targetUserId] Nouvel utilisateur cible
     * @apiBody {String} [expiresAt] Nouvelle date d'expiration (ISO 8601)
     * @apiBody {Boolean} [canEdit] Nouvelle autorisation de modification
     *
     * @apiParamExample {json} Request-Example:
     *     {
     *       "expiresAt": "2025-12-31T23:59:59Z",
     *       "canEdit": false
     *     }
     *
     * @apiSuccess {String} id Identifiant du partage
     * @apiSuccess {Object} geofenceZone Zone partagée
     * @apiSuccess {Object} sharedBy Utilisateur qui partage
     * @apiSuccess {Object} sharedWith Utilisateur qui reçoit
     * @apiSuccess {String} sharedAt Date de partage
     * @apiSuccess {String} [expiresAt] Date d'expiration
     * @apiSuccess {Boolean} canEdit Autorisation de modification
     * @apiSuccess {String="PENDING","ACCEPTED","REFUSED"} status Statut du partage
     *
     * @apiError (Error 404) NotFound Partage non trouvé
     * @apiError (Error 403) Forbidden Vous n'êtes pas le propriétaire de ce partage
     * @apiUse ErrorResponse
     */
    @PutMapping("/{shareId}")
    public Mono<ResponseEntity<GeofenceShareDTO>> updateGeofenceShare(
            @PathVariable UUID shareId, @RequestBody ShareGeofenceRequest request) {
        return getCurrentUser()
                .flatMap(user -> Mono.fromCallable(() -> geofenceSharingService.updateGeofenceShare(shareId, request, user))
                        .subscribeOn(Schedulers.boundedElastic()))
                .map(ResponseEntity::ok);
    }

    /**
     * @api {delete} /geofence/share/:shareId Supprimer un partage
     * @apiName DeleteGeofenceShare
     * @apiGroup Geofence Sharing
     * @apiVersion 1.0.0
     * @apiDescription Supprimer un partage de géofence
     *
     * @apiUse UserPermission
     *
     * @apiParam (Path) {String} shareId Identifiant du partage
     *
     * @apiSuccessExample {json} Success-Response:
     *     HTTP/1.1 204 No Content
     *
     * @apiError (Error 404) NotFound Partage non trouvé
     * @apiError (Error 403) Forbidden Vous n'êtes pas le propriétaire de ce partage
     * @apiUse ErrorResponse
     */
    @DeleteMapping("/{shareId}")
    public Mono<ResponseEntity<Void>> deleteGeofenceShare(@PathVariable UUID shareId) {
        return getCurrentUser()
                .flatMap(user -> Mono.fromCallable(() -> {
                    geofenceSharingService.deleteGeofenceShare(shareId, user);
                    return ResponseEntity.noContent().<Void>build();
                }).subscribeOn(Schedulers.boundedElastic()));
    }

    /**
     * @api {get} /geofence/share/shared-with-me Géofences partagées avec moi
     * @apiName GetSharedGeofences
     * @apiGroup Geofence Sharing
     * @apiVersion 1.0.0
     * @apiDescription Récupère les zones de géofence partagées avec l'utilisateur connecté (acceptées)
     *
     * @apiUse UserPermission
     *
     * @apiSuccess {Object[]} shares Liste des partages acceptés
     * @apiSuccess {Number} totalItems Nombre total de partages
     *
     * @apiSuccessExample {json} Success-Response:
     *     HTTP/1.1 200 OK
     *     {
     *       "shares": [
     *         {
     *           "id": "789e0123-e89b-12d3-a456-426614174002",
     *           "geofenceZone": {
     *             "id": "123e4567-e89b-12d3-a456-426614174000",
     *             "title": "Zone Bureau",
     *             "type": "circle"
     *           },
     *           "sharedBy": {
     *             "username": "jeandupont"
     *           },
     *           "status": "ACCEPTED",
     *           "canEdit": true
     *         }
     *       ],
     *       "totalItems": 1
     *     }
     *
     * @apiUse ErrorResponse
     */
    @GetMapping("/shared-with-me")
    public Mono<ResponseEntity<GeofenceShareListResponse>> getSharedGeofences() {
        return getCurrentUser()
                .flatMap(user -> Mono.fromCallable(() -> geofenceSharingService.getSharedGeofences(user))
                        .subscribeOn(Schedulers.boundedElastic()))
                .map(ResponseEntity::ok);
    }

    /**
     * @api {get} /geofence/share/my-shares Mes partages créés
     * @apiName GetMySharedGeofences
     * @apiGroup Geofence Sharing
     * @apiVersion 1.0.0
     * @apiDescription Récupère les partages de géofences créés par l'utilisateur connecté
     *
     * @apiUse UserPermission
     *
     * @apiSuccess {Object[]} shares Liste des partages créés
     * @apiSuccess {Number} totalItems Nombre total de partages
     *
     * @apiSuccessExample {json} Success-Response:
     *     HTTP/1.1 200 OK
     *     {
     *       "shares": [
     *         {
     *           "id": "789e0123-e89b-12d3-a456-426614174002",
     *           "geofenceZone": {
     *             "id": "123e4567-e89b-12d3-a456-426614174000",
     *             "title": "Zone Bureau",
     *             "type": "circle"
     *           },
     *           "sharedWith": {
     *             "username": "mariemartin"
     *           },
     *           "status": "ACCEPTED",
     *           "canEdit": true,
     *           "sharedAt": "2024-01-08T10:30:00Z"
     *         }
     *       ],
     *       "totalItems": 1
     *     }
     *
     * @apiUse ErrorResponse
     */
    @GetMapping("/my-shares")
    public Mono<ResponseEntity<GeofenceShareListResponse>> getMySharedGeofences() {
        return getCurrentUser()
                .flatMap(user -> Mono.fromCallable(() -> geofenceSharingService.getMySharedGeofences(user))
                        .subscribeOn(Schedulers.boundedElastic()))
                .map(ResponseEntity::ok);
    }

    /**
     * @api {get} /geofence/share/invitations/pending Invitations en attente
     * @apiName GetPendingInvitations
     * @apiGroup Geofence Sharing
     * @apiVersion 1.0.0
     * @apiDescription Récupère les invitations de partage en attente de réponse
     *
     * @apiUse UserPermission
     *
     * @apiSuccess {Object[]} shares Liste des invitations en attente
     * @apiSuccess {Number} totalItems Nombre total d'invitations
     *
     * @apiUse ErrorResponse
     */
    @GetMapping("/invitations/pending")
    public Mono<ResponseEntity<GeofenceShareListResponse>> getPendingInvitations() {
        return getCurrentUser()
                .flatMap(user -> Mono.fromCallable(() -> geofenceSharingService.getPendingInvitations(user))
                        .subscribeOn(Schedulers.boundedElastic()))
                .map(ResponseEntity::ok);
    }

    /**
     * @api {post} /geofence/share/invitations/:shareId/respond Répondre à une invitation
     * @apiName RespondToInvitation
     * @apiGroup Geofence Sharing
     * @apiVersion 1.0.0
     * @apiDescription Accepter ou refuser une invitation de partage
     *
     * @apiUse UserPermission
     *
     * @apiParam (Path) {String} shareId Identifiant de l'invitation
     * @apiQuery {Boolean} accept Accepter (true) ou refuser (false) l'invitation
     *
     * @apiParamExample {curl} Request-Example:
     *     curl -X POST "http://localhost:8080/api/geofence/share/invitations/789e0123-e89b-12d3-a456-426614174002/respond?accept=true" \
     *       -H "Authorization: Bearer your-jwt-token"
     *
     * @apiSuccess {Object} share Invitation mise à jour
     * @apiSuccess {String="ACCEPTED","REFUSED"} share.status Nouveau statut
     * @apiSuccess {String} share.respondedAt Date de réponse
     *
     * @apiError (Error 404) NotFound Invitation non trouvée
     * @apiError (Error 403) Forbidden Vous n'êtes pas le destinataire de cette invitation
     * @apiError (Error 400) BadRequest Invitation déjà traitée ou expirée
     * @apiUse ErrorResponse
     */
    @PostMapping("/invitations/{shareId}/respond")
    public Mono<ResponseEntity<GeofenceShareDTO>> respondToInvitation(
            @PathVariable UUID shareId, @RequestParam boolean accept) {
        return getCurrentUser()
                .flatMap(user -> Mono.fromCallable(() -> geofenceSharingService.respondToInvitation(shareId, accept, user))
                        .subscribeOn(Schedulers.boundedElastic()))
                .map(ResponseEntity::ok);
    }
}
```

*Lignes: 361*

---

### 📄 src\main\java\ink\yowyob\geofence\controller\LocationController.java

```java
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
```

*Lignes: 412*

---

### 📄 src\main\java\ink\yowyob\geofence\controller\RouteController.java

```java
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
```

*Lignes: 248*

---

### 📄 src\main\java\ink\yowyob\geofence\controller\RouteDeviationController.java

```java
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
```

*Lignes: 181*

---

### 📄 src\main\java\ink\yowyob\geofence\controller\StatisticsController.java

```java
package ink.yowyob.geofence.controller;

import ink.yowyob.geofence.dto.response.SystemStatisticsDTO;
import ink.yowyob.geofence.dto.response.UserStatisticsDTO;
import ink.yowyob.geofence.dto.response.VehicleStatisticsDTO;
import ink.yowyob.geofence.model.User;
import ink.yowyob.geofence.repository.UserRepository;
import ink.yowyob.geofence.service.Implementation.StatisticsServiceImpl;
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

@RestController
@RequestMapping("/api/statistics")
@RequiredArgsConstructor
public class StatisticsController {
    private final StatisticsServiceImpl statisticsService;
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
     * @api {get} /statistics/system Statistiques système
     * @apiName GetSystemStatistics
     * @apiGroup Statistics
     * @apiVersion 1.0.0
     * @apiDescription Récupère les statistiques globales du système (accès admin/manager)
     *
     * @apiUse ManagerPermission
     *
     * @apiSuccess {Number} totalUsers Nombre total d'utilisateurs
     * @apiSuccess {Number} totalVehicles Nombre total de véhicules
     * @apiSuccess {Number} totalGeofenceZones Nombre total de géofences
     * @apiSuccess {Number} totalAlerts Nombre total d'alertes
     * @apiSuccess {Object[]} alertsByType Répartition des alertes par type
     * @apiSuccess {String} alertsByType.type Type d'alerte
     * @apiSuccess {Number} alertsByType.count Nombre d'alertes
     * @apiSuccess {Object} alertsPerDay Alertes par jour (30 derniers jours)
     *
     * @apiSuccessExample {json} Success-Response:
     *     HTTP/1.1 200 OK
     *     {
     *       "totalUsers": 150,
     *       "totalVehicles": 89,
     *       "totalGeofenceZones": 45,
     *       "totalAlerts": 234,
     *       "alertsByType": [
     *         {"type": "ZONE_EXIT", "count": 98},
     *         {"type": "ZONE_ENTER", "count": 76},
     *         {"type": "SPEED_LIMIT", "count": 45},
     *         {"type": "BATTERY_LOW", "count": 12},
     *         {"type": "SYSTEM_ERROR", "count": 3}
     *       ],
     *       "alertsPerDay": {
     *         "2024-01-07": 12,
     *         "2024-01-08": 8
     *       }
     *     }
     *
     * @apiError (Error 403) Forbidden Accès refusé - Droits insuffisants
     * @apiUse ErrorResponse
     */
    @GetMapping("/system")
    @PreAuthorize("hasRole('ADMIN') or hasRole('MANAGER')")
    public Mono<ResponseEntity<SystemStatisticsDTO>> getSystemStatistics() {
        return getCurrentUser()
                .flatMap(user -> Mono.fromCallable(() -> statisticsService.getSystemStatistics(user))
                        .subscribeOn(Schedulers.boundedElastic()))
                .map(ResponseEntity::ok);
    }

    /**
     * @api {get} /statistics/user Mes statistiques
     * @apiName GetUserStatistics
     * @apiGroup Statistics
     * @apiVersion 1.0.0
     * @apiDescription Récupère les statistiques de l'utilisateur connecté
     *
     * @apiUse UserPermission
     *
     * @apiSuccess {Number} totalVehicles Nombre de véhicules
     * @apiSuccess {Number} totalGeofenceZones Nombre de géofences
     * @apiSuccess {Number} totalAlerts Nombre total d'alertes
     * @apiSuccess {Object[]} alertsByType Répartition des alertes par type
     * @apiSuccess {Object} alertsPerDay Alertes par jour (30 derniers jours)
     * @apiSuccess {String} [mostActiveVehicleId] Véhicule le plus actif
     * @apiSuccess {String} [mostCommonAlertType] Type d'alerte le plus fréquent
     *
     * @apiSuccessExample {json} Success-Response:
     *     HTTP/1.1 200 OK
     *     {
     *       "totalVehicles": 3,
     *       "totalGeofenceZones": 5,
     *       "totalAlerts": 28,
     *       "alertsByType": [
     *         {"type": "ZONE_EXIT", "count": 15},
     *         {"type": "ZONE_ENTER", "count": 13}
     *       ],
     *       "alertsPerDay": {
     *         "2024-01-07": 4,
     *         "2024-01-08": 2
     *       },
     *       "mostActiveVehicleId": "123e4567-e89b-12d3-a456-426614174000",
     *       "mostCommonAlertType": "ZONE_EXIT"
     *     }
     *
     * @apiUse ErrorResponse
     */
    @GetMapping("/user")
    public Mono<ResponseEntity<UserStatisticsDTO>> getUserStatistics() {
        return getCurrentUser()
                .flatMap(user -> Mono.fromCallable(() -> statisticsService.getUserStatistics(user))
                        .subscribeOn(Schedulers.boundedElastic()))
                .map(ResponseEntity::ok);
    }

    /**
     * @api {get} /statistics/vehicle/:vehicleId Statistiques d'un véhicule
     * @apiName GetVehicleStatistics
     * @apiGroup Statistics
     * @apiVersion 1.0.0
     * @apiDescription Récupère les statistiques d'un véhicule spécifique
     *
     * @apiUse UserPermission
     *
     * @apiParam (Path) {String} vehicleId Identifiant du véhicule
     *
     * @apiSuccess {String} vehicleId Identifiant du véhicule
     * @apiSuccess {String} brand Marque du véhicule
     * @apiSuccess {String} model Modèle du véhicule
     * @apiSuccess {String} licensePlate Plaque d'immatriculation
     * @apiSuccess {Number} totalAlerts Nombre total d'alertes
     * @apiSuccess {Number} associatedGeofenceZones Nombre de géofences associées
     * @apiSuccess {Object[]} alertsByType Répartition des alertes par type
     * @apiSuccess {Object} alertsPerDay Alertes par jour (30 derniers jours)
     * @apiSuccess {String} [mostCommonAlertType] Type d'alerte le plus fréquent
     *
     * @apiError (Error 404) NotFound Véhicule non trouvé
     * @apiError (Error 403) Forbidden Accès refusé
     * @apiUse ErrorResponse
     */
    @GetMapping("/vehicle/{vehicleId}")
    public Mono<ResponseEntity<VehicleStatisticsDTO>> getVehicleStatistics(@PathVariable UUID vehicleId) {
        return getCurrentUser()
                .flatMap(user -> Mono.fromCallable(() -> statisticsService.getVehicleStatistics(vehicleId, user))
                        .subscribeOn(Schedulers.boundedElastic()))
                .map(ResponseEntity::ok);
    }
}
```

*Lignes: 207*

---

### 📄 src\main\java\ink\yowyob\geofence\controller\UserController.java

```java
package ink.yowyob.geofence.controller;

public class UserController {
}

```

*Lignes: 5*

---

### 📄 src\main\java\ink\yowyob\geofence\controller\UserManagementController.java

```java
package ink.yowyob.geofence.controller;

import ink.yowyob.geofence.dto.request.UpdateUserRoleRequest;
import ink.yowyob.geofence.dto.response.UserDTO;
import ink.yowyob.geofence.dto.response.UserListResponse;
import ink.yowyob.geofence.model.User;
import ink.yowyob.geofence.repository.UserRepository;
import ink.yowyob.geofence.service.Implementation.UserManagementServiceImpl;
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
 * @apiDefine UserObject
 * @apiSuccess {String} uuid Identifiant unique de l'utilisateur
 * @apiSuccess {String} username Nom d'utilisateur
 * @apiSuccess {String} firstname Prénom
 * @apiSuccess {String} lastname Nom de famille
 * @apiSuccess {String} phoneNumber Numéro de téléphone
 * @apiSuccess {String} email Adresse email
 * @apiSuccess {String} DOB Date de naissance (YYYY-MM-DD)
 * @apiSuccess {String="USER","MANAGER","ADMIN"} Role Rôle de l'utilisateur
 */

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class UserManagementController {
    private final UserManagementServiceImpl userManagementService;
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
     * @api {get} /admin/users Récupérer tous les utilisateurs
     * @apiName GetAllUsers
     * @apiGroup User Management
     * @apiVersion 1.0.0
     * @apiDescription Récupère la liste de tous les utilisateurs (accès admin uniquement)
     *
     * @apiUse AdminPermission
     *
     * @apiQuery {Number{0-}} [page=0] Numéro de page
     * @apiQuery {Number{1-100}} [size=20] Nombre d'éléments par page
     *
     * @apiSuccess {Object[]} users Liste des utilisateurs
     * @apiSuccess {Number} totalItems Nombre total d'utilisateurs
     * @apiUse UserObject
     *
     * @apiError (Error 403) Forbidden Accès refusé - Droits admin requis
     * @apiUse ErrorResponse
     */
    @GetMapping("/admin/users")
    @PreAuthorize("hasRole('ADMIN')")
    public Mono<ResponseEntity<UserListResponse>> getAllUsers(
            @RequestParam(defaultValue = "0") Integer page,
            @RequestParam(defaultValue = "20") Integer size
    ) {
        return getCurrentUser()
                .flatMap(user -> Mono.fromCallable(() -> userManagementService.getAllUsers(page, size, user))
                        .subscribeOn(Schedulers.boundedElastic()))
                .map(ResponseEntity::ok);
    }

    /**
     * @api {get} /admin/users/:userId Récupérer un utilisateur
     * @apiName GetUserById
     * @apiGroup User Management
     * @apiVersion 1.0.0
     * @apiDescription Récupère les détails d'un utilisateur spécifique (accès admin uniquement)
     *
     * @apiUse AdminPermission
     *
     * @apiParam (Path) {String} userId Identifiant de l'utilisateur
     *
     * @apiSuccess {Object} user Données de l'utilisateur
     * @apiUse UserObject
     *
     * @apiSuccessExample {json} Success-Response:
     *     HTTP/1.1 200 OK
     *     {
     *       "uuid": "123e4567-e89b-12d3-a456-426614174000",
     *       "username": "jeandupont",
     *       "firstname": "Jean",
     *       "lastname": "Dupont",
     *       "phoneNumber": "+237123456789",
     *       "email": "jean.dupont@example.com",
     *       "DOB": "1990-01-15",
     *       "Role": "USER"
     *     }
     *
     * @apiError (Error 404) NotFound Utilisateur non trouvé
     * @apiError (Error 403) Forbidden Accès refusé - Droits admin requis
     * @apiUse ErrorResponse
     */
    @GetMapping("/admin/users/{userId}")
    @PreAuthorize("hasRole('ADMIN')")
    public Mono<ResponseEntity<UserDTO>> getUserById(@PathVariable UUID userId) {
        return getCurrentUser()
                .flatMap(user -> Mono.fromCallable(() -> userManagementService.getUserById(userId, user))
                        .subscribeOn(Schedulers.boundedElastic()))
                .map(ResponseEntity::ok);
    }

    /**
     * @api {put} /admin/users/:userId/role Modifier le rôle d'un utilisateur
     * @apiName UpdateUserRole
     * @apiGroup User Management
     * @apiVersion 1.0.0
     * @apiDescription Modifie le rôle d'un utilisateur (accès admin uniquement)
     *
     * @apiUse AdminPermission
     *
     * @apiParam (Path) {String} userId Identifiant de l'utilisateur
     *
     * @apiBody {String="USER","MANAGER","ADMIN"} role Nouveau rôle (requis)
     *
     * @apiParamExample {json} Request-Example:
     *     {
     *       "role": "MANAGER"
     *     }
     *
     * @apiSuccess {Object} user Utilisateur mis à jour
     * @apiUse UserObject
     *
     * @apiError (Error 404) NotFound Utilisateur non trouvé
     * @apiError (Error 403) Forbidden Accès refusé - Droits admin requis
     * @apiError (Error 400) BadRequest Rôle invalide
     * @apiUse ErrorResponse
     */
    @PreAuthorize("hasRole('ADMIN')")
    @PutMapping("/admin/users/{userId}/role")
    public Mono<ResponseEntity<UserDTO>> updateUserRole(
            @PathVariable UUID userId,
            @RequestBody UpdateUserRoleRequest request
    ) {
        return getCurrentUser()
                .flatMap(user -> Mono.fromCallable(() -> userManagementService.updateUserRole(userId, request, user))
                        .subscribeOn(Schedulers.boundedElastic()))
                .map(ResponseEntity::ok);
    }

    /**
     * @api {delete} /admin/users/:userId Supprimer un utilisateur
     * @apiName DeleteUser
     * @apiGroup User Management
     * @apiVersion 1.0.0
     * @apiDescription Supprimer définitivement un utilisateur (accès admin uniquement)
     *
     * @apiUse AdminPermission
     *
     * @apiParam (Path) {String} userId Identifiant de l'utilisateur
     *
     * @apiSuccessExample {json} Success-Response:
     *     HTTP/1.1 204 No Content
     *
     * @apiError (Error 404) NotFound Utilisateur non trouvé
     * @apiError (Error 403) Forbidden Accès refusé - Droits admin requis
     * @apiUse ErrorResponse
     */
    @PreAuthorize("hasRole('ADMIN')")
    @DeleteMapping("/admin/users/{userId}")
    public Mono<ResponseEntity<Void>> deleteUser(@PathVariable UUID userId) {
        return getCurrentUser()
                .flatMap(user -> Mono.fromCallable(() -> {
                    userManagementService.deleteUser(userId, user);
                    return ResponseEntity.noContent().<Void>build();
                })
                .subscribeOn(Schedulers.boundedElastic()));
    }

    /**
     * @api {get} /users/for-sharing Utilisateurs pour partage
     * @apiName GetUsersForSharing
     * @apiGroup User Management
     * @apiVersion 1.0.0
     * @apiDescription Récupère la liste des utilisateurs pour le partage de géofences
     *
     * @apiUse UserPermission
     *
     * @apiSuccess {Object[]} users Liste des utilisateurs (sauf l'utilisateur connecté)
     * @apiSuccess {Number} totalItems Nombre total d'utilisateurs
     * @apiUse UserObject
     *
     * @apiUse ErrorResponse
     */
    @GetMapping("/users/for-sharing")
    public Mono<ResponseEntity<UserListResponse>> getUsersForSharing() {
        return getCurrentUser()
                .flatMap(user ->Mono.fromCallable(() -> userManagementService.getUsersForSharing(user))
                        .subscribeOn(Schedulers.boundedElastic()))
                .subscribeOn(Schedulers.boundedElastic())
                .map(ResponseEntity::ok);
    }
}
```

*Lignes: 253*

---

### 📄 src\main\java\ink\yowyob\geofence\controller\VehicleController.java

```java
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
```

*Lignes: 449*

---

### 📄 src\main\java\ink\yowyob\geofence\dto\LineStringDTO.java

```java
package ink.yowyob.geofence.dto;

import java.util.List;

public record LineStringDTO(
    List<List<Double>> coordinates  // Array of [longitude, latitude] points
) {}
```

*Lignes: 7*

---

### 📄 src\main\java\ink\yowyob\geofence\dto\PointDTO.java

```java
package ink.yowyob.geofence.dto;

import java.util.List;

public record PointDTO(
        List<Double> coordinates
) {
}

```

*Lignes: 9*

---

### 📄 src\main\java\ink\yowyob\geofence\dto\PolygonDTO.java

```java
package ink.yowyob.geofence.dto;

import java.util.List;

public record PolygonDTO(
        List<List<List<Double>>> coordinates
) {
}

```

*Lignes: 9*

---

### 📄 src\main\java\ink\yowyob\geofence\dto\request\AuthRequest\AuthenticationDTO.java

```java
package ink.yowyob.geofence.dto.request.AuthRequest;

public record AuthenticationDTO(String username, String password) {
}

```

*Lignes: 5*

---

### 📄 src\main\java\ink\yowyob\geofence\dto\request\AuthRequest\LoginDTO.java

```java
package ink.yowyob.geofence.dto.request.AuthRequest;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonSubTypes({
        @JsonSubTypes.Type(value = LoginUsernameDTO.class, name = "username"),
        @JsonSubTypes.Type(value = LoginEmailDTO.class, name = "email"),
        @JsonSubTypes.Type(value = LoginPhoneNumberDTO.class, name = "phone")
})
public interface LoginDTO {
    String password();
}

```

*Lignes: 15*

---

### 📄 src\main\java\ink\yowyob\geofence\dto\request\AuthRequest\LoginEmailDTO.java

```java
package ink.yowyob.geofence.dto.request.AuthRequest;

public record LoginEmailDTO(
        String email,
        String password
) implements LoginDTO{
}

```

*Lignes: 8*

---

### 📄 src\main\java\ink\yowyob\geofence\dto\request\AuthRequest\LoginPhoneNumberDTO.java

```java
package ink.yowyob.geofence.dto.request.AuthRequest;

public record LoginPhoneNumberDTO(
        String phoneNumber,
        String password
) implements LoginDTO{
}

```

*Lignes: 8*

---

### 📄 src\main\java\ink\yowyob\geofence\dto\request\AuthRequest\LoginUsernameDTO.java

```java
package ink.yowyob.geofence.dto.request.AuthRequest;

public record LoginUsernameDTO(
        String username,
        String password
) implements LoginDTO{
}

```

*Lignes: 8*

---

### 📄 src\main\java\ink\yowyob\geofence\dto\request\AuthRequest\RegisterDTO.java

```java
package ink.yowyob.geofence.dto.request.AuthRequest;

import jakarta.validation.constraints.Pattern;

import java.time.LocalDate;

public record RegisterDTO(
        String firstname,
        String lastname,
        String username,
        String phoneNumber,
        @Pattern(regexp = "^[^@]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$", message = "Votre email n'est pas correct")
        String email,
        @Pattern(regexp = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,}$", message = "Le mot de passe doit contenir au moins 8 caractères, une majuscule, une minuscule, un chiffre et un caractère spécial")
        String password,
        String password_confirmation,
        LocalDate DOB
) {
}

```

*Lignes: 20*

---

### 📄 src\main\java\ink\yowyob\geofence\dto\request\CircleGeofenceZoneDTORequest.java

```java
package ink.yowyob.geofence.dto.request;

import ink.yowyob.geofence.dto.PointDTO;

public record CircleGeofenceZoneDTORequest(
        String title,
        String description,
        PointDTO center,
        Double radius,
        // Propriétés intelligentes
        Boolean isTemporalEnabled,
        String startTime,
        String endTime,
        String[] activeDays,
        Boolean isConditionalEnabled,
        Double maxSpeed,
        Integer maxDwellTime,
        Integer minDwellTime
) implements GeofenceZoneDTORequest {
}

```

*Lignes: 21*

---

### 📄 src\main\java\ink\yowyob\geofence\dto\request\CreateApiKeyRequest.java

```java
package ink.yowyob.geofence.dto.request;

import jakarta.validation.constraints.NotNull;

import java.time.LocalDateTime;
import java.util.UUID;

public record CreateApiKeyRequest(
        @NotNull(message = "L'ID du véhicule est requis")
        UUID vehicleId,

        LocalDateTime expiresAt // Date d'expiration optionnelle
) {}
```

*Lignes: 13*

---

### 📄 src\main\java\ink\yowyob\geofence\dto\request\CreateInviteLinkRequest.java

```java
package ink.yowyob.geofence.dto.request;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.time.LocalDateTime;
import java.util.UUID;

public record CreateInviteLinkRequest(
        @NotNull(message = "L'ID de la géofence est requis")
        UUID geofenceId,

        @NotBlank(message = "Le type de géofence est requis")
        String geofenceType,

        LocalDateTime expiresAt, // null = infini

        boolean canEdit,

        @Min(value = -1, message = "Le nombre maximum d'utilisations doit être -1 (illimité) ou positif")
        int maxUses
) {}
```

*Lignes: 23*

---

### 📄 src\main\java\ink\yowyob\geofence\dto\request\ForkGeofenceRequest.java

```java
package ink.yowyob.geofence.dto.request;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

import java.util.UUID;

public record ForkGeofenceRequest(
        @NotNull(message = "L'ID de la géofence est requis")
        UUID geofenceId,

        @NotBlank(message = "Le type de géofence est requis")
        String geofenceType,

        @NotBlank(message = "Le nouveau titre est requis")
        @Size(min = 1, max = 100, message = "Le titre doit contenir entre 1 et 100 caractères")
        String newTitle,

        @Size(max = 500, message = "La description ne peut pas dépasser 500 caractères")
        String newDescription,

        @Size(max = 500, message = "La raison du fork ne peut pas dépasser 500 caractères")
        String forkReason
) {}

```

*Lignes: 26*

---

### 📄 src\main\java\ink\yowyob\geofence\dto\request\GeofenceZoneDTORequest.java

```java
package ink.yowyob.geofence.dto.request;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonSubTypes({
        @JsonSubTypes.Type(value = PolygonGeofenceZoneDTORequest.class, name = "polygon"),
        @JsonSubTypes.Type(value = CircleGeofenceZoneDTORequest.class, name = "circle"),
})
public interface GeofenceZoneDTORequest {
    String title();
    String description();
    
    // Propriétés intelligentes
    Boolean isTemporalEnabled();
    String startTime();
    String endTime();
    String[] activeDays();
    Boolean isConditionalEnabled();
    Double maxSpeed();
    Integer maxDwellTime();
    Integer minDwellTime();
}

```

*Lignes: 25*

---

### 📄 src\main\java\ink\yowyob\geofence\dto\request\LocationUpdateRequest.java

```java
package ink.yowyob.geofence.dto.request;

import jakarta.validation.constraints.DecimalMax;
import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.NotNull;

public record LocationUpdateRequest(
        @NotNull(message = "La latitude est requise")
        @DecimalMin(value = "-90.0", message = "La latitude doit être >= -90")
        @DecimalMax(value = "90.0", message = "La latitude doit être <= 90")
        Double latitude,

        @NotNull(message = "La longitude est requise")
        @DecimalMin(value = "-180.0", message = "La longitude doit être >= -180")
        @DecimalMax(value = "180.0", message = "La longitude doit être <= 180")
        Double longitude,

        Double speed, // Vitesse en km/h (optionnelle)
        Double heading, // Direction en degrés (0-360, optionnelle)
        Double altitude, // Altitude en mètres (optionnelle)
        Double accuracy, // Précision en mètres (optionnelle)
        String source // Source de la position (optionnelle)
) {}
```

*Lignes: 23*

---

### 📄 src\main\java\ink\yowyob\geofence\dto\request\PolygonGeofenceZoneDTORequest.java

```java
package ink.yowyob.geofence.dto.request;

import ink.yowyob.geofence.dto.PolygonDTO;


public record PolygonGeofenceZoneDTORequest(
        String title,
        String description,
        PolygonDTO polygon,
        // Propriétés intelligentes
        Boolean isTemporalEnabled,
        String startTime,
        String endTime,
        String[] activeDays,
        Boolean isConditionalEnabled,
        Double maxSpeed,
        Integer maxDwellTime,
        Integer minDwellTime
) implements GeofenceZoneDTORequest {
}

```

*Lignes: 21*

---

### 📄 src\main\java\ink\yowyob\geofence\dto\request\RouteDTORequest.java

```java
package ink.yowyob.geofence.dto.request;

import ink.yowyob.geofence.dto.PointDTO;

import java.util.List;

public record RouteDTORequest(
    String name,
    String description,
    PointDTO startPoint,
    String startAddress,
    PointDTO endPoint,
    String endAddress,
    Double estimatedDistance,
    Integer estimatedDuration,
    Double deviationTolerance,
    
    // Propriétés temporelles
    Boolean isTemporalEnabled,
    String startTime,
    String endTime,
    String[] activeDays,
    
    // Segments de route autorisés
    List<RouteSegmentDTORequest> authorizedSegments,
    
    Boolean isActive
) {}
```

*Lignes: 28*

---

### 📄 src\main\java\ink\yowyob\geofence\dto\request\RouteSegmentDTORequest.java

```java
package ink.yowyob.geofence.dto.request;

import ink.yowyob.geofence.dto.LineStringDTO;
import ink.yowyob.geofence.model.RouteSegment;

public record RouteSegmentDTORequest(
    String name,
    String description,
    LineStringDTO pathLine,
    Integer segmentOrder,
    RouteSegment.RouteSegmentType segmentType,
    Integer priority,
    Double speedLimit,
    Integer estimatedTime,
    Boolean isActive
) {}
```

*Lignes: 16*

---

### 📄 src\main\java\ink\yowyob\geofence\dto\request\ShareGeofenceRequest.java

```java
package ink.yowyob.geofence.dto.request;

import java.time.LocalDateTime;
import java.util.UUID;

public record ShareGeofenceRequest(
        UUID targetUserId,
        LocalDateTime expiresAt,
        boolean canEdit
) {}
```

*Lignes: 10*

---

### 📄 src\main\java\ink\yowyob\geofence\dto\request\UpdateUserRoleRequest.java

```java
package ink.yowyob.geofence.dto.request;

import ink.yowyob.geofence.Enum.UserRole;

public record UpdateUserRoleRequest(
        UserRole role
) {
}
```

*Lignes: 8*

---

### 📄 src\main\java\ink\yowyob\geofence\dto\request\VehicleDTORequest.java

```java
package ink.yowyob.geofence.dto.request;

import java.util.Set;
import java.util.UUID;

public record VehicleDTORequest(
        String brand,
        String model,
        String licensePlate,
        String description,
        Set<UUID> geofenceZoneIds
) {
}
```

*Lignes: 13*

---

### 📄 src\main\java\ink\yowyob\geofence\dto\response\AlertCountDTO.java

```java
package ink.yowyob.geofence.dto.response;

import ink.yowyob.geofence.Enum.AlertTypeEnum;

public record AlertCountDTO(
        AlertTypeEnum type,
        long count
) {
}
```

*Lignes: 9*

---

### 📄 src\main\java\ink\yowyob\geofence\dto\response\AlertDTO.java

```java
package ink.yowyob.geofence.dto.response;

import ink.yowyob.geofence.Enum.AlertTypeEnum;
import ink.yowyob.geofence.dto.PointDTO;

import java.time.LocalDateTime;
import java.util.UUID;

public record AlertDTO(
        UUID id,
        AlertTypeEnum type,
        LocalDateTime timestamp,
        String message,
        PointDTO location,
        SimpleVehicleDTO vehicle,
        GeofenceZoneSimpleDTO geofenceZone
) {
}
```

*Lignes: 18*

---

### 📄 src\main\java\ink\yowyob\geofence\dto\response\AlertListResponse.java

```java
package ink.yowyob.geofence.dto.response;

import java.util.List;

public record AlertListResponse(
        List<AlertDTO> alerts,
        int totalItems
) {
}
```

*Lignes: 9*

---

### 📄 src\main\java\ink\yowyob\geofence\dto\response\ApiKeyListResponse.java

```java
package ink.yowyob.geofence.dto.response;

import java.util.List;

public record ApiKeyListResponse(
        List<VehicleApiKeyDTO> apiKeys,
        int totalItems
) {}
```

*Lignes: 8*

---

### 📄 src\main\java\ink\yowyob\geofence\dto\response\AuthResponse.java

```java
package ink.yowyob.geofence.dto.response;

public record AuthResponse(
        UserDTO userDTO,
        String token
) {
}

```

*Lignes: 8*

---

### 📄 src\main\java\ink\yowyob\geofence\dto\response\CircleGeofenceZoneDTOResponse.java

```java
package ink.yowyob.geofence.dto.response;

import ink.yowyob.geofence.dto.PointDTO;

import java.util.List;
import java.util.UUID;

public record CircleGeofenceZoneDTOResponse(
        UUID id,
        UserDTO user,
        String type,
        String description,
        String title,
        PointDTO center,
        Double radius,
        List<SimpleVehicleDTO> vehicles,
        // Propriétés intelligentes
        Boolean isTemporalEnabled,
        String startTime,
        String endTime,
        String[] activeDays,
        Boolean isConditionalEnabled,
        Double maxSpeed,
        Integer maxDwellTime,
        Integer minDwellTime
) implements GeofenceZoneDTOResponse{
}

```

*Lignes: 28*

---

### 📄 src\main\java\ink\yowyob\geofence\dto\response\DashboardStatsDTO.java

```java
package ink.yowyob.geofence.dto.response;

public record DashboardStatsDTO(
        int totalVehicles,
        int activeVehicles,
        int totalAlerts,
        int recentPositions,
        double avgSpeed,
        int onlineVehicles,
        int totalGeofences,
        int recentAlerts,
        VehicleActivityStatsDTO vehicleActivity
) {
    
    public record VehicleActivityStatsDTO(
            int vehiclesWithRecentPositions,
            int vehiclesOffline,
            int totalPositionsToday,
            double maxSpeedToday,
            int alertsToday
    ) {}
}
```

*Lignes: 22*

---

### 📄 src\main\java\ink\yowyob\geofence\dto\response\ErrorEntity.java

```java
package ink.yowyob.geofence.dto.response;

public record ErrorEntity(
        int status,
        String message
) {
}

```

*Lignes: 8*

---

### 📄 src\main\java\ink\yowyob\geofence\dto\response\GeofenceForkDTO.java

```java
package ink.yowyob.geofence.dto.response;

import java.time.LocalDateTime;
import java.util.UUID;

public record GeofenceForkDTO(
        UUID id,
        GeofenceZoneSimpleDTO originalGeofence,
        GeofenceZoneSimpleDTO forkedGeofence,
        UserDTO forkedBy,
        LocalDateTime forkedAt,
        String forkReason
) {}
```

*Lignes: 13*

---

### 📄 src\main\java\ink\yowyob\geofence\dto\response\GeofenceForkInfoDTO.java

```java
package ink.yowyob.geofence.dto.response;

import java.time.LocalDateTime;

public record GeofenceForkInfoDTO(
        String originalId,
        String originalTitle,
        UserDTO originalOwner,
        LocalDateTime forkedAt,
        String forkReason
) {}
```

*Lignes: 11*

---

### 📄 src\main\java\ink\yowyob\geofence\dto\response\GeofenceForkListResponse.java

```java
package ink.yowyob.geofence.dto.response;

import java.util.List;

public record GeofenceForkListResponse(
        List<GeofenceForkDTO> forks,
        int totalItems
) {}
```

*Lignes: 8*

---

### 📄 src\main\java\ink\yowyob\geofence\dto\response\GeofenceShareDTO.java

```java
package ink.yowyob.geofence.dto.response;

import ink.yowyob.geofence.Enum.ShareStatus;

import java.time.LocalDateTime;
import java.util.UUID;

public record GeofenceShareDTO(
        UUID id,
        GeofenceZoneSimpleDTO geofenceZone,
        UserDTO sharedBy,
        UserDTO sharedWith,
        LocalDateTime sharedAt,
        LocalDateTime expiresAt,
        boolean canEdit,
        ShareStatus status,
        LocalDateTime respondedAt
) {
}
```

*Lignes: 19*

---

### 📄 src\main\java\ink\yowyob\geofence\dto\response\GeofenceShareListResponse.java

```java
package ink.yowyob.geofence.dto.response;

import java.util.List;

public record GeofenceShareListResponse(
        List<GeofenceShareDTO> shares,
        int totalItems
) {
}
```

*Lignes: 9*

---

### 📄 src\main\java\ink\yowyob\geofence\dto\response\GeofenceWithForkInfoDTO.java

```java
package ink.yowyob.geofence.dto.response;

public record GeofenceWithForkInfoDTO(
        String id,
        String title,
        String description,
        String type,
        UserDTO owner,
        boolean isOriginal,
        boolean isFork,
        GeofenceForkInfoDTO forkInfo,
        long forkCount
) {}
```

*Lignes: 13*

---

### 📄 src\main\java\ink\yowyob\geofence\dto\response\GeofenceZoneDTOResponse.java

```java
package ink.yowyob.geofence.dto.response;

import java.util.UUID;

public interface GeofenceZoneDTOResponse {
    UUID id();
    UserDTO user();
    String description();
    String title();
    String type();
    
    // Propriétés intelligentes
    Boolean isTemporalEnabled();
    String startTime();
    String endTime();
    String[] activeDays();
    Boolean isConditionalEnabled();
    Double maxSpeed();
    Integer maxDwellTime();
    Integer minDwellTime();
}

```

*Lignes: 22*

---

### 📄 src\main\java\ink\yowyob\geofence\dto\response\GeofenceZoneSimpleDTO.java

```java
package ink.yowyob.geofence.dto.response;

import java.util.UUID;

public record GeofenceZoneSimpleDTO(
        UUID id,
        String title,
        String type
) {
}
```

*Lignes: 10*

---

### 📄 src\main\java\ink\yowyob\geofence\dto\response\InviteLinkDetailsResponse.java

```java
package ink.yowyob.geofence.dto.response;

public record InviteLinkDetailsResponse(
        InviteLinkDTO inviteLink,
        GeofenceZoneSimpleDTO geofenceZone,
        String fullInviteUrl
) {}
```

*Lignes: 7*

---

### 📄 src\main\java\ink\yowyob\geofence\dto\response\InviteLinkDTO.java

```java
package ink.yowyob.geofence.dto.response;

import java.time.LocalDateTime;
import java.util.UUID;

public record InviteLinkDTO(
        UUID id,
        String inviteCode,
        UUID geofenceId,
        String geofenceType,
        UserDTO createdBy,
        LocalDateTime createdAt,
        LocalDateTime expiresAt,
        boolean canEdit,
        boolean isActive,
        int maxUses,
        int currentUses,
        boolean isExpired,
        boolean canBeUsed
) {}
```

*Lignes: 20*

---

### 📄 src\main\java\ink\yowyob\geofence\dto\response\InviteLinkListResponse.java

```java
package ink.yowyob.geofence.dto.response;

import java.util.List;

public record InviteLinkListResponse(
        List<InviteLinkDTO> inviteLinks,
        int totalItems
) {}

```

*Lignes: 9*

---

### 📄 src\main\java\ink\yowyob\geofence\dto\response\LocationDTO.java

```java
package ink.yowyob.geofence.dto.response;

import ink.yowyob.geofence.dto.PointDTO;

import java.time.LocalDateTime;
import java.util.UUID;

public record LocationDTO(
        UUID id,
        PointDTO position,
        SimpleVehicleDTO vehicle,
        LocalDateTime timestamp,
        Double speed,
        Double heading,
        Double altitude,
        Double accuracy,
        String source
) {}
```

*Lignes: 18*

---

### 📄 src\main\java\ink\yowyob\geofence\dto\response\LocationListResponse.java

```java
package ink.yowyob.geofence.dto.response;

import java.util.List;

public record LocationListResponse(
        List<LocationDTO> locations,
        int totalItems,
        int page,
        int size,
        long totalElements,
        int totalPages
) {}
```

*Lignes: 12*

---

### 📄 src\main\java\ink\yowyob\geofence\dto\response\LocationUpdateResponse.java

```java
package ink.yowyob.geofence.dto.response;

import java.util.List;

public record LocationUpdateResponse(
        boolean success,
        String message,
        LocationDTO location,
        List<AlertDTO> alertsGenerated // Alertes générées suite à cette position
) {}
```

*Lignes: 10*

---

### 📄 src\main\java\ink\yowyob\geofence\dto\response\MultipleGeofenceZoneDTOResponse.java

```java
package ink.yowyob.geofence.dto.response;

import java.util.List;

public record MultipleGeofenceZoneDTOResponse(
        List<PolygonGeofenceZoneDTOResponse> polygons,
        List<CircleGeofenceZoneDTOResponse> circles
) {
}

```

*Lignes: 10*

---

### 📄 src\main\java\ink\yowyob\geofence\dto\response\MultipleRoutesDTOResponse.java

```java
package ink.yowyob.geofence.dto.response;

import java.util.List;

public record MultipleRoutesDTOResponse(
    List<RouteDTOResponse> routes
) {}
```

*Lignes: 7*

---

### 📄 src\main\java\ink\yowyob\geofence\dto\response\MultipleVehicleDTOResponse.java

```java
package ink.yowyob.geofence.dto.response;

import java.util.List;

public record MultipleVehicleDTOResponse(
        List<VehicleDTOResponse> vehicles
) {
}
```

*Lignes: 8*

---

### 📄 src\main\java\ink\yowyob\geofence\dto\response\PolygonGeofenceZoneDTOResponse.java

```java
package ink.yowyob.geofence.dto.response;

import ink.yowyob.geofence.dto.PolygonDTO;

import java.util.List;
import java.util.UUID;

public record PolygonGeofenceZoneDTOResponse(
        UUID id,
        UserDTO user,
        String description,
        String title,
        String type,
        PolygonDTO polygon,
        List<SimpleVehicleDTO> vehicles,
        // Propriétés intelligentes
        Boolean isTemporalEnabled,
        String startTime,
        String endTime,
        String[] activeDays,
        Boolean isConditionalEnabled,
        Double maxSpeed,
        Integer maxDwellTime,
        Integer minDwellTime
) implements GeofenceZoneDTOResponse{
}

```

*Lignes: 27*

---

### 📄 src\main\java\ink\yowyob\geofence\dto\response\RegisterResponse.java

```java
package ink.yowyob.geofence.dto.response;

public record RegisterResponse(
        boolean success,
        String message,
        UserDTO user
) {
}

```

*Lignes: 9*

---

### 📄 src\main\java\ink\yowyob\geofence\dto\response\RouteDTOResponse.java

```java
package ink.yowyob.geofence.dto.response;

import ink.yowyob.geofence.dto.PointDTO;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

public record RouteDTOResponse(
    UUID id,
    UserDTO user,
    String name,
    String description,
    PointDTO startPoint,
    String startAddress,
    PointDTO endPoint,
    String endAddress,
    Double estimatedDistance,
    Integer estimatedDuration,
    Double deviationTolerance,
    
    // Propriétés temporelles
    Boolean isTemporalEnabled,
    String startTime,
    String endTime,
    String[] activeDays,
    
    // Segments de route autorisés
    List<RouteSegmentDTOResponse> authorizedSegments,
    
    // Véhicules assignés
    List<SimpleVehicleDTO> assignedVehicles,
    
    Boolean isActive,
    LocalDateTime createdAt,
    LocalDateTime updatedAt
) {}
```

*Lignes: 37*

---

### 📄 src\main\java\ink\yowyob\geofence\dto\response\RouteSegmentDTOResponse.java

```java
package ink.yowyob.geofence.dto.response;

import ink.yowyob.geofence.dto.LineStringDTO;
import ink.yowyob.geofence.model.RouteSegment;

import java.time.LocalDateTime;
import java.util.UUID;

public record RouteSegmentDTOResponse(
    UUID id,
    String name,
    String description,
    LineStringDTO pathLine,
    Integer segmentOrder,
    Double segmentLength,
    RouteSegment.RouteSegmentType segmentType,
    Integer priority,
    Double speedLimit,
    Integer estimatedTime,
    Boolean isActive,
    LocalDateTime createdAt,
    LocalDateTime updatedAt
) {}
```

*Lignes: 23*

---

### 📄 src\main\java\ink\yowyob\geofence\dto\response\SimpleVehicleDTO.java

```java
package ink.yowyob.geofence.dto.response;

import java.util.UUID;

public record SimpleVehicleDTO(
        UUID id,
        String brand,
        String model,
        String licensePlate,
        String imageUrl
) {
}
```

*Lignes: 12*

---

### 📄 src\main\java\ink\yowyob\geofence\dto\response\SystemStatisticsDTO.java

```java
package ink.yowyob.geofence.dto.response;

import java.util.List;
import java.util.Map;

public record SystemStatisticsDTO(
        long totalUsers,
        long totalVehicles,
        long totalGeofenceZones,
        long totalAlerts,
        List<AlertCountDTO> alertsByType,
        Map<String, Long> alertsPerDay
) {
}
```

*Lignes: 14*

---

### 📄 src\main\java\ink\yowyob\geofence\dto\response\UserDTO.java

```java
package ink.yowyob.geofence.dto.response;

import ink.yowyob.geofence.Enum.UserRole;

import java.time.LocalDate;
import java.util.UUID;

public record UserDTO(
        UUID uuid,
        String username,
        String firstname,
        String lastname,
        String phoneNumber,
        String email,
        LocalDate DOB,
        UserRole Role
) {
}

```

*Lignes: 19*

---

### 📄 src\main\java\ink\yowyob\geofence\dto\response\UserListResponse.java

```java
package ink.yowyob.geofence.dto.response;

import java.util.List;

public record UserListResponse(
        List<UserDTO> users,
        int totalItems
) {
}
```

*Lignes: 9*

---

### 📄 src\main\java\ink\yowyob\geofence\dto\response\UserStatisticsDTO.java

```java
package ink.yowyob.geofence.dto.response;

import ink.yowyob.geofence.Enum.AlertTypeEnum;

import java.util.List;
import java.util.Map;
import java.util.UUID;

public record UserStatisticsDTO(
        int totalVehicles,
        int totalGeofenceZones,
        int totalAlerts,
        List<AlertCountDTO> alertsByType,
        Map<String, Long> alertsPerDay,
        UUID mostActiveVehicleId,
        AlertTypeEnum mostCommonAlertType
) {
}
```

*Lignes: 18*

---

### 📄 src\main\java\ink\yowyob\geofence\dto\response\VehicleApiKeyDTO.java

```java
package ink.yowyob.geofence.dto.response;

import java.time.LocalDateTime;
import java.util.UUID;

public record VehicleApiKeyDTO(
        UUID id,
        String apiKey,
        SimpleVehicleDTO vehicle,
        boolean isActive,
        LocalDateTime createdAt,
        LocalDateTime lastUsedAt,
        LocalDateTime expiresAt,
        boolean isExpired,
        boolean isValid
) {}
```

*Lignes: 16*

---

### 📄 src\main\java\ink\yowyob\geofence\dto\response\VehicleDTOResponse.java

```java
package ink.yowyob.geofence.dto.response;

import java.util.Set;
import java.util.UUID;

public record VehicleDTOResponse(
        UUID id,
        String brand,
        String model,
        String licensePlate,
        String description,
        String imageUrl,
        UserDTO user,
        Set<GeofenceZoneSimpleDTO> geofenceZones
) {
}
```

*Lignes: 16*

---

### 📄 src\main\java\ink\yowyob\geofence\dto\response\VehicleStatisticsDTO.java

```java
package ink.yowyob.geofence.dto.response;

import ink.yowyob.geofence.Enum.AlertTypeEnum;

import java.util.List;
import java.util.Map;
import java.util.UUID;

public record VehicleStatisticsDTO(
        UUID vehicleId,
        String brand,
        String model,
        String licensePlate,
        int totalAlerts,
        int associatedGeofenceZones,
        List<AlertCountDTO> alertsByType,
        Map<String, Long> alertsPerDay,
        AlertTypeEnum mostCommonAlertType
) {
}
```

*Lignes: 20*

---

### 📄 src\main\java\ink\yowyob\geofence\Enum\AlertTypeEnum.java

```java
package ink.yowyob.geofence.Enum;

public enum AlertTypeEnum {
    ZONE_EXIT,
    ZONE_ENTER,
    SPEED_LIMIT,
    BATTERY_LOW,
    SYSTEM_ERROR,
    // Nouveaux types pour géofence intelligente
    ZONE_TEMPORAL_VIOLATION,  // Zone inactive à cette heure
    ZONE_SPEED_VIOLATION,     // Vitesse dépassée dans la zone
    ZONE_DWELL_TIME_EXCEEDED, // Temps de séjour dépassé
    ZONE_DWELL_TIME_INSUFFICIENT // Temps de séjour insuffisant
}

```

*Lignes: 15*

---

### 📄 src\main\java\ink\yowyob\geofence\Enum\DayOfWeek.java

```java
package ink.yowyob.geofence.Enum;

public enum DayOfWeek {
    MONDAY("Lundi"),
    TUESDAY("Mardi"),
    WEDNESDAY("Mercredi"),
    THURSDAY("Jeudi"),
    FRIDAY("Vendredi"),
    SATURDAY("Samedi"),
    SUNDAY("Dimanche");

    private final String displayName;

    DayOfWeek(String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return displayName;
    }

    /**
     * Convertit un java.time.DayOfWeek vers notre enum personnalisé
     */
    public static DayOfWeek from(java.time.DayOfWeek javaDay) {
        return switch (javaDay) {
            case MONDAY -> MONDAY;
            case TUESDAY -> TUESDAY;
            case WEDNESDAY -> WEDNESDAY;
            case THURSDAY -> THURSDAY;
            case FRIDAY -> FRIDAY;
            case SATURDAY -> SATURDAY;
            case SUNDAY -> SUNDAY;
        };
    }

    /**
     * Convertit vers un java.time.DayOfWeek
     */
    public java.time.DayOfWeek toJavaDayOfWeek() {
        return switch (this) {
            case MONDAY -> java.time.DayOfWeek.MONDAY;
            case TUESDAY -> java.time.DayOfWeek.TUESDAY;
            case WEDNESDAY -> java.time.DayOfWeek.WEDNESDAY;
            case THURSDAY -> java.time.DayOfWeek.THURSDAY;
            case FRIDAY -> java.time.DayOfWeek.FRIDAY;
            case SATURDAY -> java.time.DayOfWeek.SATURDAY;
            case SUNDAY -> java.time.DayOfWeek.SUNDAY;
        };
    }

    /**
     * Parse une représentation courante d'un jour et renvoie l'enum projet.
     * Accepté: "MON", "Mon", "MONDAY", "Monday", "Lundi", "1" (1=MONDAY)
     */
    public static DayOfWeek parse(String input) {
        if (input == null) {
            throw new IllegalArgumentException("Day value cannot be null");
        }
        String s = input.trim().toUpperCase(java.util.Locale.ROOT);
        return switch (s) {
            case "MON", "MONDAY", "LUN", "LUNDI", "1" -> MONDAY;
            case "TUE", "TUESDAY", "MAR", "MARDI", "2" -> TUESDAY;
            case "WED", "WEDNESDAY", "MER", "MERCREDI", "3" -> WEDNESDAY;
            case "THU", "THURSDAY", "JEU", "JEUDI", "4" -> THURSDAY;
            case "FRI", "FRIDAY", "VEN", "VENDREDI", "5" -> FRIDAY;
            case "SAT", "SATURDAY", "SAM", "SAMEDI", "6" -> SATURDAY;
            case "SUN", "SUNDAY", "DIM", "DIMANCHE", "7" -> SUNDAY;
            default -> {
                // last resort: try java.time.DayOfWeek names (already mostly covered) or fail with clear message
                try {
                    yield from(java.time.DayOfWeek.valueOf(s));
                } catch (Exception e) {
                    throw new IllegalArgumentException("Invalid day value: '" + input + "'. Accepted examples: MON, Mon, MONDAY, Monday, Lundi, 1..7");
                }
            }
        };
    }
}
```

*Lignes: 79*

---

### 📄 src\main\java\ink\yowyob\geofence\Enum\ShareStatus.java

```java
package ink.yowyob.geofence.Enum;

public enum ShareStatus {
    PENDING,
    ACCEPTED,
    REFUSED
}

```

*Lignes: 8*

---

### 📄 src\main\java\ink\yowyob\geofence\Enum\UserRole.java

```java
package ink.yowyob.geofence.Enum;

public enum UserRole {
    USER,
    MANAGER,
    ADMIN
}

```

*Lignes: 8*

---

### 📄 src\main\java\ink\yowyob\geofence\exception\BadCredentialsException.java

```java
package ink.yowyob.geofence.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.UNAUTHORIZED)
public class BadCredentialsException extends RuntimeException {
    public BadCredentialsException(String message) {
        super(message);
    }
}

```

*Lignes: 12*

---

### 📄 src\main\java\ink\yowyob\geofence\exception\PasswordMismatchException.java

```java
package ink.yowyob.geofence.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class PasswordMismatchException extends RuntimeException {
    public PasswordMismatchException() {
        super("fields Password and password_confirmation not matched");
    }
}

```

*Lignes: 12*

---

### 📄 src\main\java\ink\yowyob\geofence\exception\ResourceNotFoundException.java

```java
package ink.yowyob.geofence.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class ResourceNotFoundException extends RuntimeException {
    public ResourceNotFoundException(String message) {
        super(message);
    }
}
```

*Lignes: 11*

---

### 📄 src\main\java\ink\yowyob\geofence\exception\UserAlreadyExistsException.java

```java
package ink.yowyob.geofence.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.CONFLICT)
public class UserAlreadyExistsException extends RuntimeException {
    public UserAlreadyExistsException(String message) {
        super(message);
    }
}

```

*Lignes: 12*

---

### 📄 src\main\java\ink\yowyob\geofence\GeofenceApplication.java

```java
package ink.yowyob.geofence;

import io.github.cdimascio.dotenv.Dotenv;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.boot.autoconfigure.security.servlet.UserDetailsServiceAutoConfiguration;
import org.springframework.boot.autoconfigure.web.servlet.WebMvcAutoConfiguration;
import org.springframework.boot.autoconfigure.web.servlet.DispatcherServletAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.reactive.CorsWebFilter;
import org.springframework.web.cors.reactive.UrlBasedCorsConfigurationSource;

import java.util.Arrays;

@SpringBootApplication(exclude = {
		SecurityAutoConfiguration.class,
		UserDetailsServiceAutoConfiguration.class,
		WebMvcAutoConfiguration.class,
		DispatcherServletAutoConfiguration.class
})
public class GeofenceApplication {

	public static void main(String[] args) {
		// Charger le .env AVANT de démarrer Spring Boot
		loadDotenv();

		SpringApplication app = new SpringApplication(GeofenceApplication.class);
		app.setWebApplicationType(org.springframework.boot.WebApplicationType.REACTIVE);
		app.run(args);
	}

	private static void loadDotenv() {
		try {
			Dotenv dotenv = Dotenv.configure()
					.directory("./")
					.ignoreIfMalformed()
					.ignoreIfMissing()
					.load();

			// Charger les variables d'environnement
			dotenv.entries().forEach(entry -> {
				System.setProperty(entry.getKey(), entry.getValue());
			});

			System.out.println("Variables d'environnement chargées depuis .env");
		} catch (Exception e) {
			System.out.println("Aucun fichier .env trouvé ou erreur de chargement: " + e.getMessage());
		}
	}

	@Bean
	public CorsWebFilter corsWebFilter() {
		CorsConfiguration corsConfig = new CorsConfiguration();
		corsConfig.setAllowedOriginPatterns(Arrays.asList("*"));
		corsConfig.setAllowedMethods(Arrays.asList("GET", "POST", "PUT", "DELETE", "PATCH", "OPTIONS"));
		corsConfig.setAllowedHeaders(Arrays.asList("*"));
		corsConfig.setExposedHeaders(Arrays.asList("Authorization", "Content-Type"));
		corsConfig.setAllowCredentials(false);
		corsConfig.setMaxAge(3600L);

		UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
		source.registerCorsConfiguration("/**", corsConfig);

		return new CorsWebFilter(source);
	}
}
```

*Lignes: 68*

---

### 📄 src\main\java\ink\yowyob\geofence\mapper\AlertDTOMapper.java

```java
package ink.yowyob.geofence.mapper;

import ink.yowyob.geofence.dto.PointDTO;
import ink.yowyob.geofence.dto.response.AlertDTO;
import ink.yowyob.geofence.dto.response.GeofenceZoneSimpleDTO;
import ink.yowyob.geofence.dto.response.SimpleVehicleDTO;
import ink.yowyob.geofence.model.Alert;
import ink.yowyob.geofence.model.CircleGeofenceZone;
import ink.yowyob.geofence.model.Location;
import ink.yowyob.geofence.model.PolygonGeofenceZone;
import ink.yowyob.geofence.service.FileStorageService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

@Service
public class AlertDTOMapper implements Function<Alert, AlertDTO> {

    private final FileStorageService fileStorageService;

    public AlertDTOMapper(FileStorageService fileStorageService) {
        this.fileStorageService = fileStorageService;
    }

    @Override
    public AlertDTO apply(Alert alert) {
        // Convert vehicle to SimpleVehicleDTO
        SimpleVehicleDTO vehicleDTO = null;
        if (alert.getVehicle() != null) {
            String imageUrl = alert.getVehicle().getImageUrl() != null
                    ? fileStorageService.getCompleteImageUrl(alert.getVehicle().getImageUrl())
                    : null;

            vehicleDTO = new SimpleVehicleDTO(
                    alert.getVehicle().getId(),
                    alert.getVehicle().getBrand(),
                    alert.getVehicle().getModel(),
                    alert.getVehicle().getLicensePlate(),
                    imageUrl
            );
        }

        // Convert geofence zone to GeofenceZoneSimpleDTO
        GeofenceZoneSimpleDTO zoneDTO = null;
        if (alert.getGeofenceZone() != null) {
            String type = "unknown";
            if (alert.getGeofenceZone() instanceof CircleGeofenceZone) {
                type = "circle";
            } else if (alert.getGeofenceZone() instanceof PolygonGeofenceZone) {
                type = "polygon";
            }

            zoneDTO = new GeofenceZoneSimpleDTO(
                    alert.getGeofenceZone().getId(),
                    alert.getGeofenceZone().getTitle(),
                    type
            );
        }

        // Convert location to PointDTO
        PointDTO locationDTO = null;
        if (alert.getLocation() != null && alert.getLocation().getPosition() != null) {
            Location location = alert.getLocation();
            List<Double> coordinates = new ArrayList<>();
            coordinates.add(location.getPosition().getX());
            coordinates.add(location.getPosition().getY());
            locationDTO = new PointDTO(coordinates);
        }

        return new AlertDTO(
                alert.getId(),
                alert.getType().getType(),
                alert.getTimestamp(),
                alert.getMessage(),
                locationDTO,
                vehicleDTO,
                zoneDTO
        );
    }
}
```

*Lignes: 82*

---

### 📄 src\main\java\ink\yowyob\geofence\mapper\CircleDTOMapper.java

```java
package ink.yowyob.geofence.mapper;

import ink.yowyob.geofence.dto.PointDTO;
import ink.yowyob.geofence.dto.response.CircleGeofenceZoneDTOResponse;
import ink.yowyob.geofence.dto.response.SimpleVehicleDTO;
import ink.yowyob.geofence.model.CircleGeofenceZone;
import ink.yowyob.geofence.model.Vehicle;
import ink.yowyob.geofence.repository.VehicleRepository;
import ink.yowyob.geofence.service.FileStorageService;
import org.locationtech.jts.geom.Point;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

@Service
public class CircleDTOMapper implements Function<CircleGeofenceZone, CircleGeofenceZoneDTOResponse> {
    private final UserDTOMapper userDTOMapper;
    private final VehicleRepository vehicleRepository;
    private final FileStorageService fileStorageService;

    public CircleDTOMapper(UserDTOMapper userDTOMapper, VehicleRepository vehicleRepository, FileStorageService fileStorageService) {
        this.userDTOMapper = userDTOMapper;
        this.vehicleRepository = vehicleRepository;
        this.fileStorageService = fileStorageService;
    }

    @Override
    public CircleGeofenceZoneDTOResponse apply(CircleGeofenceZone circleGeofenceZone) {
        // Récupérer les véhicules associés à cette zone
        List<SimpleVehicleDTO> vehicles = vehicleRepository.findByGeofenceZonesContaining(circleGeofenceZone)
                .stream()
                .map(this::mapToSimpleVehicleDTO)
                .collect(Collectors.toList());

        return new CircleGeofenceZoneDTOResponse(
                circleGeofenceZone.getId(),
                userDTOMapper.apply(circleGeofenceZone.getUser()),
                "circle",
                circleGeofenceZone.getDescription(),
                circleGeofenceZone.getTitle(),
                convertPointToDTO(circleGeofenceZone.getCenter()),
                circleGeofenceZone.getRadius(),
                vehicles,
                // Propriétés intelligentes
                circleGeofenceZone.getIsTemporalEnabled(),
                circleGeofenceZone.getStartTime() != null ? circleGeofenceZone.getStartTime().toString() : null,
                circleGeofenceZone.getEndTime() != null ? circleGeofenceZone.getEndTime().toString() : null,
                circleGeofenceZone.getActiveDays() != null ? 
                    circleGeofenceZone.getActiveDays().stream().map(Enum::name).toArray(String[]::new) : null,
                circleGeofenceZone.getIsConditionalEnabled(),
                circleGeofenceZone.getMaxSpeed(),
                circleGeofenceZone.getMaxDwellTime(),
                circleGeofenceZone.getMinDwellTime()
        );
    }

    private SimpleVehicleDTO mapToSimpleVehicleDTO(Vehicle vehicle) {
        String imageUrl = vehicle.getImageUrl() != null
                ? fileStorageService.getCompleteImageUrl(vehicle.getImageUrl())
                : null;

        return new SimpleVehicleDTO(
                vehicle.getId(),
                vehicle.getBrand(),
                vehicle.getModel(),
                vehicle.getLicensePlate(),
                imageUrl
        );
    }

    public PointDTO convertPointToDTO(Point point) {
        return new PointDTO(List.of(point.getX(), point.getY()));
    }
}
```

*Lignes: 76*

---

### 📄 src\main\java\ink\yowyob\geofence\mapper\GeofenceForkDTOMapper.java

```java
package ink.yowyob.geofence.mapper;

import ink.yowyob.geofence.dto.response.GeofenceForkDTO;
import ink.yowyob.geofence.dto.response.GeofenceZoneSimpleDTO;
import ink.yowyob.geofence.model.CircleGeofenceZone;
import ink.yowyob.geofence.model.GeofenceFork;
import ink.yowyob.geofence.model.GeofenceZone;
import ink.yowyob.geofence.model.PolygonGeofenceZone;
import org.springframework.stereotype.Service;

import java.util.function.Function;

@Service
public class GeofenceForkDTOMapper implements Function<GeofenceFork, GeofenceForkDTO> {

    private final UserDTOMapper userDTOMapper;

    public GeofenceForkDTOMapper(UserDTOMapper userDTOMapper) {
        this.userDTOMapper = userDTOMapper;
    }

    @Override
    public GeofenceForkDTO apply(GeofenceFork fork) {
        GeofenceZoneSimpleDTO originalDTO = mapToSimpleDTO(fork.getOriginalGeofence());
        GeofenceZoneSimpleDTO forkedDTO = mapToSimpleDTO(fork.getForkedGeofence());

        return new GeofenceForkDTO(
                fork.getId(),
                originalDTO,
                forkedDTO,
                userDTOMapper.apply(fork.getForkedBy()),
                fork.getForkedAt(),
                fork.getForkReason()
        );
    }

    private GeofenceZoneSimpleDTO mapToSimpleDTO(GeofenceZone geofence) {
        String type = "unknown";
        if (geofence instanceof CircleGeofenceZone) {
            type = "circle";
        } else if (geofence instanceof PolygonGeofenceZone) {
            type = "polygon";
        }

        return new GeofenceZoneSimpleDTO(
                geofence.getId(),
                geofence.getTitle(),
                type
        );
    }
}
```

*Lignes: 51*

---

### 📄 src\main\java\ink\yowyob\geofence\mapper\GeofenceShareDTOMapper.java

```java
package ink.yowyob.geofence.mapper;

import ink.yowyob.geofence.dto.response.GeofenceShareDTO;
import ink.yowyob.geofence.dto.response.GeofenceZoneSimpleDTO;
import ink.yowyob.geofence.dto.response.UserDTO;
import ink.yowyob.geofence.model.CircleGeofenceZone;
import ink.yowyob.geofence.model.GeofenceShare;
import ink.yowyob.geofence.model.PolygonGeofenceZone;
import org.springframework.stereotype.Service;

import java.util.function.Function;

@Service
public class GeofenceShareDTOMapper implements Function<GeofenceShare, GeofenceShareDTO> {

    private final UserDTOMapper userDTOMapper;

    public GeofenceShareDTOMapper(UserDTOMapper userDTOMapper) {
        this.userDTOMapper = userDTOMapper;
    }

    @Override
    public GeofenceShareDTO apply(GeofenceShare geofenceShare) {
        // Convert geofence zone to simple DTO
        String type = "unknown";
        if (geofenceShare.getGeofenceZone() instanceof CircleGeofenceZone) {
            type = "circle";
        } else if (geofenceShare.getGeofenceZone() instanceof PolygonGeofenceZone) {
            type = "polygon";
        }

        GeofenceZoneSimpleDTO geofenceZoneDTO = new GeofenceZoneSimpleDTO(
                geofenceShare.getGeofenceZone().getId(),
                geofenceShare.getGeofenceZone().getTitle(),
                type
        );

        // Convert users to DTOs
        UserDTO sharedByDTO = userDTOMapper.apply(geofenceShare.getSharedBy());
        UserDTO sharedWithDTO = userDTOMapper.apply(geofenceShare.getSharedWith());

        return new GeofenceShareDTO(
                geofenceShare.getId(),
                geofenceZoneDTO,
                sharedByDTO,
                sharedWithDTO,
                geofenceShare.getSharedAt(),
                geofenceShare.getExpiresAt(),
                geofenceShare.isCanEdit(),
                geofenceShare.getStatus(),
                geofenceShare.getRespondedAt()
        );
    }
}
```

*Lignes: 54*

---

### 📄 src\main\java\ink\yowyob\geofence\mapper\InviteLinkDTOMapper.java

```java
package ink.yowyob.geofence.mapper;

import ink.yowyob.geofence.dto.response.InviteLinkDTO;
import ink.yowyob.geofence.model.GeofenceInviteLink;
import org.springframework.stereotype.Service;

import java.util.function.Function;

@Service
public class InviteLinkDTOMapper implements Function<GeofenceInviteLink, InviteLinkDTO> {

    private final UserDTOMapper userDTOMapper;

    public InviteLinkDTOMapper(UserDTOMapper userDTOMapper) {
        this.userDTOMapper = userDTOMapper;
    }

    @Override
    public InviteLinkDTO apply(GeofenceInviteLink inviteLink) {
        return new InviteLinkDTO(
                inviteLink.getId(),
                inviteLink.getInviteCode(),
                inviteLink.getGeofenceId(),
                inviteLink.getGeofenceType(),
                userDTOMapper.apply(inviteLink.getCreatedBy()),
                inviteLink.getCreatedAt(),
                inviteLink.getExpiresAt(),
                inviteLink.isCanEdit(),
                inviteLink.isActive(),
                inviteLink.getMaxUses(),
                inviteLink.getCurrentUses(),
                inviteLink.isExpired(),
                inviteLink.canBeUsed()
        );
    }
}
```

*Lignes: 36*

---

### 📄 src\main\java\ink\yowyob\geofence\mapper\LocationDTOMapper.java

```java
package ink.yowyob.geofence.mapper;

import ink.yowyob.geofence.dto.PointDTO;
import ink.yowyob.geofence.dto.response.LocationDTO;
import ink.yowyob.geofence.dto.response.SimpleVehicleDTO;
import ink.yowyob.geofence.model.Location;
import ink.yowyob.geofence.service.FileStorageService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.function.Function;

@Service
public class LocationDTOMapper implements Function<Location, LocationDTO> {

    private final FileStorageService fileStorageService;

    public LocationDTOMapper(FileStorageService fileStorageService) {
        this.fileStorageService = fileStorageService;
    }

    @Override
    public LocationDTO apply(Location location) {
        // Convert vehicle to SimpleVehicleDTO
        String imageUrl = location.getVehicle().getImageUrl() != null
                ? fileStorageService.getCompleteImageUrl(location.getVehicle().getImageUrl())
                : null;

        SimpleVehicleDTO vehicleDTO = new SimpleVehicleDTO(
                location.getVehicle().getId(),
                location.getVehicle().getBrand(),
                location.getVehicle().getModel(),
                location.getVehicle().getLicensePlate(),
                imageUrl
        );

        // Convert position to PointDTO
        PointDTO positionDTO = new PointDTO(
                List.of(location.getPosition().getX(), location.getPosition().getY())
        );

        return new LocationDTO(
                location.getId(),
                positionDTO,
                vehicleDTO,
                location.getTimestamp(),
                location.getSpeed(),
                location.getHeading(),
                location.getAltitude(),
                location.getAccuracy(),
                location.getSource()
        );
    }
}
```

*Lignes: 54*

---

### 📄 src\main\java\ink\yowyob\geofence\mapper\PolygonDTOMapper.java

```java
package ink.yowyob.geofence.mapper;

import ink.yowyob.geofence.dto.PolygonDTO;
import ink.yowyob.geofence.dto.response.PolygonGeofenceZoneDTOResponse;
import ink.yowyob.geofence.dto.response.SimpleVehicleDTO;
import ink.yowyob.geofence.model.PolygonGeofenceZone;
import ink.yowyob.geofence.model.Vehicle;
import ink.yowyob.geofence.repository.VehicleRepository;
import ink.yowyob.geofence.service.FileStorageService;
import org.locationtech.jts.geom.Coordinate;
import org.locationtech.jts.geom.Polygon;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

@Service
public class PolygonDTOMapper implements Function<PolygonGeofenceZone, PolygonGeofenceZoneDTOResponse> {
    private final UserDTOMapper userDTOMapper;
    private final VehicleRepository vehicleRepository;
    private final FileStorageService fileStorageService;

    public PolygonDTOMapper(UserDTOMapper userDTOMapper, VehicleRepository vehicleRepository, FileStorageService fileStorageService) {
        this.userDTOMapper = userDTOMapper;
        this.vehicleRepository = vehicleRepository;
        this.fileStorageService = fileStorageService;
    }

    @Override
    public PolygonGeofenceZoneDTOResponse apply(PolygonGeofenceZone polygonGeofenceZone) {
        // Récupérer les véhicules associés à cette zone
        List<SimpleVehicleDTO> vehicles = vehicleRepository.findByGeofenceZonesContaining(polygonGeofenceZone)
                .stream()
                .map(this::mapToSimpleVehicleDTO)
                .collect(Collectors.toList());

        return new PolygonGeofenceZoneDTOResponse(
                polygonGeofenceZone.getId(),
                userDTOMapper.apply(polygonGeofenceZone.getUser()),
                polygonGeofenceZone.getDescription(),
                polygonGeofenceZone.getTitle(),
                "polygon",
                convertToPolygonDTO(polygonGeofenceZone.getPolygon()),
                vehicles,
                // Propriétés intelligentes
                polygonGeofenceZone.getIsTemporalEnabled(),
                polygonGeofenceZone.getStartTime() != null ? polygonGeofenceZone.getStartTime().toString() : null,
                polygonGeofenceZone.getEndTime() != null ? polygonGeofenceZone.getEndTime().toString() : null,
                polygonGeofenceZone.getActiveDays() != null ? 
                    polygonGeofenceZone.getActiveDays().stream().map(Enum::name).toArray(String[]::new) : null,
                polygonGeofenceZone.getIsConditionalEnabled(),
                polygonGeofenceZone.getMaxSpeed(),
                polygonGeofenceZone.getMaxDwellTime(),
                polygonGeofenceZone.getMinDwellTime()
        );
    }

    private SimpleVehicleDTO mapToSimpleVehicleDTO(Vehicle vehicle) {
        String imageUrl = vehicle.getImageUrl() != null
                ? fileStorageService.getCompleteImageUrl(vehicle.getImageUrl())
                : null;

        return new SimpleVehicleDTO(
                vehicle.getId(),
                vehicle.getBrand(),
                vehicle.getModel(),
                vehicle.getLicensePlate(),
                imageUrl
        );
    }

    private PolygonDTO convertToPolygonDTO(Polygon jtsPolygon) {
        List<List<List<Double>>> coordinates = new ArrayList<>();

        // Convert exterior ring
        List<List<Double>> exteriorRing = new ArrayList<>();
        for (Coordinate coord : jtsPolygon.getExteriorRing().getCoordinates()) {
            exteriorRing.add(Arrays.asList(coord.x, coord.y));
        }

        List<List<Double>> ringCoordinates = new ArrayList<>(exteriorRing);
        coordinates.add(ringCoordinates);

        // Add interior rings if present
        for (int i = 0; i < jtsPolygon.getNumInteriorRing(); i++) {
            List<List<Double>> interiorRing = new ArrayList<>();
            for (Coordinate coord : jtsPolygon.getInteriorRingN(i).getCoordinates()) {
                interiorRing.add(Arrays.asList(coord.x, coord.y));
            }
            coordinates.add(interiorRing);
        }

        return new PolygonDTO(coordinates);
    }
}
```

*Lignes: 98*

---

### 📄 src\main\java\ink\yowyob\geofence\mapper\RouteDTOMapper.java

```java
package ink.yowyob.geofence.mapper;

import ink.yowyob.geofence.dto.PointDTO;
import ink.yowyob.geofence.dto.response.RouteDTOResponse;
import ink.yowyob.geofence.dto.response.SimpleVehicleDTO;
import ink.yowyob.geofence.model.Route;
import ink.yowyob.geofence.model.Vehicle;
import ink.yowyob.geofence.repository.VehicleRepository;
import ink.yowyob.geofence.service.FileStorageService;
import org.locationtech.jts.geom.Point;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

@Service
public class RouteDTOMapper implements Function<Route, RouteDTOResponse> {
    private final UserDTOMapper userDTOMapper;
    private final RouteSegmentDTOMapper routeSegmentDTOMapper;
    private final VehicleRepository vehicleRepository;
    private final FileStorageService fileStorageService;

    public RouteDTOMapper(UserDTOMapper userDTOMapper, 
                         RouteSegmentDTOMapper routeSegmentDTOMapper,
                         VehicleRepository vehicleRepository, 
                         FileStorageService fileStorageService) {
        this.userDTOMapper = userDTOMapper;
        this.routeSegmentDTOMapper = routeSegmentDTOMapper;
        this.vehicleRepository = vehicleRepository;
        this.fileStorageService = fileStorageService;
    }

    @Override
    public RouteDTOResponse apply(Route route) {
        return new RouteDTOResponse(
            route.getId(),
            userDTOMapper.apply(route.getUser()),
            route.getName(),
            route.getDescription(),
            convertPointToDTO(route.getStartPoint()),
            route.getStartAddress(),
            convertPointToDTO(route.getEndPoint()),
            route.getEndAddress(),
            route.getEstimatedDistance(),
            route.getEstimatedDuration(),
            route.getDeviationTolerance(),
            
            // Propriétés temporelles
            route.getIsTemporalEnabled(),
            route.getStartTime() != null ? route.getStartTime().toString() : null,
            route.getEndTime() != null ? route.getEndTime().toString() : null,
            safeGetActiveDays(route),
            
            // Segments de route
            safeGetAuthorizedSegments(route),
            
            // Véhicules assignés
            safeGetAssignedVehicles(route),
            
            route.getIsActive(),
            route.getCreatedAt(),
            route.getUpdatedAt()
        );
    }

    private SimpleVehicleDTO mapToSimpleVehicleDTO(Vehicle vehicle) {
        String imageUrl = vehicle.getImageUrl() != null
                ? fileStorageService.getCompleteImageUrl(vehicle.getImageUrl())
                : null;

        return new SimpleVehicleDTO(
                vehicle.getId(),
                vehicle.getBrand(),
                vehicle.getModel(),
                vehicle.getLicensePlate(),
                imageUrl
        );
    }

    private PointDTO convertPointToDTO(Point point) {
        if (point == null) return null;
        return new PointDTO(List.of(point.getX(), point.getY()));
    }
    
    private String[] safeGetActiveDays(Route route) {
        try {
            if (route.getActiveDays() != null && !route.getActiveDays().isEmpty()) {
                return route.getActiveDays().stream().map(Enum::name).toArray(String[]::new);
            }
        } catch (Exception e) {
            // LazyInitializationException or other Hibernate exceptions
        }
        return new String[]{"MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY", "SATURDAY", "SUNDAY"};
    }
    
    private List safeGetAuthorizedSegments(Route route) {
        try {
            if (route.getAuthorizedSegments() != null) {
                return route.getAuthorizedSegments().stream()
                    .map(routeSegmentDTOMapper)
                    .collect(Collectors.toList());
            }
        } catch (Exception e) {
            // LazyInitializationException or other Hibernate exceptions
        }
        return List.of();
    }
    
    private List<SimpleVehicleDTO> safeGetAssignedVehicles(Route route) {
        try {
            if (route.getAssignedVehicles() != null) {
                return route.getAssignedVehicles().stream()
                    .map(this::mapToSimpleVehicleDTO)
                    .collect(Collectors.toList());
            }
        } catch (Exception e) {
            // LazyInitializationException or other Hibernate exceptions
        }
        return List.of();
    }
}
```

*Lignes: 122*

---

### 📄 src\main\java\ink\yowyob\geofence\mapper\RouteSegmentDTOMapper.java

```java
package ink.yowyob.geofence.mapper;

import ink.yowyob.geofence.dto.LineStringDTO;
import ink.yowyob.geofence.dto.response.RouteSegmentDTOResponse;
import ink.yowyob.geofence.model.RouteSegment;
import org.locationtech.jts.geom.Coordinate;
import org.locationtech.jts.geom.LineString;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

@Service
public class RouteSegmentDTOMapper implements Function<RouteSegment, RouteSegmentDTOResponse> {

    @Override
    public RouteSegmentDTOResponse apply(RouteSegment segment) {
        return new RouteSegmentDTOResponse(
            segment.getId(),
            segment.getName(),
            segment.getDescription(),
            convertLineStringToDTO(segment.getPathLine()),
            segment.getSegmentOrder(),
            segment.getSegmentLength(),
            segment.getSegmentType(),
            segment.getPriority(),
            segment.getSpeedLimit(),
            segment.getEstimatedTime(),
            segment.getIsActive(),
            segment.getCreatedAt(),
            segment.getUpdatedAt()
        );
    }

    private LineStringDTO convertLineStringToDTO(LineString lineString) {
        if (lineString == null) return null;
        
        List<List<Double>> coordinates = new ArrayList<>();
        
        for (Coordinate coord : lineString.getCoordinates()) {
            coordinates.add(Arrays.asList(coord.x, coord.y));
        }
        
        return new LineStringDTO(coordinates);
    }
}
```

*Lignes: 48*

---

### 📄 src\main\java\ink\yowyob\geofence\mapper\UserDTOMapper.java

```java
package ink.yowyob.geofence.mapper;

import ink.yowyob.geofence.Enum.UserRole;
import ink.yowyob.geofence.dto.response.UserDTO;
import ink.yowyob.geofence.model.User;
import org.hibernate.Hibernate;
import org.springframework.stereotype.Service;

import java.util.function.Function;

@Service
public class UserDTOMapper implements Function <User, UserDTO> {
    @Override
    public UserDTO apply(User user) {
        // Ensure the role is loaded to avoid LazyInitializationException
        UserRole roleName = null;
        if (user.getRole() != null && Hibernate.isInitialized(user.getRole())) {
            roleName = user.getRole().getName();
        } else if (user.getRole() != null) {
            // Force initialization if in active transaction
            try {
                roleName = user.getRole().getName();
            } catch (Exception e) {
                // If lazy loading fails, set a default or handle gracefully
                roleName = UserRole.USER;
            }
        }
        
        return new UserDTO(
                user.getUuid(),
                user.getUsername(),
                user.getFirstname(),
                user.getLastname(),
                user.getPhoneNumber(),
                user.getEmail(),
                user.getDOB(),
                roleName
        );
    }
}

```

*Lignes: 41*

---

### 📄 src\main\java\ink\yowyob\geofence\mapper\VehicleApiKeyDTOMapper.java

```java
package ink.yowyob.geofence.mapper;

import ink.yowyob.geofence.dto.response.SimpleVehicleDTO;
import ink.yowyob.geofence.dto.response.VehicleApiKeyDTO;
import ink.yowyob.geofence.model.VehicleApiKey;
import ink.yowyob.geofence.service.FileStorageService;
import org.springframework.stereotype.Service;

import java.util.function.Function;

@Service
public class VehicleApiKeyDTOMapper implements Function<VehicleApiKey, VehicleApiKeyDTO> {

    private final FileStorageService fileStorageService;

    public VehicleApiKeyDTOMapper(FileStorageService fileStorageService) {
        this.fileStorageService = fileStorageService;
    }

    @Override
    public VehicleApiKeyDTO apply(VehicleApiKey apiKey) {
        // Convert vehicle to SimpleVehicleDTO
        String imageUrl = apiKey.getVehicle().getImageUrl() != null
                ? fileStorageService.getCompleteImageUrl(apiKey.getVehicle().getImageUrl())
                : null;

        SimpleVehicleDTO vehicleDTO = new SimpleVehicleDTO(
                apiKey.getVehicle().getId(),
                apiKey.getVehicle().getBrand(),
                apiKey.getVehicle().getModel(),
                apiKey.getVehicle().getLicensePlate(),
                imageUrl
        );

        return new VehicleApiKeyDTO(
                apiKey.getId(),
                apiKey.getApiKey(),
                vehicleDTO,
                apiKey.isActive(),
                apiKey.getCreatedAt(),
                apiKey.getLastUsedAt(),
                apiKey.getExpiresAt(),
                apiKey.isExpired(),
                apiKey.isValid()
        );
    }
}
```

*Lignes: 47*

---

### 📄 src\main\java\ink\yowyob\geofence\mapper\VehicleDTOMapper.java

```java
package ink.yowyob.geofence.mapper;

import ink.yowyob.geofence.dto.response.GeofenceZoneSimpleDTO;
import ink.yowyob.geofence.dto.response.UserDTO;
import ink.yowyob.geofence.dto.response.VehicleDTOResponse;
import ink.yowyob.geofence.model.CircleGeofenceZone;
import ink.yowyob.geofence.model.PolygonGeofenceZone;
import ink.yowyob.geofence.model.Vehicle;
import ink.yowyob.geofence.service.FileStorageService;
import org.springframework.stereotype.Service;

import java.util.function.Function;
import java.util.stream.Collectors;

@Service
public class VehicleDTOMapper implements Function<Vehicle, VehicleDTOResponse> {

    private final FileStorageService fileStorageService;

    public VehicleDTOMapper(FileStorageService fileStorageService) {
        this.fileStorageService = fileStorageService;
    }

    @Override
    public VehicleDTOResponse apply(Vehicle vehicle) {
        String imageUrl = vehicle.getImageUrl() != null
                ? fileStorageService.getCompleteImageUrl(vehicle.getImageUrl())
                : null;
        return new VehicleDTOResponse(
                vehicle.getId(),
                vehicle.getBrand(),
                vehicle.getModel(),
                vehicle.getLicensePlate(),
                vehicle.getDescription(),
                imageUrl,
                new UserDTO(
                        vehicle.getUser().getUuid(),
                        vehicle.getUser().getUsername(),
                        vehicle.getUser().getFirstname(),
                        vehicle.getUser().getLastname(),
                        vehicle.getUser().getPhoneNumber(),
                        vehicle.getUser().getEmail(),
                        vehicle.getUser().getDOB(),
                        vehicle.getUser().getRole().getName()
                ),
                vehicle.getGeofenceZones().stream()
                        .map(zone -> new GeofenceZoneSimpleDTO(
                                zone.getId(),
                                zone.getTitle(),
                                zone instanceof CircleGeofenceZone ? "circle" :
                                        (zone instanceof PolygonGeofenceZone ? "polygon" : "unknown")
                        ))
                        .collect(Collectors.toSet())
        );
    }
}
```

*Lignes: 56*

---

### 📄 src\main\java\ink\yowyob\geofence\model\Alert.java

```java
package ink.yowyob.geofence.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.ColumnDefault;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table
@Getter
@Setter
public class Alert {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    
    @ManyToOne
    private AlertType type;
    
    @CreationTimestamp
    @Column(updatable = false)
    private LocalDateTime timestamp;
    
    private String message;
    
    @OneToOne
    private Location location;

    @ManyToOne
    private Vehicle vehicle;

    @ManyToOne
    private GeofenceZone geofenceZone;
    
    // Données additionnelles pour géofence intelligente
    @Column(name = "speed")
    private Double speed; // Vitesse au moment de l'alerte
    
    @Column(name = "dwell_time_minutes")
    private Integer dwellTimeMinutes; // Temps de séjour en minutes
    
    @Column(name = "is_read", nullable = false, columnDefinition = "boolean default false")
    private Boolean isRead = false; // Statut de lecture de l'alerte
    
    @Column(name = "severity", length = 20, nullable = false)
    @ColumnDefault("'INFO'")
    private String severity = "INFO"; // CRITICAL, WARNING, INFO
    
    @Column(name = "additional_data", columnDefinition = "TEXT")
    private String additionalData; // JSON pour données supplémentaires
}

```

*Lignes: 56*

---

### 📄 src\main\java\ink\yowyob\geofence\model\AlertType.java

```java
package ink.yowyob.geofence.model;

import ink.yowyob.geofence.Enum.AlertTypeEnum;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table
public class AlertType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Enumerated(EnumType.STRING)
    private AlertTypeEnum type;
}

```

*Lignes: 23*

---

### 📄 src\main\java\ink\yowyob\geofence\model\CircleGeofenceZone.java

```java
package ink.yowyob.geofence.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import org.locationtech.jts.geom.Point;

@Entity
@Table
@Getter
@Setter
public class CircleGeofenceZone extends GeofenceZone {
    @Column(columnDefinition = "geometry(Point, 4326)")
    private Point center;

    private Double radius;
}

```

*Lignes: 20*

---

### 📄 src\main\java\ink\yowyob\geofence\model\GeofenceFork.java

```java
package ink.yowyob.geofence.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name = "geofence_forks")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class GeofenceFork {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "original_geofence_id", nullable = false)
    private GeofenceZone originalGeofence;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "forked_geofence_id", nullable = false)
    private GeofenceZone forkedGeofence;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "forked_by_user_id", nullable = false)
    private User forkedBy;

    @Column(nullable = false)
    private LocalDateTime forkedAt;

    @Column(length = 500)
    private String forkReason; // Raison optionnelle du fork

    @PrePersist
    protected void onCreate() {
        if (forkedAt == null) {
            forkedAt = LocalDateTime.now();
        }
    }

    // Constructeur utilitaire
    public GeofenceFork(GeofenceZone originalGeofence, GeofenceZone forkedGeofence,
                        User forkedBy, String forkReason) {
        this.originalGeofence = originalGeofence;
        this.forkedGeofence = forkedGeofence;
        this.forkedBy = forkedBy;
        this.forkReason = forkReason;
        this.forkedAt = LocalDateTime.now();
    }
}
```

*Lignes: 58*

---

### 📄 src\main\java\ink\yowyob\geofence\model\GeofenceInviteLink.java

```java
package ink.yowyob.geofence.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name = "geofence_invite_links")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class GeofenceInviteLink {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column(nullable = false, unique = true, length = 12)
    private String inviteCode; // Code unique (12 caractères)

    @Column(nullable = false)
    private UUID geofenceId;

    @Column(nullable = false, length = 1)
    private String geofenceType; // 'c' ou 'p'

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "created_by", nullable = false)
    private User createdBy;

    @Column(nullable = false)
    private LocalDateTime createdAt;

    @Column(nullable = true) // null = durée infinie
    private LocalDateTime expiresAt;

    @Column(nullable = false)
    private boolean canEdit;

    @Column(nullable = false)
    private boolean isActive;

    @Column(nullable = false)
    private int maxUses; // -1 = illimité

    @Column(nullable = false)
    private int currentUses;

    @PrePersist
    protected void onCreate() {
        if (createdAt == null) {
            createdAt = LocalDateTime.now();
        }
    }

    // Méthodes utilitaires
    public boolean isExpired() {
        return expiresAt != null && LocalDateTime.now().isAfter(expiresAt);
    }

    public boolean isUsageLimitReached() {
        return maxUses > 0 && currentUses >= maxUses;
    }

    public boolean canBeUsed() {
        return isActive && !isExpired() && !isUsageLimitReached();
    }
}

```

*Lignes: 75*

---

### 📄 src\main\java\ink\yowyob\geofence\model\GeofenceShare.java

```java
package ink.yowyob.geofence.model;

import ink.yowyob.geofence.Enum.ShareStatus;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table
@Getter
@Setter
public class GeofenceShare {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @ManyToOne
    @JoinColumn(name = "geofence_zone_id")
    private GeofenceZone geofenceZone;

    @ManyToOne
    @JoinColumn(name = "shared_by_user_id")
    private User sharedBy;

    @ManyToOne
    @JoinColumn(name = "shared_with_user_id")
    private User sharedWith;

    private LocalDateTime sharedAt;
    private LocalDateTime expiresAt;
    private boolean canEdit;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private ShareStatus status = ShareStatus.PENDING;

    private LocalDateTime respondedAt;
}
```

*Lignes: 41*

---

### 📄 src\main\java\ink\yowyob\geofence\model\GeofenceZone.java

```java
package ink.yowyob.geofence.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.EnumSet;
import java.util.Set;
import java.util.UUID;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
@Getter
@Setter
public abstract class GeofenceZone {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    private String title;

    private String description;

    @ManyToOne
    @JoinColumn(name = "user_uuid")
    private User user;

    // Géofence intelligente - Configuration temporelle
    @Column(name = "is_temporal_enabled", nullable = false, columnDefinition = "boolean default false")
    private Boolean isTemporalEnabled = false;
    
    @Column(name = "start_time")
    private LocalTime startTime;
    
    @Column(name = "end_time")
    private LocalTime endTime;
    
    @Enumerated(EnumType.STRING)
    @ElementCollection(targetClass = DayOfWeek.class)
    @CollectionTable(name = "geofence_active_days", joinColumns = @JoinColumn(name = "geofence_id"))
    @Column(name = "day_of_week")
    private Set<DayOfWeek> activeDays = EnumSet.allOf(DayOfWeek.class);

    // Géofence intelligente - Configuration conditionnelle
    @Column(name = "is_conditional_enabled", nullable = false, columnDefinition = "boolean default false")
    private Boolean isConditionalEnabled = false;
    
    @Column(name = "max_speed")
    private Double maxSpeed; // Vitesse maximale autorisée en km/h
    
    @Column(name = "max_dwell_time")
    private Integer maxDwellTime; // Temps maximum de séjour en minutes
    
    @Column(name = "min_dwell_time")
    private Integer minDwellTime; // Temps minimum de séjour en minutes

    // Métadonnées
    @CreationTimestamp
    @Column(name = "created_at", updatable = false)
    private LocalDateTime createdAt;

    @UpdateTimestamp
    @Column(name = "updated_at")
    private LocalDateTime updatedAt;

    @Column(name = "is_active", nullable = false, columnDefinition = "boolean default true")
    private Boolean isActive = true;

    // Méthodes utilitaires pour la géofence intelligente
    
    public boolean isActiveAtTime(LocalDateTime dateTime) {
        if (isTemporalEnabled == null || !isTemporalEnabled) {
            return isActive == null ? true : isActive;
        }
        
        DayOfWeek dayOfWeek = dateTime.getDayOfWeek();
        LocalTime timeOfDay = dateTime.toLocalTime();
        
        // Vérifier le jour de la semaine
        if (!activeDays.contains(dayOfWeek)) {
            return false;
        }
        
        // Vérifier l'heure si définie
        if (startTime != null && endTime != null) {
            if (startTime.isBefore(endTime)) {
                // Même jour (ex: 08:00 - 18:00)
                return !timeOfDay.isBefore(startTime) && !timeOfDay.isAfter(endTime);
            } else {
                // Traversée de minuit (ex: 22:00 - 06:00)
                return !timeOfDay.isBefore(startTime) || !timeOfDay.isAfter(endTime);
            }
        }
        
        return isActive == null ? true : isActive;
    }

}


```

*Lignes: 106*

---

### 📄 src\main\java\ink\yowyob\geofence\model\Location.java

```java
// main/java/com/reseau/geofence/model/Location.java
package ink.yowyob.geofence.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.locationtech.jts.geom.Point;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name = "locations")
@Getter
@Setter
@EntityListeners(AuditingEntityListener.class)
public class Location {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column(columnDefinition = "geometry(Point, 4326)", nullable = false)
    private Point position; // Position géographique

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "vehicle_id", nullable = false)
    private Vehicle vehicle;

    @CreatedDate
    @Column(nullable = false, updatable = false)
    private LocalDateTime timestamp; // Horodatage de la position

    @Column
    private Double speed; // Vitesse en km/h (optionnelle)

    @Column
    private Double heading; // Direction en degrés (0-360, optionnelle)

    @Column
    private Double altitude; // Altitude en mètres (optionnelle)

    @Column
    private Double accuracy; // Précision en mètres (optionnelle)

    @Column(length = 500)
    private String source; // Source de la position (GPS, NETWORK, etc.)

    @PrePersist
    protected void onCreate() {
        if (timestamp == null) {
            timestamp = LocalDateTime.now();
        }
    }
}
```

*Lignes: 56*

---

### 📄 src\main\java\ink\yowyob\geofence\model\Organization.java

```java
package ink.yowyob.geofence.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name = "organizations")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EntityListeners(AuditingEntityListener.class)
public class Organization {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column(nullable = false)
    private String name;

    @Column(unique = true)
    private String domain; // easy-rental.com

    @Column(unique = true, nullable = false)
    private String apiKey;

    private String contactEmail;
    private String webhookUrl;

    private boolean isActive = true;
    private boolean isInternal = false; // true pour votre frontend original

    // Subscription & Quotas
    private String subscriptionPlan = "FREE";
    private int maxUsers = 10;
    private int maxVehicles = 50;
    private int maxGeofences = 20;
    private int rateLimitPerHour = 1000;

    @CreatedDate
    @Column(nullable = false, updatable = false)
    private LocalDateTime createdAt;

    private LocalDateTime lastApiCall;

    // Méthodes utilitaires
    public boolean canCreateVehicle(long currentCount) {
        return currentCount < maxVehicles;
    }

    public boolean canCreateGeofence(long currentCount) {
        return currentCount < maxGeofences;
    }
}

```

*Lignes: 63*

---

### 📄 src\main\java\ink\yowyob\geofence\model\OrganizationUser.java

```java
package ink.yowyob.geofence.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name = "organization_users")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EntityListeners(AuditingEntityListener.class)
public class OrganizationUser {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "organization_id", nullable = false)
    private Organization organization;

    @Column(nullable = false)
    private String externalUserId; // ID côté client (Easy-Rental)

    private String email;
    private String name;
    private String role = "USER";
    private boolean isActive = true;

    @CreatedDate
    @Column(nullable = false, updatable = false)
    private LocalDateTime createdAt;

    private LocalDateTime lastLoginAt;
}
```

*Lignes: 43*

---

### 📄 src\main\java\ink\yowyob\geofence\model\PolygonGeofenceZone.java

```java
package ink.yowyob.geofence.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import org.locationtech.jts.geom.Polygon;

@Entity
@Table
@Getter
@Setter
public class PolygonGeofenceZone extends GeofenceZone {
    @Column(columnDefinition = "geometry(Polygon, 4326)")
    private Polygon polygon;
}

```

*Lignes: 18*

---

### 📄 src\main\java\ink\yowyob\geofence\model\Role.java

```java
package ink.yowyob.geofence.model;

import ink.yowyob.geofence.Enum.UserRole;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "role")
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Enumerated(EnumType.STRING)
    private UserRole name;
}

```

*Lignes: 23*

---

### 📄 src\main\java\ink\yowyob\geofence\model\Route.java

```java
package ink.yowyob.geofence.model;

import ink.yowyob.geofence.Enum.DayOfWeek;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;
import org.locationtech.jts.geom.Point;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.*;

@Entity
@Table(name = "routes")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Route {
    @Id
    @GeneratedValue(generator = "uuid2")
    @GenericGenerator(name = "uuid2", strategy = "uuid2")
    private UUID id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @Column(name = "name", nullable = false, length = 100)
    private String name;

    @Column(name = "description", length = 500)
    private String description;

    // Point de départ
    @Column(name = "start_point", columnDefinition = "geometry(Point,4326)")
    private Point startPoint;

    @Column(name = "start_address", length = 255)
    private String startAddress;

    // Point d'arrivée
    @Column(name = "end_point", columnDefinition = "geometry(Point,4326)")
    private Point endPoint;

    @Column(name = "end_address", length = 255)
    private String endAddress;

    // Distance totale estimée en mètres
    @Column(name = "estimated_distance")
    private Double estimatedDistance;

    // Durée estimée en minutes
    @Column(name = "estimated_duration")
    private Integer estimatedDuration;

    // Tolérance d'écart en mètres (distance maximale autorisée par rapport aux segments)
    @Column(name = "deviation_tolerance", nullable = false)
    private Double deviationTolerance = 100.0;

    // Configuration temporelle
    @Column(name = "is_temporal_enabled", nullable = false, columnDefinition = "boolean default false")
    private Boolean isTemporalEnabled = false;

    @Column(name = "start_time")
    private LocalTime startTime;

    @Column(name = "end_time")
    private LocalTime endTime;

    @ElementCollection(targetClass = DayOfWeek.class)
    @CollectionTable(name = "route_active_days", joinColumns = @JoinColumn(name = "route_id"))
    @Column(name = "day_of_week")
    private Set<DayOfWeek> activeDays = EnumSet.allOf(DayOfWeek.class);

    // Segments de route autorisés (routes alternatives)
    @OneToMany(mappedBy = "route", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<RouteSegment> authorizedSegments = new ArrayList<>();

    // Véhicules assignés à cette route
    @ManyToMany(mappedBy = "assignedRoutes", fetch = FetchType.LAZY)
    private Set<Vehicle> assignedVehicles = new HashSet<>();

    // Statut de la route
    @Column(name = "is_active", nullable = false, columnDefinition = "boolean default true")
    private Boolean isActive = true;

    // Métadonnées
    @Column(name = "created_at", nullable = false, updatable = false)
    private LocalDateTime createdAt;

    @Column(name = "updated_at")
    private LocalDateTime updatedAt;

    @PrePersist
    protected void onCreate() {
        createdAt = LocalDateTime.now();
        updatedAt = LocalDateTime.now();
    }

    @PreUpdate
    protected void onUpdate() {
        updatedAt = LocalDateTime.now();
    }

    // Méthodes utilitaires

    /**
     * Vérifie si la route est active à un moment donné
     */
    public boolean isActiveAt(LocalDateTime dateTime) {
        if (!isActive) {
            return false;
        }

        if (!isTemporalEnabled) {
            return true;
        }

        DayOfWeek dayOfWeek = DayOfWeek.from(dateTime.getDayOfWeek());
        LocalTime timeOfDay = dateTime.toLocalTime();

        // Vérifier le jour de la semaine
        if (!activeDays.contains(dayOfWeek)) {
            return false;
        }

        // Vérifier l'heure si configurée
        if (startTime != null && endTime != null) {
            if (startTime.isBefore(endTime)) {
                // Même jour
                return !timeOfDay.isBefore(startTime) && !timeOfDay.isAfter(endTime);
            } else {
                // Chevauchement minuit
                return !timeOfDay.isBefore(startTime) || !timeOfDay.isAfter(endTime);
            }
        }

        return true;
    }

    /**
     * Calcule la distance totale des segments autorisés
     */
    public double getTotalAuthorizedDistance() {
        return authorizedSegments.stream()
                .mapToDouble(RouteSegment::getSegmentLength)
                .sum();
    }

    /**
     * Vérifie si un point est dans la tolérance d'écart d'un des segments
     */
    public boolean isPointWithinTolerance(Point point) {
        return authorizedSegments.stream()
                .anyMatch(segment -> segment.isPointWithinTolerance(point, deviationTolerance));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Route route = (Route) o;
        return Objects.equals(id, route.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Route{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", startAddress='" + startAddress + '\'' +
                ", endAddress='" + endAddress + '\'' +
                ", isActive=" + isActive +
                '}';
    }
}
```

*Lignes: 183*

---

### 📄 src\main\java\ink\yowyob\geofence\model\RouteSegment.java

```java
package ink.yowyob.geofence.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;
import org.locationtech.jts.geom.LineString;
import org.locationtech.jts.geom.Point;

import java.time.LocalDateTime;
import java.util.Objects;
import java.util.UUID;

@Entity
@Table(name = "route_segments")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class RouteSegment {
    @Id
    @GeneratedValue(generator = "uuid2")
    @GenericGenerator(name = "uuid2", strategy = "uuid2")
    private UUID id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "route_id", nullable = false)
    private Route route;

    @Column(name = "name", length = 100)
    private String name;

    @Column(name = "description", length = 500)
    private String description;

    // Géométrie du segment (ligne)
    @Column(name = "path_line", columnDefinition = "geometry(LineString,4326)", nullable = false)
    private LineString pathLine;

    // Ordre du segment dans la route (pour les routes séquentielles)
    @Column(name = "segment_order")
    private Integer segmentOrder;

    // Longueur du segment en mètres
    @Column(name = "segment_length", nullable = false)
    private Double segmentLength;

    // Type de segment
    @Enumerated(EnumType.STRING)
    @Column(name = "segment_type", nullable = false)
    private RouteSegmentType segmentType = RouteSegmentType.MAIN_ROUTE;

    // Priorité du segment (pour les routes alternatives)
    @Column(name = "priority", nullable = false)
    private Integer priority = 1;

    // Limite de vitesse pour ce segment (optionnel)
    @Column(name = "speed_limit")
    private Double speedLimit;

    // Temps estimé pour parcourir ce segment (en minutes)
    @Column(name = "estimated_time")
    private Integer estimatedTime;

    // Statut du segment
    @Column(name = "is_active", nullable = false, columnDefinition = "boolean default true")
    private Boolean isActive = true;

    // Métadonnées
    @Column(name = "created_at", nullable = false, updatable = false)
    private LocalDateTime createdAt;

    @Column(name = "updated_at")
    private LocalDateTime updatedAt;

    @PrePersist
    protected void onCreate() {
        createdAt = LocalDateTime.now();
        updatedAt = LocalDateTime.now();
        
        // Calculer automatiquement la longueur du segment
        if (pathLine != null && segmentLength == null) {
            segmentLength = calculateSegmentLength();
        }
    }

    @PreUpdate
    protected void onUpdate() {
        updatedAt = LocalDateTime.now();
        
        // Recalculer la longueur si le path a changé
        if (pathLine != null) {
            segmentLength = calculateSegmentLength();
        }
    }

    // Énumération pour les types de segments
    public enum RouteSegmentType {
        MAIN_ROUTE("Route principale"),
        ALTERNATIVE_ROUTE("Route alternative"),
        BYPASS_ROUTE("Route de contournement"),
        EMERGENCY_ROUTE("Route d'urgence");

        private final String description;

        RouteSegmentType(String description) {
            this.description = description;
        }

        public String getDescription() {
            return description;
        }
    }

    // Méthodes utilitaires

    /**
     * Calcule la longueur du segment en mètres
     */
    private double calculateSegmentLength() {
        if (pathLine == null) return 0.0;
        
        // Utiliser la projection sphéroïdale pour une mesure précise
        // Pour simplifier, on utilise une approximation basée sur les coordonnées
        double totalDistance = 0.0;
        
        for (int i = 0; i < pathLine.getNumPoints() - 1; i++) {
            Point p1 = pathLine.getPointN(i);
            Point p2 = pathLine.getPointN(i + 1);
            totalDistance += calculateDistanceBetweenPoints(p1, p2);
        }
        
        return totalDistance;
    }

    /**
     * Calcule la distance entre deux points en mètres (formule haversine simplifiée)
     */
    private double calculateDistanceBetweenPoints(Point p1, Point p2) {
        double lat1 = Math.toRadians(p1.getY());
        double lon1 = Math.toRadians(p1.getX());
        double lat2 = Math.toRadians(p2.getY());
        double lon2 = Math.toRadians(p2.getX());

        double dLat = lat2 - lat1;
        double dLon = lon2 - lon1;

        double a = Math.sin(dLat / 2) * Math.sin(dLat / 2) +
                   Math.cos(lat1) * Math.cos(lat2) *
                   Math.sin(dLon / 2) * Math.sin(dLon / 2);

        double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1 - a));
        double earthRadius = 6371000; // Rayon de la Terre en mètres

        return earthRadius * c;
    }

    /**
     * Vérifie si un point est dans la tolérance d'écart de ce segment
     */
    public boolean isPointWithinTolerance(Point point, double toleranceMeters) {
        if (pathLine == null || point == null) return false;
        
        // Calculer la distance minimale du point à la ligne
        double minDistance = pathLine.distance(point);
        
        // Convertir la tolérance en degrés approximativement
        // 1 degré ≈ 111000 mètres à l'équateur
        double toleranceDegrees = toleranceMeters / 111000.0;
        
        return minDistance <= toleranceDegrees;
    }

    /**
     * Obtient le point le plus proche sur ce segment pour un point donné
     */
    public Point getClosestPointOnSegment(Point point) {
        if (pathLine == null || point == null) return null;
        
        // Trouver le point le plus proche sur la ligne
        double minDistance = Double.MAX_VALUE;
        Point closestPoint = null;
        
        for (int i = 0; i < pathLine.getNumPoints(); i++) {
            Point segmentPoint = pathLine.getPointN(i);
            double distance = point.distance(segmentPoint);
            
            if (distance < minDistance) {
                minDistance = distance;
                closestPoint = segmentPoint;
            }
        }
        
        return closestPoint;
    }

    /**
     * Calcule le pourcentage de progression sur ce segment pour un point donné
     */
    public double getProgressPercentage(Point point) {
        if (pathLine == null || point == null) return 0.0;
        
        Point closestPoint = getClosestPointOnSegment(point);
        if (closestPoint == null) return 0.0;
        
        // Calculer la distance du début du segment au point le plus proche
        Point startPoint = pathLine.getPointN(0);
        double distanceToClosest = calculateDistanceBetweenPoints(startPoint, closestPoint);
        
        if (segmentLength == 0) return 0.0;
        
        return Math.min(100.0, (distanceToClosest / segmentLength) * 100.0);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RouteSegment that = (RouteSegment) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "RouteSegment{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", segmentType=" + segmentType +
                ", segmentLength=" + segmentLength +
                ", priority=" + priority +
                ", isActive=" + isActive +
                '}';
    }
}
```

*Lignes: 239*

---

### 📄 src\main\java\ink\yowyob\geofence\model\User.java

```java
package ink.yowyob.geofence.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Collection;
import java.util.Collections;
import java.util.UUID;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "users")
@EntityListeners(AuditingEntityListener.class) // Activer l'auditing pour cette entité
public class User implements UserDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID uuid;

    @Column(nullable = false)
    private String password;

    @Column(unique = true, nullable = false)
    private String username;
    private String firstname;
    private String lastname;

    @Column(nullable = false)
    private LocalDate DOB;

    @Column(unique = true, nullable = false)
    private String phoneNumber;

    @Column(unique = true, nullable = false)
    private String email;

    private boolean accountNonExpired = true; // Le compte n'est pas expiré par défaut
    private boolean accountNonLocked = true; // Le compte n'est pas verrouillé par défaut
    private boolean credentialsNonExpired = true; // Les credentials ne sont pas expirés par défaut
    private boolean enabled = false; // Le compte est activé par défaut

    @ManyToOne
    private Role role;

    @CreatedDate
    @Column(nullable = false, updatable = false)
    private LocalDateTime createdAt;

    @LastModifiedDate
    @Column(nullable = false)
    private LocalDateTime updatedAt;

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return Collections.singletonList(new SimpleGrantedAuthority("ROLE_" + this.role.getName()));
    }

    @Override
    public String getPassword() {
        return this.password;
    }

    @Override
    public String getUsername() {
        return this.username;
    }

    @Override
    public boolean isAccountNonExpired() {
        return this.accountNonExpired;
    }

    @Override
    public boolean isAccountNonLocked() {
        return this.accountNonLocked;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return this.credentialsNonExpired;
    }

    @Override
    public boolean isEnabled() {
        return this.enabled;
    }
}
```

*Lignes: 101*

---

### 📄 src\main\java\ink\yowyob\geofence\model\Validation.java

```java
package ink.yowyob.geofence.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.Instant;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "validation")
public class Validation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Instant creation;
    private Instant expiration;
    private Instant activation;
    private String verificationToken;
    @OneToOne(cascade = CascadeType.ALL)
    private User user;

}

```

*Lignes: 29*

---

### 📄 src\main\java\ink\yowyob\geofence\model\Vehicle.java

```java
package ink.yowyob.geofence.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

@Entity
@Table
@Getter
@Setter
public class Vehicle {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    private String brand;
    private String model;
    private String licensePlate;
    private String description;

    @ManyToOne
    @JoinColumn(name = "user_uuid")
    private User user;

    @ManyToMany
    @JoinTable(
            name = "vehicle_geofence_zones",
            joinColumns = @JoinColumn(name = "vehicle_id"),
            inverseJoinColumns = @JoinColumn(name = "geofence_zone_id")
    )
    private Set<GeofenceZone> geofenceZones = new HashSet<>();

    @ManyToMany
    @JoinTable(
            name = "vehicle_assigned_routes",
            joinColumns = @JoinColumn(name = "vehicle_id"),
            inverseJoinColumns = @JoinColumn(name = "route_id")
    )
    private Set<Route> assignedRoutes = new HashSet<>();

    private String imageUrl;

}
```

*Lignes: 47*

---

### 📄 src\main\java\ink\yowyob\geofence\model\VehicleApiKey.java

```java
package ink.yowyob.geofence.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name = "vehicle_api_keys")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@EntityListeners(AuditingEntityListener.class)
public class VehicleApiKey {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column(nullable = false, unique = true, length = 64)
    private String apiKey; // Clé API unique pour le véhicule

    @OneToOne
    @JoinColumn(name = "vehicle_id", nullable = false, unique = true)
    private Vehicle vehicle;

    @Column(nullable = false)
    private boolean isActive = true;

    @CreatedDate
    @Column(nullable = false, updatable = false)
    private LocalDateTime createdAt;

    @Column
    private LocalDateTime lastUsedAt; // Dernière utilisation de la clé

    @Column
    private LocalDateTime expiresAt; // Date d'expiration optionnelle

    @PrePersist
    protected void onCreate() {
        if (createdAt == null) {
            createdAt = LocalDateTime.now();
        }
    }

    // Méthodes utilitaires
    public boolean isExpired() {
        return expiresAt != null && LocalDateTime.now().isAfter(expiresAt);
    }

    public boolean isValid() {
        return isActive && !isExpired();
    }

    public void updateLastUsed() {
        this.lastUsedAt = LocalDateTime.now();
    }
}
```

*Lignes: 66*

---

### 📄 src\main\java\ink\yowyob\geofence\repository\AlertRepository.java

```java
package ink.yowyob.geofence.repository;

import ink.yowyob.geofence.model.Alert;
import ink.yowyob.geofence.model.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

@Repository
public interface AlertRepository extends JpaRepository <Alert, UUID>{
    List<Alert> findByVehicle(Vehicle vehicle);
    List<Alert> findByVehicleInOrderByTimestampDesc(List<Vehicle> vehicles);
    List<Alert> findAllByOrderByTimestampDesc();
    
    // Nouvelles méthodes pour le dashboard
    long countByVehicleIn(List<Vehicle> vehicles);
    long countByVehicleInAndTimestampAfter(List<Vehicle> vehicles, LocalDateTime timestamp);
    
    // Méthodes pour récupérer les alertes récentes
    @Query("SELECT a FROM Alert a WHERE a.vehicle IN :vehicles AND a.timestamp >= :since ORDER BY a.timestamp DESC")
    List<Alert> findRecentAlertsByVehicles(@Param("vehicles") List<Vehicle> vehicles, @Param("since") LocalDateTime since);
}

```

*Lignes: 28*

---

### 📄 src\main\java\ink\yowyob\geofence\repository\AlertTypeRepository.java

```java
package ink.yowyob.geofence.repository;

import ink.yowyob.geofence.Enum.AlertTypeEnum;
import ink.yowyob.geofence.model.AlertType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface AlertTypeRepository extends JpaRepository <AlertType, Long> {
    Optional<AlertType> findByType(AlertTypeEnum type);
}
```

*Lignes: 13*

---

### 📄 src\main\java\ink\yowyob\geofence\repository\CircleGeofenceZoneRepository.java

```java
package ink.yowyob.geofence.repository;

import ink.yowyob.geofence.model.CircleGeofenceZone;
import ink.yowyob.geofence.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface CircleGeofenceZoneRepository extends JpaRepository <CircleGeofenceZone, UUID> {
    List<CircleGeofenceZone> findByUser(User user);
}

```

*Lignes: 15*

---

### 📄 src\main\java\ink\yowyob\geofence\repository\GeofenceForkRepository.java

```java
package ink.yowyob.geofence.repository;

import ink.yowyob.geofence.model.GeofenceFork;
import ink.yowyob.geofence.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository
public interface GeofenceForkRepository extends JpaRepository<GeofenceFork, UUID> {

    // Trouver les forks d'une géofence originale
    List<GeofenceFork> findByOriginalGeofenceIdOrderByForkedAtDesc(UUID originalGeofenceId);

    // Trouver l'original d'une géofence forkée
    Optional<GeofenceFork> findByForkedGeofenceId(UUID forkedGeofenceId);

    // Trouver tous les forks créés par un utilisateur
    List<GeofenceFork> findByForkedByOrderByForkedAtDesc(User user);

    // Compter les forks d'une géofence
    long countByOriginalGeofenceId(UUID originalGeofenceId);

    // Vérifier si une géofence a été forkée
    boolean existsByOriginalGeofenceId(UUID originalGeofenceId);

    // Vérifier si une géofence est un fork
    boolean existsByForkedGeofenceId(UUID forkedGeofenceId);

    // Requête complexe pour obtenir la chaîne de forks
    @Query("SELECT gf FROM GeofenceFork gf WHERE gf.originalGeofence.id = :geofenceId OR gf.forkedGeofence.id = :geofenceId")
    List<GeofenceFork> findForkChain(@Param("geofenceId") UUID geofenceId);
}
```

*Lignes: 38*

---

### 📄 src\main\java\ink\yowyob\geofence\repository\GeofenceInviteLinkRepository.java

```java
package ink.yowyob.geofence.repository;

import ink.yowyob.geofence.model.GeofenceInviteLink;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository
public interface GeofenceInviteLinkRepository extends JpaRepository<GeofenceInviteLink, UUID> {

    Optional<GeofenceInviteLink> findByInviteCodeAndIsActiveTrue(String inviteCode);

    List<GeofenceInviteLink> findByGeofenceIdAndGeofenceTypeAndIsActiveTrueOrderByCreatedAtDesc(
            UUID geofenceId, String geofenceType);

    List<GeofenceInviteLink> findByCreatedByUuidOrderByCreatedAtDesc(UUID userId);

    @Query("SELECT il FROM GeofenceInviteLink il WHERE il.createdBy.uuid = :userId AND il.geofenceId = :geofenceId AND il.geofenceType = :type AND il.isActive = true")
    List<GeofenceInviteLink> findActiveInviteLinksForGeofence(
            @Param("userId") UUID userId,
            @Param("geofenceId") UUID geofenceId,
            @Param("type") String type);

    boolean existsByInviteCode(String inviteCode);
}
```

*Lignes: 30*

---

### 📄 src\main\java\ink\yowyob\geofence\repository\GeofenceShareRepository.java

```java
package ink.yowyob.geofence.repository;

import ink.yowyob.geofence.Enum.ShareStatus;
import ink.yowyob.geofence.model.GeofenceShare;
import ink.yowyob.geofence.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

@Repository
public interface GeofenceShareRepository extends JpaRepository<GeofenceShare, UUID> {
    List<GeofenceShare> findBySharedWith(User user);
    List<GeofenceShare> findBySharedWithAndExpiresAtAfter(User user, LocalDateTime dateTime);
    List<GeofenceShare> findBySharedBy(User user);

    // Méthodes pour les invitations avec status
    List<GeofenceShare> findBySharedWithAndStatus(User user, ShareStatus status);
    List<GeofenceShare> findBySharedWithAndStatusAndExpiresAtAfter(User user, ShareStatus status, LocalDateTime dateTime);

    // Invitations en attente
    List<GeofenceShare> findBySharedWithAndStatusOrderBySharedAtDesc(User user, ShareStatus status);

    // MÉTHODES EXISTANTES POUR LES INVITATIONS
    @Query("SELECT CASE WHEN COUNT(gs) > 0 THEN true ELSE false END FROM GeofenceShare gs WHERE gs.geofenceZone.id = :geofenceId AND gs.sharedWith = :user")
    boolean existsByGeofenceZoneIdAndSharedWith(@Param("geofenceId") UUID geofenceId, @Param("user") User user);

    @Query("SELECT gs FROM GeofenceShare gs WHERE gs.geofenceZone.id = :geofenceId AND gs.sharedWith = :user")
    List<GeofenceShare> findByGeofenceZoneIdAndSharedWith(@Param("geofenceId") UUID geofenceId, @Param("user") User user);
}
```

*Lignes: 34*

---

### 📄 src\main\java\ink\yowyob\geofence\repository\GeofenceZoneRepository.java

```java
package ink.yowyob.geofence.repository;

import ink.yowyob.geofence.model.GeofenceZone;
import ink.yowyob.geofence.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface GeofenceZoneRepository extends JpaRepository<GeofenceZone, UUID> {
    
    /**
     * Compter le nombre total de géofences pour un utilisateur
     */
    @Query(value = """
            SELECT COUNT(*) FROM (
                SELECT id FROM circle_geofence_zone WHERE user_uuid = :#{#user.uuid}
                UNION ALL
                SELECT id FROM polygon_geofence_zone WHERE user_uuid = :#{#user.uuid}
            ) AS combined_zones
            """, nativeQuery = true)
    int countByUser(@Param("user") User user);
}
```

*Lignes: 26*

---

### 📄 src\main\java\ink\yowyob\geofence\repository\LocationRepository.java

```java
package ink.yowyob.geofence.repository;

import ink.yowyob.geofence.model.Location;
import ink.yowyob.geofence.model.Vehicle;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository
public interface LocationRepository extends JpaRepository<Location, UUID> {

    // Trouver les dernières positions d'un véhicule
    Page<Location> findByVehicleOrderByTimestampDesc(Vehicle vehicle, Pageable pageable);

    // Trouver la dernière position d'un véhicule
    Optional<Location> findTopByVehicleOrderByTimestampDesc(Vehicle vehicle);

    // Trouver les positions d'un véhicule dans une période
    @Query("SELECT l FROM Location l WHERE l.vehicle = :vehicle AND l.timestamp BETWEEN :startTime AND :endTime ORDER BY l.timestamp DESC")
    List<Location> findByVehicleAndTimestampBetween(
            @Param("vehicle") Vehicle vehicle,
            @Param("startTime") LocalDateTime startTime,
            @Param("endTime") LocalDateTime endTime
    );

    // Trouver toutes les dernières positions par véhicule
    @Query("SELECT l FROM Location l WHERE l.id IN (SELECT MAX(l2.id) FROM Location l2 GROUP BY l2.vehicle.id)")
    List<Location> findLatestLocationsByVehicle();

    // Compter les positions d'un véhicule
    long countByVehicle(Vehicle vehicle);

    // Supprimer les anciennes positions (pour nettoyage)
    void deleteByTimestampBefore(LocalDateTime timestamp);

    /**
     * Trouve la position précédente d'un véhicule (excluant une position spécifique)
     */
    @Query("SELECT l FROM Location l WHERE l.vehicle = :vehicle AND l.id != :excludeId ORDER BY l.timestamp DESC LIMIT 1")
    Optional<Location> findTopByVehicleAndIdNotOrderByTimestampDesc(
            @Param("vehicle") Vehicle vehicle,
            @Param("excludeId") UUID excludeId
    );

    /**
     * Trouve la position précédente d'un véhicule avant un timestamp donné
     */
    @Query("SELECT l FROM Location l WHERE l.vehicle = :vehicle AND l.timestamp < :beforeTimestamp ORDER BY l.timestamp DESC LIMIT 1")
    Optional<Location> findTopByVehicleAndTimestampBeforeOrderByTimestampDesc(
            @Param("vehicle") Vehicle vehicle,
            @Param("beforeTimestamp") LocalDateTime beforeTimestamp
    );

    /**
     * Trouve les positions d'un véhicule avec fetch join pour éviter le lazy loading
     */
    @Query("SELECT l FROM Location l JOIN FETCH l.vehicle WHERE l.vehicle = :vehicle ORDER BY l.timestamp DESC")
    Page<Location> findByVehicleOrderByTimestampDescWithVehicle(Vehicle vehicle, Pageable pageable);

    /**
     * Trouve la dernière position d'un véhicule avec fetch join pour éviter le lazy loading
     */
    @Query("SELECT l FROM Location l JOIN FETCH l.vehicle WHERE l.vehicle = :vehicle ORDER BY l.timestamp DESC")
    List<Location> findByVehicleOrderByTimestampDescWithVehicleList(Vehicle vehicle, Pageable pageable);
    
    /**
     * Trouve la première entrée d'un véhicule dans une zone (pour calcul temps de séjour)
     * Note: Requête simplifiée - la logique complète sera dans le service
     */
    @Query("SELECT l FROM Location l WHERE l.vehicle = :vehicle AND l.timestamp < :exitTime ORDER BY l.timestamp ASC")
    Optional<Location> findFirstEntryIntoGeofence(
            @Param("vehicle") Vehicle vehicle, 
            @Param("geofenceId") UUID geofenceId, 
            @Param("exitTime") LocalDateTime exitTime
    );
}

```

*Lignes: 85*

---

### 📄 src\main\java\ink\yowyob\geofence\repository\PolygonGeofenceZoneRepository.java

```java
package ink.yowyob.geofence.repository;

import ink.yowyob.geofence.model.PolygonGeofenceZone;
import ink.yowyob.geofence.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.UUID;

public interface PolygonGeofenceZoneRepository extends JpaRepository<PolygonGeofenceZone, UUID> {
    List<PolygonGeofenceZone> findByUser(User user);
}

```

*Lignes: 13*

---

### 📄 src\main\java\ink\yowyob\geofence\repository\RoleRepository.java

```java
package ink.yowyob.geofence.repository;

import ink.yowyob.geofence.Enum.UserRole;
import ink.yowyob.geofence.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RoleRepository extends JpaRepository<Role, Integer> {
    Optional<Role> findByName(UserRole name);
}

```

*Lignes: 12*

---

### 📄 src\main\java\ink\yowyob\geofence\repository\RouteRepository.java

```java
package ink.yowyob.geofence.repository;

import ink.yowyob.geofence.model.Route;
import ink.yowyob.geofence.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository
public interface RouteRepository extends JpaRepository<Route, UUID> {
    
    @Query("SELECT r FROM Route r " +
           "JOIN FETCH r.user u " +
           "JOIN FETCH u.role " +
           "LEFT JOIN FETCH r.activeDays " +
           "LEFT JOIN FETCH r.authorizedSegments " +
           "LEFT JOIN FETCH r.assignedVehicles " +
           "WHERE r.user = :user")
    List<Route> findByUser(@Param("user") User user);
    
    @Query("SELECT r FROM Route r " +
           "JOIN FETCH r.user u " +
           "JOIN FETCH u.role " +
           "LEFT JOIN FETCH r.activeDays " +
           "LEFT JOIN FETCH r.authorizedSegments " +
           "LEFT JOIN FETCH r.assignedVehicles " +
           "WHERE r.user = :user AND r.isActive = :isActive")
    List<Route> findByUserAndIsActive(@Param("user") User user, @Param("isActive") Boolean isActive);
    
    @Query("SELECT r FROM Route r " +
           "JOIN FETCH r.user u " +
           "JOIN FETCH u.role " +
           "LEFT JOIN FETCH r.activeDays " +
           "LEFT JOIN FETCH r.authorizedSegments " +
           "LEFT JOIN FETCH r.assignedVehicles " +
           "WHERE r.isActive = :isActive")
    List<Route> findByIsActive(@Param("isActive") Boolean isActive);
    
    @Query("SELECT r FROM Route r " +
           "JOIN FETCH r.user u " +
           "JOIN FETCH u.role " +
           "LEFT JOIN FETCH r.activeDays " +
           "LEFT JOIN FETCH r.authorizedSegments " +
           "LEFT JOIN FETCH r.assignedVehicles " +
           "WHERE r.user = :user AND r.isActive = true")
    List<Route> findActiveRoutesByUser(@Param("user") User user);
    
    @Query("SELECT r FROM Route r " +
           "JOIN FETCH r.user u " +
           "JOIN FETCH u.role " +
           "LEFT JOIN FETCH r.activeDays " +
           "LEFT JOIN FETCH r.authorizedSegments " +
           "JOIN FETCH r.assignedVehicles v " +
           "WHERE v.id = :vehicleId AND r.isActive = true")
    List<Route> findActiveRoutesByVehicleId(@Param("vehicleId") UUID vehicleId);
    
    @Query("SELECT r FROM Route r " +
           "JOIN FETCH r.user u " +
           "JOIN FETCH u.role " +
           "LEFT JOIN FETCH r.activeDays " +
           "LEFT JOIN FETCH r.authorizedSegments " +
           "LEFT JOIN FETCH r.assignedVehicles " +
           "WHERE r.user = :user AND " +
           "(LOWER(r.name) LIKE LOWER(CONCAT('%', :keyword, '%')) OR " +
           "LOWER(r.description) LIKE LOWER(CONCAT('%', :keyword, '%')) OR " +
           "LOWER(r.startAddress) LIKE LOWER(CONCAT('%', :keyword, '%')) OR " +
           "LOWER(r.endAddress) LIKE LOWER(CONCAT('%', :keyword, '%')))")
    List<Route> searchUserRoutes(@Param("user") User user, @Param("keyword") String keyword);
    
    @Query("SELECT COUNT(r) FROM Route r WHERE r.user = :user AND r.isActive = true")
    Long countActiveRoutesByUser(@Param("user") User user);
    
    @Query("SELECT r FROM Route r " +
           "JOIN FETCH r.user u " +
           "JOIN FETCH u.role " +
           "LEFT JOIN FETCH r.activeDays " +
           "LEFT JOIN FETCH r.authorizedSegments " +
           "LEFT JOIN FETCH r.assignedVehicles " +
           "WHERE r.id = :id")
    Optional<Route> findByIdWithUserAndRole(@Param("id") UUID id);
    
    @Query("SELECT r FROM Route r " +
           "JOIN FETCH r.user u " +
           "JOIN FETCH u.role " +
           "LEFT JOIN FETCH r.activeDays " +
           "LEFT JOIN FETCH r.authorizedSegments " +
           "LEFT JOIN FETCH r.assignedVehicles")
    List<Route> findAllWithUserAndRole();
}
```

*Lignes: 94*

---

### 📄 src\main\java\ink\yowyob\geofence\repository\RouteSegmentRepository.java

```java
package ink.yowyob.geofence.repository;

import ink.yowyob.geofence.model.Route;
import ink.yowyob.geofence.model.RouteSegment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface RouteSegmentRepository extends JpaRepository<RouteSegment, UUID> {
    
    List<RouteSegment> findByRoute(Route route);
    
    List<RouteSegment> findByRouteAndIsActive(Route route, Boolean isActive);
    
    @Query("SELECT rs FROM RouteSegment rs WHERE rs.route = :route AND rs.isActive = true ORDER BY rs.segmentOrder ASC, rs.priority DESC")
    List<RouteSegment> findActiveSegmentsByRouteOrderedByOrderAndPriority(@Param("route") Route route);
    
    @Query("SELECT rs FROM RouteSegment rs WHERE rs.route = :route AND rs.segmentType = :segmentType AND rs.isActive = true")
    List<RouteSegment> findActiveSegmentsByRouteAndType(@Param("route") Route route, @Param("segmentType") RouteSegment.RouteSegmentType segmentType);
    
    @Query("SELECT rs FROM RouteSegment rs WHERE rs.route.id = :routeId AND rs.isActive = true ORDER BY rs.priority DESC")
    List<RouteSegment> findActiveSegmentsByRouteIdOrderedByPriority(@Param("routeId") UUID routeId);
    
    @Query("SELECT SUM(rs.segmentLength) FROM RouteSegment rs WHERE rs.route = :route AND rs.isActive = true")
    Double getTotalLengthByRoute(@Param("route") Route route);
    
    @Query("SELECT SUM(rs.estimatedTime) FROM RouteSegment rs WHERE rs.route = :route AND rs.isActive = true")
    Integer getTotalEstimatedTimeByRoute(@Param("route") Route route);
}
```

*Lignes: 34*

---

### 📄 src\main\java\ink\yowyob\geofence\repository\UserRepository.java

```java
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

```

*Lignes: 21*

---

### 📄 src\main\java\ink\yowyob\geofence\repository\VehicleApiKeyRepository.java

```java
package ink.yowyob.geofence.repository;

import ink.yowyob.geofence.model.Vehicle;
import ink.yowyob.geofence.model.VehicleApiKey;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.UUID;

@Repository
public interface VehicleApiKeyRepository extends JpaRepository<VehicleApiKey, UUID> {

    Optional<VehicleApiKey> findByApiKeyAndIsActiveTrue(String apiKey);

    Optional<VehicleApiKey> findByVehicle(Vehicle vehicle);

    Optional<VehicleApiKey> findByVehicleId(UUID vehicleId);

    boolean existsByApiKey(String apiKey);

    @Modifying
    @Query("UPDATE VehicleApiKey v SET v.isActive = false WHERE v.vehicle.id = :vehicleId")
    void deactivateByVehicleId(@Param("vehicleId") UUID vehicleId);

    @Modifying
    @Query("UPDATE VehicleApiKey v SET v.lastUsedAt = CURRENT_TIMESTAMP WHERE v.apiKey = :apiKey")
    void updateLastUsed(@Param("apiKey") String apiKey);
}
```

*Lignes: 32*

---

### 📄 src\main\java\ink\yowyob\geofence\repository\VehicleRepository.java

```java
package ink.yowyob.geofence.repository;

import ink.yowyob.geofence.model.GeofenceZone;
import ink.yowyob.geofence.model.User;
import ink.yowyob.geofence.model.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface VehicleRepository extends JpaRepository <Vehicle, UUID> {
    List<Vehicle> findByUser(User user);
    List<Vehicle> findByGeofenceZonesContaining(GeofenceZone geofenceZone);
}

```

*Lignes: 17*

---

### 📄 src\main\java\ink\yowyob\geofence\security\ConfigurationSecurityApplication.java

```java
package ink.yowyob.geofence.security;

import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.http.HttpMethod;
import org.springframework.security.authentication.ReactiveAuthenticationManager;
import org.springframework.security.config.annotation.web.reactive.EnableWebFluxSecurity;
import org.springframework.security.config.web.server.SecurityWebFiltersOrder;
import org.springframework.security.config.web.server.ServerHttpSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.server.SecurityWebFilterChain;
import org.springframework.security.web.server.authentication.AuthenticationWebFilter;
import org.springframework.security.web.server.authentication.ServerAuthenticationConverter;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.reactive.CorsConfigurationSource;
import org.springframework.web.cors.reactive.UrlBasedCorsConfigurationSource;

import java.util.Arrays;
import java.util.List;

@Configuration
@EnableJpaAuditing
@EnableWebFluxSecurity
@RequiredArgsConstructor
public class ConfigurationSecurityApplication {

    @Bean
    public SecurityWebFilterChain springSecurityFilterChain(
            ServerHttpSecurity http,
            ReactiveAuthenticationManager authenticationManager,
            ServerAuthenticationConverter authenticationConverter) {

        AuthenticationWebFilter authenticationWebFilter = new AuthenticationWebFilter(authenticationManager);
        authenticationWebFilter.setServerAuthenticationConverter(authenticationConverter);

        return http
                .cors(cors -> cors.configurationSource(corsConfigurationSource())) // Activer CORS
                .csrf(ServerHttpSecurity.CsrfSpec::disable)
                .authorizeExchange(exchanges -> exchanges
                        // OPTIONS pour toutes les routes (preflight requests)
                        .pathMatchers(HttpMethod.OPTIONS, "/**").permitAll()

                        // Authentication endpoints
                        .pathMatchers(HttpMethod.POST, "/api/auth/register").permitAll()
                        .pathMatchers(HttpMethod.POST, "/api/auth/activation").permitAll()
                        .pathMatchers(HttpMethod.POST, "/api/auth/login").permitAll()

                        // Static resources
                        .pathMatchers("/uploads/**").permitAll()

                        // Documentation API
                        .pathMatchers(HttpMethod.GET, "/api/v1/docs/**").permitAll()
                        .pathMatchers(HttpMethod.GET, "/docs/**").permitAll()

                        // Redirections
                        .pathMatchers(HttpMethod.GET, "/").permitAll()
                        .pathMatchers(HttpMethod.GET, "/api").permitAll()

                        // actuator
                        .pathMatchers(HttpMethod.GET, "/api/actuator/**").permitAll()
                        .pathMatchers(HttpMethod.GET, "/actuator/**").permitAll()

                        // Invite links
                        .pathMatchers(HttpMethod.GET, "/api/geofence/invite/*").permitAll()

                        // Location updates from devices
                        .pathMatchers(HttpMethod.POST, "/api/public/location/update").permitAll()

                        // Error handling
                        .pathMatchers("/error").permitAll()

                        .anyExchange().authenticated()
                )
                .addFilterAt(authenticationWebFilter, SecurityWebFiltersOrder.AUTHENTICATION)
                .httpBasic(ServerHttpSecurity.HttpBasicSpec::disable)
                .formLogin(ServerHttpSecurity.FormLoginSpec::disable)
                .build();
    }

    @Bean
    public CorsConfigurationSource corsConfigurationSource() {
        CorsConfiguration configuration = new CorsConfiguration();
        configuration.setAllowedOriginPatterns(List.of("*"));
        configuration.setAllowedMethods(Arrays.asList("GET", "POST", "PUT", "DELETE", "PATCH", "OPTIONS"));
        configuration.setAllowedHeaders(List.of("*"));
        configuration.setAllowCredentials(false);
        configuration.setMaxAge(3600L);

        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
        source.registerCorsConfiguration("/**", configuration);
        return source;
    }

    @Bean
    public BCryptPasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }
}
```

*Lignes: 100*

---

### 📄 src\main\java\ink\yowyob\geofence\security\JwtAuthenticationException.java

```java
package ink.yowyob.geofence.security;

import org.springframework.security.core.AuthenticationException;

public class JwtAuthenticationException extends AuthenticationException {
    public JwtAuthenticationException(String msg) {
        super(msg);
    }
}
```

*Lignes: 9*

---

### 📄 src\main\java\ink\yowyob\geofence\security\JwtAuthenticationManager.java

```java
package ink.yowyob.geofence.security;

import lombok.RequiredArgsConstructor;
import org.springframework.security.authentication.ReactiveAuthenticationManager;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Component;
import reactor.core.publisher.Mono;

@Component
@RequiredArgsConstructor
public class JwtAuthenticationManager implements ReactiveAuthenticationManager {

    private final JwtService jwtService;

    @Override
    public Mono<Authentication> authenticate(Authentication authentication) {
        return Mono.just(authentication)
                .cast(JwtToken.class)
                .filter(jwtToken -> jwtService.isTokenValid(jwtToken.getToken()))
                .map(jwtToken -> jwtToken.withAuthenticated(true))
                .switchIfEmpty(Mono.error(new JwtAuthenticationException("Invalid token.")));
    }
}
```

*Lignes: 23*

---

### 📄 src\main\java\ink\yowyob\geofence\security\JwtServerAuthenticationConverter.java

```java
package ink.yowyob.geofence.security;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpHeaders;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.web.server.authentication.ServerAuthenticationConverter;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;

import java.util.List;

@Component
@RequiredArgsConstructor
public class JwtServerAuthenticationConverter implements ServerAuthenticationConverter {

    private final JwtService jwtService;
    private static final String BEARER = "Bearer ";

    @Override
    public Mono<Authentication> convert(ServerWebExchange exchange) {
        return Mono.justOrEmpty(exchange.getRequest().getHeaders().getFirst(HttpHeaders.AUTHORIZATION))
                .filter(header -> header.startsWith(BEARER))
                .map(header -> header.substring(BEARER.length()))
                .map(token -> new JwtToken(token, createUserDetails(token)));
    }

    private UserDetails createUserDetails(String token) {
        String username = jwtService.extractUsername(token);
        return User.builder()
                .username(username)
                .authorities(createAuthorities(token))
                .password("")
                .build();
    }

    private List<SimpleGrantedAuthority> createAuthorities(String token) {
        return jwtService.extractRoles(token).stream()
                .map(role -> "ROLE_" + role)
                .map(SimpleGrantedAuthority::new)
                .toList();
    }
}
```

*Lignes: 46*

---

### 📄 src\main\java\ink\yowyob\geofence\security\JwtService.java

```java
package ink.yowyob.geofence.security;

import ink.yowyob.geofence.config.JwtConfig;
import ink.yowyob.geofence.model.User;
import ink.yowyob.geofence.service.Implementation.UserServiceImpl;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.JwtException;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.io.Decoders;
import io.jsonwebtoken.security.Keys;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.security.Key;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

@AllArgsConstructor
@Service
public class JwtService {
    private final JwtConfig jwtConfig;
    private UserServiceImpl userService;

    public Map<String, String> generate(String username) {
        User user = this.userService.loadUserByUsername(username);
        return this.generateJwt(user);
    }

    public String extractUsername(String token) {
        return this.getClaim(token, Claims::getSubject);
    }

    public List<String> extractRoles(String token) {
        return getClaim(token, claims -> (List<String>) claims.get("roles"));
    }

    public boolean isTokenExpired(String token) {
        Date expirationDate = getExpirationDateFromToken(token);
        return expirationDate.before(new Date());
    }

    public boolean isTokenValid(String token) {
        try {
            return !isTokenExpired(token);
        } catch (JwtException e) {
            return false;
        }
    }

    private Date getExpirationDateFromToken(String token) {
        return this.getClaim(token, Claims::getExpiration);
    }

    private <T> T getClaim(String token, Function<Claims, T> function) {
        Claims claims = getAllClaims(token);
        return function.apply(claims);
    }

    private Claims getAllClaims(String token) {
        try {
            return Jwts.parserBuilder()
                    .setSigningKey(this.getKey())
                    .build()
                    .parseClaimsJws(token)
                    .getBody();
        } catch (JwtException e) {
            throw new JwtAuthenticationException(e.getMessage());
        }
    }

    public boolean validateToken(String token) {
        return !getAllClaims(token).isEmpty();
    }

    private Map<String, String> generateJwt(User user) {
        final long currentTime = System.currentTimeMillis();
        final long expirationTime = currentTime + 24 * 60 * 60 * 1000; // 1 jours

        final Map<String, Object> claims = Map.of(
                "nom", user.getFirstname(),
                "roles", List.of(user.getRole().getName().toString()),
                Claims.EXPIRATION, new Date(expirationTime),
                Claims.SUBJECT, user.getUsername()
        );

        final String bearer = Jwts.builder()
                .setIssuedAt(new Date(currentTime))
                .setExpiration(new Date(expirationTime))
                .setSubject(user.getUsername())
                .setClaims(claims)
                .signWith(getKey(), SignatureAlgorithm.HS256)
                .compact();
        return Map.of("bearer", bearer);
    }

    private Key getKey() {
        final byte[] decoder = Decoders.BASE64.decode(jwtConfig.getEncryptionKey());
        return Keys.hmacShaKeyFor(decoder);
    }
}
```

*Lignes: 103*

---

### 📄 src\main\java\ink\yowyob\geofence\security\JwtToken.java

```java
package ink.yowyob.geofence.security;

import lombok.Getter;
import org.springframework.security.authentication.AbstractAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.UserDetails;

@Getter
public class JwtToken extends AbstractAuthenticationToken {

    private final String token;
    private final UserDetails principal;

    public JwtToken(String token, UserDetails principal) {
        super(principal.getAuthorities());
        this.token = token;
        this.principal = principal;
    }

    public Authentication withAuthenticated(boolean isAuthenticated) {
        JwtToken cloned = new JwtToken(token, principal);
        cloned.setAuthenticated(isAuthenticated);
        return cloned;
    }

    @Override
    public Object getCredentials() {
        return null;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof JwtToken test)) {
            return false;
        }
        if (this.getToken() == null && test.getToken() != null) {
            return false;
        }
        if (this.getToken() != null && !this.getToken().equals(test.getToken())) {
            return false;
        }
        return super.equals(obj);
    }

    @Override
    public int hashCode() {
        int code = super.hashCode();
        if (this.getToken() != null) {
            code ^= this.getToken().hashCode();
        }
        return code;
    }
}
```

*Lignes: 53*

---

### 📄 src\main\java\ink\yowyob\geofence\service\AlertService.java

```java
package ink.yowyob.geofence.service;

import ink.yowyob.geofence.Enum.AlertTypeEnum;
import ink.yowyob.geofence.dto.response.AlertDTO;
import ink.yowyob.geofence.dto.response.AlertListResponse;
import ink.yowyob.geofence.model.GeofenceZone;
import ink.yowyob.geofence.model.Location;
import ink.yowyob.geofence.model.User;
import ink.yowyob.geofence.model.Vehicle;

import java.util.UUID;

public interface AlertService {
    AlertDTO createAlert(Vehicle vehicle, GeofenceZone zone, AlertTypeEnum alertType, Location location, String message);
    AlertListResponse getMyAlerts(Integer page, Integer size, User user);
    AlertListResponse getAllAlerts(Integer page, Integer size);
    AlertDTO getAlert(UUID id);
}
```

*Lignes: 18*

---

### 📄 src\main\java\ink\yowyob\geofence\service\DashboardService.java

```java
package ink.yowyob.geofence.service;

import ink.yowyob.geofence.dto.response.DashboardStatsDTO;
import ink.yowyob.geofence.model.User;

public interface DashboardService {
    
    /**
     * Récupérer les statistiques du dashboard pour un utilisateur
     */
    DashboardStatsDTO getUserDashboardStats(User user);
}
```

*Lignes: 12*

---

### 📄 src\main\java\ink\yowyob\geofence\service\FileStorageService.java

```java
package ink.yowyob.geofence.service;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.codec.multipart.FilePart;
import org.springframework.stereotype.Service;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;
import org.springframework.web.multipart.MultipartFile;
import reactor.core.publisher.Mono;
import reactor.core.scheduler.Schedulers;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.UUID;

@Service
public class FileStorageService {

    @Value("${file.upload-dir:./uploads}")
    private String uploadDir;

    /**
     * Méthode pour Spring MVC (MultipartFile)
     */
    public String storeVehicleImage(MultipartFile file, UUID vehicleId) throws IOException {
        // Créer le répertoire de destination s'il n'existe pas
        Path uploadPath = Paths.get(uploadDir + "/vehicles");
        if (!Files.exists(uploadPath)) {
            Files.createDirectories(uploadPath);
        }

        // Extraire l'extension du fichier original
        String originalFilename = file.getOriginalFilename();
        String extension = "";
        if (originalFilename != null && originalFilename.contains(".")) {
            extension = originalFilename.substring(originalFilename.lastIndexOf("."));
        }

        // Créer le nouveau nom de fichier basé sur l'UUID du véhicule
        String newFilename = vehicleId.toString() + extension;
        Path filePath = uploadPath.resolve(newFilename);

        // Enregistrer le fichier
        Files.copy(file.getInputStream(), filePath, StandardCopyOption.REPLACE_EXISTING);

        // Retourner le chemin relatif de l'image
        return "/vehicles/" + newFilename;
    }

    /**
     * Méthode pour WebFlux (FilePart) - version améliorée
     */
    public Mono<String> storeVehicleImageReactive(FilePart filePart, UUID vehicleId) {
        return Mono.fromCallable(() -> {
            try {
                return storeVehicleImageFromFilePart(filePart, vehicleId);
            } catch (IOException e) {
                throw new RuntimeException("Failed to store image", e);
            }
        }).subscribeOn(Schedulers.boundedElastic());
    }

    /**
     * Méthode pour WebFlux (FilePart)
     */
    public String storeVehicleImageFromFilePart(FilePart filePart, UUID vehicleId) throws IOException {
        // Créer le répertoire de destination s'il n'existe pas
        Path uploadPath = Paths.get(uploadDir + "/vehicles");
        if (!Files.exists(uploadPath)) {
            Files.createDirectories(uploadPath);
        }

        // Extraire l'extension du fichier original
        String originalFilename = filePart.filename();
        String extension = "";
        if (originalFilename != null && originalFilename.contains(".")) {
            extension = originalFilename.substring(originalFilename.lastIndexOf("."));
        }

        // Créer le nouveau nom de fichier basé sur l'UUID du véhicule
        String newFilename = vehicleId.toString() + extension;
        Path filePath = uploadPath.resolve(newFilename);

        // Enregistrer le fichier de manière synchrone (block nécessaire pour WebFlux)
        filePart.transferTo(filePath).block();

        // Retourner le chemin relatif de l'image
        return "/vehicles/" + newFilename;
    }

    /**
     * Génère l'URL complète de l'image
     * Compatible avec MVC et WebFlux
     */
    public String getCompleteImageUrl(String relativeUrl) {
        if (relativeUrl == null || relativeUrl.isEmpty()) {
            return null;
        }

        if (!relativeUrl.startsWith("/uploads/")) {
            relativeUrl = "/uploads" + (relativeUrl.startsWith("/") ? "" : "/") + relativeUrl;
        }

        try {
            // Essayer d'obtenir la requête HTTP via ServletRequestAttributes (MVC)
            HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder
                    .getRequestAttributes()).getRequest();

            String baseUrl = request.getScheme() + "://" + request.getServerName()
                    + ((request.getServerPort() == 80 || request.getServerPort() == 443) ? "" : ":" + request.getServerPort());

            return baseUrl + relativeUrl;
        } catch (Exception e) {
            // Dans un contexte WebFlux, RequestContextHolder pourrait ne pas être disponible
            // Fallback vers une URL par défaut
            return "http://localhost:8080" + relativeUrl;
        }
    }

    /**
     * Supprime un fichier image
     */
    public void deleteVehicleImage(String imageUrl) {
        if (imageUrl != null && !imageUrl.isEmpty()) {
            try {
                // Nettoyer l'URL pour extraire le chemin relatif
                String relativePath = imageUrl;
                if (imageUrl.startsWith("http")) {
                    // Extraire le chemin après le domaine
                    int uploadsIndex = imageUrl.indexOf("/uploads/");
                    if (uploadsIndex != -1) {
                        relativePath = imageUrl.substring(uploadsIndex);
                    }
                }

                Path imagePath = Paths.get(uploadDir + relativePath);
                Files.deleteIfExists(imagePath);
            } catch (IOException e) {
                // Ignorer l'erreur si le fichier n'existe pas ou ne peut pas être supprimé
            }
        }
    }
}
```

*Lignes: 147*

---

### 📄 src\main\java\ink\yowyob\geofence\service\GeofenceForkService.java

```java
package ink.yowyob.geofence.service;

import ink.yowyob.geofence.dto.request.ForkGeofenceRequest;
import ink.yowyob.geofence.dto.response.GeofenceForkListResponse;
import ink.yowyob.geofence.dto.response.GeofenceWithForkInfoDTO;
import ink.yowyob.geofence.model.User;
import ink.yowyob.geofence.dto.response.GeofenceForkDTO;
import ink.yowyob.geofence.dto.response.GeofenceForkInfoDTO;

import java.util.UUID;

public interface GeofenceForkService {
    GeofenceForkDTO forkGeofence(ForkGeofenceRequest request, User user);
    GeofenceForkListResponse getForksOfGeofence(UUID geofenceId);
    GeofenceForkListResponse getMyForks(User user);
    GeofenceForkInfoDTO getForkInfo(UUID geofenceId, String geofenceType);
    void deleteFork(UUID forkId, User user);
    GeofenceWithForkInfoDTO getGeofenceWithForkInfo(UUID geofenceId, String geofenceType);
}
```

*Lignes: 19*

---

### 📄 src\main\java\ink\yowyob\geofence\service\GeofenceInviteLinkService.java

```java
package ink.yowyob.geofence.service;

import ink.yowyob.geofence.dto.request.CreateInviteLinkRequest;
import ink.yowyob.geofence.dto.response.InviteLinkDTO;
import ink.yowyob.geofence.dto.response.InviteLinkDetailsResponse;
import ink.yowyob.geofence.dto.response.InviteLinkListResponse;
import ink.yowyob.geofence.model.User;

import java.util.UUID;

public interface GeofenceInviteLinkService {
    InviteLinkDTO createInviteLink(CreateInviteLinkRequest request, User user);
    InviteLinkDetailsResponse getInviteLinkDetails(String inviteCode);
    void joinGeofenceViaInvite(String inviteCode, User user);
    InviteLinkListResponse getMyInviteLinks(User user);
    InviteLinkListResponse getInviteLinksForGeofence(UUID geofenceId, String geofenceType, User user);
    void deactivateInviteLink(String inviteCode, User user);
    void deleteInviteLink(UUID inviteLinkId, User user);
}
```

*Lignes: 19*

---

### 📄 src\main\java\ink\yowyob\geofence\service\GeofenceService.java

```java
package ink.yowyob.geofence.service;

import ink.yowyob.geofence.dto.PointDTO;
import ink.yowyob.geofence.dto.PolygonDTO;
import ink.yowyob.geofence.dto.request.CircleGeofenceZoneDTORequest;
import ink.yowyob.geofence.dto.request.GeofenceZoneDTORequest;
import ink.yowyob.geofence.dto.request.PolygonGeofenceZoneDTORequest;
import ink.yowyob.geofence.dto.response.CircleGeofenceZoneDTOResponse;
import ink.yowyob.geofence.dto.response.GeofenceZoneDTOResponse;
import ink.yowyob.geofence.dto.response.MultipleGeofenceZoneDTOResponse;
import ink.yowyob.geofence.dto.response.PolygonGeofenceZoneDTOResponse;
import ink.yowyob.geofence.model.User;
import org.locationtech.jts.geom.Point;
import org.locationtech.jts.geom.Polygon;

import java.util.List;
import java.util.UUID;

public interface GeofenceService {
    GeofenceZoneDTOResponse getGeofenceZone(UUID zoneId, String type);
    MultipleGeofenceZoneDTOResponse getGeofenceZones();
    GeofenceZoneDTOResponse createGeofenceZone(GeofenceZoneDTORequest geofenceZoneDTORequest, User user);
    MultipleGeofenceZoneDTOResponse getMyGeofenceZones(User user);
    GeofenceZoneDTOResponse editGeofenceZone(GeofenceZoneDTORequest geofenceZoneDTORequest, UUID zoneId, String type, User user);
    void deleteGeofenceZone(UUID zoneId, String type, User user);

    PolygonGeofenceZoneDTOResponse getPolygonGeofenceZone(UUID Id);
    List<PolygonGeofenceZoneDTOResponse> getPolygonsGeofenceZone();
    PolygonGeofenceZoneDTOResponse createPolygonGeofenceZone(PolygonGeofenceZoneDTORequest geofenceZoneDTORequest, User user);
    List<PolygonGeofenceZoneDTOResponse> getMyPolygonsGeofenceZone(User user);
    PolygonGeofenceZoneDTOResponse editPolygonGeofenceZone(PolygonGeofenceZoneDTORequest geofenceZoneDTORequest,UUID zoneId, User user);
    void deletePolygonGeofenceZone(UUID zoneId, User user);

    CircleGeofenceZoneDTOResponse getCircleGeofenceZone(UUID Id);
    List<CircleGeofenceZoneDTOResponse> getCirclesGeofenceZone();
    CircleGeofenceZoneDTOResponse createCircleGeofenceZone(CircleGeofenceZoneDTORequest geofenceZoneDTORequest, User user);
    List<CircleGeofenceZoneDTOResponse> getMyCirclesGeofenceZone(User user);
    CircleGeofenceZoneDTOResponse editCircleGeofenceZone(CircleGeofenceZoneDTORequest geofenceZoneDTORequest, UUID zoneId, User user);
    void deleteCircleGeofenceZone(UUID zoneId, User user);




    Polygon convertToPolygon(PolygonDTO dto);
    Point convertToPoint(PointDTO dto);

}

```

*Lignes: 48*

---

### 📄 src\main\java\ink\yowyob\geofence\service\GeofenceSharingService.java

```java
package ink.yowyob.geofence.service;

import ink.yowyob.geofence.dto.request.ShareGeofenceRequest;
import ink.yowyob.geofence.dto.response.GeofenceShareDTO;
import ink.yowyob.geofence.dto.response.GeofenceShareListResponse;
import ink.yowyob.geofence.model.User;

import java.util.UUID;

public interface GeofenceSharingService {
    GeofenceShareDTO shareGeofence(UUID geofenceId, String type, ShareGeofenceRequest request, User user);
    GeofenceShareDTO updateGeofenceShare(UUID shareId, ShareGeofenceRequest request, User user);
    void deleteGeofenceShare(UUID shareId, User user);
    GeofenceShareListResponse getSharedGeofences(User user);
    GeofenceShareListResponse getMySharedGeofences(User user);
    GeofenceShareListResponse getPendingInvitations(User user);
    GeofenceShareDTO respondToInvitation(UUID shareId, boolean accept, User user);
}
```

*Lignes: 18*

---

### 📄 src\main\java\ink\yowyob\geofence\service\Implementation\AlertServiceImpl.java

```java
package ink.yowyob.geofence.service.Implementation;

import ink.yowyob.geofence.Enum.AlertTypeEnum;
import ink.yowyob.geofence.dto.response.AlertDTO;
import ink.yowyob.geofence.dto.response.AlertListResponse;
import ink.yowyob.geofence.mapper.AlertDTOMapper;
import ink.yowyob.geofence.model.Alert;
import ink.yowyob.geofence.model.AlertType;
import ink.yowyob.geofence.model.GeofenceZone;
import ink.yowyob.geofence.model.Location;
import ink.yowyob.geofence.model.User;
import ink.yowyob.geofence.model.Vehicle;
import ink.yowyob.geofence.repository.AlertRepository;
import ink.yowyob.geofence.repository.AlertTypeRepository;
import ink.yowyob.geofence.repository.LocationRepository;
import ink.yowyob.geofence.repository.UserRepository;
import ink.yowyob.geofence.repository.VehicleRepository;
import ink.yowyob.geofence.service.AlertService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@Slf4j
@Service
@AllArgsConstructor
public class AlertServiceImpl implements AlertService {
    private final AlertRepository alertRepository;
    private final AlertTypeRepository alertTypeRepository;
    private final UserRepository userRepository;
    private final VehicleRepository vehicleRepository;
    private final LocationRepository locationRepository;
    private final AlertDTOMapper alertDTOMapper;
    private final SimpMessagingTemplate messagingTemplate;

    @Override
    @Transactional(propagation = org.springframework.transaction.annotation.Propagation.REQUIRES_NEW)
    public AlertDTO createAlert(Vehicle vehicle, GeofenceZone zone, AlertTypeEnum alertType, Location location, String message) {
        // Find or create the alert type
        AlertType type = alertTypeRepository.findByType(alertType)
                .orElseGet(() -> {
                    AlertType newType = new AlertType();
                    newType.setType(alertType);
                    return alertTypeRepository.save(newType);
                });

        // Create the alert
        Alert alert = new Alert();
        alert.setType(type);
        alert.setVehicle(vehicle);
        alert.setGeofenceZone(zone);
        alert.setLocation(location);
        alert.setMessage(message);
        alert.setTimestamp(LocalDateTime.now());

        // Save the alert
        Alert savedAlert = alertRepository.save(alert);

        // Convert to DTO
        AlertDTO alertDTO = alertDTOMapper.apply(savedAlert);

        // Send real-time notification via WebSocket
        messagingTemplate.convertAndSendToUser(
                vehicle.getUser().getUsername(),
                "/queue/alerts",
                alertDTO
        );

        return alertDTO;
    }

    @Override
    public AlertListResponse getMyAlerts(Integer page, Integer size, User user) {

        // Get all vehicles belonging to the user
        List<Vehicle> userVehicles = vehicleRepository.findByUser(user);

        // Fetch alerts for these vehicles
        List<Alert> alerts = alertRepository.findByVehicleInOrderByTimestampDesc(userVehicles);

        List<AlertDTO> alertDTOs = alerts.stream()
                .map(alertDTOMapper)
                .collect(Collectors.toList());

        return new AlertListResponse(alertDTOs, alertDTOs.size());
    }

    @Override
    public AlertListResponse getAllAlerts(Integer page, Integer size) {
        List<Alert> alerts = alertRepository.findAllByOrderByTimestampDesc();

        List<AlertDTO> alertDTOs = alerts.stream()
                .map(alertDTOMapper)
                .collect(Collectors.toList());

        return new AlertListResponse(alertDTOs, alertDTOs.size());
    }

    @Override
    public AlertDTO getAlert(UUID id) {
        Alert alert = alertRepository.findById(id)
                .orElseThrow(() -> new IllegalStateException("Alert with id " + id + " does not exist"));

        return alertDTOMapper.apply(alert);
    }
}
```

*Lignes: 112*

---

### 📄 src\main\java\ink\yowyob\geofence\service\Implementation\DashboardServiceImpl.java

```java
package ink.yowyob.geofence.service.Implementation;

import ink.yowyob.geofence.dto.response.DashboardStatsDTO;
import ink.yowyob.geofence.model.User;
import ink.yowyob.geofence.model.Vehicle;
import ink.yowyob.geofence.model.Location;
import ink.yowyob.geofence.repository.VehicleRepository;
import ink.yowyob.geofence.repository.LocationRepository;
import ink.yowyob.geofence.repository.AlertRepository;
import ink.yowyob.geofence.repository.GeofenceZoneRepository;
import ink.yowyob.geofence.service.DashboardService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;
import java.util.List;
import java.util.OptionalDouble;

@Slf4j
@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class DashboardServiceImpl implements DashboardService {
    
    private final VehicleRepository vehicleRepository;
    private final LocationRepository locationRepository;
    private final AlertRepository alertRepository;
    private final GeofenceZoneRepository geofenceZoneRepository;
    
    @Override
    public DashboardStatsDTO getUserDashboardStats(User user) {
        try {
            // Récupérer tous les véhicules de l'utilisateur
            List<Vehicle> vehicles = vehicleRepository.findByUser(user);
            int totalVehicles = vehicles.size();
            
            // Calculer les statistiques
            int activeVehicles = 0;
            int onlineVehicles = 0;
            int recentPositions = 0;
            double totalSpeed = 0;
            int speedCount = 0;
            double maxSpeedToday = 0;
            int totalPositionsToday = 0;
            
            LocalDateTime now = LocalDateTime.now();
            LocalDateTime startOfDay = now.toLocalDate().atStartOfDay();
            LocalDateTime thirtyMinutesAgo = now.minusMinutes(30);
            
            // Parcourir chaque véhicule pour calculer les stats
            for (Vehicle vehicle : vehicles) {
                // Dernière position
                List<Location> latestLocations = locationRepository
                        .findByVehicleOrderByTimestampDescWithVehicleList(vehicle, PageRequest.of(0, 1));
                
                if (!latestLocations.isEmpty()) {
                    Location latestLocation = latestLocations.get(0);
                    activeVehicles++;
                    
                    // Vérifier si en ligne (position récente)
                    if (latestLocation.getTimestamp().isAfter(thirtyMinutesAgo)) {
                        onlineVehicles++;
                        recentPositions++;
                    }
                    
                    // Calculer vitesse moyenne
                    if (latestLocation.getSpeed() != null && latestLocation.getSpeed() > 0) {
                        totalSpeed += latestLocation.getSpeed();
                        speedCount++;
                    }
                }
                
                // Positions aujourd'hui
                List<Location> todayLocations = locationRepository
                        .findByVehicleAndTimestampBetween(vehicle, startOfDay, now);
                totalPositionsToday += todayLocations.size();
                
                // Vitesse max aujourd'hui
                OptionalDouble maxSpeed = todayLocations.stream()
                        .filter(l -> l.getSpeed() != null)
                        .mapToDouble(Location::getSpeed)
                        .max();
                if (maxSpeed.isPresent() && maxSpeed.getAsDouble() > maxSpeedToday) {
                    maxSpeedToday = maxSpeed.getAsDouble();
                }
            }
            
            double avgSpeed = speedCount > 0 ? totalSpeed / speedCount : 0.0;
            
            // Compter les alertes
            int totalAlerts = (int) alertRepository.countByVehicleIn(vehicles);
            int alertsToday = (int) alertRepository.countByVehicleInAndTimestampAfter(vehicles, startOfDay);
            
            // Compter les géofences
            int totalGeofences = geofenceZoneRepository.countByUser(user);
            
            // Statistiques d'activité des véhicules
            int vehiclesOffline = totalVehicles - onlineVehicles;
            
            DashboardStatsDTO.VehicleActivityStatsDTO vehicleActivity = 
                    new DashboardStatsDTO.VehicleActivityStatsDTO(
                            recentPositions,
                            vehiclesOffline,
                            totalPositionsToday,
                            maxSpeedToday,
                            alertsToday
                    );
            
            return new DashboardStatsDTO(
                    totalVehicles,
                    activeVehicles,
                    totalAlerts,
                    recentPositions,
                    avgSpeed,
                    onlineVehicles,
                    totalGeofences,
                    alertsToday,
                    vehicleActivity
            );
            
        } catch (Exception e) {
            log.error("Erreur lors du calcul des statistiques dashboard pour l'utilisateur {}: {}", 
                    user.getEmail(), e.getMessage());
            
            // Retourner des valeurs par défaut en cas d'erreur
            return new DashboardStatsDTO(0, 0, 0, 0, 0.0, 0, 0, 0, 
                    new DashboardStatsDTO.VehicleActivityStatsDTO(0, 0, 0, 0.0, 0));
        }
    }
}
```

*Lignes: 133*

---

### 📄 src\main\java\ink\yowyob\geofence\service\Implementation\GeofenceForkServiceImpl.java

```java
package ink.yowyob.geofence.service.Implementation;

import ink.yowyob.geofence.dto.request.ForkGeofenceRequest;
import ink.yowyob.geofence.dto.response.GeofenceWithForkInfoDTO;
import ink.yowyob.geofence.exception.BadCredentialsException;
import ink.yowyob.geofence.exception.ResourceNotFoundException;
import ink.yowyob.geofence.dto.response.GeofenceForkListResponse;
import ink.yowyob.geofence.mapper.GeofenceForkDTOMapper;
import ink.yowyob.geofence.mapper.UserDTOMapper;
import ink.yowyob.geofence.dto.response.GeofenceForkDTO;
import ink.yowyob.geofence.dto.response.GeofenceForkInfoDTO;
import ink.yowyob.geofence.model.*;
import ink.yowyob.geofence.repository.*;
import ink.yowyob.geofence.service.GeofenceForkService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Slf4j
@Service
@RequiredArgsConstructor
public class GeofenceForkServiceImpl implements GeofenceForkService {

    private final GeofenceForkRepository forkRepository;
    private final CircleGeofenceZoneRepository circleRepository;
    private final PolygonGeofenceZoneRepository polygonRepository;
    private final GeofenceShareRepository shareRepository;
    private final UserRepository userRepository;
    private final GeofenceForkDTOMapper forkMapper;
    private final UserDTOMapper userMapper;

    @Override
    @Transactional
    public GeofenceForkDTO forkGeofence(ForkGeofenceRequest request, User user) {

        // Récupérer la géofence originale
        GeofenceZone originalGeofence = getGeofenceZone(request.geofenceId(), request.geofenceType());

        // Vérifier que l'utilisateur a accès à cette géofence (propriétaire ou partagée)
        if (!hasAccessToGeofence(originalGeofence, user)) {
            throw new BadCredentialsException("Vous n'avez pas accès à cette géofence");
        }

        // Créer la copie de la géofence
        GeofenceZone forkedGeofence = createGeofenceCopy(originalGeofence, request, user);

        // Créer l'enregistrement de fork
        GeofenceFork fork = new GeofenceFork(
                originalGeofence,
                forkedGeofence,
                user,
                request.forkReason()
        );

        GeofenceFork savedFork = forkRepository.save(fork);

        return forkMapper.apply(savedFork);
    }

    @Override
    public GeofenceForkListResponse getForksOfGeofence(UUID geofenceId) {
        List<GeofenceFork> forks = forkRepository.findByOriginalGeofenceIdOrderByForkedAtDesc(geofenceId);

        List<GeofenceForkDTO> dtos = forks.stream()
                .map(forkMapper)
                .toList();

        return new GeofenceForkListResponse(dtos, dtos.size());
    }

    @Override
    public GeofenceForkListResponse getMyForks(User user) {

        List<GeofenceFork> forks = forkRepository.findByForkedByOrderByForkedAtDesc(user);

        List<GeofenceForkDTO> dtos = forks.stream()
                .map(forkMapper)
                .toList();

        return new GeofenceForkListResponse(dtos, dtos.size());
    }

    @Override
    public GeofenceForkInfoDTO getForkInfo(UUID geofenceId, String geofenceType) {
        Optional<GeofenceFork> forkOpt = forkRepository.findByForkedGeofenceId(geofenceId);

        if (forkOpt.isEmpty()) {
            return null; // Cette géofence n'est pas un fork
        }

        GeofenceFork fork = forkOpt.get();
        GeofenceZone original = fork.getOriginalGeofence();

        return new GeofenceForkInfoDTO(
                original.getId().toString(),
                original.getTitle(),
                userMapper.apply(original.getUser()),
                fork.getForkedAt(),
                fork.getForkReason()
        );
    }

    @Override
    public GeofenceWithForkInfoDTO getGeofenceWithForkInfo(UUID geofenceId, String geofenceType) {
        GeofenceZone geofence = getGeofenceZone(geofenceId, geofenceType);

        // Vérifier si c'est un fork
        GeofenceForkInfoDTO forkInfo = getForkInfo(geofenceId, geofenceType);
        boolean isFork = forkInfo != null;

        // Compter les forks de cette géofence
        long forkCount = forkRepository.countByOriginalGeofenceId(geofenceId);
        boolean isOriginal = forkCount > 0;

        return new GeofenceWithForkInfoDTO(
                geofence.getId().toString(),
                geofence.getTitle(),
                geofence.getDescription(),
                geofenceType.equals("c") ? "circle" : "polygon",
                userMapper.apply(geofence.getUser()),
                isOriginal,
                isFork,
                forkInfo,
                forkCount
        );
    }

    @Override
    @Transactional
    public void deleteFork(UUID forkId, User user) {

        GeofenceFork fork = forkRepository.findById(forkId)
                .orElseThrow(() -> new ResourceNotFoundException("Fork non trouvé"));

        // Vérifier que l'utilisateur est le créateur du fork
        if (!fork.getForkedBy().getUuid().equals(user.getUuid())) {
            throw new BadCredentialsException("Vous n'êtes pas autorisé à supprimer ce fork");
        }

        // Supprimer la géofence forkée d'abord
        GeofenceZone forkedGeofence = fork.getForkedGeofence();
        if (forkedGeofence instanceof CircleGeofenceZone) {
            circleRepository.delete((CircleGeofenceZone) forkedGeofence);
        } else if (forkedGeofence instanceof PolygonGeofenceZone) {
            polygonRepository.delete((PolygonGeofenceZone) forkedGeofence);
        }

        // Puis supprimer l'enregistrement de fork
        forkRepository.delete(fork);

    }

    // Méthodes privées

    private GeofenceZone getGeofenceZone(UUID geofenceId, String geofenceType) {
        if ("c".equals(geofenceType)) {
            return circleRepository.findById(geofenceId)
                    .orElseThrow(() -> new ResourceNotFoundException("Géofence circulaire non trouvée"));
        } else if ("p".equals(geofenceType)) {
            return polygonRepository.findById(geofenceId)
                    .orElseThrow(() -> new ResourceNotFoundException("Géofence polygonale non trouvée"));
        } else {
            throw new BadCredentialsException("Type de géofence non valide: " + geofenceType);
        }
    }

    private boolean hasAccessToGeofence(GeofenceZone geofence, User user) {
        // Vérifier si l'utilisateur est propriétaire
        if (geofence.getUser().getUuid().equals(user.getUuid())) {
            return true;
        }

        // Vérifier si la géofence est partagée avec l'utilisateur
        List<GeofenceShare> shares = shareRepository.findBySharedWith(user);
        return shares.stream()
                .anyMatch(share -> share.getGeofenceZone().getId().equals(geofence.getId()));
    }

    private GeofenceZone createGeofenceCopy(GeofenceZone original, ForkGeofenceRequest request, User newOwner) {
        if (original instanceof CircleGeofenceZone circle) {
            CircleGeofenceZone newCircle = new CircleGeofenceZone();
            newCircle.setTitle(request.newTitle());
            newCircle.setDescription(request.newDescription() != null ? request.newDescription() : circle.getDescription());
            newCircle.setUser(newOwner);
            newCircle.setCenter(circle.getCenter());
            newCircle.setRadius(circle.getRadius());

            return circleRepository.save(newCircle);

        } else if (original instanceof PolygonGeofenceZone polygon) {
            PolygonGeofenceZone newPolygon = new PolygonGeofenceZone();
            newPolygon.setTitle(request.newTitle());
            newPolygon.setDescription(request.newDescription() != null ? request.newDescription() : polygon.getDescription());
            newPolygon.setUser(newOwner);
            newPolygon.setPolygon(polygon.getPolygon());

            return polygonRepository.save(newPolygon);

        } else {
            throw new BadCredentialsException("Type de géofence non supporté pour le fork");
        }
    }
}
```

*Lignes: 208*

---

### 📄 src\main\java\ink\yowyob\geofence\service\Implementation\GeofenceInviteLinkServiceImpl.java

```java
package ink.yowyob.geofence.service.Implementation;

import ink.yowyob.geofence.dto.request.CreateInviteLinkRequest;
import ink.yowyob.geofence.dto.response.GeofenceZoneSimpleDTO;
import ink.yowyob.geofence.dto.response.InviteLinkDTO;
import ink.yowyob.geofence.dto.response.InviteLinkDetailsResponse;
import ink.yowyob.geofence.dto.response.InviteLinkListResponse;
import ink.yowyob.geofence.exception.BadCredentialsException;
import ink.yowyob.geofence.exception.ResourceNotFoundException;
import ink.yowyob.geofence.mapper.InviteLinkDTOMapper;
import ink.yowyob.geofence.model.*;
import ink.yowyob.geofence.repository.*;
import ink.yowyob.geofence.service.GeofenceInviteLinkService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.security.SecureRandom;
import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

@Slf4j
@Service
@RequiredArgsConstructor
public class GeofenceInviteLinkServiceImpl implements GeofenceInviteLinkService {

    private final GeofenceInviteLinkRepository inviteLinkRepository;
    private final CircleGeofenceZoneRepository circleRepository;
    private final PolygonGeofenceZoneRepository polygonRepository;
    private final UserRepository userRepository;
    private final GeofenceShareRepository geofenceShareRepository; // AJOUTÉ
    private final InviteLinkDTOMapper inviteLinkMapper;

    @Value("${app.frontend.url:http://localhost:3000}")
    private String frontendUrl;

    private static final String CHARACTERS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
    private static final int CODE_LENGTH = 12;
    private final SecureRandom random = new SecureRandom();

    @Override
    @Transactional
    public InviteLinkDTO createInviteLink(CreateInviteLinkRequest request, User user) {

        // Vérifier que la géofence existe et appartient à l'utilisateur
        verifyGeofenceOwnership(request.geofenceId(), request.geofenceType(), user.getUuid());

        // Générer un code unique
        String inviteCode = generateUniqueInviteCode();

        GeofenceInviteLink inviteLink = GeofenceInviteLink.builder()
                .inviteCode(inviteCode)
                .geofenceId(request.geofenceId())
                .geofenceType(request.geofenceType())
                .createdBy(user)
                .expiresAt(request.expiresAt())
                .canEdit(request.canEdit())
                .isActive(true)
                .maxUses(request.maxUses())
                .currentUses(0)
                .build();

        GeofenceInviteLink saved = inviteLinkRepository.save(inviteLink);

        return inviteLinkMapper.apply(saved);
    }

    @Override
    public InviteLinkDetailsResponse getInviteLinkDetails(String inviteCode) {
        GeofenceInviteLink inviteLink = inviteLinkRepository
                .findByInviteCodeAndIsActiveTrue(inviteCode)
                .orElseThrow(() -> new ResourceNotFoundException("Lien d'invitation non trouvé ou expiré"));

        // Récupérer les détails de la géofence
        GeofenceZoneSimpleDTO geofenceDetails = getGeofenceSimpleDetails(
                inviteLink.getGeofenceId(), inviteLink.getGeofenceType());

        String fullUrl = frontendUrl + "/invite/" + inviteCode;


        return new InviteLinkDetailsResponse(
                inviteLinkMapper.apply(inviteLink),
                geofenceDetails,
                fullUrl
        );
    }

    @Override
    @Transactional
    public void joinGeofenceViaInvite(String inviteCode, User user) {

        GeofenceInviteLink inviteLink = inviteLinkRepository
                .findByInviteCodeAndIsActiveTrue(inviteCode)
                .orElseThrow(() -> new ResourceNotFoundException("Lien d'invitation non trouvé ou expiré"));

        if (!inviteLink.canBeUsed()) {
            throw new BadCredentialsException("Ce lien d'invitation n'est plus valide");
        }

        // Vérifier si l'utilisateur n'est pas déjà partagé avec cette géofence
        if (isGeofenceAlreadySharedWithUser(inviteLink.getGeofenceId(), user)) {
            throw new BadCredentialsException("Vous avez déjà accès à cette géofence");
        }

        // Récupérer la géofence pour créer le partage
        GeofenceZone geofenceZone = getGeofenceZone(inviteLink.getGeofenceId(), inviteLink.getGeofenceType());

        // Créer directement le partage sans passer par le service de partage
        GeofenceShare newShare = new GeofenceShare();
        newShare.setGeofenceZone(geofenceZone);
        newShare.setSharedBy(inviteLink.getCreatedBy()); // Le créateur du lien
        newShare.setSharedWith(user); // L'utilisateur qui rejoint
        newShare.setSharedAt(LocalDateTime.now());
        newShare.setExpiresAt(inviteLink.getExpiresAt()); // Même expiration que le lien
        newShare.setCanEdit(inviteLink.isCanEdit());

        geofenceShareRepository.save(newShare);

        // Incrémenter le compteur d'utilisations
        inviteLink.setCurrentUses(inviteLink.getCurrentUses() + 1);
        inviteLinkRepository.save(inviteLink);

    }

    @Override
    public InviteLinkListResponse getMyInviteLinks(User user) {

        List<GeofenceInviteLink> inviteLinks = inviteLinkRepository
                .findByCreatedByUuidOrderByCreatedAtDesc(user.getUuid());

        List<InviteLinkDTO> dtos = inviteLinks.stream()
                .map(inviteLinkMapper)
                .toList();

        return new InviteLinkListResponse(dtos, dtos.size());
    }

    @Override
    public InviteLinkListResponse getInviteLinksForGeofence(UUID geofenceId, String geofenceType, User user) {

        // Vérifier la propriété
        verifyGeofenceOwnership(geofenceId, geofenceType, user.getUuid());

        List<GeofenceInviteLink> inviteLinks = inviteLinkRepository
                .findActiveInviteLinksForGeofence(user.getUuid(), geofenceId, geofenceType);

        List<InviteLinkDTO> dtos = inviteLinks.stream()
                .map(inviteLinkMapper)
                .toList();

        return new InviteLinkListResponse(dtos, dtos.size());
    }

    @Override
    @Transactional
    public void deactivateInviteLink(String inviteCode, User user) {

        GeofenceInviteLink inviteLink = inviteLinkRepository
                .findByInviteCodeAndIsActiveTrue(inviteCode)
                .orElseThrow(() -> new ResourceNotFoundException("Lien d'invitation non trouvé"));

        if (!inviteLink.getCreatedBy().getUuid().equals(user.getUuid())) {
            throw new BadCredentialsException("Vous n'êtes pas autorisé à désactiver ce lien");
        }

        inviteLink.setActive(false);
        inviteLinkRepository.save(inviteLink);

    }

    @Override
    @Transactional
    public void deleteInviteLink(UUID inviteLinkId, User user) {

        GeofenceInviteLink inviteLink = inviteLinkRepository.findById(inviteLinkId)
                .orElseThrow(() -> new ResourceNotFoundException("Lien d'invitation non trouvé"));

        if (!inviteLink.getCreatedBy().getUuid().equals(user.getUuid())) {
            throw new BadCredentialsException("Vous n'êtes pas autorisé à supprimer ce lien");
        }

        inviteLinkRepository.delete(inviteLink);
    }

    // Méthodes privées
    private String generateUniqueInviteCode() {
        String code;
        do {
            code = generateRandomCode();
        } while (inviteLinkRepository.existsByInviteCode(code));
        return code;
    }

    private String generateRandomCode() {
        StringBuilder code = new StringBuilder(CODE_LENGTH);
        for (int i = 0; i < CODE_LENGTH; i++) {
            code.append(CHARACTERS.charAt(random.nextInt(CHARACTERS.length())));
        }
        return code.toString();
    }

    private void verifyGeofenceOwnership(UUID geofenceId, String geofenceType, UUID userId) {
        boolean isOwner = false;
        if ("c".equals(geofenceType)) {
            isOwner = circleRepository.findById(geofenceId)
                    .map(circle -> circle.getUser().getUuid().equals(userId))
                    .orElse(false);
        } else if ("p".equals(geofenceType)) {
            isOwner = polygonRepository.findById(geofenceId)
                    .map(polygon -> polygon.getUser().getUuid().equals(userId))
                    .orElse(false);
        } else {
            throw new ResourceNotFoundException("Géofence non trouvée ou vous n'en êtes pas le propriétaire");
        }

        if (!isOwner) {
            throw new ResourceNotFoundException("Géofence non trouvée ou vous n'en êtes pas le propriétaire");
        }
    }

    private GeofenceZoneSimpleDTO getGeofenceSimpleDetails(UUID geofenceId, String geofenceType) {
        if ("c".equals(geofenceType)) {
            CircleGeofenceZone circle = circleRepository.findById(geofenceId)
                    .orElseThrow(() -> new ResourceNotFoundException("Géofence circulaire non trouvée"));
            return new GeofenceZoneSimpleDTO(circle.getId(), circle.getTitle(), "circle");
        } else {
            PolygonGeofenceZone polygon = polygonRepository.findById(geofenceId)
                    .orElseThrow(() -> new ResourceNotFoundException("Géofence polygonale non trouvée"));
            return new GeofenceZoneSimpleDTO(polygon.getId(), polygon.getTitle(), "polygon");
        }
    }

    // NOUVELLES MÉTHODES AJOUTÉES

    /**
     * Vérifier si une géofence est déjà partagée avec un utilisateur
     */
    private boolean isGeofenceAlreadySharedWithUser(UUID geofenceId, User user) {
        List<GeofenceShare> existingShares = geofenceShareRepository.findBySharedWith(user);
        return existingShares.stream()
                .anyMatch(share -> share.getGeofenceZone().getId().equals(geofenceId));
    }

    /**
     * Récupérer une géofence (circle ou polygon) par son ID et type
     */
    private GeofenceZone getGeofenceZone(UUID geofenceId, String geofenceType) {
        if ("c".equals(geofenceType)) {
            return circleRepository.findById(geofenceId)
                    .orElseThrow(() -> new ResourceNotFoundException("Géofence circulaire non trouvée"));
        } else if ("p".equals(geofenceType)) {
            return polygonRepository.findById(geofenceId)
                    .orElseThrow(() -> new ResourceNotFoundException("Géofence polygonale non trouvée"));
        } else {
            throw new BadCredentialsException("Type de géofence non valide: " + geofenceType);
        }
    }
}

```

*Lignes: 262*

---

### 📄 src\main\java\ink\yowyob\geofence\service\Implementation\GeofenceServiceImpl.java

```java
package ink.yowyob.geofence.service.Implementation;

import ink.yowyob.geofence.Enum.UserRole;
import ink.yowyob.geofence.dto.PointDTO;
import ink.yowyob.geofence.dto.PolygonDTO;
import ink.yowyob.geofence.dto.request.CircleGeofenceZoneDTORequest;
import ink.yowyob.geofence.dto.request.GeofenceZoneDTORequest;
import ink.yowyob.geofence.dto.request.PolygonGeofenceZoneDTORequest;
import ink.yowyob.geofence.dto.response.CircleGeofenceZoneDTOResponse;
import ink.yowyob.geofence.dto.response.GeofenceZoneDTOResponse;
import ink.yowyob.geofence.dto.response.MultipleGeofenceZoneDTOResponse;
import ink.yowyob.geofence.dto.response.PolygonGeofenceZoneDTOResponse;
import ink.yowyob.geofence.exception.BadCredentialsException;
import ink.yowyob.geofence.mapper.CircleDTOMapper;
import ink.yowyob.geofence.mapper.PolygonDTOMapper;
import ink.yowyob.geofence.model.CircleGeofenceZone;
import ink.yowyob.geofence.model.PolygonGeofenceZone;
import ink.yowyob.geofence.model.User;
import ink.yowyob.geofence.repository.CircleGeofenceZoneRepository;
import ink.yowyob.geofence.repository.PolygonGeofenceZoneRepository;
import ink.yowyob.geofence.repository.UserRepository;
import ink.yowyob.geofence.service.GeofenceService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.locationtech.jts.geom.*;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Objects;
import java.util.UUID;
import java.util.stream.Collectors;

@Slf4j
@Service
@AllArgsConstructor
public class GeofenceServiceImpl implements GeofenceService {
    private PolygonGeofenceZoneRepository polygonGeofenceZoneRepository;
    private CircleGeofenceZoneRepository circleGeofenceZoneRepository;
    private UserRepository userRepository;
    private final PolygonDTOMapper polygonDTOMapper;
    private final CircleDTOMapper circleDTOMapper;

    @Override
    @Transactional(readOnly = true)
    public GeofenceZoneDTOResponse getGeofenceZone(UUID zoneId, String type) {
        if (Objects.equals(type,"p")) {
            return getPolygonGeofenceZone(zoneId);
        } else if (Objects.equals(type,"c")) {
            return getCircleGeofenceZone(zoneId);
        }
        return null;
    }

    @Override
    @Transactional(readOnly = true)
    public MultipleGeofenceZoneDTOResponse getGeofenceZones() {
        return new MultipleGeofenceZoneDTOResponse(getPolygonsGeofenceZone(),getCirclesGeofenceZone());
    }

    @Override
    public GeofenceZoneDTOResponse createGeofenceZone(GeofenceZoneDTORequest geofenceZoneDTORequest, User user) {
//        // Récupérer le nom d'utilisateur depuis le contexte de sécurité
//        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
//        String username = authentication.getName();
//
//        // Charger l'utilisateur complet depuis la base de données
//        User user = userRepository.findByUsername(username)
//                .orElseThrow(() -> new UsernameNotFoundException("Utilisateur non trouvé"));

        switch (geofenceZoneDTORequest) {
            case PolygonGeofenceZoneDTORequest polygonGeofenceZoneDTORequest-> {
                return createPolygonGeofenceZone(polygonGeofenceZoneDTORequest, user);
            }
            case CircleGeofenceZoneDTORequest circleGeofenceZoneDTORequest-> {
                return createCircleGeofenceZone(circleGeofenceZoneDTORequest, user);
            }

            case null, default -> {
                return null;
            }
        }

    }

    @Override
    @Transactional(readOnly = true)
    public MultipleGeofenceZoneDTOResponse getMyGeofenceZones(User user) {
//        // Récupérer le nom d'utilisateur depuis le contexte de sécurité
//        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
//        String username = authentication.getName();
//
//        // Charger l'utilisateur complet depuis la base de données
//        User user = userRepository.findByUsername(username)
//                .orElseThrow(() -> new UsernameNotFoundException("Utilisateur non trouvé"));
        return new MultipleGeofenceZoneDTOResponse(getMyPolygonsGeofenceZone(user),getMyCirclesGeofenceZone(user));
    }

    @Override
    public GeofenceZoneDTOResponse editGeofenceZone(GeofenceZoneDTORequest geofenceZoneDTORequest, UUID zoneId, String type, User user) {
        // Récupérer le nom d'utilisateur depuis le contexte de sécurité
//        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
//        String username = authentication.getName();
//
//        // Charger l'utilisateur complet depuis la base de données
//        User user = userRepository.findByUsername(username)
//                .orElseThrow(() -> new UsernameNotFoundException("Utilisateur non trouvé"));

        if (Objects.equals(type, "p") && geofenceZoneDTORequest instanceof PolygonGeofenceZoneDTORequest) {
            return editPolygonGeofenceZone((PolygonGeofenceZoneDTORequest) geofenceZoneDTORequest, zoneId, user);
        } else if (Objects.equals(type, "c") && geofenceZoneDTORequest instanceof CircleGeofenceZoneDTORequest) {
            return editCircleGeofenceZone((CircleGeofenceZoneDTORequest) geofenceZoneDTORequest, zoneId, user);
        }
        return null;
    }

    @Override
    public void deleteGeofenceZone(UUID zoneId, String type, User user) {
        // Récupérer le nom d'utilisateur depuis le contexte de sécurité
//        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
//        String username = authentication.getName();
//
//        // Charger l'utilisateur complet depuis la base de données
//        User user = userRepository.findByUsername(username)
//                .orElseThrow(() -> new UsernameNotFoundException("Utilisateur non trouvé"));
        if (Objects.equals(type,"p")) {
            deletePolygonGeofenceZone(zoneId, user);
        } else if (Objects.equals(type,"c")) {
            deleteCircleGeofenceZone(zoneId, user);
        }
    }

    @Override
    @Transactional(readOnly = true)
    public PolygonGeofenceZoneDTOResponse getPolygonGeofenceZone(UUID Id) {
        PolygonGeofenceZone polygonGeofenceZone = polygonGeofenceZoneRepository.findById(Id).orElseThrow();
        return polygonDTOMapper.apply(polygonGeofenceZone);
    }

    @Override
    @Transactional(readOnly = true)
    public List<PolygonGeofenceZoneDTOResponse> getPolygonsGeofenceZone() {
        return polygonGeofenceZoneRepository.findAll()
                .stream()
                .map(polygonDTOMapper)
                .collect(Collectors.toList());
    }

    @Override
    public PolygonGeofenceZoneDTOResponse createPolygonGeofenceZone(PolygonGeofenceZoneDTORequest geofenceZoneDTORequest, User user) {
        PolygonGeofenceZone polygonGeofenceZone = new PolygonGeofenceZone();
        polygonGeofenceZone.setUser(user);
        polygonGeofenceZone.setPolygon(convertToPolygon(geofenceZoneDTORequest.polygon()));
        polygonGeofenceZone.setDescription(geofenceZoneDTORequest.description());
        polygonGeofenceZone.setTitle(geofenceZoneDTORequest.title());
        
        // Propriétés intelligentes
        polygonGeofenceZone.setIsTemporalEnabled(geofenceZoneDTORequest.isTemporalEnabled());
        if (geofenceZoneDTORequest.startTime() != null) {
            polygonGeofenceZone.setStartTime(java.time.LocalTime.parse(geofenceZoneDTORequest.startTime()));
        }
        if (geofenceZoneDTORequest.endTime() != null) {
            polygonGeofenceZone.setEndTime(java.time.LocalTime.parse(geofenceZoneDTORequest.endTime()));
        }
        if (geofenceZoneDTORequest.activeDays() != null) {
            polygonGeofenceZone.setActiveDays(java.util.Arrays.stream(geofenceZoneDTORequest.activeDays())
                .map(day -> ink.yowyob.geofence.util.DayOfWeekParser.parseToJavaDayOfWeek(day))
                .collect(java.util.stream.Collectors.toSet()));
        }
        polygonGeofenceZone.setIsConditionalEnabled(geofenceZoneDTORequest.isConditionalEnabled());
        polygonGeofenceZone.setMaxSpeed(geofenceZoneDTORequest.maxSpeed());
        polygonGeofenceZone.setMaxDwellTime(geofenceZoneDTORequest.maxDwellTime());
        polygonGeofenceZone.setMinDwellTime(geofenceZoneDTORequest.minDwellTime());

        return polygonDTOMapper.apply(polygonGeofenceZoneRepository.save(polygonGeofenceZone));
    }

    @Override
    @Transactional(readOnly = true)
    public List<PolygonGeofenceZoneDTOResponse> getMyPolygonsGeofenceZone(User user) {
        return polygonGeofenceZoneRepository.findByUser(user)
                .stream()
                .map(polygonDTOMapper)
                .collect(Collectors.toList());
    }

    @Override
    public PolygonGeofenceZoneDTOResponse editPolygonGeofenceZone(PolygonGeofenceZoneDTORequest geofenceZoneDTORequest, UUID zoneId, User user) {
        PolygonGeofenceZone polygonGeofenceZone = polygonGeofenceZoneRepository.findById(zoneId)
                .orElseThrow(() -> new IllegalStateException("polygon zone with id " + zoneId + " does not exist"));

        // Vérification des permissions
        if (!Objects.equals(polygonGeofenceZone.getUser().getUuid(), user.getUuid()) &&
                !Objects.equals(user.getRole().getName(), UserRole.ADMIN)) {
            throw new BadCredentialsException("the user " + user.getUsername() + " does not have permission to edit this zone");
        }

        // Mise à jour des champs
        if (geofenceZoneDTORequest.polygon() != null) {
            polygonGeofenceZone.setPolygon(convertToPolygon(geofenceZoneDTORequest.polygon()));
        }

        if (geofenceZoneDTORequest.description() != null) {
            polygonGeofenceZone.setDescription(geofenceZoneDTORequest.description());
        }

        if (geofenceZoneDTORequest.title() != null) {
            polygonGeofenceZone.setTitle(geofenceZoneDTORequest.title());
        }
        
        // Mise à jour des propriétés intelligentes
        if (geofenceZoneDTORequest.isTemporalEnabled() != null) {
            polygonGeofenceZone.setIsTemporalEnabled(geofenceZoneDTORequest.isTemporalEnabled());
        }
        if (geofenceZoneDTORequest.startTime() != null) {
            polygonGeofenceZone.setStartTime(java.time.LocalTime.parse(geofenceZoneDTORequest.startTime()));
        }
        if (geofenceZoneDTORequest.endTime() != null) {
            polygonGeofenceZone.setEndTime(java.time.LocalTime.parse(geofenceZoneDTORequest.endTime()));
        }
        if (geofenceZoneDTORequest.activeDays() != null) {
            polygonGeofenceZone.setActiveDays(java.util.Arrays.stream(geofenceZoneDTORequest.activeDays())
                .map(day -> ink.yowyob.geofence.util.DayOfWeekParser.parseToJavaDayOfWeek(day))
                .collect(java.util.stream.Collectors.toSet()));
        }
        if (geofenceZoneDTORequest.isConditionalEnabled() != null) {
            polygonGeofenceZone.setIsConditionalEnabled(geofenceZoneDTORequest.isConditionalEnabled());
        }
        if (geofenceZoneDTORequest.maxSpeed() != null) {
            polygonGeofenceZone.setMaxSpeed(geofenceZoneDTORequest.maxSpeed());
        }
        if (geofenceZoneDTORequest.maxDwellTime() != null) {
            polygonGeofenceZone.setMaxDwellTime(geofenceZoneDTORequest.maxDwellTime());
        }
        if (geofenceZoneDTORequest.minDwellTime() != null) {
            polygonGeofenceZone.setMinDwellTime(geofenceZoneDTORequest.minDwellTime());
        }

        // Sauvegarde et retour de la réponse
        return polygonDTOMapper.apply(polygonGeofenceZoneRepository.save(polygonGeofenceZone));
    }

    @Override
    public void deletePolygonGeofenceZone(UUID zoneId, User user) {
        PolygonGeofenceZone polygonGeofenceZone = polygonGeofenceZoneRepository.findById(zoneId).orElseThrow(() ->new IllegalStateException("polygon zone with id "+zoneId+" does not exist"));
        if(!Objects.equals(polygonGeofenceZone.getUser().getUuid(), user.getUuid()) && !Objects.equals(user.getRole().getName(), UserRole.ADMIN)){
            throw new BadCredentialsException("the user "+ user.getUsername()+"does not have permission to delete this zone");
        }
        polygonGeofenceZoneRepository.deleteById(zoneId);
    }

    @Override
    @Transactional(readOnly = true)
    public CircleGeofenceZoneDTOResponse getCircleGeofenceZone(UUID Id) {
        CircleGeofenceZone circleGeofenceZone = circleGeofenceZoneRepository.findById(Id).orElseThrow();
        return circleDTOMapper.apply(circleGeofenceZone);
    }

    @Override
    @Transactional(readOnly = true)
    public List<CircleGeofenceZoneDTOResponse> getCirclesGeofenceZone() {
        return circleGeofenceZoneRepository.findAll()
                .stream()
                .map(circleDTOMapper)
                .collect(Collectors.toList());
    }

    @Override
    public CircleGeofenceZoneDTOResponse createCircleGeofenceZone(CircleGeofenceZoneDTORequest geofenceZoneDTORequest, User user) {
        CircleGeofenceZone circleGeofenceZone = new CircleGeofenceZone();
        circleGeofenceZone.setUser(user);
        circleGeofenceZone.setDescription(geofenceZoneDTORequest.description());
        circleGeofenceZone.setTitle(geofenceZoneDTORequest.title());
        circleGeofenceZone.setRadius(geofenceZoneDTORequest.radius());
        circleGeofenceZone.setCenter(convertToPoint(geofenceZoneDTORequest.center()));
        
        // Propriétés intelligentes
        circleGeofenceZone.setIsTemporalEnabled(geofenceZoneDTORequest.isTemporalEnabled());
        if (geofenceZoneDTORequest.startTime() != null) {
            circleGeofenceZone.setStartTime(java.time.LocalTime.parse(geofenceZoneDTORequest.startTime()));
        }
        if (geofenceZoneDTORequest.endTime() != null) {
            circleGeofenceZone.setEndTime(java.time.LocalTime.parse(geofenceZoneDTORequest.endTime()));
        }
        if (geofenceZoneDTORequest.activeDays() != null) {
            circleGeofenceZone.setActiveDays(java.util.Arrays.stream(geofenceZoneDTORequest.activeDays())
                .map(day -> ink.yowyob.geofence.util.DayOfWeekParser.parseToJavaDayOfWeek(day))
                .collect(java.util.stream.Collectors.toSet()));
        }
        circleGeofenceZone.setIsConditionalEnabled(geofenceZoneDTORequest.isConditionalEnabled());
        circleGeofenceZone.setMaxSpeed(geofenceZoneDTORequest.maxSpeed());
        circleGeofenceZone.setMaxDwellTime(geofenceZoneDTORequest.maxDwellTime());
        circleGeofenceZone.setMinDwellTime(geofenceZoneDTORequest.minDwellTime());
        
        return circleDTOMapper.apply(circleGeofenceZoneRepository.save(circleGeofenceZone));
    }

    @Override
    @Transactional(readOnly = true)
    public List<CircleGeofenceZoneDTOResponse> getMyCirclesGeofenceZone(User user) {
        return circleGeofenceZoneRepository.findByUser(user)
                .stream()
                .map(circleDTOMapper)
                .collect(Collectors.toList());
    }

    @Override
    public CircleGeofenceZoneDTOResponse editCircleGeofenceZone(CircleGeofenceZoneDTORequest geofenceZoneDTORequest, UUID zoneId, User user) {
        CircleGeofenceZone circleGeofenceZone = circleGeofenceZoneRepository.findById(zoneId)
                .orElseThrow(() -> new IllegalStateException("circle zone with id " + zoneId + " does not exist"));

        // Vérification des permissions
        if (!Objects.equals(circleGeofenceZone.getUser().getUuid(), user.getUuid()) &&
                !Objects.equals(user.getRole().getName(), UserRole.ADMIN)) {
            throw new BadCredentialsException("the user " + user.getUsername() + " does not have permission to edit this zone");
        }

        // Mise à jour des champs
        if (geofenceZoneDTORequest.center() != null) {
            circleGeofenceZone.setCenter(convertToPoint(geofenceZoneDTORequest.center()));
        }

        if (geofenceZoneDTORequest.radius() != null) {
            circleGeofenceZone.setRadius(geofenceZoneDTORequest.radius());
        }

        if (geofenceZoneDTORequest.description() != null) {
            circleGeofenceZone.setDescription(geofenceZoneDTORequest.description());
        }

        if (geofenceZoneDTORequest.title() != null) {
            circleGeofenceZone.setTitle(geofenceZoneDTORequest.title());
        }
        
        // Mise à jour des propriétés intelligentes
        if (geofenceZoneDTORequest.isTemporalEnabled() != null) {
            circleGeofenceZone.setIsTemporalEnabled(geofenceZoneDTORequest.isTemporalEnabled());
        }
        if (geofenceZoneDTORequest.startTime() != null) {
            circleGeofenceZone.setStartTime(java.time.LocalTime.parse(geofenceZoneDTORequest.startTime()));
        }
        if (geofenceZoneDTORequest.endTime() != null) {
            circleGeofenceZone.setEndTime(java.time.LocalTime.parse(geofenceZoneDTORequest.endTime()));
        }
        if (geofenceZoneDTORequest.activeDays() != null) {
            circleGeofenceZone.setActiveDays(java.util.Arrays.stream(geofenceZoneDTORequest.activeDays())
                .map(day -> ink.yowyob.geofence.util.DayOfWeekParser.parseToJavaDayOfWeek(day))
                .collect(java.util.stream.Collectors.toSet()));
        }
        if (geofenceZoneDTORequest.isConditionalEnabled() != null) {
            circleGeofenceZone.setIsConditionalEnabled(geofenceZoneDTORequest.isConditionalEnabled());
        }
        if (geofenceZoneDTORequest.maxSpeed() != null) {
            circleGeofenceZone.setMaxSpeed(geofenceZoneDTORequest.maxSpeed());
        }
        if (geofenceZoneDTORequest.maxDwellTime() != null) {
            circleGeofenceZone.setMaxDwellTime(geofenceZoneDTORequest.maxDwellTime());
        }
        if (geofenceZoneDTORequest.minDwellTime() != null) {
            circleGeofenceZone.setMinDwellTime(geofenceZoneDTORequest.minDwellTime());
        }

        // Sauvegarde et retour de la réponse
        return circleDTOMapper.apply(circleGeofenceZoneRepository.save(circleGeofenceZone));
    }

    @Override
    public void deleteCircleGeofenceZone(UUID zoneId, User user) {
        CircleGeofenceZone circleGeofenceZone = circleGeofenceZoneRepository.findById(zoneId).orElseThrow(() ->new IllegalStateException("circle zone with id "+zoneId+" does not exist"));
        if(!Objects.equals(circleGeofenceZone.getUser(), user) && !Objects.equals(user.getRole().getName(), UserRole.ADMIN)){
            throw new BadCredentialsException("the user "+ user.getUsername()+"does not have permission to delete this zone");
        }
        circleGeofenceZoneRepository.deleteById(zoneId);
    }

    @Override
    public Polygon convertToPolygon(PolygonDTO dto) {
        GeometryFactory factory = new GeometryFactory(new PrecisionModel(), 4326);

        // Vérification de l'existence de l'anneau principal
        if (dto.coordinates() == null || dto.coordinates().isEmpty()) {
            throw new IllegalArgumentException("Le polygone doit contenir au moins un anneau.");
        }

        List<List<Double>> ring = dto.coordinates().getFirst();

        if (ring.size() < 4) {
            throw new IllegalArgumentException("Un polygone valide doit avoir au moins 4 points (3 + retour au départ).");
        }

        List<Double> firstPoint = ring.getFirst();
        List<Double> lastPoint = ring.getLast();

        if (!firstPoint.equals(lastPoint)) {
            throw new IllegalArgumentException("Le polygone doit être fermé (le premier et dernier point doivent être identiques).");
        }

        // Conversion de l'anneau extérieur
        List<Coordinate> shellCoords = ring.stream()
                .map(coord -> new Coordinate(coord.getFirst(), coord.get(1)))
                .toList();
        LinearRing shell = factory.createLinearRing(shellCoords.toArray(new Coordinate[0]));
        Polygon polygon = factory.createPolygon(shell);

        polygon.setSRID(4326);
        return factory.createPolygon(shell);
    }

    @Override
    public Point convertToPoint(PointDTO dto) {
        GeometryFactory factory = new GeometryFactory(new PrecisionModel(), 4326);

        List<Double> coords = dto.coordinates();
        if (coords == null || coords.size() != 2) {
            throw new IllegalArgumentException("PointDTO must contain exactly 2 coordinates: [longitude, latitude]");
        }

        double longitude = coords.get(0);
        double latitude = coords.get(1);

        return factory.createPoint(new Coordinate(longitude, latitude));
    }

}

```

*Lignes: 425*

---

### 📄 src\main\java\ink\yowyob\geofence\service\Implementation\GeofenceSharingServiceImpl.java

```java
package ink.yowyob.geofence.service.Implementation;

import ink.yowyob.geofence.Enum.ShareStatus;
import ink.yowyob.geofence.dto.request.ShareGeofenceRequest;
import ink.yowyob.geofence.dto.response.GeofenceShareDTO;
import ink.yowyob.geofence.dto.response.GeofenceShareListResponse;
import ink.yowyob.geofence.exception.BadCredentialsException;
import ink.yowyob.geofence.mapper.GeofenceShareDTOMapper;
import ink.yowyob.geofence.model.GeofenceShare;
import ink.yowyob.geofence.model.GeofenceZone;
import ink.yowyob.geofence.model.User;
import ink.yowyob.geofence.repository.CircleGeofenceZoneRepository;
import ink.yowyob.geofence.repository.GeofenceShareRepository;
import ink.yowyob.geofence.repository.PolygonGeofenceZoneRepository;
import ink.yowyob.geofence.repository.UserRepository;
import ink.yowyob.geofence.service.GeofenceSharingService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Objects;
import java.util.UUID;
import java.util.stream.Collectors;

@Slf4j
@Service
@AllArgsConstructor
public class GeofenceSharingServiceImpl implements GeofenceSharingService {
    private final GeofenceShareRepository geofenceShareRepository;
    private final UserRepository userRepository;
    private final CircleGeofenceZoneRepository circleGeofenceZoneRepository;
    private final PolygonGeofenceZoneRepository polygonGeofenceZoneRepository;
    private final GeofenceShareDTOMapper geofenceShareDTOMapper;

    @Override
    public GeofenceShareDTO shareGeofence(UUID geofenceId, String type, ShareGeofenceRequest request, User user) {

        // Get the geofence zone
        GeofenceZone geofenceZone;
        if (Objects.equals(type, "c")) {
            geofenceZone = circleGeofenceZoneRepository.findById(geofenceId)
                    .orElseThrow(() -> new IllegalStateException("Circle geofence zone with id " + geofenceId + " does not exist"));
        } else if (Objects.equals(type, "p")) {
            geofenceZone = polygonGeofenceZoneRepository.findById(geofenceId)
                    .orElseThrow(() -> new IllegalStateException("Polygon geofence zone with id " + geofenceId + " does not exist"));
        } else {
            throw new IllegalArgumentException("Invalid geofence zone type: " + type);
        }

        // Check if the current user is the owner of the geofence
        if (!Objects.equals(geofenceZone.getUser().getUuid(), user.getUuid())) {
            throw new BadCredentialsException("User is not authorized to share this geofence zone");
        }

        // Get the target user
        User targetUser = userRepository.findById(request.targetUserId())
                .orElseThrow(() -> new UsernameNotFoundException("Target user not found"));

        // Create the geofence share with PENDING status
        GeofenceShare geofenceShare = new GeofenceShare();
        geofenceShare.setGeofenceZone(geofenceZone);
        geofenceShare.setSharedBy(user);
        geofenceShare.setSharedWith(targetUser);
        geofenceShare.setSharedAt(LocalDateTime.now());
        geofenceShare.setExpiresAt(request.expiresAt());
        geofenceShare.setCanEdit(request.canEdit());
        geofenceShare.setStatus(ShareStatus.PENDING); // Nouveau: status en attente

        // Save and return
        GeofenceShare savedShare = geofenceShareRepository.save(geofenceShare);

        return geofenceShareDTOMapper.apply(savedShare);
    }

    @Override
    public GeofenceShareDTO updateGeofenceShare(UUID shareId, ShareGeofenceRequest request, User user) {

        // Get the geofence share
        GeofenceShare geofenceShare = geofenceShareRepository.findById(shareId)
                .orElseThrow(() -> new IllegalStateException("Geofence share with id " + shareId + " does not exist"));

        // Check if the current user is the owner of the share
        if (!Objects.equals(geofenceShare.getSharedBy().getUuid(), user.getUuid())) {
            throw new BadCredentialsException("User is not authorized to update this geofence share");
        }

        // Update the target user if specified
        if (request.targetUserId() != null) {
            User targetUser = userRepository.findById(request.targetUserId())
                    .orElseThrow(() -> new UsernameNotFoundException("Target user not found"));
            geofenceShare.setSharedWith(targetUser);
        }

        // Update other fields
        if (request.expiresAt() != null) {
            geofenceShare.setExpiresAt(request.expiresAt());
        }
        geofenceShare.setCanEdit(request.canEdit());

        // Save and return
        GeofenceShare updatedShare = geofenceShareRepository.save(geofenceShare);
        return geofenceShareDTOMapper.apply(updatedShare);
    }

    @Override
    public void deleteGeofenceShare(UUID shareId, User user) {

        // Get the geofence share
        GeofenceShare geofenceShare = geofenceShareRepository.findById(shareId)
                .orElseThrow(() -> new IllegalStateException("Geofence share with id " + shareId + " does not exist"));

        // Check if the current user is the owner of the share
        if (!Objects.equals(geofenceShare.getSharedBy().getUuid(), user.getUuid())) {
            throw new BadCredentialsException("User is not authorized to delete this geofence share");
        }

        // Delete the share
        geofenceShareRepository.delete(geofenceShare);
    }

    @Override
    public GeofenceShareListResponse getSharedGeofences(User user) {

        // Get all ACCEPTED geofence shares shared with the current user
        List<GeofenceShare> shares = geofenceShareRepository.findBySharedWithAndStatusAndExpiresAtAfter(
                user, ShareStatus.ACCEPTED, LocalDateTime.now());

        // Convert to DTOs
        List<GeofenceShareDTO> shareDTOs = shares.stream()
                .map(geofenceShareDTOMapper)
                .collect(Collectors.toList());

        return new GeofenceShareListResponse(shareDTOs, shareDTOs.size());
    }

    @Override
    public GeofenceShareListResponse getMySharedGeofences(User user) {

        // Get all geofence shares shared by the current user
        List<GeofenceShare> shares = geofenceShareRepository.findBySharedBy(user);

        // Convert to DTOs
        List<GeofenceShareDTO> shareDTOs = shares.stream()
                .map(geofenceShareDTOMapper)
                .collect(Collectors.toList());

        return new GeofenceShareListResponse(shareDTOs, shareDTOs.size());
    }

    @Override
    public GeofenceShareListResponse getPendingInvitations(User user) {

        // Get all pending invitations for the current user
        List<GeofenceShare> pendingShares = geofenceShareRepository
                .findBySharedWithAndStatusOrderBySharedAtDesc(user, ShareStatus.PENDING);

        // Convert to DTOs
        List<GeofenceShareDTO> shareDTOs = pendingShares.stream()
                .map(geofenceShareDTOMapper)
                .collect(Collectors.toList());

        return new GeofenceShareListResponse(shareDTOs, shareDTOs.size());
    }

    @Override
    public GeofenceShareDTO respondToInvitation(UUID shareId, boolean accept, User user) {

        // Get the geofence share
        GeofenceShare geofenceShare = geofenceShareRepository.findById(shareId)
                .orElseThrow(() -> new IllegalStateException("Geofence share with id " + shareId + " does not exist"));

        // Check if the current user is the target of the share
        if (!Objects.equals(geofenceShare.getSharedWith().getUuid(), user.getUuid())) {
            throw new BadCredentialsException("User is not authorized to respond to this invitation");
        }

        // Check if the invitation is still pending
        if (geofenceShare.getStatus() != ShareStatus.PENDING) {
            throw new BadCredentialsException("This invitation has already been responded to");
        }

        // Check if the invitation has not expired
        if (geofenceShare.getExpiresAt() != null && geofenceShare.getExpiresAt().isBefore(LocalDateTime.now())) {
            throw new BadCredentialsException("This invitation has expired");
        }

        // Update the status based on user response
        geofenceShare.setStatus(accept ? ShareStatus.ACCEPTED : ShareStatus.REFUSED);
        geofenceShare.setRespondedAt(LocalDateTime.now());

        // Save and return
        GeofenceShare updatedShare = geofenceShareRepository.save(geofenceShare);

        return geofenceShareDTOMapper.apply(updatedShare);
    }
}
```

*Lignes: 199*

---

### 📄 src\main\java\ink\yowyob\geofence\service\Implementation\LocationServiceImpl.java

```java
package ink.yowyob.geofence.service.Implementation;

import ink.yowyob.geofence.Enum.AlertTypeEnum;
import ink.yowyob.geofence.Enum.UserRole;
import ink.yowyob.geofence.dto.request.CreateApiKeyRequest;
import ink.yowyob.geofence.dto.request.LocationUpdateRequest;
import ink.yowyob.geofence.dto.response.*;
import ink.yowyob.geofence.exception.BadCredentialsException;
import ink.yowyob.geofence.exception.ResourceNotFoundException;
import ink.yowyob.geofence.mapper.LocationDTOMapper;
import ink.yowyob.geofence.mapper.VehicleApiKeyDTOMapper;
import ink.yowyob.geofence.model.*;
import ink.yowyob.geofence.repository.LocationRepository;
import ink.yowyob.geofence.repository.UserRepository;
import ink.yowyob.geofence.repository.VehicleApiKeyRepository;
import ink.yowyob.geofence.repository.VehicleRepository;
import ink.yowyob.geofence.service.AlertService;
import ink.yowyob.geofence.service.LocationService;
import ink.yowyob.geofence.service.RealTimeService;
import ink.yowyob.geofence.dto.response.SimpleVehicleDTO;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.locationtech.jts.geom.Coordinate;
import org.locationtech.jts.geom.GeometryFactory;
import org.locationtech.jts.geom.Point;
import org.locationtech.jts.geom.PrecisionModel;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.SecureRandom;
import java.time.Duration;
import java.time.LocalDateTime;
import java.util.*;
import java.util.ArrayList;

@Slf4j
@Service
@RequiredArgsConstructor
public class LocationServiceImpl implements LocationService {

    private final LocationRepository locationRepository;
    private final VehicleRepository vehicleRepository;
    private final VehicleApiKeyRepository apiKeyRepository;
    private final UserRepository userRepository;
    private final AlertService alertService;
    private final RealTimeService realTimeService;
    private final LocationDTOMapper locationMapper;
    private final VehicleApiKeyDTOMapper apiKeyMapper;

    private final GeometryFactory geometryFactory = new GeometryFactory(new PrecisionModel(), 4326);
    private final SecureRandom secureRandom = new SecureRandom();

    @Override
    @Transactional
    public LocationUpdateResponse updateLocationFromDevice(String apiKey, LocationUpdateRequest request) {
        // Valider la clé API
        VehicleApiKey vehicleApiKey = apiKeyRepository.findByApiKeyAndIsActiveTrue(apiKey)
                .orElseThrow(() -> new BadCredentialsException("Clé API invalide ou inactive"));

        if (!vehicleApiKey.isValid()) {
            throw new BadCredentialsException("Clé API expirée");
        }

        Vehicle vehicle = vehicleApiKey.getVehicle();

        // Créer la nouvelle position
        Point position = geometryFactory.createPoint(
                new Coordinate(request.longitude(), request.latitude())
        );

        Location location = new Location();
        location.setVehicle(vehicle);
        location.setPosition(position);
        location.setSpeed(request.speed());
        location.setHeading(request.heading());
        location.setAltitude(request.altitude());
        location.setAccuracy(request.accuracy());
        location.setSource(request.source());

        // Sauvegarder la position
        Location savedLocation = locationRepository.save(location);
        locationRepository.flush(); // Forcer la sauvegarde immédiate en base

        // Mettre à jour la dernière utilisation de la clé
        vehicleApiKey.updateLastUsed();
        apiKeyRepository.save(vehicleApiKey);

        // Vérifier les géofences et générer les alertes de façon asynchrone
        List<AlertDTO> alerts = new ArrayList<>();
        try {
            alerts = checkGeofencesAndGenerateAlerts(vehicle, savedLocation);
        } catch (Exception e) {
            log.warn("Erreur lors de la génération d'alertes pour le véhicule {}: {}", vehicle.getLicensePlate(), e.getMessage());
            // Continuer sans alertes - l'important est que la position soit sauvegardée
        }

        // Diffuser la mise à jour en temps réel
        try {
            LocationDTO locationDTO = locationMapper.apply(savedLocation);
            SimpleVehicleDTO vehicleDTO = new SimpleVehicleDTO(
                vehicle.getId(),
                vehicle.getBrand(),
                vehicle.getModel(),
                vehicle.getLicensePlate(),
                vehicle.getImageUrl()
            );
            realTimeService.broadcastLocationUpdate(locationDTO, vehicleDTO, vehicle.getUser());
            
            // Diffuser les alertes si il y en a
            for (AlertDTO alert : alerts) {
                realTimeService.broadcastAlert(alert, vehicle.getUser());
            }
        } catch (Exception e) {
            log.warn("Erreur lors de la diffusion temps réel pour le véhicule {}: {}", vehicle.getLicensePlate(), e.getMessage());
        }

        return new LocationUpdateResponse(
                true,
                "Position mise à jour avec succès",
                locationMapper.apply(savedLocation),
                alerts
        );
    }

    @Override
    @Transactional(readOnly = true)
    public LocationListResponse getLocationHistory(UUID vehicleId, int page, int size, User user) {

        Vehicle vehicle = vehicleRepository.findById(vehicleId)
                .orElseThrow(() -> new ResourceNotFoundException("Véhicule non trouvé"));

        // Vérifier les permissions
        boolean isAuthorized = Objects.equals(vehicle.getUser().getUuid(), user.getUuid()) ||
                user.getRole().getName() == UserRole.ADMIN ||
                user.getRole().getName() == UserRole.MANAGER;

        if (!isAuthorized) {
            throw new BadCredentialsException("Accès refusé à l'historique de ce véhicule");
        }

        Pageable pageable = PageRequest.of(page, size);
        Page<Location> locationPage = locationRepository.findByVehicleOrderByTimestampDescWithVehicle(vehicle, pageable);

        List<LocationDTO> locationDTOs = locationPage.getContent().stream()
                .map(locationMapper)
                .toList();

        return new LocationListResponse(
                locationDTOs,
                locationDTOs.size(),
                page,
                size,
                locationPage.getTotalElements(),
                locationPage.getTotalPages()
        );
    }

    @Override
    @Transactional(readOnly = true)
    public LocationDTO getLatestLocation(UUID vehicleId, User user) {

        Vehicle vehicle = vehicleRepository.findById(vehicleId)
                .orElseThrow(() -> new ResourceNotFoundException("Véhicule non trouvé"));

        // Vérifier les permissions
        boolean isAuthorized = Objects.equals(vehicle.getUser().getUuid(), user.getUuid()) ||
                user.getRole().getName() == UserRole.ADMIN ||
                user.getRole().getName() == UserRole.MANAGER;

        if (!isAuthorized) {
            throw new BadCredentialsException("Accès refusé à la position de ce véhicule");
        }

        Pageable latestPageable = PageRequest.of(0, 1);
        List<Location> latestLocations = locationRepository.findByVehicleOrderByTimestampDescWithVehicleList(vehicle, latestPageable);
        
        if (latestLocations.isEmpty()) {
            throw new ResourceNotFoundException("Aucune position trouvée pour ce véhicule");
        }
        
        Location latestLocation = latestLocations.get(0);

        return locationMapper.apply(latestLocation);
    }

    @Override
    @Transactional
    public void deleteLocation(UUID locationId, User user) {

        Location location = locationRepository.findById(locationId)
                .orElseThrow(() -> new ResourceNotFoundException("Position non trouvée"));

        // Vérifier les permissions
        boolean isAuthorized = Objects.equals(location.getVehicle().getUser().getUuid(), user.getUuid()) ||
                user.getRole().getName() == UserRole.ADMIN;

        if (!isAuthorized) {
            throw new BadCredentialsException("Accès refusé pour supprimer cette position");
        }

        locationRepository.delete(location);
    }

    @Override
    @Transactional
    public VehicleApiKeyDTO generateApiKey(CreateApiKeyRequest request, User user) {

        Vehicle vehicle = vehicleRepository.findById(request.vehicleId())
                .orElseThrow(() -> new ResourceNotFoundException("Véhicule non trouvé"));

        // Vérifier les permissions
        boolean isAuthorized = Objects.equals(vehicle.getUser().getUuid(), user.getUuid()) ||
                user.getRole().getName() == UserRole.ADMIN;

        if (!isAuthorized) {
            throw new BadCredentialsException("Accès refusé pour ce véhicule");
        }

        // Désactiver l'ancienne clé si elle existe
        apiKeyRepository.findByVehicle(vehicle).ifPresent(oldKey -> {
            oldKey.setActive(false);
            apiKeyRepository.save(oldKey);
        });

        // Générer une nouvelle clé
        String apiKey = generateSecureApiKey(vehicle);

        VehicleApiKey vehicleApiKey = VehicleApiKey.builder()
                .apiKey(apiKey)
                .vehicle(vehicle)
                .isActive(true)
                .expiresAt(request.expiresAt())
                .build();

        VehicleApiKey savedApiKey = apiKeyRepository.save(vehicleApiKey);


        return apiKeyMapper.apply(savedApiKey);
    }

    @Override
    public VehicleApiKeyDTO getApiKeyForVehicle(UUID vehicleId, User user) {

        Vehicle vehicle = vehicleRepository.findById(vehicleId)
                .orElseThrow(() -> new ResourceNotFoundException("Véhicule non trouvé"));

        // Vérifier les permissions
        boolean isAuthorized = Objects.equals(vehicle.getUser().getUuid(), user.getUuid()) ||
                user.getRole().getName() == UserRole.ADMIN;

        if (!isAuthorized) {
            throw new BadCredentialsException("Accès refusé pour ce véhicule");
        }

        VehicleApiKey apiKey = apiKeyRepository.findByVehicle(vehicle)
                .orElseThrow(() -> new ResourceNotFoundException("Aucune clé API trouvée pour ce véhicule"));

        return apiKeyMapper.apply(apiKey);
    }

    @Override
    @Transactional
    public void revokeApiKey(UUID vehicleId, User user) {

        Vehicle vehicle = vehicleRepository.findById(vehicleId)
                .orElseThrow(() -> new ResourceNotFoundException("Véhicule non trouvé"));

        // Vérifier les permissions
        boolean isAuthorized = Objects.equals(vehicle.getUser().getUuid(), user.getUuid()) ||
                user.getRole().getName() == UserRole.ADMIN;

        if (!isAuthorized) {
            throw new BadCredentialsException("Accès refusé pour ce véhicule");
        }

        apiKeyRepository.deactivateByVehicleId(vehicleId);

    }

    @Override
    public ApiKeyListResponse getMyApiKeys(User user) {

        List<Vehicle> userVehicles = vehicleRepository.findByUser(user);
        List<VehicleApiKeyDTO> apiKeys = new ArrayList<>();

        for (Vehicle vehicle : userVehicles) {
            apiKeyRepository.findByVehicle(vehicle)
                    .ifPresent(apiKey -> apiKeys.add(apiKeyMapper.apply(apiKey)));
        }

        return new ApiKeyListResponse(apiKeys, apiKeys.size());
    }

    // Méthodes privées

    private String generateSecureApiKey(Vehicle vehicle) {
        try {
            // Utiliser l'ID du véhicule, timestamp et random pour l'unicité
            String data = vehicle.getId().toString() +
                    System.currentTimeMillis() +
                    secureRandom.nextLong();

            MessageDigest digest = MessageDigest.getInstance("SHA-256");
            byte[] hash = digest.digest(data.getBytes(StandardCharsets.UTF_8));

            // Convertir en hexadécimal et prendre les 64 premiers caractères
            StringBuilder hexString = new StringBuilder();
            for (byte b : hash) {
                String hex = Integer.toHexString(0xff & b);
                if (hex.length() == 1) {
                    hexString.append('0');
                }
                hexString.append(hex);
            }

            return "vk_" + hexString.toString().substring(0, 60); // Préfixe + 60 chars
        } catch (Exception e) {
            throw new RuntimeException("Erreur lors de la génération de la clé API", e);
        }
    }

    private List<AlertDTO> checkGeofencesAndGenerateAlerts(Vehicle vehicle, Location currentLocation) {
        List<AlertDTO> alerts = new ArrayList<>();
        LocalDateTime currentTime = currentLocation.getTimestamp();

        // Récupérer la position précédente du véhicule (avant la position actuelle)
        Optional<Location> previousLocationOpt = locationRepository
                .findTopByVehicleAndTimestampBeforeOrderByTimestampDesc(vehicle, currentTime);

        // Récupérer les zones de géofence associées au véhicule
        for (GeofenceZone zone : vehicle.getGeofenceZones()) {
            // Vérifier si la zone est active à ce moment (géofence intelligente)
            if (!zone.isActiveAtTime(currentTime)) {
                // Zone inactive, vérifier si le véhicule y est quand même
                if (isPointInsideGeofence(currentLocation.getPosition(), zone)) {
                    AlertDTO alert = alertService.createAlert(
                            vehicle, zone, AlertTypeEnum.ZONE_TEMPORAL_VIOLATION, currentLocation,
                            "Véhicule " + vehicle.getLicensePlate() + " dans zone " + zone.getTitle() + " inactive à cette heure"
                    );
                    alerts.add(alert);
                }
                continue; // Passer à la zone suivante
            }

            boolean isCurrentlyInside = isPointInsideGeofence(currentLocation.getPosition(), zone);

            // Si c'est la première position, générer seulement une alerte d'entrée si nécessaire
            if (previousLocationOpt.isEmpty()) {
                if (isCurrentlyInside) {
                    AlertDTO alert = alertService.createAlert(
                            vehicle, zone, AlertTypeEnum.ZONE_ENTER, currentLocation,
                            "Véhicule " + vehicle.getLicensePlate() + " est entré dans la zone " + zone.getTitle()
                    );
                    alerts.add(alert);
                    
                    // Vérifications intelligentes pour la première entrée
                    alerts.addAll(checkIntelligentGeofenceViolations(vehicle, zone, currentLocation, null));
                }
                continue;
            }

            // Vérifier l'état précédent
            Location previousLocation = previousLocationOpt.get();
            boolean wasPreviouslyInside = isPointInsideGeofence(previousLocation.getPosition(), zone);

            // Générer des alertes seulement s'il y a un changement d'état
            if (!wasPreviouslyInside && isCurrentlyInside) {
                // Le véhicule vient d'entrer dans la zone
                AlertDTO alert = alertService.createAlert(
                        vehicle, zone, AlertTypeEnum.ZONE_ENTER, currentLocation,
                        "Véhicule " + vehicle.getLicensePlate() + " est entré dans la zone " + zone.getTitle()
                );
                alerts.add(alert);
                log.info("ZONE_ENTER: Véhicule {} est entré dans la zone {}",
                        vehicle.getLicensePlate(), zone.getTitle());

            } else if (wasPreviouslyInside && !isCurrentlyInside) {
                // Le véhicule vient de sortir de la zone
                AlertDTO alert = alertService.createAlert(
                        vehicle, zone, AlertTypeEnum.ZONE_EXIT, currentLocation,
                        "Véhicule " + vehicle.getLicensePlate() + " est sorti de la zone " + zone.getTitle()
                );
                alerts.add(alert);
                log.info("ZONE_EXIT: Véhicule {} est sorti de la zone {}",
                        vehicle.getLicensePlate(), zone.getTitle());
                        
                // Vérifier le temps de séjour en sortant
                alerts.addAll(checkDwellTimeViolations(vehicle, zone, currentLocation, previousLocation));
            }
            
            // Vérifications intelligentes continues (vitesse, etc.)
            if (isCurrentlyInside) {
                alerts.addAll(checkIntelligentGeofenceViolations(vehicle, zone, currentLocation, previousLocation));
            }
        }

        return alerts;
    }

    private boolean isPointInsideGeofence(Point point, GeofenceZone zone) {
        if (zone instanceof CircleGeofenceZone circle) {
            // Distance entre le point et le centre du cercle
            double distance = point.distance(circle.getCenter());
            // Convertir le rayon en degrés (approximation)
            double radiusInDegrees = circle.getRadius() / 111000.0; // 1 degré ≈ 111 km
            return distance <= radiusInDegrees;
        } else if (zone instanceof PolygonGeofenceZone polygon) {
            // Utiliser la méthode contains de JTS
            return polygon.getPolygon().contains(point);
        }
        return false;
    }
    
    // Nouvelles méthodes pour géofence intelligente
    
    private List<AlertDTO> checkIntelligentGeofenceViolations(Vehicle vehicle, GeofenceZone zone, 
                                                              Location currentLocation, Location previousLocation) {
        List<AlertDTO> alerts = new ArrayList<>();
        
        // Vérification de vitesse
        if (zone.getIsConditionalEnabled() != null && zone.getIsConditionalEnabled() && zone.getMaxSpeed() != null && 
            currentLocation.getSpeed() != null && currentLocation.getSpeed() > zone.getMaxSpeed()) {
            
            AlertDTO alert = alertService.createAlert(
                    vehicle, zone, AlertTypeEnum.ZONE_SPEED_VIOLATION, currentLocation,
                    String.format("Véhicule %s dépasse la limite de vitesse (%.1f km/h > %.1f km/h) dans la zone %s",
                            vehicle.getLicensePlate(), currentLocation.getSpeed(), zone.getMaxSpeed(), zone.getTitle())
            );
            alerts.add(alert);
        }
        
        return alerts;
    }
    
    private List<AlertDTO> checkDwellTimeViolations(Vehicle vehicle, GeofenceZone zone, 
                                                    Location currentLocation, Location previousLocation) {
        List<AlertDTO> alerts = new ArrayList<>();
        
        if (zone.getIsConditionalEnabled() == null || !zone.getIsConditionalEnabled() || (zone.getMaxDwellTime() == null && zone.getMinDwellTime() == null)) {
            return alerts;
        }
        
        try {
            // Calculer le temps de séjour approximatif
            Optional<Location> firstEntryOpt = locationRepository
                    .findFirstEntryIntoGeofence(vehicle, zone.getId(), currentLocation.getTimestamp());
            
            if (firstEntryOpt.isPresent()) {
                Location firstEntry = firstEntryOpt.get();
                Duration dwellTime = Duration.between(firstEntry.getTimestamp(), currentLocation.getTimestamp());
                long dwellMinutes = dwellTime.toMinutes();
                
                // Vérifier temps maximum
                if (zone.getMaxDwellTime() != null && dwellMinutes > zone.getMaxDwellTime()) {
                    AlertDTO alert = alertService.createAlert(
                            vehicle, zone, AlertTypeEnum.ZONE_DWELL_TIME_EXCEEDED, currentLocation,
                            String.format("Véhicule %s a dépassé le temps de séjour maximum (%d min > %d min) dans la zone %s",
                                    vehicle.getLicensePlate(), dwellMinutes, zone.getMaxDwellTime(), zone.getTitle())
                    );
                    alerts.add(alert);
                }
                
                // Vérifier temps minimum (seulement lors de la sortie)
                if (zone.getMinDwellTime() != null && dwellMinutes < zone.getMinDwellTime()) {
                    AlertDTO alert = alertService.createAlert(
                            vehicle, zone, AlertTypeEnum.ZONE_DWELL_TIME_INSUFFICIENT, currentLocation,
                            String.format("Véhicule %s n'a pas respecté le temps de séjour minimum (%d min < %d min) dans la zone %s",
                                    vehicle.getLicensePlate(), dwellMinutes, zone.getMinDwellTime(), zone.getTitle())
                    );
                    alerts.add(alert);
                }
            }
        } catch (Exception e) {
            log.warn("Erreur lors du calcul du temps de séjour pour le véhicule {} dans la zone {}: {}", 
                    vehicle.getLicensePlate(), zone.getTitle(), e.getMessage());
        }
        
        return alerts;
    }
}
```

*Lignes: 485*

---

### 📄 src\main\java\ink\yowyob\geofence\service\Implementation\RealTimeServiceImpl.java

```java
package ink.yowyob.geofence.service.Implementation;

import ink.yowyob.geofence.dto.response.AlertDTO;
import ink.yowyob.geofence.dto.response.LocationDTO;
import ink.yowyob.geofence.dto.response.SimpleVehicleDTO;
import ink.yowyob.geofence.model.User;
import ink.yowyob.geofence.service.RealTimeService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

@Slf4j
@Service
@RequiredArgsConstructor
public class RealTimeServiceImpl implements RealTimeService {
    
    private final SimpMessagingTemplate messagingTemplate;
    
    @Override
    public void broadcastLocationUpdate(LocationDTO location, SimpleVehicleDTO vehicle, User user) {
        try {
            Map<String, Object> message = new HashMap<>();
            message.put("type", "LOCATION_UPDATE");
            message.put("timestamp", LocalDateTime.now());
            message.put("location", location);
            message.put("vehicle", vehicle);
            
            // Envoyer à l'utilisateur propriétaire
            String destination = "/user/" + user.getUuid() + "/queue/location-updates";
            messagingTemplate.convertAndSend(destination, message);
            
            log.debug("Location update broadcasted for vehicle {} to user {}", 
                    vehicle.licensePlate(), user.getEmail());
        } catch (Exception e) {
            log.error("Error broadcasting location update: {}", e.getMessage());
        }
    }
    
    @Override
    public void broadcastAlert(AlertDTO alert, User user) {
        try {
            Map<String, Object> message = new HashMap<>();
            message.put("type", "ALERT");
            message.put("timestamp", LocalDateTime.now());
            message.put("alert", alert);
            
            // Envoyer à l'utilisateur propriétaire
            String destination = "/user/" + user.getUuid() + "/queue/alerts";
            messagingTemplate.convertAndSend(destination, message);
            
            // Envoyer aussi aux topics généraux pour le dashboard
            messagingTemplate.convertAndSend("/topic/alerts", message);
            
            log.info("Alert broadcasted: {} for user {}", alert.message(), user.getEmail());
        } catch (Exception e) {
            log.error("Error broadcasting alert: {}", e.getMessage());
        }
    }
    
    @Override
    public void broadcastVehicleStatusUpdate(SimpleVehicleDTO vehicle, String status, User user) {
        try {
            Map<String, Object> message = new HashMap<>();
            message.put("type", "VEHICLE_STATUS");
            message.put("timestamp", LocalDateTime.now());
            message.put("vehicle", vehicle);
            message.put("status", status);
            
            String destination = "/user/" + user.getUuid() + "/queue/vehicle-status";
            messagingTemplate.convertAndSend(destination, message);
            
            log.debug("Vehicle status update broadcasted: {} - {} for user {}", 
                    vehicle.licensePlate(), status, user.getEmail());
        } catch (Exception e) {
            log.error("Error broadcasting vehicle status update: {}", e.getMessage());
        }
    }
    
    @Override
    public void broadcastDashboardStats(Object stats, User user) {
        try {
            Map<String, Object> message = new HashMap<>();
            message.put("type", "DASHBOARD_STATS");
            message.put("timestamp", LocalDateTime.now());
            message.put("stats", stats);
            
            String destination = "/user/" + user.getUuid() + "/queue/dashboard-stats";
            messagingTemplate.convertAndSend(destination, message);
            
            log.debug("Dashboard stats broadcasted to user {}", user.getEmail());
        } catch (Exception e) {
            log.error("Error broadcasting dashboard stats: {}", e.getMessage());
        }
    }
}
```

*Lignes: 100*

---

### 📄 src\main\java\ink\yowyob\geofence\service\Implementation\RouteDeviationDetectionServiceImpl.java

```java
package ink.yowyob.geofence.service.Implementation;

import ink.yowyob.geofence.model.Route;
import ink.yowyob.geofence.model.Vehicle;
import ink.yowyob.geofence.repository.RouteRepository;
import ink.yowyob.geofence.repository.VehicleRepository;
import ink.yowyob.geofence.service.RouteDeviationDetectionService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.locationtech.jts.geom.Point;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.UUID;

@Slf4j
@Service
@AllArgsConstructor
public class RouteDeviationDetectionServiceImpl implements RouteDeviationDetectionService {
    
    private final RouteRepository routeRepository;
    private final VehicleRepository vehicleRepository;
    
    @Override
    public Flux<RouteDeviationAlert> monitorVehicleDeviations(UUID vehicleId) {
        log.info("Démarrage du monitoring des déviations pour le véhicule: {}", vehicleId);
        
        return Flux.interval(Duration.ofSeconds(30)) // Vérifier toutes les 30 secondes
            .flatMap(tick -> {
                // Dans un vrai système, on obtiendrait la position actuelle du GPS
                // Ici, on simule avec une position fictive pour la démonstration
                return getCurrentVehiclePosition(vehicleId)
                    .flatMap(position -> checkVehicleDeviation(vehicleId, position))
                    .onErrorResume(error -> {
                        log.warn("Erreur lors de la vérification de déviation pour le véhicule {}: {}", 
                                vehicleId, error.getMessage());
                        return Mono.empty();
                    });
            })
            .filter(alert -> alert != null);
    }
    
    @Override
    public Mono<RouteDeviationAlert> checkVehicleDeviation(UUID vehicleId, Point currentPosition) {
        return Mono.fromCallable(() -> {
            Vehicle vehicle = vehicleRepository.findById(vehicleId).orElse(null);
            if (vehicle == null) {
                return null;
            }
            
            // Obtenir toutes les routes actives assignées au véhicule
            return routeRepository.findActiveRoutesByVehicleId(vehicleId)
                .stream()
                .filter(route -> route.isActiveAt(LocalDateTime.now()))
                .filter(route -> !route.isPointWithinTolerance(currentPosition))
                .findFirst()
                .map(route -> {
                    double deviationDistance = calculateMinDistanceToRoute(route, currentPosition);
                    String severity = calculateSeveritySync(deviationDistance, route.getDeviationTolerance());
                    
                    return new RouteDeviationAlert(
                        vehicleId,
                        vehicle.getBrand() + " " + vehicle.getModel() + " (" + vehicle.getLicensePlate() + ")",
                        route.getId(),
                        route.getName(),
                        currentPosition,
                        deviationDistance,
                        route.getDeviationTolerance(),
                        LocalDateTime.now(),
                        severity,
                        generateDeviationMessage(vehicle, route, deviationDistance, severity)
                    );
                })
                .orElse(null);
        });
    }
    
    @Override
    public Flux<RouteTrackingStatus> getVehicleRouteTrackingStatus(UUID vehicleId) {
        return Mono.fromCallable(() -> routeRepository.findActiveRoutesByVehicleId(vehicleId))
            .flatMapMany(Flux::fromIterable)
            .flatMap(route -> 
                getCurrentVehiclePosition(vehicleId)
                    .map(currentPosition -> {
                        boolean isOnRoute = route.isPointWithinTolerance(currentPosition);
                        double progressPercentage = calculateRouteProgressSync(route, currentPosition);
                        double deviationDistance = isOnRoute ? 0.0 : calculateMinDistanceToRoute(route, currentPosition);
                        String currentSegment = findCurrentSegment(route, currentPosition);
                        
                        return new RouteTrackingStatus(
                            vehicleId,
                            route.getId(),
                            isOnRoute,
                            progressPercentage,
                            deviationDistance,
                            currentSegment,
                            LocalDateTime.now()
                        );
                    })
            );
    }
    
    @Override
    public Mono<String> calculateDeviationSeverity(Double deviationDistance, Double toleranceDistance) {
        return Mono.fromCallable(() -> calculateSeveritySync(deviationDistance, toleranceDistance));
    }
    
    private String calculateSeveritySync(Double deviationDistance, Double toleranceDistance) {
        if (deviationDistance <= toleranceDistance) {
            return "NONE";
        } else if (deviationDistance <= toleranceDistance * 2) {
            return "LOW";
        } else if (deviationDistance <= toleranceDistance * 5) {
            return "MEDIUM";
        } else if (deviationDistance <= toleranceDistance * 10) {
            return "HIGH";
        } else {
            return "CRITICAL";
        }
    }
    
    @Override
    public Flux<RouteDeviationAlert> detectAllVehicleDeviations() {
        return Flux.fromIterable(vehicleRepository.findAll())
            .flatMap(vehicle -> 
                getCurrentVehiclePosition(vehicle.getId())
                    .flatMap(position -> checkVehicleDeviation(vehicle.getId(), position))
                    .filter(alert -> alert != null)
            );
    }
    
    @Override
    public Flux<RouteDeviationAlert> getRecentDeviationAlerts(UUID userId, int limitHours) {
        // Dans un vrai système, on aurait une table d'alertes persistées
        // Ici, on retourne un flux vide pour la démonstration
        return Flux.empty();
    }
    
    @Override
    public Mono<Void> markAlertAsHandled(UUID alertId) {
        // Dans un vrai système, on marquerait l'alerte comme traitée en base
        return Mono.fromRunnable(() -> 
            log.info("Alerte {} marquée comme traitée", alertId));
    }
    
    @Override
    public Mono<Void> configureDeviationSettings(UUID vehicleId, Double customTolerance, Integer checkIntervalSeconds) {
        // Dans un vrai système, on sauvegarderait ces paramètres pour le véhicule
        return Mono.fromRunnable(() -> 
            log.info("Configuration de déviation mise à jour pour le véhicule {}: tolérance={}, interval={}", 
                    vehicleId, customTolerance, checkIntervalSeconds));
    }
    
    @Override
    public Mono<Boolean> predictPotentialDeviation(UUID vehicleId, Point currentPosition, Point nextExpectedPosition) {
        return Mono.fromCallable(() -> {
            // Algorithme simple de prédiction basé sur la trajectoire
            return routeRepository.findActiveRoutesByVehicleId(vehicleId)
                .stream()
                .anyMatch(route -> {
                    boolean currentlyOnRoute = route.isPointWithinTolerance(currentPosition);
                    boolean nextPositionOnRoute = route.isPointWithinTolerance(nextExpectedPosition);
                    
                    // Si actuellement sur la route mais la prochaine position ne l'est pas
                    return currentlyOnRoute && !nextPositionOnRoute;
                });
        });
    }
    
    /**
     * Simule l'obtention de la position actuelle d'un véhicule
     * Dans un vrai système, ceci viendrait d'un service GPS/tracking
     */
    private Mono<Point> getCurrentVehiclePosition(UUID vehicleId) {
        return Mono.fromCallable(() -> {
            // Position fictive pour la démonstration
            // Dans un vrai système, on obtiendrait ceci d'un service de tracking
            org.locationtech.jts.geom.GeometryFactory factory = 
                new org.locationtech.jts.geom.GeometryFactory(new org.locationtech.jts.geom.PrecisionModel(), 4326);
            return factory.createPoint(new org.locationtech.jts.geom.Coordinate(-74.006, 40.7128)); // NYC
        });
    }
    
    /**
     * Calcule la distance minimale d'un point à une route
     */
    private double calculateMinDistanceToRoute(Route route, Point position) {
        return route.getAuthorizedSegments().stream()
            .filter(segment -> segment.getIsActive() && segment.getPathLine() != null)
            .mapToDouble(segment -> segment.getPathLine().distance(position))
            .min()
            .orElse(Double.MAX_VALUE) * 111000.0; // Convertir en mètres
    }
    
    /**
     * Calcule le pourcentage de progression sur une route
     */
    private double calculateRouteProgressSync(Route route, Point position) {
        if (route.getStartPoint() == null || route.getEndPoint() == null) {
            return 0.0;
        }
        
        double totalDistance = route.getStartPoint().distance(route.getEndPoint());
        double currentDistance = route.getStartPoint().distance(position);
        
        if (totalDistance == 0) return 100.0;
        
        return Math.min(100.0, (currentDistance / totalDistance) * 100.0);
    }
    
    /**
     * Trouve le segment actuel sur lequel se trouve le véhicule
     */
    private String findCurrentSegment(Route route, Point position) {
        return route.getAuthorizedSegments().stream()
            .filter(segment -> segment.getIsActive())
            .filter(segment -> segment.isPointWithinTolerance(position, route.getDeviationTolerance()))
            .findFirst()
            .map(segment -> segment.getName() != null ? segment.getName() : "Segment " + segment.getSegmentOrder())
            .orElse("Hors route");
    }
    
    /**
     * Génère un message d'alerte de déviation
     */
    private String generateDeviationMessage(Vehicle vehicle, Route route, double deviationDistance, String severity) {
        String vehicleName = vehicle.getBrand() + " " + vehicle.getModel() + " (" + vehicle.getLicensePlate() + ")";
        
        return switch (severity) {
            case "LOW" -> String.format("Le véhicule %s s'écarte légèrement de la route '%s' (%.1fm)", 
                    vehicleName, route.getName(), deviationDistance);
            case "MEDIUM" -> String.format("Le véhicule %s dévie de la route '%s' (%.1fm)", 
                    vehicleName, route.getName(), deviationDistance);
            case "HIGH" -> String.format("ATTENTION: Le véhicule %s s'écarte significativement de la route '%s' (%.1fm)", 
                    vehicleName, route.getName(), deviationDistance);
            case "CRITICAL" -> String.format("ALERTE CRITIQUE: Le véhicule %s est très loin de la route '%s' (%.1fm)", 
                    vehicleName, route.getName(), deviationDistance);
            default -> String.format("Le véhicule %s suit la route '%s' correctement", 
                    vehicleName, route.getName());
        };
    }
}
```

*Lignes: 245*

---

### 📄 src\main\java\ink\yowyob\geofence\service\Implementation\RouteServiceImpl.java

```java
package ink.yowyob.geofence.service.Implementation;

import ink.yowyob.geofence.Enum.UserRole;
import ink.yowyob.geofence.dto.LineStringDTO;
import ink.yowyob.geofence.dto.PointDTO;
import ink.yowyob.geofence.dto.request.RouteDTORequest;
import ink.yowyob.geofence.dto.request.RouteSegmentDTORequest;
import ink.yowyob.geofence.dto.response.MultipleRoutesDTOResponse;
import ink.yowyob.geofence.dto.response.RouteDTOResponse;
import ink.yowyob.geofence.exception.BadCredentialsException;
import ink.yowyob.geofence.mapper.RouteDTOMapper;
import ink.yowyob.geofence.model.Route;
import ink.yowyob.geofence.model.RouteSegment;
import ink.yowyob.geofence.model.User;
import ink.yowyob.geofence.model.Vehicle;
import ink.yowyob.geofence.repository.RouteRepository;
import ink.yowyob.geofence.repository.RouteSegmentRepository;
import ink.yowyob.geofence.repository.VehicleRepository;
import ink.yowyob.geofence.service.RouteService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.locationtech.jts.geom.*;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.time.LocalTime;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.UUID;
import java.util.stream.Collectors;

@Slf4j
@Service
@AllArgsConstructor
public class RouteServiceImpl implements RouteService {
    
    private final RouteRepository routeRepository;
    private final RouteSegmentRepository routeSegmentRepository;
    private final VehicleRepository vehicleRepository;
    private final RouteDTOMapper routeDTOMapper;
    
    @Override
    @Transactional
    public Mono<RouteDTOResponse> createRoute(RouteDTORequest routeRequest, User user) {
        return Mono.fromCallable(() -> {
            Route route = new Route();
            route.setUser(user);
            route.setName(routeRequest.name());
            route.setDescription(routeRequest.description());
            route.setStartPoint(convertToPoint(routeRequest.startPoint()));
            route.setStartAddress(routeRequest.startAddress());
            route.setEndPoint(convertToPoint(routeRequest.endPoint()));
            route.setEndAddress(routeRequest.endAddress());
            route.setEstimatedDistance(routeRequest.estimatedDistance());
            route.setEstimatedDuration(routeRequest.estimatedDuration());
            route.setDeviationTolerance(routeRequest.deviationTolerance() != null ? routeRequest.deviationTolerance() : 100.0);
            
            // Propriétés temporelles
            route.setIsTemporalEnabled(routeRequest.isTemporalEnabled() != null ? routeRequest.isTemporalEnabled() : false);
            if (routeRequest.startTime() != null) {
                route.setStartTime(LocalTime.parse(routeRequest.startTime()));
            }
            if (routeRequest.endTime() != null) {
                route.setEndTime(LocalTime.parse(routeRequest.endTime()));
            }
            if (routeRequest.activeDays() != null) {
                Set<ink.yowyob.geofence.Enum.DayOfWeek> activeDays = java.util.Arrays.stream(routeRequest.activeDays())
                    .map(day -> ink.yowyob.geofence.Enum.DayOfWeek.parse(day))
                    .collect(Collectors.toSet());
                route.setActiveDays(activeDays);
            }
            
            route.setIsActive(routeRequest.isActive() != null ? routeRequest.isActive() : true);
            
            Route savedRoute = routeRepository.save(route);
            
            // Créer les segments de route
            if (routeRequest.authorizedSegments() != null && !routeRequest.authorizedSegments().isEmpty()) {
                for (RouteSegmentDTORequest segmentRequest : routeRequest.authorizedSegments()) {
                    RouteSegment segment = new RouteSegment();
                    segment.setRoute(savedRoute);
                    segment.setName(segmentRequest.name());
                    segment.setDescription(segmentRequest.description());
                    segment.setPathLine(convertToLineString(segmentRequest.pathLine()));
                    segment.setSegmentOrder(segmentRequest.segmentOrder());
                    segment.setSegmentType(segmentRequest.segmentType() != null ? segmentRequest.segmentType() : RouteSegment.RouteSegmentType.MAIN_ROUTE);
                    segment.setPriority(segmentRequest.priority() != null ? segmentRequest.priority() : 1);
                    segment.setSpeedLimit(segmentRequest.speedLimit());
                    segment.setEstimatedTime(segmentRequest.estimatedTime());
                    segment.setIsActive(segmentRequest.isActive() != null ? segmentRequest.isActive() : true);
                    
                    routeSegmentRepository.save(segment);
                }
            }
            
            // Recharger la route avec ses segments, user et role
            savedRoute = routeRepository.findByIdWithUserAndRole(savedRoute.getId()).orElseThrow();
            
            return routeDTOMapper.apply(savedRoute);
        });
    }
    
    @Override
    @Transactional(readOnly = true)
    public Mono<RouteDTOResponse> getRoute(UUID routeId) {
        return Mono.fromCallable(() -> {
            Route route = routeRepository.findByIdWithUserAndRole(routeId)
                .orElseThrow(() -> new IllegalStateException("Route with id " + routeId + " not found"));
            return routeDTOMapper.apply(route);
        });
    }
    
    @Override
    @Transactional
    public Mono<RouteDTOResponse> updateRoute(UUID routeId, RouteDTORequest routeRequest, User user) {
        return Mono.fromCallable(() -> {
            Route route = routeRepository.findByIdWithUserAndRole(routeId)
                .orElseThrow(() -> new IllegalStateException("Route with id " + routeId + " not found"));
                
            // Vérification des permissions
            if (!Objects.equals(route.getUser().getUuid(), user.getUuid()) && 
                !Objects.equals(user.getRole().getName(), UserRole.ADMIN)) {
                throw new BadCredentialsException("User " + user.getUsername() + " does not have permission to edit this route");
            }
            
            // Mise à jour des propriétés
            if (routeRequest.name() != null) {
                route.setName(routeRequest.name());
            }
            if (routeRequest.description() != null) {
                route.setDescription(routeRequest.description());
            }
            if (routeRequest.startPoint() != null) {
                route.setStartPoint(convertToPoint(routeRequest.startPoint()));
            }
            if (routeRequest.startAddress() != null) {
                route.setStartAddress(routeRequest.startAddress());
            }
            if (routeRequest.endPoint() != null) {
                route.setEndPoint(convertToPoint(routeRequest.endPoint()));
            }
            if (routeRequest.endAddress() != null) {
                route.setEndAddress(routeRequest.endAddress());
            }
            if (routeRequest.estimatedDistance() != null) {
                route.setEstimatedDistance(routeRequest.estimatedDistance());
            }
            if (routeRequest.estimatedDuration() != null) {
                route.setEstimatedDuration(routeRequest.estimatedDuration());
            }
            if (routeRequest.deviationTolerance() != null) {
                route.setDeviationTolerance(routeRequest.deviationTolerance());
            }
            
            // Mise à jour des propriétés temporelles
            if (routeRequest.isTemporalEnabled() != null) {
                route.setIsTemporalEnabled(routeRequest.isTemporalEnabled());
            }
            if (routeRequest.startTime() != null) {
                route.setStartTime(LocalTime.parse(routeRequest.startTime()));
            }
            if (routeRequest.endTime() != null) {
                route.setEndTime(LocalTime.parse(routeRequest.endTime()));
            }
            if (routeRequest.activeDays() != null) {
                Set<ink.yowyob.geofence.Enum.DayOfWeek> activeDays = java.util.Arrays.stream(routeRequest.activeDays())
                    .map(day -> ink.yowyob.geofence.Enum.DayOfWeek.parse(day))
                    .collect(Collectors.toSet());
                route.setActiveDays(activeDays);
            }
            
            if (routeRequest.isActive() != null) {
                route.setIsActive(routeRequest.isActive());
            }
            
            Route savedRoute = routeRepository.save(route);
            return routeDTOMapper.apply(savedRoute);
        });
    }
    
    @Override
    @Transactional
    public Mono<Void> deleteRoute(UUID routeId, User user) {
        return Mono.fromRunnable(() -> {
            Route route = routeRepository.findByIdWithUserAndRole(routeId)
                .orElseThrow(() -> new IllegalStateException("Route with id " + routeId + " not found"));
                
            // Vérification des permissions
            if (!Objects.equals(route.getUser().getUuid(), user.getUuid()) && 
                !Objects.equals(user.getRole().getName(), UserRole.ADMIN)) {
                throw new BadCredentialsException("User " + user.getUsername() + " does not have permission to delete this route");
            }
            
            routeRepository.deleteById(routeId);
        });
    }
    
    @Override
    @Transactional(readOnly = true)
    public Mono<MultipleRoutesDTOResponse> getUserRoutes(User user) {
        return Mono.fromCallable(() -> {
            List<RouteDTOResponse> routes = routeRepository.findByUser(user)
                .stream()
                .map(routeDTOMapper)
                .collect(Collectors.toList());
            return new MultipleRoutesDTOResponse(routes);
        });
    }
    
    @Override
    @Transactional(readOnly = true)
    public Mono<MultipleRoutesDTOResponse> getAllRoutes() {
        return Mono.fromCallable(() -> {
            List<RouteDTOResponse> routes = routeRepository.findAllWithUserAndRole()
                .stream()
                .map(routeDTOMapper)
                .collect(Collectors.toList());
            return new MultipleRoutesDTOResponse(routes);
        });
    }
    
    @Override
    @Transactional(readOnly = true)
    public Mono<MultipleRoutesDTOResponse> searchRoutes(String keyword, User user) {
        return Mono.fromCallable(() -> {
            List<RouteDTOResponse> routes = routeRepository.searchUserRoutes(user, keyword)
                .stream()
                .map(routeDTOMapper)
                .collect(Collectors.toList());
            return new MultipleRoutesDTOResponse(routes);
        });
    }
    
    @Override
    @Transactional(readOnly = true)
    public Flux<RouteDTOResponse> getActiveRoutesByVehicle(UUID vehicleId) {
        return Flux.fromIterable(
            routeRepository.findActiveRoutesByVehicleId(vehicleId)
                .stream()
                .map(routeDTOMapper)
                .collect(Collectors.toList())
        );
    }
    
    @Override
    @Transactional
    public Mono<RouteDTOResponse> assignVehicleToRoute(UUID routeId, UUID vehicleId, User user) {
        return Mono.fromCallable(() -> {
            Route route = routeRepository.findByIdWithUserAndRole(routeId)
                .orElseThrow(() -> new IllegalStateException("Route with id " + routeId + " not found"));
            Vehicle vehicle = vehicleRepository.findById(vehicleId)
                .orElseThrow(() -> new IllegalStateException("Vehicle with id " + vehicleId + " not found"));
                
            // Vérification des permissions
            if (!Objects.equals(route.getUser().getUuid(), user.getUuid()) && 
                !Objects.equals(user.getRole().getName(), UserRole.ADMIN)) {
                throw new BadCredentialsException("User " + user.getUsername() + " does not have permission to assign vehicles to this route");
            }
            
            route.getAssignedVehicles().add(vehicle);
            vehicle.getAssignedRoutes().add(route);
            
            Route savedRoute = routeRepository.save(route);
            vehicleRepository.save(vehicle);
            
            return routeDTOMapper.apply(savedRoute);
        });
    }
    
    @Override
    @Transactional
    public Mono<RouteDTOResponse> removeVehicleFromRoute(UUID routeId, UUID vehicleId, User user) {
        return Mono.fromCallable(() -> {
            Route route = routeRepository.findByIdWithUserAndRole(routeId)
                .orElseThrow(() -> new IllegalStateException("Route with id " + routeId + " not found"));
            Vehicle vehicle = vehicleRepository.findById(vehicleId)
                .orElseThrow(() -> new IllegalStateException("Vehicle with id " + vehicleId + " not found"));
                
            // Vérification des permissions
            if (!Objects.equals(route.getUser().getUuid(), user.getUuid()) && 
                !Objects.equals(user.getRole().getName(), UserRole.ADMIN)) {
                throw new BadCredentialsException("User " + user.getUsername() + " does not have permission to modify this route");
            }
            
            route.getAssignedVehicles().remove(vehicle);
            vehicle.getAssignedRoutes().remove(route);
            
            Route savedRoute = routeRepository.save(route);
            vehicleRepository.save(vehicle);
            
            return routeDTOMapper.apply(savedRoute);
        });
    }
    
    @Override
    public Mono<Boolean> isVehicleOnRoute(UUID vehicleId, Point currentPosition) {
        return Mono.fromCallable(() -> {
            List<Route> activeRoutes = routeRepository.findActiveRoutesByVehicleId(vehicleId);
            
            return activeRoutes.stream()
                .anyMatch(route -> route.isPointWithinTolerance(currentPosition));
        });
    }
    
    @Override
    public Mono<Double> calculateDeviationDistance(UUID routeId, Point currentPosition) {
        return Mono.fromCallable(() -> {
            Route route = routeRepository.findByIdWithUserAndRole(routeId)
                .orElseThrow(() -> new IllegalStateException("Route with id " + routeId + " not found"));
                
            double minDistance = Double.MAX_VALUE;
            
            for (RouteSegment segment : route.getAuthorizedSegments()) {
                if (segment.getIsActive() && segment.getPathLine() != null) {
                    double distance = segment.getPathLine().distance(currentPosition);
                    minDistance = Math.min(minDistance, distance);
                }
            }
            
            // Convertir en mètres (approximation)
            return minDistance == Double.MAX_VALUE ? Double.MAX_VALUE : minDistance * 111000.0;
        });
    }
    
    @Override
    public Flux<UUID> detectRouteDeviations(UUID vehicleId, Point currentPosition, Double toleranceMeters) {
        return Flux.fromIterable(
            routeRepository.findActiveRoutesByVehicleId(vehicleId)
                .stream()
                .filter(route -> !route.isPointWithinTolerance(currentPosition))
                .map(Route::getId)
                .collect(Collectors.toList())
        );
    }
    
    @Override
    public Mono<Double> calculateRouteProgress(UUID routeId, Point currentPosition) {
        return Mono.fromCallable(() -> {
            Route route = routeRepository.findByIdWithUserAndRole(routeId)
                .orElseThrow(() -> new IllegalStateException("Route with id " + routeId + " not found"));
                
            // Logique simplifiée : calculer la progression basée sur la distance du point de départ
            if (route.getStartPoint() == null || route.getEndPoint() == null) {
                return 0.0;
            }
            
            double totalDistance = route.getStartPoint().distance(route.getEndPoint());
            double currentDistance = route.getStartPoint().distance(currentPosition);
            
            if (totalDistance == 0) return 100.0;
            
            return Math.min(100.0, (currentDistance / totalDistance) * 100.0);
        });
    }
    
    @Override
    public Mono<List<RouteDTOResponse>> suggestAlternativeRoutes(Point startPoint, Point endPoint, User user) {
        // Implémentation simplifiée - dans un vrai système, on utiliserait un service de routing
        return Mono.fromCallable(() -> {
            return List.of(); // Pour l'instant, retourner une liste vide
        });
    }
    
    @Override
    public Mono<RouteDTOResponse> optimizeRouteSegments(UUID routeId, User user) {
        // Implémentation simplifiée - optimisation des segments de route
        return getRoute(routeId);
    }
    
    @Override
    public Point convertToPoint(PointDTO dto) {
        if (dto == null || dto.coordinates() == null || dto.coordinates().size() != 2) {
            return null;
        }
        
        GeometryFactory factory = new GeometryFactory(new PrecisionModel(), 4326);
        double longitude = dto.coordinates().get(0);
        double latitude = dto.coordinates().get(1);
        
        return factory.createPoint(new Coordinate(longitude, latitude));
    }
    
    @Override
    public LineString convertToLineString(LineStringDTO dto) {
        if (dto == null || dto.coordinates() == null || dto.coordinates().isEmpty()) {
            return null;
        }
        
        GeometryFactory factory = new GeometryFactory(new PrecisionModel(), 4326);
        
        List<Coordinate> coordinates = dto.coordinates().stream()
            .map(coord -> new Coordinate(coord.get(0), coord.get(1)))
            .collect(Collectors.toList());
            
        return factory.createLineString(coordinates.toArray(new Coordinate[0]));
    }
}
```

*Lignes: 400*

---

### 📄 src\main\java\ink\yowyob\geofence\service\Implementation\StatisticsServiceImpl.java

```java
package ink.yowyob.geofence.service.Implementation;

import ink.yowyob.geofence.Enum.AlertTypeEnum;
import ink.yowyob.geofence.Enum.UserRole;
import ink.yowyob.geofence.dto.response.AlertCountDTO;
import ink.yowyob.geofence.dto.response.SystemStatisticsDTO;
import ink.yowyob.geofence.dto.response.UserStatisticsDTO;
import ink.yowyob.geofence.dto.response.VehicleStatisticsDTO;
import ink.yowyob.geofence.exception.BadCredentialsException;
import ink.yowyob.geofence.model.Alert;
import ink.yowyob.geofence.model.User;
import ink.yowyob.geofence.model.Vehicle;
import ink.yowyob.geofence.repository.AlertRepository;
import ink.yowyob.geofence.repository.CircleGeofenceZoneRepository;
import ink.yowyob.geofence.repository.PolygonGeofenceZoneRepository;
import ink.yowyob.geofence.repository.UserRepository;
import ink.yowyob.geofence.repository.VehicleRepository;
import ink.yowyob.geofence.service.StatisticsService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
import java.util.stream.Collectors;

@Slf4j
@Service
@AllArgsConstructor
public class StatisticsServiceImpl implements StatisticsService {
    private final UserRepository userRepository;
    private final VehicleRepository vehicleRepository;
    private final AlertRepository alertRepository;
    private final CircleGeofenceZoneRepository circleGeofenceZoneRepository;
    private final PolygonGeofenceZoneRepository polygonGeofenceZoneRepository;

    @Override
    public SystemStatisticsDTO getSystemStatistics(User user) {
        // Check if current user is admin or manager

        boolean isAuthorized = user.getRole().getName() == UserRole.ADMIN ||
                user.getRole().getName() == UserRole.MANAGER;

        if (!isAuthorized) {
            throw new BadCredentialsException("User is not authorized to view system statistics");
        }

        // Calculate statistics
        long totalUsers = userRepository.count();
        long totalVehicles = vehicleRepository.count();
        long totalCircleGeofences = circleGeofenceZoneRepository.count();
        long totalPolygonGeofences = polygonGeofenceZoneRepository.count();
        long totalAlerts = alertRepository.count();

        // Get alerts by type
        List<Alert> allAlerts = alertRepository.findAll();
        Map<AlertTypeEnum, Long> alertsByType = new HashMap<>();

        for (Alert alert : allAlerts) {
            AlertTypeEnum type = alert.getType().getType();
            alertsByType.put(type, alertsByType.getOrDefault(type, 0L) + 1);
        }

        List<AlertCountDTO> alertCounts = alertsByType.entrySet().stream()
                .map(entry -> new AlertCountDTO(entry.getKey(), entry.getValue()))
                .collect(Collectors.toList());

        // Calculate alerts over time (last 30 days)
        LocalDateTime now = LocalDateTime.now();
        LocalDateTime thirtyDaysAgo = now.minus(30, ChronoUnit.DAYS);

        Map<String, Long> alertsPerDay = new HashMap<>();
        for (Alert alert : allAlerts) {
            if (alert.getTimestamp().isAfter(thirtyDaysAgo)) {
                String date = alert.getTimestamp().toLocalDate().toString();
                alertsPerDay.put(date, alertsPerDay.getOrDefault(date, 0L) + 1);
            }
        }

        return new SystemStatisticsDTO(
                totalUsers,
                totalVehicles,
                totalCircleGeofences + totalPolygonGeofences,
                totalAlerts,
                alertCounts,
                alertsPerDay
        );
    }

    @Override
    public UserStatisticsDTO getUserStatistics(User user) {

        // Get all vehicles belonging to the user
        List<Vehicle> userVehicles = vehicleRepository.findByUser(user);

        // Calculate statistics
        int totalVehicles = userVehicles.size();

        int totalCircleGeofences = circleGeofenceZoneRepository.findByUser(user).size();
        int totalPolygonGeofences = polygonGeofenceZoneRepository.findByUser(user).size();
        int totalGeofences = totalCircleGeofences + totalPolygonGeofences;

        // Get all alerts for user's vehicles
        List<Alert> userAlerts = alertRepository.findByVehicleInOrderByTimestampDesc(userVehicles);
        int totalAlerts = userAlerts.size();

        // Count alerts by type
        Map<AlertTypeEnum, Long> alertsByType = new HashMap<>();
        for (Alert alert : userAlerts) {
            AlertTypeEnum type = alert.getType().getType();
            alertsByType.put(type, alertsByType.getOrDefault(type, 0L) + 1);
        }

        List<AlertCountDTO> alertCounts = alertsByType.entrySet().stream()
                .map(entry -> new AlertCountDTO(entry.getKey(), entry.getValue()))
                .collect(Collectors.toList());

        // Calculate alerts over time (last 30 days)
        LocalDateTime now = LocalDateTime.now();
        LocalDateTime thirtyDaysAgo = now.minus(30, ChronoUnit.DAYS);

        Map<String, Long> alertsPerDay = new HashMap<>();
        for (Alert alert : userAlerts) {
            if (alert.getTimestamp().isAfter(thirtyDaysAgo)) {
                String date = alert.getTimestamp().toLocalDate().toString();
                alertsPerDay.put(date, alertsPerDay.getOrDefault(date, 0L) + 1);
            }
        }

        // Count alerts by vehicle
        Map<UUID, Long> alertsByVehicle = new HashMap<>();
        for (Alert alert : userAlerts) {
            UUID vehicleId = alert.getVehicle().getId();
            alertsByVehicle.put(vehicleId, alertsByVehicle.getOrDefault(vehicleId, 0L) + 1);
        }

        // Get the most active vehicle
        UUID mostActiveVehicleId = null;
        long maxAlerts = 0;
        for (Map.Entry<UUID, Long> entry : alertsByVehicle.entrySet()) {
            if (entry.getValue() > maxAlerts) {
                maxAlerts = entry.getValue();
                mostActiveVehicleId = entry.getKey();
            }
        }

        // Find the most common alert type
        AlertTypeEnum mostCommonAlertType = null;
        long maxAlertTypeCount = 0;
        for (Map.Entry<AlertTypeEnum, Long> entry : alertsByType.entrySet()) {
            if (entry.getValue() > maxAlertTypeCount) {
                maxAlertTypeCount = entry.getValue();
                mostCommonAlertType = entry.getKey();
            }
        }

        return new UserStatisticsDTO(
                totalVehicles,
                totalGeofences,
                totalAlerts,
                alertCounts,
                alertsPerDay,
                mostActiveVehicleId,
                mostCommonAlertType
        );
    }

    @Override
    public VehicleStatisticsDTO getVehicleStatistics(UUID vehicleId, User user) {

        // Get the vehicle
        Vehicle vehicle = vehicleRepository.findById(vehicleId)
                .orElseThrow(() -> new IllegalStateException("Vehicle with id " + vehicleId + " does not exist"));

        // Check if the user is authorized to access this vehicle's statistics
        boolean isAuthorized = Objects.equals(vehicle.getUser().getUuid(), user.getUuid()) ||
                user.getRole().getName() == UserRole.ADMIN ||
                user.getRole().getName() == UserRole.MANAGER;

        if (!isAuthorized) {
            throw new BadCredentialsException("User is not authorized to view this vehicle's statistics");
        }

        // Get all alerts for this vehicle
        List<Alert> vehicleAlerts = alertRepository.findByVehicle(vehicle);
        int totalAlerts = vehicleAlerts.size();

        // Count alerts by type
        Map<AlertTypeEnum, Long> alertsByType = new HashMap<>();
        for (Alert alert : vehicleAlerts) {
            AlertTypeEnum type = alert.getType().getType();
            alertsByType.put(type, alertsByType.getOrDefault(type, 0L) + 1);
        }

        List<AlertCountDTO> alertCounts = alertsByType.entrySet().stream()
                .map(entry -> new AlertCountDTO(entry.getKey(), entry.getValue()))
                .collect(Collectors.toList());

        // Calculate alerts over time (last 30 days)
        LocalDateTime now = LocalDateTime.now();
        LocalDateTime thirtyDaysAgo = now.minus(30, ChronoUnit.DAYS);

        Map<String, Long> alertsPerDay = new HashMap<>();
        for (Alert alert : vehicleAlerts) {
            if (alert.getTimestamp().isAfter(thirtyDaysAgo)) {
                String date = alert.getTimestamp().toLocalDate().toString();
                alertsPerDay.put(date, alertsPerDay.getOrDefault(date, 0L) + 1);
            }
        }

        // Find the most common alert type
        AlertTypeEnum mostCommonAlertType = null;
        long maxAlertTypeCount = 0;
        for (Map.Entry<AlertTypeEnum, Long> entry : alertsByType.entrySet()) {
            if (entry.getValue() > maxAlertTypeCount) {
                maxAlertTypeCount = entry.getValue();
                mostCommonAlertType = entry.getKey();
            }
        }

        // Get the number of geofence zones associated with this vehicle
        int associatedGeofenceZones = vehicle.getGeofenceZones().size();

        return new VehicleStatisticsDTO(
                vehicle.getId(),
                vehicle.getBrand(),
                vehicle.getModel(),
                vehicle.getLicensePlate(),
                totalAlerts,
                associatedGeofenceZones,
                alertCounts,
                alertsPerDay,
                mostCommonAlertType
        );
    }
}
```

*Lignes: 241*

---

### 📄 src\main\java\ink\yowyob\geofence\service\Implementation\UserManagementServiceImpl.java

```java
package ink.yowyob.geofence.service.Implementation;

import ink.yowyob.geofence.Enum.UserRole;
import ink.yowyob.geofence.dto.request.UpdateUserRoleRequest;
import ink.yowyob.geofence.dto.response.UserDTO;
import ink.yowyob.geofence.dto.response.UserListResponse;
import ink.yowyob.geofence.exception.BadCredentialsException;
import ink.yowyob.geofence.mapper.UserDTOMapper;
import ink.yowyob.geofence.model.Role;
import ink.yowyob.geofence.model.User;
import ink.yowyob.geofence.repository.RoleRepository;
import ink.yowyob.geofence.repository.UserRepository;
import ink.yowyob.geofence.service.UserManagementService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.UUID;
import java.util.stream.Collectors;

@Slf4j
@Service
@AllArgsConstructor
public class UserManagementServiceImpl implements UserManagementService {
    private final UserRepository userRepository;
    private final RoleRepository roleRepository;
    private final UserDTOMapper userDTOMapper;

    @Override
    public UserListResponse getAllUsers(Integer page, Integer size, User currentUser) {
        // Check if current user is admin

        if (!Objects.equals(currentUser.getRole().getName(), UserRole.ADMIN)) {
            throw new BadCredentialsException("Only admin users can view all users");
        }

        List<User> users = userRepository.findAll();
        List<UserDTO> userDTOs = users.stream()
                .map(userDTOMapper)
                .collect(Collectors.toList());

        return new UserListResponse(userDTOs, userDTOs.size());
    }

    @Override
    public UserListResponse getUsersForSharing(User currentUser) {
        // Cette méthode est accessible à tous les utilisateurs authentifiés;

        // Récupérer tous les utilisateurs sauf l'utilisateur actuel
        List<User> users = userRepository.findAll().stream()
                .filter(user -> !Objects.equals(user.getUuid(), currentUser.getUuid()))
                .collect(Collectors.toList());

        List<UserDTO> userDTOs = users.stream()
                .map(userDTOMapper)
                .collect(Collectors.toList());

        return new UserListResponse(userDTOs, userDTOs.size());
    }

    @Override
    public UserDTO getUserById(UUID id, User admin) {
        // Check if current user is admin

        if (!Objects.equals(admin.getRole().getName(), UserRole.ADMIN)) {
            throw new BadCredentialsException("Only admin users can view user details");
        }

        User user = userRepository.findById(id)
                .orElseThrow(() -> new UsernameNotFoundException("User with id " + id + " not found"));

        return userDTOMapper.apply(user);
    }

    @Override
    public UserDTO updateUserRole(UUID id, UpdateUserRoleRequest request, User admin) {
        // Check if current user is admin

        if (!Objects.equals(admin.getRole().getName(), UserRole.ADMIN)) {
            throw new BadCredentialsException("Only admin users can update user roles");
        }

        User user = userRepository.findById(id)
                .orElseThrow(() -> new UsernameNotFoundException("User with id " + id + " not found"));

        // Get the role from the repository
        Role role = roleRepository.findByName(request.role())
                .orElseThrow(() -> new IllegalArgumentException("Invalid role: " + request.role()));

        // Update the user's role
        user.setRole(role);
        User updatedUser = userRepository.save(user);

        return userDTOMapper.apply(updatedUser);
    }

    @Override
    public void deleteUser(UUID id, User admin) {

        if (!Objects.equals(admin.getRole().getName(), UserRole.ADMIN)) {
            throw new BadCredentialsException("Only admin users can delete users");
        }

        // Check if the user exists
        User user = userRepository.findById(id)
                .orElseThrow(() -> new UsernameNotFoundException("User with id " + id + " not found"));

        // Delete the user
        userRepository.delete(user);
    }
}
```

*Lignes: 114*

---

### 📄 src\main\java\ink\yowyob\geofence\service\Implementation\UserServiceImpl.java

```java
package ink.yowyob.geofence.service.Implementation;

import ink.yowyob.geofence.model.User;
import ink.yowyob.geofence.repository.UserRepository;
import ink.yowyob.geofence.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;


@AllArgsConstructor
@Service
public class UserServiceImpl implements UserDetailsService, UserService {
    private UserRepository userRepository;


    @Override
    public User loadUserByUsername(String username) throws UsernameNotFoundException {
        return this.userRepository
                .findByUsername(username)
                .orElseThrow(() -> new  UsernameNotFoundException("Aucun utilisateur ne corespond à cet identifiant"));
    }

}

```

*Lignes: 26*

---

### 📄 src\main\java\ink\yowyob\geofence\service\Implementation\VehicleServiceImpl.java

```java
package ink.yowyob.geofence.service.Implementation;

import ink.yowyob.geofence.Enum.UserRole;
import ink.yowyob.geofence.dto.request.VehicleDTORequest;
import ink.yowyob.geofence.dto.response.MultipleVehicleDTOResponse;
import ink.yowyob.geofence.dto.response.VehicleDTOResponse;
import ink.yowyob.geofence.exception.BadCredentialsException;
import ink.yowyob.geofence.mapper.VehicleDTOMapper;
import ink.yowyob.geofence.model.GeofenceZone;
import ink.yowyob.geofence.model.User;
import ink.yowyob.geofence.model.Vehicle;
import ink.yowyob.geofence.repository.CircleGeofenceZoneRepository;
import ink.yowyob.geofence.repository.PolygonGeofenceZoneRepository;
import ink.yowyob.geofence.repository.UserRepository;
import ink.yowyob.geofence.repository.VehicleRepository;
import ink.yowyob.geofence.service.VehicleService;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.UUID;
import java.util.stream.Collectors;

@Slf4j
@Service
@AllArgsConstructor
public class VehicleServiceImpl implements VehicleService {
    private final VehicleRepository vehicleRepository;
    private final UserRepository userRepository;
    private final CircleGeofenceZoneRepository circleGeofenceZoneRepository;
    private final PolygonGeofenceZoneRepository polygonGeofenceZoneRepository;
    private final VehicleDTOMapper vehicleDTOMapper;

    @Transactional
    @Override
    public VehicleDTOResponse getVehicle(UUID id, User currentUser) {

        Vehicle vehicle = vehicleRepository.findById(id)
                .orElseThrow(() -> new IllegalStateException("Vehicle with id " + id + " does not exist"));

        // Vérifier que l'utilisateur a le droit de voir ce véhicule
        boolean isAdmin = Objects.equals(currentUser.getRole().getName(), UserRole.ADMIN) ||
                Objects.equals(currentUser.getRole().getName(), UserRole.MANAGER);

        if (!isAdmin && !Objects.equals(vehicle.getUser().getUuid(), currentUser.getUuid())) {
            throw new BadCredentialsException("The user " + currentUser.getUsername() + " does not have permission to view this vehicle");
        }

        return vehicleDTOMapper.apply(vehicle);
    }

    @Transactional
    @Override
    public MultipleVehicleDTOResponse getVehicles(User currentUser) {
        // Seul un admin peut voir tous les véhicules

        boolean isAdmin = Objects.equals(currentUser.getRole().getName(), UserRole.ADMIN) ||
                Objects.equals(currentUser.getRole().getName(), UserRole.MANAGER);

        if (!isAdmin) {
            throw new BadCredentialsException("Only admins can view all vehicles");
        }

        List<VehicleDTOResponse> vehicles = vehicleRepository.findAll()
                .stream()
                .map(vehicleDTOMapper)
                .collect(Collectors.toList());

        return new MultipleVehicleDTOResponse(vehicles);
    }

    @Transactional
    @Override
    public VehicleDTOResponse createVehicle(VehicleDTORequest vehicleDTORequest, User currentUser) {

        Vehicle vehicle = new Vehicle();
        vehicle.setUser(currentUser);
        vehicle.setBrand(vehicleDTORequest.brand());
        vehicle.setModel(vehicleDTORequest.model());
        vehicle.setLicensePlate(vehicleDTORequest.licensePlate());
        vehicle.setDescription(vehicleDTORequest.description());

        // Ajouter des zones de geofence si spécifiées
        if (vehicleDTORequest.geofenceZoneIds() != null && !vehicleDTORequest.geofenceZoneIds().isEmpty()) {
            Set<GeofenceZone> geofenceZones = new HashSet<>();

            for (UUID zoneId : vehicleDTORequest.geofenceZoneIds()) {
                // Essayer de trouver la zone en tant que CircleGeofenceZone
                circleGeofenceZoneRepository.findById(zoneId).ifPresent(geofenceZones::add);

                // Essayer de trouver la zone en tant que PolygonGeofenceZone
                polygonGeofenceZoneRepository.findById(zoneId).ifPresent(geofenceZones::add);
            }

            vehicle.setGeofenceZones(geofenceZones);
        }

        return vehicleDTOMapper.apply(vehicleRepository.save(vehicle));
    }

    @Transactional
    @Override
    public MultipleVehicleDTOResponse getMyVehicles(User currentUser) {

        List<VehicleDTOResponse> vehicles = vehicleRepository.findByUser(currentUser)
                .stream()
                .map(vehicleDTOMapper)
                .collect(Collectors.toList());

        return new MultipleVehicleDTOResponse(vehicles);
    }

    @Transactional
    @Override
    public VehicleDTOResponse editVehicle(VehicleDTORequest vehicleDTORequest, UUID id, User currentUser) {

        Vehicle vehicle = vehicleRepository.findById(id)
                .orElseThrow(() -> new IllegalStateException("Vehicle with id " + id + " does not exist"));

        // Vérifier que l'utilisateur a le droit de modifier ce véhicule
        boolean isAdmin = Objects.equals(currentUser.getRole().getName(), UserRole.ADMIN) ||
                Objects.equals(currentUser.getRole().getName(), UserRole.MANAGER);

        if (!isAdmin && !Objects.equals(vehicle.getUser().getUuid(), currentUser.getUuid())) {
            throw new BadCredentialsException("The user " + currentUser.getUsername() + " does not have permission to edit this vehicle");
        }

        // Mettre à jour les champs
        if (vehicleDTORequest.brand() != null) {
            vehicle.setBrand(vehicleDTORequest.brand());
        }

        if (vehicleDTORequest.model() != null) {
            vehicle.setModel(vehicleDTORequest.model());
        }

        if (vehicleDTORequest.licensePlate() != null) {
            vehicle.setLicensePlate(vehicleDTORequest.licensePlate());
        }

        if (vehicleDTORequest.description() != null) {
            vehicle.setDescription(vehicleDTORequest.description());
        }

        // Mettre à jour les zones de geofence si spécifiées
        if (vehicleDTORequest.geofenceZoneIds() != null) {
            Set<GeofenceZone> geofenceZones = new HashSet<>();

            for (UUID zoneId : vehicleDTORequest.geofenceZoneIds()) {
                // Essayer de trouver la zone en tant que CircleGeofenceZone
                circleGeofenceZoneRepository.findById(zoneId).ifPresent(geofenceZones::add);

                // Essayer de trouver la zone en tant que PolygonGeofenceZone
                polygonGeofenceZoneRepository.findById(zoneId).ifPresent(geofenceZones::add);
            }

            vehicle.setGeofenceZones(geofenceZones);
        }

        return vehicleDTOMapper.apply(vehicleRepository.save(vehicle));
    }

    @Transactional
    @Override
    public void deleteVehicle(UUID id, User currentUser) {

        Vehicle vehicle = vehicleRepository.findById(id)
                .orElseThrow(() -> new IllegalStateException("Vehicle with id " + id + " does not exist"));

        // Vérifier que l'utilisateur a le droit de supprimer ce véhicule
        boolean isAdmin = Objects.equals(currentUser.getRole().getName(), UserRole.ADMIN) ||
                Objects.equals(currentUser.getRole().getName(), UserRole.MANAGER);

        if (!isAdmin && !Objects.equals(vehicle.getUser().getUuid(), currentUser.getUuid())) {
            throw new BadCredentialsException("The user " + currentUser.getUsername() + " does not have permission to delete this vehicle");
        }

        vehicleRepository.deleteById(id);
    }

    @Transactional
    @Override
    public VehicleDTOResponse updateVehicleImage(UUID id, String imageUrl, User currentUser) {

        Vehicle vehicle = vehicleRepository.findById(id)
                .orElseThrow(() -> new IllegalStateException("Vehicle with id " + id + " does not exist"));

        // Vérifier que l'utilisateur a le droit de modifier ce véhicule
        boolean isAdmin = Objects.equals(currentUser.getRole().getName(), UserRole.ADMIN) ||
                Objects.equals(currentUser.getRole().getName(), UserRole.MANAGER);

        if (!isAdmin && !Objects.equals(vehicle.getUser().getUuid(), currentUser.getUuid())) {
            throw new BadCredentialsException("The user " + currentUser.getUsername() + " does not have permission to edit this vehicle");
        }

        // Mettre à jour l'URL de l'image
        vehicle.setImageUrl(imageUrl);

        return vehicleDTOMapper.apply(vehicleRepository.save(vehicle));
    }

    @Transactional
    @Override
    public VehicleDTOResponse assignToGeofenceZone(UUID vehicleId, UUID zoneId, String type, User currentUser) {

        Vehicle vehicle = vehicleRepository.findById(vehicleId)
                .orElseThrow(() -> new IllegalStateException("Vehicle with id " + vehicleId + " does not exist"));

        // Vérifier que l'utilisateur a le droit de modifier ce véhicule
        boolean isAdmin = Objects.equals(currentUser.getRole().getName(), UserRole.ADMIN) ||
                Objects.equals(currentUser.getRole().getName(), UserRole.MANAGER);

        if (!isAdmin && !Objects.equals(vehicle.getUser().getUuid(), currentUser.getUuid())) {
            throw new BadCredentialsException("The user " + currentUser.getUsername() + " does not have permission to modify this vehicle");
        }

        GeofenceZone zone = null;

        // Trouver la zone de geofence en fonction du type
        if (Objects.equals(type, "c")) {
            zone = circleGeofenceZoneRepository.findById(zoneId)
                    .orElseThrow(() -> new IllegalStateException("Circle geofence zone with id " + zoneId + " does not exist"));
        } else if (Objects.equals(type, "p")) {
            zone = polygonGeofenceZoneRepository.findById(zoneId)
                    .orElseThrow(() -> new IllegalStateException("Polygon geofence zone with id " + zoneId + " does not exist"));
        } else {
            throw new IllegalArgumentException("Invalid geofence zone type: " + type);
        }

        // Ajouter la zone au véhicule
        vehicle.getGeofenceZones().add(zone);

        return vehicleDTOMapper.apply(vehicleRepository.save(vehicle));
    }

    @Transactional
    @Override
    public VehicleDTOResponse removeFromGeofenceZone(UUID vehicleId, UUID zoneId, User currentUser) {

        Vehicle vehicle = vehicleRepository.findById(vehicleId)
                .orElseThrow(() -> new IllegalStateException("Vehicle with id " + vehicleId + " does not exist"));

        // Vérifier que l'utilisateur a le droit de modifier ce véhicule
        boolean isAdmin = Objects.equals(currentUser.getRole().getName(), UserRole.ADMIN) ||
                Objects.equals(currentUser.getRole().getName(), UserRole.MANAGER);

        if (!isAdmin && !Objects.equals(vehicle.getUser().getUuid(), currentUser.getUuid())) {
            throw new BadCredentialsException("The user " + currentUser.getUsername() + " does not have permission to modify this vehicle");
        }

        // Trouver la zone et la supprimer du véhicule
        vehicle.setGeofenceZones(vehicle.getGeofenceZones().stream()
                .filter(zone -> !Objects.equals(zone.getId(), zoneId))
                .collect(Collectors.toSet()));

        return vehicleDTOMapper.apply(vehicleRepository.save(vehicle));
    }
}
```

*Lignes: 263*

---

### 📄 src\main\java\ink\yowyob\geofence\service\LocationService.java

```java
package ink.yowyob.geofence.service;

import ink.yowyob.geofence.dto.request.CreateApiKeyRequest;
import ink.yowyob.geofence.dto.request.LocationUpdateRequest;
import ink.yowyob.geofence.dto.response.*;
import ink.yowyob.geofence.model.User;

import java.util.UUID;

public interface LocationService {

    /**
     * Met à jour la position d'un véhicule depuis un appareil mobile (non protégé)
     */
    LocationUpdateResponse updateLocationFromDevice(String apiKey, LocationUpdateRequest request);

    /**
     * Récupère l'historique des positions d'un véhicule
     */
    LocationListResponse getLocationHistory(UUID vehicleId, int page, int size, User user);

    /**
     * Récupère la dernière position d'un véhicule
     */
    LocationDTO getLatestLocation(UUID vehicleId, User user);

    /**
     * Supprime une position
     */
    void deleteLocation(UUID locationId, User user);

    /**
     * Génère une nouvelle clé API pour un véhicule
     */
    VehicleApiKeyDTO generateApiKey(CreateApiKeyRequest request, User user);

    /**
     * Récupère la clé API d'un véhicule
     */
    VehicleApiKeyDTO getApiKeyForVehicle(UUID vehicleId, User user);

    /**
     * Révoque/désactive la clé API d'un véhicule
     */
    void revokeApiKey(UUID vehicleId, User user);

    /**
     * Récupère toutes les clés API de l'utilisateur connecté
     */
    ApiKeyListResponse getMyApiKeys(User user);
}
```

*Lignes: 51*

---

### 📄 src\main\java\ink\yowyob\geofence\service\RealTimeService.java

```java
package ink.yowyob.geofence.service;

import ink.yowyob.geofence.dto.response.AlertDTO;
import ink.yowyob.geofence.dto.response.LocationDTO;
import ink.yowyob.geofence.dto.response.SimpleVehicleDTO;
import ink.yowyob.geofence.model.User;

public interface RealTimeService {
    
    /**
     * Diffuser une nouvelle position de véhicule en temps réel
     */
    void broadcastLocationUpdate(LocationDTO location, SimpleVehicleDTO vehicle, User user);
    
    /**
     * Diffuser une nouvelle alerte en temps réel
     */
    void broadcastAlert(AlertDTO alert, User user);
    
    /**
     * Diffuser une mise à jour de statut de véhicule
     */
    void broadcastVehicleStatusUpdate(SimpleVehicleDTO vehicle, String status, User user);
    
    /**
     * Envoyer des statistiques du dashboard en temps réel
     */
    void broadcastDashboardStats(Object stats, User user);
}
```

*Lignes: 29*

---

### 📄 src\main\java\ink\yowyob\geofence\service\RouteDeviationDetectionService.java

```java
package ink.yowyob.geofence.service;

import ink.yowyob.geofence.dto.response.RouteDTOResponse;
import ink.yowyob.geofence.model.Route;
import ink.yowyob.geofence.model.Vehicle;
import org.locationtech.jts.geom.Point;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.time.LocalDateTime;
import java.util.UUID;

public interface RouteDeviationDetectionService {
    
    /**
     * DTO pour les alertes de déviation
     */
    record RouteDeviationAlert(
        UUID vehicleId,
        String vehicleName,
        UUID routeId,
        String routeName,
        Point currentPosition,
        Double deviationDistance,
        Double toleranceDistance,
        LocalDateTime detectedAt,
        String severity,
        String message
    ) {}
    
    /**
     * DTO pour le statut de suivi de route
     */
    record RouteTrackingStatus(
        UUID vehicleId,
        UUID routeId,
        boolean isOnRoute,
        Double progressPercentage,
        Double deviationDistance,
        String currentSegment,
        LocalDateTime lastUpdateAt
    ) {}
    
    /**
     * Surveiller en continu les déviations d'un véhicule
     */
    Flux<RouteDeviationAlert> monitorVehicleDeviations(UUID vehicleId);
    
    /**
     * Vérifier si un véhicule dévie de ses routes assignées
     */
    Mono<RouteDeviationAlert> checkVehicleDeviation(UUID vehicleId, Point currentPosition);
    
    /**
     * Obtenir le statut de suivi de toutes les routes d'un véhicule
     */
    Flux<RouteTrackingStatus> getVehicleRouteTrackingStatus(UUID vehicleId);
    
    /**
     * Calculer la sévérité d'une déviation
     */
    Mono<String> calculateDeviationSeverity(Double deviationDistance, Double toleranceDistance);
    
    /**
     * Détecter les véhicules qui dévient de leurs routes
     */
    Flux<RouteDeviationAlert> detectAllVehicleDeviations();
    
    /**
     * Obtenir les alertes de déviation récentes pour un utilisateur
     */
    Flux<RouteDeviationAlert> getRecentDeviationAlerts(UUID userId, int limitHours);
    
    /**
     * Marquer une alerte comme traitée
     */
    Mono<Void> markAlertAsHandled(UUID alertId);
    
    /**
     * Configurer les paramètres de détection pour un véhicule
     */
    Mono<Void> configureDeviationSettings(UUID vehicleId, Double customTolerance, Integer checkIntervalSeconds);
    
    /**
     * Prédire si un véhicule va probablement dévier de sa route
     */
    Mono<Boolean> predictPotentialDeviation(UUID vehicleId, Point currentPosition, Point nextExpectedPosition);
}
```

*Lignes: 88*

---

### 📄 src\main\java\ink\yowyob\geofence\service\RouteService.java

```java
package ink.yowyob.geofence.service;

import ink.yowyob.geofence.dto.LineStringDTO;
import ink.yowyob.geofence.dto.PointDTO;
import ink.yowyob.geofence.dto.request.RouteDTORequest;
import ink.yowyob.geofence.dto.response.MultipleRoutesDTOResponse;
import ink.yowyob.geofence.dto.response.RouteDTOResponse;
import ink.yowyob.geofence.model.User;
import org.locationtech.jts.geom.LineString;
import org.locationtech.jts.geom.Point;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.List;
import java.util.UUID;

public interface RouteService {
    
    // CRUD operations
    Mono<RouteDTOResponse> createRoute(RouteDTORequest routeRequest, User user);
    
    Mono<RouteDTOResponse> getRoute(UUID routeId);
    
    Mono<RouteDTOResponse> updateRoute(UUID routeId, RouteDTORequest routeRequest, User user);
    
    Mono<Void> deleteRoute(UUID routeId, User user);
    
    // List operations
    Mono<MultipleRoutesDTOResponse> getUserRoutes(User user);
    
    Mono<MultipleRoutesDTOResponse> getAllRoutes();
    
    Mono<MultipleRoutesDTOResponse> searchRoutes(String keyword, User user);
    
    Flux<RouteDTOResponse> getActiveRoutesByVehicle(UUID vehicleId);
    
    // Vehicle assignment
    Mono<RouteDTOResponse> assignVehicleToRoute(UUID routeId, UUID vehicleId, User user);
    
    Mono<RouteDTOResponse> removeVehicleFromRoute(UUID routeId, UUID vehicleId, User user);
    
    // Route analysis and monitoring
    Mono<Boolean> isVehicleOnRoute(UUID vehicleId, Point currentPosition);
    
    Mono<Double> calculateDeviationDistance(UUID routeId, Point currentPosition);
    
    Flux<UUID> detectRouteDeviations(UUID vehicleId, Point currentPosition, Double toleranceMeters);
    
    Mono<Double> calculateRouteProgress(UUID routeId, Point currentPosition);
    
    // Utility methods
    Point convertToPoint(PointDTO dto);
    
    LineString convertToLineString(LineStringDTO dto);
    
    // Route optimization
    Mono<List<RouteDTOResponse>> suggestAlternativeRoutes(Point startPoint, Point endPoint, User user);
    
    Mono<RouteDTOResponse> optimizeRouteSegments(UUID routeId, User user);
}
```

*Lignes: 60*

---

### 📄 src\main\java\ink\yowyob\geofence\service\StatisticsService.java

```java
package ink.yowyob.geofence.service;

import ink.yowyob.geofence.dto.response.SystemStatisticsDTO;
import ink.yowyob.geofence.dto.response.UserStatisticsDTO;
import ink.yowyob.geofence.dto.response.VehicleStatisticsDTO;
import ink.yowyob.geofence.model.User;

import java.util.UUID;

public interface StatisticsService {
    SystemStatisticsDTO getSystemStatistics(User user);
    UserStatisticsDTO getUserStatistics(User user);
    VehicleStatisticsDTO getVehicleStatistics(UUID vehicleId, User user);
}
```

*Lignes: 14*

---

### 📄 src\main\java\ink\yowyob\geofence\service\UserManagementService.java

```java
package ink.yowyob.geofence.service;

import ink.yowyob.geofence.dto.request.UpdateUserRoleRequest;
import ink.yowyob.geofence.dto.response.UserDTO;
import ink.yowyob.geofence.dto.response.UserListResponse;
import ink.yowyob.geofence.model.User;

import java.util.UUID;

public interface UserManagementService {
    UserListResponse getAllUsers(Integer page, Integer size, User currentUser);
    UserDTO getUserById(UUID id, User currentUser);
    UserDTO updateUserRole(UUID id, UpdateUserRoleRequest request, User admin);
    void deleteUser(UUID id, User admin);
    UserListResponse getUsersForSharing(User currentUser);
}
```

*Lignes: 16*

---

### 📄 src\main\java\ink\yowyob\geofence\service\UserService.java

```java
package ink.yowyob.geofence.service;

public interface UserService {
}

```

*Lignes: 5*

---

### 📄 src\main\java\ink\yowyob\geofence\service\VehicleService.java

```java
package ink.yowyob.geofence.service;

import ink.yowyob.geofence.dto.request.VehicleDTORequest;
import ink.yowyob.geofence.dto.response.MultipleVehicleDTOResponse;
import ink.yowyob.geofence.dto.response.VehicleDTOResponse;
import ink.yowyob.geofence.model.User;

import java.util.UUID;

public interface VehicleService {
    VehicleDTOResponse getVehicle(UUID id, User currentUser);
    MultipleVehicleDTOResponse getVehicles(User currentUser);
    VehicleDTOResponse createVehicle(VehicleDTORequest vehicleDTORequest, User currentUser);
    MultipleVehicleDTOResponse getMyVehicles(User currentUser);
    VehicleDTOResponse editVehicle(VehicleDTORequest vehicleDTORequest, UUID id, User currentUser);
    void deleteVehicle(UUID id, User currentUser);

    VehicleDTOResponse updateVehicleImage(UUID id, String imageUrl, User currentUser);

    // Pour la gestion des zones de geofence
    VehicleDTOResponse assignToGeofenceZone(UUID vehicleId, UUID zoneId, String type, User currentUser);
    VehicleDTOResponse removeFromGeofenceZone(UUID vehicleId, UUID zoneId, User currentUser);
}

```

*Lignes: 24*

---

### 📄 src\main\java\ink\yowyob\geofence\util\DayOfWeekParser.java

```java
package ink.yowyob.geofence.util;

/**
 * Petit utilitaire pour parser des représentations courantes de jours (flexible):
 * exemples acceptés: "MON", "Mon", "MONDAY", "Monday", "Lundi", "1" (1 = Monday)
 */
public final class DayOfWeekParser {
    private DayOfWeekParser() {}

    public static java.time.DayOfWeek parseToJavaDayOfWeek(String input) {
        return ink.yowyob.geofence.Enum.DayOfWeek.parse(input).toJavaDayOfWeek();
    }
}

```

*Lignes: 14*

---

### 📄 src\main\resources\application.yml

```yaml
server:
  port: 8081

spring:
  application:
    name: geofence-service
  profiles:
    active: local

  # 1. R2DBC (Réactif)
  r2dbc:
    url: r2dbc:postgresql://${DB_HOST:localhost}:5432/${DB_NAME:geofence_db}
    username: ${DB_USERNAME:postgres}
    password: ${DB_PASSWORD:postgres123}
    pool:
      enabled: true
      max-size: 5

  # 2. JDBC (Liquibase)
  datasource:
    url: jdbc:postgresql://${DB_HOST:localhost}:5432/${DB_NAME:geofence_db}
    username: ${DB_USERNAME:postgres}
    password: ${DB_PASSWORD:postgres123}
    driver-class-name: org.postgresql.Driver

  liquibase:
    enabled: true
    change-log: classpath:db/changelog/db.changelog-master.xml
    default-schema: public

  jpa:
    hibernate:
      ddl-auto: none # Liquibase gère tout désormais
    database-platform: org.hibernate.spatial.dialect.postgis.PostgisDialect

  sql:
    init:
      mode: never

# Sécurité & JWT
jwt:
  encryption:
    key: ${JWT_ENCRYPTION_KEY:608f36e92dc66d97d5933f0e6371893cb4fc05b3aa8f8de64014732472303a7c}

file:
  upload-dir: ./uploads
```

*Lignes: 46*

---

### 📄 src\main\resources\db\changelog\changes\V1.0-create-initial-schema.xml

```xml
<?xml version="1.0" encoding="UTF-8"?>
<databaseChangeLog
        xmlns="http://www.liquibase.org/xml/ns/dbchangelog"
        xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
        xsi:schemaLocation="http://www.liquibase.org/xml/ns/dbchangelog
        http://www.liquibase.org/xml/ns/dbchangelog/dbchangelog-4.3.xsd">
    

    <changeSet id="v1.0-enable-postgis" author="geofence-service" failOnError="false">
        <preConditions onFail="MARK_RAN" onError="MARK_RAN">
            <sqlCheck expectedResult="0">
                SELECT COUNT(*) FROM pg_extension WHERE extname = 'postgis'
            </sqlCheck>
        </preConditions>
        <sql>CREATE EXTENSION postgis;</sql>
    </changeSet>

    <changeSet id="v1.0-enable-postgis-topology" author="geofence-service" failOnError="false">
        <preConditions onFail="MARK_RAN" onError="MARK_RAN">
            <sqlCheck expectedResult="0">
                SELECT COUNT(*) FROM pg_extension WHERE extname = 'postgis_topology'
            </sqlCheck>
        </preConditions>
        <sql>CREATE EXTENSION postgis_topology;</sql>
    </changeSet>


    <!-- ================================================================ -->
    <!-- 2. TABLE : role                                                   -->
    <!--    Entité : Role.java                                             -->
    <!-- ================================================================ -->

    <changeSet id="v1.0-create-role" author="geofence-service">
        <preConditions onFail="MARK_RAN">
            <not><tableExists tableName="role"/></not>
        </preConditions>
        <createTable tableName="role">
            <column name="id" type="SERIAL">
                <constraints primaryKey="true" nullable="false"/>
            </column>
            <column name="name" type="VARCHAR(50)">
                <constraints nullable="false" unique="true" uniqueConstraintName="uq_role_name"/>
            </column>
        </createTable>
    </changeSet>


    <!-- ================================================================ -->
    <!-- 3. TABLE : users                                                  -->
    <!--    Entité : User.java (implements UserDetails)                   -->
    <!-- ================================================================ -->

    <changeSet id="v1.0-create-users" author="geofence-service">
        <preConditions onFail="MARK_RAN">
            <not><tableExists tableName="users"/></not>
        </preConditions>
        <createTable tableName="users">
            <column name="uuid" type="UUID">
                <constraints primaryKey="true" nullable="false"/>
            </column>
            <column name="username" type="VARCHAR(255)">
                <constraints nullable="false" unique="true" uniqueConstraintName="uq_users_username"/>
            </column>
            <column name="password" type="VARCHAR(255)">
                <constraints nullable="false"/>
            </column>
            <column name="firstname" type="VARCHAR(255)"/>
            <column name="lastname" type="VARCHAR(255)"/>
            <column name="phone_number" type="VARCHAR(50)">
                <constraints unique="true" uniqueConstraintName="uq_users_phone"/>
            </column>
            <column name="email" type="VARCHAR(255)">
                <constraints nullable="false" unique="true" uniqueConstraintName="uq_users_email"/>
            </column>
            <column name="dob" type="DATE">
                <constraints nullable="false"/>
            </column>
            <column name="role_id" type="INTEGER">
                <constraints foreignKeyName="fk_users_role"
                             referencedTableName="role"
                             referencedColumnNames="id"/>
            </column>
            <column name="enabled" type="BOOLEAN" defaultValueBoolean="false"/>
            <column name="account_non_expired" type="BOOLEAN" defaultValueBoolean="true"/>
            <column name="account_non_locked" type="BOOLEAN" defaultValueBoolean="true"/>
            <column name="credentials_non_expired" type="BOOLEAN" defaultValueBoolean="true"/>
            <column name="created_at" type="TIMESTAMP">
                <constraints nullable="false"/>
            </column>
            <column name="updated_at" type="TIMESTAMP">
                <constraints nullable="false"/>
            </column>
        </createTable>
    </changeSet>


    <!-- ================================================================ -->
    <!-- 4. TABLE : circle_geofence_zone                                  -->
    <!--    Entité : CircleGeofenceZone extends GeofenceZone              -->
    <!--    Stratégie TABLE_PER_CLASS → tous les champs de GeofenceZone  -->
    <!--    sont répétés dans chaque table fille                          -->
    <!-- ================================================================ -->

    <changeSet id="v1.0-create-circle-geofence-zone" author="geofence-service">
        <preConditions onFail="MARK_RAN">
            <not><tableExists tableName="circle_geofence_zone"/></not>
        </preConditions>
        <createTable tableName="circle_geofence_zone">
            <column name="id" type="UUID">
                <constraints primaryKey="true" nullable="false"/>
            </column>
            <column name="title" type="VARCHAR(255)"/>
            <column name="description" type="TEXT"/>
            <column name="user_uuid" type="UUID">
                <constraints foreignKeyName="fk_circle_user"
                             referencedTableName="users"
                             referencedColumnNames="uuid"/>
            </column>
            <column name="is_temporal_enabled" type="BOOLEAN" defaultValueBoolean="false">
                <constraints nullable="false"/>
            </column>
            <column name="start_time" type="TIME"/>
            <column name="end_time" type="TIME"/>
            <column name="is_conditional_enabled" type="BOOLEAN" defaultValueBoolean="false">
                <constraints nullable="false"/>
            </column>
            <column name="max_speed" type="DOUBLE PRECISION"/>
            <column name="max_dwell_time" type="INTEGER"/>
            <column name="min_dwell_time" type="INTEGER"/>
            <column name="is_active" type="BOOLEAN" defaultValueBoolean="true">
                <constraints nullable="false"/>
            </column>
            <column name="created_at" type="TIMESTAMP"/>
            <column name="updated_at" type="TIMESTAMP"/>
            <column name="center" type="geometry(Point, 4326)"/>
            <column name="radius" type="DOUBLE PRECISION"/>
        </createTable>
    </changeSet>


    <!-- ================================================================ -->
    <!-- 5. TABLE : polygon_geofence_zone                                 -->
    <!--    Entité : PolygonGeofenceZone extends GeofenceZone             -->
    <!-- ================================================================ -->

    <changeSet id="v1.0-create-polygon-geofence-zone" author="geofence-service">
        <preConditions onFail="MARK_RAN">
            <not><tableExists tableName="polygon_geofence_zone"/></not>
        </preConditions>
        <createTable tableName="polygon_geofence_zone">
            <column name="id" type="UUID">
                <constraints primaryKey="true" nullable="false"/>
            </column>
            <column name="title" type="VARCHAR(255)"/>
            <column name="description" type="TEXT"/>
            <column name="user_uuid" type="UUID">
                <constraints foreignKeyName="fk_polygon_user"
                             referencedTableName="users"
                             referencedColumnNames="uuid"/>
            </column>
            <column name="is_temporal_enabled" type="BOOLEAN" defaultValueBoolean="false">
                <constraints nullable="false"/>
            </column>
            <column name="start_time" type="TIME"/>
            <column name="end_time" type="TIME"/>
            <column name="is_conditional_enabled" type="BOOLEAN" defaultValueBoolean="false">
                <constraints nullable="false"/>
            </column>
            <column name="max_speed" type="DOUBLE PRECISION"/>
            <column name="max_dwell_time" type="INTEGER"/>
            <column name="min_dwell_time" type="INTEGER"/>
            <column name="is_active" type="BOOLEAN" defaultValueBoolean="true">
                <constraints nullable="false"/>
            </column>
            <column name="created_at" type="TIMESTAMP"/>
            <column name="updated_at" type="TIMESTAMP"/>
            <column name="polygon" type="geometry(Polygon, 4326)"/>
        </createTable>
    </changeSet>


    <!-- ================================================================ -->
    <!-- 6. TABLE : geofence_active_days                                  -->
    <!--    @ElementCollection de GeofenceZone                            -->
    <!-- ================================================================ -->

    <changeSet id="v1.0-create-geofence-active-days" author="geofence-service">
        <preConditions onFail="MARK_RAN">
            <not><tableExists tableName="geofence_active_days"/></not>
        </preConditions>
        <createTable tableName="geofence_active_days">
            <column name="geofence_id" type="UUID">
                <constraints nullable="false"/>
            </column>
            <column name="day_of_week" type="VARCHAR(20)">
                <constraints nullable="false"/>
            </column>
        </createTable>
    </changeSet>


    <!-- ================================================================ -->
    <!-- 7. TABLE : vehicle                                                -->
    <!--    Entité : Vehicle.java (@Table sans name → "vehicle")          -->
    <!-- ================================================================ -->

    <changeSet id="v1.0-create-vehicle" author="geofence-service">
        <preConditions onFail="MARK_RAN">
            <not><tableExists tableName="vehicle"/></not>
        </preConditions>
        <createTable tableName="vehicle">
            <column name="id" type="UUID">
                <constraints primaryKey="true" nullable="false"/>
            </column>
            <column name="brand" type="VARCHAR(255)"/>
            <column name="model" type="VARCHAR(255)"/>
            <column name="license_plate" type="VARCHAR(50)"/>
            <column name="description" type="TEXT"/>
            <column name="image_url" type="TEXT"/>
            <column name="user_uuid" type="UUID">
                <constraints foreignKeyName="fk_vehicle_user"
                             referencedTableName="users"
                             referencedColumnNames="uuid"/>
            </column>
        </createTable>
    </changeSet>


    <!-- ================================================================ -->
    <!-- 8. TABLE : vehicle_geofence_zones                                -->
    <!--    @ManyToMany join table Vehicle ↔ GeofenceZone                 -->
    <!-- ================================================================ -->

    <changeSet id="v1.0-create-vehicle-geofence-zones" author="geofence-service">
        <preConditions onFail="MARK_RAN">
            <not><tableExists tableName="vehicle_geofence_zones"/></not>
        </preConditions>
        <createTable tableName="vehicle_geofence_zones">
            <column name="vehicle_id" type="UUID">
                <constraints nullable="false" primaryKey="true"
                             foreignKeyName="fk_vgz_vehicle"
                             referencedTableName="vehicle"
                             referencedColumnNames="id"/>
            </column>
            <!-- Pas de FK : polymorphisme géré applicativement -->
            <column name="geofence_zone_id" type="UUID">
                <constraints nullable="false" primaryKey="true"/>
            </column>
        </createTable>
    </changeSet>


    <!-- ================================================================ -->
    <!-- 9. TABLE : locations                                              -->
    <!--    Entité : Location.java                                         -->
    <!-- ================================================================ -->

    <changeSet id="v1.0-create-locations" author="geofence-service">
        <preConditions onFail="MARK_RAN">
            <not><tableExists tableName="locations"/></not>
        </preConditions>
        <createTable tableName="locations">
            <column name="id" type="UUID">
                <constraints primaryKey="true" nullable="false"/>
            </column>
            <column name="position" type="geometry(Point, 4326)">
                <constraints nullable="false"/>
            </column>
            <column name="vehicle_id" type="UUID">
                <constraints nullable="false"
                             foreignKeyName="fk_location_vehicle"
                             referencedTableName="vehicle"
                             referencedColumnNames="id"/>
            </column>
            <column name="timestamp" type="TIMESTAMP">
                <constraints nullable="false"/>
            </column>
            <column name="speed" type="DOUBLE PRECISION"/>
            <column name="heading" type="DOUBLE PRECISION"/>
            <column name="altitude" type="DOUBLE PRECISION"/>
            <column name="accuracy" type="DOUBLE PRECISION"/>
            <column name="source" type="VARCHAR(500)"/>
        </createTable>
    </changeSet>


    <!-- ================================================================ -->
    <!-- 10. TABLE : alert_type                                            -->
    <!--     Entité : AlertType.java (@Table sans name → "alert_type")    -->
    <!-- ================================================================ -->

    <changeSet id="v1.0-create-alert-type" author="geofence-service">
        <preConditions onFail="MARK_RAN">
            <not><tableExists tableName="alert_type"/></not>
        </preConditions>
        <createTable tableName="alert_type">
            <column name="id" type="SERIAL">
                <constraints primaryKey="true" nullable="false"/>
            </column>
            <column name="type" type="VARCHAR(50)">
                <constraints nullable="false" unique="true" uniqueConstraintName="uq_alert_type"/>
            </column>
        </createTable>
    </changeSet>


    <!-- ================================================================ -->
    <!-- 11. TABLE : alert                                                 -->
    <!--     Entité : Alert.java (@Table sans name → "alert")             -->
    <!--     geofence_zone_id sans FK (polymorphisme TABLE_PER_CLASS)     -->
    <!-- ================================================================ -->

    <changeSet id="v1.0-create-alert" author="geofence-service">
        <preConditions onFail="MARK_RAN">
            <not><tableExists tableName="alert"/></not>
        </preConditions>
        <createTable tableName="alert">
            <column name="id" type="UUID">
                <constraints primaryKey="true" nullable="false"/>
            </column>
            <column name="type_id" type="INTEGER">
                <constraints foreignKeyName="fk_alert_type"
                             referencedTableName="alert_type"
                             referencedColumnNames="id"/>
            </column>
            <column name="vehicle_id" type="UUID">
                <constraints foreignKeyName="fk_alert_vehicle"
                             referencedTableName="vehicle"
                             referencedColumnNames="id"/>
            </column>
            <column name="geofence_zone_id" type="UUID"/>
            <column name="location_id" type="UUID">
                <constraints foreignKeyName="fk_alert_location"
                             referencedTableName="locations"
                             referencedColumnNames="id"/>
            </column>
            <column name="message" type="TEXT"/>
            <column name="timestamp" type="TIMESTAMP" defaultValueComputed="NOW()"/>
            <column name="speed" type="DOUBLE PRECISION"/>
            <column name="dwell_time_minutes" type="INTEGER"/>
            <column name="is_read" type="BOOLEAN" defaultValueBoolean="false">
                <constraints nullable="false"/>
            </column>
            <column name="severity" type="VARCHAR(20)" defaultValue="INFO">
                <constraints nullable="false"/>
            </column>
            <column name="additional_data" type="TEXT"/>
        </createTable>
    </changeSet>


    <!-- ================================================================ -->
    <!-- 12. TABLE : geofence_forks                                        -->
    <!--     Entité : GeofenceFork.java                                    -->
    <!--     FKs sur geofences sans contrainte (TABLE_PER_CLASS)          -->
    <!-- ================================================================ -->

    <changeSet id="v1.0-create-geofence-forks" author="geofence-service">
        <preConditions onFail="MARK_RAN">
            <not><tableExists tableName="geofence_forks"/></not>
        </preConditions>
        <createTable tableName="geofence_forks">
            <column name="id" type="UUID">
                <constraints primaryKey="true" nullable="false"/>
            </column>
            <column name="original_geofence_id" type="UUID">
                <constraints nullable="false"/>
            </column>
            <column name="forked_geofence_id" type="UUID">
                <constraints nullable="false"/>
            </column>
            <column name="forked_by_user_id" type="UUID">
                <constraints nullable="false"
                             foreignKeyName="fk_fork_user"
                             referencedTableName="users"
                             referencedColumnNames="uuid"/>
            </column>
            <column name="forked_at" type="TIMESTAMP">
                <constraints nullable="false"/>
            </column>
            <column name="fork_reason" type="VARCHAR(500)"/>
        </createTable>
    </changeSet>


    <!-- ================================================================ -->
    <!-- 13. TABLE : geofence_invite_links                                 -->
    <!--     Entité : GeofenceInviteLink.java                             -->
    <!-- ================================================================ -->

    <changeSet id="v1.0-create-geofence-invite-links" author="geofence-service">
        <preConditions onFail="MARK_RAN">
            <not><tableExists tableName="geofence_invite_links"/></not>
        </preConditions>
        <createTable tableName="geofence_invite_links">
            <column name="id" type="UUID">
                <constraints primaryKey="true" nullable="false"/>
            </column>
            <column name="invite_code" type="VARCHAR(12)">
                <constraints nullable="false" unique="true" uniqueConstraintName="uq_invite_code"/>
            </column>
            <column name="geofence_id" type="UUID">
                <constraints nullable="false"/>
            </column>
            <column name="geofence_type" type="VARCHAR(1)">
                <constraints nullable="false"/>
            </column>
            <column name="created_by" type="UUID">
                <constraints nullable="false"
                             foreignKeyName="fk_invite_user"
                             referencedTableName="users"
                             referencedColumnNames="uuid"/>
            </column>
            <column name="created_at" type="TIMESTAMP">
                <constraints nullable="false"/>
            </column>
            <column name="expires_at" type="TIMESTAMP"/>
            <column name="can_edit" type="BOOLEAN" defaultValueBoolean="false">
                <constraints nullable="false"/>
            </column>
            <column name="is_active" type="BOOLEAN" defaultValueBoolean="true">
                <constraints nullable="false"/>
            </column>
            <column name="max_uses" type="INTEGER" defaultValueNumeric="-1">
                <constraints nullable="false"/>
            </column>
            <column name="current_uses" type="INTEGER" defaultValueNumeric="0">
                <constraints nullable="false"/>
            </column>
        </createTable>
    </changeSet>


    <!-- ================================================================ -->
    <!-- 14. TABLE : geofence_share                                        -->
    <!--     Entité : GeofenceShare.java (@Table sans name → "geofence_share") -->
    <!-- ================================================================ -->

    <changeSet id="v1.0-create-geofence-share" author="geofence-service">
        <preConditions onFail="MARK_RAN">
            <not><tableExists tableName="geofence_share"/></not>
        </preConditions>
        <createTable tableName="geofence_share">
            <column name="id" type="UUID">
                <constraints primaryKey="true" nullable="false"/>
            </column>
            <column name="geofence_zone_id" type="UUID"/>
            <column name="shared_by_user_id" type="UUID">
                <constraints foreignKeyName="fk_share_by_user"
                             referencedTableName="users"
                             referencedColumnNames="uuid"/>
            </column>
            <column name="shared_with_user_id" type="UUID">
                <constraints foreignKeyName="fk_share_with_user"
                             referencedTableName="users"
                             referencedColumnNames="uuid"/>
            </column>
            <column name="shared_at" type="TIMESTAMP"/>
            <column name="expires_at" type="TIMESTAMP"/>
            <column name="can_edit" type="BOOLEAN" defaultValueBoolean="false"/>
            <column name="status" type="VARCHAR(50)" defaultValue="PENDING">
                <constraints nullable="false"/>
            </column>
            <column name="responded_at" type="TIMESTAMP"/>
        </createTable>
    </changeSet>


    <!-- ================================================================ -->
    <!-- 15. TABLE : validation                                            -->
    <!--     Entité : Validation.java                                      -->
    <!-- ================================================================ -->

    <changeSet id="v1.0-create-validation" author="geofence-service">
        <preConditions onFail="MARK_RAN">
            <not><tableExists tableName="validation"/></not>
        </preConditions>
        <createTable tableName="validation">
            <column name="id" type="BIGSERIAL">
                <constraints primaryKey="true" nullable="false"/>
            </column>
            <column name="creation" type="TIMESTAMP"/>
            <column name="expiration" type="TIMESTAMP"/>
            <column name="activation" type="TIMESTAMP"/>
            <column name="verification_token" type="VARCHAR(255)"/>
            <column name="user_uuid" type="UUID">
                <constraints foreignKeyName="fk_validation_user"
                             referencedTableName="users"
                             referencedColumnNames="uuid"/>
            </column>
        </createTable>
    </changeSet>


    <!-- ================================================================ -->
    <!-- 16. TABLE : organizations                                         -->
    <!--     Entité : Organization.java                                    -->
    <!-- ================================================================ -->

    <changeSet id="v1.0-create-organizations" author="geofence-service">
        <preConditions onFail="MARK_RAN">
            <not><tableExists tableName="organizations"/></not>
        </preConditions>
        <createTable tableName="organizations">
            <column name="id" type="UUID">
                <constraints primaryKey="true" nullable="false"/>
            </column>
            <column name="name" type="VARCHAR(255)">
                <constraints nullable="false"/>
            </column>
            <column name="domain" type="VARCHAR(255)">
                <constraints unique="true" uniqueConstraintName="uq_org_domain"/>
            </column>
            <column name="api_key" type="VARCHAR(255)">
                <constraints nullable="false" unique="true" uniqueConstraintName="uq_org_api_key"/>
            </column>
            <column name="contact_email" type="VARCHAR(255)"/>
            <column name="webhook_url" type="VARCHAR(255)"/>
            <column name="is_active" type="BOOLEAN" defaultValueBoolean="true"/>
            <column name="is_internal" type="BOOLEAN" defaultValueBoolean="false"/>
            <column name="subscription_plan" type="VARCHAR(50)" defaultValue="FREE"/>
            <column name="max_users" type="INTEGER" defaultValueNumeric="10"/>
            <column name="max_vehicles" type="INTEGER" defaultValueNumeric="50"/>
            <column name="max_geofences" type="INTEGER" defaultValueNumeric="20"/>
            <column name="rate_limit_per_hour" type="INTEGER" defaultValueNumeric="1000"/>
            <column name="created_at" type="TIMESTAMP">
                <constraints nullable="false"/>
            </column>
            <column name="last_api_call" type="TIMESTAMP"/>
        </createTable>
    </changeSet>


    <!-- ================================================================ -->
    <!-- 17. TABLE : organization_users                                    -->
    <!--     Entité : OrganizationUser.java                               -->
    <!-- ================================================================ -->

    <changeSet id="v1.0-create-organization-users" author="geofence-service">
        <preConditions onFail="MARK_RAN">
            <not><tableExists tableName="organization_users"/></not>
        </preConditions>
        <createTable tableName="organization_users">
            <column name="id" type="UUID">
                <constraints primaryKey="true" nullable="false"/>
            </column>
            <column name="organization_id" type="UUID">
                <constraints nullable="false"
                             foreignKeyName="fk_orguser_org"
                             referencedTableName="organizations"
                             referencedColumnNames="id"/>
            </column>
            <column name="external_user_id" type="VARCHAR(255)">
                <constraints nullable="false"/>
            </column>
            <column name="email" type="VARCHAR(255)"/>
            <column name="name" type="VARCHAR(255)"/>
            <column name="role" type="VARCHAR(50)" defaultValue="USER"/>
            <column name="is_active" type="BOOLEAN" defaultValueBoolean="true"/>
            <column name="created_at" type="TIMESTAMP">
                <constraints nullable="false"/>
            </column>
            <column name="last_login_at" type="TIMESTAMP"/>
        </createTable>
    </changeSet>


    <!-- ================================================================ -->
    <!-- 18. TABLE : routes                                                -->
    <!--     Entité : Route.java                                           -->
    <!-- ================================================================ -->

    <changeSet id="v1.0-create-routes" author="geofence-service">
        <preConditions onFail="MARK_RAN">
            <not><tableExists tableName="routes"/></not>
        </preConditions>
        <createTable tableName="routes">
            <column name="id" type="UUID">
                <constraints primaryKey="true" nullable="false"/>
            </column>
            <column name="user_id" type="UUID">
                <constraints nullable="false"
                             foreignKeyName="fk_route_user"
                             referencedTableName="users"
                             referencedColumnNames="uuid"/>
            </column>
            <column name="name" type="VARCHAR(100)">
                <constraints nullable="false"/>
            </column>
            <column name="description" type="VARCHAR(500)"/>
            <column name="start_point" type="geometry(Point, 4326)"/>
            <column name="start_address" type="VARCHAR(255)"/>
            <column name="end_point" type="geometry(Point, 4326)"/>
            <column name="end_address" type="VARCHAR(255)"/>
            <column name="estimated_distance" type="DOUBLE PRECISION"/>
            <column name="estimated_duration" type="INTEGER"/>
            <column name="deviation_tolerance" type="DOUBLE PRECISION" defaultValueNumeric="100.0">
                <constraints nullable="false"/>
            </column>
            <column name="is_temporal_enabled" type="BOOLEAN" defaultValueBoolean="false">
                <constraints nullable="false"/>
            </column>
            <column name="start_time" type="TIME"/>
            <column name="end_time" type="TIME"/>
            <column name="is_active" type="BOOLEAN" defaultValueBoolean="true">
                <constraints nullable="false"/>
            </column>
            <column name="created_at" type="TIMESTAMP">
                <constraints nullable="false"/>
            </column>
            <column name="updated_at" type="TIMESTAMP"/>
        </createTable>
    </changeSet>


    <!-- ================================================================ -->
    <!-- 19. TABLE : route_active_days                                     -->
    <!--     @ElementCollection de Route.java                             -->
    <!-- ================================================================ -->

    <changeSet id="v1.0-create-route-active-days" author="geofence-service">
        <preConditions onFail="MARK_RAN">
            <not><tableExists tableName="route_active_days"/></not>
        </preConditions>
        <createTable tableName="route_active_days">
            <column name="route_id" type="UUID">
                <constraints nullable="false"
                             foreignKeyName="fk_rad_route"
                             referencedTableName="routes"
                             referencedColumnNames="id"/>
            </column>
            <column name="day_of_week" type="VARCHAR(20)">
                <constraints nullable="false"/>
            </column>
        </createTable>
    </changeSet>


    <!-- ================================================================ -->
    <!-- 20. TABLE : route_segments                                        -->
    <!--     Entité : RouteSegment.java                                    -->
    <!-- ================================================================ -->

    <changeSet id="v1.0-create-route-segments" author="geofence-service">
        <preConditions onFail="MARK_RAN">
            <not><tableExists tableName="route_segments"/></not>
        </preConditions>
        <createTable tableName="route_segments">
            <column name="id" type="UUID">
                <constraints primaryKey="true" nullable="false"/>
            </column>
            <column name="route_id" type="UUID">
                <constraints nullable="false"
                             foreignKeyName="fk_segment_route"
                             referencedTableName="routes"
                             referencedColumnNames="id"/>
            </column>
            <column name="name" type="VARCHAR(100)"/>
            <column name="description" type="VARCHAR(500)"/>
            <column name="path_line" type="geometry(LineString, 4326)">
                <constraints nullable="false"/>
            </column>
            <column name="segment_order" type="INTEGER"/>
            <column name="segment_length" type="DOUBLE PRECISION">
                <constraints nullable="false"/>
            </column>
            <column name="segment_type" type="VARCHAR(50)" defaultValue="MAIN_ROUTE">
                <constraints nullable="false"/>
            </column>
            <column name="priority" type="INTEGER" defaultValueNumeric="1">
                <constraints nullable="false"/>
            </column>
            <column name="speed_limit" type="DOUBLE PRECISION"/>
            <column name="estimated_time" type="INTEGER"/>
            <column name="is_active" type="BOOLEAN" defaultValueBoolean="true">
                <constraints nullable="false"/>
            </column>
            <column name="created_at" type="TIMESTAMP">
                <constraints nullable="false"/>
            </column>
            <column name="updated_at" type="TIMESTAMP"/>
        </createTable>
    </changeSet>


    <!-- ================================================================ -->
    <!-- 21. TABLE : vehicle_assigned_routes                               -->
    <!--     @ManyToMany join table Vehicle ↔ Route                       -->
    <!-- ================================================================ -->

    <changeSet id="v1.0-create-vehicle-assigned-routes" author="geofence-service">
        <preConditions onFail="MARK_RAN">
            <not><tableExists tableName="vehicle_assigned_routes"/></not>
        </preConditions>
        <createTable tableName="vehicle_assigned_routes">
            <column name="vehicle_id" type="UUID">
                <constraints nullable="false" primaryKey="true"
                             foreignKeyName="fk_var_vehicle"
                             referencedTableName="vehicle"
                             referencedColumnNames="id"/>
            </column>
            <column name="route_id" type="UUID">
                <constraints nullable="false" primaryKey="true"
                             foreignKeyName="fk_var_route"
                             referencedTableName="routes"
                             referencedColumnNames="id"/>
            </column>
        </createTable>
    </changeSet>


    <!-- ================================================================ -->
    <!-- 22. TABLE : vehicle_api_keys                                      -->
    <!--     Entité : VehicleApiKey.java                                   -->
    <!-- ================================================================ -->

    <changeSet id="v1.0-create-vehicle-api-keys" author="geofence-service">
        <preConditions onFail="MARK_RAN">
            <not><tableExists tableName="vehicle_api_keys"/></not>
        </preConditions>
        <createTable tableName="vehicle_api_keys">
            <column name="id" type="UUID">
                <constraints primaryKey="true" nullable="false"/>
            </column>
            <column name="api_key" type="VARCHAR(64)">
                <constraints nullable="false" unique="true" uniqueConstraintName="uq_vehicle_api_key"/>
            </column>
            <column name="vehicle_id" type="UUID">
                <constraints nullable="false" unique="true"
                             uniqueConstraintName="uq_vehicle_api_key_vehicle"
                             foreignKeyName="fk_apikey_vehicle"
                             referencedTableName="vehicle"
                             referencedColumnNames="id"/>
            </column>
            <column name="is_active" type="BOOLEAN" defaultValueBoolean="true">
                <constraints nullable="false"/>
            </column>
            <column name="created_at" type="TIMESTAMP">
                <constraints nullable="false"/>
            </column>
            <column name="last_used_at" type="TIMESTAMP"/>
            <column name="expires_at" type="TIMESTAMP"/>
        </createTable>
    </changeSet>

</databaseChangeLog>
```

*Lignes: 746*

---

### 📄 src\main\resources\db\changelog\db.changelog-master.xml

```xml
<?xml version="1.0" encoding="UTF-8"?>
<databaseChangeLog
        xmlns="http://www.liquibase.org/xml/ns/dbchangelog"
        xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
        xsi:schemaLocation="http://www.liquibase.org/xml/ns/dbchangelog
        http://www.liquibase.org/xml/ns/dbchangelog/dbchangelog-4.3.xsd">

    <include file="classpath:db/changelog/changes/V1.0-create-initial-schema.xml"/>

</databaseChangeLog>
```

*Lignes: 10*

---

### 📄 src\main\resources\prod.application.yml

```yaml
server:
  port: 8080
  forward-headers-strategy: framework
  error:
    include-message: always

spring:
  application:
    name: geofence-service

  liquibase:
    url: jdbc:postgresql://${DB_HOST}:${DB_PORT:5432}/${DB_NAME:yowyob}
    user: ${DB_LIQUIBASE_USERNAME:${DB_USERNAME}}
    password: ${DB_LIQUIBASE_PASSWORD:${DB_PASSWORD}}
    enabled: true
    change-log: classpath:db/changelog/db.changelog-master.xml
    default-schema: public
    liquibase-schema: public

  datasource:
    url: jdbc:postgresql://${DB_HOST}:${DB_PORT:5432}/${DB_NAME:yowyob}
    username: ${DB_USERNAME}
    password: ${DB_PASSWORD}
    driver-class-name: org.postgresql.Driver

  r2dbc:
    url: r2dbc:postgresql://${DB_HOST}:${DB_PORT:5432}/${DB_NAME:yowyob}
    username: ${DB_USERNAME}
    password: ${DB_PASSWORD}
    pool:
      enabled: true
      initial-size: 5
      max-size: 20
      max-idle-time: 30m
      validation-query: SELECT 1

  sql:
    init:
      mode: never

  # ------------------------------------------------------------------
  # REDIS CLUSTER
  # ------------------------------------------------------------------
  data:
    redis:
      username: ${REDIS_USERNAME}
      password: ${REDIS_PASSWORD}
      cluster:
        nodes:
          - ${REDIS_HOST}:7001
          - ${REDIS_HOST}:7002
          - ${REDIS_HOST}:7003
          - ${REDIS_HOST}:7004
          - ${REDIS_HOST}:7005
          - ${REDIS_HOST}:7006
        max-redirects: 3
      lettuce:
        pool:
          max-active: 16
          max-idle: 8
          min-idle: 2
        cluster:
          refresh:
            adaptive: true
            period: 30s
            dynamic-refresh-sources: false

  # ------------------------------------------------------------------
  # KAFKA — Connexion sécurisée SASL/SCRAM-SHA-256
  # ------------------------------------------------------------------
  kafka:
    bootstrap-servers: ${KAFKA_HOST:localhost}:${KAFKA_PORT:29092}

    # ── Authentification SASL/SCRAM-SHA-256 ────────────────────────
    properties:
      security.protocol: SASL_PLAINTEXT
      sasl.mechanism: SCRAM-SHA-256
      sasl.jaas.config: >
        org.apache.kafka.common.security.scram.ScramLoginModule required
        username="${KAFKA_BACKEND_USER}"
        password="${KAFKA_BACKEND_PASSWORD}";
    
    # ── Consumer ────────────────────────────────────────────────────
    consumer:
      # Convention : yowyob.{service}-group  (doit matcher le préfixe ACL yowyob.)
      group-id: yowyob.geofence-service-group
      auto-offset-reset: earliest
      enable-auto-commit: false          # commit manuel = fiabilité garantie
      key-deserializer: org.apache.kafka.common.serialization.StringDeserializer
      value-deserializer: org.springframework.kafka.support.serializer.JsonDeserializer
      max-poll-records: 50
      properties:
        # Restreindre les packages désérialisables (ne jamais laisser "*" en prod)
        spring.json.trusted.packages: "ink.yowyob.geofence.*"
        

    # ── Producer ────────────────────────────────────────────────────
    producer:
      key-serializer: org.apache.kafka.common.serialization.StringSerializer
      value-serializer: org.springframework.kafka.support.serializer.JsonSerializer
      # acks=all : le broker confirme l'écriture sur toutes les répliques
      # Sur single-broker (réplication=1) cela équivaut à acks=1,
      # mais le paramètre est déjà correct pour la future migration multi-broker
      acks: all
      retries: 3
      properties:
        enable.idempotence: true
        max.in.flight.requests.per.connection: 5
        compression.type: lz4

    # ── Listener container ──────────────────────────────────────────
    listener:
      ack-mode: MANUAL_IMMEDIATE
      # 3 threads = 3 partitions consommées en parallèle par instance
      # À ajuster si le topic ride-and-go a plus de 6 partitions
      concurrency: 3
      missing-topics-fatal: false   # false = le service démarre même si le topic n'existe pas encore
  

  jpa:
    hibernate:
      ddl-auto: none
    database-platform: org.hibernate.spatial.dialect.postgis.PostgisDialect

# ------------------------------------------------------------------
# MONITORING & HEALTH CHECK (ACTUATOR)
# ------------------------------------------------------------------
management:
  endpoints:
    web:
      exposure:
        include: ["health", "info", "prometheus"]
  endpoint:
    health:
      show-details: "always"
      probes:
        enabled: true
  metrics:
    export:
      prometheus:
        enabled: true
```

*Lignes: 141*

---

### 📄 src\test\java\com\reseau\geofence\GeofenceApplicationTests.java

```java
package com.reseau.geofence;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class GeofenceApplicationTests {

	@Test
	void contextLoads() {
	}

}

```

*Lignes: 14*

---

## Statistiques

- **Total de fichiers analysés:** 208
- **Total de lignes de code:** 14 442
- **Moyenne de lignes par fichier:** 69

### Répartition par type de fichier

- **.java:** 171 fichiers
- **.yml:** 13 fichiers
- **.json:** 11 fichiers
- **.md:** 6 fichiers
- **.xml:** 4 fichiers
- **.sql:** 2 fichiers
- **.txt:** 1 fichier

---

*Contexte généré automatiquement pour analyse par IA*
