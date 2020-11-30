package com.arcelik.training.java.pattern.creational.factory;


public class ExecuteImpl5 implements IExecute {

    @Override
    public String execute(final String strParam) {
        return "abc " + strParam;
    }

    @Override
    public String language() {
        return "Latin";
    }


}
