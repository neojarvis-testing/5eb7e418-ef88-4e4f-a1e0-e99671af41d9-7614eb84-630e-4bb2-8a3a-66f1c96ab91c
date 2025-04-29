package pages;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import utils.*;

public class RingsPageActions {
    WebDriverHelper helper;
    Assertion asserts;
    ExtentTest test;

    public RingsPageActions(ExtentTest test) {
        helper = new WebDriverHelper(Base.driver);
        asserts = new Assertion(Base.driver);
        this.test = test;
    }
    /* 
     * Method name: verifyHomePage
     * AUthor name: Kandula Arun Kumar
     * Descirption: it is used to verify homepage title
     * Parameter: N/A
     * Return type: void
    */
    public void verifyHomePage() {
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