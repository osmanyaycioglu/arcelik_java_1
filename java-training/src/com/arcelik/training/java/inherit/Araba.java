package com.arcelik.training.java.inherit;


public class Araba extends Arac {


    public Araba() {
        super(60,
              "BMW",
              "Araba");
        System.out.println("Araba cons");
    }

    @Override
    public String giveMeYourName() {
        return "Araba";
    }


}
