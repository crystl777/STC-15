package ru.butenko.task2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CostOfGasoline {

    static int cost = 43;

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Введите количество литров");
        int liter = Integer.parseInt(reader.readLine());
        System.out.println(" ");
        System.out.println("Цена бензина : " + cost + " руб.");
        System.out.println("-----------");
        System.out.println("Ваша итоговая стоимость : " + costOfGasoline(liter) + " руб.");
    }

    public static double costOfGasoline (int liter){
        double costOfGasoline = liter * cost;
        return costOfGasoline;
    }
}

