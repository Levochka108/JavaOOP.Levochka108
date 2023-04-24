package main.java.com.levochka108.oop.backendminimarket.model.support;


import java.text.SimpleDateFormat;
import java.util.Date;

public class FoodItems extends Product {
    private Date exDateFood;

    public FoodItems(String name, double price, int count, double measure, Date dateFood) {
        super(name, price, count, measure);
        this.exDateFood = dateFood;
    }

    public Date getExDateFood() {
        return exDateFood;
    }

    public void setExDateFood(Date exDateFood) {
        this.exDateFood = exDateFood;
    }

    @Override
    public String toString() {
        SimpleDateFormat formatter = new SimpleDateFormat("dd.MM.yyyy");
        return super.toString().replace("}", ", срок годности: " + formatter.format(exDateFood) + "}");

    }
}
