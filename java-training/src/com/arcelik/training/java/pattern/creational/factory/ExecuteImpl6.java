package com.arcelik.training.java.pattern.creational.factory;


public class ExecuteImpl6 implements IExecute {

    @Override
    public String execute(final String strParam) {
        return "xyz " + strParam;
    }

    @Override
    public String language() {
        return "German";
    }


}
