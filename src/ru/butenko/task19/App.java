package ru.butenko.task19;


import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

public class App {

    public static void main(String[] args) throws IOException {

        Set<String> set = new HashSet<>();
        FilteringMultipleItems.addStringToSet(set);
        FilteringMultipleItems.removeEvenLengthString(set);
        System.out.println(set);

        Set<Integer> intSet = new HashSet<>();
        FilteringMultipleItems.addIntegerToSet(intSet);
        FilteringMultipleItems.removeEvenLengthInteger(intSet);
        System.out.println(intSet);
    }
}
