package com.patrones.utils;

import java.io.InputStream;
import java.util.Properties;

public class PropsReader {
    public static Properties loadProperties(String path) {
        try {
            Properties props = new Properties();
            InputStream inputStream = PropsReader.class.getClassLoader().getResourceAsStream(path);
            props.load(inputStream);

            return props;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
};
