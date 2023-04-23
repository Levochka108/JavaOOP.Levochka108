package java.com.levochka108.oop.backendminimarket.model.support;

/**
 * Родительский класс обьекта продукт
 */
public class Product {
    private static double measureProduct;
    private static String nameProduct;
    private static double priceProduct;
    private static int countProduct;
    /**
     * Единица измерения
     */


    public Product(String name, double price, int count, double measure) {
        nameProduct = name;
        priceProduct = price;
        countProduct = count;
        measureProduct = measure;

    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        Product.nameProduct = nameProduct;
    }

    public double getPriceProduct() {
        return priceProduct;
    }

    public void setPriceProduct(double priceProduct) {
        Product.priceProduct = priceProduct;
    }

    public int getCountProduct() {
        return countProduct;
    }

    public void setCountProduct(int countProduct) {
        Product.countProduct = countProduct;
    }

    public double getMeasureProduct() {
        return measureProduct;
    }

    public void setMeasureProduct(double measureProduct) {
        Product.measureProduct = measureProduct;
    }

    @Override
    public String toString() {
        return "Продукт: {Название: " + nameProduct +
                ", цена продукта: " + priceProduct +
                ", счет продукта: " + countProduct +
                ", единица измерения: " + measureProduct + "}";
    }
}
