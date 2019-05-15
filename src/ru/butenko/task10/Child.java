package ru.butenko.task10;

public class Child {

    public  void сhildEating(Food food) throws FoodException {

        double random = Math.random();

        try {
            if (random < 0.2) {
                System.out.println("Ребёнок съел <" + food.getRussianName() + "> за обе щеки");
            } else {
                throw new FoodException("Ребёнок хоть и съел <" + food.getRussianName() + ">," +
                        " но он был крайне недоволен :(");
            }
        } finally {
            System.out.println("Спасибо, мама, я покушал!");
        }
    }
}
