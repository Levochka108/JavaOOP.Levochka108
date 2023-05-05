package com.levochka108.oop.ui.model;


import com.levochka108.oop.ui.model.abstractmodel.Polygon;

public class Triangle extends Polygon {

    public  Triangle(int point) throws Exception{
        super(3, new Double[point]);
    }
    public Triangle(Double a, Double b, Double c) throws Exception {
        super(3, new Double[]{a, b, c});
        if (!(a + b > c && a + c > b && b + c > a))
            throw new Exception("Невозможно создать треугольник с заданными сторонами!");
    }



    @Override
    public double getArea() {
        Double p = super.getPerimeter() / 2;
        // Формула Герона
        return Math.sqrt(p * (p - getlSides()[0]) * (p - getlSides()[1]) * (p - getlSides()[2]));
    }
}

