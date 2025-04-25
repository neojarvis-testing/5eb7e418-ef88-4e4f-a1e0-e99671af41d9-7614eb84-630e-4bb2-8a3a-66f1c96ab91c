package pages;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import uistore.ChainsPageLocators;
import utils.Assertion;
import utils.Base;
import utils.LoggerHandler;
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
                }
                break;

            default:
                LoggerHandler.warn("Invalid element for click action: " + elementName);
                break;
        }
    }


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
                }
                break;

            default:
                LoggerHandler.warn("Invalid element for hover action: " + elementName);
                break;
        }
    } 
    public void verifyElement(String elementName) {
        switch (elementName.toLowerCase()) {
            case "home page logo":
                try {
                    assertion.verifyLogo(ChainsPageLocators.logo);
                    LoggerHandler.info("Verified Home Page Logo");
                    test.info("Verified Home Page Logo");
                    test.log(Status.PASS, "Verified Home Page Logo");
                } catch (Exception e) {
                    LoggerHandler.error("Failed to verify Home Page Logo");
                    test.fail("Failed to verify Home Page Logo");
                    test.log(Status.FAIL, "Failed to verify Home Page Logo");
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
                }
                break;

            default:
                LoggerHandler.warn("Invalid element for verification: " + elementName);
                break;
        }
    }
}
   
