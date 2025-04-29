package uistore;
import org.openqa.selenium.By;
public class ChainsPageLocators {
    public static By chains = By.xpath("(//a[text()='Chain'])");
    public static By silver = By.xpath("(//a[text()='Silver'])[4]");
    public static By categories=By.xpath("(//div[text()='categories'])[1]");
    public static By gender = By.xpath("(//div[text()='Gender'])");
    public static By women = By.xpath("(//a[text()=' Women '])");
    public static By morefilters = By.cssSelector(".filtersbutton");
    public static By tryOnAvailable = By.cssSelector("#filter_2");
    public static By yes = By.xpath("(//a[@title='Silver - Yes'])[1]");
    public static By firstProduct = By.xpath("(//a[text()='925 Purity Silver Chain'])[1]");
    public static By buyNow = By.xpath("(//a[@title='Buy 925 Purity Silver Chain'])[2]");
    public static By productCode = By.xpath("(//span[@id='productCodeInPDP'])");
    public static By logo = By.xpath("//img[@title='Online Shopping in India']");
    public static By logoCheck = By.xpath("//img[@src='//image.reliancejewels.com/Jewels/cms_hydrant/widgets/HS18Logo/HorizontalBannerImage_1593441799728.png']");
    public static By womenText=By.xpath("(//span[text()='Women'])");
    public static By yesText=By.xpath("(//span[text()='Yes'])");
 
}
 