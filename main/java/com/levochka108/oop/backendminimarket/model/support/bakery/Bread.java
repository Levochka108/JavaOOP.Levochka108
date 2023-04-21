package main.java.com.levochka108.oop.backendminimarket.model.support.bakery;

import main.java.com.levochka108.oop.backendminimarket.model.support.Product;

public class Bread extends Product {
    String flourType;
    boolean sugar;

    boolean milk;

    boolean egg;

    /**
     * Это дрожжи хлебопикарные
     * */
    boolean bakerYeast;

    public Bread(String name, double price, int count, double measure, String flourType,boolean sugar, boolean milk, boolean egg, boolean bakerYeast) {
        super(name, price, count, measure);
    }
}
