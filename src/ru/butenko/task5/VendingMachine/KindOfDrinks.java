package ru.butenko.task5.VendingMachine;

public enum KindOfDrinks {

    VODKA(100), GIN (160), TEQUILA(180), BRANDY(170), WHISKEY(200);


    int cost;

    KindOfDrinks(int cost){
        this.cost = cost;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }
}
