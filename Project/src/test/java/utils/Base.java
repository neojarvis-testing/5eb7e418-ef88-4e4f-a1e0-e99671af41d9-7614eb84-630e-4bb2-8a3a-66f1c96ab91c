package utils;

import java.net.URL;
import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.events.EventFiringDecorator;
import org.openqa.selenium.support.events.WebDriverListener;

public class Base {
    public static WebDriver driver;
    public static LoadProperties loadProperties;

    public void openBrowser() {
        try {
            loadProperties = new LoadProperties();
            ChromeOptions options = new ChromeOptions();
            driver = new RemoteWebDriver(new URL(loadProperties.getProperty("gridurl")), options);
            driver.manage().window().maximize();
            driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
            driver.get(loadProperties.getProperty("url"));

        } catch (Exception e) {
            LoggerHandler.info(e.getMessage());
        }
        WebDriverListener listener = new EventHandler();
        driver = new EventFiringDecorator<>(listener).decorate(driver);
    }

}