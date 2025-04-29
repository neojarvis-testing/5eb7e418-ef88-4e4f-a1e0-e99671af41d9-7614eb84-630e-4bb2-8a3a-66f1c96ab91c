
package stepdefinition;

import com.aventstack.extentreports.ExtentTest;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.ChainsPageActions;

public class ChainsPageStepDefinition {
    ExtentTest test = Hooks.reports.createTest("Chains Module TC_07");
    ChainsPageActions actions = new ChainsPageActions(test);
    @When("the user4 hovers over the {string} section")
    public void the_user4_hovers_over_the_section(String string) {
        actions.hoverOverElement(string);
    }
    @Then("verifiess the {string} text")
    public void verifiess_the_text(String string) {
        actions.verifyElement(string);
    }
    @When("the {string} is verified")
    public void the_is_verified(String string) {
        actions.verifyElement(string);
    }

    @When("the user4 verifies the {string} link is displayed")
    public void the_user4_verifies_the_link_is_displayed(String string) {
        actions.verifyElement(string);
    }

    @When("user4 clicks on the {string} link")
    public void user4_clicks_on_the_link(String string) {
        actions.clickOnElement(string);
    }

    @When("verify the {string} text")
    public void verify_the_text(String string) {
        actions.verifyElement(string);
    }

    @When("user4 clicks on the {string} checkbox")
    public void user4_clicks_on_the_checkbox(String string) {
        actions.clickOnElement(string);
    }

    @When("user4 verifies the {string} text")
    public void user4_verifies_the_text(String string) {
        actions.verifyElement(string);
    }

    @When("verifies the product code {string} text")
    public void verifies_the_product_code_text(String string) {
        actions.verifyElement(string);
    }

    @Then("user4 clicks on the {string} button")
    public void user4_clicks_on_the_button(String string) {
        actions.clickOnElement(string);
    }

    
}
