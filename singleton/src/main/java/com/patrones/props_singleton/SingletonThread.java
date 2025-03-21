package com.patrones.props_singleton;

public class SingletonThread extends Thread {

    private int _id;

    public SingletonThread(int id) {
        super();
        this._id = id;
    }

    @Override
    public void run() {

        PropsSingleton obj = PropsSingleton.getInstance();
        obj.setApplicationVersion("Version thread " + _id);
        System.out.println("Thread " + _id + " executed");
        System.out.println(obj);
    }
};
