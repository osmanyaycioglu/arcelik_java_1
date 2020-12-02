package com.arcelik.training.java.generics;


public class GenericValue<T> {

    private String valueName;
    private T      value;

    public String getValueName() {
        return this.valueName;
    }

    public void setValueName(final String valueNameParam) {
        this.valueName = valueNameParam;
    }

    public T getValue() {
        return this.value;
    }

    public void setValue(final T valueParam) {
        this.value = valueParam;
    }


}
