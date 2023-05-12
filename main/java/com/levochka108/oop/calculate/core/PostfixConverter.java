package main.java.com.levochka108.oop.calculate.core;

import main.java.com.levochka108.oop.calculate.core.debug.InfixChecker;
import main.java.com.levochka108.oop.calculate.core.info.IncorrectElementException;
import main.java.com.levochka108.oop.calculate.core.info.IncorrectTypeException;
import main.java.com.levochka108.oop.calculate.data.PostfixElement;
import main.java.com.levochka108.oop.calculate.interfacemodel.IPostfixElementType;
import main.java.com.levochka108.oop.calculate.model.UnrecognizableElementException;

import java.util.Iterator;
import java.util.Stack;
import java.util.StringTokenizer;
import java.util.Vector;

public class PostfixConverter {
    private Vector postfixVector = null;
    private Vector infixVector = null;
    String infixString;

    public PostfixConverter(String string) {
        infixString = string;
    }

    public Vector convertToPostfix() throws IllegalArgumentException,
            UnrecognizableElementException, IncorrectTypeException,
            IncorrectElementException {
        infixVector = new Vector<>(10, 5);
        parseStr(infixString);
        InfixChecker checker = new InfixChecker(infixVector);
        checker.check();
        convert();
        return postfixVector;
    }

    private void parseStr(String str) throws UnrecognizableElementException,
            IncorrectTypeException {
        infixString = removeSpaces(str);
        StringTokenizer st = new StringTokenizer(infixString, "()+-*/", true);
        PostfixElement currentElement = null;
        PostfixElement previousElement = null;
        int tokenIndex = 0;
        int curIndex = 0;
        boolean firstElement = true;
        while (st.hasMoreTokens()) {
            String currentToken = st.nextToken();
            tokenIndex = str.indexOf(currentToken, curIndex);
            currentElement = new PostfixElement(currentToken, tokenIndex);
            if (previousElement != null) {
                if (previousElement.isOperator() &&
                        (previousElement.getOperatorType() ==
                                IPostfixElementType.LEFT_BRACKET)
                        && currentElement.isOperator())
                    if ((currentElement.getOperatorType() ==
                            IPostfixElementType.MINUS) ||
                            (currentElement.getOperatorType() ==
                                    IPostfixElementType.PLUS)) {
                        currentToken += st.nextToken();
                        tokenIndex = str.indexOf(currentToken, curIndex);
                        currentElement = new PostfixElement(currentToken,
                                tokenIndex);
                    }
            }
            if (firstElement) {
                if (currentElement.isOperator() &&
                        ((currentElement.getOperatorType() == IPostfixElementType.MINUS) ||
                                (currentElement.getOperatorType() == IPostfixElementType.PLUS)))
                    currentToken += st.nextToken();
                tokenIndex = str.indexOf(currentToken, curIndex);
                currentElement = new PostfixElement(currentToken,
                        tokenIndex);
                firstElement = false;
            }

            infixVector.add(currentElement);
            curIndex = tokenIndex + currentToken.length();
            previousElement = currentElement;
        }
    }

    private void convert() throws IllegalArgumentException,
            UnrecognizableElementException, IncorrectTypeException {
        postfixVector = new Vector(infixVector.size());
        int curIndex = 0;
        PostfixElement curElement = null;
        Stack s = new Stack();
        s.push(new PostfixElement("(", 0));
        infixVector.add(new PostfixElement(")", 0));
        while (s.isEmpty() == false) {
            curElement = (PostfixElement) infixVector.get(curIndex);
            curIndex++;
            if (curElement.isNumber()) {
                postfixVector.add(curElement);
                continue;
            }
            if (curElement.isOperator())
                if (curElement.getOperatorType() ==
                        IPostfixElementType.LEFT_BRACKET) {
                    s.push(curElement);
                    continue;
                }
            if (curElement.isOperator())
                if (curElement.getOperatorType() !=
                        IPostfixElementType.LEFT_BRACKET &&
                        curElement.getOperatorType() !=
                                IPostfixElementType.RIGHT_BRACKET) {
                    while (true) {
                        PostfixElement peekOperator = (PostfixElement) s.peek();
                        if (peekOperator.getOperatorType() ==
                                IPostfixElementType.LEFT_BRACKET)
                            break;
                        if (peekOperator.getOperatorPriority() >=
                                curElement.getOperatorPriority())
                            postfixVector.add(s.pop());
                        else
                            break;
                    }
                    s.push(curElement);
                    continue;
                }
            if (curElement.isOperator())
                if (curElement.getOperatorType() ==
                        IPostfixElementType.RIGHT_BRACKET)
                    while (true) {
                        PostfixElement peekOperator = (PostfixElement) s.peek();
                        if (peekOperator.getOperatorType() ==
                                IPostfixElementType.LEFT_BRACKET) {
                            s.pop();
                            break;
                        }
                        postfixVector.add(s.pop());
                    }
        }
    }

    private String removeSpaces(String str) {
        StringTokenizer st = new StringTokenizer(str);
        StringBuffer temp = new StringBuffer(str.length());
        while (st.hasMoreTokens()) {
            temp.append(st.nextToken());
        }
        return temp.toString();
    }

    public String VectorDump(String name) {
        StringBuffer retValue = new StringBuffer();
        Iterator vectorIterator = null;
        if (name.equals("infix"))
            vectorIterator = infixVector.iterator();
        if (name.equals("postfix"))
            vectorIterator = postfixVector.iterator();
        if (vectorIterator != null)
            while (vectorIterator.hasNext()) {
                retValue.append(vectorIterator.next() + " ");
            }
        return retValue.toString();
    }
}
