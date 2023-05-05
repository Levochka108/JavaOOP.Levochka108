package com.levochka108.oop.animal.zoo.model.pet.model;

import com.levochka108.oop.animal.zoo.model.interfaces.ipet.IPet;
import com.levochka108.oop.animal.zoo.model.pet.model.coloreyes.ColorEyesPet;

import java.time.LocalDate;


public class Dog implements IPet {
    private String name;
    private double height;
    private double weight;
    private String eyeColor;
    private String breed;
    private boolean hasVaccinations;
    private String furColor;
    private LocalDate dateOfBirth;
    private boolean isTrained;

    public Dog(String nameDog, double height, double weight, String eyeColor, String breed,
               boolean hasVaccinations, String furColor, LocalDate dateOfBirth, boolean trainedDog) {
        this.height = height;
        this.weight = weight;
        this.eyeColor = eyeColor;
        this.breed = breed;
        this.hasVaccinations = hasVaccinations;
        this.furColor = furColor;
        this.dateOfBirth = dateOfBirth;
        this.name = nameDog;
        this.isTrained = trainedDog;
    }

    public double getHeight() {
        return height;
    }

    public double getWeight() {
        return weight;
    }

    public String getEyeColor() {
        return String.valueOf(ColorEyesPet.BROWN);
    }

    @Override
    public String getName() {
        return name;
    }

    public String getBreed() {
        return breed;
    }

    public boolean hasVaccinations() {
        return hasVaccinations;
    }

    public String getFurColor() {
        return furColor;
    }

    @Override
    public LocalDate getBirthDate() {
        return dateOfBirth;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    @Override
    public void makeSound() {
        System.out.println(name+" Woof!");
    }

    public void train() {
        isTrained = true;
        System.out.println(getName() + " has been trained!");
    }

    @Override
    public void printInfo() {
        System.out.println("Name: " + name);
        System.out.println("Height: " + getHeight() + " cm");
        System.out.println("Weight: " + getWeight() + " kg");
        System.out.println("Eye color: " + getEyeColor());
        System.out.println("Breed: " + getBreed());
        System.out.println("Has vaccinations: " + hasVaccinations());
        System.out.println("Fur color: " + getFurColor());
        System.out.println("Date of birth: " + getDateOfBirth());
        train();
    }

    public void showAffection() {
        System.out.println("The dog wags its tail and nuzzles your hand.");
    }
}
