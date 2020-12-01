package com.arcelik.training.java.puzzle.p1;


public class PrintRunner {

    public static void main(final String[] args) {
        Employee employeeLoc = new Employee();
        employeeLoc.setGender("bay");
        employeeLoc.setName("osman");
        employeeLoc.setSurname("yay");
        PrintSystem printSystemLoc = new PrintSystem();
        printSystemLoc.print(employeeLoc);

    }
}
