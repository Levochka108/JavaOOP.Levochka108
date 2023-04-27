package com.levochka108.oop.animal.zoo.model.bird.whiled.model;

import com.levochka108.oop.animal.zoo.model.bird.Bird;
import com.levochka108.oop.animal.zoo.model.interfaces.IAnimal;

public class Stork  extends Bird  implements IAnimal {
    protected Stork(String flight) {
        super(flight);
    }

    @Override
    public int flightAltitude() {
        return 0;
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
        return null;
    }

    @Override
    public void getVoice() {
        IAnimal.super.getVoice();
    }

    @Override
    public void showInfo() {
        IAnimal.super.showInfo();
    }
}
