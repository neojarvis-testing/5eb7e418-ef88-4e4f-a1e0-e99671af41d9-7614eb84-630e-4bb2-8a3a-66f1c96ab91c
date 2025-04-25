package pages;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import uistore.PolicyPageLocators;
import utils.Assertion;
import utils.Base;
import utils.LoggerHandler;
import utils.Reporter;
import utils.Screenshot;
import utils.WebDriverHelper;

public class PolicyPageActions {
    WebDriverHelper helper;
    ExtentTest test;
    Assertion assertion;

    public PolicyPageActions(ExtentTest test) {
        helper = new WebDriverHelper(Base.driver);
        assertion = new Assertion(Base.driver);
        this.test = test;

    }

    public void verifyRelianceHomePage() {
        assertion.verifyTitle("Reliance Jewels - Buy Gold & Diamond Jewellery Online For Women & Men");
    }

    public void clickElement(String elementName) {

        switch (elementName) {
            case "Return and Refund Policy":
                try {
                    helper.clickOnElement(PolicyPageLocators.returnAndrefund);
                    LoggerHandler.info("click on return and refund");
                    test.info("click on return and refund");
                    test.log(Status.PASS, "click on return and refund");
                    break;
                } catch (Exception e) {
                    LoggerHandler.error("click on return and refund");
                    test.info("click on return and refund");
                    test.log(Status.FAIL, "click on return and refund");
                    Reporter.addScreenshotToReport("Policy", test, "Policy", Base.driver);
                    break;
                }
            case "Shipping policy":
                try {
                    helper.clickOnElement(PolicyPageLocators.shippingPolicy);
                    LoggerHandler.info("click on Shipping policy");
                    test.info("click on Shipping policy");
                    test.log(Status.PASS, "click on Shipping policy");
                    break;
                } catch (Exception e) {
                    LoggerHandler.error("click on Shipping policy");
                    test.info("click on Shipping policy");
                    test.log(Status.FAIL, "click on Shipping policy");
                    break;
                }
            case "Privacy policy":
                try {
                    helper.clickOnElement(PolicyPageLocators.privacyPolicy);
                    LoggerHandler.info("click on Privacy policy");
                    test.info("click on Privacy policy");
                    test.log(Status.PASS, "click on Privacy policy");
                    break;
                } catch (Exception e) {
                    LoggerHandler.error("click on Privacy policy");
                    test.info("click on Privacy policy");
                    test.log(Status.FAIL, "click on Privacy policy");
                    break;
                }
            case "Old Gold Exchange Policy":
                try {
                    helper.clickOnElement(PolicyPageLocators.oldGoldExchangePolicy);
                    LoggerHandler.info("Click on Old Gold Exchange Policy");
                    test.info("Click on Old Gold Exchange Policy");
                    test.log(Status.PASS, "Click on Old Gold Exchange Policy");
                    break;
                } catch (Exception e) {
                    LoggerHandler.error("Click on Old Gold Exchange Policy");
                    test.info("Click on Old Gold Exchange Policy");
                    test.log(Status.FAIL, "Click on Old Gold Exchange Policy");
                    Reporter.addScreenshotToReport("Policy", test, "Policy", Base.driver);
                    break;
                }
            case "Fees and Payments policy":
                try {
                    helper.clickOnElement(PolicyPageLocators.feesAndPaymentsPolicy);
                    LoggerHandler.info("Click on Fees and Payments policy");
                    test.info("Click on Fees and Payments policy");
                    test.log(Status.PASS, "Click on Fees and Payments policy");
                    break;
                } catch (Exception e) {
                    LoggerHandler.error("Click on Fees and Payments policy");
                    test.info("Click on Fees and Payments policy");
                    test.log(Status.FAIL, "Click on Fees and Payments policy");
                    Reporter.addScreenshotToReport("Policy", test, "Policy", Base.driver);
                    break;
                }
            case "Terms and Conditions":
                try {
                    helper.clickOnElement(PolicyPageLocators.termsAndConditions);
                    LoggerHandler.info("Click on Terms and Conditions");
                    test.info("Click on Terms and Conditions");
                    test.log(Status.PASS, "Click on Terms and Conditions");
                    break;
                } catch (Exception e) {
                    LoggerHandler.error("Click on Terms and Conditions");
                    test.info("Click on Terms and Conditions");
                    test.log(Status.FAIL, "Click on Terms and Conditions");
                    break;
                }
            case "RelianceOne Loyalty T & C":
                try {
                    helper.clickOnElement(PolicyPageLocators.relianceLoyalty);
                    LoggerHandler.info("Click on RelianceOne Loyalty T & C");
                    test.info("Click on RelianceOne Loyalty T & C");
                    test.log(Status.PASS, "Click on RelianceOne Loyalty T & C");
                    break;
                } catch (Exception e) {
                    LoggerHandler.error("Click on RelianceOne Loyalty T & C");
                    test.info("Click on RelianceOne Loyalty T & C");
                    test.log(Status.FAIL, "Click on RelianceOne Loyalty T & C");
                    Reporter.addScreenshotToReport("Policy", test, "Policy", Base.driver);
                    break;
                }
            case "Disclaimer":
                try {
                    helper.clickOnElement(PolicyPageLocators.disclaimer);
                    LoggerHandler.info("Click on Disclaimer");
                    test.info("Click on Disclaimer");
                    test.log(Status.PASS, "Click on Disclaimer");
                    break;
                } catch (Exception e) {
                    LoggerHandler.error("Click on Disclaimer");
                    test.info("Click on Disclaimer");
                    test.log(Status.FAIL, "Click on Disclaimer");
                    break;
                }

            default:
                LoggerHandler.info("invalid element name");
                test.info("invalid element name");
                test.log(Status.FAIL, "invalid element name");
        }
    }

