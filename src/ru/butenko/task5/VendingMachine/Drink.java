package ru.butenko.task5.VendingMachine;

public class Drink {


    private KindOfDrinks kindOfDrink;
    private int cost;

    public Drink(KindOfDrinks kindOfDrink, int cost) {
        this.kindOfDrink = kindOfDrink;
        this.cost = cost;
    }

    public KindOfDrinks getKindOfDrink() {
        return kindOfDrink;
    }

    public void setKindOfDrink(KindOfDrinks kindOfDrink) {
        this.kindOfDrink = kindOfDrink;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }
}
