package com.arcelik.training.java;

public class AracEx {

    private int    menzil;
    private int    hiz;
    private String name;
    private long   calismaSaati;
    private String type;


    private AracEx() {
    }

    public long getCalismaSaati() {
        return this.calismaSaati;
    }

    public String getType() {
        return this.type;
    }

    public int getMenzil() {
        return this.menzil;
    }

    public int getHiz() {
        return this.hiz;
    }

    public String getName() {
        return this.name;
    }


    public static AracExBuilder getBuilder() {
        return new AracExBuilder();
    }

    public static class AracExBuilder {

        private final AracEx aracEx = new AracEx();

        private AracExBuilder() {
        }

        public AracExBuilder withMenzil(final int menzilParam) {
            this.aracEx.menzil = menzilParam;
            return this;
        }

        public AracExBuilder withHiz(final int hizParam) {
            this.aracEx.hiz = hizParam;
            return this;
        }

        public AracExBuilder withName(final String nameParam) {
            this.aracEx.name = nameParam;
            return this;
        }

        public AracExBuilder withCalismaSaati(final long calismaSaatiParam) {
            this.aracEx.calismaSaati = calismaSaatiParam;
            return this;
        }

        public AracExBuilder withType(final String typeParam) {
            this.aracEx.type = typeParam;
            return this;
        }

        public AracEx forAPI1() {
            // Validation
            return this.aracEx;
        }

        public AracEx forAPI2() {
            // Validation
            return this.aracEx;
        }


    }


}
