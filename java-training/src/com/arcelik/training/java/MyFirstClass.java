package com.arcelik.training.java;

import java.time.LocalDateTime;

public class MyFirstClass {

    private int      uzunluk;
    private String   isim;

    public String    model;

    protected String renk;

    String           ozellik;


    public String yuru(final int uzun,
                       final LocalDateTime tarih,
                       final String name) {
        int uzunBck = uzun;
        uzunBck = 40 * uzunBck;
        return name + " " + uzun + " " + tarih;
    }

}
