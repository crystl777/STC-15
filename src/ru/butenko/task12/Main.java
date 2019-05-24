package ru.butenko.task12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Library library = new Library();
        Library.continueAddingBooks(library);

        System.out.println(library.getLibrary().size());





    }


}



