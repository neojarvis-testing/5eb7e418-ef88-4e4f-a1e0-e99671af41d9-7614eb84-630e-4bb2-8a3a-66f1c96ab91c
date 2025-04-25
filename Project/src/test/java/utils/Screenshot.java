package utils;

import java.io.File;
import java.io.IOException;
// import utils.Base;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;

import com.google.common.io.Files;

public class Screenshot extends Base {
    public static TakesScreenshot ts;

    public static void takeScreenshotWithTimestamp(String filename) {
        String timestamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
        String name = filename + timestamp + ".png";
        ts = (TakesScreenshot) driver;
        File file = ts.getScreenshotAs(OutputType.FILE);
        File screenshotDir = new File(System.getProperty("user.dir") + "/screenshots");
        if (!screenshotDir.exists()) {
            screenshotDir.mkdirs();
        }
        File target = new File(screenshotDir, name);
        try {
            Files.copy(file, target);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void captureSpecificElementScreenshot(String filename, By locator) {
        WebElement element = driver.findElement(locator);
        String timestamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
        String name = filename + timestamp + ".png";
        File file = element.getScreenshotAs(OutputType.FILE);
        File screenshotDir = new File(System.getProperty("user.dir") + "/screenshots");
        if (!screenshotDir.exists()) {
            screenshotDir.mkdirs();
        }
        File target = new File(screenshotDir, name);
        try {
            Files.copy(file, target);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
