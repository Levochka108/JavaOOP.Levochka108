package main.java.com.levochka108.oop.backendminimarket.model.support;

public class Drinks extends Product {
    int volumeProduct;

    public Drinks(String name, double price, int count, double measure, int volumeProduct) {
        super(name, price, count, measure);
        this.volumeProduct = volumeProduct;
    }

    @Override
    public String toString() {
        return super.toString().replace("}", " Объем продукта: " + volumeProduct + "}");
    }
}
