package com.arcelik.training.java.reflection;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

import com.arcelik.training.java.annotation.AnnoUsage;
import com.arcelik.training.java.annotation.MyAnno;

public class ReflectionUsage {

    public static void main(final String[] args) {
        try {
            Class<AnnoUsage> forNameLoc = (Class<AnnoUsage>) Class.forName("com.arcelik.training.java.annotation.AnnoUsage");
            Class<AnnoUsage> clz = AnnoUsage.class;
            Field[] declaredFieldsLoc = clz.getDeclaredFields();
            for (Field fieldLoc : declaredFieldsLoc) {
                System.out.println(fieldLoc.getName());

                MyAnno annotationLoc = fieldLoc.getAnnotation(MyAnno.class);
                if (annotationLoc != null) {
                    System.out.println("MyAnno : value = " + annotationLoc.value() + "  abc : " + annotationLoc.abc());
                }

                Annotation[] annotationsLoc = fieldLoc.getAnnotations();
                for (Annotation anno : annotationsLoc) {
                    Class<? extends Annotation> annotationTypeLoc = anno.annotationType();
                    System.out.println("Field : " + fieldLoc.getName() + " Anno : " + annotationTypeLoc);
                }
            }
            Method[] declaredMethodsLoc = clz.getDeclaredMethods();
            for (Method methodLoc : declaredMethodsLoc) {
                System.out.println("Method : "
                                   + methodLoc.getName()
                                   + " ret  : "
                                   + methodLoc.getReturnType()
                                              .getName());
            }

            // AnnoUsage newInstanceLoc = clz.newInstance();


        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
