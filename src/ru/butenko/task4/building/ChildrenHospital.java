package ru.butenko.task4.building;

import ru.butenko.task4.person.Person;

import java.util.ArrayList;

public class ChildrenHospital {

    private String name;
    private ArrayList<Person> patient = new ArrayList<>();
    private ArrayList<Person> doctor = new ArrayList<>();

    public ArrayList<Person> getPatient() {
        return patient;
    }

    public ArrayList<Person> getDoctor() {
        return doctor;
    }

    public ChildrenHospital(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void addChildrenPatient (Person patientChild) {

        if (patientChild.getAge() < 18){
            patient.add(patientChild);
        }
        else System.out.println("Пациенту больше 18 лет, необходимо внести его в AdultHospital");
    }

    public void addDoctor (Person doctorHospital) {

        doctor.add(doctorHospital);
    }

    public int countDoctor (ChildrenHospital hospital){

        return hospital.getDoctor().size();
    }

    public int countPatient (ChildrenHospital hospital){
        return hospital.getPatient().size();
    }
}
