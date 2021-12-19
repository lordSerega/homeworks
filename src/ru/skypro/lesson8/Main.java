package ru.skypro.lesson8;


public class Main {

    private static void add(Book[] books, Book newBook) {

        for (int i = 0; i < books.length; i++) {
            if (books[i] == null) {
                books[i] = newBook;
             break;
            }

        }

    }


    public static void print(Book book) {
        String name = book.getName();
        int year = book.getYear();
        String fN = book.getAuthor().getAuthorFirstName();
        String sN = book.getAuthor().getAuthorSecondName();
        System.out.println("Книга: " + name + "; Автор: " + fN + " " + " " + sN + "; Год издания: " + year);

    }

    public static void main(String[] args) {

        //Легкий уровень

        Author pushkin = new Author("Пушкин", "Александр");
        Book captainDaughter = new Book("Капитанская дочка", pushkin, 1841);

        Author martin = new Author("Джордж", "Мартин");
        Book gameOfThrone = new Book("Игра престолов", martin, 1996);


        gameOfThrone.setYear(1997);

        //средний уровень
        System.out.println("Средний уровень: ");

        Book[] books = new Book[3];

        add(books, captainDaughter);
        add(books, gameOfThrone);

        for (Book book : books) {
            if(book != null) {
                print(book);
            }
        }

        //сложный уровень
        System.out.println("Сложный уровень");

        BooksCollection booksCollection = new BooksCollection(2);

        booksCollection.add(captainDaughter);
        booksCollection.add(gameOfThrone);
        booksCollection.printBook(captainDaughter);
        booksCollection.printBookByName("Игра престолов");
        booksCollection.changeBookYearByName("Игра престолов", 1998);
        booksCollection.printBookByName("Игра престолов");





    }

}
