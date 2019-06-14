package ru.butenko.task20.basket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BasketShop implements Basket {

    private Map<String, Integer> map = new HashMap<>();

    public Map<String, Integer> getMap() {
        return map;
    }

    public String nameOfProduct() {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name = "";
        try {
            System.out.println("Введите название товара");
            name = reader.readLine();
        } catch (IOException e) {
            e.getMessage();
            e.printStackTrace();
        }
        return name;
    }

    public int quantityOfGoods() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int quantity = 0;

        try {
            System.out.println("Введите количество товара");
            quantity = Integer.parseInt(reader.readLine());
        } catch (IOException e) {
            e.getMessage();
            e.printStackTrace();
        } catch (NumberFormatException e) {
            e.getStackTrace();
            System.out.println("Вы ввели некорректные данные");
        }
        return quantity;
    }

    @Override
    public void addProduct(String product, int quantity) {

            getMap().put(product, quantity);
    }

    @Override
    public void removeProduct(String product) {
        getMap().remove(product);
    }

    @Override
    public void updateProductQuantity(String product, int quantity) {
       getMap().put(product, quantity);
    }

    @Override
    public void clear() {

        getMap().clear();

    }

    @Override
    public List<String> getProducts() {

        List<String> list = new ArrayList<>();

        for(Map.Entry<String, Integer> pair : getMap().entrySet()){
           list.add(pair.getKey());
        }
        return list;
    }

    @Override
    public int getProductQuantity(String product) {

        return  getMap().get(product);
    }
}
