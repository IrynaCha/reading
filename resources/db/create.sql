CREATE TABLE book (
    id SERIAL PRIMARY KEY,
    "name" TEXT NOT NULL,
    author TEXT,
    "year" DATE,
    genre TEXT,
    edition TEXT,
    status BOOLEAN NOT NULL,
    price int
);