package com.arcelik.training.java.enums;

import java.util.Scanner;

import com.arcelik.training.java.pattern.creational.factory.ExecuteImpl1;
import com.arcelik.training.java.pattern.creational.factory.ExecuteImpl2;
import com.arcelik.training.java.pattern.creational.factory.ExecuteImpl3;
import com.arcelik.training.java.pattern.creational.factory.IExecute;

public class ExecuteRunner {

    public static final int LANGUAGE_ENGLISH = 1;
    public static final int LANGUAGE_TURKISH = 2;
    public static final int LANGUAGE_SPANISH = 3;

    public static final int TEST_LIMIT       = 3;


    public void run() {
        int i = 2;
        try (Scanner scannerLoc2 = new Scanner(System.in)) {
            System.out.println("name : ");
            String name = scannerLoc2.next();
            System.out.println("Language : ");
            System.out.println("1-English");
            System.out.println("2-Turkish");
            System.out.println("3-spanish");
            System.out.println("Choose : ");
            int language = scannerLoc2.nextInt();
            IExecute executeLoc = null;
            switch (language) {
                case LANGUAGE_ENGLISH:
                    executeLoc = new ExecuteImpl1();
                    break;
                case LANGUAGE_TURKISH:
                    executeLoc = new ExecuteImpl2();
                    break;
                case LANGUAGE_SPANISH:
                    executeLoc = new ExecuteImpl3();
                    break;
                default:
                    executeLoc = new ExecuteImpl1();
                    break;
            }
            if (i > ExecuteRunner.TEST_LIMIT) {
                System.out.println("Heyooo");
            }
            System.out.println(executeLoc.execute(name));
        } catch (Exception eLoc) {

        } finally {

        }

    }

    public void run2(final ELang lang) {
        int i = 2;
        switch (lang) {
            case ENGLISH:
                break;
            case SPANISH:
                break;
            case TURKISH:
                break;
            default:
                break;
        }

    }

    public static void main(final String[] args) {
        ExecuteRunner runnerLoc = new ExecuteRunner();
        runnerLoc.run();
    }
}
