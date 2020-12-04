package com.training.arcelik.rest;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.xml.bind.annotation.XmlTransient;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Phone {

    @Id
    @GeneratedValue
    private long   phoneId;
    private String name;
    private String number;

    @JsonIgnore
    @XmlTransient
    @ManyToOne
    // @JoinColumn
    private Person person;


    public String getName() {
        return this.name;
    }

    public void setName(final String nameParam) {
        this.name = nameParam;
    }

    public String getNumber() {
        return this.number;
    }

    public void setNumber(final String numberParam) {
        this.number = numberParam;
    }

    public long getPhoneId() {
        return this.phoneId;
    }

    public void setPhoneId(final long phoneIdParam) {
        this.phoneId = phoneIdParam;
    }

    public Person getPerson() {
        return this.person;
    }

    public void setPerson(final Person personParam) {
        this.person = personParam;
    }


}
