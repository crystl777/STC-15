package ru.butenko.task4.building;

import ru.butenko.task4.person.Patient;
import ru.butenko.task4.person.Person;

import java.util.ArrayList;

public class AdultHospital {

    private String name;
    private ArrayList<Person> patient = new ArrayList<>();
    private ArrayList<Person> doctor = new ArrayList<>();

    public AdultHospital(String name) {
        this.name = name;
    }

    public ArrayList<Person> getPatient() {
        return patient;
    }

    public ArrayList<Person> getDoctor() {
        return doctor;
    }

    public String getName() {
        return name;
    }

    public void addPatient (Person patientAdult) {

        if (patientAdult.getAge() > 18){
            patient.add(patientAdult);
        }
        else System.out.println("Пациенту меньше 18 лет, необходимо внести его в ChildrenHospital");
    }

    public void addDoctor (Person doctorHospital) {

        doctor.add(doctorHospital);
    }

    public int countDoctor (AdultHospital hospital){

        return hospital.getDoctor().size();
    }

    public int countPatient (AdultHospital hospital){
        return hospital.getPatient().size();
    }
}
