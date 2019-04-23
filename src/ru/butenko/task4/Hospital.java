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

       /* уже после создание классов AdultHospital и ChildrenHospital понял, что проще было бы создать один
       родителький класс, и расширить его этими двумя
        */

        AdultHospital hospital_1 = new AdultHospital("Главный военный клинический госпиталь" +
                " имени Н. Н. Бурденко");
        AdultHospital hospital_2 = new AdultHospital("Госпиталь для ветеранов войн №1 департамента" +
                " здравоохранения города Москвы");

        ChildrenHospital childHospital_1 = new ChildrenHospital("Детская городская клиническая" +
                " больница святого Владимира");


        Patient patient_1 = new Patient("Алексей", "Иванов", 25, 568790,
                "ОРВИ");

        Patient patient_2 = new Patient("Владимир", "Петров", 34, 983209,
                "Пищевая интоксикация");

        Patient patient_3 = new Patient("Николай", "Семёнов", 16, 658712,
                "Диатез");

        Doctor doctor_1 = new Doctor("Анатолий", "Пантилеев", 48, 5677,
                "Врач общей практики");

        Doctor doctor_2 = new Doctor("Алексей", "Митрофанов", 56, 994567,
                "Хирург");

        Doctor doctor_3 = new Doctor("Кирилл", "Кузнецов", 47, 754490,
                "Педиатр");


       hospital_1.addPatient(patient_1);
       hospital_2.addPatient(patient_2);
       hospital_1.addDoctor(doctor_1);
       hospital_2.addDoctor(doctor_2);
       childHospital_1.addChildrenPatient(patient_3);
       childHospital_1.addDoctor(doctor_3);

        System.out.println(hospital_1.toString());
        System.out.println(hospital_2.toString());
        System.out.println(childHospital_1);


    }
}
