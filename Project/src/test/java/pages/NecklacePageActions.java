package pages;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import uistore.NecklacePageLocators;
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
    /* 
     * Method name: hoverElement
     * AUthor name: Kandula Arun Kumar
     * Descirption: it hovers over an element
     * Parameter: elementName
     * Return type: void
    */
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
                    test.log(Status.FAIL, "hover over product");
                    break;
                }
        }
    }
    /* 
     * Method name: selectDropDown
     * AUthor name: Kandula Arun Kumar
     * Descirption: it is used to select element from drop down
     * Parameter: elementName
     * Return type: void
    */
    public void selectDropDown(String elementName) {
        switch (elementName) {
            case "gross weight":
                try {
                    helper.waitForTheElementToBeVisible(NecklacePageLocators.weight, 10);
                    helper.clickOnElement(NecklacePageLocators.weight);
                    helper.selectDropDown(NecklacePageLocators.weight, "Gross Weight-4.37g");
                    LoggerHandler.info("select gross weight");
                    test.info("select gross weight");
                    test.log(Status.PASS, "select gross weight");
                    break;
                } catch (Exception e) {
                    LoggerHandler.info("select gross weight");
                    test.info("select gross weight");
                    test.log(Status.FAIL, "select gross weight");
                    break;
                }

        }
    }
}
