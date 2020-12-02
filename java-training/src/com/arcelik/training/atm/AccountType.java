package com.arcelik.training.atm;


public enum AccountType {

    TL("tl"),
    DOLAR("dolar");

    private final String text;

    AccountType(final String textParam) {
        this.text = textParam;
    }

    public String getText() {
        return this.text;
    }
}
