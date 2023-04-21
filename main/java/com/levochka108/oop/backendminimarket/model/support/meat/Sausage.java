package main.java.com.levochka108.oop.backendminimarket.model.support.meat;


import main.java.com.levochka108.oop.backendminimarket.model.support.FoodItems;

public class Sausage extends FoodItems {
    /**
     * Продукты питания (Съедобное)
     *
     * @param name
     * @param price
     * @param count
     * @param measure
     * @param productExpirationDate
     */
    public Sausage(String name, double price, int count, double measure, int productExpirationDate) {
        super(name, price, count, measure, productExpirationDate);
    }
}