    public void verifyPageTitle(String elementName) {
        switch (elementName) {
            case "Return and Refund Policy":
                try {
                    assertion.verifyTitle("Best Online Shopping Offers In India - Reliance Jewels");
                    LoggerHandler.info("verified return and refund page title");
                    test.info("verified return and refund page title");
                    test.log(Status.PASS, "verified return and refund page title");
                    break;
                } catch (Exception e) {
                    LoggerHandler.error("verified return and refund page title");
                    test.info("verified return and refund page title");
                    test.log(Status.FAIL, "verified return and refund page title");
                    Reporter.addScreenshotToReport("Policy", test, "Policy", Base.driver);
                    break;
                }
            case "Shipping policy":
                try {
                    assertion.verifyTitle("Best Online Shopping Offers In India - Reliance Jewels");
                    LoggerHandler.info("verified shipping page Title");
                    test.info("verified shipping page Title");
                    test.log(Status.PASS, "verified shipping page Title");
                    break;
                } catch (Exception e) {
                    LoggerHandler.error("verified shipping page Title");
                    test.info("verified shipping page Title");
                    test.log(Status.FAIL, "verified shipping page Title");
                    Reporter.addScreenshotToReport("Policy", test, "Policy", Base.driver);
                    break;
                }
            case "Privacy policy":
                try {
                    assertion.verifyTitle("Best Online Shopping Offers In India - Reliance Jewels");
                    LoggerHandler.info("verified privacy policy Title");
                    test.info("verified privacy policyTitle");
                    test.log(Status.PASS, "verified privacy policy Title");
                    break;
                } catch (Exception e) {
                    LoggerHandler.error("verified privacy policy Title");
                    test.info("verified privacy policy Title");
                    test.log(Status.FAIL, "verified privacy policy Title");
                    Reporter.addScreenshotToReport("Policy", test, "Policy", Base.driver);
                    break;
                }
            case "Old Gold Exchange Policy":
                try {
                    assertion.verifyTitle("Best Online Shopping Offers In India - Reliance Jewels");
                    LoggerHandler.info("verified Old Gold Exchange Policy Title");
                    test.info("verified Old Gold Exchange Policy Title");
                    test.log(Status.PASS, "verified Old Gold Exchange Policy Title");
                    break;
                } catch (Exception e) {
                    LoggerHandler.error("verified Old Gold Exchange Policy Title");
                    test.info("verified Old Gold Exchange Policy Title");
                    test.log(Status.FAIL, "verified Old Gold Exchange Policy Title");
                    Reporter.addScreenshotToReport("Policy", test, "Policy", Base.driver);
                    break;
                }
            case "Fees and Payments policy":
                try {
                    assertion.verifyTitle("Best Online Shopping Offers In India - Reliance Jewels");
                    LoggerHandler.info("verified Fees and Payments policy Title");
                    test.info("verified Fees and Payments policy Title");
                    test.log(Status.PASS, "verified Fees and Payments policy Title");
                    break;
                } catch (Exception e) {
                    LoggerHandler.error("verified Fees and Payments policy Title");
                    test.info("verified Fees and Payments policy Title");
                    test.log(Status.FAIL, "verified Fees and Payments policy Title");
                    Reporter.addScreenshotToReport("Policy", test, "Policy", Base.driver);
                    break;
                }
            case "Terms and Conditions":
                try {
                    assertion.verifyTitle("Best Online Shopping Offers In India - Reliance Jewels");
                    LoggerHandler.info("verified Terms and Conditions Title");
                    test.info("verified Terms and Conditions Title");
                    test.log(Status.PASS, "verified Terms and Conditions Title");
                    break;
                } catch (Exception e) {
                    LoggerHandler.error("verified Terms and Conditions Title");
                    test.info("verified Terms and Conditions Title");
                    test.log(Status.FAIL, "verified Terms and Conditions Title");
                    Screenshot.takeScreenshotWithTimestamp("verified Terms and Conditions Title");
                    break;
                }
            case "RelianceOne Loyalty T & C":
                try {
                    assertion.verifyTitle("Best Online Shopping Offers In India - Reliance Jewels");
                    LoggerHandler.info("verified RelianceOne Loyalty T & C Title");
                    test.info("verified RelianceOne Loyalty T & C Title");
                    test.log(Status.PASS, "verified RelianceOne Loyalty T & C Title");
                    break;
                } catch (Exception e) {
                    LoggerHandler.error("verified RelianceOne Loyalty T & C Title");
                    test.info("verified RelianceOne Loyalty T & C Title");
                    test.log(Status.FAIL, "verified RelianceOne Loyalty T & C Title");
                    break;
                }
            case "Disclaimer":
                try {
                    assertion.verifyTitle("Best Online Shopping Offers In India - Reliance Jewels");
                    LoggerHandler.info("verified Disclaimer Title");
                    test.info("verified Disclaimer Title");
                    test.log(Status.PASS, "verified Disclaimer Title");
                    break;
                } catch (Exception e) {
                    LoggerHandler.error("verified Disclaimer Title");
                    test.info("verified Disclaimer Title");
                    test.log(Status.FAIL, "verified Disclaimer Title");
                    break;
                }
            default:
                LoggerHandler.info("invalid element name");
                test.info("invalid element name");
                test.log(Status.FAIL, "invalid element name");
        }
    }

