package com.levochka108.oop.animal.zoo.model.bird.whiled.model;

import com.levochka108.oop.animal.zoo.model.bird.Bird;
import com.levochka108.oop.animal.zoo.model.bird.coloreyes.ColorEyesBird;
import com.levochka108.oop.animal.zoo.model.interfaces.iwhiled.IWhiled;

import java.time.LocalDate;

public class Stork extends Bird implements IWhiled {
    private String name;
    private double height;

    private double weight;

    private String habitat;

    private LocalDate dateOfDiscovery;

    public Stork(String storkName, double storkHeight, double storkWeight, String storkHabitat, double flightHeight, LocalDate storkDateOfDiscovery) {
        super(flightHeight);
        this.name = storkName;
        this.height = storkHeight;
        this.weight = storkWeight;
        this.habitat = storkHabitat;
        this.dateOfDiscovery = storkDateOfDiscovery;
    }

    @Override
    public double getHeight() {
        return height;
    }

    @Override
    public double getWeight() {
        return weight;
    }

    @Override
    public String getEyeColor() {
        return String.valueOf(ColorEyesBird.BROWN);
    }

    @Override
    public void makeSound() {
        System.out.println("Taps its beak.");
    }

    @Override
    public void printInfo() {
        System.out.println("Name: " + name);
        System.out.println("Habitat: " + habitat);
        System.out.println("Date of discovery: " + dateOfDiscovery);
        System.out.println("Height: " + getHeight() + " cm");
        System.out.println("Weight: " + getWeight() + " kg");
        System.out.println("Eye color: " + getEyeColor());
        System.out.println("Flight height: " + flightHeight + " meters");
    }

    @Override
    public String getHabitat() {
        return habitat;
    }

    @Override
    public LocalDate getDateOfDiscovery() {
        return dateOfDiscovery;
    }
}
