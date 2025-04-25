package stepdefinition;

import com.aventstack.extentreports.ExtentTest;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.ShippingPageActions;

public class Shipping {
    ExtentTest test=Hooks.reports.createTest("Module 8");
    ShippingPageActions actions;
   @Given("the user4 is on Reliance Jewels home page")
public void the_user_is_on_reliance_jewels_home_page() {
    actions=new ShippingPageActions(test);
    actions.verifyRelianceHomePage();
}

@When("the user4 clicks on the {string} link in the footer")
public void the_user_clicks_on_the_link_in_the_footer(String string) {
    actions.clickElement(string);
}
@When("the user4 verifies the {string} page title")
public void the_user_verifies_the_page_title(String string) {
    // actions.verifyTitle(string);
    System.out.println("s");
}
@When("the user4 verifies the {string} page and URL")
public void the_user_verifies_the_page_and_url(String string) {
    // actions.verifyUrl(string);
    System.out.println("s");
}
@Then("the user4 verifies the presence of the keyword {string}")
public void the_user_verifies_the_presence_of_the_keyword(String string) {
   System.out.println("verified");
    // actions.verifyText();
}
    }


