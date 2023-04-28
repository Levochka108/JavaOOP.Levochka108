package com.levochka108.oop.animal.zoo.model.whiled.model;

import com.levochka108.oop.animal.zoo.model.interfaces.iwhiled.IWhiled;
import com.levochka108.oop.animal.zoo.model.whiled.model.coloreyes.ColorEyesWhiled;
import com.levochka108.oop.animal.zoo.model.whiled.model.voice.VoiceTiger;

import java.util.Date;

public class Tiger implements IWhiled {
    private final String nameWhiledAnimal;

    private final String placeResidence;

    private final Date dateFoundWhiledAnimal;

    private final int animalGrowth;
     private final  int animalWeight;

    public Tiger(String nameAnimal, String residenceAnimal, Date dateFoundAnimal, int growthAnimal,int weightAnimal ) {
        this.nameWhiledAnimal = nameAnimal;
        this.placeResidence = residenceAnimal;
        this.dateFoundWhiledAnimal = dateFoundAnimal;
        this.animalGrowth = growthAnimal;
        this.animalWeight = weightAnimal;

    }

    @Override
    public String nameWiledAnimal() {
        return nameWhiledAnimal;
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
        ;
    }
}
