package com.levochka108.oop.animal.zoo.model.whiled.model;

import com.levochka108.oop.animal.zoo.model.interfaces.iwhiled.IWhiled;


import java.time.LocalDate;


public class Tiger implements IWhiled {
    private String name;
    private double height;
    private double weight;
    private String eyeColor;
    private String habitat;
    private LocalDate dateOfDiscovery;

    public Tiger(String nameTiger,double height, double weight, String eyeColor, String habitat,
                 LocalDate dateOfDiscovery) {
        this.height = height;
        this.weight = weight;
        this.eyeColor = eyeColor;
        this.habitat = habitat;
        this.dateOfDiscovery = dateOfDiscovery;
        this.name = nameTiger;
    }

    public double getHeight() { return height; }
    public double getWeight() { return weight; }
    public String getEyeColor() { return eyeColor; }

    @Override
    public void makeSound() {
        System.out.println(name+" Roar!");
    }

    @Override
    public void printInfo() {
        System.out.println("Height: " + getHeight() + " cm");
        System.out.println("Weight: " + getWeight() + " kg");
        System.out.println("Eye color: " + getEyeColor());
        System.out.println("Habitat: " + getHabitat());
        System.out.println("Date of discovery: " + getDateOfDiscovery());

    }

    public String getHabitat() { return habitat; }
    public LocalDate getDateOfDiscovery() { return dateOfDiscovery;}

}
