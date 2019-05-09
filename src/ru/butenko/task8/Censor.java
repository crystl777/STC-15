package ru.butenko.task8;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Censor {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println(Censor.censor(reader.readLine()));

    }

    private static String censor(String text) {

        return text.replaceAll("([бБ])([яЯ])([кkKК])([аaAА])", "*вырезано цензурой*");
    }
}



