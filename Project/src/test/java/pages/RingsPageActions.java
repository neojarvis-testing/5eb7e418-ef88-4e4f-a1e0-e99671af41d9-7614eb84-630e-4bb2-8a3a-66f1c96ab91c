package pages;

import org.openqa.selenium.WebElement;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import uistore.RingPageLocators;
import utils.*;
import utils.WebDriverHelper;

public class RingsPageActions {
    WebDriverHelper helper;
    Assertion asserts;
    ExtentTest test;

    public RingsPageActions(ExtentTest test) {
        helper = new WebDriverHelper(Base.driver);
        asserts = new Assertion(Base.driver);
        this.test = test;
    }

    public void clickButton(String elementName) {
        switch (elementName) {
            case "search":
                try {
                    helper.waitForTheElementToBeVisible(RingPageLocators.search, 10);
                    helper.clickOnElement(RingPageLocators.search);
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
            case "Gender":
                try {
                    helper.waitForTheElementToBeVisible(RingPageLocators.gender, 10);
                    helper.clickOnElement(RingPageLocators.gender);
                    LoggerHandler.info("click on gender");
                    test.info("click on gender");
                    test.log(Status.PASS, "click on gender");
                    break;
                } catch (Exception e) {
                    LoggerHandler.error("click on gender");
                    test.info("click on gender");
                    test.log(Status.FAIL, "click on gender");
                    break;
                }
            case "Metal":
                try {
                    helper.waitForTheElementToBeVisible(RingPageLocators.metal, 10);
                    helper.clickOnElement(RingPageLocators.metal);
                    LoggerHandler.info("click on metal");
                    test.info("click on metal");
                    test.log(Status.PASS, "click on metal");
                    break;
                } catch (Exception e) {
                    LoggerHandler.error("click on metal");
                    test.info("click on metal");
                    test.log(Status.FAIL, "click on metal");
                    break;
                }
            case "Men":
                try {
                    helper.waitForTheElementToBeVisible(RingPageLocators.men, 10);
                    helper.clickOnElement(RingPageLocators.men);
                    LoggerHandler.info("click on men");
                    test.info("click on men");
                    test.log(Status.PASS, "click on men");
                    break;
                } catch (Exception e) {
                    LoggerHandler.error("click on men");
                    test.info("click on men");
                    test.log(Status.FAIL, "click on men");
                    break;
                }
            case "Gold":
                try {
                    helper.waitForTheElementToBeVisible(RingPageLocators.gold, 10);
                    helper.clickOnElement(RingPageLocators.gold);
                    LoggerHandler.info("click on gold");
                    test.info("click on gold");
                    test.log(Status.PASS, "click on gold");
                    break;
                } catch (Exception e) {
                    LoggerHandler.error("click on gold");
                    test.info("click on gold");
                    test.log(Status.FAIL, "click on gold");
                    break;
                }
            case "ring product":
                try {
                    helper.waitForTheElementToBeVisible(RingPageLocators.ringProduct, 10);
                    helper.clickOnElement(RingPageLocators.ringProduct);
                    LoggerHandler.info("click on the first product");
                    test.info("click on the first product");
                    test.log(Status.PASS, "click on the first product");
                    break;
                } catch (Exception e) {
                    LoggerHandler.error("click on the first product");
                    test.info("click on the first product");
                    test.log(Status.PASS, "click on the first product");
                    break;
                }
            case "cart":
                try {
                    helper.waitForTheElementToBeVisible(RingPageLocators.cart, 10);
                    helper.clickOnElement(RingPageLocators.cart);
                    LoggerHandler.info("click on add to cart");
                    test.info("click on add to cart");
                    test.log(Status.PASS, "click on add to cart");
                    break;
                } catch (Exception e) {
                    LoggerHandler.error("click on add to cart");
                    test.info("click on add to cart");
                    test.log(Status.FAIL, "click on add to cart");
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
            case "Rings":
                try {
                    helper.waitForTheElementToBeVisible(RingPageLocators.search, 10);
                    helper.sendKeys(RingPageLocators.search, elementName);
                    helper.enterAction(RingPageLocators.search);
                    LoggerHandler.info("enter value rings");
                    test.info("enter value rings");
                    test.log(Status.PASS, "enter value rings");
                    break;
                } catch (Exception e) {
                    LoggerHandler.error("enter value rings");
                    test.info("enter value rings");
                    test.log(Status.FAIL, "enter value rings");
                    break;
                }
            default:
                LoggerHandler.error("Invalid Element Name");
                test.info("Invalid Element Name");
                test.log(Status.FAIL, "Invalid Element Name");
                break;
        }
    }

    public void verifyElement(String elementName) {
        switch (elementName) {
            case "value":
                WebElement element = Base.driver.findElement(RingPageLocators.ringText);
                if (element.getText().contains("Rings")) {
                    LoggerHandler.info("Input text verified");
                    test.info("Input text verified");
                    test.log(Status.PASS, "Input text verified");
                } else {
                    LoggerHandler.error("Input text verified");
                    test.info("Input text verified");
                    test.log(Status.FAIL, "Input text verified");
                }
                break;
            case "Men text":
                WebElement gender = Base.driver.findElement(RingPageLocators.genderText);
                if (gender.getText().contains("Men")) {
                    LoggerHandler.info("Men text verified");
                    test.info("Men text verified");
                    test.log(Status.PASS, "Men text verified");
                } else {
                    LoggerHandler.error("Men text verified");
                    test.info("Men text verified");
                    test.log(Status.FAIL, "Men text verified");
                }
                break;
            default:
                LoggerHandler.info("Invalid Element Name");
                test.info("Invalid Element Name");
                test.log(Status.FAIL, "Invalid Element Name");
                break;
        }
    }

    public void verifyPage() {
        try {
            asserts.verifyTitle("Reliance Jewels - Buy Gold & Diamond Jewellery Online For Women & Men");
            LoggerHandler.info("verify reliance home page");
            test.info("verify reliance home page");
            test.log(Status.PASS, "verify reliance honme page");
        } catch (Exception e) {
            LoggerHandler.error("verify reliance home page");
            test.info("verify reliance home page");
            test.log(Status.FAIL, "verify reliance home page");
        }
    }

}
