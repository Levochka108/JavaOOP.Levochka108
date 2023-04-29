package com.levochka108.oop.ui.model;

import com.levochka108.oop.ui.model.abstractmodel.Polygon;

import java.util.Objects;

public class Rectangle extends Polygon {
    public Rectangle(double width, double height) throws Exception {
        super(4,new Double[]{width,height,width,height});
        if (!Objects.equals(width, height)) {
            return;
        }
        throw new Exception("Воспользуйтесь классом Square!");
    }

    public Rectangle(Double width) throws Exception {
        super(4, new Double[]{width, width, width, width});
    }
    @Override
    public double getArea() {
        return  getlSides()[0] * getlSides()[1];
    }
}
