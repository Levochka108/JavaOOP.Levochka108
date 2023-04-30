package com.levochka108.oop.animal.zoo.model.bird.pet.model;

import com.levochka108.oop.animal.zoo.model.bird.Bird;
import com.levochka108.oop.animal.zoo.model.bird.coloreyes.ColorEyesBird;
import com.levochka108.oop.animal.zoo.model.interfaces.ipet.IPet;

import java.time.LocalDate;


public class Chicken extends Bird implements IPet {
    private String name;
    private double height;
    private double weight;
    private String eyeColor;

    private boolean vaccinations;
    private LocalDate birthDate;

    public Chicken(LocalDate chickenBirthDate,String chickenName, double chickenHeight, double chickenWeight, String chickenColorEye, boolean chickenVaccination, double flightHeight) {
        super(flightHeight);
        this.name = chickenName;
        this.height = chickenHeight;
        this.weight = chickenWeight;
        this.eyeColor = chickenColorEye;
        this.vaccinations = chickenVaccination;
        this.birthDate = chickenBirthDate;


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
        System.out.println("Cluck cluck");
    }

    @Override
    public void printInfo() {
        System.out.println("Name: " + name);
        System.out.println("Height: " + getHeight() + " cm");
        System.out.println("Weight: " + getWeight() + " kg");
        System.out.println("Eye color: " + getEyeColor());
        System.out.println("Flight height: " + flightHeight + " meters");
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getBreed() {
        String breed = "Нет породы.";
        return breed;
    }

    @Override
    public boolean hasVaccinations() {
        return vaccinations;
    }

    @Override
    public String getFurColor() {
        return null;
    }


    @Override
    public LocalDate getBirthDate() {
        return birthDate;
    }

    @Override
    public void showAffection() {
        System.out.println("Hen clucks and key performer from the hands of the owner.");

    }
}


