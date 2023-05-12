package com.levochka108.newcalculate.view;

import com.levochka108.newcalculate.model.Complex;
import com.levochka108.newcalculate.model.Rational;

import java.util.Scanner;

public class ConsoleInput implements IInput {

    private final Scanner scanner;

    public ConsoleInput() {
        scanner = new Scanner(System.in);
    }

    @Override
    public int readInt(String message) {
        System.out.print(message);
        return scanner.nextInt();
    }

    @Override
    public Rational readRational(String message) {
        System.out.print(message);
        int numerator = scanner.nextInt();
        int denominator = scanner.nextInt();
        return new Rational(numerator, denominator);
    }

    @Override
    public Complex readComplex(String message) {
        System.out.print(message);
        double real = scanner.nextDouble();
        double imag = scanner.nextDouble();
        return new Complex(real, imag);
    }

    @Override
    public double readDouble() {
        return 0;
    }
}
