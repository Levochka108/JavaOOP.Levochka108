package java.com.levochka108.oop.geometry.figure;

import java.com.levochka108.oop.geometry.Figure;

public class Square extends Figure {
    private final double side;

    public Square(double side) {
        if (side <= 0) {
            throw new IllegalArgumentException("Сторона должна быть положительной!");
        }
        this.side = side;
    }

    /**
     * рассчитать площадь
     */
    @Override
    public double calculateArea() {
        return side * side;
    }

    /**
     * расчитать периметр
     */
    @Override
    public double calculatePerimeter() {
        return 4 * side;
    }
}
