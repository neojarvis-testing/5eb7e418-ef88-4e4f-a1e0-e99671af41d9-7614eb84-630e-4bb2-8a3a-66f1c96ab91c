package pages;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
 
import uistore.ChainsPageLocators;
import utils.Assertion;
import utils.Base;
import utils.LoggerHandler;
import utils.Reporter;
import utils.Screenshot;
import utils.WebDriverHelper;
public class ChainsPageActions
{
    WebDriverHelper helper;
    Assertion assertion;
    ExtentTest test;
 
    public ChainsPageActions(ExtentTest test) {
        helper = new WebDriverHelper(Base.driver);
        assertion = new Assertion(Base.driver);
        this.test = test;
    }
    /*
   * Method Name: clickOnElement
   * Author Name: Deekshitha
   * Description: Performs a click action on elements based on the elementName provided.
   * Handles actions like clicking on Silver and manages exceptions with logging and screenshots.
   * Return Type: void
   * Parameter List:
   *   String elementName - Name of the element to be clicked.
*/
    public void clickOnElement(String elementName) {
        switch (elementName.toLowerCase()) {
            case "silver":
                try {
                    helper.clickOnElement(ChainsPageLocators.silver);
                    LoggerHandler.info("Clicked on Silver");
                    test.info("Clicked on Silver");
                    test.log(Status.PASS, "Clicked on Silver");
                } catch (Exception e) {
                    LoggerHandler.error("Failed to click on Silver");
                    test.fail("Failed to click on Silver");
                    test.log(Status.FAIL, "Failed to click on Silver");
                    Reporter.addScreenshotToReport("silver", test, "silver Screenshot", Base.driver);
                }
                break;
 
            case "gender":
                try {
                    helper.clickOnElement(ChainsPageLocators.gender);
                    LoggerHandler.info("Clicked on Gender");
                    test.info("Clicked on Gender");
                    test.log(Status.PASS, "Clicked on Gender");
                } catch (Exception e) {
                    LoggerHandler.error("Failed to click on Gender");
                    test.fail("Failed to click on Gender");
                    test.log(Status.FAIL, "Failed to click on Gender");
                    Reporter.addScreenshotToReport("Gender", test, "Gender Screenshot", Base.driver);
                }
                break;
 
            case "women":
                try {
                    helper.waitForTheElementToBeVisible(ChainsPageLocators.women, 10);
                    helper.clickOnElement(ChainsPageLocators.women);
                    LoggerHandler.info("Clicked on Women");
                    test.info("Clicked on Women");
                    test.log(Status.PASS, "Clicked on Women");
                } catch (Exception e) {
                    LoggerHandler.error("Failed to click on Women");
                    test.fail("Failed to click on Women");
                    test.log(Status.FAIL, "Failed to click on Women");
                    Reporter.addScreenshotToReport("Women", test, "Women Screenshot", Base.driver);
 
                }
                break;
 
            case "more filters":
                try {
                    helper.clickOnElement(ChainsPageLocators.morefilters);
                    LoggerHandler.info("Clicked on More Filters");
                    test.info("Clicked on More Filters");
                    test.log(Status.PASS, "Clicked on More Filters");
                } catch (Exception e) {
                    LoggerHandler.error("Failed to click on More Filters");
                    test.fail("Failed to click on More Filters");
                    test.log(Status.FAIL, "Failed to click on More Filters");
                    Reporter.addScreenshotToReport("More Filters", test, "More Filters Screenshot", Base.driver);
 
                }
                break;
 
            case "try on available":
                try {
                    helper.clickOnElement(ChainsPageLocators.tryOnAvailable);
                    LoggerHandler.info("Clicked on Try On Available");
                    test.info("Clicked on Try On Available");
                    test.log(Status.PASS, "Clicked on Try On Available");
                } catch (Exception e) {
                    LoggerHandler.error("Failed to click on Try On Available");
                    test.fail("Failed to click on Try On Available");
                    test.log(Status.FAIL, "Failed to click on Try On Available");
                    Reporter.addScreenshotToReport("Available", test, " Available Screenshot", Base.driver);
                }
                break;
 
            case "yes":
                try {
                    helper.clickOnElement(ChainsPageLocators.yes);
                    LoggerHandler.info("Clicked on Yes");
                    test.info("Clicked on Yes");
                    test.log(Status.PASS, "Clicked on Yes");
                } catch (Exception e) {
                    LoggerHandler.error("Failed to click on Yes");
                    test.fail("Failed to click on Yes");
                    test.log(Status.FAIL, "Failed to click on Yes");
                    Reporter.addScreenshotToReport("YES link", test, " Yes link", Base.driver);
 
                }
                break;
 
            case "first product":
                try {
                    helper.clickOnElement(ChainsPageLocators.firstProduct);
                    LoggerHandler.info("Clicked on First Product");
                    test.info("Clicked on First Product");
                    test.log(Status.PASS, "Clicked on First Product");
                } catch (Exception e) {
                    LoggerHandler.error("Failed to click on First Product");
                    test.fail("Failed to click on First Product");
                    test.log(Status.FAIL, "Failed to click on First Product");
                    Reporter.addScreenshotToReport("First Product", test, " First Product Screenshot", Base.driver);
 
                }
                break;
 
            case "buy now":
                try {
                    helper.waitForTheElementToBeVisible(ChainsPageLocators.productCode, 10);
                    helper.clickOnElement(ChainsPageLocators.buyNow);
                    Screenshot.takeScreenshotWithTimestamp("Screenshot1");
                    LoggerHandler.info("Clicked on Buy Now");
                    test.info("Clicked on Buy Now");
                    test.log(Status.PASS, "Clicked on Buy Now");
                } catch (Exception e) {
                    LoggerHandler.error("Failed to click on Buy Now");
                    test.fail("Failed to click on Buy Now");
                    test.log(Status.FAIL, "Failed to click on Buy Now");
                    Reporter.addScreenshotToReport("Buy Now", test, " Buy Now Screenshot", Base.driver);
 
                }
                break;
 
            default:
                LoggerHandler.warn("Invalid element for click action: " + elementName);
                break;
        }
    }
 
/*
   * Method Name: hoverOverElement
   * Author Name: Deekshitha
   * Description: Performs hover actions on elements based on the elementName provided.
   * Handles hover actions like hovering over Chains and manages exceptions with logging and screenshots.
   * Return Type: void
   * Parameter List:
   *   String elementName - Name of the element to hover over.
*/
    public void hoverOverElement(String elementName) {
        switch (elementName.toLowerCase()) {
            case "chains":
                try {
                    helper.hoverOverElement(ChainsPageLocators.chains);
                    LoggerHandler.info("Hovered over Chains");
                    test.info("Hovered over Chains");
                    test.log(Status.PASS, "Hovered over Chains");
                } catch (Exception e) {
                    LoggerHandler.error("Failed to hover over Chains");
                    test.fail("Failed to hover over Chains");
                    test.log(Status.FAIL, "Failed to hover over Chains");
                    Reporter.addScreenshotToReport("Chains", test, " Chains Screenshot", Base.driver);
 
                }
                break;
 
            default:
                LoggerHandler.warn("Invalid element for hover action: " + elementName);
                break;
        }
    }
 
