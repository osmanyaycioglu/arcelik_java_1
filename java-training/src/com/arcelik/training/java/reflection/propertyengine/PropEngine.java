package com.arcelik.training.java.reflection.propertyengine;

import java.io.File;
import java.io.FileInputStream;
import java.lang.reflect.Field;
import java.util.Properties;

public class PropEngine {

    public <T> T read(final Class<T> clz) {
        PropFile annotationLoc = clz.getAnnotation(PropFile.class);
        if (annotationLoc != null) {
            try {
                T instance = clz.newInstance();
                Properties propertiesLoc = new Properties();
                File file = new File(annotationLoc.value());
                FileInputStream streamLoc = new FileInputStream(file);
                propertiesLoc.load(streamLoc);

                Field[] declaredFieldsLoc = clz.getDeclaredFields();
                for (Field fieldLoc : declaredFieldsLoc) {
                    Prop propAnnoLoc = fieldLoc.getAnnotation(Prop.class);
                    if (propAnnoLoc != null) {
                        fieldLoc.setAccessible(true);
                        String valueLoc = propAnnoLoc.value();
                        String propertyLoc = propertiesLoc.getProperty(valueLoc);
                        if (propertyLoc != null) {
                            Class<?> typeLoc = fieldLoc.getType();
                            if (typeLoc == String.class) {
                                fieldLoc.set(instance,
                                             propertyLoc);
                            } else if (typeLoc == Integer.class) {
                                fieldLoc.set(instance,
                                             Integer.parseInt(propertyLoc));
                            }
                        }
                    }
                }
                return instance;
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return null;
    }

}
