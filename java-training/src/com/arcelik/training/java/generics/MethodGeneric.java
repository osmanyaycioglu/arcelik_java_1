package com.arcelik.training.java.generics;

import java.util.Collection;

public class MethodGeneric {

    public static <G extends Collection<String>> void generic1(final G input) {
        for (String obj : input) {
            System.out.println(obj);
        }
    }

}
