package com.arcelik.training.java.pattern.creational.factory;


public class ExecuteImpl3 implements IExecute {

    @Override
    public String execute(final String strParam) {
        return "Halo " + strParam;
    }

    @Override
    public String language() {
        return "Spanish";
    }

}
