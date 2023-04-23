package java.com.levochka108.oop.backendminimarket.model.support.drinks;


import java.com.levochka108.oop.backendminimarket.model.support.Drinks;

public class Lemonade extends Drinks {
    private boolean sugar;

    public Lemonade(String name, double price, int count, double measure, int volumeProduct, boolean sugar) {
        super(name, price, count, measure, volumeProduct);
        this.sugar = sugar;
    }

    @Override
    public String toString() {
        return super.toString().replace("}"," в составе сахар: " + sugar + "}");
    }
}
