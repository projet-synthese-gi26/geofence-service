-- liquibase formatted sql

-- changeset yowyob:001-initial-schema
-- comment: Initialisation PostGIS et Tables Geofence

-- 1. Activer PostGIS (nécessite d'être super-utilisateur ou d'avoir les droits)
CREATE EXTENSION IF NOT EXISTS postgis;
CREATE EXTENSION IF NOT EXISTS postgis_topology;

-- 2. Tables de base
CREATE TABLE IF NOT EXISTS role (
    id SERIAL PRIMARY KEY,
    name VARCHAR(50) NOT NULL UNIQUE
);

CREATE TABLE IF NOT EXISTS users (
    uuid UUID PRIMARY KEY,
    username VARCHAR(255) NOT NULL UNIQUE,
    password VARCHAR(255) NOT NULL,
    firstname VARCHAR(255),
    lastname VARCHAR(255),
    phone_number VARCHAR(50) UNIQUE,
    email VARCHAR(255) UNIQUE,
    dob DATE,
    role_id INTEGER REFERENCES role(id),
    enabled BOOLEAN DEFAULT FALSE,
    account_non_expired BOOLEAN DEFAULT TRUE,
    account_non_locked BOOLEAN DEFAULT TRUE,
    credentials_non_expired BOOLEAN DEFAULT TRUE,
    created_at TIMESTAMP DEFAULT NOW(),
    updated_at TIMESTAMP DEFAULT NOW()
);

-- 3. GEOFENCES (Utilisation des types GEOMETRY de PostGIS)
CREATE TABLE IF NOT EXISTS circle_geofence_zone (
    id UUID PRIMARY KEY,
    title VARCHAR(255),
    description TEXT,
    user_uuid UUID REFERENCES users(uuid),
    center geometry(Point, 4326),
    radius DOUBLE PRECISION,
    is_temporal_enabled BOOLEAN DEFAULT FALSE,
    start_time TIME,
    end_time TIME,
    is_conditional_enabled BOOLEAN DEFAULT FALSE,
    max_speed DOUBLE PRECISION,
    max_dwell_time INTEGER,
    min_dwell_time INTEGER,
    is_active BOOLEAN DEFAULT TRUE,
    created_at TIMESTAMP DEFAULT NOW(),
    updated_at TIMESTAMP DEFAULT NOW()
);

CREATE TABLE IF NOT EXISTS polygon_geofence_zone (
    id UUID PRIMARY KEY,
    title VARCHAR(255),
    description TEXT,
    user_uuid UUID REFERENCES users(uuid),
    polygon geometry(Polygon, 4326),
    is_temporal_enabled BOOLEAN DEFAULT FALSE,
    start_time TIME,
    end_time TIME,
    is_conditional_enabled BOOLEAN DEFAULT FALSE,
    max_speed DOUBLE PRECISION,
    max_dwell_time INTEGER,
    min_dwell_time INTEGER,
    is_active BOOLEAN DEFAULT TRUE,
    created_at TIMESTAMP DEFAULT NOW(),
    updated_at TIMESTAMP DEFAULT NOW()
);

CREATE TABLE IF NOT EXISTS geofence_active_days (
    geofence_id UUID NOT NULL,
    day_of_week VARCHAR(20) NOT NULL
);

-- 4. VEHICLES
CREATE TABLE IF NOT EXISTS vehicle (
    id UUID PRIMARY KEY,
    brand VARCHAR(255),
    model VARCHAR(255),
    license_plate VARCHAR(50),
    description TEXT,
    image_url TEXT,
    user_uuid UUID REFERENCES users(uuid)
);

CREATE TABLE IF NOT EXISTS vehicle_geofence_zones (
    vehicle_id UUID REFERENCES vehicle(id),
    geofence_zone_id UUID, -- Polymorphisme géré au niveau applicatif
    PRIMARY KEY (vehicle_id, geofence_zone_id)
);

-- 5. LOCATIONS & ALERTS
CREATE TABLE IF NOT EXISTS locations (
    id UUID PRIMARY KEY,
    vehicle_id UUID REFERENCES vehicle(id),
    position geometry(Point, 4326) NOT NULL,
    speed DOUBLE PRECISION,
    heading DOUBLE PRECISION,
    altitude DOUBLE PRECISION,
    accuracy DOUBLE PRECISION,
    source VARCHAR(255),
    timestamp TIMESTAMP DEFAULT NOW()
);

CREATE TABLE IF NOT EXISTS alert_type (
    id SERIAL PRIMARY KEY,
    type VARCHAR(50) NOT NULL UNIQUE
);

CREATE TABLE IF NOT EXISTS alert (
    id UUID PRIMARY KEY,
    type_id INTEGER REFERENCES alert_type(id),
    vehicle_id UUID REFERENCES vehicle(id),
    geofence_zone_id UUID,
    location_id UUID REFERENCES locations(id),
    message TEXT,
    timestamp TIMESTAMP DEFAULT NOW(),
    speed DOUBLE PRECISION,
    dwell_time_minutes INTEGER,
    is_read BOOLEAN DEFAULT FALSE,
    severity VARCHAR(20) DEFAULT 'INFO',
    additional_data TEXT
);