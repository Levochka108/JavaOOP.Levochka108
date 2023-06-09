package main.java.com.levochka108.oop.backendminimarket.model.support;

public class ProductsForBaby extends Product {
    String minimumAge = "Детям от 3 лет";
    boolean allergic;

    public ProductsForBaby(String name, double price, int count, double measure, String minimumAge, boolean allergic) {
        super(name, price, count, measure);
        this.minimumAge = minimumAge;
        this.allergic = allergic;
    }

    @Override
    public String toString() {
        return super.toString().replace("}", "продукт для детей: ограничения по возросту: " + minimumAge + ", аллергия: " + allergic + '}');
    }
}
