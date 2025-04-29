package pages;
 
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import uistore.PlatinumPageLocators;
import utils.Assertion;
import utils.Base;
import utils.LoggerHandler;
import utils.Screenshot;
import utils.Reporter;
import utils.WebDriverHelper;
 
public class PlatinumPageActions {
    WebDriverHelper helper;
    Assertion asserts;
    ExtentTest test;
 
    public PlatinumPageActions(ExtentTest test) {
        helper = new WebDriverHelper(Base.driver);
        asserts = new Assertion(Base.driver);
        this.test = test;
    }
 
    /*
     * Method Name: clickOnParameter
     * Author Name: vinay
     * Description: This method is used as a commen method to switch various
     * elements
     * Return Type: void
     * Parameter List: String elementname
     */
    public void clickOnParameter(String elementname) {
        switch (elementname) {
            case "Casual Wear":
                try {
                    helper.clickOnElement(PlatinumPageLocators.casualwear);
                    helper.waitForTheElementToBeVisible(PlatinumPageLocators.categories, 10);
                    LoggerHandler.info("click on casual wear");
                    test.info("click on casual wear");
                    test.log(Status.PASS, "click on casual wear");
                } catch (Exception e) {
                    LoggerHandler.error("click on casual wear");
                    test.fail("click on casual wear");
                    test.log(Status.FAIL, "click on casual wear");
                    Reporter.addScreenshotToReport("clickOnParameter",test,"clickOnParameter",Base.driver);
                }
                break;
            case "Categories":
                try {
                    helper.clickOnElement(PlatinumPageLocators.categories);
                    helper.waitForTheElementToBeVisible(PlatinumPageLocators.platinum, 10);
                    LoggerHandler.info("click on categories");
                    test.info("click on categories");
                    test.log(Status.PASS, "click on categories");
                } catch (Exception e) {
                    LoggerHandler.error("click on categories");
                    test.fail("click on categories");
                    test.log(Status.FAIL, "click on categories");
                    Reporter.addScreenshotToReport("categories",test,"categories",Base.driver);
                }
                break;
            case "Platinum":
                try {
                    helper.clickOnElement(PlatinumPageLocators.platinum);
                    helper.waitForTheElementToBeVisible(PlatinumPageLocators.moreFilters, 10);
                    LoggerHandler.info("click on platinum");
                    test.info("click on platinum");
                    test.log(Status.PASS, "click on platinum");
                } catch (Exception e) {
                    LoggerHandler.error("click on platinum");
                    test.fail("click on platinum");
                    test.log(Status.FAIL, "click on platinum");
                    Reporter.addScreenshotToReport("clickOnElement",test,"clickOnElement",Base.driver);
                }
                break;
            case "More Filters":
                try {
                    helper.clickOnElement(PlatinumPageLocators.moreFilters);
                    helper.waitForTheElementToBeVisible(PlatinumPageLocators.TryAvailable, 10);
                    LoggerHandler.info("click on Morefilters");
                    test.info("click on Morefilters");
                    test.log(Status.PASS, "click on Morefilters");
 
                } catch (Exception e) {
                    LoggerHandler.error("click on Morefilters");
                    test.fail("click on Morefilters");
                    test.log(Status.FAIL, "click on Morefilters");
                    Reporter.addScreenshotToReport("moreFilters",test,"moreFilters",Base.driver);
                }
                break;
            case "Available":
                try {
                    helper.clickOnElement(PlatinumPageLocators.TryAvailable);
                    helper.waitForTheElementToBeVisible(PlatinumPageLocators.yes, 10);
                    LoggerHandler.info("click on Available");
                    test.info("click on Available");
                    test.log(Status.PASS, "click on Available");
                } catch (Exception e) {
                    LoggerHandler.error("click on Available");
                    test.fail("click on Available");
                    test.log(Status.FAIL, "click on Available");
                    Reporter.addScreenshotToReport("Available",test,"Available",Base.driver);
                }
                break;
            case "Yes":
                try {
                    helper.clickOnElement(PlatinumPageLocators.yes);
                    helper.waitForTheElementToBeVisible(PlatinumPageLocators.firstproduct, 10);
                    LoggerHandler.info("click Yes");
                    test.info("click Yes");
                    test.log(Status.PASS, "click Yes");
                } catch (Exception e) {
                    LoggerHandler.error("click Yes");
                    test.fail("click Yes");
                    test.log(Status.FAIL, "click Yes");
                    Reporter.addScreenshotToReport("click Yes",test,"click Yes",Base.driver);
                }
                break;
            case "first product":
                try {
                    helper.clickOnElement(PlatinumPageLocators.firstproduct);
                    helper.waitForTheElementToBeVisible(PlatinumPageLocators.buynow, 10);
                    LoggerHandler.info("click on firstproduct");
                    test.info("click on firstproduct");
                    test.log(Status.PASS, "click on firstproduct");
                } catch (Exception e) {
                    LoggerHandler.error("click on firstproduct");
                    test.fail("click on firstproduct");
                    test.log(Status.FAIL, "click on firstproduct");
                    Reporter.addScreenshotToReport("first product",test,"first product",Base.driver);
                }
                break;
            case "Buy Now":
                try {
                    helper.clickOnElement(PlatinumPageLocators.buynow);
                    LoggerHandler.info("clicked on buynow");
                    test.info("clicked on buynow");
                    test.log(Status.PASS, "clicked on buynow");
                } catch (Exception e) {
                    LoggerHandler.error("clicked on buynow");
                    test.fail("clicked on buynow");
                    test.log(Status.FAIL, "clicked on buynow");
                    Reporter.addScreenshotToReport("Buy Now",test,"Buy Now",Base.driver);
                }
                break;
        }
    }
 
