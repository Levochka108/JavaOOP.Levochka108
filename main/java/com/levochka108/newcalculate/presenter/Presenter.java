package com.levochka108.newcalculate.presenter;

import com.levochka108.newcalculate.model.interfacemodel.IModel;
import com.levochka108.privat.ex.presenter.view.View;

public class Presenter {
    View view;
    IModel model;

    public Presenter(IModel m, View v){
        model = m;
        view = v;
    }

    public Presenter(com.levochka108.program.calculation.view.View view) {
    }

    public void buttonClick(){
        int a = view.getValue("a: ");
        int b = view.getValue("b: ");
        model.setObjectX(a);
        model.setObjectY(b);
        int result = model.result();
        view.print(result,"Sum:");
    }

}
