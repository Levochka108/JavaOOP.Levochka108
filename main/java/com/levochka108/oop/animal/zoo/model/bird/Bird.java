package com.levochka108.oop.animal.zoo.model.bird;

public abstract class Bird {
    private final String flight;

    public String getFlight() {
        return flight;
    }

    protected Bird(String flight) {
        this.flight = flight;
    }

    public String toFlight( int x) {
        x = this.flightAltitude();
        String pointX = String.valueOf(x);
        return "Я лечу на " + pointX + " метрах, где " + pointX + "- высота полета";
    }

    public abstract int flightAltitude();

}
