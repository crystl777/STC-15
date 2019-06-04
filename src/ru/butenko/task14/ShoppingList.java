package ru.butenko.task14;

import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ShoppingList {

    private Path path;

    public ShoppingList(String directory) {
        path = Paths.get(directory);
    }

    public Path getPath() {
        return path;
    }

    public void setPath(Path path) {
        this.path = path;
    }

    public void writeShoppingList(ShoppingList shoppingList) {

        boolean stop = true;
        String newLine = "\n";

        try (FileWriter fw = new FileWriter(shoppingList.getPath().toFile());
             BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            while (stop) {

                System.out.println("Введите название товара");
                String nameOfGood = reader.readLine() + newLine;
                fw.write(nameOfGood);
                System.out.println("Введите количество товара");
                String quantityOdGoods = reader.readLine() + newLine;
                fw.write(quantityOdGoods);
                System.out.println("Введите цену товара");
                String priceOfGood = reader.readLine() + newLine;
                fw.write(priceOfGood);
                while (true) {
                    System.out.println("Ввести новый товар? (да / нет)");
                    String newGood = reader.readLine().toLowerCase();
                    if (newGood.equals("да")) {
                        break;
                    } else if (newGood.equals("нет")) {
                        stop = false;
                        break;
                    } else {
                        System.out.println("Введите либо \"да\", либо \"нет\"");
                        continue;
                    }
                }
            }
        } catch (IOException e) {
            System.out.println("Вы ввели некорректные данные при создании создании списка покупок");
            e.printStackTrace();
        }
    }
}
