package com.levochka108.oop.ui.model;

import com.levochka108.oop.ui.model.abstractmodel.Figure;
import com.levochka108.oop.ui.model.interfacemodel.CurvedLength;

public class Circle extends Figure implements CurvedLength {
    private final double radius;

    public Circle(double radius) throws Exception {
        if (radius > 0.0) {
            this.radius = radius;
        }
        throw new Exception("Неверное значение радуиса!");
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(radius, 2.0);
    }

    @Override
    public double getLength() {
        return 2.0 * Math.PI * radius;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || obj.getClass() != this.getClass())
            return false;
        return this.radius == ((Circle) obj).getRadius();
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + "{" +
                "Радиус=" + radius +
                ", Длина окружности=" + getLength() +
                ", Площадь=" + getArea() +
                '}';

    }
}