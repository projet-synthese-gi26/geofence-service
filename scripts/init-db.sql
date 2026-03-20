-- scripts/init-db.sql

-- Activer PostGIS
CREATE EXTENSION IF NOT EXISTS postgis;
CREATE EXTENSION IF NOT EXISTS postgis_topology;

-- Vérifier l'installation
SELECT PostGIS_Full_Version();

-- Créer des index spatiaux si nécessaire
-- (Hibernate les créera automatiquement, mais on peut les optimiser)

-- Accorder les droits sur toutes les tables existantes
GRANT SELECT, INSERT, UPDATE, DELETE ON ALL TABLES IN SCHEMA public TO <DB_USERNAME>;

-- Accorder les droits sur les séquences (pour les IDs auto-générés)
GRANT USAGE, SELECT ON ALL SEQUENCES IN SCHEMA public TO <DB_USERNAME>;

-- Pour que les futures tables créées par Liquibase aient aussi les droits
ALTER DEFAULT PRIVILEGES FOR ROLE <DB_LIQUIBASE_USERNAME> IN SCHEMA public
GRANT SELECT, INSERT, UPDATE, DELETE ON TABLES TO <DB_USERNAME>;

ALTER DEFAULT PRIVILEGES FOR ROLE <DB_LIQUIBASE_USERNAME> IN SCHEMA public
GRANT USAGE, SELECT ON SEQUENCES TO <DB_USERNAME>;

-- Log de confirmation
\echo 'PostGIS extensions installed successfully!';

