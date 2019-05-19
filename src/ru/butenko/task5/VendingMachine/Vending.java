package ru.butenko.task5.VendingMachine;

import com.sun.xml.internal.bind.v2.TODO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Vending {

private static final Logger logger = LoggerFactory.getLogger(Vending.class.getName());


    private HashMap<Keys, KindOfDrinks> goodsList;
    private int count;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public HashMap<Keys, KindOfDrinks> getGoodsList() {
        return goodsList;
    }

    public void setGoodsList(HashMap<Keys, KindOfDrinks> goodsList) {
        this.goodsList = goodsList;
    }

    public Vending(HashMap<Keys, KindOfDrinks> goods, int count) {
        this.goodsList = goods;
        this.count = count;
    }

    public static HashMap<Keys, KindOfDrinks> createMap (){

        HashMap<Keys, KindOfDrinks> map = new HashMap<>();

        for(int i = 0; i < Keys.values().length; i++){
            map.put(Keys.values()[i], KindOfDrinks.values()[i]);
        }
        return map;
    }


    public static void checkAge() throws IOException {

        logger.info("Запуск метода проверки возраста");

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            System.out.println("Введите Ваш возраст: ");
            try {
                int age = Integer.parseInt(reader.readLine());
                if (age < 18) {
                    System.out.println("Вам меньше 18 лет, использовать автомат запрещено!");
                    break;
                }
            } catch (NumberFormatException e) {
                System.out.println("Введите число, соответствующее Вашему возрасту");
                continue;
            }
            break;
        }
    }



    public void getGoods() throws IOException {

        logger.info("Запуск метода вноса денег и выдачи товара");


        String keys;
        int count = getCount();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        while(count > 0) {
            Vending.checkAge();
            Vending.menu();

            while (true) {
                System.out.println("Выберите товар, нажав соответствующую кнопку");
                try {

                    keys = reader.readLine().toUpperCase();
                    Keys.valueOf(keys);
                    break;
                } catch (IllegalArgumentException e) {
//TODO   добавил логгер на случай некорректного ввода кнопки
                    logger.error(e.getMessage(), e);
                    System.out.println("Такой кнопки не существует! Попробуйте ещё раз!");
                }

            }

            KindOfDrinks good = getGoodsList().get(Keys.valueOf(keys));
            while (true) {
                System.out.println("Внесите деньги!");

                try {
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
                } catch (NumberFormatException e) {
//TODO   добавил логгер на случай некорректного ввода значения денег
                    //TODO отриц число
                    logger.error(e.getMessage(), e);
                    System.out.println("Введённый формат данных не поддерживается! Попробуйте ещё раз.");
                }
            }
            count--;

        }
        System.out.println("" +
                "████████████████████████████████████\n" +
                "█────█────██───█────█─███─█────█───█\n" +
                "█─██─█─██──██─██─██─█──█──█─██─██─██\n" +
                "█────█────███─██─██─█─█─█─█────██─██\n" +
                "█─██─█─██──██─██─██─█─███─█─██─██─██\n" +
                "█─██─█────███─██────█─███─█─██─██─██\n" +
                "████████████████████████████████████\n" +
                "█████████████████████████──████\n" +
                "█────█─█─█────█───█────█─██─█─█\n" +
                "█─██─█─█─█─██─██─██─██─█─██─█─█\n" +
                "█─██─█───█─█████─██─██─█─█──█─█\n" +
                "█─██─███─█─██─██─██─██─█──█─███\n" +
                "█─██─█───█────██─██────█─██─█─█\n" +
                "███████████████████████████████\n" +
                "█\n" +
                "█\n" +
                "█\n" +
                "█\n" +
                "█\n" +
                "█\n" +
                "█\n" +
                "█████████████████████████████████████████████████████\n" +
                "█─██─█───█────█────█──█──█────██───██─██─█─███─█────█\n" +
                "█─██─█─███─██─█─█████───██─██─██─█─██─██─█──█──█─██─█\n" +
                "█────█───█─██─█────███─███─██─██─█─██─█──█─█─█─█─██─█\n" +
                "█─██─█─███─██─█─██─██───██─██─█─────█──█─█─███─█─██─█\n" +
                "█─██─█───█────█────█──█──█────█─███─█─██─█─███─█────█\n" +
                "█████████████████████████████████████████████████████\n" +
                "█████████████████████████████████████████████████████████████████████████\n" +
                "█────█────█────█────███──█─██─█─██─█───█─█████───█────█────██────█────█─█\n" +
                "█─██─█─██─█─██─█─██─██─█─█─██─█─██─██─██─██████─██─██─█─██──█─██─█─██─█─█\n" +
                "█─██─█─██─█─██─█─██─█─██─█────█─█──██─██────███─██─██─█────██────█────█─█\n" +
                "█─██─█─██─█─██─█─██─█─██─█─██─█──█─██─██─██─███─██─██─█─██──█─██─█─██████\n" +
                "█─██─█────█─██─█────█─██─█─██─█─██─██─██────███─██────█────██─██─█─████─█\n" +
                "█████████████████████████████████████████████████████████████████████████\n");

    }

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
