package ru.butenko.task14;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class CheckFormatting {
    private String shoppingListDirectory;
    private String cashierCheckDirectory;

    public CheckFormatting(String shoppingListDirectory, String cashierCheckDirectory) {
        this.shoppingListDirectory = shoppingListDirectory;
        this.cashierCheckDirectory = cashierCheckDirectory;
    }

    public String getShoppingListDirectory() {
        return shoppingListDirectory;
    }

    public void setShoppingListDirectory(String shoppingListDirectory) {
        this.shoppingListDirectory = shoppingListDirectory;
    }

    public String getCashierCheckDirectory() {
        return cashierCheckDirectory;
    }

    public void setCashierCheckDirectory(String cashierCheckDirectory) {
        this.cashierCheckDirectory = cashierCheckDirectory;
    }


    public void titleCheck() throws IOException {
        try (FileWriter fw = new FileWriter(getCashierCheckDirectory(), true)) {
            String title = String.format("%-18s %-12s %-10s %12s %n", "Наименование", "Цена", "Кол-во", "Стоимость");
            fw.write(title);
        }
    }

    public void separatorText(int counterOfSeparators) throws IOException {
        try (FileWriter fw = new FileWriter(getCashierCheckDirectory(), true)) {

            StringBuilder separator = new StringBuilder("=");
            for (int i = 0; i < counterOfSeparators; i++) {
                separator.append("=");
                i++;
            }
            fw.write(separator.toString() + "\n");
        }
    }

    public void shoppingListToCheck() {
        try (FileReader fr = new FileReader(getShoppingListDirectory());
             Scanner sc = new Scanner(fr);
             FileWriter fw = new FileWriter(getCashierCheckDirectory(), true)) {
            while (sc.hasNext()) {

                String nameOfGoog = sc.nextLine();

                float quantity = sc.nextFloat();
                float price = sc.nextFloat();
                sc.nextLine();

                String text = String.format("%-18s %-10.2f x %-10.2f %2s %-10.2f %n",
                        nameOfGoog, price, quantity, "=", quantity * price);
                fw.write(text);
            }
        } catch (InputMismatchException e) {
            System.out.println("Программа закрылась с ошибкой : \"Вы ввели некорректные данные.\"");
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            System.out.println("Файл не был найден");
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public float totalCost() {
        float total = 0;
        try (FileReader fr = new FileReader(getShoppingListDirectory());
             Scanner sc = new Scanner(fr)) {

            while (sc.hasNext()) {

                sc.nextLine();

                float quantity = sc.nextFloat();
                float price = sc.nextFloat();

                total += quantity * price;
                sc.nextLine();
            }

        } catch (FileNotFoundException e) {
            System.out.println("Файл не был найден");
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InputMismatchException e) {
            System.out.println("Вы ввели некорректные данные при создании создании списка покупок");
        }
        return total;
    }


    public void totalCostToCheck(float totalCost) throws IOException {
        try (FileWriter fw = new FileWriter(getCashierCheckDirectory(), true)) {
            String totalText = String.format("%-45s %-10.2f %n %n %n", "Итого ", totalCost);
            fw.write(totalText);
        }
    }
}


