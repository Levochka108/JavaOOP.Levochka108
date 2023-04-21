package main.java.com.levochka108.oop.backendminimarket.model.support.dairy;

import main.java.com.levochka108.oop.backendminimarket.model.support.Drinks;

public class Milk extends Drinks {
    double fatPercentage;

    public Milk(String name, double price, int count, double measure, int volumeProduct, double fatPercentage) {
        super(name, price, count, measure, volumeProduct);
    }
}
