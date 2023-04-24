package main.java.com.levochka108.oop.zoo.model.pet;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Pet {
    private final String namePet;
    private final String breedPet;

    private final String habitsPet;

    private final String colorPet;

    private final Date datePet;

    public Pet(String namePet, String breedPet, String habitsPet, String colorPet, Date datePet) {
        this.namePet = namePet;
        this.breedPet = breedPet;
        this.habitsPet = habitsPet;
        this.colorPet = colorPet;
        this.datePet = datePet;
    }

    @Override
    public String toString() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");
        return "Pet{" +
                "namePet='" + namePet + '\'' +
                ", breedPet='" + breedPet + '\'' +
                ", habitsPet='" + habitsPet + '\'' +
                ", colorPet='" + colorPet + '\'' +
                ", datePet=" + dateFormat.format(datePet) +
                '}';
    }
}
