package com.levochka108.newcalculate.model;

public class Rational  {
    private int numerator;
    private int denominator;

    public Rational(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }
    public Rational(double value) {
        int precision = 1000000; // установите нужную точность
        int numerator = (int) (value * precision);
        int gcd = gcd(numerator, precision);
        this.numerator = numerator / gcd;
        this.denominator = precision / gcd;
    }


    public Rational add(Rational other) {
        int lcm = lcm(denominator, other.denominator);
        int newNumerator = numerator * (lcm / denominator) + other.numerator * (lcm / other.denominator);
        return new Rational(newNumerator, lcm);
    }

    public Rational subtract(Rational other) {
        int lcm = lcm(denominator, other.denominator);
        int newNumerator = numerator * (lcm / denominator) - other.numerator * (lcm / other.denominator);
        return new Rational(newNumerator, lcm);
    }
    public Rational multiply(Rational other) {
        int newNumerator = numerator * other.numerator;
        int newDenominator = denominator * other.denominator;
        return new Rational(newNumerator, newDenominator);
    }

    public Rational divide(Rational other) {
        int newNumerator = numerator * other.denominator;
        int newDenominator = denominator * other.numerator;
        return new Rational(newNumerator, newDenominator);
    }

    private int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }

    private int lcm(int a, int b) {
        return a * b / gcd(a, b);
    }

    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public void setDenominator(int denominator) {
        this.denominator = denominator;
    }

    @Override
    public String toString() {
        if (denominator == 1) {
            return Integer.toString(numerator);
        } else {
            return String.format("%d/%d", numerator, denominator);
        }
    }

}
