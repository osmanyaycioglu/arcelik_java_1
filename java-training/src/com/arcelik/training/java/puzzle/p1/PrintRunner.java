package com.arcelik.training.java.puzzle.p1;


public class PrintRunner {

    public static void main(final String[] args) {
        Employee employeeLoc = new Employee();
        employeeLoc.setGender("bay");
        employeeLoc.setName("osman");
        employeeLoc.setSurname("yay");
        PrintSystem printSystemLoc = new PrintSystem();
        printSystemLoc.print(employeeLoc);
        // Person
        Person person = new Person();
        person.setIsim("ali");
        person.setSoyisim("veli");
        person.setCinsiyet("bay");
        // Person Employee Adaptor
        PersonEmployeeAdaptor adaptorLoc = new PersonEmployeeAdaptor(person);

        printSystemLoc.print(adaptorLoc);
    }
}
