package ru.skypro.lesson9;


public class Main {

    public static void main(String[] args) {

        //Легкий уровень

        Author pushkin = new Author("Пушкин", "Александр");
        Book captainDaughter = new Book("Капитанская дочка", pushkin, 1841);

        Author martin = new Author("Джордж", "Мартин");
        Book gameOfThrone = new Book("Игра престолов", martin, 1996);


        gameOfThrone.setYear(1997);

        System.out.println(captainDaughter.toString());

        if (captainDaughter.equals(gameOfThrone)) {
            System.out.println("Одинаковые");
        } else {
            System.out.println("Разные");
        }



    }

}
