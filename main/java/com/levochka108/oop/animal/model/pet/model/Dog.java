package com.levochka108.oop.animal.model.pet.model;

import com.levochka108.oop.animal.model.pet.IPet;

import java.util.Date;

public class Dog implements IPet {
    private boolean educatedDog;

    private boolean trainThisDog;

    public Dog(boolean educatedDog, boolean trainThisDog) {
        this.educatedDog = educatedDog;
        this.trainThisDog = trainThisDog;
    }

    public boolean isEducatedDog() {
        return educatedDog;
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

    public void setTrainThisDog(boolean trainThisDog) {
        this.trainThisDog = trainThisDog;
    }
}
