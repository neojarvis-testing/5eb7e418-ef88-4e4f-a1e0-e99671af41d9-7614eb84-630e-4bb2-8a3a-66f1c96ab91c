package pages;
 
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
 
import uistore.ShippingPageLocators;
import utils.Assertion;
import utils.Base;
import utils.LoggerHandler;
import utils.Reporter;
import utils.Screenshot;
import utils.WebDriverHelper;
 
public class ShippingPageActions {
    WebDriverHelper helper;
    ExtentTest test;
    Assertion assertion;
 
    public ShippingPageActions(ExtentTest test) {
        helper = new WebDriverHelper(Base.driver);
        assertion = new Assertion(Base.driver);
        this.test = test;
 
    }
 
    public void verifyRelianceHomePage() {
        try {
            assertion.verifyTitle("Reliance Jewels - Buy Gold & Diamond Jewellery Online For Women & Men");
            Thread.sleep(4000);
        } catch (InterruptedException e) {
 
            e.printStackTrace();
        }
 
    }
 
    /*
     * Method Name: clickElement
     * Author Name: Deekshitha
     * Description: Performs a click action on various elements using a switch case.
     * Handles actions like clicking on Media, Track Order, and Certifications, with
     * error handling.
     * Return Type: void
     * Parameter List:
     * String elementName - The name of the element to be clicked.
     */
    public void clickElement(String elementName) {
 
        switch (elementName.toLowerCase()) {
 
            case "media":
                try {
                    Base.driver.navigate().refresh();
                    helper.waitForTheElementToBeVisible(ShippingPageLocators.media, 10);
                    helper.hoverOverElement(ShippingPageLocators.media);
                    helper.clickOnElement(ShippingPageLocators.media);
                    LoggerHandler.info("Click on media");
                    test.info("Click on media");
                    test.log(Status.PASS, "Click on media");
                    break;
                } catch (Exception e) {
                    LoggerHandler.error("Click on media");
                    test.info("Click on media");
                    test.log(Status.FAIL, "Click on media");
                    break;
                }
            case "faqs":
                try {
                    helper.waitForTheElementToBeVisible(ShippingPageLocators.faqs, 10);
                    helper.hoverOverElement(ShippingPageLocators.faqs);
                    helper.clickOnElement(ShippingPageLocators.faqs);
                    Base.driver.navigate().back();
                    LoggerHandler.info("Click on faqs");
                    test.info("Click on faqs");
                    test.log(Status.PASS, "Click on faqs");
                    break;
                } catch (Exception e) {
                    LoggerHandler.error("Click on faqs");
                    test.info("Click on faqs");
                    test.log(Status.FAIL, "Click on faqs");
                    break;
                }
            case "blogs":
                try {
                    Thread.sleep(2000);
                    helper.hoverOverElement(ShippingPageLocators.blog);
                    helper.clickOnElement(ShippingPageLocators.blog);
                    LoggerHandler.info("Click on blogs");
                    test.info("Click on blogs");
                    test.log(Status.PASS, "Click on blogs");
                    break;
                } catch (Exception e) {
                    LoggerHandler.error("Click on blogs");
                    test.info("Click on blogs");
                    test.log(Status.FAIL, "Click on blogs");
                    break;
                }
            case "why reliance":
                try {
                    Thread.sleep(2000);
                    helper.hoverOverElement(ShippingPageLocators.whyReliance);
                    helper.clickOnElement(ShippingPageLocators.whyReliance);
                    LoggerHandler.info("click on why reliance");
                    test.info("click on why reliance");
                    test.log(Status.PASS, "click on why reliance");
                    break;
                } catch (Exception e) {
                    LoggerHandler.error("click on why reliance");
                    test.info("click on why reliance");
                    test.log(Status.FAIL, "click on why reliance");
                    break;
                }
 
            case "track your order":
                try {
                    Thread.sleep(2000);
                    helper.hoverOverElement(ShippingPageLocators.trackAnOrder);
                    helper.clickOnElement(ShippingPageLocators.trackAnOrder);
                    LoggerHandler.info("Click on trackAnOrder");
                    test.info("Click on trackAnOrder");
                    test.log(Status.PASS, "Click on trackAnOrder");
                    break;
                } catch (Exception e) {
                    LoggerHandler.error("Click on trackAnOrder");
                    test.info("Click on trackAnOrder");
                    test.log(Status.FAIL, "Click on trackAnOrder");
                    break;
                }
            case "certifications":
                try {
                    Thread.sleep(2000);
                    helper.hoverOverElement(ShippingPageLocators.certifications);
                    helper.clickOnElement(ShippingPageLocators.certifications);
                    Thread.sleep(4000);
                    LoggerHandler.info("click on certifications");
                    test.info("click on certifications");
                    test.log(Status.PASS, "click on certifications");
                    break;
                } catch (Exception e) {
                    LoggerHandler.error("click on certifications");
                    test.info("click on certifications");
                    test.log(Status.FAIL, "click on certifications");
                    break;
                }
 
        }
    }
 
