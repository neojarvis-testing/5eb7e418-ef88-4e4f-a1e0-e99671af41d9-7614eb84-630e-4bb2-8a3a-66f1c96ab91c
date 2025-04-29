package stepdefinition;

import com.aventstack.extentreports.ExtentTest;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.CommonPageActions;
import pages.RingsPageActions;
public class CommonStepDefinition {
    ExtentTest test = Hooks.reports.createTest("Common Test Actions");
    CommonPageActions commonObj = new CommonPageActions(test);
    RingsPageActions ringObj = new RingsPageActions(test);

    @When("user1 click on {string} textbox")
    public void user_click_on_textbox(String string) {
        commonObj.commonClickButton(string);
    }

    @When("user1 enter value as {string}")
    public void user1_enter_value_as(String string) {
        commonObj.enterValue(string);
    }

    @When("user1 click on {string} button")
    public void user1_click_on_button(String string) {
       commonObj.commonClickButton(string);
    }

    @When("user1 click on {string} link")
    public void user1_click_on_link(String string) {
        commonObj.commonClickLink(string);
    }

    @Then("user1 click on the {string} button")
    public void user1_click_on_the_button(String string) {
        commonObj.commonClickLink(string);
    }

    @When("user1 verifies the entered {string}")
    public void user1_verifies_the_entered(String string) {
        commonObj.verifyElement(string);
    }

    @When("user1 verifies {string} click action")
    public void user1_verifies_click_action(String string) {
        commonObj.verifyElement(string);
    }

    @Then("user1 verifies {string} text")
    public void user1_verifies_text(String string) {
       commonObj.verifyElement(string);
    }
}
