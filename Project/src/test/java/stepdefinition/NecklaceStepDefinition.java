package stepdefinition;

import com.aventstack.extentreports.ExtentTest;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.NecklacePageActions;

public class NecklaceStepDefinition {
    ExtentTest test = Hooks.reports.createTest("NecklaceTestFile");
    NecklacePageActions necklaceObj = new NecklacePageActions(test);
    @When("user1 click on the {string}")
    public void user1_click_on_the(String string) {
        necklaceObj.clickElement(string);
    }

    @When("user1 enter value as {string}")
    public void user1_enter_value_as(String string) {
        necklaceObj.enterValue(string);
    }

    @When("user1 hover on {string}")
    public void user1_hover_on(String string) {
        necklaceObj.hoverElement(string);
    }

    @Then("user1 clicks on the{string}")
    public void user1_clicks_on_the(String string) {
        necklaceObj.clickElement(string);
    }

}
