package main.java.com.levochka108.oop.backendminimarket.model.support;

/**
 * Родительский класс обьекта продукт
 */
public class Product {
    private static String nameProduct;
    private static double priceProduct;
    private static int countProduct;
    /**
     * Единица измерения
     */
    private static double measureProduct;

    public Product(String name, double price, int count, double measure) {
        nameProduct = name;
        priceProduct = price;
        countProduct = count;
        measureProduct = measure;

    }


    public static String getNameProduct() {
        return nameProduct;
    }

    public static void setNameProduct(String nameProduct) {
        Product.nameProduct = nameProduct;
    }

    public static double getPriceProduct() {
        return priceProduct;
    }

    public static void setPriceProduct(double priceProduct) {
        Product.priceProduct = priceProduct;
    }

    public static int getCountProduct() {
        return countProduct;
    }

    public static void setCountProduct(int countProduct) {
        Product.countProduct = countProduct;
    }

    public static double getMeasureProduct() {
        return measureProduct;
    }

    public static void setMeasureProduct(double measureProduct) {
        Product.measureProduct = measureProduct;
    }

}
