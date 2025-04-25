package stepdefinition;
import com.aventstack.extentreports.ExtentTest;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.PlatinumPageActions;
public class PlatinumPageStepDefinitions {
    ExtentTest test=Hooks.reports.createTest("Testcase 5");
    PlatinumPageActions actions;
    @Given("user3 is on the homepage")
    public void user3_is_on_the_homepage() {
        actions=new PlatinumPageActions(test);
    }
    @When("user3 validated the reliance {string}")
public void user3_validated_the_reliance(String string) {
    actions.verifyMethod(string);
}
    @When("user3 hovers on {string}")
    public void user3_hovers_on(String string) {
       actions.hoverOverElement(string);
    }
    @When("user3 clicks  {string}")
    public void user3_clicks(String string) {
     actions.clickOnParameter(string);
    }
    @When("user3 verifies the {string}")
public void user3_verifies_the(String string) {
    actions.verifyMethod(string);
}
    @When("user3 clicks upon {string}")
    public void user3_clicks_upon(String string) {
        actions.clickOnParameter(string);
    }
    @When("user3 selects {string} category")
    public void user3_selects_category(String string) {
        actions.clickOnParameter(string);
    }
    @When("user3 clicks on {string} filter")
    public void user3_clicks_on_filter(String string) {
        actions.clickOnParameter(string);
    }
    @When("user3 selects {string} available")
    public void user3_selects_available(String string) {
        actions.clickOnParameter(string);
    }
    @When("user3 clicks {string} yes")
    public void user3_clicks_yes(String string) {
        actions.clickOnParameter(string);
    }
    @When("user3 clicked the {string} product")
    public void user3_clicked_the_product(String string) {
        actions.clickOnParameter(string);
    }
    @When("user3 verifies the product text {string}")
public void user3_verifies_the_product_text(String string) {
    actions.verifyMethod(string);
}
    @When("user3 clicked the buy option {string}")
    public void user3_clicked_the_buy_option(String string) {
        actions.clickOnParameter(string);
    }
    @Then("user3 takes screenshot")
    public void user3_takes_screenshot() {
       actions.takeScreenshot();
    }

   
}
