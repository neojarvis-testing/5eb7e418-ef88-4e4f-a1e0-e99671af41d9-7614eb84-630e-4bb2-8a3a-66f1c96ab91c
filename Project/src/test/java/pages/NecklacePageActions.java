package pages;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import uistore.NecklacePageLocators;
import uistore.RingPageLocators;
import utils.Base;
import utils.LoggerHandler;
import utils.Assertion;
import utils.WebDriverHelper;

public class NecklacePageActions {
    ExtentTest test;
    WebDriverHelper helper;
    Assertion asserts;

    public NecklacePageActions(ExtentTest test) {
        this.test = test;
        helper = new WebDriverHelper(Base.driver);
        asserts = new Assertion(Base.driver);
    }

    public void clickElement(String elementName) {
        switch (elementName) {

            case "search":
                try {
                    helper.waitForTheElementToBeVisible(NecklacePageLocators.search, 10);
                    helper.clickOnElement(NecklacePageLocators.search);
                    LoggerHandler.info("click on search bar");
                    test.info("click on serach bar");
                    test.log(Status.PASS, "click on search bar");
                    break;
                } catch (Exception e) {
                    LoggerHandler.error("click on search bar");
                    test.info("click on serach bar");
                    test.log(Status.FAIL, "click on search bar");
                    break;
                }
            case "Quick View":
                try {
                    helper.waitForTheElementToBeVisible(NecklacePageLocators.quick, 10);
                    helper.clickOnElement(NecklacePageLocators.quick);
                    LoggerHandler.info("click on quick view");
                    test.info("click on quick view");
                    test.log(Status.PASS, "click on quick view");
                    break;
                } catch (Exception e) {
                    LoggerHandler.error("click on quick view");
                    test.info("click on quick view");
                    test.log(Status.FAIL, "click on quick view");
                    break;
                }
            case "Close":
                try {
                    helper.waitForTheElementToBeVisible(NecklacePageLocators.close, 10);
                    helper.clickOnElement(NecklacePageLocators.close);
                    LoggerHandler.info("click on close");
                    test.info("click on close");
                    test.log(Status.PASS, "click on close");
                    break;
                } catch (Exception e) {
                    LoggerHandler.error("click on close");
                    test.info("click on close");
                    test.log(Status.FAIL, "click on close");
                    break;
                }
            case "necklace product":
                try {
                    helper.waitForTheElementToBeVisible(NecklacePageLocators.necklace, 10);
                    helper.clickOnElement(NecklacePageLocators.necklace);
                    LoggerHandler.info("click on necklace");
                    test.info("click on necklace");
                    test.log(Status.PASS, "click on necklace");
                    break;
                } catch (Exception e) {
                    LoggerHandler.error("click on necklace");
                    test.info("click on necklace");
                    test.log(Status.FAIL, "click on necklace");
                    break;
                }
            case "gross weight":
                try {
                    helper.waitForTheElementToBeVisible(NecklacePageLocators.weight, 10);
                    helper.clickOnElement(NecklacePageLocators.weight);
                    helper.selectDropDown(NecklacePageLocators.weight, "Gross Weight-2.34g");
                    LoggerHandler.info("select gross weight");
                    test.info("select gross weight");
                    test.log(Status.PASS, "select gross weight");
                } catch (Exception e) {
                    LoggerHandler.info("select gross weight");
                    test.info("select gross weight");
                    test.log(Status.FAIL, "select gross weight");
                }
            case "Buy now":
                try {
                    helper.waitForTheElementToBeVisible(NecklacePageLocators.buy, 10);
                    helper.clickOnElement(NecklacePageLocators.buy);
                    LoggerHandler.info("click on buy now");
                    test.info("click on buy now");
                    test.log(Status.PASS, "click on buy now");
                    break;
                } catch (Exception e) {
                    LoggerHandler.error("click on buy now");
                    test.info("click on buy now");
                    test.log(Status.FAIL, "click on buy now");
                    break;
                }
            case "proceed to pay":
                try {
                    helper.waitForTheElementToBeVisible(NecklacePageLocators.pay, 10);
                    helper.clickOnElement(NecklacePageLocators.pay);
                    LoggerHandler.info("click on proceed to pay");
                    test.info("click on proceed to pay");
                    test.log(Status.PASS, "click on proceed to pay");
                    break;
                } catch (Exception e) {
                    LoggerHandler.error("click on proceed to pay");
                    test.info("click on proceed to pay");
                    test.log(Status.FAIL, "click on proceed to pay");
                    break;
                }
            default:
                LoggerHandler.error("Invalid Element Name");
                test.info("Invalid Element Name");
                test.log(Status.FAIL, "Invalid Element Name");
                break;

        }
    }

    public void hoverElement(String elementName) {
        switch (elementName) {
            case "product":
                try {
                    helper.waitForTheElementToBeVisible(NecklacePageLocators.necklace, 10);
                    helper.hoverOverElement(NecklacePageLocators.necklace);
                    LoggerHandler.info("hover over product");
                    test.info("hover over product");
                    test.log(Status.PASS, "hover over product");
                    break;
                } catch (Exception e) {
                    LoggerHandler.error("hover over product");
                    test.info("hover over product");
                    test.log(Status.PASS, "hover over product");
                    break;
                }
            default:
                LoggerHandler.error("Invalid Element Name");
                test.info("Invalid Element Name");
                test.log(Status.FAIL, "Invalid Element Name");
                break;
        }
    }

    public void enterValue(String elementName) {
        switch (elementName) {
            case "Necklace":
                try {
                    helper.waitForTheElementToBeVisible(NecklacePageLocators.search, 10);
                    helper.sendKeys(NecklacePageLocators.search, elementName);
                    helper.enterAction(NecklacePageLocators.search);
                    LoggerHandler.info("enter value necklace");
                    test.info("enter value necklace");
                    test.log(Status.PASS, "enter value necklace");
                    break;
                } catch (Exception e) {
                    LoggerHandler.error("enter value necklace");
                    test.info("enter value necklace");
                    test.log(Status.FAIL, "enter value necklace");
                    break;
                }
            default:
                LoggerHandler.error("Invalid Element Name");
                test.info("Invalid Element Name");
                test.log(Status.FAIL, "Invalid Element Name");
                break;
        }
    }
}
