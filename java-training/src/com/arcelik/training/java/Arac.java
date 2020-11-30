package com.arcelik.training.java;

public class Arac {

    private int    menzil;
    private int    hiz;
    private String name;
    private long   calismaSaati;
    private String type;


    public Arac(final int menzilParam,
                final int hizParam,
                final String nameParam) {
        super();
        this.menzil = menzilParam;
        this.hiz = hizParam;
        this.name = nameParam;
    }


    public Arac(final int menzilParam,
                final int hizParam,
                final String nameParam,
                final long calismaSaatiParam) {
        super();
        this.menzil = menzilParam;
        this.hiz = hizParam;
        this.name = nameParam;
        this.calismaSaati = calismaSaatiParam;
    }

    public Arac(final int menzilParam,
                final int hizParam,
                final String nameParam,
                final long calismaSaatiParam,
                final String typeParam) {
        super();
        this.menzil = menzilParam;
        this.hiz = hizParam;
        this.name = nameParam;
        this.calismaSaati = calismaSaatiParam;
        this.type = typeParam;
    }


    public long getCalismaSaati() {
        return this.calismaSaati;
    }


    public void setCalismaSaati(final long calismaSaatiParam) {
        this.calismaSaati = calismaSaatiParam;
    }


    public String getType() {
        return this.type;
    }


    public void setType(final String typeParam) {
        this.type = typeParam;
    }


    public int getMenzil() {
        return this.menzil;
    }

    public void setMenzil(final int menzilParam) {
        this.menzil = menzilParam;
    }

    public int getHiz() {
        return this.hiz;
    }

    public void setHiz(final int hizParam) {
        this.hiz = hizParam;
    }

    public String getName() {
        return this.name;
    }

    public void setName(final String nameParam) {
        this.name = nameParam;
    }


}
