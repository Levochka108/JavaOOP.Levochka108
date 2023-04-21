package main.java.com.levochka108.oop.backendminimarket.model.support;

import main.java.com.levochka108.oop.backendminimarket.model.support.Product;

public class Drinks extends Product {
    /**
     * Объем продукта (литры)
     */
    int volumeProduct;

    public Drinks(String name, double price, int count, double measure, int volumeProduct) {
        super(name, price, count, measure);
    }

}
