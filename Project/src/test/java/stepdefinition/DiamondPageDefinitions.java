package stepdefinition;

import com.aventstack.extentreports.ExtentTest;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.Given;
import pages.DiamondPageActions;
import pages.VivahamPageActions;

public class DiamondPageDefinitions {
    ExtentTest test = Hooks.reports.createTest("Diamond earrings test");
    DiamondPageActions diamondPageActions = new DiamondPageActions(Hooks.driver, test);
    VivahamPageActions pageActions = new VivahamPageActions(Hooks.driver, test);

    @Given("user2 is on the Reliance Jewels page")
    public void user2_is_on_the_reliance_jewels_page() {
        pageActions.verify("Reliance Jewels logo");
    }

    @When("user2 hover over {string}")
    public void user2_hover_over(String string) {
        diamondPageActions.hover(string);
    }

    @When("user2 click over {string}")
    public void user2_click_over(String string) {
        diamondPageActions.click(string);
    }

    @When("user2 verify {string} text")
    public void user2_verify_text(String string) {
        diamondPageActions.verify(string);
    }

    @When("user2 validate {string} isExpanded")
    public void user2_validate_is_expanded(String string) {
        diamondPageActions.isExpanded(string);
    }

    @Then("user2 validate {string} text isDisplayed")
    public void user2_validate_text_is_displayed(String string) {
        diamondPageActions.isDisplayed(string);
    }

    @Then("user2 validates {string} filter is applied")
    public void user2_validates_filter_is_applied(String string) {
        diamondPageActions.isFilterApplied(string);
    }
}
