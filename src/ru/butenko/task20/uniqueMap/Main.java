package ru.butenko.task20.uniqueMap;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        Map<String, String> map = new HashMap<>();


        Person pernson1 = new Person("Дмитрий", "Иванов");
        map.put(pernson1.getName(), pernson1.getSurname());

        Person pernson2 = new Person("Алексей", "Петров");
        map.put(pernson2.getName(), pernson2.getSurname());

        Person pernson3 = new Person("Егор", "Саврасенко");
        map.put(pernson3.getName(), pernson3.getSurname());

        Person pernson4 = new Person("Василий", "Марченков");
        map.put(pernson4.getName(), pernson4.getSurname());

        Person pernson5 = new Person("Станислав", "Семёнов");
        map.put(pernson5.getName(), pernson5.getSurname());

        Person pernson6 = new Person("Александр", "Молоков");
        map.put(pernson6.getName(), pernson6.getSurname());

        Person pernson7 = new Person("Олег", "Самсонов");
        map.put(pernson7.getName(), pernson7.getSurname());

        Person pernson8 = new Person("Евгений", "Онегин");
        map.put(pernson8.getName(), pernson8.getSurname());

        Person pernson9 = new Person("Руслан", "Лысенко");
        map.put(pernson9.getName(), pernson9.getSurname());

        Person pernson10 = new Person("Юрий", "Марченков");
        map.put(pernson10.getName(), pernson10.getSurname());


        System.out.println(Person.isUnique(map));
    }
}
