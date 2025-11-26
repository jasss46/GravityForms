package Helpers;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

public class FetchPropertiesData {
    private static final String rootDir = System.getProperty("user.dir");

    private static final String environmentVariablesFilePath = rootDir + "/src/test/java/Utils/EnvironmentVariables.properties";

    private static final Properties environmentVariables = new Properties();

    static {
        loadPropertiesData(environmentVariables, environmentVariablesFilePath);
    }

    private static void loadPropertiesData(Properties file, String filePath) {
        try {
            InputStream ip = new FileInputStream(filePath);
            file.load(ip);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static String getEnvironmentVariables(String key) {
        return environmentVariables.getProperty(key);
    }
}