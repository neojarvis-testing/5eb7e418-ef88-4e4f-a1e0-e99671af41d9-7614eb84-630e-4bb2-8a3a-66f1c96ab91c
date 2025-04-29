package stepdefinition;
 
import com.aventstack.extentreports.ExtentTest;
 
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.PendantPageActions;
 
public class PendantStepDefinitions {
    ExtentTest test = Hooks.reports.createTest("Pendant Module_TC_10");
    PendantPageActions pendantObj = new PendantPageActions(test);
 
    @When("user5 hover on {string} present on the navigation bar")
    public void user5_hover_on_present_on_the_navigation_bar(String string) {
        pendantObj.hoverPendants();
    }
 
    @When("user5 clicks on {string} link")
    public void user5_clicks_on_link(String string) {
        pendantObj.clickElement(string);
    }
 
    @Then("user5 verify that the URL contains {string}")
    public void user5_verify_that_the_url_contains(String string) {
        pendantObj.verify(string);
    }
 
    @When("user5 click on {string} button")
    public void user5_click_on_button(String string) {
        pendantObj.clickElement(string);
    }
 
    @When("user5 clicks on the {string} link")
    public void user5_clicks_on_the_link(String string) {
        pendantObj.clickElement(string);
    }
 
    @Then("user5 verify the {string} of the resultant page")
    public void user5_verify_the_label_of_the_resultant_page(String string) {
        pendantObj.verify(string);
    }
 
    @When("user5 click on the button {string}")
    public void user5_click_on_the_button(String string) {
        pendantObj.clickElement(string);
    }
 
    @When("user5 clicks on {string} button")
    public void user5_clicks_on_button(String string) {
        pendantObj.clickElement(string);
    }
 
    @When("user5 click on {string} checkbox")
    public void user5_click_on_checkbox(String string) {
        pendantObj.clickElement(string);
    }
 
    @Then("user5 verify the {string} title")
    public void user5_verify_the_pendant_result_page_text(String string) {
        pendantObj.verify(string);
    }
 
    @When("user5 click on link {string}")
    public void user5_click_on_link(String string) {
        pendantObj.clickElement(string);
    }
 
    @Then("user5 verify the {string}")
    public void user5_verify_the_product_code(String string) {
        pendantObj.verify(string);
    }
 
    @When("user5 clicks on the {string} button")
    public void user5_clicks_on_the_button(String string) {
        pendantObj.clickElement(string);
    }
 
    @Then("user5 verify the presence of keyword {string}")
    public void user5_verify_the_presence_of_keyword(String string) {
        pendantObj.verify(string);
    }
 
}
 
 