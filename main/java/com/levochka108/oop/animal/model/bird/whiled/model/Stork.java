package com.levochka108.oop.animal.model.bird.whiled.model;

import com.levochka108.oop.animal.model.bird.Bird;

public class Stork  extends Bird {
    protected Stork(String flight) {
        super(flight);
    }

    @Override
    public int flightAltitude() {
        return 0;
    }
}
