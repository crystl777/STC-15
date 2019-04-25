package ru.butenko.task5.VendingMachine;

public class Drinks {


    static public Drink[] createGoods (){

        Drink[] drinkList = new Drink[5];

        Drink vodka = new Drink(KindOfDrinks.VODKA, 100);
        Drink gin = new Drink(KindOfDrinks.GIN, 160);
        Drink tequila = new Drink(KindOfDrinks.TEQUILA, 180);
        Drink brandy = new Drink(KindOfDrinks.BRANDY, 170);
        Drink whiskey = new Drink(KindOfDrinks.WHISKEY, 200);

        drinkList[0] = vodka;
        drinkList[1] = gin;
        drinkList[2] = tequila;
        drinkList[3] = brandy;
        drinkList[4] = whiskey;

        return drinkList;
    }
}

