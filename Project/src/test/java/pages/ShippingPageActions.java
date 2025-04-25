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
        assertion.verifyTitle("Reliance Jewels - Buy Gold & Diamond Jewellery Online For Women & Men");
    }

    public void clickElement(String elementName) {

        switch (elementName.toLowerCase()) {
           
           
           
            case "media":
                try {
                    helper.waitForTheElementToBeVisible(ShippingPageLocators.media, 10);
                    helper.hoverOverElement(ShippingPageLocators.media);
                    helper.clickOnElement(ShippingPageLocators.media);
                    Base.driver.navigate().back();
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
            // case "faqs":
            //     try {
            //         helper.waitForTheElementToBeVisible(ShippingPageLocators.faqs, 10);
            //         helper.hoverOverElement(ShippingPageLocators.faqs);
            //         helper.clickOnElement(ShippingPageLocators.faqs); 
            //         Base.driver.navigate().back();
            //           LoggerHandler.info("Click on faqs");
            //         test.info("Click on faqs");
            //         test.log(Status.PASS, "Click on faqs");
            //         break;
            //     } catch (Exception e) {
            //         LoggerHandler.error("Click on faqs");
            //         test.info("Click on faqs");
            //         test.log(Status.FAIL, "Click on faqs");
            //         break;
            //     }
            case "blogs":
                try {
                    Thread.sleep(2000);
                    helper.hoverOverElement(ShippingPageLocators.blog);
                    helper.clickOnElement(ShippingPageLocators.blog);
                    Base.driver.navigate().back();
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
            //     case "why reliance":
            //     try {
            //         Thread.sleep(2000);
            //         helper.hoverOverElement(ShippingPageLocators.whyReliance);
            //         helper.clickOnElement(ShippingPageLocators.whyReliance); 
            //         Base.driver.navigate().back();                   
            //         LoggerHandler.info("click on why reliance");
            //         test.info("click on why reliance");
            //         test.log(Status.PASS, "click on why reliance");
            //         break;
            //     } catch (Exception e) {
            //         LoggerHandler.error("click on why reliance");
            //         test.info("click on why reliance");
            //         test.log(Status.FAIL, "click on why reliance");
            //         break;
            //     }

            //     case "about us":
            //     try {
            //         helper.hoverOverElement(ShippingPageLocators.aboutUs);
            //         Thread.sleep(2000);
            //         helper.clickOnElement(ShippingPageLocators.aboutUs);
            //         Base.driver.navigate().back();
            //         LoggerHandler.info("clicked on about us");
            //         test.info("clicked on about us");
            //         test.log(Status.PASS, "clicked on about us");
            //         break;
            //     } catch (Exception e) {
            //         LoggerHandler.error("Failed clicked on about us");
            //         test.info("Failed clicked on about us");
            //         test.log(Status.FAIL, "Failed clicked on about us");
            //         break;
            //     }
            // case "track your order":
            //     try {
            //         Thread.sleep(2000);
            //         helper.hoverOverElement(ShippingPageLocators.trackAnOrder);
            //         helper.clickOnElement(ShippingPageLocators.trackAnOrder);
            //         Base.driver.navigate().back();
            //         LoggerHandler.info("Click on trackAnOrder");
            //         test.info("Click on trackAnOrder");
            //         test.log(Status.PASS, "Click on trackAnOrder");
            //         break;
            //     } catch (Exception e) {
            //         LoggerHandler.error("Click on trackAnOrder");
            //         test.info("Click on trackAnOrder");
            //         test.log(Status.FAIL, "Click on trackAnOrder");
            //         break;
            //     }
                //  case "certifications":
                // try {
                //     Thread.sleep(2000);
                //     helper.hoverOverElement(ShippingPageLocators.certifications);
                //     helper.clickOnElement(ShippingPageLocators.certifications);
                //     Base.driver.navigate().back();
                //     Thread.sleep(4000);
                //     LoggerHandler.info("click on certifications");
                //     test.info("click on certifications");
                //     test.log(Status.PASS, "click on certifications");
                //     break;
                // } catch (Exception e) {
                //     LoggerHandler.error("click on certifications");
                //     test.info("click on certifications");
                //     test.log(Status.FAIL, "click on certifications");
                //     break;
                // }
            // case "our showrooms":
            //     try {
            //         helper.hoverOverElement(ShippingPageLocators.ourShowRooms);
            //         helper.clickOnElement(ShippingPageLocators.ourShowRooms);   
            //         Base.driver.navigate().back();
            //        LoggerHandler.info("Click on our showrooms");
            //         test.info("Click on our showrooms");
            //         test.log(Status.PASS, "Click on our showrooms");
            //         break;
            //     } catch (Exception e) {
            //         LoggerHandler.error("Click on our showrooms");
            //         test.info("Click on our showrooms");
            //         test.log(Status.FAIL, "Click on our showrooms");
            //         break;
            //     }

            default:
                LoggerHandler.info("invalid element name");
                test.info("invalid element name");
                test.log(Status.FAIL, "invalid element name");
        }
    }

    public void verifyTitle(String elementName) {
        switch (elementName.toLowerCase()) {
            case "why reliance":
                try {
                    assertion.verifyTitle("Best Online Shopping Offers In India - Reliance Jewels");
                    LoggerHandler.info("Verified title for Why Reliance");
                    test.info("Verified title for Why Reliance");
                    test.log(Status.PASS, "Verified title for Why Reliance");
                } catch (Exception e) {
                    LoggerHandler.error("Failed to verify title for Why Reliance");
                    test.fail("Failed to verify title for Why Reliance");
                    test.log(Status.FAIL, "Failed to verify title for Why Reliance");
                }
                break;

            // case "certifications":
            //     try {
            //         assertion.verifyTitle("Best Online Shopping Offers In India - Reliance Jewels");
            //         LoggerHandler.info("Verified title for Certifications");
            //         test.info("Verified title for Certifications");
            //         test.log(Status.PASS, "Verified title for Certifications");
            //     } catch (Exception e) {
            //         LoggerHandler.error("Failed to verify title for Certifications");
            //         test.fail("Failed to verify title for Certifications");
            //         test.log(Status.FAIL, "Failed to verify title for Certifications");
            //     }
            //     break;

            case "media":
                try {
                    assertion.verifyTitle("Reliancejewels Media");
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

            default:
                LoggerHandler.warn("Invalid element for title verification: " + elementName);
                break;
        }
    }

    public void verifyUrl(String elementName) {
        switch (elementName.toLowerCase()) {
            case "why reliance":
                try {
                    assertion.verifyUrl("https://www.reliancejewels.com/s/why-reliancejewels");
                    LoggerHandler.info("Verified URL for Why Reliance");
                    test.info("Verified URL for Why Reliance");
                    test.log(Status.PASS, "Verified URL for Why Reliance");
                } catch (Exception e) {
                    LoggerHandler.error("Failed to verify URL for Why Reliance");
                    test.fail("Failed to verify URL for Why Reliance");
                    test.log(Status.FAIL, "Failed to verify URL for Why Reliance");
                }
                break;

            // case "certifications":
            //     try {
            //         assertion.verifyUrl("https://www.reliancejewels.com/s/certification");
            //         LoggerHandler.info("Verified URL for Certifications");
            //         test.info("Verified URL for Certifications");
            //         test.log(Status.PASS, "Verified URL for Certifications");
            //     } catch (Exception e) {
            //         LoggerHandler.error("Failed to verify URL for Certifications");
            //         test.fail("Failed to verify URL for Certifications");
            //         test.log(Status.FAIL, "Failed to verify URL for Certifications");
            //     }
            //     break;

            case "media":
                try {
                    assertion.verifyUrl("https://m.reliancejewels.com/static/MediasecM2023.mobi");
                    LoggerHandler.info("Verified URL for Media");
                    test.info("Verified URL for Media");
                    test.log(Status.PASS, "Verified URL for Media");
                } catch (Exception e) {
                    LoggerHandler.error("Failed to verify URL for Media");
                    test.fail("Failed to verify URL for Media");
                    test.log(Status.FAIL, "Failed to verify URL for media");
                }
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
                    assertion.verifyUrl("https://www.reliancejewels.com/s/faq");
                    LoggerHandler.info("Verified URL for FAQs");
                    test.info("Verified URL for FAQs");
                    test.log(Status.PASS, "Verified URL for FAQs");
                } catch (Exception e) {
                    LoggerHandler.error("Failed to verify URL for FAQs");
                    test.fail("Failed to verify URL for FAQs");
                    test.log(Status.FAIL, "Failed to verify URL for FAQs");
                }
                break;

            case "blog":
                try {
                    assertion.verifyUrl("https://reliancejewels.com/blog/");
                    LoggerHandler.info("Verified URL for Blog");
                    test.info("Verified URL for Blog");
                    test.log(Status.PASS, "Verified URL for Blog");
                } catch (Exception e) {
                    LoggerHandler.error("Failed to verify URL for Blog");
                    test.fail("Failed to verify URL for Blog");
                    test.log(Status.FAIL, "Failed to verify URL for Blog");
                }
                break;

            default:
                LoggerHandler.warn("Invalid element for URL verification: " + elementName);
                break;
        }

    }
    public void verifyText(){
        assertion.verifyText(ShippingPageLocators.fastShipping, "Fast Shipping");
            Screenshot.takeScreenshotWithTimestamp("reliancejewels");
            Reporter.addScreenshotToReport("reliancejewels", test, "Reliance jewels screenshot", Base.driver);
            LoggerHandler.info("Verified the fastshipping text");
    }
}
