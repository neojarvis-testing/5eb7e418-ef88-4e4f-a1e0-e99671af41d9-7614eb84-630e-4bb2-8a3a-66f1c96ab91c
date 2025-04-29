package stepdefinition;
 
import com.aventstack.extentreports.ExtentTest;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.ShippingPageActions;
 
public class ShippingPageStepDefinition {
    ExtentTest test = Hooks.reports.createTest("Shipping Module_TC_08");
    ShippingPageActions actions;

    @When("the user4 clicks on the {string} link in the footer")
    public void the_user_clicks_on_the_link_in_the_footer(String string) {
        actions = new ShippingPageActions(test);
        actions.clickElement(string);
    }
 
    @When("the user4 verifies the {string} page title")
    public void the_user_verifies_the_page_title(String string) {
        actions.verifyTitle(string);
     
    }
 
    @When("the user4 verifies the {string} page and URL")
    public void the_user_verifies_the_page_and_url(String string) {
        actions.verifyUrl(string);
       
    }
 
    @Then("the user4 verifies the presence of the keyword {string}")
    public void the_user_verifies_the_presence_of_the_keyword(String string) {
        System.out.println("verified");
        actions.verifyText(string);
    }
}