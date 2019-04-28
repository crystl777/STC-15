package ru.butenko.task7.person;

public class Main {

    public static void main(String[] args) {

        Sportsman sportsman = new Sportsman();
        sportsman.name("Александр");
        System.out.println(sportsman.getName());
        sportsman.profession();
        sportsman.fatigue();
        sportsman.run();
        sportsman.swim();

        Rescuer rescuer = new Rescuer();
        rescuer.name("Олег");
        System.out.println(rescuer.getName());
        rescuer.profession();
        rescuer.fatigue();
        rescuer.run();
        rescuer.swim();
    }
}
