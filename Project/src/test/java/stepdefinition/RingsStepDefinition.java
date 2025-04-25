package stepdefinition;

import com.aventstack.extentreports.ExtentTest;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.RingsPageActions;

public class RingsStepDefinition {
    ExtentTest test = Hooks.reports.createTest("RingsTestFile");
    RingsPageActions ringObj = new RingsPageActions(test);

    @Given("user1 is on Reliance Home Page")
    public void user1_is_on_reliance_home_page() {
        ringObj.verifyPage();
    }

    @When("user1 click on {string}")
    public void user1_click_on(String string) {
        ringObj.clickButton(string);
    }

    @When("user1 enters value as {string}")
    public void user1_enters_value_as(String string) {
        ringObj.enterValue(string);
    }
    @When("user1 verifies the entered {string}")
    public void user1_verifies_the_entered_value(String string){
        ringObj.verifyElement(string);
    }
    @When("user1 verifies {string}")
    public void user1_verifies(String string){
        ringObj.verifyElement(string);
    }
    @Then("user1 clicks on {string}")
    public void user1_clicks_on(String string) {
        ringObj.clickButton(string);
    }
}
