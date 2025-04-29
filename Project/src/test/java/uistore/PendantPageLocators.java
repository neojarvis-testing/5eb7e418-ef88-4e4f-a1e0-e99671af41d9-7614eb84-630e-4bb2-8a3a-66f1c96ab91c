package uistore;
 
import org.openqa.selenium.By;
 
public class PendantPageLocators {
    public static By pendants = By.xpath("//a[text()='PENDANTS']");
    public static By gifting = By.xpath("(//a[text()='Gifting'])[3]");
    public static By gender = By.xpath("//div[text()='Gender']");
    public static By kids = By.xpath("//a[text()=' Kids ']");
    public static By verify=By.xpath("//span[text()='Kids']");
    public static By moreFilters = By.cssSelector("#myBtn");
    public static By type = By.cssSelector("#filter_4");
    public static By checkBoxPendant = By.xpath("(//div[@class='ez-checkbox'])[5]");
    public static By firstProduct = By.xpath("//a[text()='18 Karat Gold Pendant']");
    public static By productHeading=By.xpath("//h1[text()='Pendants & Pendant Sets']");
    public static By price = By.xpath("//div[@class='best-price']");
    public static By addToCart = By.xpath("(//a[@title='Buy 18 Karat Gold Pendant'])[1]");
    public static By productCode=By.xpath("//p[@class='product-code f-left bold']");
    public static By pendantText = By.xpath("//div[@class='content grid-view clearfix']//h1");
}
 