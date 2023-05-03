package com.levochka108.newcalculate.model;

public class SumModel extends CalculateModel {

    public SumModel() {

    }

    @Override
    public int result() {
        return x + y;
    }

    @Override
    public void setObjectX(int value) {
        super.x = value;
    }

    @Override
    public void setObjectY(int value) {
        super.y = value;
    }
}
