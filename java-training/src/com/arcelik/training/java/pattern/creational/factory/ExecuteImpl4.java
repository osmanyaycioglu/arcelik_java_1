package com.arcelik.training.java.pattern.creational.factory;


public class ExecuteImpl4 implements IExecute {

    @Override
    public String execute(final String strParam) {
        return "Selaminaleyküm " + strParam;
    }

    @Override
    public String language() {
        return "Arabic";
    }


}
