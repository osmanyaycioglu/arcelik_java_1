package com.arcelik.training.java.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.CopyOnWriteArrayList;

public class ListRunner {

    public static void main(final String[] args) {
        List<String> strList1 = new ArrayList<>(1_000_000);
        List<String> strList2 = new Vector<>(15);

        List<String> strList3 = new CopyOnWriteArrayList<>();

        //List<String> strList1 = new LinkedList<>();

        List<String> synchronizedListLoc = Collections.synchronizedList(strList1);

        List<SetObj> setList1 = new ArrayList<>();

        SetObj objLoc1 = new SetObj();
        objLoc1.setAge(50);
        objLoc1.setName("osman");
        setList1.add(objLoc1);
        SetObj objLoc2 = new SetObj();
        objLoc2.setAge(51);
        objLoc2.setName("osman");
        setList1.add(objLoc2);

        Collections.sort(setList1);
        Collections.sort(setList1,
                         new Comparator<SetObj>() {

                             @Override
                             public int compare(final SetObj o1Param,
                                                final SetObj o2Param) {
                                 return o1Param.getAge() - o2Param.getAge();
                             }
                         });


        long delta = System.currentTimeMillis();
        for (int iLoc = 0; iLoc < 1_000_000; iLoc++) {
            strList1.add("osman" + iLoc);
        }
        System.out.println("Delta : " + (System.currentTimeMillis() - delta));

        try {
            strList1.clear();
            System.gc();
            Thread.sleep(2_000);
        } catch (InterruptedException e) {
        }

        delta = System.currentTimeMillis();
        for (int iLoc = 0; iLoc < 1_000_000; iLoc++) {
            strList1.add("osman");
        }
        System.out.println("Add Delta : " + (System.currentTimeMillis() - delta));

        delta = System.currentTimeMillis();
        for (int iLoc = 0; iLoc < 1_000_000; iLoc++) {
            strList1.get(iLoc);
        }
        System.out.println("Get Delta : " + (System.currentTimeMillis() - delta));

        delta = System.currentTimeMillis();
        for (String stringLoc : strList1) {

        }
        System.out.println("List Delta : " + (System.currentTimeMillis() - delta));

        delta = System.currentTimeMillis();
        for (int iLoc = 0; iLoc < 10_000; iLoc++) {
            strList1.remove(1_000);
        }
        System.out.println("Delete Delta : " + (System.currentTimeMillis() - delta));

        delta = System.currentTimeMillis();
        for (int iLoc = 0; iLoc < 1_000; iLoc++) {
            strList1.contains(10_000);
        }
        System.out.println("Contains Delta : " + (System.currentTimeMillis() - delta));

    }
}

