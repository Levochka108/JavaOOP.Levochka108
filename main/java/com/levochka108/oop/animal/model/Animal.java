package com.levochka108.oop.animal.model;


import com.levochka108.oop.animal.model.interfaces.IAnimal;

public abstract class Animal implements IAnimal {
    IAnimal animal;
    protected Animal() {
        animal = new IAnimal() {
            @Override
            public String animalGrowth() {
                return null;
            }

            @Override
            public String animalWeight() {
                return null;
            }

            @Override
            public String animalEyeColor() {
                return null;
            }

            @Override
            public void getVoice(String vice) {
                IAnimal.super.getVoice(vice);
            }

            @Override
            public void showInfo(String info) {
                IAnimal.super.showInfo(info);
            }
        };
    }
    @Override
    public String toString() {
        return "Животное имеет{ Рост: " + animal.animalGrowth() + ", Вес: " + animal.animalWeight() + ", Цвет глаз: " + animal.animalEyeColor() + "}";
    }

}
