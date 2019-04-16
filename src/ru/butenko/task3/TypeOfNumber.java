package ru.butenko.task3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TypeOfNumber {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите число");

        whatTypeOfNumber(Integer.parseInt(reader.readLine()));

    }

    public static void whatTypeOfNumber(int number) {

        System.out.println("Введённое число " + (number % 2 == 0 ? "чётное " : "нечётное ") +
                (number > 0 ? "положительное" : number < 0 ? "отрицательное" : "ноль"));
    }
}




