package ru.butenko.task6.convertationContract;

import java.time.LocalDate;
import java.util.ArrayList;

public class Act {

    private int number;
    private LocalDate date;
    private ArrayList<String> list;

    public Act(int number, LocalDate date, ArrayList<String> list) {
        this.number = number;
        this.date = date;
        this.list = list;
    }

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
