package com.levochka108.oop.backendminimarket.model.support.babyproducts;


import main.java.com.levochka108.oop.backendminimarket.model.support.ProductsForBaby;

public class Diapers extends ProductsForBaby {
    String size;
    int minimumWeight;
    int maximumWeight;
    String typeDiapers;

    public Diapers(String name, double price, int count, double measure, String minimumAge, boolean allergic, String size, int minimumWeight, int maximumWeight, String typeDiapers) {
        super(name, price, count, measure, minimumAge, allergic);
        this.size = size;
        this.minimumWeight = minimumWeight;
        this.maximumWeight = maximumWeight;
        this.typeDiapers = typeDiapers;
    }

    @Override
    public String toString() {
        return super.toString().replace("}", ", для мальчика или девочки: " + typeDiapers + ", размер подгузника: " + size + ", минимальный вес ребенка: " + maximumWeight + ", максимальный вес ребенка: " + maximumWeight + '}');
    }
}
