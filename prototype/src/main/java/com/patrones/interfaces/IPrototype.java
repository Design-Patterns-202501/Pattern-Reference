package com.patrones.interfaces;

public interface IPrototype< T extends IPrototype > extends Cloneable {
    public T clone();
    public T deepClone();
};
