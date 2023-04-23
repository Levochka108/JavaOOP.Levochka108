package java.com.levochka108.oop.backendminimarket.model.support;


import java.com.levochka108.oop.backendminimarket.model.support.Product;

public class FoodItems extends Product {
    /**
     *Срок годности продукта
     * */
    private static int productExpirationDate;
    /**
     * Продукты питания (Съедобное)
     * */
    public FoodItems(String name, double price, int count, double measure, int productExpirationDate) {
        super(name, price, count, measure);
    }
}
