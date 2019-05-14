package ru.butenko.task10;

public enum Food {
    APPLE("яблоко"), CANDY("конфета"), CARROT("морковь"), EGG("яйцо"),
    PORRIDGE("каша"), SOUP("суп");

    String russianName;

    Food (String russianName) {this.russianName = russianName;}

    public String getRussianName() {
        return russianName;
    }
}
