package com.levochka108.oop.animal.model.bird;

public abstract class Bird {
    private final String flight;

    public String getFlight() {
        return flight;
    }

    protected Bird(String flight) {
        this.flight = flight;
    }

    public String flight( int x) {
        x = this.flightAltitude();
        String rs = String.valueOf(x);
        return "Я лечу на " + rs + " метрах, где " + rs + "- высота полета";
    }

    public abstract int flightAltitude();
}
