package uistore;

import org.openqa.selenium.By;

public class PlatinumPageLocators {
public static By verifyLogo=By.xpath("//img[@src='//image.reliancejewels.com/Jewels/cms_hydrant/widgets/HS18Logo/HorizontalBannerImage_1593441799728.png']");
public static By hoverRings=By.xpath("//a[text()='Rings']");
public static By casualwear=By.xpath("//a[@href='https://www.reliancejewels.com/rings/category:136/filter_Occasion:%28%22Casual+Wear%22%29/']");
public static By categories = By.xpath("//a[@class='box-opener open']//div[text()='categories']");
public static By platinum=By.cssSelector("a[title='Buy Platinum All Jewellery online shop']");
public static By moreFilters=By.cssSelector(".filtersbutton");
public static By TryAvailable=By.cssSelector("#filter_3");
public static By yes=By.xpath("//a[@href='/platinum/category:140/filter_Occasion:%28%22Casual+Wear%22%29/filter_Try_On_Available:%28%22Yes%22%29/']");
public static By firstproduct=By.xpath("//p[@class='product_title']//a[@href='/pt950-karat-gold-ring/all-jewellery/rings/product:514669/cid:140/?pos=1']");
public static By buynow=By.xpath("(//a[@title='Buy PT950 Karat Gold Ring'])[2]");
public static By productcode=By.cssSelector(".product-code");
}
