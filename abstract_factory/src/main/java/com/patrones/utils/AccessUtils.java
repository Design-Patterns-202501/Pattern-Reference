package com.patrones.utils;

import java.io.InputStream;
import java.util.Properties;

public class AccessUtils {
    
    public static Properties loadProperties(String propertiesUrl) {

        try {
            Properties props = new Properties();
            InputStream inputStream = AccessUtils.class.getClassLoader().getResourceAsStream(propertiesUrl);
            props.load(inputStream);
            return props;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
