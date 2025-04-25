package uistore;

import org.openqa.selenium.By;

public class DropsPageLocators {
    public static By logoCheck = By.xpath("//img[@src='//image.reliancejewels.com/Jewels/cms_hydrant/widgets/HS18Logo/HorizontalBannerImage_1593441799728.png']");
    public static By earRings = By.xpath("//a[text()='Earrings']");
    public static By drops = By.xpath("//a[text()='Drops']");
    public static By categories = By.xpath("//a[@class='box-opener open']//div[text()='categories']");
    public static By gold = By.cssSelector("a[title='Buy Gold All Jewellery online shop']");
    public static By morefilters = By.cssSelector(".filtersbutton");
    public static By metalPurity = By.cssSelector("div[title='Gold - Metal Purity']");
    public static By purity22kt = By.cssSelector("a[title='Gold - 22 kt']");
    public static By firstProduct = By.xpath("//p[@class='product_title']//a[@href='/22-karat-gold-earrings/all-jewellery/earrings/product:511344/cid:132/?pos=1']");
    public static By buyNow = By.cssSelector(".btnaddbuynow");
    public static By keyFeatures = By.cssSelector("#keyFeaturesProductLayout");

}
