package main.java.com.levochka108.oop.calculate.interfacemodel;

public interface IPostfixElementType {
    int NUMBER = 100;
    int OPERATOR = 101;
    int PLUS = 0;
    int MINUS = 1;
    int DIVISION = 2;
    int MULTIPLICATION = 3;

    int LEFT_BRACKET = 4;
    int RIGHT_BRACKET = 5;

    int[] priorities = {0,0,1,1,2,2};
}
