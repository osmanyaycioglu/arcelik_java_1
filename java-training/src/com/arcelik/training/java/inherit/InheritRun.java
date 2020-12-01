package com.arcelik.training.java.inherit;


public class InheritRun {

    public static void main(final String[] args) {
        Arac a = new Araba();
        a.ileriGit();
        a.geriGit();

        if (a instanceof Araba) {
            Araba b = (Araba) a;
            b.dur();
            b.ileriGit();
            b.geriGit();
        }

    }
}
