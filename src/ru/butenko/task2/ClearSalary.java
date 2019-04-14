package ru.butenko.task2;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ClearSalary {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Введите Вашу зарплату до вычета налогов");
        int salary = Integer.parseInt(reader.readLine());
        System.out.println(" ");
        System.out.println("Ваша зарплата до вычета НДФЛ : " + salary);
        System.out.println("-----------");
        System.out.println("Ваша зарплата после вычета НДФЛ : " + taxNdfl(salary));
    }

    public static double taxNdfl (int salary){

        double clearSalary = salary - salary * 0.13;
        return clearSalary;
    }
}
