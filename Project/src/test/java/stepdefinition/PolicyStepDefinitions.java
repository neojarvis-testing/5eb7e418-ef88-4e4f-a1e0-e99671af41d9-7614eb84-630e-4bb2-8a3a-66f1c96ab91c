package stepdefinition;
 
import com.aventstack.extentreports.ExtentTest;
 
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.PolicyPageActions;
 
public class PolicyStepDefinitions {
    ExtentTest test = Hooks.reports.createTest("Policy Module_TC_09");
    PolicyPageActions policyObj = new PolicyPageActions(test);
 
    @Given("user5 is on Reliance Jewels home page")
    public void user5_is_on_reliance_jewels_home_page() {
        policyObj.verifyRelianceHomePage();
    }
 
    @When("user5 click on the {string} link in the footer")
    public void user5_click_on_the_link_in_the_footer(String string) {
        policyObj.clickElement(string);
    }
 
    @When("user5 verify the redirected {string} page title")
    public void user5_verify_the_redirected_page_title(String string) {
        policyObj.verifyPageTitle(string);
    }
 
    @When("user5 verify the {string} page URL")
    public void user5_verify_the_url(String string) {
        policyObj.verifyPageURL(string);
    }
 
    @Then("user5 verify the presence of the keyword {string}")
    public void user5_verify_the_presence_of_the_keyword(String string) {
        policyObj.callBack();
    }
}
 
 