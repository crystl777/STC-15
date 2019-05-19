package ru.butenko.task5.App;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ru.butenko.task5.VendingMachine.Vending;
import java.io.IOException;

public class Main {

    private static final Logger logger = LoggerFactory.getLogger(Main.class.getName());

    public static void main(String[] args) throws IOException {

        logger.info("Начало работы программы");

        Vending vending = new Vending(Vending.createMap(), 2);

        int count = vending.getCount();

        while (count > 0) {
            Vending.checkAge();
            Vending.menu();
            Vending.keyOfGood();
            vending.getGood();

            count--;
        }
        Vending.vendingEmpty();
    }
}
