package com.levochka108.oop.carpark;

public class Bicycle extends Vehicle {


    public Bicycle(String valueColour, int valueWheel, double valueWeight, double valueSpeed) {
        super(valueColour, 2, valueWeight, 15);
    }

    @Override
    public void motionVehicleStraightAhead() {
        super.motionVehicleStraightAhead();
    }
}