    public void verifyPageURL(String elementName) {
        switch (elementName) {
            case "Return and Refund Policy":
                try {
                    assertion.verifyUrl("https://www.reliancejewels.com/s/return-policy");
                    Base.driver.navigate().back();
                    LoggerHandler.info("verified return and refund page url");
                    test.info("verified return and refund page url");
                    test.log(Status.PASS, "verified return and refund page url");
                    break;
                } catch (Exception e) {
                    LoggerHandler.error("verified return and refund page url");
                    test.info("verified return and refund page url");
                    test.log(Status.FAIL, "verified return and refund page url");
                    break;
                }
            case "Shipping policy":
                try {
                    assertion.verifyUrl("https://www.reliancejewels.com/s/shipping-policy");
                    Base.driver.navigate().back();
                    LoggerHandler.info("verified shipping page url");
                    test.info("verified shipping page url");
                    test.log(Status.PASS, "verified shipping page url");
                    break;
                } catch (Exception e) {
                    LoggerHandler.error("verified shipping page url");
                    test.info("verified shipping page page url");
                    test.log(Status.FAIL, "verified shipping page page url");
                    break;
                }
            case "Privacy policy":
                try {
                    assertion.verifyUrl("https://www.reliancejewels.com/s/privacy-policy");
                    Base.driver.navigate().back();
                    LoggerHandler.info("verified privacy page url");
                    test.info("verified privacy page url");
                    test.log(Status.PASS, "verified privacy page url");
                    break;
                } catch (Exception e) {
                    LoggerHandler.error("verified privacy page url");
                    test.info("verified privacy page page url");
                    test.log(Status.FAIL, "verified privacy page page url");
                    break;
                }
            case "Old Gold Exchange Policy":
                try {
                    assertion.verifyUrl("https://www.reliancejewels.com/s/OldGoldExchange");
                    Base.driver.navigate().back();
                    LoggerHandler.info("verified Old Gold Exchange Policy page url");
                    test.info("verified Old Gold Exchange Policy page url");
                    test.log(Status.PASS, "verified Old Gold Exchange Policy page url");
                    break;
                } catch (Exception e) {
                    LoggerHandler.error("verified Old Gold Exchange Policy page url");
                    test.info("verified Old Gold Exchange Policy page url");
                    test.log(Status.FAIL, "verified Old Gold Exchange Policy page url");
                    break;
                }
            case "Fees and Payments policy":
                try {
                    assertion.verifyUrl("https://www.reliancejewels.com/s/feesandpayment");
                    Base.driver.navigate().back();
                    LoggerHandler.info("verified Fees and Payments policy page url");
                    test.info("verified Fees and Payments policy page url");
                    test.log(Status.PASS, "verified Fees and Payments policy page url");
                    break;
                } catch (Exception e) {
                    LoggerHandler.error("verified Fees and Payments policy page url");
                    test.info("verified Fees and Payments policy page url");
                    test.log(Status.FAIL, "verified Fees and Payments policy page url");
                    break;
                }
            case "Terms and Conditions":
                try {
                    assertion.verifyUrl("https://www.reliancejewels.com/s/tandc-policy");
                    Base.driver.navigate().back();
                    LoggerHandler.info("verified Terms and Conditions policy page url");
                    test.info("verified Terms and Conditions policy page url");
                    test.log(Status.PASS, "verified Terms and Conditions policy page url");
                    break;
                } catch (Exception e) {
                    LoggerHandler.error("verified Terms and Conditions policy page url");
                    test.info("verified Terms and Conditions policy page url");
                    test.log(Status.FAIL, "verified Terms and Conditions policy page url");
                    break;
                }
            case "RelianceOne Loyalty T & C":
                try {
                    assertion.verifyUrl("https://www.reliancejewels.com/s/rone-tc");
                    Base.driver.navigate().back();
                    LoggerHandler.info("verified RelianceOne Loyalty T & C policy page url");
                    test.info("verified RelianceOne Loyalty T & C policy page url");
                    test.log(Status.PASS, "verified RelianceOne Loyalty T & C policy page url");
                    break;
                } catch (Exception e) {
                    LoggerHandler.error("verified RelianceOne Loyalty T & C policy page url");
                    test.info("verified RelianceOne Loyalty T & C policy page url");
                    test.log(Status.FAIL, "verified RelianceOne Loyalty T & C policy page url");
                    break;
                }
            case "Disclaimer":
                try {
                    assertion.verifyUrl("https://www.reliancejewels.com/s/disclaimer");
                    Base.driver.navigate().back();
                    LoggerHandler.info("verified Disclaimer policy page url");
                    test.info("verified Disclaimer policy page url");
                    test.log(Status.PASS, "verified Disclaimer policy page url");
                    break;
                } catch (Exception e) {
                    LoggerHandler.error("verified Disclaimer policy page url");
                    test.info("verified Disclaimer policy page url");
                    test.log(Status.FAIL, "verified Disclaimer policy page url");
                    break;
                }
            default:
                LoggerHandler.info("invalid element name");
                test.info("invalid element name");
                test.log(Status.FAIL, "invalid element name");
        }
    }

    public void callBack() {
        try {
            assertion.verifyText(PolicyPageLocators.callBack, "Call Back");
            Screenshot.takeScreenshotWithTimestamp("Policy");
            LoggerHandler.info("verified call back");
            test.info("verified call back");
            test.log(Status.PASS, "verified call back");

        } catch (Exception e) {
            LoggerHandler.error("verified call back");
            test.fail("verified call back");
            test.log(Status.FAIL, "verified call back");
        }

    }
}
