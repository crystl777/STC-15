package ru.butenko.task10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Mother {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Child son = new Child();

        Mother.printFoodList();

        while (true) {

            try {
                String food = reader.readLine().toUpperCase();
                try {
                    son.сhildEating(Food.valueOf(food));
                } catch (FoodException e) {
                    System.out.println(e.getMessage());
                }
                break;
            } catch (IllegalArgumentException e) {
                System.out.println("Вы ввели некорректное название еды. Введите ещё раз нужное блюдо из списка");
            }
        }
    }

    public static void printFoodList(){
        System.out.println("Чем будете кормить ребенка?\n");
        for (int i = 0; i < 5; i++) {
            System.out.println(Food.values()[i]);
        }
    }
}
