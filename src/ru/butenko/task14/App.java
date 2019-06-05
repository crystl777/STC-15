package ru.butenko.task14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class App {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите директорию для списка покупок");
        String shoppingListDirectory = reader.readLine();
        System.out.println("Введите директорию для создания кассового чека");
        String cashierCheckDirectory = reader.readLine();


        ShoppingList shoppingList = new ShoppingList(shoppingListDirectory);

        shoppingList.writeShoppingList(shoppingList);

        CheckFormatting checkFormatting = new CheckFormatting(shoppingListDirectory,
                cashierCheckDirectory);

        checkFormatting.titleCheck();
        checkFormatting.separatorText(130);
        checkFormatting.shoppingListToCheck();
        checkFormatting.separatorText(130);
        float totalCost = checkFormatting.totalCost();
        System.out.println(totalCost);
        checkFormatting.totalCostToCheck(totalCost);
    }
}

