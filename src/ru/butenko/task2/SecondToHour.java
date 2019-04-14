package ru.butenko.task2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SecondToHour {



    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Введите количество секунд : ");
        int seconds = Integer.parseInt(reader.readLine());
        System.out.println("-----------");
        System.out.println("В " + seconds + " содержится " + howMuchSecondsInHours(seconds) + " часа.");
    }

    public static double howMuchSecondsInHours (int seconds){

        double secondsInHour = (double) seconds / 3600;
        return secondsInHour;
    }
}
