package com.arcelik.training.java.collections;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetRunner {

    public static void main(final String[] args) {

        Set<String> strSet6 = new TreeSet<>();

        Set<String> strSet1 = new HashSet<>();

        long delta = System.currentTimeMillis();
        for (int iLoc = 0; iLoc < 1_000_000; iLoc++) {
            strSet1.add("osman" + iLoc);
        }
        System.out.println("Add Delta : " + (System.currentTimeMillis() - delta));

        delta = System.currentTimeMillis();
        for (int iLoc = 0; iLoc < 1_000_000; iLoc++) {
            strSet1.contains("osman" + iLoc);
        }
        System.out.println("Contains Delta : " + (System.currentTimeMillis() - delta));

        SetObj objLoc1 = new SetObj();
        objLoc1.setAge(50);
        objLoc1.setName("osman");
        SetObj objLoc2 = new SetObj();
        objLoc2.setAge(51);
        objLoc2.setName("osman");

        SetObj objLoc3 = null;
        System.out.println("Obj 3.1 : " + objLoc3);
        System.out.println("Obj 3.1 : " + (objLoc3 == null ? "null" : objLoc3.toString()));

        // System.out.println("Obj 3.2 : " + objLoc3.toString());

        System.out.println("Obj : " + objLoc1);
        System.out.println("Obj : " + objLoc1.toString());

        Set<SetObj> objSet = new HashSet<>();
        objSet.add(objLoc1);
        objSet.add(objLoc2);
        for (SetObj setObjLoc : objSet) {
            System.out.println(setObjLoc);
        }

        System.out.println("-------------------------------------");
        Set<String> strSet = new HashSet<>();
        strSet.add("1");
        strSet.add("2");
        strSet.add("3");
        strSet.add("4");
        strSet.add("5");
        strSet.add("6");
        strSet.add("7");
        strSet.add("8");
        for (String stringLoc : strSet) {
            System.out.println(stringLoc);
        }

        System.out.println("-------------------------------------");
        Set<String> strSet2 = new HashSet<>();
        strSet2.add("3");
        strSet2.add("4");
        strSet2.add("5");
        strSet2.add("6");
        strSet2.add("7");
        strSet2.add("8");
        strSet2.add("9");
        strSet2.add("10");
        for (String stringLoc2 : strSet2) {
            System.out.println(stringLoc2);
        }
        System.out.println("-----------------Kesişim--------------------");
        Set<String> strSet3 = new HashSet<>(strSet2);
        strSet3.retainAll(strSet);
        for (String stringLoc2 : strSet3) {
            System.out.println(stringLoc2);
        }
        System.out.println("-----------------Birleşim--------------------");
        Set<String> strSet4 = new HashSet<>(strSet2);
        strSet4.addAll(strSet);
        for (String stringLoc2 : strSet4) {
            System.out.println(stringLoc2);
        }
        System.out.println("-----------------Fark--------------------");
        Set<String> strSet5 = new HashSet<>(strSet2);
        strSet5.removeAll(strSet);
        for (String stringLoc2 : strSet5) {
            System.out.println(stringLoc2);
        }


    }
}
