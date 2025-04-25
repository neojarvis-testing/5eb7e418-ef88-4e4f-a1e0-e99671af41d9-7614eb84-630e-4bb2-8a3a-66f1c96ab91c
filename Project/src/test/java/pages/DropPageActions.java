package pages;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import uistore.DropsPageLocators;
import utils.Assertion;
import utils.Base;
import utils.LoggerHandler;
import utils.Reporter;
import utils.Screenshot;
import utils.WebDriverHelper;

public class DropPageActions {
    WebDriverHelper helper;
    Assertion asserts;
    ExtentTest test;

    public DropPageActions(ExtentTest test) {
        helper = new WebDriverHelper(Base.driver);
        asserts = new Assertion(Base.driver);
        this.test = test;
    }

    /*
     * Method Name: verificationMethod
     * Author Name: vinay
     * Description: This method is used as a commen method to verify various cases
     * Return Type: void
     * Parameter List: String element
     */
    public void verificationMethod(String element) {
        switch (element) {
            case "logo":
                try {
                    helper.waitForTheElementToBeVisible(DropsPageLocators.logoCheck, 10);
                    asserts.verifyLogo(DropsPageLocators.logoCheck);
                    LoggerHandler.info("Validated logo");
                    test.info("Validated logo");
                    test.log(Status.PASS, "Validated logo");
                } catch (Exception e) {
                    LoggerHandler.error("Validated logo");
                    test.fail("Validated logo");
                    test.log(Status.FAIL, "Validated logo");
                }
                break;
            case "Dropstitle":
                try {
                    asserts.verifyUrl("Drops");
                    LoggerHandler.info("Verified Drops");
                    test.info("Verified Drops");
                    test.log(Status.PASS, "Verified Drops");
                } catch (Exception e) {
                    LoggerHandler.error("Verified Drops");
                    test.fail("Verified Drops");
                    test.log(Status.FAIL, "Verified Drops");
                }
                break;
            case "keyfeatures":
                try {
                    asserts.verifyText(DropsPageLocators.keyFeatures, "Key Features");
                    helper.waitForTheElementToBeVisible(DropsPageLocators.buyNow, 10);
                    LoggerHandler.info("Key Features");
                    test.info("Key Features");
                    test.log(Status.PASS, "Key Features");
                } catch (Exception e) {
                    LoggerHandler.error("Key Features");
                    test.fail("Key Features");
                    test.log(Status.FAIL, "Key Features");
                }
        }
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
            case "Drops":
                try {
                    helper.clickOnElement(DropsPageLocators.drops);
                    LoggerHandler.info("clicked on Drops");
                    test.info("clicked on Drops");
                    test.log(Status.PASS, "clicked on Drops");
                } catch (Exception e) {
                    LoggerHandler.error("clicked on Drops");
                    test.fail("clicked on Drops");
                    test.log(Status.FAIL, "clicked on Drops");
                    Reporter.addScreenshotToReport("Drops",test,"Drops",Base.driver);
                }
                break;
            case "Categories":
                try {
                    helper.clickOnElement(DropsPageLocators.categories);
                    helper.waitForTheElementToBeVisible(DropsPageLocators.gold, 10);
                    LoggerHandler.info("clicked on categories");
                    test.info("clicked on categories");
                    test.log(Status.PASS, "clicked on categories");
                } catch (Exception e) {
                    LoggerHandler.error("clicked on categories");
                    test.fail("clicked on categories");
                    test.log(Status.FAIL, "clicked on categories");
                    Reporter.addScreenshotToReport("categories",test,"categories",Base.driver);
                }
                break;
            case "Gold":
                try {
                    helper.clickOnElement(DropsPageLocators.gold);
                    helper.waitForTheElementToBeVisible(DropsPageLocators.morefilters, 10);
                    LoggerHandler.info("clicked on Gold");
                    test.info("clicked on Gold");
                    test.log(Status.PASS, "clicked on Gold");
                } catch (Exception e) {
                    LoggerHandler.error("clicked on Gold");
                    test.fail("clicked on Gold");
                    test.log(Status.FAIL, "clicked on Gold");
                    Reporter.addScreenshotToReport("Gold",test,"Gold",Base.driver);
                }
                break;
            case "More Filters":
                try {
                    helper.clickOnElement(DropsPageLocators.morefilters);
                    helper.waitForTheElementToBeVisible(DropsPageLocators.metalPurity, 10);
                    LoggerHandler.info("clicked on more filters");
                    test.info("clicked on more filters");
                    test.log(Status.PASS, "clicked on more filters");
                } catch (Exception e) {
                    LoggerHandler.error("clicked on more filters");
                    test.fail("clicked on more filters");
                    test.log(Status.FAIL, "clicked on more filters");
                    Reporter.addScreenshotToReport("more filters",test,"more filters",Base.driver);
                }
                break;
            case "Metal Purity":
                try {
                    helper.clickOnElement(DropsPageLocators.metalPurity);
                    helper.waitForTheElementToBeVisible(DropsPageLocators.purity22kt, 10);
                    LoggerHandler.info("clicked on Metalpurity");
                    test.info("clicked on search Metalpurity");
                    test.log(Status.PASS, "clicked on Metalpurity");
                } catch (Exception e) {
                    LoggerHandler.error("clicked on Metalpurity");
                    test.fail("clicked on Metalpurity");
                    test.log(Status.FAIL, "clicked on Metalpurity");
                    Reporter.addScreenshotToReport("Metalpurity",test,"Metalpurity",Base.driver);
                }
                break;
            case "22Kt purity":
                try {
                    helper.clickOnElement(DropsPageLocators.purity22kt);
                    helper.waitForTheElementToBeVisible(DropsPageLocators.firstProduct, 10);
                    LoggerHandler.info("clicked on 22kt");
                    test.info("clicked on search 22kt");
                    test.log(Status.PASS, "clicked on 22kt");
                } catch (Exception e) {
                    LoggerHandler.error("clicked on 22kt");
                    test.fail("clicked on 22kt");
                    test.log(Status.FAIL, "clicked on 22kt");
                    Reporter.addScreenshotToReport("clicked on 22kt",test,"clicked on 22kt",Base.driver);
                }
                break;

            case "first product":
                try {
                    helper.clickOnElement(DropsPageLocators.firstProduct);
                    helper.waitForTheElementToBeVisible(DropsPageLocators.keyFeatures, 10);
                    LoggerHandler.info("clicked on first product");
                    test.info("clicked on first product");
                    test.log(Status.PASS, "clicked on first product");
                } catch (Exception e) {
                    LoggerHandler.error("clicked on first product");
                    test.fail("clicked on first product");
                    test.log(Status.FAIL, "clicked on first product");
                    Reporter.addScreenshotToReport("first product",test,"first product",Base.driver);
                }
                break;
            case "Buy Now":
                try {
                    helper.clickOnElement(DropsPageLocators.buyNow);
                    Screenshot.takeScreenshotWithTimestamp("reliancejewels");
                    LoggerHandler.info("clicked on Buynow");
                    test.info("clicked on Buynow");
                    test.log(Status.PASS, "clicked on Buynow");
                } catch (Exception e) {
                    LoggerHandler.error("clicked on Buynow");
                    test.fail("clicked on Buynow");
                    test.log(Status.FAIL, "clicked on Buynow");
                    Reporter.addScreenshotToReport("clicked on Buynow",test,"clicked on Buynow",Base.driver);
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
            case "Earrings":
                try {
                    helper.hoverOverElement(DropsPageLocators.earRings);
                    helper.waitForTheElementToBeVisible(DropsPageLocators.drops, 10);
                    LoggerHandler.info("Hovered on Earrings");
                    test.info("Hovered on Earrings");
                    test.log(Status.PASS, "Hovered on Earrings");
                } catch (Exception e) {
                    LoggerHandler.error("Hovered on Earrings");
                    test.fail("Hovered on Earrings");
                    test.log(Status.FAIL, "Hovered on Earrings");
                    Reporter.addScreenshotToReport("Drops",test,"Drops",Base.driver);
                }
                break;

            default:
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
            Screenshot.takeScreenshotWithTimestamp("Dropsscreenshot");
            LoggerHandler.info("taken Drops screenshot");
            test.info("taken Drops screenshot");
            test.log(Status.PASS, "taken Drops screenshot");
        } catch (Exception e) {
            LoggerHandler.error("taken Drops screenshot");
            test.fail("taken Drops screenshot");
            test.log(Status.FAIL, "taken Drops screenshot");
            Reporter.addScreenshotToReport("Drops screenshot",test,"Drops screenshot",Base.driver);

        }
    }
}
