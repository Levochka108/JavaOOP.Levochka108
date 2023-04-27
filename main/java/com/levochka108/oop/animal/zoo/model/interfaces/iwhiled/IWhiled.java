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
    default void getVoice(String vice) {
        IAnimal.super.getVoice(vice);
    }

    @Override
    default void showInfo(String info) {
        IAnimal.super.showInfo(info);
    }
}
