package ru.butenko.task14;

public class App {

    public static void main(String[] args) {

        ShoppingList shoppingList = new ShoppingList("src/ru/butenko/task14/goods.txt");

        shoppingList.writeShoppingList(shoppingList);

        CheckFormatting.formate("src/ru/butenko/task14/goods.txt",
                "src/ru/butenko/task14/NEWgoods.txt");
    }
}


