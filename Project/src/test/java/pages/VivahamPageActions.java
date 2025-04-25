package pages;

import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import uistore.VivahamPageLocators;
import utils.Assertion;
import utils.Base;
import utils.LoggerHandler;
import utils.Reporter;
import utils.Screenshot;
import utils.WebDriverHelper;
import java.time.Duration;

public class VivahamPageActions {
WebDriverHelper helper;
VivahamPageLocators homePageLocatorsVivaham;
ExtentTest test;
Assertion assertion;
WebDriver driver;
public VivahamPageActions(WebDriver driver,ExtentTest test){
helper = new WebDriverHelper(driver);
this.test = test;
homePageLocatorsVivaham = new VivahamPageLocators();
assertion = new Assertion(driver);
this.driver = driver;
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
        case "What's trending":
        try {
            helper.hoverOverElement(homePageLocatorsVivaham.whatsTrendingtext);
            LoggerHandler.info("Hovered on What's trending");
            test.info("Hovered on What's trending");
            test.log(Status.PASS, "Hovered on What's trending");
            break;
        } catch (Exception e) {
            LoggerHandler.error("Failed to hover on What's trending");
            test.fail("Failed to hover on What's trending");
            test.log(Status.FAIL, "Failed to hover on What's trending");
            Reporter.addScreenshotToReport("ClcikDiamondFailure", test, "ClcikDiamondFailure", Base.driver);
            break;
        }
        
    }
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
        case "Vivaham":
        try {
            helper.clickOnElement(homePageLocatorsVivaham.vivaham);
            LoggerHandler.info("Clicked on Vivaham text");
            test.info("Clicked on Vivaham text");
            test.log(Status.PASS, "Clicked on Vivaham text");
            break;
        } catch (Exception e) {
            e.printStackTrace();
            LoggerHandler.error("Failed to click on vivaham");
            test.fail("Failed to click on vivaham");
            test.log(Status.FAIL, "Failed to click on vivaham");
            Reporter.addScreenshotToReport("ClcikVivahamFailure", test, "ClcikVivahamFailure", Base.driver);
            break;
        }
        case "Search":
        try {
            LoggerHandler.info("Clicked on search");
            helper.clickOnElement(homePageLocatorsVivaham.searchButton);
            test.info("Clicked on search");
            test.log(Status.PASS, "Clicked on search");
            break;
        } catch (Exception e) {
            LoggerHandler.error("Failed to click on search");
            test.fail("Failed to click on search");
            test.log(Status.FAIL, "Failed to click on search");
            Reporter.addScreenshotToReport("ClickSearchFailure", test, "ClickSearchFailure", Base.driver);
            break;
        }
        case "Delhi":
        try {
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
            helper.waitForTheElementToBeVisible(homePageLocatorsVivaham.delhiText, 10);
            helper.clickAndswitchForward(homePageLocatorsVivaham.delhiText);
            Thread.sleep(3000);
            LoggerHandler.info("Clicked on delhi");
            test.info("Clicked on delhi");
            test.log(Status.PASS, "Clicked on delhi");
            break;
        } catch (Exception e) {
            LoggerHandler.error("Failed to click on delhi");
            test.fail("Failed to click on delhi");
            test.log(Status.FAIL, "Failed to click on delhi");
            Reporter.addScreenshotToReport("ClickDelhiFailure", test, "ClickDelhiFailure", Base.driver);
            break;
        }
        case "Locate A Store":
        try {
            helper.clickAndswitchForward(homePageLocatorsVivaham.locateAStore);
            LoggerHandler.info("Clicked on locate a store and switched window");
            test.info("Clicked on locate a store and switched window");
            test.log(Status.PASS, "Clicked on locate a store and switched window");
            break;
        } catch (Exception e) {
            LoggerHandler.error("Failed to click on a store and failed to switch window");
            test.fail("Failed to click on a store and failed to switch window");
            test.log(Status.FAIL, "Failed to click on a store and failed to switch window");
            Reporter.addScreenshotToReport("ClickLocateAStoreFailure", test, "ClickLocateAStoreFailure", Base.driver);
            break;
        }
    }
}
/*
     * Method Name: scrollTo
     * Author Name: Tapaswini
     * Description: This method scrolls to an element
     * Return Type: void
     * Parameter List: String element
     */
