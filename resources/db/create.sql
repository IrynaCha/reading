CREATE TABLE book (
    id SERIAL PRIMARY KEY,
    "year" DATE,    
    "name" TEXT NOT NULL,
    author TEXT,
    price int, 
    status BOOLEAN NOT NULL,
    edition TEXT,
    genre TEXT
);