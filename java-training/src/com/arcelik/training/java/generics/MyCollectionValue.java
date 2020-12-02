package com.arcelik.training.java.generics;

import java.util.Collection;

public class MyCollectionValue<K, T extends Collection<K>> {

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

    public void showCollection() {
        for (K obj : this.value) {
            System.out.println(obj);
        }
    }

}
