package main.java.com.levochka108.oop.calculate.model;

public class UnrecognizableElementException extends Exception{
    public UnrecognizableElementException (){super("Не могу распознать элемент.");}
    public UnrecognizableElementException(String element){super("Не могу распознать элемент \""+ element+"\"");}
}
