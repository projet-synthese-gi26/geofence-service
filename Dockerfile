# Dockerfile
FROM openjdk:21-jdk-slim

# Métadonnées
LABEL maintainer="votre-email@example.com"
LABEL description="Geofence API - Spring Boot WebFlux Application"

# Variables d'environnement
ENV JAVA_OPTS="-Xms512m -Xmx1024m"
ENV SPRING_PROFILES_ACTIVE=docker


# Créer un utilisateur non-root pour la sécurité
RUN groupadd -r appuser && useradd -r -g appuser appuser

# Répertoire de travail
WORKDIR /app

# Copier les dépendances locales
COPY lib/ /app/lib/

# Copier le JAR de l'application
COPY target/geofence-*.jar /app/app.jar

# Créer le dossier uploads
RUN mkdir -p /app/uploads && chown -R appuser:appuser /app

# Changer vers l'utilisateur non-root
USER appuser

# Port exposé
EXPOSE 8081

# Health check
HEALTHCHECK --interval=30s --timeout=3s --start-period=60s --retries=3 \
  CMD curl -f http://localhost:8081/actuator/health || exit 1

# Point d'entrée
ENTRYPOINT ["sh", "-c", "java $JAVA_OPTS -jar /app/app.jar"]
