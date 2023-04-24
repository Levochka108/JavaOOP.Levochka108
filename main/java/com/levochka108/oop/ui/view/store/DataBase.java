package main.java.com.levochka108.oop.ui.view.store;

import main.java.com.levochka108.oop.backendminimarket.model.support.Product;
import main.java.com.levochka108.oop.backendminimarket.model.support.bakery.Bread;
import main.java.com.levochka108.oop.backendminimarket.model.support.dairy.Milk;
import main.java.com.levochka108.oop.backendminimarket.model.support.drinks.Lemonade;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

/**
 * "Продукт: Название:
 * цена продукта: "
 * счет продукта: "
 * единица измерения: "
 */

public class DataBase {
    public void showData() {
        ArrayList<Product> products = new ArrayList<>();
        products.add(new Lemonade("Колокольчик", 100.50, 20, 1, 2, "есть сахар."));
        products.add(new Product("Зубная щетка", 120.50, 1, 2));
        products.add(new Milk("Кот и Молоко", 60.50, 60, 1, 1, 3.2));
        products.add(new Bread("Хлебушек святой рыженький", 45.99, 100, 12, new Date(123, Calendar.APRIL, 24), "Мука цельно зерновая", false, false, false, false));

        for (Product product: products) {
            System.out.println(product);

        }
    }
}

