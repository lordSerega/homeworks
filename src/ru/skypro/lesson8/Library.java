package ru.skypro.lesson8;

public class Library {

    private Book[] books;

    public Library(int size) {
        books = new Book[size];
    }

    public boolean add(Book book) {
        for (int i = 0; i < books.length; i++) {
            if (books[i] == null) {
                books[i] = book;
                return true;
            }
        }
        return false;

    }

    //задание среднего уровня
    public void printBook(Book book) {
        String name = book.getName();
        int year = book.getYear();
        String fN = book.getAuthor().getAuthorFirstName();
        String sN = book.getAuthor().getAuthorSecondName();
        String fullAuthor = fN + " " + sN;

        String result = String.format("%s by %s was published in %d", name, fullAuthor, year);
        System.out.println(result);
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
