package utils;
 
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
public class LoadProperties {
    public Properties properties;
 
    public LoadProperties() {
        String propertiesPath = System.getProperty("user.dir") + "/config/browser.properties";
        properties = new Properties();
        try (FileInputStream fis = new FileInputStream(propertiesPath)) {
            properties.load(fis);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
 
    public String getProperty(String key) {
        return properties.getProperty(key);
    }
   
}