package java.com.levochka108.oop.backendminimarket.model.support;

public class HygieneItems extends Product {
    int unitInPackage;

    public HygieneItems(String name, double price, int count, double measure, int unitInPackage) {
        super(name, price, count, measure);
    }
}
