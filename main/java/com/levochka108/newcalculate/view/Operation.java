package com.levochka108.newcalculate.view;

import com.levochka108.newcalculate.model.Complex;
import com.levochka108.newcalculate.model.Rational;

public enum Operation {
    ADDITION("+"){
        @Override
        public Complex apply(Complex a, Complex b) {
            return a.add(b);
    }
        @Override
        public Rational apply(Rational a, Rational b) {
            return a.add(b);
        }
    },
    SUBTRACTION("-") {
        @Override
        public Complex apply(Complex a, Complex b) {
            return a.subtract(b);
        }

        @Override
        public Rational apply(Rational a, Rational b) {
            return a.subtract(b);
        }
    },
    MULTIPLICATION("*") {
        @Override
        public Complex apply(Complex a, Complex b) {
            return a.multiply(b);
        }

        @Override
        public Rational apply(Rational a, Rational b) {
            return a.multiply(b);
        }
    },
    DIVISION("/") {
        @Override
        public Complex apply(Complex a, Complex b) {
            return a.divide(b);
        }

        @Override
        public Rational apply(Rational a, Rational b) {
            return a.divide(b);
        }
    };

    private final String symbol;

    Operation(String symbol) {
        this.symbol = symbol;
    }

    public String getSymbol() {
        return symbol;
    }

    public abstract Complex apply(Complex a, Complex b);

    public abstract Rational apply(Rational a, Rational b);

}
