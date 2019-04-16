package ru.butenko.task3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class MinimalNumber {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите два числа");

        int firstNumber = Integer.parseInt(reader.readLine());
        int secondNumber = Integer.parseInt(reader.readLine());

        minimalNumber(firstNumber, secondNumber);


    }

    public static void minimalNumber(int firstNumber, int secondNumber) {
        if (firstNumber < secondNumber) {
            System.out.println("Минимальное число из двух введённых это " + "\"" + firstNumber + "\"");
        }
        else if (firstNumber == secondNumber) {
            System.out.println("Первое введённое число " + "\"" + firstNumber + "\"" + " равно второму введённому числу "
                    + "\"" + secondNumber + "\"");
        }
        else {
            System.out.println("Минимальное число из двух введённых это " + "\"" + secondNumber + "\"");
        }

    }
}
