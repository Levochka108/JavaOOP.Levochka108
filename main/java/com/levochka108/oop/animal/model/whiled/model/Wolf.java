package com.levochka108.oop.animal.model.whiled.model;

import com.levochka108.oop.animal.model.interfaces.iwhiled.IWhiled;
import com.levochka108.oop.animal.model.whiled.model.coloreyes.ColorEyesWhiled;
import com.levochka108.oop.animal.model.whiled.model.voice.VoiceWolf;

public class Wolf implements IWhiled {
    private final boolean wolfLeader;

    public boolean isWolfLeader(boolean isThisWolfLeader) {
        return isThisWolfLeader;
    }

    public Wolf(boolean wolfLeader) {
        this.wolfLeader = wolfLeader;
    }

    @Override
    public String nameWiledAnimal() {
        return null;
    }

    @Override
    public String placeOfResidence() {
        return null;
    }

    @Override
    public String dateFound() {
        return null;
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
        return String.valueOf(ColorEyesWhiled.BROWN);
    }

    @Override
    public void getVoice(String vice) {
        IWhiled.super.getVoice(String.valueOf(VoiceWolf.Woof));
    }

    @Override
    public void showInfo(String info) {
        IWhiled.super.showInfo(info);
    }
}
