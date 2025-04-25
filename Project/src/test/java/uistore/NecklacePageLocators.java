package uistore;

import org.openqa.selenium.By;

public class NecklacePageLocators {
    public static By search = By.xpath("//input[@id='q']");
    public static By necklace = By.xpath("(//a[@class='srch_rslt_img productTitle'])[1]");
    public static By quick = By.xpath("(//div[@class='quicklook'])[1]//a");
    public static By weight = By.xpath("//select[@class='form-select selectsize']");
    public static By close = By.xpath("//a[@class='fancybox-item fancybox-close']");
    public static By buy = By.xpath("(//a[@id='btnBuyNow'])[2]");
    public static By necklaceText = By.xpath("//ul//li[2]//span[@id='breadcrumbNavigationLast']");
    public static By pay = By.xpath("//a[@id='proceedToPayButton']");
}
