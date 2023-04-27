package com.levochka108.oop.animal.model.bird.pet.model;

import com.levochka108.oop.animal.model.bird.Bird;
import com.levochka108.oop.animal.model.bird.pet.model.coloreyes.ColorEyesBird;
import com.levochka108.oop.animal.model.bird.pet.model.voice.VoiceChicken;
import com.levochka108.oop.animal.model.interfaces.ipet.IPet;

import java.util.Calendar;
import java.util.Date;

public class Chicken extends Bird implements IPet {

    private final String namePet;

    private final String breedPet;

    private final boolean vaccinationPet;

    private final String showAffectionPet;

    private final int growthPet;

    private final int weightPet;

    protected Chicken(String name, String breed, boolean vaccination,String affection,int growth,int weight,String flightChicken) {
        super(flightChicken);
        this.namePet = name;
        this.breedPet = breed;
        this.vaccinationPet = vaccination;
        this.showAffectionPet = affection;
        this.growthPet = growth;
        this.weightPet = weight;
    }

    @Override
    public int flightAltitude() {
        return 3;
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
        return null;
    }


    @Override
    public Date birthData() {
        return new Date(123, Calendar.JULY, 26);
    }

    @Override
    public void showAffection() {
        String show = showAffectionPet;
    }

    @Override
    public int animalGrowth() {
        return growthPet;
    }


    @Override
    public int animalWeight() {
        return weightPet;
    }

    @Override
    public String animalEyeColor() {
        return String.valueOf(ColorEyesBird.BROWN);
    }

    @Override
    public void getVoice(String vice) {
        IPet.super.getVoice(String.valueOf(VoiceChicken.KoKoKo));
    }

    @Override
    public void showInfo(String info) {
        IPet.super.showInfo(info);
    }
}
