package ru.butenko.task5.VendingMachine;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Vending {

    private HashMap<Enum, Drink> hashMap;

    public static HashMap<Enum, Drink> createMap(Keys[] keys, Drink[] drinks) {

        HashMap<Enum, Drink> map = new HashMap<>();
        for (int i = 0; i < drinks.length; i++) {
            map.put(Keys.createKeys()[i], Drinks.createGoods()[i]);
        }
        return map;
    }

    public static void checkAge() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите Ваш возраст: ");
        while (true) {
            try {
                int age = Integer.parseInt(reader.readLine());
                if (age < 18) {
                    System.out.println("Вам меньше 18 лет, использовать автомат запрещено!");
                    continue;
                }
            } catch (Exception e) {
                System.out.println("Введите число, соответствующее Вашему возрасту");
                continue;
            }
            break;
        }
    }


    public Vending(HashMap<Enum, Drink> hashMap) {
        this.hashMap = hashMap;
    }

    public HashMap<Enum, Drink> getHashMap() {
        return hashMap;
    }

    public void setHashMap(HashMap<Enum, Drink> hashMap) {
        this.hashMap = hashMap;
    }

    public void getGood(Enum key) throws IOException {

        Drink drink = hashMap.get(key);
        while (true) {
            System.out.println("Внесите деньги!");
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            int money = Integer.parseInt(reader.readLine());

            if (drink.getCost() > money) {
                System.out.println("Недостаточно денег");
                continue;
            } else System.out.println("Получите Ваш напиток!");
            break;
        }
    }

    public Enum key() throws IOException {
        System.out.println("Выберите товар, нажав соответствующую кнопку");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        return Keys.valueOf(s);
    }
}
