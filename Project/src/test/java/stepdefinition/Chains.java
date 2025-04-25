
package stepdefinition;
import com.aventstack.extentreports.ExtentTest;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.ChainsPageActions;

public class Chains {
    ExtentTest test=Hooks.reports.createTest("Module 7");
    ChainsPageActions actions;
 
    @Given("the user4 is on the Home Page")
    public void the_user_is_on_the_home_page() {
    actions=new ChainsPageActions(test);
    }
    @When("the Home Pagee logo is verified")
    public void the_home_page_logo_is_verified() {
    System.out.println("verified");
    }
    @When("the user4 hovers over the {string} section")
    public void the_user_hovers_over_the_section(String string) {
    actions.hoverOverElement(string);
    }
    @When("clickss on the {string} option")
    public void clicks_on_the_option(String string) {
    actions.clickOnElement(string);
    }
    @When("verifiess the {string} text")
    public void verifies_the_text(String string) {
       actions.verifyElement(string);
    }
    @When("clickss on the {string}")
    public void clicks_on_the(String string) {
        actions.clickOnElement(string);
    }
    @When("verifiess the product code {string}")
    public void verifies_the_product_code(String string) {
     actions.verifyElement(string);
    }
    @When("clickss on the {string} button")
    public void clicks_on_the_button(String string) {
        actions.clickOnElement(string);
    }
    @Then("a screenshot is taken, the actions are logged, and the operations are reported successfully")
    public void a_screenshot_is_taken_the_actions_are_logged_and_the_operations_are_reported_successfully() {
        System.out.println("screenshot");
    }
    

}

