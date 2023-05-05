package com.levochka108.oop.backendminimarket.model.support.veganproduct;


import main.java.com.levochka108.oop.backendminimarket.model.support.FoodItems;

import java.util.Date;

public class Sausage extends FoodItems {
    boolean vegan;

    public Sausage(String name, double price, int count, double measure, Date dateFood, boolean vegan) {
        super(name, price, count, measure, dateFood);
        this.vegan = vegan;
    }

    @Override
    public String toString() {
        return super.toString().replace("}", ", в составе нет мяса: " + vegan + '}');
    }
}
