package java.com.levochka108.privat.ex.es1.students;

import com.levochka108.privat.ex.es1.students.basestudents.IGamer;
import com.levochka108.privat.ex.es1.Student;

public class PrimarySchool  extends Student implements IGamer {

    public PrimarySchool(String fullName, int classNumber) {
        super(fullName, classNumber);
    }

    @Override
    public void study() {

    }

    protected void extraClasses(){
    System.out.println("Хочу на куржок по информатике.");
}


    @Override
    public void game() {

    }
}
