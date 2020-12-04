package com.training.arcelik;

public class ExecuteImpl1 implements IExecute {

    @Override
    public void exec(final String strParam) {
        System.out.println("Hello " + strParam);
    }

}
