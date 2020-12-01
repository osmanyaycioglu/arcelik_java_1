package com.arcelik.training.java.pattern.creational.singleton;


public class SingletonRunner {

    public static void main(final String[] args) {
        //        StaticSingleton.hello();
        //
        //        Singleton.getInstance()
        //                 .hello();
        ESingleton.INSTANCE.hello();

        LazySingleton.getInstance()
                     .hello();
    }
}
