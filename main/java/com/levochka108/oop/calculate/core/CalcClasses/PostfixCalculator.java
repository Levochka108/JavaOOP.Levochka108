package main.java.com.levochka108.oop.calculate.core.CalcClasses;

import main.java.com.levochka108.oop.calculate.data.PostfixElement;
import main.java.com.levochka108.oop.calculate.interfacemodel.IPostfixElementType;
import main.java.com.levochka108.oop.calculate.model.ComplexNumber;
import main.java.com.levochka108.oop.calculate.model.IncorrectElementException;
import main.java.com.levochka108.oop.calculate.model.UnrecognizableElementException;

import java.util.Stack;
import java.util.Vector;

public class PostfixCalculator {
    private Vector postfixVector = null;

    public ComplexNumber result = null;

    public PostfixCalculator(Vector postfixVector) {
        this.postfixVector = postfixVector;
    }

    public ComplexNumber calculate() throws java.text.ParseException, IncorrectElementException, UnrecognizableElementException {
        result = new ComplexNumber("0");
        Stack stack = new Stack<>();
        PostfixElement temp = null;
        for (int i = 0, i < postfixVector.size();
        i++){
            temp = (PostfixElement) postfixVector.get(i);
            if (temp.isNumber())
                stack.push(temp);
            if (temp.isOperator)
            {
                ComplexNumber y = ((PostfixElement)stack.pop()).getnumbet();
                ComplexNumber x = ((PostfixElement)stack.pop()).getNumber();
                ComplexNumber res = solveOperation(x, y,
                        temp.getOperatorType());
                stack.push(new PostfixElement(res.toString(), 0));
            }
        }
        result = ((PostfixElement)stack.pop()).getNumber();
        return result;
    }
    private ComplexNumber solveOperation(ComplexNumber x, ComplexNumber y, int operationType) throws java.text.ParseException {
        ComplexNumber result = new ComplexNumber("0");
        result = x;
        switch (operationType) {
            case IPostfixElementType.PLUS -> result.add(y);
            case IPostfixElementType.MINUS -> result.sub(y);
            case IPostfixElementType.MULTIPLICATION -> result.multi(y);
            case IPostfixElementType.DIVISION -> result.div(y);
        }
        return result;
    }
}
