package ru.skypro.lesson8;

public class BooksCollection {

    private Book[] books;

    public BooksCollection(int size) {
        books = new Book[size];
    }

    public void add(Book book) {
        for (int i = 0; i < books.length; i++) {
            if (books[i] == null) {
                books[i] = book;
                break;
            }

        }

    }

    //задание среднего уровня
    public void printBook(Book book) {
        String name = book.getName();
        int year = book.getYear();
        String fN = book.getAuthor().getAuthorFirstName();
        String sN = book.getAuthor().getAuthorSecondName();
        System.out.println("Книга: " + name + "; Автор: " + fN + " " + " " + sN + "; Год издания: " + year);
    }

    public void printBookByName(String bookName) {
        for (Book book : books) {
            if (book != null && book.getName().equals(bookName)) {
                printBook(book);
                return;
            }

        }
    }

    public boolean changeBookYearByName(String bookName, int newYear) {
        for (Book book : books) {
            if (book != null && book.getName().equals(bookName)) {
                book.setYear(newYear);
                return true;
            }

        }
        return false;
    }


}
