package stepdefinition;

import com.aventstack.extentreports.ExtentTest;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import pages.VivahamPageActions;

public class VivahamPageDefinition {
    ExtentTest test = Hooks.reports.createTest("Vivaham test");
    VivahamPageActions pageActions = new VivahamPageActions(Hooks.driver, test);

    @Given("user2 is on Reliance Jewels page")
    public void user2_is_on_reliance_jewels_page() {
        pageActions.verify("Reliance Jewels logo");
    }

    @When("user2 hover on {string}")
    public void user2_hover_on(String string) {
        pageActions.hover(string);
    }

    @When("user2 click {string}")
    public void user2_click(String string) {
        pageActions.click(string);
    }

    @When("user2 select {string} from dropdown")
    public void user2_select_from_dropdown(String string) {
        pageActions.selectDropdown(string);
    }

    @When("user2 switch to {string} window")
    public void user2_switch_to_window(String string) {
        pageActions.switchWindow(string);
    }

    @When("user2 scroll to {string}")
    public void user2_scroll_to(String string) {
        pageActions.scrollTo(string);
    }

    @Then("user2 verify {string}")
    public void user2_verify(String string) {
        pageActions.verify(string);
    }

    @When("user2 verify {string} is displayed")
    public void user2_verify_is_displayed(String string) {
        pageActions.isDisplayed(string);
    }

}
