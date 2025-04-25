package uistore;

import org.openqa.selenium.By;

public class DiamondPageLocators {
    public By relianceJewelsLogo = By.cssSelector("img[title='Online Shopping in India']");
    public By earrringsText = By.xpath("//a[text()='Earrings']");
    public By diamondText = By.xpath("//a[@href='https://www.reliancejewels.com/category:133/']");
    public By diamondKeyword = By.id("breadcrumbNavigationLast");
    public By genderText = By.xpath("//div[text()='Gender']");
    public By womenDiamond = By.xpath("//a[@title='Diamond - Women']");
    public By popularityButton = By.id("shortbyfilter");
    public By newArrivals = By.cssSelector("a[title='Diamond -New Arrivals']");
    public By firstProduct = By.xpath("(//img[@title='Buy 14 Karat Gold & Diamond Earrings'])[1]");
    public By earringsKeyword = By.id("productTitleInPDP");
    public By addToCart = By.cssSelector("div[class='btnaddtocart']");
    public By otherKeyword = By.xpath("(//a[@data-hover='dropdown'])[11]");   
}
