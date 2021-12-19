package ru.skypro.lesson8;

public class Book {
    private String name;
    private Author author;
    private int year;

    public Book(String name, Author author,  int year) {
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
}

