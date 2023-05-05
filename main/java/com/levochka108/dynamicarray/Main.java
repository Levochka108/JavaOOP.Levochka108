package com.levochka108.dynamicarray;


import com.levochka108.dynamicarray.presenter.Configuration;
import com.levochka108.dynamicarray.view.MainInterface;

public class Main {
    public static void main(String[] args) {
        Configuration.setDebug(false);
        MainInterface showInterface = new MainInterface();
        showInterface.run();
    }
}
