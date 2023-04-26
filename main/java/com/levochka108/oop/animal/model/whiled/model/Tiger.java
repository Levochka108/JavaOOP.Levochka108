package com.levochka108.oop.animal.model.whiled.model;

import com.levochka108.oop.animal.model.whiled.IWhiled;

public class Tiger implements IWhiled {
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
        IWhiled.super.getVoice(vice);
    }

    @Override
    public void showInfo(String info) {
        IWhiled.super.showInfo(info);
    }
}
