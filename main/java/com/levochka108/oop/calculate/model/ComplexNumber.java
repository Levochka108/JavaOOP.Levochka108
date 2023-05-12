package main.java.com.levochka108.oop.calculate.model;


import main.java.com.levochka108.oop.calculate.interfacemodel.IParseComplexNumber;

import java.text.NumberFormat;
import java.util.StringTokenizer;

public class ComplexNumber implements IParseComplexNumber {
    private double realNumber = 0;

    private double imaginaryNumber = 0;

    public ComplexNumber(String value) throws java.text.ParseException {
        String thisValue = removesSpaces(value);
        parseComplexNumber(thisValue);
    }

    public ComplexNumber(ComplexNumber value) {
        realNumber = value.getRealNumber();
        imaginaryNumber = value.getImaginaryNumber();
    }

    public double getRealNumber() {
        return realNumber;
    }

    public double getImaginaryNumber() {
        return imaginaryNumber;
    }

    public String toString() {
        String retValue;
        NumberFormat numberFormat = NumberFormat.getNumberInstance();
        if (realNumber == 0) {
            retValue = numberFormat.format(imaginaryNumber) + "i";
        } else if (imaginaryNumber > 0) {
            retValue = numberFormat.format(realNumber) + "+" + numberFormat.format(imaginaryNumber) + "i";
        } else
            retValue = numberFormat.format(realNumber) + numberFormat.format(imaginaryNumber) + "i";
        if (imaginaryNumber == 0) {
            retValue = numberFormat.format(realNumber);
        }
        return retValue;
    }

    private String removesSpaces(String stringValue) {
        StringTokenizer stringTokenizer = new StringTokenizer(stringValue);
        StringBuilder stringBufferTemp = new StringBuilder(stringValue.length());
        while (stringTokenizer.hasMoreTokens()) {
            stringBufferTemp.append(stringTokenizer.nextToken());
        }
        return stringBufferTemp.toString();
    }

    @Override
    public void parseComplexNumber(String string) throws java.text.ParseException {
        StringTokenizer stringTokenizer = new StringTokenizer(string, "+-", true);
        String previousToken = "";
        String currentToken;
        String number;
        NumberFormat numberFormat = NumberFormat.getNumberInstance();
        while (stringTokenizer.hasMoreTokens()) {
            currentToken = stringTokenizer.nextToken();
            if ("-".equals(previousToken)) {
                number = previousToken + currentToken;
            } else
                number = currentToken;
            if (!number.equals("+") && !number.equals("-")) {
                if (number.indexOf('i') == -1) {
                    realNumber = numberFormat.parse(number).doubleValue();
                } else {
                    number = number.replace('i', ' ');
                    if (number.equals(" "))
                        number = "1";
                    if (number.equals("- "))
                        number = "-1";
                    imaginaryNumber = numberFormat.parse(number).doubleValue();
                }
            }
        }
    }

    /*  public boolean equal(ComplexNumber value)
         if(realNumber == value.realNumber&& imaginaryNumber == value.imaginaryNumber){
                     return true;
                 }
                 return false;*/
    public boolean equal(ComplexNumber value) {

        return realNumber == value.realNumber && imaginaryNumber == value.imaginaryNumber;
    }

    public void add(ComplexNumber value) {
        realNumber += value.realNumber;
        imaginaryNumber += value.imaginaryNumber;
    }

    public void sub(ComplexNumber value) {
        realNumber -= value.realNumber;
        imaginaryNumber -= value.imaginaryNumber;
    }

    public void multi(ComplexNumber value) {
        double tempRealNumber = realNumber * value.realNumber - imaginaryNumber * value.imaginaryNumber;
        double tempImaginaryNumber = realNumber * value.imaginaryNumber + imaginaryNumber * value.realNumber;
        realNumber = tempRealNumber;
        imaginaryNumber = tempImaginaryNumber;
    }

    public void div(ComplexNumber value) {
        double denominator = value.realNumber * value.realNumber + value.imaginaryNumber * value.imaginaryNumber;
        if (denominator == 0) {
            realNumber = imaginaryNumber = 0;
            return;
        }
        double tempRealNumber,tempImaginaryNumber;
        tempRealNumber = (realNumber * value.realNumber + imaginaryNumber* value.imaginaryNumber)/denominator;
        tempImaginaryNumber = (imaginaryNumber* value.realNumber - realNumber* value.imaginaryNumber)/denominator;
        realNumber = tempRealNumber;
        imaginaryNumber =tempImaginaryNumber;
    }
}
