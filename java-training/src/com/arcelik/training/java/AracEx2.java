package com.arcelik.training.java;

public class AracEx2 {

    private final int    menzil;
    private final int    hiz;
    private final String name;
    private final long   calismaSaati;
    private final String type;


    private AracEx2(final int menzilParam,
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

        private int    menzil;
        private int    hiz;
        private String name;
        private long   calismaSaati;
        private String type;

        private AracExBuilder() {
        }

        public AracExBuilder withMenzil(final int menzilParam) {
            this.menzil = menzilParam;
            return this;
        }

        public AracExBuilder withHiz(final int hizParam) {
            this.hiz = hizParam;
            return this;
        }

        public AracExBuilder withName(final String nameParam) {
            this.name = nameParam;
            return this;
        }

        public AracExBuilder withCalismaSaati(final long calismaSaatiParam) {
            this.calismaSaati = calismaSaatiParam;
            return this;
        }

        public AracExBuilder withType(final String typeParam) {
            this.type = typeParam;
            return this;
        }

        public AracEx2 forAPI1() {
            AracEx2 aracEx2Loc = new AracEx2(this.menzil,
                                             this.hiz,
                                             this.name,
                                             this.calismaSaati,
                                             this.type);
            // Validation
            return aracEx2Loc;
        }

        public AracEx2 forAPI2() {
            AracEx2 aracEx2Loc = new AracEx2(this.menzil,
                                             this.hiz,
                                             this.name,
                                             this.calismaSaati,
                                             this.type);
            // Validation
            return aracEx2Loc;
        }

    }

}
