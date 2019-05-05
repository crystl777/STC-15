package ru.butenko.task5.App;

import ru.butenko.task5.VendingMachine.Vending;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

        Vending vending = new Vending(Vending.createMap(), 2);

        vending.getGoods();
    }
}
