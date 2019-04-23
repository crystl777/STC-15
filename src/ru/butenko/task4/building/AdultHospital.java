package ru.butenko.task4.building;

import ru.butenko.task4.person.Patient;
import ru.butenko.task4.person.Person;

import java.util.ArrayList;
import java.util.Arrays;

public class AdultHospital {

    private String name;
    private ArrayList<Person> patients = new ArrayList<>();
    private ArrayList<Person> doctors = new ArrayList<>();


    public AdultHospital(String name) {
        this.name = name;
    }

    public void addPatient (Person patientAdult) {

        if (patientAdult.getAge() > 18){
            patients.add(patientAdult);
        }
        else System.out.println("Пациенту меньше 18 лет, необходимо внести его в ChildrenHospital");
    }

    public void addDoctor (Person doctorHospital) {

        doctors.add(doctorHospital);
    }

    public String  getPatient(ArrayList<Person> patient) {
        return Arrays.toString(patients.toArray());
    }

    public ArrayList<Person> getDoctor() {
        return doctors;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        String resPat = "";
        for (int i = 0; i < patients.size(); i++) {
           resPat += patients.get(i) + "\n";
        }

        String resDoc = "";
        for (int i = 0; i < doctors.size(); i++) {
            resDoc += doctors.get(i) + "\n";
        }

        return name + "\n" + "содержит пациентов:" + "\n" + resPat +
                "содержит докторов: " + resDoc;

    }
}
