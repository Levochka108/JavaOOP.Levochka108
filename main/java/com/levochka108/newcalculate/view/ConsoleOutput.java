package com.levochka108.newcalculate.view;

public class ConsoleOutput implements IOutput {
    @Override
    public void print(String message) {
        System.out.println(message);
    }

    @Override
    public void println(String message) {
        System.out.println(message);
    }

    @Override
    public void printError(String message) {
        System.out.println(message);
    }
}
