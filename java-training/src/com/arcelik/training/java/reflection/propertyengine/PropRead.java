package com.arcelik.training.java.reflection.propertyengine;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class PropRead {

    public static void main(final String[] args) {
        try {
            Properties propertiesLoc = new Properties();
            File file = new File("app.properties");
            FileInputStream streamLoc = new FileInputStream(file);
            propertiesLoc.load(streamLoc);
            ApplicationProperties ap = new ApplicationProperties();
            ap.setName(propertiesLoc.getProperty("app.name"));
            ap.setVersion(propertiesLoc.getProperty("app.version"));
            ap.setDesc(propertiesLoc.getProperty("app.desc"));
            ap.setLength(Integer.parseInt(propertiesLoc.getProperty("app.length")));
            System.out.println(ap);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
