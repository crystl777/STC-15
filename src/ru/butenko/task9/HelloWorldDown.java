package ru.butenko.task9;

import java.util.concurrent.ThreadLocalRandom;

public class HelloWorldDown {

    public static void main(String[] args) throws HelloWorldException {

        String s = "Hello World";
        String sNull = null;

        while (true) {   //моделирую ошибку ArrayIndexOutOfBoundsException и делаю сразу её обработку
            try {

                String[] text = new String[5];

                for (int i = 0; i < text.length; i++) {
                    text[i] = String.valueOf(s.charAt(i));
                }

                for (int i = 0; i < s.length(); i++) {
                    System.out.print(text[i]);
                }
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("\nФраза \"Hello World\" не может быть выведена полностью. " +
                        "Размер выводимого массива слишком мал. Его размер составляет: " + e.getMessage());
                break;
            }
        }

         /*моделирую NullPointerException и
        сразу же её обрабатываю*/

        try {
            System.out.println(sNull.toString());
        } catch (NullPointerException e) {
            System.out.println("Моделирование и обработка ошибки NullPointerException");
        }


        /*моделирую свою свобственную ошибку и
        пробрасываю её вверх */

        int randomNum = ThreadLocalRandom.current().nextInt(20);

        if (s.length() > randomNum) {
            System.out.println("Условие выполнено верно");
        } else {
            throw new HelloWorldException("Условие выполнено не верно");
        }
    }
}

