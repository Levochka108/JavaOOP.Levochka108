package java.com.levochka108.oop.ui.view;

import java.com.levochka108.oop.backendminimarket.model.support.Product;
import java.com.levochka108.oop.backendminimarket.model.support.dairy.Milk;
import java.com.levochka108.oop.backendminimarket.model.support.deli.Egg;
import java.com.levochka108.oop.backendminimarket.model.support.drinks.Lemonade;

public class ViewUI {

    public static void stringMessage(){
        Product lemonade = new Lemonade("Новый Колокольчик", 50.20, 1,2.1, 1,true);
        Product milk = new Milk("Мяк Молоко", 20.15,1,2.1,12,3.2);
        Product egg = new Egg("ЯйцоТоЗолотое",95.10,12,1,2023,12);

    }

}
