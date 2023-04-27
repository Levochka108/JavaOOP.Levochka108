package com.levochka108.oop.animal.zoo.model.bird.pet.model;

import com.levochka108.oop.animal.zoo.model.bird.Bird;
import com.levochka108.oop.animal.zoo.model.bird.coloreyes.ColorEyesBird;
import com.levochka108.oop.animal.zoo.model.bird.voice.Voice;
import com.levochka108.oop.animal.zoo.model.interfaces.ipet.IPet;


import java.util.Date;

public class Chicken extends Bird implements IPet {

    private final String namePet;
    private final Date datePet;

    private final String breedPet;

    private final boolean vaccinationPet;

    private final String showAffectionPet;

    private final int growthPet;

    private final int weightPet;

    protected Chicken(String name, Date petDate,boolean vaccination, String breed, String affection, int growth, int weight, String flightChicken) {
        super(flightChicken);
        this.namePet = name;
        this.datePet = petDate;
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
        return datePet;
    }

    @Override
    public void showAffection() {
        System.out.println(showAffectionPet);
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
    public void getVoice() {
        System.out.println(Voice.KoKoKo);
    }

    @Override
    public void showInfo() {

        System.out.println("Курица домашняя{" +
                "Имя='" + namePet + '\'' +
                ", дата рождения=" + datePet +
                ", порода курицы='" + breedPet + '\'' +
                ", наличие прививок=" + vaccinationPet +
                ", повадки жевотного='" + showAffectionPet + '\'' +
                ", рост птицы=" + growthPet +
                ", вес птицы=" + weightPet +
                ", цвет глаз курицы=" + animalEyeColor()+
                ", высота полета птицы=" + flightAltitude() +
                '}');
    }
}
