package com.levochka108.oop.animal.model.interfaces;

/**
 * На языке Java реализовать интерфейс "Животное" со следующими полями:
 * 1.Рост животного
 * 2.Вес животного
 * 3.Цвет глаз животного
 */
public interface IAnimal {
    int animalGrowth();

    int animalWeight();

    String animalEyeColor();

    default void getVoice(String vice) {
        System.out.println("Animal voice: " + vice);
    }

    default void showInfo(String info) {
        System.out.println(info);
    }
}
