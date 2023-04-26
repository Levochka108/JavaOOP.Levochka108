package com.levochka108.oop.animal.model.pet;

import com.levochka108.oop.animal.model.Animal;

import java.util.Date;

public abstract class Pet extends Animal {
    private final String namePet;
    private final String breedPet;

    private final String habitsPet;

    private final String colorPet;

    private final Date datePet;

    public String getNamePet() {
        return namePet;
    }

    public String getBreedPet() {
        return breedPet;
    }

    public String getHabitsPet() {
        return habitsPet;
    }

    public String getColorPet() {
        return colorPet;
    }

    public Date getDatePet() {
        return datePet;
    }


    public Pet(int heightAnimal, int weightAnimal, String colorAnimal, String namePet, String breedPet, String habitsPet, String colorPet, Date datePet) {
        super(heightAnimal, weightAnimal, colorAnimal);
        this.namePet = namePet;
        this.breedPet = breedPet;
        this.habitsPet = habitsPet;
        this.colorPet = colorPet;
        this.datePet = datePet;
    }

    public abstract void showInfo();
}
