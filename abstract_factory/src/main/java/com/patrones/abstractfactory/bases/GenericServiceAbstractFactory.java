package com.patrones.abstractfactory.bases;

import java.util.Properties;

import com.patrones.utils.AccessUtils;

public class GenericServiceAbstractFactory {
    
    public static IGenericBaseService createServiceFactory() {

        Properties props = AccessUtils.loadProperties("properties/factory.properties");
        String factoryClass = props.getProperty("implemented");

        try {
            
            return (IGenericBaseService) Class.forName(factoryClass).getDeclaredConstructor().newInstance();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
