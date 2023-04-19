package com.levochka108.oop.es1;

public abstract class Student {
    private String fullName;

    private int classNumber;

    public Student(String fullName, int classNumber) {
        this.fullName = fullName;
        this.classNumber = classNumber;
    }

    public abstract void study();

    public String getName(){
        return fullName;
    }
    public int getClassNumber(){
        return classNumber;
    }
    protected void upClass(){
        this.classNumber++;
    }
}
