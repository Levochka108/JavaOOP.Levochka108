package com.levochka108.oop.ui.model.abstractmodel;

public  abstract class Figure implements Comparable<Figure> {
    public abstract double getArea();

    @Override
    public int compareTo(Figure o) {
        return Double.compare(this.getArea(), o.getArea());
    }
}
