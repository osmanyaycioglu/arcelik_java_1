package com.arcelik.training.java.java18;

import java.time.LocalDateTime;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class LambdaRun {

    public static void main(final String[] args) {

        LambdaRun.writeFuncReturn(a -> a.length(),
                                  "osman");

        Consumer<Long> lc = o -> System.out.println("girdi : " + o);

        lc.accept(1000L);

        Supplier<String> ss = () -> "Hello world";
        String stringLoc = ss.get();

        Predicate<LocalDateTime> dp = h -> h.getHour() > 12;
        boolean testLoc = dp.test(LocalDateTime.now());


        LambdaRun lambdaRunLoc = new LambdaRun();
        String extra = "ext";

        ICalis cal = new CalisImpl();
        System.out.println(cal.xyz("osman"));

        ICalis cal2 = new ICalis() {

            @Override
            public String xyz(final String inParam) {
                return "Anonim Merhaba : " + inParam + " " + extra;
            }
        };

        ICalis cal3 = a -> {
            return "Lambda1 Merhaba : " + a + " " + extra;
        };

        ICalis cal4 = a -> "Lambda2 Merhaba : " + a + " " + extra;

        ICalis cal5 = b -> {
            System.out.println("line1");
            return "Lambda2 Merhaba : " + b + " " + extra;
        };

        System.out.println(cal2.xyz("osman"));
        System.out.println(cal3.xyz("osman"));
        System.out.println(cal4.xyz("osman"));

        ISecond sec = (e,
                       r,
                       m) -> System.out.println(e + " " + r + " " + m);

        ISecond sec2 = LambdaRun::abc;

        ISecond sec3 = lambdaRunLoc::xyz;

        ISecond sec4 = (e,
                        r,
                        m) -> {
            System.out.println(e + " " + r + " " + m);
        };

        sec.sec("osman",
                "yay",
                "50");
        sec2.sec("osman",
                 "yay",
                 "50");
        sec3.sec("osman",
                 "yay",
                 "50");
    }

    public void xyz(final String d,
                    final String r,
                    final String k) {
        System.out.println(d + " " + r + " " + k);
    }

    public static void abc(final String str1,
                           final String str2,
                           final String str3) {
        System.out.println(str1 + " " + str2 + " " + str3);
    }

    public static void writeFuncReturn(final Function<String, Integer> func,
                                       final String str) {
        System.out.println("Result : " + func.apply(str));
    }

}
