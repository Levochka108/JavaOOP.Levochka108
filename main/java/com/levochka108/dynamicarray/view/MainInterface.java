package main.java.com.levochka108.dynamicarray.view;

import main.java.com.levochka108.dynamicarray.presenter.CommandLineInterface;

import java.util.Scanner;



public class MainInterface {
    Scanner scanner = new Scanner(System.in);
    CommandLineInterface lineInterface = new CommandLineInterface();
    public void run() {
        boolean exitFlag = false;
        while (!exitFlag) {
            lineInterface.getPrintMenu();
            String choice = scanner.nextLine();
            switch (choice) {
                case "1" -> lineInterface.getInsertItem();
                case "2" -> lineInterface.getRemoveItem();
                case "3" -> lineInterface.getSearchItem();
                case "4" -> lineInterface.getPrintArray();
                case "5" -> {
                    exitFlag = true;
                    lineInterface.getExit();
                }
                default -> System.out.println("Invalid choice.");
            }
        }
    }
}
