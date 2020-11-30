package com.arcelik.training.java.pattern.creational.factory;


public class ExecuteImpl1 implements IExecute {

    @Override
    public String execute(final String strParam) {
        return "Hello " + strParam;
    }

    public void abc() {
        System.out.println("test");
    }

    @Override
    public String language() {
        return "English";
    }

}
