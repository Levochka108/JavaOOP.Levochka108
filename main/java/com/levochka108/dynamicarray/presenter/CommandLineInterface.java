package main.java.com.levochka108.dynamicarray.presenter;




import main.java.com.levochka108.dynamicarray.model.DynamicArray;

import java.util.Scanner;

public class CommandLineInterface {
    private final DynamicArray<Integer> dynamicArray;
    private final Scanner scanner;

    public CommandLineInterface() {
        dynamicArray = new DynamicArray<>();
        scanner = new Scanner(System.in);
    }


    public void getPrintMenu() {
        printMenu();
    }

    public void getInsertItem(){
        insertItem();
    }
    public void getRemoveItem(){
        removeItem();
    }
    public void getSearchItem(){
        searchItem();
    }
    public void getPrintArray(){
        printArray();
    }
    public void getExit(){
        exit();
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
        dynamicArray.insert(item);
        System.out.println("Item inserted successfully.");
    }

    private void removeItem() {
        System.out.print("Enter index of item to remove: ");
        int index = scanner.nextInt();
        dynamicArray.remove(index);
        System.out.println("Item removed successfully.");
    }

    private void searchItem() {
        System.out.print("Enter item to search: ");
        int item = scanner.nextInt();
        int index = dynamicArray.indexOf(item);
        if (index == -1) {
            System.out.println("Item not found.");
        } else {
            System.out.println("Item found at index " + index + ".");
        }
    }

    private void printArray() {
        System.out.print("Array: ");
        dynamicArray.print();
    }

    private void exit() {
        scanner.close();
        System.exit(0);
    }
}
