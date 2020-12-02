package com.arcelik.training.java.generics;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class MethodGenericRun {

    public static void main(final String[] args) {
        List<String> strListLoc = new ArrayList<>();
        strListLoc.add("1");
        strListLoc.add("2");
        MethodGeneric.generic1(strListLoc);
        Set<String> setLoc = new HashSet<>();
        setLoc.add("1s");
        setLoc.add("2s");
        MethodGeneric.generic1(setLoc);

    }
}
