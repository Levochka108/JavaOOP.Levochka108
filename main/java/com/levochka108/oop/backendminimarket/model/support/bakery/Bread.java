package main.java.com.levochka108.oop.backendminimarket.model.support.bakery;


import main.java.com.levochka108.oop.backendminimarket.model.support.FoodItems;

import java.util.Date;

public class Bread extends FoodItems {
    String flourType;
    boolean sugar;
    boolean milk;
    boolean egg;
    boolean bakerYeast;

    public Bread(String name, double price, int count, double measure, Date dateFood, String flourType, boolean sugar, boolean milk, boolean egg, boolean bakerYeast) {
        super(name, price, count, measure, dateFood);
        this.flourType = flourType;
        this.sugar = sugar;
        this.milk = milk;
        this.egg = egg;
        this.bakerYeast = bakerYeast;
    }

    @Override
    public String toString() {
        return super.toString().replace("}", "в составе хлеба: тип муки: " + flourType +
                ", в составе сахар: " + sugar +
                ", в составе молоко: " + milk +
                ", в сосатве яйца: " + egg +
                ", в составе дрожжи: " + bakerYeast +
                "}");
    }
}