    /*
     * Method Name: verifyTitle
     * Author Name: Deekshitha
     * Description: Validates the page title against expected values based on the
     * element name.
     * Logs results and handles failures gracefully.
     * Return Type: void
     * Parameter List:
     * String elementName - The name of the page whose title needs to be verified.
     */
    public void verifyTitle(String elementName) {
        switch (elementName.toLowerCase()) {
            case "why reliance":
                try {
                    Thread.sleep(3000);
                    assertion.verifyTitle("Best Online Shopping Offers In India - Reliance Jewels");
                    // assertion.verifyTitle("Reliance Jewels - Buy Gold & Diamond Jewellery Online
                    // For Women & Men");
                    LoggerHandler.info("Verified title for Why Reliance");
                    test.info("Verified title for Why Reliance");
                    test.log(Status.PASS, "Verified title for Why Reliance");
                } catch (Exception e) {
                    LoggerHandler.error("Failed to verify title for Why Reliance");
                    test.fail("Failed to verify title for Why Reliance");
                    test.log(Status.FAIL, "Failed to verify title for Why Reliance");
                }
                break;
 
            case "certifications":
                try {
                    assertion.verifyTitle("Best Online Shopping Offers In India - Reliance Jewels");
                    LoggerHandler.info("Verified title for Certifications");
                    test.info("Verified title for Certifications");
                    test.log(Status.PASS, "Verified title for Certifications");
                } catch (Exception e) {
                    LoggerHandler.error("Failed to verify title for Certifications");
                    test.fail("Failed to verify title for Certifications");
                    test.log(Status.FAIL, "Failed to verify title for Certifications");
                }
                break;
            case "media":
                try {
                    Thread.sleep(3000);
                    assertion.verifyTitle("Reliancejewels Media");
                    Base.driver.navigate().back();
                    LoggerHandler.info("Verified title for Media");
                    test.info("Verified title for Media");
                    test.log(Status.PASS, "Verified title for Media");
                } catch (Exception e) {
                    LoggerHandler.error("Failed to verify title for Media");
                    test.fail("Failed to verify title for Media");
                    test.log(Status.FAIL, "Failed to verify title for Media");
                }
                break;
 
            case "track an order":
                try {
                    Thread.sleep(3000);
                    assertion.verifyTitle("Reliance Jewels : Track an order");
                    LoggerHandler.info("Verified title for Track an Order");
                    test.info("Verified title for Track an Order");
                    test.log(Status.PASS, "Verified title for Track an Order");
                } catch (Exception e) {
                    LoggerHandler.error("Failed to verify title for Track an Order");
                    test.fail("Failed to verify title for Track an Order");
                    test.log(Status.FAIL, "Failed to verify title for Track an Order");
                }
                break;
 
        }
 
    }
 
    /*
     * Method Name: verifyUrl
     * Author Name: Deekshitha
     * Description: Checks if the page URL matches expected values based on the
     * element name.
     * Handles navigation scenarios such as verifying the URL for blogs.
     * Return Type: void
     * Parameter List:
     * String elementName - The name of the page whose URL needs to be verified.
     */
    public void verifyUrl(String elementName) {
        switch (elementName.toLowerCase()) {
            case "why reliance":
                try {
                    assertion.verifyUrl("reliancejewels");
                    LoggerHandler.info("Verified URL for Why Reliance");
                    test.info("Verified URL for Why Reliance");
                    test.log(Status.PASS, "Verified URL for Why Reliance");
                } catch (Exception e) {
                    LoggerHandler.error("Failed to verify URL for Why Reliance");
                    test.fail("Failed to verify URL for Why Reliance");
                    test.log(Status.FAIL, "Failed to verify URL for Why Reliance");
                }
                break;
            case "blogs":
                try {
                    assertion.verifyUrl("https://reliancejewels.com/blog/");
                    Base.driver.navigate().back();
                    LoggerHandler.info("Verified URL for Blog");
                    test.info("Verified URL for Blog");
                    test.log(Status.PASS, "Verified URL for Blog");
                } catch (Exception e) {
                    LoggerHandler.error("Failed to verify URL for Blog");
                    test.fail("Failed to verify URL for Blog");
                    test.log(Status.FAIL, "Failed to verify URL for Blog");
                }
                break;
 
            case "certifications":
                try {
                    assertion.verifyUrl("https://www.reliancejewels.com/s/certification");
                    LoggerHandler.info("Verified URL for Certifications");
                    test.info("Verified URL for Certifications");
                    test.log(Status.PASS, "Verified URL for Certifications");
                } catch (Exception e) {
                    LoggerHandler.error("Failed to verify URL for Certifications");
                    test.fail("Failed to verify URL for Certifications");
                    test.log(Status.FAIL, "Failed to verify URL for Certifications");
                }
                break;
 
            case "track an order":
                try {
                    assertion.verifyUrl("https://www.reliancejewels.com/track-your-order.html");
                    LoggerHandler.info("Verified URL for Track an Order");
                    test.info("Verified URL for Track an Order");
                    test.log(Status.PASS, "Verified URL for Track an Order");
                } catch (Exception e) {
                    LoggerHandler.error("Failed to verify URL for Track an Order");
                    test.fail("Failed to verify URL for Track an Order");
                    test.log(Status.FAIL, "Failed to verify URL for Track an Order");
                }
                break;
 
            case "faqs":
                try {
                    assertion.verifyUrl("reliance");
                    LoggerHandler.info("Verified URL for FAQs");
                    test.info("Verified URL for FAQs");
                    test.log(Status.PASS, "Verified URL for FAQs");
                } catch (Exception e) {
                    LoggerHandler.error("Failed to verify URL for FAQs");
                    test.fail("Failed to verify URL for FAQs");
                    test.log(Status.FAIL, "Failed to verify URL for FAQs");
                }
                break;
 
        }
 
    }
 
    /*
     * Method Name: verifyText
     * Author Name: Deekshitha
     * Description: Validates that the text "Fast Shipping" is present on the page.
     * Captures a screenshot and logs verification results.
     * Return Type: void
     * Parameter List:
     * String string - The expected text value to be verified.
     */
    public void verifyText(String string) {
        assertion.verifyText(ShippingPageLocators.fastShipping, "Fast Shipping");
        Screenshot.takeScreenshotWithTimestamp("reliancejewels");
        Reporter.addScreenshotToReport("reliancejewels", test, "Reliance jewels screenshot", Base.driver);
        LoggerHandler.info("Verified the fastshipping text");
    }
}