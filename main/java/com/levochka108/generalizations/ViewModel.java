package com.levochka108.generalizations;

import com.levochka108.generalizations.model.DynamicArray;

import java.util.Scanner;

public class ViewModel {
    public void runProgram(){
        DynamicArray<Integer> array = new DynamicArray<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter array elements (one per line, blank line to finish):");

        String line = scanner.nextLine();
        while (!line.isEmpty()) {
            try {
                int element = Integer.parseInt(line);
                array.insert(element);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input: " + line);
            }
            line = scanner.nextLine();
        }

        System.out.println("Array elements:");
        array.printArray();

        System.out.println("Minimum element: " + array.findMin());
        System.out.println("Maximum element: " + array.findMax());
        System.out.println("Sum of elements: " + array.findSum());
        System.out.println("Product of elements: " + array.findProduct());

        System.out.println("Enter index to get element:");
        int index = scanner.nextInt();
        try {
            int element = array.get(index);
            System.out.println("Element at index " + index + ": " + element);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Invalid index: " + index);
        }

        System.out.println("Enter index and value to set element:");
        int index2 = scanner.nextInt();
        int value = scanner.nextInt();
        try {
            array.set(index2, value);
            System.out.println("Array after setting element:");
            array.printArray();
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Invalid index: " + index2);
        }

    }

}

