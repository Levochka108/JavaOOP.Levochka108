package java.com.levochka108.oop.geometry;

/**
 * Базовый класс для всех фигур в программе
 * <p>
 * P = a + b + c + d, где a — сторона периметр (формула для квадрата)
 * S = a ⋅ b , где a и b — длина и ширина.
 * <p>
 * S -> площадь
 * P -> периметр
 */
public abstract class Figure {
    /**
     * рассчитать площадь
     */
    public abstract double calculateArea();
    /**
     * расчитать периметр
     */
    public abstract double calculatePerimeter();

}
