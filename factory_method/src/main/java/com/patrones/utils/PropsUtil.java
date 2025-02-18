package com.patrones.utils;

import java.io.InputStream;
import java.util.Properties;

public class PropsUtil {
    public static Properties loadPropertyFile(String path) {
        try {
            Properties props = new Properties();
            InputStream inputStream = PropsUtil.class.getClassLoader().getResourceAsStream(path);
            props.load(inputStream);
            return props;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
};
