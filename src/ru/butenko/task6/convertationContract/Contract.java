package ru.butenko.task6.convertationContract;

import java.time.LocalDate;
import java.util.ArrayList;

public class Contract {

    private int number;
    private LocalDate date;
    private ArrayList<String> list;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public ArrayList<String> getList() {
        return list;
    }

    public void setList(ArrayList<String> list) {
        this.list = list;
    }
}
