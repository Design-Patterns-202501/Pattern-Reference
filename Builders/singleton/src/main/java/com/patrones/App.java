package com.patrones;

import com.patrones.props_singleton.PropsSingleton;
import com.patrones.props_singleton.SingletonThread;

public class App {
    public static void main(String[] args) {
        PropsSingleton a = PropsSingleton.getInstance();
        PropsSingleton b = PropsSingleton.getInstance();

        System.out.println(a);
        System.out.println(b);

        a.setApplicationName("Modificado");

        System.out.println(a);
        System.out.println(b);


        SingletonThread one = new SingletonThread(1);
        SingletonThread two = new SingletonThread(2);
        SingletonThread three = new SingletonThread(3);

        one.run(); two.run(); three.run();

        System.out.println(a);
    }
}
