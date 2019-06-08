package ru.butenko.task16;

public class ShiftElementsOfMassive {

    public static void main(String[] args) {
        int[][] array = new int[4][4];

        array[0][0] = 1;
        array[0][1] = 2;
        array[0][2] = 3;
        array[0][3] = 4;
        array[1][0] = 5;
        array[1][1] = 6;
        array[1][2] = 7;
        array[1][3] = 8;
        array[2][0] = 9;
        array[2][1] = 10;
        array[2][2] = 11;
        array[2][3] = 12;
        array[3][0] = 13;
        array[3][1] = 14;
        array[3][2] = 15;
        array[3][3] = 16;


        ShiftElementsOfMassive.printArray(array);
        ShiftElementsOfMassive.toLeft(array);
        ShiftElementsOfMassive.printArray(array);
    }

    public static void toLeft(int[][] array) {

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length - 1; j++) {
                ShiftElementsOfMassive.swap(array, i, j);
            }
            array[i][array.length - 1] = 0;
        }
    }

    public static void printArray(int[][] array) {
        System.out.println("--------------------------");

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static void swap(int[][] array, int i, int j) {

        int tmp = array[i][j];
        array[i][j] = array[i][j + 1];
        array[i][j + 1] = tmp;
    }
}







