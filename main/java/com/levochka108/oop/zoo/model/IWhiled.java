package main.java.com.levochka108.oop.zoo.model;

public interface IWhiled extends IAnimal{
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
