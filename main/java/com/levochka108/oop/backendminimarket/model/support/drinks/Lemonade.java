package main.java.com.levochka108.oop.backendminimarket.model.support.drinks;

import main.java.com.levochka108.oop.backendminimarket.model.support.Drinks;

public class Lemonade extends Drinks {
    private String sugar;
    public String getSugar() {
        return sugar;
    }
    public Lemonade(String name, double price, int count, double measure, int volumeProduct) {
        super(name, price, count, measure, volumeProduct);
    }

    @Override
    public String toString() {
        return "Продукт: {(" +
                "Наименование:" + getNameProduct() +")("+
                "Цена продукта:" + getPriceProduct() +")("+
                "Количество продукта:" + getCountProduct() +")("+
                "Единица измерения:" +getMeasureProduct() +")("+
                ")}";
    }
}
