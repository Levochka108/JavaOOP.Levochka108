package main.java.com.levochka108.oop.zoo.model;

/**
 * На языке Java реализовать интерфейс "Животное" со следующими полями:
 * 1.Рост животного
 * 2.Вес животного
 * 3.Цвет глаз животного
 */

public class Animal implements IAnimal {
    private final int heightAnimal;

    private final int weightAnimal;

    private final String colorAnimal;

    public Animal(int heightAnimal, int weightAnimal, String colorAnimal) {
        this.heightAnimal = heightAnimal;
        this.weightAnimal = weightAnimal;
        this.colorAnimal = colorAnimal;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "heightAnimal=" + heightAnimal +
                ", weightAnimal=" + weightAnimal +
                ", colorAnimal='" + colorAnimal + '\'' +
                '}';
    }

    @Override
    public void showInfoAnimal() {

    }

    @Override
    public void getVoice() {

    }
}

