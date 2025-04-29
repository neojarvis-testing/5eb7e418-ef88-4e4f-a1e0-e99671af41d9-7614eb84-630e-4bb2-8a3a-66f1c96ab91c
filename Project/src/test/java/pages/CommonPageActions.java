package pages;

import org.openqa.selenium.WebElement;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import uistore.NecklacePageLocators;
import uistore.RingPageLocators;
import utils.Assertion;
import utils.Base;
import utils.LoggerHandler;
import utils.Reporter;
import utils.WebDriverHelper;

public class CommonPageActions {
    ExtentTest test;
    WebDriverHelper helper;
    Assertion asserts;

    public CommonPageActions(ExtentTest test) {
        this.test = test;
        helper = new WebDriverHelper(Base.driver);
        asserts = new Assertion(Base.driver);
    }

    /*
     * Method name: commonClickButton()
     * AUthor name: Kandula Arun Kumar
     * Descirption: it acts as common method for clicking on button
     * Parameter: elementName
     * Return type: void
     */
    public void commonClickButton(String elementName) {
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
            case "cart":
                try {
                    helper.waitForTheElementToBeVisible(RingPageLocators.cart, 10);
                    helper.clickOnElement(RingPageLocators.cart);
                    Reporter.addScreenshotToReport("product", test, "clikc on product", Base.driver);
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
            case "Quick view":
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
            case "close":
                try {
                    helper.waitForTheElementToBeVisible(NecklacePageLocators.close, 10);
                    helper.clickOnElement(NecklacePageLocators.close);
                    helper.clickOnElement(NecklacePageLocators.necklace);
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
            case "buy now":
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
        }
    }

    /*
     * Method name: enterValue()
     * AUthor name: Kandula Arun Kumar
     * Descirption: it acts as common method entering value as input
     * Parameter: elementName
     * Return type: void
     */
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
        }
    }

    /*
     * Method name: commonClickLink()
     * AUthor name: Kandula Arun Kumar
     * Descirption: it acts as common method for verifying element
     * Parameter: elementName
     * Return type: void
     */
    public void commonClickLink(String elementName) {
        switch (elementName) {
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
                    Reporter.addScreenshotToReport("gold", test, "click on gold", Base.driver);
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
        }
    }

    /*
     * Method name: verifyElement
     * AUthor name: Kandula Arun Kumar
     * Descirption: it acts as common method for verifying element
     * Parameter: elementName
     * Return type: void
     */
    public void verifyElement(String elementName) {
        switch (elementName) {
            case "necklace value":
                try {
                    asserts.verifyText(NecklacePageLocators.necklaceText, "Necklace");
                    LoggerHandler.info("verified necklace entered value");
                    test.info("verified necklace entered value");
                    test.log(Status.PASS, "verified necklace entered value");
                    break;
                } catch (Exception e) {
                    LoggerHandler.info("verified necklace entered value");
                    test.info("verified necklace entered value");
                    test.log(Status.FAIL, "verified necklace entered value");
                    break;
                }
            case "Quick View":
                try {
                    asserts.verifyText(NecklacePageLocators.quickText, " Nature's Harmony Silver Necklace");
                    LoggerHandler.info("verified click on quick view");
                    test.info("verified click on quick view");
                    test.log(Status.PASS, "verified click on quick view");
                    break;
                } catch (Exception e) {
                    LoggerHandler.info("verified click on quick view");
                    test.info("verified click on quick view");
                    test.log(Status.FAIL, "verified click on quick view");
                    break;
                }
            case "product":
                try {
                    asserts.verifyText(NecklacePageLocators.productText, "Product Code");
                    LoggerHandler.info("verified clicked on first product");
                    test.info("verified clicked on first product");
                    test.log(Status.PASS, "verified clicked on first product");
                    break;
                } catch (Exception e) {
                    LoggerHandler.info("verified clicked on first product");
                    test.info("verified clicked on first product");
                    test.log(Status.FAIL, "verified clicked on first product");
                    break;
                }
            case "buy now":
                try {
                    asserts.verifyText(NecklacePageLocators.buyText, "my cart");
                    LoggerHandler.info("verified clicked on buy now");
                    test.info("verified clicked on buy now");
                    test.log(Status.PASS, "verified clicked on buy now");
                    break;
                } catch (Exception e) {
                    LoggerHandler.info("verified clicked on buy now");
                    test.info("verified clicked on buy now");
                    test.log(Status.FAIL, "verified clicked on buy now");
                    break;
                }
            case "proceed to pay":
                try {
                    asserts.verifyText(NecklacePageLocators.proceedText, "Login");
                    LoggerHandler.info("verified clicked on proceed to pay");
                    test.info("verified clicked on proceed to pay");
                    test.log(Status.PASS, "verified clicked on proceed to pay");
                    break;

                } catch (Exception e) {
                    LoggerHandler.info("verified clicked on proceed to pay");
                    test.info("verified clicked on proceed to pay");
                    test.log(Status.FAIL, "verified clicked on proceed to pay");
                    break;
                }
            case "ring value":
                try {
                    asserts.verifyText(RingPageLocators.ringText, "Rings");
                    LoggerHandler.info("verified entered value");
                    test.info("verified entered value");
                    test.log(Status.PASS, "verified entered value");
                } catch (Exception e) {
                    LoggerHandler.error("verified entered value");
                    test.info("verified entered value");
                    test.log(Status.FAIL, "verified entered value");
                }
                break;
            case "Men":
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
            case "cart":
                try {
                    asserts.verifyText(RingPageLocators.productText, "22 Karat Gold Striped Gold Ring");
                    LoggerHandler.info("verified cart text");
                    test.info("verified cart text");
                    test.log(Status.PASS, "verified cart text");
                } catch (Exception e) {
                    LoggerHandler.error("verified cart text");
                    test.info("verified cart text");
                    test.log(Status.FAIL, "verified cart text");
                }
                break;
            case "ring product":
                try {
                    asserts.verifyText(RingPageLocators.productText, "22 Karat Gold Striped Gold Ring");
                    LoggerHandler.info("verified product text");
                    test.info("verified product text");
                    test.log(Status.PASS, "verified product text");

                } catch (Exception e) {
                    LoggerHandler.error("verified product text");
                    test.info("verified product text");
                    test.log(Status.FAIL, "verified product text");
                }
                break;
            case "Gold":
                try {
                    asserts.verifyText(RingPageLocators.goldText, "Gold");
                    LoggerHandler.info("verified gold click action");
                    test.info("verified gold click action");
                    test.log(Status.PASS, "verified gold click action");
                } catch (Exception e) {
                    LoggerHandler.error("verified gold click action");
                    test.info("verified gold click action");
                    test.log(Status.FAIL, "verified gold click action");
                }
                break;
        }
    }
}
