package com.arcelik.training.java.java18;

@FunctionalInterface
public interface ISecond {

    void sec(String str1,
             String str2,
             String str3);

    default void exec() {
        this.sec("1",
                 "denem",
                 "hd");
    }
}
