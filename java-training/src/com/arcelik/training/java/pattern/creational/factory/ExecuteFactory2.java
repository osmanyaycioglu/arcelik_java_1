package com.arcelik.training.java.pattern.creational.factory;

import java.util.ArrayList;
import java.util.List;

public class ExecuteFactory2 {

    private volatile static ExecuteFactory2 instance;
    private final List<IExecute>            executors = new ArrayList<>();

    public static ExecuteFactory2 getInstance() {
        if (ExecuteFactory2.instance == null) {
            synchronized (ExecuteFactory2.class) {
                if (ExecuteFactory2.instance == null) {
                    ExecuteFactory2.instance = new ExecuteFactory2();
                    ExecuteFactory2.instance.executeLanguageList();
                }
            }
        }
        return ExecuteFactory2.instance;
    }


    public IExecute creatExecute(final int language) {
        IExecute executeLoc = this.executors.get(language - 1);
        if (executeLoc == null) {
            executeLoc = new ExecuteImpl1();
        }

        //        switch (language) {
        //            case 1:
        //                executeLoc = new ExecuteImpl1();
        //                break;
        //            case 2:
        //                executeLoc = new ExecuteImpl2();
        //                break;
        //            case 3:
        //                executeLoc = new ExecuteImpl3();
        //                break;
        //            case 4:
        //                executeLoc = new ExecuteImpl4();
        //                break;
        //            case 5:
        //                executeLoc = new ExecuteImpl5();
        //                break;
        //            default:
        //                executeLoc = new ExecuteImpl1();
        //                break;
        //        }
        return executeLoc;
    }

    public String createMenu() {
        StringBuilder menustr = new StringBuilder();
        int index = 1;
        for (IExecute iExecuteLoc : this.executors) {
            menustr.append(index);
            menustr.append("-");
            menustr.append(iExecuteLoc.language());
            menustr.append("\n");
            index++;
        }
        return menustr.toString();
    }

    private List<IExecute> executeLanguageList() {
        this.executors.add(new ExecuteImpl1());
        this.executors.add(new ExecuteImpl2());
        this.executors.add(new ExecuteImpl3());
        this.executors.add(new ExecuteImpl4());
        this.executors.add(new ExecuteImpl5());
        this.executors.add(new ExecuteImpl6());
        return this.executors;
    }
}
