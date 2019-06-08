package ru.butenko.task18;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class BasketShop implements Basket {

    private List<String> produtctsList = new ArrayList<>();

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
        for (int i = 0; i < quantity; i++) {
            getProducts().add(product);
        }

    }

    @Override
    public void removeProduct(String product) {
        getProducts().remove(product);
    }

    @Override
    public void updateProductQuantity(String product, int quantity) {
        if (getProducts().contains(product)) {
            int size = getProducts().size();

            for (int i = 0; i < size; i++) {
                if (getProducts().get(i).equals(product)) {
                    getProducts().remove(i);
                    i--;
                    size--;
                }
            }

            for (int i = 0; i < quantity; i++) {
                getProducts().add(product);
            }
        } else {
            System.out.println("Такого в списке товаров нет : (");
        }
    }

    @Override
    public void clear() {
        getProducts().clear();
    }

    @Override
    public List<String> getProducts() {
        return produtctsList;
    }

    @Override
    public int getProductQuantity(String product) {
        int productQuantity = 0;
        for (int i = 0; i < getProducts().size(); i++) {
            if (product.equals(getProducts().get(i))) {
                productQuantity++;
            }
        }
        if (productQuantity == 0) {
            System.out.println("Такого товара в корзине нет : (");
        }
        return productQuantity;
    }
}
