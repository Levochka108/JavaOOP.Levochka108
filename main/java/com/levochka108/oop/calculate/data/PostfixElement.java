package main.java.com.levochka108.oop.calculate.data;

import main.java.com.levochka108.oop.calculate.core.info.IncorrectTypeException;
import main.java.com.levochka108.oop.calculate.interfacemodel.IPostfixElementType;
import main.java.com.levochka108.oop.calculate.model.ComplexNumber;
import main.java.com.levochka108.oop.calculate.model.UnrecognizableElementException;

public class PostfixElement {
    private int elementType = -1;
    private int operatorType = -1;
    private ComplexNumber number = null;
    private String value = "";
    private int index = 0;

    public PostfixElement(String value, int index)
            throws UnrecognizableElementException {
        parseElement(value);
        this.value = value;
        this.index = index;
    }

    private void parseElement(String value)
            throws UnrecognizableElementException {
        if (value.equals("(")) {
            elementType = IPostfixElementType.OPERATOR;
            operatorType = IPostfixElementType.LEFT_BRACKET;
            return;
        }
        if (value.equals(")")) {
            elementType = IPostfixElementType.OPERATOR;
            operatorType = IPostfixElementType.RIGHT_BRACKET;
            return;
        }
        if (value.equals("+")) {
            elementType = IPostfixElementType.OPERATOR;
            operatorType = IPostfixElementType.PLUS;
            return;
        }
        if (value.equals("-")) {
            elementType = IPostfixElementType.OPERATOR;
            operatorType = IPostfixElementType.MINUS;
            return;
        }
        if (value.equals("*")) {
            elementType = IPostfixElementType.OPERATOR;
            operatorType = IPostfixElementType.MULTIPLICATION;
            return;
        }
        if (value.equals("/")) {
            elementType = IPostfixElementType.OPERATOR;
            operatorType = IPostfixElementType.DIVISION;
            return;
        }

        try {
            number = new ComplexNumber(value);
            elementType = IPostfixElementType.NUMBER;
        } catch (java.text.ParseException pe) {
            throw new UnrecognizableElementException(value);
        }
    }

    public String toString() {
        String retValue = "";
        if (elementType == -1)
            retValue = "Значение не установлено";
        else {
            if (elementType == IPostfixElementType.OPERATOR)
                retValue = this.value;
            if (elementType == IPostfixElementType.NUMBER)
                retValue = number.toString();
        }
        return retValue;
    }

    public boolean equals(PostfixElement elem) {
        boolean retValue = false;
        if ((elementType == elem.elementType) &&
                (operatorType == elem.operatorType) &&
                (number.equal(elem.number)))
            retValue = true;
        return retValue;
    }

    public int getElementType() {
        return elementType;
    }


    public boolean isOperator() {
        return elementType == IPostfixElementType.OPERATOR;
    }

    public boolean isNumber() {
        if (elementType == IPostfixElementType.NUMBER)
            return true;
        return false;
    }

    public int getElementIndex() {
        return index;
    }
    public int getOperatorType() throws IncorrectTypeException {
        if(elementType != IPostfixElementType.OPERATOR)
            throw new IncorrectTypeException();
        return operatorType;
    }
    public int getOperatorPriority() throws IncorrectTypeException {
        if(elementType != IPostfixElementType.OPERATOR)
            throw new IncorrectTypeException();
        return IPostfixElementType.priorities[operatorType];
    }
    public ComplexNumber getNumber() throws IncorrectTypeException {
        if(elementType != IPostfixElementType.NUMBER)
            throw new IncorrectTypeException();
        return number;
    }
}

