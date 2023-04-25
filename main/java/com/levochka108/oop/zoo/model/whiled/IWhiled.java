package com.levochka108.oop.zoo.model.whiled;

import com.levochka108.oop.zoo.model.IAnimal;

public interface IWhiled extends IAnimal {
    String nameWiledAnimal();
    String placeOfResidence();

    String dateFound();

    @Override
    String animalGrowth();

    @Override
    String animalWeight();

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
