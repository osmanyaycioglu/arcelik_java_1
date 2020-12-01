package com.arcelik.training.java.pattern.creational.singleton;


public enum ESingleton {

    INSTANCE;

    private final String str = "osman";

    public String hello() {
        return "Hello world " + this.str;
    }
}
