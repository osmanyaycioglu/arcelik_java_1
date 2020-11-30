package com.arcelik.training.java.pattern.creational.factory;

import java.util.Scanner;

public class ExecuteRunner {

    public void run() {
        // Eski yöntem
        //        Scanner scannerLoc = new Scanner(System.in);
        //        try {
        //
        //        } catch (Exception eLoc) {
        //
        //        } finally {
        //            if (scannerLoc != null) {
        //                scannerLoc.close();
        //            }
        //        }

        try (Scanner scannerLoc2 = new Scanner(System.in)) {
            System.out.println("name : ");
            String name = scannerLoc2.next();
            System.out.println(ExecuteFactory.createMenu());
            System.out.println("Choose : ");
            int language = scannerLoc2.nextInt();
            IExecute executeLoc = ExecuteFactory.creatExecute(language);
            System.out.println(executeLoc.execute(name));
        } catch (Exception eLoc) {

        } finally {

        }

        //        try (Scanner scannerLoc2 = new Scanner(System.in)) {
        //            System.out.println("name : ");
        //            String name = scannerLoc2.next();
        //            System.out.println("Language : ");
        //            System.out.println("1-English");
        //            System.out.println("2-Turkish");
        //            System.out.println("3-spanish");
        //            System.out.println("Choose : ");
        //            int language = scannerLoc2.nextInt();
        //            IExecute executeLoc = null;
        //            switch (language) {
        //                case 1:
        //                    executeLoc = new ExecuteImpl1();
        //                    break;
        //                case 2:
        //                    executeLoc = new ExecuteImpl2();
        //                    break;
        //                case 3:
        //                    executeLoc = new ExecuteImpl3();
        //                    break;
        //                default:
        //                    executeLoc = new ExecuteImpl1();
        //                    break;
        //            }
        //            System.out.println(executeLoc.execute(name));
        //        } catch (Exception eLoc) {
        //
        //        } finally {
        //
        //        }

    }

    public static void main(final String[] args) {
        ExecuteRunner runnerLoc = new ExecuteRunner();
        runnerLoc.run();
    }
}
