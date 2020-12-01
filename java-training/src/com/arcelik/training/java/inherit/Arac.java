package com.arcelik.training.java.inherit;


public abstract class Arac implements IHareket {

    private String       marka = "Deneme";

    private final int    durmaMesafesi;

    private final String type;


    public Arac(final int durmaMesafesiParam,
                final String marka,
                final String type) {
        super();
        this.durmaMesafesi = durmaMesafesiParam;
        this.marka = marka;
        this.type = type;
    }


    abstract public String giveMeYourName();

    @Override
    public void geriGit() {
        System.out.println(this.giveMeYourName() + " geri gidiyor" + this.marka);
    }

    @Override
    public void dur() {
        System.out.println("Araba " + this.durmaMesafesi + "m durdu");
    }

    @Override
    public void ileriGit() {
        // 1
        // 2
        // 3
        // 4
        // 5
        System.out.println(this.type + " ileri git " + this.marka);
        // 7
        // 8

    }

}
