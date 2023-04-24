package java.com.levochka108.oop.geometry.figure;

import java.com.levochka108.oop.geometry.Figure;

public class Triangle extends Figure {
    private final double a, b, c;

    public Triangle(double a, double b, double c) {
        if (a <= 0 || b <= 0 || c <= 0) {
            throw new IllegalArgumentException("Длины сторон треугольника должы быть положительными!");
        }
        if (a + b <= c || a + c <= b || b + c <= a) {
            throw new IllegalArgumentException("Такого треугольника не существует, переопределить стороны!");
        }
        this.a = a;
        this.b = b;
        this.c = c;
    }

    /**
     * S = √p · (p — a)(p — b)(p — c)
     */
    @Override
    public double calculateArea() {
        double p = (a + b + c) / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    @Override
    public double calculatePerimeter() {
        return a + b + c;
    }
}
