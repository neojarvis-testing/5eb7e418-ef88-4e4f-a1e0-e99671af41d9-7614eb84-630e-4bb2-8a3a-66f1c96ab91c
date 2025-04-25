package uistore;

import org.openqa.selenium.By;

public class VivahamPageLocators {
    public By relianceJewelsLogo = By.cssSelector("img[title='Online Shopping in India']");
    public By whatsTrendingtext = By.xpath("(//a[@data-hover='dropdown'])[2]");
    public By vivaham = By.xpath("//a[text()='Vivaham']");
    public By locateAStore = By.xpath("//a[text()='LOCATE A STORE']");
    public By storeListTextVerify = By.xpath("//a[@data-target='#advanced-search']");
    public By stateDropdown = By.xpath("//select[@name='administrative_area']");
    public By cityDropdown = By.xpath("//select[@name='locality']");
    public By searchButton = By.xpath("(//button[@id='store_search'])[2]");
    public By delhiText = By.xpath("(//p[text()='Delhi'])[1]");
    public By sortBy = By.xpath("//div[@class='sortsection']/child::p");
}
