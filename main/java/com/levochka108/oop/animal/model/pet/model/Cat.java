package com.levochka108.oop.animal.model.pet.model;


import com.levochka108.oop.animal.model.interfaces.ipet.IPet;
import com.levochka108.oop.animal.model.pet.Pet;
import com.levochka108.oop.animal.model.pet.model.coloreyes.ColorEyesPet;
import com.levochka108.oop.animal.model.pet.model.voice.VoiceCat;

import java.util.Calendar;
import java.util.Date;

public class Cat extends Pet implements IPet {
    private final String breedPet;
    private boolean haveWool;
    private String colorPet;
    private String name;
    private String growthCat;
    private String weightCat;

    private String vaccinationPet;

    public boolean isHaveWool() {
        return true;
    }

    public boolean isNoWool() {
        return false;
    }

    public Cat(String petName,String petBreed, boolean petWool, String petColor, String petGrowth, String petWeight) {
        this.haveWool = petWool;
        this.colorPet = petColor;
        this.name = petName;
        this.growthCat = petGrowth;
        this.weightCat = petWeight;
        this.breedPet = petBreed;
    }

    @Override
    public String namePet() {
        return name;
    }

    @Override
    public String breedPet() {
        return breedPet;
    }

    @Override
    public boolean animalVaccination() {
        return false;
    }

    @Override
    public String coatColor() {
        return colorPet;
    }

    @Override
    public Date birthData() {
        return new Date(111, Calendar.FEBRUARY, 11);
    }

    @Override
    public void showAffection() {
        System.out.println("Любит поспать, покушать мнямс, своенравный характей, пугливый.");
    }

    @Override
    public int animalGrowth() {
        return 0;
    }

    @Override
    public int animalWeight() {
        return 0;
    }


    @Override
    public String animalEyeColor() {
        return String.valueOf(ColorEyesPet.PASTELGREEN);
    }

    @Override
    public void getVoice(String vice) {
        IPet.super.getVoice(String.valueOf(VoiceCat.MEOW));
    }

    @Override
    public void showInfo(String info) {
        IPet.super.showInfo(info);
    }

    public String getGrowthCat() {
        return growthCat;
    }

    public void setGrowthCat(String growthCat) {
        this.growthCat = growthCat;
    }

    @Override
    public void devotion() {
        System.out.println("Преданно люблю хозяина.");
    }
}
