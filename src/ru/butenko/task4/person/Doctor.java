package ru.butenko.task4.person;

public class Doctor extends Person {

    private int licenseNumber;
    private String typeDoctor;


    public Doctor(String name, String lastName, int age, int licenseNumber, String typeDoctor) {
        super(name, lastName, age);
        this.licenseNumber = licenseNumber;
        this.typeDoctor = typeDoctor;
    }

    public String getTypeDoctor() {
        return typeDoctor;
    }

    protected int getLicenseNumber() {
        return licenseNumber;
    }

    protected void setLicenseNumber(int licenseNumber) {
        this.licenseNumber = licenseNumber;
    }
}
