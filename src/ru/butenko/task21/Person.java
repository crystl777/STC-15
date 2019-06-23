package ru.butenko.task21;

import java.util.*;

public class Person {

    private int age;
    private String lastName;
    private String sex;
    private static HashMap<String, Person> map = new HashMap<>();

    public Person(int age, String lastName, String sex) {
        this.age = age;
        this.lastName = lastName;
        this.sex = sex;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age &&
                lastName.equals(person.lastName) &&
                sex.equals(person.sex);
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, lastName, sex);
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", lastName='" + lastName + '\'' +
                ", sex=" + sex +
                '}';
    }

    /*  в ТЗ домашенго задания метод назывался createMap, но я решил сделать саму мапу static полем класса Person и обращаться
        к ней через геттер

     */
    public static Map<String, Person> getMap() {
        return map;
    }


    public static void printMap() {

        for (Map.Entry<String, Person> pair : Person.getMap().entrySet()) {

            String key = pair.getKey();
            Person person = pair.getValue();
            System.out.println(key + " " + person);
        }
    }

    public static void removeTheDuplicates(Map<String, Person> map) {

        Map<String, Person> copyMap = new HashMap<>(map);

        for (Map.Entry<String, Person> pair : copyMap.entrySet()) {
            int frequency = Collections.frequency(copyMap.values(), pair.getValue());
            if (frequency > 1) {
                removeItemFromMapByValue(map, pair.getValue());
            }
        }

        for (Map.Entry<String, Person> pair : map.entrySet()) {
            System.out.println(pair.getKey() + " " + pair.getValue());
        }
    }

    public static void removeItemFromMapByValue(Map<String, Person> map, Person value) {
        Map<String, Person> copy = new HashMap<>(map);
        for (Map.Entry<String, Person> pair : copy.entrySet()) {
            if (pair.getValue().equals(value))
                map.remove(pair.getKey());
        }
    }
}
