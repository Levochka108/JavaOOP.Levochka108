package com.levochka108.oop.animal.model.interfaces.ipet;

import com.levochka108.oop.animal.model.interfaces.IAnimal;

import java.util.Date;

public interface IPet extends IAnimal {
    String namePet();

    String breedPet();

    boolean animalVaccination();

    String coatColor();

    Date birthData();

    void showAffection();

    @Override
    int animalGrowth();

    @Override
    int animalWeight();

    @Override
    String animalEyeColor();

    @Override
    default void getVoice(String vice) {
        IAnimal.super.getVoice(vice);
    }

    @Override
    default void showInfo(String info) {
        IAnimal.super.showInfo(info);
    }
}
