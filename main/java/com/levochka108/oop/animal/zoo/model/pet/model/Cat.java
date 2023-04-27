package com.levochka108.oop.animal.zoo.model.pet.model;


import com.levochka108.oop.animal.zoo.model.interfaces.ipet.IPet;
import com.levochka108.oop.animal.zoo.model.pet.Pet;
import com.levochka108.oop.animal.zoo.model.pet.model.coloreyes.ColorEyesPet;
import com.levochka108.oop.animal.zoo.model.pet.model.voice.VoiceCat;

import java.util.Date;

public class Cat extends Pet implements IPet {
    private final String breedPet;
    private final boolean woolPet;
    private final String colorPet;
    private final String name;
    private final Date datePet;
    private final int growthCat;
    private final int weightCat;

    private final boolean vaccinationPet;



    public boolean isHaveWool() {
        return woolPet;
    }

    public boolean isNoWool() {
        return woolPet;
    }

    public Cat(String petName,Date petData,boolean vaccination,String petBreed, boolean petWool, String petColor, int petGrowth, int petWeight) {
        this.woolPet = petWool;
        this.colorPet = petColor;
        this.name = petName;
        this.datePet = petData;
        this.vaccinationPet = vaccination;
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
        return vaccinationPet;
    }

    @Override
    public String coatColor() {
        return colorPet;
    }

    @Override
    public Date birthData() {
        return datePet;
    }

    @Override
    public void showAffection() {
        System.out.println("Любит поспать, покушать мнямс, своенравный характей, пугливый.");
    }

    @Override
    public int animalGrowth() {
        return growthCat;
    }

    @Override
    public int animalWeight() {
        return weightCat;
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

    @Override
    public void devotion() {
        System.out.println("Преданно люблю хозяина.");
    }

}
