package stepdefinition;

import com.aventstack.extentreports.ExtentTest;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.DropPageActions;

public class DropPageStepDefinitions {
    ExtentTest test=Hooks.reports.createTest("Testcase 5");
    DropPageActions actions;
    @Given("the user3 is on the homepage")
    public void the_user3_is_on_the_homepage() {
        actions=new DropPageActions(test);
    }
    @When("the user3 validates the {string} of reliance")
    public void the_user3_validates_the_of_reliance(String string) {
        actions.verificationMethod(string);
    }
    @When("the user3 hovers over {string} on menubar")
    public void the_user3_hovers_over_on_menubar(String string) {
        actions.hoverOverElement(string);
    }
    @When("the user3 clicked on {string} under Earrings")
    public void the_user3_clicked_on_under_earrings(String string) {
        actions.clickOnParameter(string);
    }
    @When("the user3 verifies  {string} in dropsresult")
    public void the_user3_verifies_in_dropsresult(String string) {
        actions.verificationMethod(string);
    }
    @When("the user3 clicks on {string} in result page")
    public void the_user3_clicks_on_in_result_page(String string) {
        actions.clickOnParameter(string);
    }
    @When("the user3 selects {string} under category")
    public void the_user3_selects_under_category(String string) {
        actions.clickOnParameter(string);
    }
    @When("the user3 clicked  filter {string}")
    public void the_user3_clicked_filter(String string) {
        actions.clickOnParameter(string);
    }
    @When("the user3 selected {string} under MoreFilters")
    public void the_user3_selected_under_more_filters(String string) {
        actions.clickOnParameter(string);
    }
    @When("the user3 selects purity {string} under metalPurity")
    public void the_user3_selects_purity_under_metal_purity(String string) {
        actions.clickOnParameter(string);
    }
    @When("user3 clicked on the {string} in results page")
    public void user3_clicked_on_the_in_results_page(String string) {
        actions.clickOnParameter(string);
    }
    @When("the user3 verified the {string} text")
    public void the_user3_verified_the_text(String string) {
        actions.verificationMethod(string);
    }
    @When("the user3 clicked upon {string} in product page")
    public void the_user3_clicked_upon_in_product_page(String string) {
        actions.clickOnParameter(string);
    }
    @Then("the screenshot is taken")
    public void the_screenshot_is_taken() {
       actions.takeScreenshot();
    }
    
}

