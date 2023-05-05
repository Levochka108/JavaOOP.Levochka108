package main.java.com.levochka108.oop.calculate.model;

public class IncorrectElementException extends Exception{
    int index = 0;
    public IncorrectElementException(String message, int index){
        super(message);
        this.index = index;
    }

    public int getIndex() {
        return index;
    }
}
