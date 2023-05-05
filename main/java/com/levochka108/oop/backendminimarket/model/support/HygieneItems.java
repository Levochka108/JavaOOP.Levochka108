package com.levochka108.oop.backendminimarket.model.support;

public class HygieneItems extends main.java.com.levochka108.oop.backendminimarket.model.support.Product {
    int unitInPackage;

    public HygieneItems(String name, double price, int count, double measure, int unitInPackage) {
        super(name, price, count, measure);
        this.unitInPackage = unitInPackage;
    }

    @Override
    public String toString() {
        return super.toString().replace("}", "количество в упаковке: " + unitInPackage + '}');
    }
}
