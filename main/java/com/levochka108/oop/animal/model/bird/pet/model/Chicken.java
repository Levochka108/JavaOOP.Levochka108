package com.levochka108.oop.animal.model.bird.pet.model;

import com.levochka108.oop.animal.model.bird.Bird;

public class Chicken extends Bird  {
    protected Chicken(String flight) {
        super(flight);
    }

    @Override
    public int flightAltitude() {
        return 0;
    }
}
