package java.com.levochka108.oop.geometry.figure;

import java.com.levochka108.oop.geometry.Figure;

public class Rectangle extends Figure {
    private final double width;
    private final double height;

    // Конструктор
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return 0;
    }

    /**
     * Переопределение метода вычисления периметра
     * */
    @Override
    public double calculatePerimeter() {
        return 2 * (width + height);
    }
}
