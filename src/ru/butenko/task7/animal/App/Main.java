package ru.butenko.task7.animal.App;

import ru.butenko.task7.animal.*;

public class Main {

    private static void canRun(Run obj){
        obj.run();
    }

    private static void canSwim(Swim obj){
        obj.swim();
    }

    private static void canFly(Fly obj){
        obj.fly();
    }

    public static void main(String[] args) {
        Animal cat = new Cat();
        Animal dog = new Dog();
        Animal cow = new Cow();
        Bird duck = new Duck();

        cat.getName();
        dog.getName();
        cow.getName();
        duck.getName();

//сделал для себя (чтобы попробовать) через кастование


        canRun(((Cat)cat));
        canRun(((Dog)dog));
        canRun(((Cow)cow));

        canFly(((Duck)duck));

        canSwim(((Cat)cat));
        canSwim(((Dog)dog));
        canSwim(((Cow)cow));
        canSwim(((Duck)duck));
    }
}
