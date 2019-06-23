package ru.butenko.task17;

import java.util.ArrayList;

import java.util.Comparator;
import java.util.List;

public class App {

    public static void main(String[] args) {
        List<Person> personList = new ArrayList<>();
        personList.add(new Person("Василий", 26));
        personList.add(new Person("Николай", 47));
        personList.add(new Person("Артём", 21));
        personList.add(new Person("Ксения", 54));
        personList.add(new Person("Владимир", 63));


        System.out.println(personList);

        personList
                .sort(Comparator.comparing(Person::getName)
                        .thenComparingInt(Person::getAge));

        System.out.println(personList);

    }
}
