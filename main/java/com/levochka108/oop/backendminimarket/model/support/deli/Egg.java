package java.com.levochka108.oop.backendminimarket.model.support.deli;


import java.com.levochka108.oop.backendminimarket.model.support.FoodItems;

public class Egg extends FoodItems {
    int unitOnPackage;
    /**
     * Продукты питания (Съедобное)
     *
     * @param name
     * @param price
     * @param count
     * @param measure
     * @param productExpirationDate
     */
    public Egg(String name, double price, int count, double measure, int productExpirationDate,int unitOnPack) {
        super(name, price, count, measure, productExpirationDate);
        this.unitOnPackage = unitOnPack;
    }
}
