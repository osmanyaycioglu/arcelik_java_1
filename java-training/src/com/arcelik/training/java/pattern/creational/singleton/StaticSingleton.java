package com.arcelik.training.java.pattern.creational.singleton;


public class StaticSingleton {

    private static String str = "osman";

    static {
        // Cache init
    }

    public static String hello() {
        return "Hello world " + StaticSingleton.str;
    }

}
