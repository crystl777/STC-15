package ru.butenko.task7.animal;

public class Duck extends Bird implements Fly, Swim {

    @Override
    public void getName() {
        System.out.println("Утка!");
    }

    @Override
    public void fly() {
        System.out.println("Я утка и я умею летать!");

    }

    @Override
    public void swim() {
        System.out.println("Я утка и я очень хорошо плаваю!");

    }
}
