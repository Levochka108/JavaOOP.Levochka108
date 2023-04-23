package java.com.levochka108.oop.geometry.figure;

import java.com.levochka108.oop.geometry.Figure;

public class Circle extends Figure {
    private final double radius;

    public Circle(double radius) {
        if (radius <= 0) {
            throw new IllegalArgumentException("Радиус круга должен быть положительным!");
        }
        this.radius = radius;
    }

    /**
     * рассчитать площадь
     */
    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    /**
     * расчитать периметр
     */
    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }
}
