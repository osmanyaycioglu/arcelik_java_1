package com.arcelik.training.java.java18;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamRun {

    public static void main(final String[] args) {
        List<String> asListLoc = Arrays.asList("s40",
                                               "s20",
                                               "s2",
                                               "s10",
                                               "s10",
                                               "s10",
                                               "s15",
                                               "s16",
                                               "s17",
                                               "s4",
                                               "s30");
        System.out.println("--------------------");
        for (String stringLoc : asListLoc) {
            System.out.println(stringLoc);
        }
        System.out.println("--------------------");
        asListLoc.forEach(y -> System.out.println(y));
        asListLoc.forEach(System.out::println);

        System.out.println("--------------------");
        // Streams
        asListLoc.stream()
                 .filter(l -> l.length() > 2)
                 .sorted()
                 .filter(l -> !l.equals("s30"))
                 .distinct()
                 .forEach(System.out::println);

        Optional<String> findAnyLoc = asListLoc.stream()
                                               .filter(l -> l.length() > 2)
                                               .sorted()
                                               .filter(l -> !l.equals("s30"))
                                               .distinct()
                                               .skip(2)
                                               .findAny();

        if (findAnyLoc.isPresent()) {
            System.out.println(findAnyLoc.get());
        }


        asListLoc.stream()
                 .filter(l -> l.length() > 2)
                 .sorted()
                 .filter(l -> !l.equals("s30"))
                 .distinct()
                 .skip(2)
                 .findAny()
                 .ifPresent(System.out::println);

        asListLoc.stream()
                 .filter(l -> l.length() > 2)
                 .distinct()
                 .sorted()
                 .parallel()
                 .filter(l -> !l.equals("s30"))
                 .skip(2)
                 .findAny()
                 .ifPresent(System.out::println);

        System.out.println("--------------------");
        asListLoc.stream()
                 .filter(l -> l.length() > 2)
                 .distinct()
                 .sorted()
                 .filter(l -> !l.equals("s30"))
                 .skip(1)
                 .map(s -> Integer.parseInt(s.substring(1)))
                 .forEach(i -> System.out.println(i));

        System.out.println("--------------------");
        IntSummaryStatistics summaryStatisticsLoc = asListLoc.stream()
                                                             .filter(l -> l.length() > 2)
                                                             .distinct()
                                                             .sorted()
                                                             .filter(l -> !l.equals("s30"))
                                                             .skip(1)
                                                             .mapToInt(s -> Integer.parseInt(s.substring(1)))
                                                             .summaryStatistics();
        System.out.println(summaryStatisticsLoc);
        System.out.println("--------------------");
        List<Integer> collectLoc = asListLoc.stream()
                                            .filter(l -> l.length() > 2)
                                            .distinct()
                                            .sorted()
                                            .filter(l -> !l.equals("s30"))
                                            .skip(1)
                                            .map(s -> Integer.parseInt(s.substring(1)))
                                            .collect(Collectors.toList());

        System.out.println("--------------------");
        asListLoc.stream()
                 .filter(l -> l.length() > 2)
                 .distinct()
                 .sorted()
                 .filter(l -> !l.equals("s30"))
                 .skip(1)
                 .map(s -> Integer.parseInt(s.substring(1)))
                 .collect(Collectors.toConcurrentMap(null,
                                                     null));

    }
}
