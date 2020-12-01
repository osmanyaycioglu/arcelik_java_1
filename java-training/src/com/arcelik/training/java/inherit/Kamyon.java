package com.arcelik.training.java.inherit;


public class Kamyon extends Arac {

    public Kamyon() {
        super(100,
              "DODGE",
              "Kamyon");
    }

    @Override
    public String giveMeYourName() {
        return "Kamyon";
    }

}
