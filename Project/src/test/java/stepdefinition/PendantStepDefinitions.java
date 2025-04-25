package stepdefinition;

import com.aventstack.extentreports.ExtentTest;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.PendantPageActions;

public class PendantStepDefinitions {
    ExtentTest test = Hooks.reports.createTest("Pendant Test File");
    PendantPageActions pendantObj = new PendantPageActions(test);

    @Given("user5 is on the Reliance Jewels home page")
    public void user5_is_on_the_reliance_jewels_home_page() {
        pendantObj.verifyRelianceHomePage();
    }

    @When("user5 hover on {string} present on the navigation bar")
    public void user5_hover_on_present_on_the_navigation_bar(String string) {
        pendantObj.hoverPendants();
    }

    @When("user5 verify that the URL contains {string}")
    public void user5_verify_that_the_url_contains(String string) {
        pendantObj.verifyUrl();
    }

    @When("user5 click on {string}")
    public void user5_click_on(String string) {
        pendantObj.clickElement(string);
    }

    @Then("user5 verify the presence of keyword {string}")
    public void user5_verify_the_presence_of_keyword(String string) {
        pendantObj.verifyPrice();
    }

}
