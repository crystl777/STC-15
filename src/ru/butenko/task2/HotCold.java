package ru.butenko.task2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;
import java.util.Scanner;

public class HotCold {

    public static void main(String[] args) throws IOException {


        Scanner scan = new Scanner(System.in);
        String word = scan.nextLine();
        int number = Integer.parseInt(word);

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Random rn = new Random();
        int random = rn.nextInt(100) + 1;
        int guess = 0;

        while (true) {
            String input = reader.readLine();

            if (input.equals("exit")) {
                break;
            }

            int guessnew = Integer.parseInt(input);

            if (guessnew == random) {
                System.out.println("Угадал!");
                break;
            }

            else if (guessnew <= 100 && guessnew > 0) {
                if (Math.abs(random - guessnew) <= Math.abs(random - guess)) {
                    System.out.println("Горячо!");
                }
                else {
                    System.out.println("Холодно!");
                }
                guess = guessnew;
            }

            else {
                System.out.println("Введённое число находится вне диапазаона 1 - 100");
            }
        }
    }
}