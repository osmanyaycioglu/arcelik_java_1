package com.arcelik.training.java.pattern.creational.singleton;


public class Singleton {

    private static Singleton instance = new Singleton();

    private final String     str      = "osman";

    private Singleton() {
        // Cache init
    }

    public static Singleton getInstance() {
        return Singleton.instance;
    }

    public String hello() {
        return "Hello world " + this.str;
    }

}
