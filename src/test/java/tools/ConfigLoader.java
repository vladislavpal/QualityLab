package tools;

import lombok.extern.slf4j.Slf4j;

import java.io.FileInputStream;
import java.util.Properties;

@Slf4j
public class ConfigLoader {

    public String getUrl() {
        return getProperty("URL");
    }

    public String getLogin() {
        return getProperty("login");
    }

    public String getPassword() {
        return getProperty("password");
    }

    public String getBrowser() {
        return getProperty("browser");
    }

    private String getProperty(String name) {
        String result = "";
        FileInputStream fis;
        Properties property = new Properties();
        String propertyFile = "src/test/resources/application.properties";

        try {
            fis = new FileInputStream(propertyFile);
            property.load(fis);
            result = property.getProperty(name);

        } catch (Exception e) {
            log.debug("getProperty", e);
        }
        return result;
    }

}
