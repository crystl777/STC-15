package ru.butenko.task4.person;

public abstract class Person {

    private String name;
    private String lastName;
    private int age;
    private int passportNumber;

    public Person(String name, String lastName, int age, int passportNumber) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.passportNumber = passportNumber;
    }

    public Person(String name, String lastName, int age) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getPassportNumber() {
        return passportNumber;
    }

    public void setPassportNumber(int passportNumber) {
        this.passportNumber = passportNumber;
    }


    @Override
    public String toString() {
        return "{Имя'" + name + '\'' +
                ", Фамилия'" + lastName + '\'' +
                ", Возраст'" + age + '\'' +
                ", Номер паспорта'" + passportNumber + '\'' +
                '}';
    }
}
