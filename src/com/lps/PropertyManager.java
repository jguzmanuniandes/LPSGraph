package com.lps;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertyManager {

    private static final String RUNTIME_PROPERTIES = "application.properties";
    private static Properties property = new Properties();

    private PropertyManager() {}

    static {
        try {
            File file = new File(RUNTIME_PROPERTIES);
            if (!file.exists()) {
                file.createNewFile();
            }
            try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream(RUNTIME_PROPERTIES))) {
                property.load(bis);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String getValueProperty(String propertyName) {
        if (property.getProperty(propertyName) == null) {
            System.err.println("Queried Property '"
                    + propertyName + "' does not exist!");
        }
        return property.getProperty(propertyName);
    }

    public static boolean getProperty(String propertyName) {
        if (property.getProperty(propertyName) == null) {
            System.err.println("Queried Property '"
                    + propertyName + "' does not exist!");
        }
        return Boolean.parseBoolean(property.getProperty(propertyName));
    }

}