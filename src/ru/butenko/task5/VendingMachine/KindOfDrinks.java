package ru.butenko.task5.VendingMachine;

public enum KindOfDrinks {

    VODKA(100), GIN (140), TEQUILA(111), BRANDY(333), WHISKEY(444);


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
