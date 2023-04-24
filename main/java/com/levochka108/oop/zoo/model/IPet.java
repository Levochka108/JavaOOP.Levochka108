package main.java.com.levochka108.oop.zoo.model;

import java.util.Date;

public interface IPet extends IAnimal{
    String namePet();
    String breedPet();
    String animalHabits();
    String coatColor();
    Date birthData();

    void showAffection();
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
