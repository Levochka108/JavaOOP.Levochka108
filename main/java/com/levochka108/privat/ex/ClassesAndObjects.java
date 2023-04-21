package com.levochka108.privat.ex;


public class ClassesAndObjects {
    /***
     * Всегда только 1 публичный класс
     * Класс это шаблон
     */
    public static void main(){
        TestPerson person = new TestPerson();
        person.name = "Saha";
        person.age = 5;
    }
}
class TestPerson{
    /**
     * У класса есть:
     * 1. Данные, (поля)!
     * 2. Действия, которые он может совершать (Методы)!
     * */
    String name;
    int age;
}