package com.levochka108.program.calculation.view;

import java.util.Scanner;

public class View {
    private final Scanner scannerIn;

    public View() {
        scannerIn = new Scanner(System.in);
    }

    public double readNumber() {
        System.out.println("Введите число: ");
        if (scannerIn.hasNextInt()) {
            return scannerIn.nextInt();
        } else {
            return scannerIn.nextDouble();
        }
    }

    public void printResult(Number resultNumber){
        System.out.println("Результат: "+ resultNumber);
    }
}

