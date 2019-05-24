package ru.butenko.task12;

import java.io.*;
import java.util.ArrayList;

public class Library implements Serializable {
    /*
    не стал делать ввод директории через консоль, решил просто создать static final переменную с указанием
    директории сохранения библиотеки. в дальнейшем можно будет просто сделать ввод директории через консоль,
    если нужно будет создавать и загружать несколько библиотек
    в некторых методах в аргументах указано String значение (путь до библиотеки) - это сделано как раз на тот случай,
    если потом уберу static final и будет возможность самому через консоль вводить путь
     */
    public static final String directory = "src/ru/butenko/task12/Library/library.bin";

    private ArrayList<Book> library = new ArrayList<>();


    public ArrayList<Book> getLibrary() {
        return library;
    }

    public void setLibrary(ArrayList<Book> library) {
        this.library = library;
    }

    //метод, добавляющий книги в заданную библиотеку, которая подаётся на вход в аргументах метода
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

    /*
      метод, включающий в себя добавление книг в библиотеку в цикле, если пользователь хочет добавить
    больше одной книги в библиотеку.
     */
    public static void continueAddingBooks(Library library) throws IOException {

        while (true) {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            library.addBookToLibrary(library);

            System.out.println("Добавить еще книгу? (да / нет)");
            String exitOrContinue = reader.readLine().toLowerCase();

            if (exitOrContinue.equals("нет")) {
                break;
            } else if (exitOrContinue.equals("да")) {
                continue;
            } else {
                System.out.println("вы ввели неккореткную информацию");
                break;
            }
        }
    }

    //метод, записывающий библиотеку в бинарный файл
    public static void saveLibrary(Library library, String resources) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(resources))) {
            oos.writeObject(library);
        } catch (IOException e) {
            e.printStackTrace();
            e.getMessage();
        }
    }

    //метод, читающий библиотеку с бинарного файла
    public static Library loadLibrary(String resource) throws IOException, ClassNotFoundException {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(resource))) {
            return (Library) ois.readObject();
        }
    }

    //метод, возвращающий из бинарного файла библиотеку как объект класса Library
    public static Library chechBookFromLibrary(String destination) throws IOException {

        Library library = null;

        try (InputStream is = new FileInputStream(destination);
             ObjectInputStream ois = new ObjectInputStream(is)) {

            library = (Library) ois.readObject();

        } catch (ClassNotFoundException e) {
            e.getMessage();
            e.printStackTrace();
        }
        return library;
    }


    public static void workWithLibrary(String resources) throws IOException {


        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Чтобы посмотреть количество книг в библиотеке - введите 1");
        System.out.println("Чтобы посмотреть данные по книгам в библиотеке - введите 2");

        String choice = reader.readLine();

        if (choice.equals("1")) {
            System.out.println(
                    Library.chechBookFromLibrary(resources).
                            getLibrary().
                            size());

        } else if (choice.equals("2")) {

            int size = Library.chechBookFromLibrary(resources).
                    getLibrary().
                    size();

            for (int i = 0; i < size; i++) {
                System.out.println("Название книги № " + i + 1 + " " +
                        Library.chechBookFromLibrary(resources).
                                getLibrary().get(i).getNameOfBook());
                System.out.println("Автор книги № " + i + 1 + " " +
                        Library.chechBookFromLibrary(resources).
                                getLibrary().get(i).getAuthorOfBook());
                System.out.println("Год издания книги № " + i + 1 + " " +
                        Library.chechBookFromLibrary(resources).
                                getLibrary().get(i).getYearOfPublishing());

            }
        } else {
            System.out.println("Вы ввели некорректное значение");
        }
    }
}

