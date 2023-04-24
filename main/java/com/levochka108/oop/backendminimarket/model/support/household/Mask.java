package main.java.com.levochka108.oop.backendminimarket.model.support.household;


import main.java.com.levochka108.oop.backendminimarket.model.support.NonEdibleProducts;

public class Mask extends NonEdibleProducts {
    String typeMaterialMask;

    public Mask(String name, double price, int count, double measure, String typeMaterialMask) {
        super(name, price, count, measure);
        this.typeMaterialMask = typeMaterialMask;
    }

    @Override
    public String toString() {
        return super.toString().replace("}", ", материал маски: " + typeMaterialMask + '}');
    }
}
