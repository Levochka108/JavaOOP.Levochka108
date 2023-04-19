package com.levochka108.oop.es1.students;

import com.levochka108.oop.es1.students.basestudents.IGamer;
import com.levochka108.oop.es1.Student;

public class PrimarySchool  extends Student implements IGamer {

    public PrimarySchool(String fullName, int classNumber) {
        super(fullName, classNumber);
    }

    protected void extraClasses(){
    System.out.println("Хочу на куржок по информатике.");
}
    @Override
    public void game() {
        System.out.println("Играю в настольные игры.");
    }

    @Override
    public void study() {

    }
}
