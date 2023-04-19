package com.levochka108.oop.carpark;

public class Car extends Vehicle {


    public Car(String valueColour, int valueWheel, double valueWeight, double valueSpeed) {
        super(valueColour, 4, valueWeight, 60);
    }

    @Override
    public void motionVehicleStraightAhead() {
        super.motionVehicleStraightAhead();
    }
}
