CREATE DATABASE library;

CREATE USER postgres WITH ENCRYPTED PASSWORD '0000';

GRANT ALL PRIVILEGES ON DATABASE library TO postgres;
