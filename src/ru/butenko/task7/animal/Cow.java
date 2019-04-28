package ru.butenko.task7.animal;

public class Cow extends Animal implements Run, Swim {
    @Override
    public void getName() {
        System.out.println("Корова!");
    }

    @Override
    public void run() {
        System.out.println("Я корова и я умею бегать, но медленно!");
    }

    @Override
    public void swim() {
        System.out.println("Я корова и я умею плавать!");
    }
}
