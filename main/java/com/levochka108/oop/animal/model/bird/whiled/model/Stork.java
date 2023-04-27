package com.levochka108.oop.animal.model.bird.whiled.model;

import com.levochka108.oop.animal.model.bird.Bird;
import com.levochka108.oop.animal.model.interfaces.IAnimal;

public class Stork  extends Bird  implements IAnimal {
    protected Stork(String flight) {
        super(flight);
    }

    @Override
    public int flightAltitude() {
        return 0;
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
        IAnimal.super.getVoice(vice);
    }

    @Override
    public void showInfo(String info) {
        IAnimal.super.showInfo(info);
    }
}
