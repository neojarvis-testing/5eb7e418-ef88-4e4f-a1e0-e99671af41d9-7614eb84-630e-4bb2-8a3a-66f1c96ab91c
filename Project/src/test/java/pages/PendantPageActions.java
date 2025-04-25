package pages;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import uistore.PendantPageLocators;
import utils.Assertion;
import utils.Base;
import utils.LoggerHandler;
import utils.Reporter;
import utils.WebDriverHelper;

public class PendantPageActions {
    WebDriverHelper helper;
    ExtentTest test;
    Assertion assertion;

    public PendantPageActions(ExtentTest test) {
        helper = new WebDriverHelper(Base.driver);
        assertion = new Assertion(Base.driver);
        this.test = test;

    }
    public void verifyRelianceHomePage() {
        assertion.verifyTitle("Reliance Jewels - Buy Gold & Diamond Jewellery Online For Women & Men");
    }
    public void hoverPendants(){
        try{
            helper.hoverOverElement(PendantPageLocators.pendants);
            LoggerHandler.info("hover on pendants");
            test.info("hover on pendants");
            test.log(Status.PASS, "hover on pendants");
 
        } catch (Exception e) {
            LoggerHandler.error("hover on pendants");
            test.fail("hover on pendants");
            test.log(Status.FAIL, "hover on pendants");
            Reporter.addScreenshotToReport("Pendants", test,"Pendants",Base.driver);
        }
    }
    public void clickElement(String elementName) {

        switch (elementName) {
            case "Gifting":
                try {
                    helper.clickOnElement(PendantPageLocators.gifting);
                    LoggerHandler.info("click on gifting");
                    test.info("click on gifting");
                    test.log(Status.PASS, "click on gifting");
                    break;
                } catch (Exception e) {
                    LoggerHandler.error("click on gifting");
                    test.info("click on gifting");
                    test.log(Status.FAIL, "click on gifting");
                    Reporter.addScreenshotToReport("Pendants", test,"Pendants",Base.driver);
                    break;
                }
            case "Gender":
                try {
                    helper.clickOnElement(PendantPageLocators.gender);
                    LoggerHandler.info("click on gender");
                    test.info("click on gender");
                    test.log(Status.PASS, "click on gender");
                    break;
                } catch (Exception e) {
                    LoggerHandler.error("click on gender");
                    test.info("click on gender");
                    test.log(Status.FAIL, "click on gender");
                    Reporter.addScreenshotToReport("Pendants", test,"Pendants",Base.driver);
                    break;
                }
            case "Kids":
                try {
                    helper.clickOnElement(PendantPageLocators.kids);
                    LoggerHandler.info("click on Kids");
                    test.info("click on Kids");
                    test.log(Status.PASS, "click on Kids");
                    break;
                } catch (Exception e) {
                    LoggerHandler.error("click on Kids");
                    test.info("click on Kids");
                    test.log(Status.FAIL, "click on Kids");
                    Reporter.addScreenshotToReport("Pendants", test,"Pendants",Base.driver);
                    break;
                }
            case "More Filters":
                try {
                    helper.clickOnElement(PendantPageLocators.moreFilters);
                    LoggerHandler.info("click on More Filters");
                    test.info("click on More Filters");
                    test.log(Status.PASS, "click on More Filters");
                    break;
                } catch (Exception e) {
                    LoggerHandler.error("click on More Filters");
                    test.info("click on More Filters");
                    test.log(Status.FAIL, "click on More Filters");
                    Reporter.addScreenshotToReport("Pendants", test,"Pendants",Base.driver);
                    break;
                }
            case "Type":
                try {
                    helper.clickOnElement(PendantPageLocators.type);
                    LoggerHandler.info("click on Type");
                    test.info("click on Type");
                    test.log(Status.PASS, "click on Type");
                    break;
                } catch (Exception e) {
                    LoggerHandler.error("click on Type");
                    test.info("click on Type");
                    test.log(Status.FAIL, "click on Type");
                    Reporter.addScreenshotToReport("Pendants", test,"Pendants",Base.driver);
                    break;
                }
            case "Pendant":
                try {
                    helper.clickOnElement(PendantPageLocators.pendants);
                    LoggerHandler.info("click on Pendant");
                    test.info("click on Pendant");
                    test.log(Status.PASS, "click on Pendant");
                    break;
                } catch (Exception e) {
                    LoggerHandler.error("click on Pendant");
                    test.info("click on Pendant");
                    test.log(Status.FAIL, "click on Pendant");
                    Reporter.addScreenshotToReport("Pendants", test,"Pendants",Base.driver);
                    break;
                }
            case "product":
                try {
                    helper.clickOnElement(PendantPageLocators.firstProduct);
                    LoggerHandler.info("click on the first product");
                    test.info("click on the first product");
                    test.log(Status.PASS, "click on the first product");
                    break;
                } catch (Exception e) {
                    LoggerHandler.error("click on the first product");
                    test.info("click on the first product");
                    test.log(Status.FAIL, "click on the first product");
                    Reporter.addScreenshotToReport("Pendants", test,"Pendants",Base.driver);
                    break;
                }
            case "Add To Cart":
                try {
                    helper.clickOnElement(PendantPageLocators.addToCart);
                    LoggerHandler.info("click on Add To Cart");
                    test.info("click on Add To Cart");
                    test.log(Status.PASS, "click on Add To Cart");
                    break;
                } catch (Exception e) {
                    LoggerHandler.error("click on Add To Cart");
                    test.info("click on Add To Cart");
                    test.log(Status.FAIL, "click on Add To Cart");
                    Reporter.addScreenshotToReport("Pendants", test,"Pendants",Base.driver);
                    break;
                }
                
            default:
                LoggerHandler.info("invalid element name");
                test.info("invalid element name");
                test.log(Status.FAIL, "invalid element name");
        }
    }
    public void verifyUrl(){
        try{
            assertion.verifyUrl("pendant");
            LoggerHandler.info("verified url pendants");
            test.info("verified url pendants");
            test.log(Status.PASS, "verified url pendants");
 
        } catch (Exception e) {
            LoggerHandler.error("verified url pendants");
            test.fail("verified url pendants");
            test.log(Status.FAIL, "verified url pendants");
            Reporter.addScreenshotToReport("Pendants", test,"Pendants",Base.driver);
        }

    }
    public void verifyPrice(){
        try{
            assertion.verifyText(PendantPageLocators.price,"Price");
            LoggerHandler.info("verified price");
            test.info("verified price");
            test.log(Status.PASS, "verified price");
            Reporter.addScreenshotToReport("reliancejewels", test, "reliance jewels screenshot", Base.driver);

 
        } catch (Exception e) {
            LoggerHandler.error("verified price");
            test.fail("verified price");
            test.log(Status.FAIL, "verified price");
        }

    }


}
