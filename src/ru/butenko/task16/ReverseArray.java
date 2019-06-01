package ru.butenko.task16;

public class ReverseArray {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        
        ReverseArray.printArray(arr);
        ReverseArray.reverseArray(arr);
        ReverseArray.printArray(arr);
    }

    public static void reverseArray(int[] arr) {

        for (int i = 0; i < arr.length / 2; i++) {
            int tmp = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = tmp;
        }
    }

    public static void printArray(int[] arr) {

        System.out.println("------------------------------");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        System.out.println("------------------------------");
    }
}
