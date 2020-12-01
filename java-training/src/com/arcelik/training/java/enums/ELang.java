package com.arcelik.training.java.enums;

import com.arcelik.training.java.pattern.creational.factory.IExecute;

public enum ELang implements IExecute {

    ENGLISH(1, "İngilizce"),
    TURKISH(2, "Türkçe") {

        @Override
        public String greet() {
            return "merhaba";
        }

        @Override
        public String language() {
            return "Turkish";
        }

        @Override
        public String execute(final String strParam) {
            return "Merhaba " + strParam;
        }


    },
    SPANISH(3, "İspanyolca") {

        @Override
        public String greet() {
            return "Alo";
        }

        @Override
        public String language() {
            return "Spanish";
        }

        @Override
        public String execute(final String strParam) {
            return "Alo " + strParam;
        }
    };


    private final int    index;
    private final String name;

    private ELang(final int index,
                  final String name) {
        this.index = index;
        this.name = name;
    }

    public int getIndex() {
        return this.index;
    }

    public String getName() {
        return this.name;
    }

    public String greet() {
        return "hello";
    }

    @Override
    public String language() {
        return "English";
    }

    @Override
    public String execute(final String strParam) {
        return "Hello " + strParam;
    }
}
