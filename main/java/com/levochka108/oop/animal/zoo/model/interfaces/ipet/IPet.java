package com.levochka108.oop.animal.zoo.model.interfaces.ipet;


import com.levochka108.oop.animal.zoo.model.interfaces.IAnimal;

import java.time.LocalDate;

public interface IPet extends IAnimal {
    String getName();
    String getBreed();
    boolean hasVaccinations();
    String getFurColor();
    LocalDate getBirthDate();
    void showAffection();
}