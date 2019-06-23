package ru.butenko.task21;

public class Main {

    public static void main(String[] args) {

        Person person1 = new Person(29, "Иванов", "male");
        Person person2 = new Person(46, "Петров", "male");
        Person person3 = new Person(27, "Петрова", "female");
        Person person4 = new Person(18, "Тихонова", "female");
        Person person5 = new Person(29, "Самсонова", "female");

        Person.getMap().put("Key1", person1);
        Person.getMap().put("Key2", person2);
        Person.getMap().put("Key3", person3);
        Person.getMap().put("Key4", person4);
        Person.getMap().put("Key5", person5);
        //дубликат#1
        Person.getMap().put("Key6", person1);
        //дубликат#2
        Person.getMap().put("Key8", person2);
        //дубликат#3
        Person.getMap().put("Key7", person3);

        Person.printMap();

        System.out.println("-------------------------------");

        Person.removeTheDuplicates(Person.getMap());

    }
}
