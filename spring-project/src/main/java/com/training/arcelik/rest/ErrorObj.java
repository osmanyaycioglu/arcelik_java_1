package com.training.arcelik.rest;


public class ErrorObj {

    private String desc;
    private int    cause;

    public ErrorObj() {
    }

    public ErrorObj(final String descParam,
                    final int causeParam) {
        super();
        this.desc = descParam;
        this.cause = causeParam;
    }


    public String getDesc() {
        return this.desc;
    }

    public void setDesc(final String descParam) {
        this.desc = descParam;
    }

    public int getCause() {
        return this.cause;
    }

    public void setCause(final int causeParam) {
        this.cause = causeParam;
    }


}
