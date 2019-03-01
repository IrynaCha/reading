package com.iru.library.domain;

import java.time.LocalDate;
import java.util.Objects;

public class Book {
    private Long id;
    private LocalDate year;
    private String name;
    private String author;
    private Integer price;
    private Boolean status;
    private String edition;
    private String genre;

    public Book() {
    }

    public Book(Long id, LocalDate year, String name, String author, Integer price, Boolean status, String edition,
            String genre) {
        this.id = id;
        this.year = year;
        this.name = name;
        this.author = author;
        this.price = price;
        this.status = status;
        this.edition = edition;
        this.genre = genre;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getYear() {
        return year;
    }

    public void setYear(LocalDate year) {
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public String getEdition() {
        return edition;
    }

    public void setEdition(String edition) {
        this.edition = edition;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        if (!super.equals(o))
            return false;
        Book student = (Book) o;
        return id == student.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), id);
    }

    @Override
    public String toString() {
        return "Book [id=" + id + "]";
    }
}
