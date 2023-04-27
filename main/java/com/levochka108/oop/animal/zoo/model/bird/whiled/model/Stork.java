package com.levochka108.oop.animal.zoo.model.bird.whiled.model;

import com.levochka108.oop.animal.zoo.model.bird.Bird;
import com.levochka108.oop.animal.zoo.model.bird.coloreyes.ColorEyesBird;
import com.levochka108.oop.animal.zoo.model.bird.voice.Voice;
import com.levochka108.oop.animal.zoo.model.interfaces.iwhiled.IWhiled;

import java.util.Date;

public class Stork  extends Bird  implements IWhiled {
    private final String nameWiledAnimal;
    private final Date dateFoundAnimal;

    private final String breedAnimal;



    private final int growthAnimal;

    private final int weightAnimal;

    private final int flightAltitudeAnimal;



    protected Stork(String flight, String animalName, Date foundAnimalDate, String breedAnimal, int growthAnimal, int weightAnimal, int flightAltitudeAnimal) {
        super(flight);
        this.nameWiledAnimal = animalName;
        this.dateFoundAnimal = foundAnimalDate;
        this.breedAnimal = breedAnimal;
        this.growthAnimal = growthAnimal;
        this.weightAnimal = weightAnimal;
        this.flightAltitudeAnimal = flightAltitudeAnimal;
    }

    @Override
    public int flightAltitude() {
        return flightAltitudeAnimal;
    }


    @Override
    public String nameWiledAnimal() {
        return nameWiledAnimal;
    }

    @Override
    public String placeOfResidence() {
        return null;
    }

    @Override
    public Date dateFound() {
        return dateFoundAnimal;
    }

    @Override
    public int animalGrowth() {
        return growthAnimal;
    }

    @Override
    public int animalWeight() {
        return weightAnimal;
    }

    @Override
    public String animalEyeColor() {
        return String.valueOf(ColorEyesBird.PASTELGREEN);
    }

    @Override
    public void getVoice() {
        System.out.println(Voice.StorkClicksItsBeak);
    }

    @Override
    public void showInfo() {
        System.out.println("Аист дикий{" +
                "Имя='" + nameWiledAnimal + '\'' +
                ", дата нахождения=" + dateFoundAnimal +
                ", порода аиста='" + breedAnimal + '\'' +
                ", рост птицы=" + growthAnimal +
                ", вес птицы=" + weightAnimal +
                ", цвет глаз курицы=" + animalEyeColor()+
                ", высота полета птицы=" + flightAltitude() +
                '}');
    }
}
