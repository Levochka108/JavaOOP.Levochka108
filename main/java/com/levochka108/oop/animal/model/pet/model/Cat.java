package com.levochka108.oop.animal.model.pet.model;


import com.levochka108.oop.animal.model.pet.model.coloreyes.ColorEyesPet;
import com.levochka108.oop.animal.model.interfaces.ipet.IPet;
import com.levochka108.oop.animal.model.pet.model.voice.VoiceCat;

import java.util.Calendar;
import java.util.Date;

public class Cat implements IPet {
    private  boolean haveWool;
    private String ginger;
    private String leva;
    private String growthCat;
    private String weightCat;
    public boolean isHaveWool() {
        return true;
    }
    public boolean isNoWool(){
        return false;
    }


    @Override
    public String namePet() {
        return leva;
    }

    @Override
    public String breedPet() {
        return null;
    }

    @Override
    public String animalHabits() {
        return null;
    }

    @Override
    public String coatColor() {
        return ginger;
    }

    @Override
    public Date birthData() {
        return new Date(111, Calendar.FEBRUARY,11);
    }

    @Override
    public void showAffection() {
        System.out.println("Любит поспать, покушать мнямс, своенравный характей, пугливый.");
    }

    @Override
    public String animalGrowth() {
        return growthCat = String.valueOf(25);
    }

    @Override
    public String animalWeight() {
        return String.valueOf(5);
    }

    @Override
    public String animalEyeColor() {
        return String.valueOf(ColorEyesPet.PASTELGREEN);
    }

    @Override
    public void getVoice(String vice) {
        IPet.super.getVoice(String.valueOf(VoiceCat.MEOW));
    }

    @Override
    public void showInfo(String info) {
        IPet.super.showInfo(info);
    }

    public String getGrowthCat() {
        return growthCat;
    }

    public void setGrowthCat(String growthCat) {
        this.growthCat = growthCat;
    }
}
