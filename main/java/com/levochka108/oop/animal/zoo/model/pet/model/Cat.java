package com.levochka108.oop.animal.zoo.model.pet.model;


import com.levochka108.oop.animal.zoo.model.interfaces.ipet.IPet;
import com.levochka108.oop.animal.zoo.model.pet.model.coloreyes.ColorEyesPet;

import java.time.LocalDate;

public class Cat implements IPet {
    private double height;
    private double weight;
    private String eyeColor;
    private String name;
    private String breed;
    private boolean vaccinations;
    private String furColor;
    private LocalDate birthDate;

    public Cat(String name,LocalDate catBDate, double height, double weight, String eyeColor,  String breed, String furColor,
               boolean vaccinations) {
        this.height = height;
        this.weight = weight;
        this.eyeColor = eyeColor;
        this.name = name;
        this.breed = breed;
        this.vaccinations = vaccinations;
        this.furColor = furColor;
        this.birthDate = catBDate;
    }

    public double getHeight() {
        return height;
    }

    public double getWeight() {
        return weight;
    }

    public String getEyeColor() {
        return String.valueOf(ColorEyesPet.PASTELGREEN);
    }

    public String getName() {
        return name;
    }

    public String getBreed() {
        return breed;
    }

    public boolean hasVaccinations() {
        return vaccinations;
    }

    public String getFurColor() {
        return furColor;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void showAffection() {
        System.out.println(name + " purrs and rubs against your leg.");
    }

    public void makeSound() {
        System.out.println(name + " Meows!");
    }

    public void printInfo() {
        System.out.println("Cat:");
        System.out.println("Name: " + name);
        System.out.println("Breed: " + breed);
        System.out.println("Height: " + height + " cm");
        System.out.println("Weight: " + weight + " kg");
        System.out.println("Eye color: " + eyeColor);
        System.out.println("Fur color: " + furColor);
        System.out.println("Birth date: " + birthDate);
        System.out.println("Vaccinations: " + (vaccinations ? "Yes" : "No"));
    }
}

