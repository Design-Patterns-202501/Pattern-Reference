package com.patrones.factory;

import java.util.HashMap;
import java.util.Map;

import com.patrones.interfaces.IPrototype;

public class PrototypeFactory {

    private static Map<String, IPrototype> prototypes = new HashMap<>();

    public static IPrototype getPrototype(String prototypeName) {
        return prototypes.get(prototypeName).deepClone();
    }

    public static void addPrototype(String prototypeName, IPrototype prototype) {
        prototypes.put(prototypeName, prototype);
    }
    
}
