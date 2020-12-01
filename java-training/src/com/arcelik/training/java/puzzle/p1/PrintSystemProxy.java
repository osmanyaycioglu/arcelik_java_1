package com.arcelik.training.java.puzzle.p1;


public class PrintSystemProxy extends PrintSystem {

    @Override
    public void print(final Employee emp) {
        if (emp.getName()
               .length() > 10) {
            throw new IllegalArgumentException();
        }
        super.print(emp);
    }

}
