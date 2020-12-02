package com.arcelik.training.java.generics;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;

public class VAlueRunner {

    public static void main(final String[] args) {
        GenericValue<Integer> intGen = new GenericValue<>();
        intGen.setValue(100);
        Integer value2Loc = intGen.getValue();


        GenericValue<BigDecimal> bigGen = new GenericValue<>();
        bigGen.setValue(BigDecimal.TEN);
        BigDecimal value3Loc = bigGen.getValue();


        MyCollectionValue<Integer, List<Integer>> collectionValueLoc = new MyCollectionValue<>();
        collectionValueLoc.setValue(new ArrayList<>());
        collectionValueLoc.showCollection();


        ObjectValue objectValueLoc = new ObjectValue();
        objectValueLoc.setValueName("MyIntegerValue");
        objectValueLoc.setValue(new ArrayBlockingQueue<>(100));


        String stringLoc = (String) objectValueLoc.getValue();

        System.out.println(stringLoc);

        Object valueLoc = objectValueLoc.getValue();
        if (valueLoc instanceof Integer) {

        } else if (valueLoc instanceof Long) {

        } else if (valueLoc instanceof String) {

        }

    }
}
