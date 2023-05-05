package com.levochka108.oop.ui.view.animal;

import com.levochka108.oop.animal.zoo.Zoo;
import com.levochka108.oop.animal.zoo.model.bird.pet.model.Chicken;
import com.levochka108.oop.animal.zoo.model.interfaces.IAnimal;
import com.levochka108.oop.animal.zoo.model.pet.model.Cat;
import com.levochka108.oop.animal.zoo.model.pet.model.Dog;
import com.levochka108.oop.animal.zoo.model.whiled.model.Tiger;
import com.levochka108.oop.animal.zoo.model.whiled.model.Wolf;

import java.time.LocalDate;
import java.util.Scanner;

public class ViewUIAnimal {
    Scanner scanner = new Scanner(System.in);

    public void showMainMenu() {
        System.out.println("1. Add animal");
        System.out.println("2. Remove animal");
        System.out.println("3. Get animal info");
        System.out.println("4. Make animal sound");
        System.out.println("5. Print all animals");
        System.out.println("6. Make all animals sound");
        System.out.println("7. Exit");
        System.out.print("Enter your choice: ");
    }

    public void consoleMenu() {
        showMainMenu();
        Zoo zoo = new Zoo();
        while (true) {
            int choice = scanner.nextInt();

            switch (choice) {
                case 1 -> {
                    System.out.print("Enter animal type (dog, cat, wolf, tiger, chicken): ");
                    String type = scanner.next();
                    System.out.print("Enter animal name: ");
                    String name = scanner.next();
                    System.out.print("Enter animal sound: ");
                    String sound = scanner.next();
                    System.out.print("Enter animal height: ");
                    double heightAnimal = scanner.nextDouble();
                    System.out.print("Enter animal weight: ");
                    double weightAnimal = scanner.nextDouble();
                    System.out.print("Enter color eye animal: ");
                    String colorEye = scanner.next();
                    System.out.print("Enter animal breed: ");
                    String breedAnimal = scanner.next();
                    System.out.println("Enter animal is vaccinations: ");
                    boolean vaccinations = scanner.nextBoolean();
                    System.out.println("Enter fur color animal: ");
                    String furColor = scanner.next();
                    System.out.println("Enter date of birth: ");
                    LocalDate date = LocalDate.parse(scanner.next());
                    System.out.println("Enter trained Dog: ");
                    boolean trainedDog = scanner.nextBoolean();

                    System.out.println("Value flightHeight: ");
                    double flightHeight = scanner.nextDouble();
                    System.out.println("Enter habitat: ");
                    String habitat = scanner.next();

                    System.out.println("Enter animal is leader: ");
                    boolean animalIsLeader = scanner.nextBoolean();

                    IAnimal animal;

                    switch (type) {
                        case "dog" ->
                                animal = new Dog(name, heightAnimal, weightAnimal, colorEye, breedAnimal, vaccinations, furColor, date, trainedDog);
                        case "cat" ->
                                animal = new Cat(name, date, heightAnimal, weightAnimal, colorEye, breedAnimal, furColor, vaccinations);
                        case "wolf" -> animal = new Wolf(name, heightAnimal, weightAnimal, colorEye, habitat,date,animalIsLeader);
                        case "tiger" -> animal = new Tiger(name, heightAnimal, weightAnimal, colorEye, habitat, date);
                        case "chicken" -> animal = new Chicken(date, name,heightAnimal,weightAnimal,colorEye,vaccinations,flightHeight);
                        default -> {
                            System.out.println("Invalid animal type.");
                            continue;
                        }
                    }
                    zoo.addAnimal(animal);
                    System.out.println("Animal added successfully.");
                }
                case 2 -> {
                    System.out.print("Enter animal index: ");
                    int index = scanner.nextInt();
                    if (!zoo.removeAnimal(index)) {
                        System.out.println("Invalid animal index.");
                    } else {
                        System.out.println("Animal removed successfully.");
                    }
                }
                case 3 -> {
                    System.out.print("Enter animal index: ");
                    int infoIndex = scanner.nextInt();
                    IAnimal infoAnimal = zoo.getAnimal(infoIndex);
                    if (infoAnimal != null) {
                        System.out.println("Name: " + infoAnimal);
                        System.out.println("Type: " + infoAnimal);
                        System.out.println("Sound: " + infoAnimal);
                    } else {
                        System.out.println("Invalid animal index.");
                    }
                }
                case 4 -> {
                    System.out.print("Enter animal index: ");
                    int soundIndex = scanner.nextInt();
                    IAnimal soundAnimal = zoo.getAnimal(soundIndex);
                    if (soundAnimal != null) {
                        soundAnimal.makeSound();
                    } else {
                        System.out.println("Invalid animal index.");
                    }
                }
                case 5 -> zoo.printAllAnimals();
                case 6 -> zoo.makeAllAnimalsSound();
                case 7 -> System.exit(0);
                default -> System.out.println("Invalid choice.");
            }
        }
    }

}
