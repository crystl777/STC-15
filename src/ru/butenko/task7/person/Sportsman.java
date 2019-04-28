package ru.butenko.task7.person;

public class Sportsman extends Person {

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
        System.out.println("Я профессиональный спортсмен");
    }

    @Override
    public void run() {
        System.out.println("Я умею очень быстро бежать");

    }

    @Override
    public void fatigue() {
        System.out.println("Моя выносливость приносит мне победу на соревнованиях");

    }

    @Override
    public void swim() {
        System.out.println("Плаваю только для своего удовольствия");

    }
}
