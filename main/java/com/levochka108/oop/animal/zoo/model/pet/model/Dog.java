package com.levochka108.oop.animal.zoo.model.pet.model;

import com.levochka108.oop.animal.zoo.model.interfaces.ipet.IPet;
import com.levochka108.oop.animal.zoo.model.pet.Pet;
import com.levochka108.oop.animal.zoo.model.pet.model.coloreyes.ColorEyesPet;
import com.levochka108.oop.animal.zoo.model.pet.model.voice.VoiceDog;

import java.util.Date;

public class Dog extends Pet implements IPet {

    private final String namePet;
    private final Date datePet;

    private final String breedPet;

    private final String colorPet;
    private final boolean vaccinationPet;
    private final boolean educatedDog;

    private final boolean trainingThisDog;


    public Dog(String petName, Date petDate, String breed, String petColor, boolean vaccination, boolean petEducated, boolean dogTraining) {
        this.educatedDog = petEducated;
        this.trainingThisDog = dogTraining;
        this.namePet = petName;
        this.datePet = petDate;
        this.breedPet = breed;
        this.colorPet = petColor;
        this.vaccinationPet = vaccination;

    }

    public boolean thisDogIsEducated() {
        return educatedDog;
    }

    public boolean thisDogIsTrained() {
        return trainingThisDog;
    }

    @Override
    public String namePet() {
        return namePet;
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
        return String.valueOf(ColorEyesPet.BROWN);
    }

    @Override
    public void getVoice() {
        System.out.println(VoiceDog.GAW);
    }

    @Override
    public void showInfo() {

    }

    @Override
    public void devotion() {
        System.out.println("Предан только одному хозяну, люблю с ним играит и гулять.");
    }
}
