package com.levochka108.oop.animal.zoo;

import com.levochka108.oop.animal.zoo.model.interfaces.IAnimal;

import java.util.ArrayList;

public class Zoo {
    private ArrayList<IAnimal> animals;

    public Zoo() {
        animals = new ArrayList<IAnimal>();
    }

    public void addAnimal(IAnimal animal) {
        animals.add(animal);
    }

    public boolean removeAnimal(int index) {
        animals.remove(index);
        return false;
    }

    public IAnimal getAnimal(int index) {
        return animals.get(index);
    }

    public void makeAnimalSound(int index) {
        IAnimal animal = animals.get(index);
        animal.makeSound();
    }

    public void makeAllAnimalsSound() {
        for (IAnimal animal : animals) {
            animal.makeSound();
        }
    }

    public void printAllAnimals() {
        for (int i = 0; i < animals.size(); i++) {
            System.out.println((i + 1) + ". " + animals.get(i).toString());
        }
    }


}