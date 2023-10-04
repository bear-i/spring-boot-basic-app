--liquibase formatted sql
--changeset bear_i:init-schema

CREATE TABLE IF NOT EXISTS "user" (
                                    id SERIAL PRIMARY KEY,
                                    "username" VARCHAR(255) NOT NULL,
    email VARCHAR(255) NOT NULL
    );

CREATE TABLE IF NOT EXISTS pet (
                                   id SERIAL PRIMARY KEY,
                                   name VARCHAR(255) NOT NULL,
    species VARCHAR(255) NOT NULL,
    user_id BIGINT REFERENCES "user"(id)
    );