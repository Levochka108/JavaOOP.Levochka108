package com.levochka108.privat.ex.carpark;

public class Motorcycle extends Vehicle {

    public Motorcycle(String valueColour, int valueWheel, double valueWeight, double valueSpeed) {
        super(valueColour, 2, valueWeight, 60);
    }

    @Override
    public void motionVehicleStraightAhead() {
        super.motionVehicleStraightAhead();
    }
}
