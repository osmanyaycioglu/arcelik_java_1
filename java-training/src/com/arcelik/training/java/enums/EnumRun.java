package com.arcelik.training.java.enums;

import com.arcelik.training.java.pattern.creational.factory.IExecute;

public class EnumRun {

    public static void main(final String[] args) {
        ELang l = ELang.ENGLISH;
        System.out.println(l.greet());

        IExecute exe = ELang.SPANISH;
        System.out.println(exe.execute("osman"));
    }
}
