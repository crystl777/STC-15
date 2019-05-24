package ru.butenko.task12;

import ru.butenko.task5.VendingMachine.Vending;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));


        //при запуске приложения загружаем библиотеку
        try{
            Library.loadLibrary(Library.directory);
        } catch (ClassNotFoundException e){
            e.getMessage();
        } catch (FileNotFoundException e){
            e.getMessage();
            System.out.println("Не возможно найти файл для загрузки библиотеки");
        }

        //создаём новую библиотеки и добавляем через консоль туда книги
        Library library = new Library();
        Library.continueAddingBooks(library);

        System.out.println(library.getLibrary().size());

        //сохраняем библиотеку в бинарный файл
        Library.saveLibrary(library, Library.directory);

        Library.workWithLibrary(Library.directory);

    }
}



