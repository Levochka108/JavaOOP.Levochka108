package com.levochka108.oop.ui.model.abstractmodel;

import com.levochka108.oop.ui.model.interfacemodel.Perimeter;

import java.util.Arrays;
import java.util.List;

public abstract class Polygon extends Figure implements Perimeter {
    private final Integer nSides;

    private final List<Double> lSides;

    public Polygon(Integer nSides, Double[] lSides) throws Exception {
        if (nSides == null || nSides <= 0)
            throw new Exception("Неверное количество граней!");
        this.nSides = nSides;
        for (Double len : lSides) {
            if (len == null || len <= 0.0)
                throw new Exception("Неверное значение размера грани!");
        }
        this.lSides = Arrays.stream(lSides).toList();
    }

    public Double[] getlSides() {
        Double[] dblArray = new Double[lSides.size()];
        dblArray = lSides.toArray(dblArray);
        return dblArray;
    }


    @Override
    public Double getPerimeter() {
        Double result = 0.0;
        for (Double side : lSides) {
            result += side;
        }
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || obj.getClass() != this.getClass())
            return false;
        boolean result = true;
        for (int i = 0; i < this.nSides; i++) {
            result &= (((Polygon) obj).getlSides()[i].equals(lSides.get(i)));
        }
        return result;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + "{" +
                "Количество сторон=" + nSides +
                ", Длины сторон=" + lSides +
                ", Периметр=" + this.getPerimeter() +
                ", Площадь=" + getArea() +
                '}';
    }
}

