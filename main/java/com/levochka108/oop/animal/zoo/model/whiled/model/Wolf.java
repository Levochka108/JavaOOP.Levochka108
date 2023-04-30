package com.levochka108.oop.animal.zoo.model.whiled.model;

import com.levochka108.oop.animal.zoo.model.interfaces.iwhiled.IWhiled;
import com.levochka108.oop.animal.zoo.model.whiled.model.coloreyes.ColorEyesWhiled;

import java.time.LocalDate;


public class Wolf implements IWhiled {
    private String name;
    private double height;
    private double weight;
    private String eyeColor;
    private String habitat;
    private LocalDate dateOfDiscovery;
    private boolean isPackLeader;

    public Wolf(String nameWolf, double height, double weight, String eyeColor, String habitat,
                LocalDate dateOfDiscovery, boolean wolfLeader) {
        this.height = height;
        this.weight = weight;
        this.eyeColor = eyeColor;
        this.habitat = habitat;
        this.dateOfDiscovery = dateOfDiscovery;
        this.name = nameWolf;
        this.isPackLeader = wolfLeader;
    }

    public double getHeight() {
        return height;
    }

    public double getWeight() {
        return weight;
    }

    public String getEyeColor() {
        return String.valueOf(ColorEyesWhiled.PASTELGREEN);
    }

    public String getHabitat() {
        return habitat;
    }

    public LocalDate getDateOfDiscovery() {
        return dateOfDiscovery;
    }

    public void setPackLeader(boolean isPackLeader) {
        this.isPackLeader = isPackLeader;
    }

    public boolean isPackLeader() {
        return isPackLeader;
    }

    public void makeSound() {
        System.out.println(name + " Aooooooo!");
    }

    public void printInfo() {
        System.out.println("Name: " + name);
        System.out.println("Height: " + getHeight() + " cm");
        System.out.println("Weight: " + getWeight() + " kg");
        System.out.println("Eye color: " + getEyeColor());
        System.out.println("Habitat: " + getHabitat());
        System.out.println("Date of discovery: " + getDateOfDiscovery());
    }

}

