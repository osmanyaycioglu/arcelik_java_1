package com.arcelik.training.java.java18;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ConcurrentMap;
import java.util.stream.Collectors;

import com.arcelik.training.atm.Customer;

public class StreamRun2 {

    public static void main(final String[] args) {
        List<Customer> asListLoc = Arrays.asList(new Customer("osman1",
                                                              "yay1",
                                                              "user1",
                                                              "1234",
                                                              null,
                                                              true),
                                                 new Customer("osman2",
                                                              "yay2",
                                                              "user2",
                                                              "1234",
                                                              null,
                                                              true),
                                                 new Customer("osman3",
                                                              "yay3",
                                                              "user3",
                                                              "1234",
                                                              null,
                                                              true),
                                                 new Customer("osman4",
                                                              "yay4",
                                                              "user4",
                                                              "1234",
                                                              null,
                                                              true),
                                                 new Customer("osman5",
                                                              "yay5",
                                                              "user5",
                                                              "1234",
                                                              null,
                                                              true),
                                                 new Customer("osman6",
                                                              "yay6",
                                                              "user6",
                                                              "1234",
                                                              null,
                                                              true),
                                                 new Customer("osman7",
                                                              "yay7",
                                                              "user7",
                                                              "1234",
                                                              null,
                                                              true),
                                                 new Customer("osman8",
                                                              "yay8",
                                                              "user8",
                                                              "1234",
                                                              null,
                                                              true),
                                                 new Customer("osman9",
                                                              "yay9",
                                                              "user9",
                                                              "1234",
                                                              null,
                                                              true));

        ConcurrentMap<String, Customer> collectLoc = asListLoc.stream()
                                                              .filter(c -> c.getName() == null)
                                                              .collect(Collectors.toConcurrentMap(c -> c.getUsername(),
                                                                                                  c -> c));

        Integer reduceLoc = asListLoc.stream()
                                     .filter(c -> c.getName() != null)
                                     .reduce(new Integer(0),
                                             (i,
                                              c) -> c.getName()
                                                     .length()
                                                    + i,
                                             (i1,
                                              i2) -> i1 + i2);
        System.out.println("Toplam : " + reduceLoc);
    }
}
