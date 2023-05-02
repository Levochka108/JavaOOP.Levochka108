package com.levochka108.dynamicarray.testversion.ui;


import com.levochka108.dynamicarray.model.BusinessLogic;

import java.util.Scanner;


public class ArrayView {
    private BusinessLogic businessLogic;
    private Scanner scanner;

    public ArrayView() {
        businessLogic = new BusinessLogic();
        scanner = new Scanner(System.in);
    }

    public void run() {
        while (true) {
            printMenu();
            String choice = scanner.nextLine();
            switch (choice) {
                case "1":
                    insertItem();
                    break;
                case "2":
                    removeItem();
                    break;
                case "3":
                    searchItem();
                    break;
                case "4":
                    printArray();
                    break;
                case "5":
                    exit();
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }

    private void printMenu() {
        System.out.println("1. Insert item");
        System.out.println("2. Remove item");
        System.out.println("3. Search item");
        System.out.println("4. Print array");
        System.out.println("5. Exit");
    }

    private void insertItem() {
        System.out.print("Enter item to insert: ");
        int item = scanner.nextInt();
        businessLogic.insertItem(item);
        System.out.println("Item inserted successfully.");
    }

    private void removeItem() {
        System.out.print("Enter index of item to remove: ");
        int index = scanner.nextInt();
        businessLogic.removeItem(index);
        System.out.println("Item removed successfully.");
    }

    private void searchItem() {
        System.out.print("Enter item to search: ");
        int item = scanner.nextInt();
        int index = businessLogic.searchItem(item);
        if (index == -1) {
            System.out.println("Item not found.");
        } else {
            System.out.println("Item found at index " + index + ".");
        }
    }

    private void printArray() {
        System.out.print("Array: " + businessLogic.printArray());
    }

    private void exit() {
        scanner.close();
        System.exit(0);
    }
}
