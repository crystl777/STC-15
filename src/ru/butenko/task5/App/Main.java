package ru.butenko.task5.App;

import ru.butenko.task5.VendingMachine.Drinks;
import ru.butenko.task5.VendingMachine.Keys;
import ru.butenko.task5.VendingMachine.Vending;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Main {

    public static void main(String[] args) throws IOException {

        Vending vending = new Vending(Vending.createMap(), 3);

        vending.getGoods(vending.getHashMap());

    }
}
