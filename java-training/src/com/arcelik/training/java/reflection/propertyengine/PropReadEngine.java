package com.arcelik.training.java.reflection.propertyengine;

public class PropReadEngine {

    public static void main(final String[] args) {
        try {
            PropEngine engineLoc = new PropEngine();
            ApplicationProperties ap = engineLoc.read(ApplicationProperties.class);
            Connection con = engineLoc.read(Connection.class);
            System.out.println(con);
            System.out.println(ap);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
