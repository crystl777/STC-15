package ru.butenko.task6;

public class Calculator {

    public final double PI = 3.14;
    /* 1. согласно первому пункту ДЗ, решил просто добавить модификатор final
       для примитива,  данном случае числу Пи, так как это константа

       2. не стал делать отдельные методы для int, так как по факту double принимает
       на вход int
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
