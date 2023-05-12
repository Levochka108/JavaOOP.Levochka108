package com.levochka108.newcalculate.view;

import com.levochka108.newcalculate.model.Complex;
import com.levochka108.newcalculate.model.Rational;
import com.levochka108.newcalculate.presenter.Presenter;
import com.levochka108.program.calculation.view.View;

public class ConsoleView {
    IInput input = new ConsoleInput();
    IOutput output = new ConsoleOutput();
    View view = new View(input, output);
    Presenter presenter = new Presenter(view);

    private void showMenu() {
        output.println("Выберите операцию:");
        output.println("1. Сложение");
        output.println("2. Вычитание");
        output.println("3. Умножение");
        output.println("4. Деление");

    }
    private void showOutMessage(){
        output.println("Спасибо за использование калькулятора!");
    }


    public void run() {

        output.println("Добро пожаловать в калькулятор!");
        output.println("Введите первое число:");
        double real1 = input.readDouble();
        double imaginary1 = input.readDouble();
        Complex complex1 = new Complex(real1, imaginary1);
        Rational rational1 = new Rational(real1);

        output.println("Введите второе число:");
        double real2 = input.readDouble();
        double imaginary2 = input.readDouble();
        Complex complex2 = new Complex(real2, imaginary2);
        Rational rational2 = new Rational(real2);

        showMenu();

        int operationIndex = input.readInt("Введите целое число: ");

        Complex resultComplex = null;
        Rational resultRational = null;

        switch (operationIndex) {
            case 1 -> {
                resultComplex = complex1.add(complex2);
                resultRational = rational1.add(rational2);
            }
            case 2 -> {
                resultComplex = complex1.subtract(complex2);
                resultRational = rational1.subtract(rational2);
            }
            case 3 -> {
                resultComplex = complex1.multiply(complex2);
                resultRational = rational1.multiply(rational2);
            }
            case 4 -> {
                resultComplex = complex1.divide(complex2);
                resultRational = rational1.divide(rational2);
            }
            default -> output.printError("Неправильный индекс операции!");
        }

        if (resultComplex != null) {
            output.println("Результат в комплексных числах: " + resultComplex);
        }

        if (resultRational != null) {
            output.println("Результат в рациональных числах: " + resultRational);
        }

        showOutMessage();
    }

}

