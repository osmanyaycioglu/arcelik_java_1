package com.arcelik.training.java;


public class MyRunner {

    public static void main(final String[] args) {
        Arac ar = new Arac(100,
                           100,
                           "osman");

        Arac ar2 = new Arac(100,
                            100,
                            "osman",
                            1000,
                            "osman");

        AracEx buildLoc = AracEx.getBuilder()
                                .withName("osman")
                                .withCalismaSaati(1000)
                                .withHiz(100)
                                .withMenzil(100)
                                .withType("araba")
                                .forAPI1();
    }

}
