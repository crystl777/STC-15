package ru.butenko.task6;

public class Calculator {

    public final double PI = 3.14;
    /* согласно первому пункту ДЗ, решил просто добавить модификатор final
       для примитива,  данном случае числу Пи, так как это константа
     */


    public static double sum (double a, double b){
        return a + b;
    }

    public static double dif (double a, double b){
        return a - b;
    }

    public static double mult (double a, double b){
        return a * b;
    }

    public static double div (double a, double b){
        return a / b;
    }

    public static double per (double a, double per){
        return a * (per/100);
    }

}
