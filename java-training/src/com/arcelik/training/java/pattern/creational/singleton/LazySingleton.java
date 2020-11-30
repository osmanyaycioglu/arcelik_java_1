package com.arcelik.training.java.pattern.creational.singleton;


public class LazySingleton {

    private static volatile LazySingleton instance;

    private final String                  str = "osman";

    private LazySingleton() {
    }

    public static LazySingleton getInstance() {
        if (LazySingleton.instance == null) {
            synchronized (LazySingleton.class) {
                if (LazySingleton.instance == null) {
                    LazySingleton.instance = new LazySingleton();
                    // Cache Init
                }
            }
        }
        return LazySingleton.instance;
    }

    public String hello() {
        return "Hello world " + this.str;
    }
}
