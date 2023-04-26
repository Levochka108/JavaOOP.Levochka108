package com.levochka108.oop.animal.model.whiled.model;

import com.levochka108.oop.animal.model.whiled.IWhiled;

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
        return null;
    }

    @Override
    public void getVoice(String vice) {
        IWhiled.super.getVoice("Awwwwwwwww");
    }

    @Override
    public void showInfo(String info) {
        IWhiled.super.showInfo(info);
    }
}
