package main.java.com.levochka108.oop.zoo.model;

public interface IAnimal {
    default String showInfoAnimal() {
        return null;
    }
    void getVoice();

}
