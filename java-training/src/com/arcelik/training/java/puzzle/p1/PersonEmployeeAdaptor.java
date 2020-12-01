package com.arcelik.training.java.puzzle.p1;


public class PersonEmployeeAdaptor extends Employee {

    private final Person person;

    public PersonEmployeeAdaptor(final Person person) {
        this.person = person;
    }

    @Override
    public String getName() {
        return this.person.getIsim();
    }

    @Override
    public void setName(final String nameParam) {
        this.person.setIsim(nameParam);
    }

    @Override
    public String getSurname() {
        return this.person.getSoyisim();
    }

    @Override
    public void setSurname(final String surnameParam) {
        this.person.setSoyisim(surnameParam);
    }

    @Override
    public String getGender() {
        return this.person.getCinsiyet();
    }

    @Override
    public void setGender(final String genderParam) {
        this.person.setCinsiyet(genderParam);
    }

}
