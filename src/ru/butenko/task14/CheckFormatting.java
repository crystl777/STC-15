package ru.butenko.task14;

import java.io.*;
import java.util.InputMismatchException;
import java.util.Scanner;

public interface CheckFormatting {

    static void formate(String source, String destination) {

        try (FileReader fr = new FileReader(source);
             Scanner sc = new Scanner(fr);
             FileWriter fw = new FileWriter(destination)) {

            String title = String.format("%-18s %-12s %-10s %12s %n", "Наименование", "Цена", "Кол-во", "Стоимость");
            float total = 0;

            StringBuilder separator = new StringBuilder("=");
            for (int i = 0; i < 130; i++) {
                separator.append("=");
                i++;
            }

            fw.write(title + (separator + "\n"));

            while (sc.hasNext()) {

                String nameOfGoog = sc.nextLine();

                float quantity = sc.nextFloat();
                float price = sc.nextFloat();

                total += quantity * price;
                sc.nextLine();

                String text = String.format("%-18s %-10.2f x %-10.2f %2s %-10.2f %n",
                        nameOfGoog, price, quantity, "=", quantity * price);
                fw.write(text);
            }
            String totalText = String.format("%-45s %-10.2f", "Итого", total);
            fw.write((separator + "\n") + totalText);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InputMismatchException e) {
            System.out.println("Программа закрылась с ошибкой : \"Вы ввели некорректные данные.\"");
            e.printStackTrace();
        }
    }
}






















