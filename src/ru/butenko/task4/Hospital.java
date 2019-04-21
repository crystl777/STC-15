package ru.butenko.task4;

import ru.butenko.task4.building.AdultHospital;
import ru.butenko.task4.building.ChildrenHospital;
import ru.butenko.task4.person.Doctor;
import ru.butenko.task4.person.Patient;
public class Hospital {

    public static void main(String[] args) {

       /* не стал делать ввод с клавиатуры данных по госпиталям, докторам и пациентам. решил пока создать просто
       объекты каждого класса
        */

        AdultHospital hospital_1 = new AdultHospital("главном военном клиническом госпитале" +
                " имени Н. Н. Бурденко");
        AdultHospital hospital_2 = new AdultHospital("госпитале для ветеранов войн №1 департамента" +
                " здравоохранения города Москвы");

        ChildrenHospital childHospital_1 = new ChildrenHospital("детской городской клинической" +
                " больнице святого Владимира");


        Patient patient_1 = new Patient("Алексей", "Иванов", 25, 568790,
                "ОРВИ");

        Patient patient_2 = new Patient("Владимир", "Петров", 34, 983209,
                "пищевая интоксикация");

        Patient patient_3 = new Patient("Николай", "Семёнов", 16, 658712,
                "диатез");

        Doctor doctor_1 = new Doctor("Анатолий", "Пантилеев", 48, 5677,
                "врач общей практики");

        Doctor doctor_2 = new Doctor("Алексей", "Митрофанов", 56, 994567,
                "хирург");

        Doctor doctor_3 = new Doctor("Кирилл", "Кузнецов", 47, 754490,
                "педиатр");


       hospital_1.addPatient(patient_1);
       hospital_2.addPatient(patient_2);
       hospital_1.addDoctor(doctor_1);
       hospital_2.addDoctor(doctor_2);
       childHospital_1.addChildrenPatient(patient_3);
       childHospital_1.addDoctor(doctor_3);

        System.out.println("На данный момент в Вашей базе имеется : ");
        System.out.println(" ");

        System.out.println("В " + hospital_1.getName() + " работает " + hospital_1.countDoctor(hospital_1) + " " +
                doctor_1.getTypeDoctor() + " и содежится " + hospital_1.countPatient(hospital_1) + " пациент" +
                " с заболеванием " + patient_1.getTypeDisease());

        System.out.println(" ");

        System.out.println("В " + hospital_2.getName() + " работает " + hospital_2.countDoctor(hospital_1) + " " +
                doctor_2.getTypeDoctor() + " и содежится " + hospital_2.countPatient(hospital_2) + " пациент" +
                " с заболеванием " + patient_2.getTypeDisease());

        System.out.println(" ");

        System.out.println("В " + childHospital_1.getName() + " работает " +
                childHospital_1.countDoctor(childHospital_1) + " " +
                doctor_3.getTypeDoctor() + " и содежится " + childHospital_1.countPatient(childHospital_1) +
                " пациент" + " с заболеванием " + patient_3.getTypeDisease());


    }
}
