package ru.butenko.task12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Library {

    private ArrayList<Book> library = new ArrayList<>();


    public ArrayList<Book> getLibrary() {
        return library;
    }

    public void setLibrary(ArrayList<Book> library) {
        this.library = library;
    }

    public void addBookToLibrary(Library library) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Book book = new Book();

        System.out.println("Введите название книги, чтобы добавить в библиотеку: ");
        book.setNameOfBook(reader.readLine());
        System.out.println("Введите инициалы и фамилию автора книги : ");
        book.setAuthorOfBook(reader.readLine());

        while (true) {
            try {
                System.out.println("Введите год издания данной книги : ");
                book.setYearOfPublishing(Integer.parseInt(reader.readLine()));

                library.getLibrary().add(book);
                break;

            } catch (NumberFormatException e) {
                System.out.println("Данный числовой формат соответствующий году издания книги не поддерживается");

            }
        }


    }

    public static void continueAddingBooks(Library library) throws IOException {

        while (true) {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            library.addBookToLibrary(library);
            System.out.println("Добавить еще книгу? (да / нет)");
            String exitOrContinue = reader.readLine().toLowerCase();
            if (exitOrContinue.equals("нет")) {
                break;
            } else continue;
        }
    }
}
