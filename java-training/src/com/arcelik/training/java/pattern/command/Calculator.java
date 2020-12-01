package com.arcelik.training.java.pattern.command;


public class Calculator {

    public int add(final int val1,
                   final int val2) {
        return val1 + val2;
    }

    public int subs(final int val1,
                    final int val2) {
        return val1 - val2;
    }

    public int multiplier(final int val1,
                          final int val2) {
        return val1 * val2;
    }

    public int div(final int val1,
                   final int val2) {
        return val1 / val2;
    }


}
