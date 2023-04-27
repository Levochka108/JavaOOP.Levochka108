package com.levochka108.oop.ui.view.animal;

import java.util.Scanner;

public class ViewUIAnimal {
   private static final Scanner scanner = new Scanner(System.in);

    private boolean userChoiceIsIncorrect(String choice) {
        choice = choice.trim();
        if (choice.equals("0")) {
            System.out.println("See you soon!");
            return false;
        }
        if (choice.equals("1")) return false;
        if (choice.equals("3")) return false;
        if (choice.equals("4")) return false;
        if (choice.equals("5")) return false;
        if (choice.equals("6")) return false;
        return !choice.equals("2");
    }

    private  String filterChoice() {
        System.out.println("Enter filter: ");
        System.out.println("1 -> Добавить животное в зоопарк;");
        System.out.println("2 -> Уберает животное с его индексем из зоопарка;");
        System.out.println("3 -> Посмотреть иформацию о животном с его индексом;");
        System.out.println("4 -> Заставить животное с его индексом издать звук;");
        System.out.println("5 -> Напечатать интормацию про всех животных в зоопарке;");
        System.out.println("6 -> Заставить всех живоных издать звук, которые есть в зоопарке");
        System.out.println("0 -> quit");
        System.out.print("Choice: ");
        String choice = scanner.next();
        if (userChoiceIsIncorrect(choice)) {
            return "Please, repeat command.";
        }
        return choice;
    }

    public void showMenu() {
        System.out.println("1. Добавить животное в зоопарк" +
                "2. Уберает животное с его индексем из зоопарка" +
                "3. Посмотреть иформацию о животном с его индексом" +
                "4. Заставить животное с его индексом издать звук" +
                "5. Напечатать интормацию про всех животных в зоопарке" +
                "6. Заставить всех живоных издать звук, которые есть в зоопарке");
    }
}
