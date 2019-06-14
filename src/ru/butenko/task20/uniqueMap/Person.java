package ru.butenko.task20.uniqueMap;

import java.util.HashMap;
import java.util.Map;

public class Person {

    private String name;
    private String surname;

    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }


    public static boolean isUnique(Map<String, String> map) {

        Map<String, Integer> result = new HashMap<>();
        boolean unique = true;

        for (Map.Entry<String, String> pair : map.entrySet()) {

            String value = pair.getValue();

            int count = result.containsKey(value) ? 1 : 0;
            result.put(value, count);
        }


        for (Map.Entry<String, Integer> pair : result.entrySet()) {

            Integer value = pair.getValue();
            if (value == 1) {
                unique = false;
            }
        }
        return unique;
    }
}



