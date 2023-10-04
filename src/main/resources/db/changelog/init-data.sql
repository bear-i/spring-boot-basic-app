--liquibase formatted sql
--changeset bear_i:init-data

INSERT INTO "user" ("username", email) VALUES ('user1', 'user1@example.com');
INSERT INTO "user" ("username", email) VALUES ('user2', 'user2@example.com');

INSERT INTO pet (name, species, user_id) VALUES ('Fluffy', 'Dog', 1);
INSERT INTO pet (name, species, user_id) VALUES ('Whiskers', 'Cat', 1);
INSERT INTO pet (name, species, user_id) VALUES ('Buddy', 'Dog', 2);