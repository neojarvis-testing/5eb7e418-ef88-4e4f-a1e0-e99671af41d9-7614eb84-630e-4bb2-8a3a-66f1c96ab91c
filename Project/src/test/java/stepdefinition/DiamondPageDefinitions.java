package stepdefinition;

import com.aventstack.extentreports.ExtentTest;

import io.cucumber.java.en.When;
import pages.DiamondPageActions;

public class DiamondPageDefinitions {
    ExtentTest test = Hooks.reports.createTest("Diamon earrings test");
    DiamondPageActions diamondPageActions = new DiamondPageActions(Hooks.driver,test);
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
}
