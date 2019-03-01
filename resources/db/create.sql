CREATE TABLE book (
    id SERIAL PRIMARY KEY,
    "name" TEXT NOT NULL,
    author TEXT,
    "year" DATE,
    edition TEXT,
    genre TEXT,
    status BOOLEAN NOT NULL,
    price int
);