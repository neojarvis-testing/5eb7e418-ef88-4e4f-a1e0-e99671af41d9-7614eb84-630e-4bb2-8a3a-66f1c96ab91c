package stepdefinition;

import com.aventstack.extentreports.ExtentTest;

import io.cucumber.java.en.When;
import pages.NecklacePageActions;

public class NecklaceStepDefinition {
    ExtentTest test = Hooks.reports.createTest("Necklace Module TC_02");
    NecklacePageActions necklaceObj = new NecklacePageActions(test);

    @When("user1 hover on {string}")
    public void user1_hover_on(String string) {
        necklaceObj.hoverElement(string);
    }

    @When("user1 select {string} from dropdown")
    public void user1_select_from_dropdown(String string) {
        necklaceObj.selectDropDown(string);
    }
}