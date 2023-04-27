package com.levochka108.oop.animal.zoo.model.interfaces.iwhiled;

import com.levochka108.oop.animal.zoo.model.interfaces.IAnimal;

import java.util.Date;

public interface IWhiled extends IAnimal {
    String nameWiledAnimal();
    String placeOfResidence();

    Date dateFound();

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
