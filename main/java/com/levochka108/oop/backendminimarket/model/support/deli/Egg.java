package main.java.com.levochka108.oop.backendminimarket.model.support.deli;


import main.java.com.levochka108.oop.backendminimarket.model.support.FoodItems;

import java.util.Date;

public class Egg extends FoodItems {
    int unitOnPackage;

    public Egg(String name, double price, int count, double measure, Date dateFood, int unitOnPack) {
        super(name, price, count, measure, dateFood);
        this.unitOnPackage = unitOnPack;
    }

    @Override
    public String toString() {
        return super.toString().replace("}", ", количество в упаковке: " + unitOnPackage + '}');
    }
}
