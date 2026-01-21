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
