package com.levochka108.dynamicarray.presenter;

public class Configuration {
    private static boolean debug = true;

    public static void setDebug(boolean debug) {
        Configuration.debug = debug;
    }

    public static boolean getDebug() {
        return Configuration.debug;
    }
}
