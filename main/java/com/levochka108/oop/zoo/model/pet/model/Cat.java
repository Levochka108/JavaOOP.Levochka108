package main.java.com.levochka108.oop.zoo.model.pet.model;

import main.java.com.levochka108.oop.zoo.model.pet.Pet;

import java.util.Date;

public class Cat extends Pet {


    public Cat(int heightAnimal, int weightAnimal, String colorAnimal, String namePet, String breedPet, String habitsPet, String colorPet, Date datePet) {
        super(heightAnimal, weightAnimal, colorAnimal, namePet, breedPet, habitsPet, colorPet, datePet);
    }

    @Override
    public void showInfo() {
        System.out.println();

    }
}
