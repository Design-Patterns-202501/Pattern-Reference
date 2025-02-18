package com.patrones.utils;

import java.io.InputStream;
import java.util.Properties;

public class PropsUtil {
    public static Properties loadPropertyFile(String path) {
        try {
            Properties props = new Properties();
            System.out.println("The path is " + path);
            InputStream inputStream = PropsUtil.class.getClassLoader().getResourceAsStream(path);
            System.out.println("InputStream is " + inputStream.toString());
            props.load(inputStream);
            return props;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
};
