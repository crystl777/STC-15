package ru.butenko.task5.VendingMachine;

public enum Keys {
    A1, A2, A3, B1, B2;

    static public Keys[] createKeys(){

        Keys[] res = new Keys[5];
        res[0] = A1;
        res[1] = A2;
        res[2] = A3;
        res[3] = B1;
        res[4] = B2;

        return res;
    }
}
