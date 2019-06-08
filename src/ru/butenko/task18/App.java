package ru.butenko.task18;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class App {

    public static void main(String[] args) {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BasketShop basketShop = new BasketShop();

        while (true) {

            try {
                basketShop.addProduct(basketShop.nameOfProduct(), basketShop.quantityOfGoods());


                System.out.println("Добавить ещё товар? да / нет");
                String choiseOfAdding = reader.readLine();

                if (choiseOfAdding.equals("да")) {
                    continue;
                } else if (choiseOfAdding.equals("нет")) {
                    break;
                } else {
                    System.out.println("Вы ввели некорректные данные");
                    break;
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        System.out.println("смотрим, какие товары есть в корзине");
        System.out.println(basketShop.getProducts());
        System.out.println("----------------------");

        System.out.println("теперь посмотрим сколько товаров одного наименования есть в корзине");
        System.out.println(basketShop.getProductQuantity(basketShop.nameOfProduct()));
        System.out.println("----------------------");

        System.out.println("попробуем поменять количество товара определённого наименования ");
        basketShop.updateProductQuantity(basketShop.nameOfProduct(), basketShop.quantityOfGoods());

        System.out.println("снова посмотрим, сколько теперь товаров одного наименования есть в корзине");
        System.out.println(basketShop.getProductQuantity(basketShop.nameOfProduct()));
        System.out.println("----------------------");

        System.out.println("теперь удаляем все товары из корзины...");
        System.out.println("********************");
        basketShop.clear();
        System.out.println("... и выводим содержимое корзины ещё раз :");
        System.out.println(basketShop.getProducts());
    }
}
