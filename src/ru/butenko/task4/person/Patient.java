package ru.butenko.task4.person;

public class Patient extends Person {

    private String typeDisease;

    public Patient(String name, String lastName, int age, int passportNumber, String typeDisease) {
        super(name, lastName, age, passportNumber);
        this.typeDisease = typeDisease;
    }

    public String getTypeDisease() {
        return typeDisease;
    }

}
