package com.levochka108.oop.animal.zoo.model.interfaces.ipet;
import com.levochka108.oop.animal.zoo.model.interfaces.IAnimal;

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
    default void getVoice() {
        IAnimal.super.getVoice();
    }

    @Override
    default void showInfo() {
        IAnimal.super.showInfo();
    }

}
