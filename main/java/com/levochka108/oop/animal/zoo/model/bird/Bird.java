package com.levochka108.oop.animal.zoo.model.bird;

import com.levochka108.oop.animal.zoo.model.interfaces.IAnimal;

public abstract class Bird implements IAnimal {
    protected double flightHeight;

    protected Bird(double flightHeight) {
        this.flightHeight = flightHeight;
    }

    public void fly() {
        System.out.println("I'm flying at " + flightHeight + " meters");
    }

    @Override
    public double getHeight() {
        return 0;
    }

    @Override
    public double getWeight() {
        return 0;
    }

    @Override
    public String getEyeColor() {
        return null;
    }

    @Override
    public void makeSound() {

    }

    @Override
    public void printInfo() {

    }
}
