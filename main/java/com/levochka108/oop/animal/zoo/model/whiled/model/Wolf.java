package com.levochka108.oop.animal.zoo.model.whiled.model;

import com.levochka108.oop.animal.zoo.model.interfaces.iwhiled.IWhiled;
import com.levochka108.oop.animal.zoo.model.whiled.model.coloreyes.ColorEyesWhiled;
import com.levochka108.oop.animal.zoo.model.whiled.model.voice.VoiceWolf;

import java.util.Date;

public class Wolf implements IWhiled {
    private final String nameWiledAnimal;

    private final String placeResidence;

    private final Date dateFoundWhiledAnimal;

    private final int animalGrowth;

    private final int animalWeight;
    private final boolean wolfLeader;

    public Wolf(String nameAnimal, String placeResidence, Date dateFoundWhiledAnimal, int animalGrowth, int animalWeight, boolean wolfLeader) {
        this.nameWiledAnimal = nameAnimal;
        this.placeResidence = placeResidence;
        this.dateFoundWhiledAnimal = dateFoundWhiledAnimal;
        this.animalGrowth = animalGrowth;
        this.animalWeight = animalWeight;
        this.wolfLeader = wolfLeader;
    }

    public boolean isWolfLeader() {
        return wolfLeader;
    }


    @Override
    public String nameWiledAnimal() {
        return nameWiledAnimal;
    }

    @Override
    public String placeOfResidence() {
        return placeResidence;
    }

    @Override
    public Date dateFound() {
        return dateFoundWhiledAnimal;
    }

    @Override
    public int animalGrowth() {
        return animalGrowth;
    }

    @Override
    public int animalWeight() {
        return animalWeight;
    }

    @Override
    public String animalEyeColor() {
        return String.valueOf(ColorEyesWhiled.BROWN);
    }

    @Override
    public void getVoice() {
        ;
    }

    @Override
    public void showInfo() {
    }


}

