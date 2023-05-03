package com.levochka108.privat.ex.presenter.view;

import java.util.Scanner;

public class View {
    Scanner scannerIn = new Scanner(System.in);
    private String firstName;
    private String lastName;
    private String description;

    public int getValue(String title){
        System.out.printf("%s",title);
        return scannerIn.nextInt();
    }

    public void print(int data,  String title){
        System.out.printf("%s, %d\n",title,data);
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
