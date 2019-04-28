package ru.butenko.task7.person;

public class Rescuer extends Person {

    private String name;

    public String getName() {
        return name;
    }

    @Override
    public void name(String name) {
        this.name = name;
    }

    @Override
    public void profession() {
        System.out.println("Я спасатель");

    }

    @Override
    public void run() {
        System.out.println("Я умею быстро бегать, если это понадобится");

    }

    @Override
    public void fatigue() {
        System.out.println("Каждый месяц я сдаю нормативы по физической подготовке");

    }

    @Override
    public void swim() {
        System.out.println("Плаваю для поддержания физической выносливости");

    }
}
