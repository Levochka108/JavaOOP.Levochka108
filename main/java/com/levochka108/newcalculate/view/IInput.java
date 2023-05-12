package com.levochka108.newcalculate.view;

import com.levochka108.newcalculate.model.Complex;
import com.levochka108.newcalculate.model.Rational;

public interface IInput {
    int readInt(String massage);
    Rational readRational(String massage);

    Complex readComplex(String massage);

    double readDouble();
}