    /*
     * Method Name: hoverOverElement
     * Author Name: vinay
     * Description: This method is used as a commen method to switch various
     * elements
     * Return Type: void
     * Parameter List: String elementname
     */
 
    public void hoverOverElement(String elementname) {
        switch (elementname) {
            case "Rings":
                try {
                    helper.hoverOverElement(PlatinumPageLocators.hoverRings);
                    helper.waitForTheElementToBeVisible(PlatinumPageLocators.casualwear, 10);
                    LoggerHandler.info("hover on Rings");
                    test.info("hover on Rings");
                    test.log(Status.PASS, "hover on Rings");
                } catch (Exception e) {
                    LoggerHandler.error("hover on Rings");
                    test.fail("hover on Rings");
                    test.log(Status.FAIL, "hover on Rings");
                    Reporter.addScreenshotToReport("Rings",test,"Rings",Base.driver);
                }
                break;
        }
    }
 
       /*
     * Method Name: clickOnParameter
     * Author Name: vinay
     * Description: This method is used as a commen method to verify various
     * elements
     * Return Type: void
     * Parameter List: String elementname
     */
 
    public void verifyMethod(String elementname){
        switch(elementname){
            case "logo":
            try {
                helper.waitForTheElementToBeVisible(PlatinumPageLocators.verifyLogo, 10);
                asserts.verifyLogo(PlatinumPageLocators.verifyLogo);
                LoggerHandler.info("Validated logo");
                test.info("Validated logo");
                test.log(Status.PASS, "Validated logo");
            } catch (Exception e) {
                LoggerHandler.error("Validated logo");
                test.fail("Validated logo");
                test.log(Status.FAIL, "Validated logo");
                Reporter.addScreenshotToReport("Validated logo",test,"Validated logo",Base.driver);
            }
              break;
            case "casualWearURL":
            try {
                asserts.verifyUrl("Casual");
                LoggerHandler.info("Casuals url verified");
                test.info("Casuals url verified");
                test.log(Status.PASS, "Casuals url verified");
            } catch (Exception e) {
                LoggerHandler.error("Casuals url verified");
                test.fail("Casuals url verified");
                test.log(Status.FAIL, "Casuals url verified");
                Reporter.addScreenshotToReport("url verified",test,"url verified",Base.driver);
            }
            break;
            case "Filters":
            try {
                asserts.verifyText(PlatinumPageLocators.moreFiltersText, "More filters");
                LoggerHandler.info("Verified Filters");
                test.pass("Verified Filters");
                test.log(Status.PASS, "Verified Filters");
            } catch (Exception e) {
                LoggerHandler.error("Verification failed for 'Filters'");
                test.fail("Verification failed for 'Filters'");
                test.log(Status.FAIL, "Verification failed for 'Filters'");
                Reporter.addScreenshotToReport("verifyFilters", test, "verifyFilters", Base.driver);
            }
            break;
   
        case "Availabletext":
            try {
                asserts.verifyText(PlatinumPageLocators.availableText, "Try On Available");
                LoggerHandler.info("Verifed Available Text");
                test.pass("Verifed Available Text");
                test.log(Status.PASS, "Verifed Available Text");
            } catch (Exception e) {
                LoggerHandler.error("Verification failed for 'Availabletext'");
                test.fail("Verification failed for 'Availabletext'");
                test.log(Status.FAIL, "Verification failed for 'Availabletext'");
                Reporter.addScreenshotToReport("verifyAvailabletext", test, "verifyAvailabletext", Base.driver);
            }
            break;
   
        case "Yestext":
            try {
                asserts.verifyText(PlatinumPageLocators.yesText, "Yes");
                LoggerHandler.info("Verified Yes text");
                test.info("Verified Yes text");
                test.log(Status.PASS, "Verified Yes text");
            } catch (Exception e) {
                LoggerHandler.error("Verification failed for 'Yestext'");
                test.fail("Verification failed for 'Yestext'");
                test.log(Status.FAIL, "Verification failed for 'Yestext'");
                Reporter.addScreenshotToReport("verifyYestext", test, "verifyYestext", Base.driver);
            }
            break;
            case "product":
            try {
                asserts.verifyText(PlatinumPageLocators.productcode, "Product Code");
                helper.waitForTheElementToBeVisible(PlatinumPageLocators.buynow, 10);
                LoggerHandler.info("Verified products");
                test.info("Verified products");
                test.log(Status.PASS, "Verified products");
            } catch (Exception e) {
                LoggerHandler.error("Verified products");
                test.fail("Verified products");
                test.log(Status.FAIL, "Verified products");
                Reporter.addScreenshotToReport("verifyProducts",test,"verifyProducts",Base.driver);
            }
            break;
       
        }
    }
 
    /*
     * Method Name: takeScreenshot()
     * Author Name: vinay
     * Description: This method is used to take screenshot
     * Return Type: void
     * Parameter List: NA
     */
    public void takeScreenshot() {
        try {
            Screenshot.takeScreenshotWithTimestamp("Platinumscreenshot");
            LoggerHandler.info("Platinumscreenshot");
            test.info("Platinumscreenshot");
            test.log(Status.PASS, "Platinumscreenshot");
        } catch (Exception e) {
            LoggerHandler.error("Platinumscreenshot");
            test.fail("Platinumscreenshot");
            test.log(Status.FAIL, "Platinumscreenshot");
            Reporter.addScreenshotToReport("Platinumscreenshot",test,"Platinumscreenshot",Base.driver);
 
        }
 
    }
}