package utils;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverHelper {
    private WebDriver driver;
    List<String> windows = new ArrayList<>();

    public WebDriverHelper(WebDriver driver) {
        this.driver = driver;
        windows.add(driver.getWindowHandle());
    }

    public void clickOnElement(By locator) {
        try {
            WebElement webElement = driver.findElement(locator);
            webElement.click();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void sendKeys(By locator, String data) {
        try {
            WebElement webElement = driver.findElement(locator);
            webElement.sendKeys(data);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public void enterAction(By locator) {
        try {
            WebElement webElement = driver.findElement(locator);
            webElement.sendKeys(Keys.ENTER);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void waitForTheElementToBeVisible(By locator, int timeOutInSeconds) {
        try {
            new WebDriverWait(driver, Duration.ofSeconds(timeOutInSeconds))
                    .until(ExpectedConditions.visibilityOfElementLocated(locator));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public List<WebElement> getElementsByPath(By locator) {

        List<WebElement> elements = new ArrayList<>();
        try {
            elements = driver.findElements(locator);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return elements;
    }

    public void iterate(String text, By locator) {
        try {
            List<WebElement> products = getElementsByPath(locator);
            for (WebElement product : products) {
                String label = product.getText();
                if (label.contains(text)) {
                    product.click();
                    break;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void hoverOverElement(By locator) {
        try {
            WebElement element = driver.findElement(locator);
            Actions action = new Actions(driver);
            action.moveToElement(element).perform();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void scrollByElement(By locator) {
        try {
            WebElement webElement = driver.findElement(locator);
            JavascriptExecutor javascriptexecutor = (JavascriptExecutor) driver;
            javascriptexecutor.executeScript("arguments[0].scrollIntoView(true)", webElement);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void clickAndswitchForward(By locator) {
        try {
            String parent = driver.getWindowHandle();
            clickOnElement(locator);
            Set<String> allwindows = driver.getWindowHandles();
            for (String child : allwindows) {
                if (!child.equalsIgnoreCase(parent) && !windows.contains(child)) {
                    windows.add(child);
                    driver.switchTo().window(child);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void switchBackward(int index) {
        try {
            driver.switchTo().window(windows.get(index));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void selectDropDown(By locator, String str) {
        try {
            WebElement element = driver.findElement(locator);
            Select dropdown = new Select(element);
            dropdown.selectByVisibleText(str);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void switchToiframe(By locator) {
        try {
            WebElement frame = driver.findElement(locator);
            driver.switchTo().frame(frame);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void switchBackToFrame() {
        try {
            driver.switchTo().defaultContent();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
