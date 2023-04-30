package com.levochka108.oop.animal.zoo.model.interfaces;

/**
 * На языке Java реализовать интерфейс "Животное" со следующими полями:
 * 1.Рост животного
 * 2.Вес животного
 * 3.Цвет глаз животного
 */
public interface IAnimal {
    double getHeight();
    double getWeight();
    String getEyeColor();
    void makeSound();
    void printInfo();

}
