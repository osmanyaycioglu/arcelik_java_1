package com.arcelik.training.java.annotation;

@MyAnno(value = "test", abc = 100)
public class AnnoUsage {

    @MyAnno(value = "start", abc = 1213)
    private String  desc;
    @MyAnno(value = "end", abc = 234)
    private Integer duartion;


    @MyAnno("test2")
    public void show() {

    }


    public String getDesc() {
        return this.desc;
    }

    public void setDesc(final String descParam) {
        this.desc = descParam;
    }

    public Integer getDuartion() {
        return this.duartion;
    }

    public void setDuartion(final Integer duartionParam) {
        this.duartion = duartionParam;
    }


}
