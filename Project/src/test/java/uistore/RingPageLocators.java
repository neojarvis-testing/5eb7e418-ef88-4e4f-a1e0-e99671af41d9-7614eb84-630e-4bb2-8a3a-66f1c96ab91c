package uistore;

import org.openqa.selenium.By;

public class RingPageLocators {
    public static By search = By.xpath("//input[@id='q']");
    public static By gender = By.xpath("//div[text()='Gender']");
    public static By men = By.xpath("//a[text()=' Men ']");
    public static By metal = By.xpath("//div[text()='Metal']");
    public static By gold = By.xpath("//a[text()=' Gold ']");
    public static By ringProduct = By.xpath("(//a[@class='tooltip_18'])[1]");
    public static By cart = By.xpath("(//a[@id='btnBuyNow'])[1]");

    
    public static By ringText = By.xpath("//span[@class='highlight_breadcrumb']");
    public static By genderText = By.xpath("//div[@id='selected_fltrs']//span");
    public static By productText = By.xpath("//span[@id='productTitleInPDP']");
    public static By goldText = By.xpath("//div[@id='selected_fltrs']//span[2]");
    public static By menText = By.xpath("//div[@id='selected_fltrs']//span[1]");
}
