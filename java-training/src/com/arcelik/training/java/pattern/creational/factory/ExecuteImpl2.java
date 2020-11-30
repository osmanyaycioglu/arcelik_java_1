package com.arcelik.training.java.pattern.creational.factory;


public class ExecuteImpl2 implements IExecute {

    @Override
    public String execute(final String strParam) {
        return "Merhaba " + strParam;
    }

    @Override
    public String language() {
        return "Turkish";
    }

}
