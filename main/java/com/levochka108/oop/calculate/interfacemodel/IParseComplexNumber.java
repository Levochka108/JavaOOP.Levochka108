package main.java.com.levochka108.oop.calculate.interfacemodel;

import java.text.ParseException;

public interface IParseComplexNumber {
    default void parseComplexNumber(String string) throws ParseException {}
}
