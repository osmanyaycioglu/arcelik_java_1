package com.arcelik.training.java.pattern.creational.factory;

import java.util.ArrayList;
import java.util.List;

public class ExecuteFactory {

    private static List<IExecute> executors = new ArrayList<>();

    static {
        executeLanguageList();
    }

    public static IExecute creatExecute(final int language) {
        IExecute executeLoc = ExecuteFactory.executors.get(language - 1);
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

    public static String createMenu() {
        StringBuilder menustr = new StringBuilder();
        int index = 1;
        for (IExecute iExecuteLoc : ExecuteFactory.executors) {
            menustr.append(index);
            menustr.append("-");
            menustr.append(iExecuteLoc.language());
            menustr.append("\n");
            index++;
        }
        return menustr.toString();
    }

    private static List<IExecute> executeLanguageList() {
        ExecuteFactory.executors.add(new ExecuteImpl1());
        ExecuteFactory.executors.add(new ExecuteImpl2());
        ExecuteFactory.executors.add(new ExecuteImpl3());
        ExecuteFactory.executors.add(new ExecuteImpl4());
        ExecuteFactory.executors.add(new ExecuteImpl5());
        ExecuteFactory.executors.add(new ExecuteImpl6());
        return ExecuteFactory.executors;
    }
}
