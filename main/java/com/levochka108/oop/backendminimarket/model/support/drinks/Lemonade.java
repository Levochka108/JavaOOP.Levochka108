package main.java.com.levochka108.oop.backendminimarket.model.support.drinks;

import main.java.com.levochka108.oop.backendminimarket.model.support.Drinks;

public class Lemonade extends Drinks {
    private boolean sugar;

    public Lemonade(String name, double price, int count, double measure, int volumeProduct, boolean sugar) {
        super(name, price, count, measure, volumeProduct);
    }


}