    /*
   * Method Name: verifyElement
   * Author Name: Deekshitha
   * Description: Verifies the text or attributes of elements based on elementName and expected values.
   * Handles verification like checking text for Home Page Logo, Categories, and more.
   * Return Type: void
   * Parameter List:
   *   String elementName - Name of the element to be verified.
*/
    public void verifyElement(String elementName) {
        switch (elementName.toLowerCase()) {
            case "home page logo":
                try {
                    assertion.verifyLogo(ChainsPageLocators.logoCheck);
                    LoggerHandler.info("Verified Home Page Logo");
                    test.info("Verified Home Page Logo");
                    test.log(Status.PASS, "Verified Home Page Logo");
                } catch (Exception e) {
                    LoggerHandler.error("Failed to verify Home Page Logo");
                    test.fail("Failed to verify Home Page Logo");
                    test.log(Status.FAIL, "Failed to verify Home Page Logo");
                    Reporter.addScreenshotToReport("Logo", test, " Logo Screenshot", Base.driver);
 
                }
                break;
 
            case "categories":
                try {
                    assertion.verifyText(ChainsPageLocators.categories, "Categories");
                    LoggerHandler.info("Verified Categories");
                    test.info("Verified Categories");
                    test.log(Status.PASS, "Verified Categories");
                } catch (Exception e) {
                    LoggerHandler.error("Failed to verify Categories");
                    test.fail("Failed to verify Categories");
                    test.log(Status.FAIL, "Failed to verify Categories");
                    Reporter.addScreenshotToReport("Categories", test, "Categories Screenshot", Base.driver);
 
                }
                break;
 
            case "product code":
                try {
                    assertion.verifyText(ChainsPageLocators.productCode, "508198");
                    LoggerHandler.info("Verified Product Code");
                    test.info("Verified Product Code");
                    test.log(Status.PASS, "Verified Product Code");
                } catch (Exception e) {
                    LoggerHandler.error("Failed to verify Product Code");
                    test.fail("Failed to verify Product Code");
                    test.log(Status.FAIL, "Failed to verify Product Code");
                    Reporter.addScreenshotToReport("Product Code", test, "Product Code Screenshot", Base.driver);
 
                }
                break;
 
 
                case "women":
                try {
                    assertion.verifyText(ChainsPageLocators.womenText, "Women");
                    LoggerHandler.info("Verified Women");
                    test.info("Verified Women");
                    test.log(Status.PASS, "Verified Women");
                } catch (Exception e) {
                    LoggerHandler.error("Failed to verify  Women text");
                    test.fail("Failed toverify  Women text");
                    test.log(Status.FAIL, "Failed to verify  Women text");
                    Reporter.addScreenshotToReport("Women filter", test, "Women filter Screenshot", Base.driver);
 
                }
                break;
 
                case "yes":
                try {
                    assertion.verifyText(ChainsPageLocators.yesText, "Yes");
                    LoggerHandler.info("Verified Yes");
                    test.info("Verified Yes");
                    test.log(Status.PASS, "Verified Yes");
                } catch (Exception e) {
                    LoggerHandler.error("Failed to verify  Yes text");
                    test.fail("Failed toverify  Yes text");
                    test.log(Status.FAIL, "Failed to verify  Yes text");
                    Reporter.addScreenshotToReport("Yes filter", test, "Yes filter Screenshot", Base.driver);
 
                }
                break;
 
                case "silver":
                try {
                    assertion.verifyText(ChainsPageLocators.silver, "Silver");
                    LoggerHandler.info("Verified Silver");
                    test.info("Verified Silver");
                    test.log(Status.PASS, "Verified Silver");
                } catch (Exception e) {
                    LoggerHandler.error("Failed to verify  Silver text");
                    test.fail("Failed toverify  Silver text");
                    test.log(Status.FAIL, "Failed to verify  Silver text");
                    Reporter.addScreenshotToReport("Silver filter", test, "Silver filter Screenshot", Base.driver);
 
                }
                break;
 
 
 
            default:
                LoggerHandler.warn("Invalid element for verification: " + elementName);
                break;
        }
    }
 
    
}