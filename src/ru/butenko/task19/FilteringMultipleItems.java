package ru.butenko.task19;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.Set;

public class FilteringMultipleItems {


    public static Set<String> removeEvenLengthString(Set<String> set) {

        Iterator<String> iterator = set.iterator();


        while (iterator.hasNext()) {

            String s = iterator.next();

            if (s.length() % 2 == 0) {
                iterator.remove();
            }
        }
        return set;
    }

    public static void addStringToSet(Set<String> set) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Напишите строку, чтобы добавить её в коллекцию");
        String s = reader.readLine();

        String[] list = s.split(",|\\s");

        for (int i = 0; i < list.length; i++) {

            set.add(list[i]);
        }
    }

    //данный метод сделал для себя, решил попробовать удалять числа с чётным количеством цифр
    public static Set<Integer> removeEvenLengthInteger(Set<Integer> set) {

        Iterator<Integer> iterator = set.iterator();

        while (iterator.hasNext()) {

            int number = iterator.next();

            int quantityOfNumeral = (number == 0) ? 1 : (int) Math.ceil(Math.log10(Math.abs(number) + 0.5));

            if (quantityOfNumeral % 2 == 0) {
                iterator.remove();
            }
        }
        return set;
    }

    public static void addIntegerToSet(Set<Integer> set) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            System.out.println("Напишите число, чтобы добавить его в коллекцию");
            Integer num = Integer.parseInt(reader.readLine());
            set.add(num);
            System.out.println("Добавить ещё? да / нет");
            String s = reader.readLine();

            if (s.equals("да")) {
                continue;
            } else if (s.equals("нет")) {
                break;
            }
        }
    }
}

