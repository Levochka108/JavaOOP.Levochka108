package com.levochka108.privat.ex.presenter;

import com.levochka108.newcalculate.model.SumModel;
import com.levochka108.privat.ex.presenter.view.View;

public class NewProgramCalc {
    public static void main(String[] args) {
        Presenter p = new Presenter(new SumModel(),new View());
        p.buttonClick();
        p.buttonClick();
        p.buttonClick();
    }
}
