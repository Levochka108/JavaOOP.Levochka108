package com.levochka108.oop.animal.zoo.model.interfaces.iwhiled;

import com.levochka108.oop.animal.zoo.model.interfaces.IAnimal;

import java.time.LocalDate;


public interface IWhiled extends IAnimal {
    String getHabitat();
    LocalDate getDateOfDiscovery();
}
