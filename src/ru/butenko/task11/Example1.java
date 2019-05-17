package ru.butenko.task11;

import ru.butenko.task7.animal.Run;

public class Example1 {

    public static void main(String[] args) {
        try {
            doSome();
        } catch (RuntimeException e) {
            System.out.println("Ошибка <" + e.getMessage() + "> обработана");
        }
        System.out.println("Пограмма завершена");
    }

    private static void doSome() {
        System.out.println("варю суп");
        try {
            doSomeElse();
            System.out.println("cуп готов");
        }finally {
            System.out.println("выключил плиту");
        }

        System.out.println("приглашаю всех к столу");
    }

    private static void doSomeElse() {
        throw new RuntimeException("Моя ошибка");
    }
}
