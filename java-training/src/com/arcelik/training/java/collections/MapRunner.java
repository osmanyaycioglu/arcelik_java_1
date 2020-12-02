package com.arcelik.training.java.collections;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;

public class MapRunner {

    public static void main(final String[] args) {

        Map<String, Integer> myMap = new HashMap<>();
        Map<String, Integer> myMap2 = new ConcurrentHashMap<>();
        Map<String, Integer> myMap3 = new TreeMap<>();

        String uuidLoc = UUID.randomUUID()
                             .toString();

        myMap.put(uuidLoc,
                  5);

        myMap.put(uuidLoc,
                  6);

        String uuidLoc2 = UUID.randomUUID()
                              .toString();

        myMap.put(uuidLoc2,
                  10);

        Set<String> keySetLoc = myMap.keySet();
        for (String stringLoc : keySetLoc) {
            System.out.println(myMap.get(stringLoc));
        }

        Collection<Integer> valuesLoc = myMap.values();
        for (Integer integerLoc : valuesLoc) {
            System.out.println(integerLoc);
        }

        Set<Entry<String, Integer>> entrySetLoc = myMap.entrySet();
        for (Entry<String, Integer> entryLoc : entrySetLoc) {
            System.out.println("key : " + entryLoc.getKey() + " value : " + entryLoc.getValue());
        }

    }
}
