package ru.butenko.task7.animal;

public class Cat extends Animal implements Run, Swim{
    @Override
    public void getName() {
        System.out.println("Кошка!");
    }

    @Override
    public void run() {
        System.out.println("Я кошка и я умею бегать!");
    }

    @Override
    public void swim() {
        System.out.println("Я кошка и я умею плавать, но не люблю!");

    }
}
