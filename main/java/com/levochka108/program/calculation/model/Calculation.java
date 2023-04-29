package com.levochka108.program.calculation.model;

public class Calculation {
    private final Number number1;
    private final Number number2;

    public Calculation(Number num1, Number num2){
        this.number1 = num1;
        this.number2 = num2;
    }

    public Number add(){
        if(number1 instanceof Integer && number2 instanceof Integer){
            return number1.intValue() + number2.intValue();
        }else {
            return number1.doubleValue() + number2.doubleValue();
        }
    }
}
