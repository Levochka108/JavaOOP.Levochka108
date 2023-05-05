package main.java.com.levochka108.oop.calculate.core.debug;

import main.java.com.levochka108.oop.calculate.core.info.IncorrectElementException;
import main.java.com.levochka108.oop.calculate.data.PostfixElement;
import main.java.com.levochka108.oop.calculate.interfacemodel.IPostfixElementType;


import java.util.Vector;

public class InfixChecker {
    Vector element;

    public InfixChecker(Vector infixVector) {
        element = infixVector;
    }

    public void check() throws IncorrectElementException, main.java.com.levochka108.oop.calculate.core.info.IncorrectTypeException {
        if (element == null)
            return;
        int rightBracketsCount = 0;
        int leftBracketsCount = 0;
        int operatorsCount = 0;
        int numbersCount = 0;
        PostfixElement curElem = null;
        PostfixElement prevElem = null;
        boolean firstElem = true;

        for (Object o : element) {
            curElem = (PostfixElement) o;
            if (firstElem) {
                if (curElem.isOperator() && (curElem.getOperatorType() !=
                        IPostfixElementType.LEFT_BRACKET))
                    throw new IncorrectElementException("Ошибка при анализе выражения.",
                            curElem.getElementIndex());
                firstElem = false;
            }
            if (curElem.getElementType() == IPostfixElementType.OPERATOR) {
                numbersCount = 0;
                if (curElem.getOperatorType() == IPostfixElementType.RIGHT_BRACKET)
                    rightBracketsCount++;
                else if (curElem.getOperatorType() ==
                        IPostfixElementType.LEFT_BRACKET)
                    leftBracketsCount++;
                else
                    operatorsCount++;
            }
            if (curElem.getElementType() == IPostfixElementType.NUMBER) {
                numbersCount++;
                operatorsCount = 0;
            }
            if (numbersCount > 1 || operatorsCount > 1)
                throw new IncorrectElementException("Ошибка при анализе выражения.",
                        curElem.getElementIndex());
            if (prevElem != null) {
                if (prevElem.isOperator() && (prevElem.getOperatorType() == IPostfixElementType.LEFT_BRACKET))
                    if (curElem.isOperator())
                        if ((curElem.getOperatorType() !=
                                IPostfixElementType.LEFT_BRACKET) &&
                                curElem.getOperatorType() !=
                                        IPostfixElementType.RIGHT_BRACKET)
                            throw new IncorrectElementException("Ошибка при анализе выражения",
                                    curElem.getElementIndex());
            }

            if (prevElem.isOperator() && (prevElem.getOperatorType() ==
                    IPostfixElementType.RIGHT_BRACKET)) {
                if (curElem.isNumber())
                    throw new IncorrectElementException("Ошибка при анализе выражения",
                            curElem.getElementIndex());
                else if (curElem.getOperatorType() ==
                        IPostfixElementType.LEFT_BRACKET)
                    throw new IncorrectElementException("Ошибка при анализе выражения",
                            curElem.getElementIndex());
            }
            prevElem = curElem;
        }

        if (curElem.isOperator() && (curElem.getOperatorType() !=
                IPostfixElementType.RIGHT_BRACKET))
            throw new IncorrectElementException("Ошибка при анализе выражения",
                    curElem.getElementIndex());


        if (leftBracketsCount > rightBracketsCount)
            throw new IncorrectElementException("Отсутствует \")\"", 0);
        if (leftBracketsCount < rightBracketsCount)
            throw new IncorrectElementException("Отсутствует \"(\"", 0);

    }
}