public void scrollTo(String element){
    switch(element){
        case "Delhi":
        try {
            helper.scrollByElement(homePageLocatorsVivaham.delhiText);
            Thread.sleep(3000);
            LoggerHandler.info("Scrolled to Delhi text");
            test.info("Scrolled to Delhi text");
            test.log(Status.PASS, "Scrolled to Delhi text");
            break;
        } catch (Exception e) {
            LoggerHandler.error("Failed to scroll to Delhi text");
            test.fail("Failed to scroll to Delhi text");
            test.log(Status.FAIL, "Failed to scroll to Delhi text");
            Reporter.addScreenshotToReport("ClcikDiamondFailure", test, "ClcikDiamondFailure", Base.driver);
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
        case "Reliance Jewels logo":
        try {
            assertion.verifyLogo(homePageLocatorsVivaham.relianceJewelsLogo);
            LoggerHandler.info("Reliance Jewels logo verified");
            test.info("Reliance Jewels logo verified");
            test.log(Status.PASS, "Reliance Jewels logo verified");
            break;
        } catch (Exception e) {
            LoggerHandler.error("Reliance Jewels logo verification failed");
            test.fail("Reliance Jewels logo verification failed");
            test.log(Status.FAIL, "Reliance Jewels logo verification failed");
            Reporter.addScreenshotToReport("VerifyRelianceJewelsLogoFailure", test, "VerifyRelianceJewelsLogoFailure", Base.driver);
            break;
        }
        case "Vivaham url":
        try {
            assertion.verifyUrl("VIVAHAM");
            LoggerHandler.info("Vivaham url verified");
            test.info("Vivaham url verified");
            test.log(Status.PASS, "Vivaham url verified");
            break;
        } catch (Exception e) {
            LoggerHandler.error("Vivaham url verification failed");
            test.fail("Vivaham url verification failed");
            test.log(Status.FAIL, "Vivaham url verification failed");
            Reporter.addScreenshotToReport("VerifyVivahamUrl", test, "VerifyVivahamUrl", Base.driver);
            break;
        }
        case "Store List Page":
        try {
            assertion.verifyTitle("Reliance jewels store locator");
            LoggerHandler.info("Reliance jewels store locator title verified");
            test.info("Reliance jewels store locator title verified");
            test.log(Status.PASS, "Reliance jewels store locator title verified");
            break;
        } catch (Exception e) {
            LoggerHandler.error("Reliance jewels store locator title verification failed");
            test.fail("Reliance jewels store locator title verification failed");
            test.log(Status.FAIL, "Reliance jewels store locator title verification failed");
            Reporter.addScreenshotToReport("VerifyStoreListPageFailure", test, "VerifyStoreListPageFailure", Base.driver);
            break;
        }
        case "Store Locator url":
        try {
            assertion.verifyUrl("storelocator");
            LoggerHandler.info("Verified store locator url");
            test.info("Verified store locator url");
            test.log(Status.PASS, "Verified store locator url");
            break;
        } catch (Exception e) {
            LoggerHandler.error(("Failed to verify store locator url"));
            test.fail("Failed to verify store locator url");
            test.log(Status.FAIL, "Failed to verify store locator url");
            Reporter.addScreenshotToReport("VerifyStoreLocatorFailure", test, "VerifyStoreLocatorFailure", Base.driver);
            break;
        }
        case "Delhi page title":
        try {
            assertion.verifyTitle("delhi");
            LoggerHandler.info("Verified delhi page title");
            test.info("Verified delhi page title");
            test.log(Status.PASS, "Verified delhi page title");
            break;
        } catch (Exception e) {
            LoggerHandler.error("Failed to verify delhi page title");
            test.fail("Failed to verify delhi page title");
            test.log(Status.FAIL, "Failed to verify delhi page title");
            Reporter.addScreenshotToReport("VerifyDelhiPageTitleFailure", test, "VerifyDelhiPageTitleFailure", Base.driver);
            break;
        }
        case "Sort By text":
        try {
            assertion.verifyText(homePageLocatorsVivaham.sortBy, "Sort by");
            LoggerHandler.info("Sort By text verified");
            Screenshot.takeScreenshotWithTimestamp("SortBy");
            test.info("Sort By text verified");
            test.log(Status.PASS, "Sort By text verified");
            break;
        } catch (Exception e) {
            LoggerHandler.error("Failed to veriify Sort by text");
            test.fail("Failed to veriify Sort by text");
            test.log(Status.FAIL, "Failed to veriify Sort by text");
            Reporter.addScreenshotToReport("VerifySortByTextFailure", test, "VerifySortByTextFailure", Base.driver);
            break;
        }
    }
}
/*
     * Method Name: selectDropdown
     * Author Name: Tapaswini
     * Description: This method selects a dropdown value
     * Return Type: void
     * Parameter List: String element
     */
public void selectDropdown(String element){
    switch(element){
        case "Andhra Pradesh":
        try {
            helper.selectDropDown(homePageLocatorsVivaham.stateDropdown, element);
            LoggerHandler.info("Selected Andhra pradhesh");
            test.info("Selected Andhra pradhesh");
            test.log(Status.PASS, "Selected Andhra pradhesh");
            break;
        } catch (Exception e) {
            LoggerHandler.error("Failed to select Andhra pradesh");
            test.fail("Failed to select Andhra pradesh");
            test.log(Status.FAIL, "Failed to select Andhra pradesh");
            Reporter.addScreenshotToReport("SelectAPDropdownFailure", test, "SelectAPDropdownFailure", Base.driver);
            break;
        }
        case "Guntur":
        try {
            helper.selectDropDown(homePageLocatorsVivaham.cityDropdown, element); 
            LoggerHandler.info("Selected Guntur");
            test.info("Selected Guntur");
            test.log(Status.PASS, "Selected Guntur");
        } catch (Exception e) {
            LoggerHandler.error("Failed to select Guntur");
            test.fail("Failed to select Guntur");
            test.log(Status.FAIL, "Failed to select Guntur");
            Reporter.addScreenshotToReport("SelectGunturFailure", test, "SelectGunturFailure", Base.driver);
        }
    }
}
/*
     * Method Name: switchWindow
     * Author Name: Tapaswini
     * Description: This method switches to a window
     * Return Type: void
     * Parameter List: String element
     */
public void switchWindow(String element){
    switch(element){
        case "main":
        try {
            driver.close();
            helper.switchBackward(0);
            LoggerHandler.info("Switched to main window");
            test.info("Switched to main window");
            test.log(Status.PASS, "Switched to main window");
            break;
        } catch (Exception e) {
            LoggerHandler.error("Failed to switch to main window");
            test.fail("Failed to switch to main window");
            test.log(Status.FAIL, "Failed to switch to main window");
            Reporter.addScreenshotToReport("SwitchMainWindowFailure", test, "SwitchMainWindowFailure", Base.driver);
            break;
        }
    }
}
}
