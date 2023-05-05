package main.java.com.levochka108.oop.zoo.model.pet.model;

import main.java.com.levochka108.oop.zoo.model.IPet;
import main.java.com.levochka108.oop.zoo.model.pet.Pet;

import java.util.Date;

public class Cat extends Pet implements IPet {


    public Cat(int heightAnimal, int weightAnimal, String colorAnimal, String namePet, String breedPet, String habitsPet, String colorPet, Date datePet) {
        super(heightAnimal, weightAnimal, colorAnimal, namePet, breedPet, habitsPet, colorPet, datePet);
    }

    @Override
    public void showInfo() {
        System.out.println();

    }

    @Override
    public String namePet() {
        return null;
    }

    @Override
    public String breedPet() {
        return null;
    }

    @Override
    public String animalHabits() {
        return null;
    }

    @Override
    public String coatColor() {
        return null;
    }

    @Override
    public Date birthData() {
        return null;
    }

    @Override
    public void showAffection() {

    }

    @Override
    public String animalGrowth() {
        return null;
    }

    @Override
    public String animalWeight() {
        return null;
    }

    @Override
    public String animalEyeColor() {
        return null;
    }

    @Override
    public void getVoice(String vice) {
        IPet.super.getVoice(vice);
    }

    @Override
    public void showInfo(String info) {
        IPet.super.showInfo(info);
    }
}
