package ru.butenko.task3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Progression {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Введите тип прогрессии (арифметическая или геометрическая)");

        boolean isWorking = true;

        while (isWorking) {
            String progressionType = reader.readLine().toLowerCase();
            switch (progressionType) {
                case ("арифметическая"):
                    System.out.println("Введите разность арифметической прогрессии");
                    int difProgression = Integer.parseInt(reader.readLine());

                    System.out.println("Введите количество членов прогрессии");
                    int countProgression = Integer.parseInt(reader.readLine());

                    System.out.println("Введите начальное число прогрессии");
                    int startNumber = Integer.parseInt(reader.readLine());

                    for (int i = 0; i < countProgression; i++) {
                        System.out.println(startNumber);
                        startNumber += difProgression;
                    }
                    isWorking = false;
                    break;

                case ("геометрическая"):
                    System.out.println("Введите знаменатель прогрессиии");
                    int progressionDenominator = Integer.parseInt(reader.readLine());

                    System.out.println("Введите количество членов прогрессии");
                    int countGeometricalProgression = Integer.parseInt(reader.readLine());

                    System.out.println("Введите начальное число прогрессии");
                    int startGeometricalNumber = Integer.parseInt(reader.readLine());

                    for (int i = 0; i < countGeometricalProgression; i++) {
                        System.out.println(startGeometricalNumber);
                        startGeometricalNumber *= progressionDenominator;
                    }
                    isWorking = false;
                    break;

                default:
                    System.out.println("Вы неправильно ввели название прогрессии. Попробуйте ещё раз.");

            }
        }
    }
}
