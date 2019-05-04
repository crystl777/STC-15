package ru.butenko.task5.VendingMachine;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Vending {

    private HashMap<Keys, KindOfDrinks> hashMap;
    private int count;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public HashMap<Keys, KindOfDrinks> getHashMap() {
        return hashMap;
    }

    public void setHashMap(HashMap<Keys, KindOfDrinks> hashMap) {
        this.hashMap = hashMap;
    }


    public Vending(HashMap<Keys, KindOfDrinks> hashMap, int count) {
        this.hashMap = hashMap;
        this.count = count;
    }

    public static HashMap<Keys, KindOfDrinks> createMap (){

        HashMap<Keys, KindOfDrinks> map = new HashMap<>();

        for(int i = 0; i < Keys.values().length; i++){
            map.put(Keys.values()[i], KindOfDrinks.values()[i]);
        }
        return map;
    }

   /* public static void checkAge() {
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

    */

    public void getGoods(HashMap<Keys, KindOfDrinks> hashMap) throws IOException {

        String keys;
        int count = getCount();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        while(count > 0) {
            Vending.menu();
        while (true) {
            System.out.println("Введите Ваш возраст: ");
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



            while (true) {
                System.out.println("Выберите товар, нажав соответствующую кнопку");
                try {

                    keys = reader.readLine().toUpperCase();
                    break;
                } catch (Exception e) {
                    System.out.println("Такой кнопки не существует! Попробуйте ещё раз!");
                }

            }

            KindOfDrinks good = getHashMap().get(Keys.valueOf(keys));
            while (true) {
                System.out.println("Внесите деньги!");

                int money = Integer.parseInt(reader.readLine());

                if (good.getCost() > money) {
                    System.out.println("Недостаточно денег");
                    continue;
                } else if (good.getCost() < money) {
                    System.out.println("Получите Ваш напиток и сдачу в размере: " + (money - good.getCost()));

                    break;
                } else System.out.println("Получите Ваш напиток!");
                setCount(getCount() - 1);
                break;
            }
            count--;
        }
        System.out.println("Автомат пустой!");

    }













/*
        System.out.println("Внесите деньги");

        int money = Integer.parseInt(reader.readLine());

        KindOfDrinks good = getHashMap().get(Keys.valueOf(key));




        if (money == good.getCost()) {
            System.out.println("Получите Ваш напиток");

        } else System.out.println("Напитка нет");

 */












/*
        map.put(KindOfDrinks.valueOf("VODKA"), Keys.valueOf("A1"));
        map.put(KindOfDrinks.valueOf("GIN"), Keys.valueOf("A2"));
        map.put(KindOfDrinks.valueOf("TEQUILA"), Keys.valueOf("A3"));
        map.put(KindOfDrinks.valueOf("BRANDY"), Keys.valueOf("B1"));
        map.put(KindOfDrinks.valueOf("WHISKEY"), Keys.valueOf("B2"));



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
            } else if (drink.getCost() < money){
                System.out.println("Получите Ваш напиток и сдачу в размере: " + (money - drink.getCost()));
                break;}
            else System.out.println("Получите Ваш напиток!");
        }
    }

    public Enum key() throws IOException {
        System.out.println("Выберите товар, нажав соответствующую кнопку");
        while (true){
            try {
                BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
                String s = reader.readLine().toUpperCase();
                return Keys.valueOf(s);
            }
            catch (Exception e){
                System.out.println("Такой кнопки не существует! Попробуйте ещё раз!");
            }

        }

    }
*/

    public static void menu(){
        System.out.println("" +
                "" +
                "╔╗ ╗ ─ ╗╔ ╔╗ ╦╗ ║╔ ╔╗ ─ ─ ╗ ╔╗ ╔╗ \n" +
                "╠╣ ║ ─ ║║ ║║ ║║ ╠╣ ╠╣ ─ ─ ║ ║║ ║║ \n" +
                "║║ ╩ ─ ╚╝ ╚╝ ╩╝ ║╚ ║║ ─ ─ ╩ ╚╝ ╚╝ \n" +
                "\n" +
                "╔╗ ╔╗ ─ ╔═╗ ╦ ║║ ─ ╗ ╔═ ╔╗ \n" +
                "╠╣ ╔╝ ─ ║╔╗ ║ ╬║ ─ ║ ╠╗ ║║ \n" +
                "║║ ╚═ ─ ╚═╝ ╩ ║╬ ─ ╩ ╚╝ ╚╝ \n" +
                "\n" +
                "╔╗ ═╗ ─ ╦ ╔═ ╔╗ ╔╗╔╗ ╦ ║ ╔╗ ─ ╗ ╔╗ ╔╗ \n" +
                "╠╣ ═╣ ─ ║ ╠═ ║║ ║║║║ ║ ║ ╠╣ ─ ║ ╠╣ ║║ \n" +
                "║║ ═╝ ─ ║ ╚═ ╚╬ ╚══╝ ╩ ╚ ║║ ─ ╩ ╚╝ ╚╝ \n"+
                "\n" +
                "╦╗ ╗ ─ ╦╗ ╔╗ ╔╗ ║║ ╦╗ ║║ ─ ╗ ╔╗ ╔╗ \n" +
                "╠╣ ║ ─ ╠╣ ╠╝ ╠╣ ╬║ ║║ ╚╣ ─ ║ ╔╝ ║║ \n" +
                "╩╝ ╩ ─ ╩╝ ╠╗ ║║ ║╬ ╩╝ ═╝ ─ ╩ ║  ╚╝ \n" +
                "\n" +
                "╦╗ ╔╗ ─ ║╦║ ║║ ╦ ╔╗ ║╔ ╔═ ║║ ─ ╔╗ ╔╗ ╔╗\n"  +
                "╠╣ ╔╝ ─ ║║║ ╠╣ ║ ╚╗ ╠╣ ╠═ ╚╣ ─ ╔╝ ║║ ║║ \n" +
                "╩╝ ╚═ ─ ╚╩╝ ║║ ╩ ╚╝ ║╚ ╚═ ═╝ ─ ╚═ ╚╝ ╚╝\n");

    }
}
