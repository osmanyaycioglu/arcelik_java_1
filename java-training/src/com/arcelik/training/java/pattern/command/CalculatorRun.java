package com.arcelik.training.java.pattern.command;

import java.util.Scanner;

public class CalculatorRun {

    public static void main(final String[] args) {
        CalculatorEx calculatorExLoc = CalculatorEx.getInstance();
        try (Scanner scannerLoc2 = new Scanner(System.in)) {
            calculatorExLoc.showMenu();
            System.out.println("Choose : ");
            int index = scannerLoc2.nextInt();
            System.out.println("Val1 : ");
            int val1 = scannerLoc2.nextInt();
            System.out.println("Val2 : ");
            int val2 = scannerLoc2.nextInt();
            CommandContext cc = new CommandContext();
            cc.setVal1(val1);
            cc.setVal2(val2);
            int result = calculatorExLoc.execute(index,
                                                 cc);
            System.out.println("Sonuç : " + result);
        } catch (Exception eLoc) {

        } finally {

        }
    }
}
