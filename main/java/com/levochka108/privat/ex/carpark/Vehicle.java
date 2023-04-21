package com.levochka108.privat.ex.carpark;

/*1.Прочитать прикреплённые в архиве лекции а так же выучить всю теорию, изученную на лекциях.
2.На любом языке C++ или C# реализовать следующий набор классов, при этом должна быть выделена их иерархия:
    2.1.Транспортное средство
    2.2.Автомобиль
    2.3.Мотоцикл
    2.4.Грузовик
    2.5.Велосипед
Во всех классах должны быть написаны: цвет, модель, количество колёс, вес и скорость а так же метод ехать.
В классе Program реализовать метод который будет работать с любым наследником класса ровно так же как и с родителем,
то есть показать значение всех его публичных свойств и вызвать метод ехать.
* */
public class Vehicle {

    private String color;
    private String model;
    private String wheelsNum;
    private String isRun;

    public void turnOn() {
        System.out.println("Мотор включен");
    }

    public void turnOff() {
        System.out.println("Мотор выключен");
    }

    public void motionVehicleStraightAhead() {
        System.out.println("Едем в перед");
    }

    private String colour;
    private int wheel;
    private double weight;
    private double speed;


    protected Vehicle(String valueColour, int valueWheel, double valueWeight, double valueSpeed) {
        this.colour = valueColour;
        this.wheel = valueWheel;
        this.weight = valueWeight;
        this.speed = valueSpeed;
    }

    @Override
    public String toString() {
        return "{" +
                "color='" + color + '\'' +
                ", model='" + model + '\'' +
                ", wheelsNum=" + wheelsNum +
                ", weight=" + weight +
                ", speed=" + speed +
                ", isRun=" + isRun +
                '}';
    }
}
