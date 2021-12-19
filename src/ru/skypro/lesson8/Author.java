package ru.skypro.lesson8;

public class Author {
     String firstName;
     String secondName;

    public Author(String firstName, String secondName) {
        this.firstName = firstName;
        this.secondName = secondName;
    }



    public  String getAuthorFirstName(){
        return this.firstName;
    }

    public String getAuthorSecondName(){
        return this.secondName;
    }
}
