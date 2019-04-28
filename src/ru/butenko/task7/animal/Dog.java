package ru.butenko.task7.animal;

public class Dog extends Animal implements Run, Swim{
    @Override
    public void getName() {
        System.out.println("Собака!");
    }

    @Override
    public void run() {
        System.out.println("Я собака и я умею быстро бегать!");
    }

    @Override
    public void swim() {
        System.out.println("Я собака и я умею и очень люблю плавать!");
    }
}
