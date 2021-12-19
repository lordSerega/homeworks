package ru.skypro.lesson9;

import java.util.Objects;

public class Book {
    private String name;
    private Author author;
    private int year;



    public Book(String name, Author author, int year) {
        this.name = name;
        this.year = year;
        this.author = author;

    }

    public Author getAuthor(){
        return author;
    }

    public String getName(){
        return this.name;
    }

    public int getYear(){
        return this.year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author=" + author +
                ", year=" + year +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return year == book.year && name.equals(book.name) && author.equals(book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, author, year);
    }
}

