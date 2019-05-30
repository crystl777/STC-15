package ru.butenko.task14;

import java.io.*;
import java.util.InputMismatchException;
import java.util.Scanner;

public interface CheckFormatting {

    static void formate(String source, String destination) {

        try (FileReader fr = new FileReader(source);
             Scanner sc = new Scanner(fr);
             FileWriter fw = new FileWriter(destination)) {

            String title = String.format("%-10s %10s %10s %16s %n", "Наименование", "Цена", "Кол-во", "Стоимость");

            StringBuilder separator = new StringBuilder("=");
            for (int i = 0; i < 99; i++) {
                separator.append("=");
                i++;
            }

            fw.write(title + (separator + "\n"));

            while (sc.hasNext()) {

                String nameOfGoog = sc.nextLine();

                float quantity = sc.nextFloat();
                float price = sc.nextFloat();
                sc.nextLine();

                String text = String.format("%-18s %-4.2f x %5.2f %10s %.2f %n",
                        nameOfGoog, price, quantity, "=", quantity * price);
                fw.write(text);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InputMismatchException e) {
            System.out.println("Программа закрылась с ошибкой : \"Вы ввели некорректные данные.\"");
            e.printStackTrace();
        }
    }
}






















