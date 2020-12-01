package com.arcelik.training.java.pattern.command;

public class CalculatorEx {

    private volatile static CalculatorEx instance;

    private CalculatorCommandFactory     ccf;


    private CalculatorEx() {
    }

    public static CalculatorEx getInstance() {
        if (CalculatorEx.instance == null) {
            synchronized (CalculatorEx.class) {
                if (CalculatorEx.instance == null) {
                    CalculatorEx.instance = new CalculatorEx();
                    CalculatorEx.instance.ccf = new CalculatorCommandFactory();
                    CalculatorEx.instance.ccf.init();
                }
            }
        }
        return CalculatorEx.instance;
    }

    public void showMenu() {
        this.ccf.showMenu();
    }

    public int execute(final int index,
                       final CommandContext cc) {
        ICalculatorCommand iCalculatorCommandLoc = this.ccf.getCommand(index);
        return iCalculatorCommandLoc.execute(cc);
    }
}
