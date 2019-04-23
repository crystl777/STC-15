package ru.butenko.task4.building;

import ru.butenko.task4.person.Person;

import java.util.ArrayList;

public class ChildrenHospital {

    private String name;
    private ArrayList<Person> patients = new ArrayList<>();
    private ArrayList<Person> doctors = new ArrayList<>();

    public ArrayList<Person> getPatient() {
        return patients;
    }

    public ArrayList<Person> getDoctor() {
        return doctors;
    }

    public ChildrenHospital(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void addChildrenPatient (Person patientChild) {

        if (patientChild.getAge() < 18){
            patients.add(patientChild);
        }
        else System.out.println("Пациенту больше 18 лет, необходимо внести его в AdultHospital");
    }

    public void addDoctor (Person doctorHospital) {

        doctors.add(doctorHospital);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(name).append("\n").append("содержит пациентов: ").append("\n");

        for (Person patient : patients) {
            sb.append(patient).append("\n");
        }
        sb.append("содержит докторов: ").append("\n");
        for (Person doctor : doctors) {
            sb.append(doctor).append("\n");
        }
        return sb.toString();
    }
}

