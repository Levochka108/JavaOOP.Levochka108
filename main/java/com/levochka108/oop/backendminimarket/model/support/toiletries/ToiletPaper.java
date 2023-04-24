package main.java.com.levochka108.oop.backendminimarket.model.support.toiletries;


import main.java.com.levochka108.oop.backendminimarket.model.support.Product;

public class ToiletPaper extends Product {
    int layerParer;

    public ToiletPaper(String name, double price, int count, double measure, int layer) {
        super(name, price, count, measure);
        this.layerParer = layer;
    }

    @Override
    public String toString() {
        return super.toString().replace("}", ", слоев в туалетной бумаге: " + layerParer + '}');
    }
}

