package config;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Environments {

    private static String getValueFromProperties(String name) {

        FileInputStream fis;
        Properties property = new Properties();

        try {
            fis = new FileInputStream("src/main/resources/config.properties");
            property.load(fis);
        } catch (IOException e) {
            e.printStackTrace();
        }

        return property.getProperty(name);
    }

    public static String BASE_URL = getValueFromProperties("BASE_URL");
}
