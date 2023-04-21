package main.java.com.levochka108.oop.backendminimarket.model.support.ui.view;

import main.java.com.levochka108.oop.backendminimarket.model.support.Product;
import main.java.com.levochka108.oop.backendminimarket.model.support.drinks.Lemonade;

public class ViewUI {
    public static void runProgram(){
        Product lemonade = new Lemonade("Колокольчик", 25.50, 12, 2, 1, true);
        System.out.println(lemonade);
    }
}
