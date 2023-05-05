package com.levochka108.oop.ui.view.store;

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

        for (Product product: products) {
            System.out.println(product);

        }
    }
}

