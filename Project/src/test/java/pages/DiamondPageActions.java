package pages;

import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import uistore.DiamondPageLocators;
import utils.Assertion;
import utils.Base;
import utils.LoggerHandler;
import utils.Reporter;
import utils.Screenshot;
import utils.WebDriverHelper;

public class DiamondPageActions {
    WebDriverHelper webDriverHelper;
    DiamondPageLocators diamondEarrings;
    ExtentTest test;
    Assertion assertion;
    public DiamondPageActions(WebDriver driver, ExtentTest test) {
        webDriverHelper = new WebDriverHelper(driver);
        this.test = test;
        diamondEarrings = new DiamondPageLocators();
        assertion = new Assertion(driver);
    }
/*
     * Method Name: click
     * Author Name: Tapaswini
     * Description: This method clicks on an element
     * Return Type: void
     * Parameter List: String element
     */
public void click(String element){
    switch(element){
        case "Diamond":
        try {
            webDriverHelper.clickOnElement(diamondEarrings.diamondText);
            LoggerHandler.info("Clicked on diamond");
            test.info("Clicked on diamond");
            test.log(Status.PASS, "Clicked on diamond");
            break;
        } catch (Exception e) {
            LoggerHandler.error("Failed to click on diamond");
            test.fail("Failed to click on diamond");
            test.log(Status.FAIL, "Failed to click on diamond");
            Reporter.addScreenshotToReport("ClcikDiamondFailure", test, "ClcikDiamondFailure", Base.driver);
            break;
        }
        case "Gender":
        try {
            webDriverHelper.clickOnElement(diamondEarrings.genderText);
            LoggerHandler.info("Clicked on gender");
            test.info("Clicked on gender");
            test.log(Status.PASS, "Clicked on gender");
            break;
        } catch (Exception e) {
            LoggerHandler.error("Failed to click on gender");
            test.fail("Failed to click on gender");
            test.log(Status.FAIL, "Failed to click on gender");
            Reporter.addScreenshotToReport("ClickGenderFailure", test, "ClickGenderFailure", Base.driver);
            break;
        }
        case "Women":
        try {
            webDriverHelper.waitForTheElementToBeVisible(diamondEarrings.womenDiamond, 10);
            webDriverHelper.clickOnElement(diamondEarrings.womenDiamond);
            LoggerHandler.info("Clicked on women");
            test.info("Clicked on women");
            test.log(Status.PASS, "Clicked on women");
            webDriverHelper.waitForTheElementToBeVisible(diamondEarrings.womentResultText,10);
            assertion.verifyText(diamondEarrings.womentResultText,"Women");
            LoggerHandler.info("Verified results for women filter");
            test.log(Status.PASS,"Verified results for women filter");
            break;
        } catch (Exception e) {
            LoggerHandler.error("Failed to click on women");
            test.fail("Failed to click on women");
            test.log(Status.FAIL, "Failed to click on women");
            Reporter.addScreenshotToReport("ClickWomenFailure", test, "ClickWomenFailure", Base.driver);
            break;
        }
        case "New Arrivals":
        try {
            webDriverHelper.clickOnElement(diamondEarrings.newArrivals);
            assertion.verifyText(diamondEarrings.newArrivalsResultText,"New Arrivals");
            LoggerHandler.info("Verified text for New Arrivals");
            test.log(Status.PASS,"Verified text for New Arrivals");
            LoggerHandler.info("Clicked on new arrivals");
            test.info("Clicked on new arrivals");
            test.log(Status.PASS, "Clicked on new arrivals");
            break;
        } catch (Exception e) {
            LoggerHandler.error("Failed to click on new arrivals");
            test.fail("Failed to click on new arrivals");
            test.log(Status.FAIL, "Failed to click on new arrivals");
            Reporter.addScreenshotToReport("ClickNewarrivalsFailure", test, "ClickNewarrivalsFailure", Base.driver);
            break;
        }
        case "First Product":
        try {
            webDriverHelper.clickOnElement(diamondEarrings.firstProduct);
            LoggerHandler.info("Clicked on first product");
            test.info("Clicked on first product");
            test.log(Status.PASS, "Clicked on first product");
            break;
        } catch (Exception e) {
            LoggerHandler.error("Failed to click on first product");
            test.fail("Failed to click on first product");
            test.log(Status.FAIL, "Failed to click on first product");
            Reporter.addScreenshotToReport("ClickFirstProductFailure", test, "ClickFirstProductFailure", Base.driver);
            break;
        }
        case "Add to cart":
        try {
            webDriverHelper.clickOnElement(diamondEarrings.addToCart);
            LoggerHandler.info("Clicked on add to cart");
            test.info("Clicked on add to cart");
            test.log(Status.PASS, "Clicked on add to cart");
            break;
        } catch (Exception e) {
            LoggerHandler.error("Failed to click on add to cart");
            test.fail("Failed to click on add to cart");
            test.log(Status.FAIL, "Failed to click on add to cart");
            Reporter.addScreenshotToReport("ClickAddToCartFailure", test, "ClickAddToCartFailure", Base.driver);
            break;
        }
    }
}
/*
     * Method Name: verify
     * Author Name: Tapaswini
     * Description: This method verifies an element
     * Return Type: void
     * Parameter List: String element
     */
public void verify(String element){
    switch(element){
        case "Diamond":
        try {
            Thread.sleep(3000);
            assertion.verifyText(diamondEarrings.diamondKeyword, "Diamond");
            LoggerHandler.info("Verified diamond text");
            test.info("Verified diamond text");
            test.log(Status.PASS, "Verified diamond text");
            break;
        } catch (Exception e) {
            LoggerHandler.error("Failed to verify diamond text");
            test.fail("Failed to verify diamond text");
            test.log(Status.FAIL, "Failed to verify diamond text");
            Reporter.addScreenshotToReport("VerifyDiamond", test, "VerifyDiamond", Base.driver);
            break;
        }
        case "Earrings":
        try {
            Thread.sleep(3000);
            assertion.verifyText(diamondEarrings.earringsKeyword, "Earrings");
            LoggerHandler.info("Verified keyword earrings");
            test.info("Verified keyword earrings");
            test.log(Status.PASS, "Verified keyword earrings");
            break;
        } catch (Exception e) {
            LoggerHandler.error("Failed to verify earrings keyword");
            test.fail("Failed to verify earrings keyword");
            test.log(Status.FAIL, "Failed to verify earrings keyword");
            Reporter.addScreenshotToReport("VerifyEarrings", test, "VerifyEarrings", Base.driver);
            break;
        }
        case "Other":
        try {
            Thread.sleep(3000);
            assertion.verifyText(diamondEarrings.otherKeyword, "OTHER");
            LoggerHandler.info("Other Keyword verified");
            Screenshot.takeScreenshotWithTimestamp("Earrings");
            test.info("Other Keyword verified");
            test.log(Status.PASS, "Other Keyword verified");
            break;
        } catch (Exception e) {
            LoggerHandler.error("Failed to verify other keyword");
            test.fail("Failed to verify other keyword");
            test.log(Status.FAIL, "Failed to verify other keyword");
            Reporter.addScreenshotToReport("verifyOtherFailure", test, "verifyOtherFailure", Base.driver);
            break;
        }


    }
}
/*
     * Method Name: hover
     * Author Name: Tapaswini
     * Description: This method hovers over an element
     * Return Type: void
     * Parameter List: String element
     */
public void hover(String element){
    switch(element){
        case "earrings":
        try {
            webDriverHelper.hoverOverElement(diamondEarrings.earrringsText);
            LoggerHandler.info("Hovered earrings");
            test.info("Hovered earrings");
            test.log(Status.PASS, "Hovered earrings");
            break;
        } catch (Exception e) {
            LoggerHandler.error("Failed to hover earrings");
            test.fail("Failed to hover earrings");
            test.log(Status.FAIL, "Failed to hover earrings");
            Reporter.addScreenshotToReport("HoverEarringsFailure", test, "HoverEarringsFailure", Base.driver);
            break;
        }
        case "Popularity":
        try {
            webDriverHelper.hoverOverElement(diamondEarrings.popularityButton);
            LoggerHandler.info("Hovered over popularity");
            test.info("Hovered over popularity");
            test.log(Status.PASS, "Hovered over popularity");
            break;
        } catch (Exception e) {
            LoggerHandler.error("Failed to hover over popularity");
            test.fail("Failed to hover over popularity");
            test.log(Status.FAIL, "Failed to hover over popularity");
            Reporter.addScreenshotToReport("HoverPopularityFailure", test, "HoverPopularityFailure", Base.driver);
            break;
        }
    }
}

}
