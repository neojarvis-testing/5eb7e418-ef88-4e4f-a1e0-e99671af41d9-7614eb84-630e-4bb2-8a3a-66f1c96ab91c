package stepdefinition;
import org.junit.AfterClass;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.AfterAll;
import io.cucumber.java.Scenario;
import utils.Base;
import utils.Emails;
import utils.Reporter;
public class Hooks extends Base{
    static ExtentReports reports;
    static ExtentTest test;
    @BeforeAll
    public static void createReport(){
        reports = Reporter.generateTestReport("Reliance_Report");
    }
    @Before
    public void openReliance(Scenario scenario){
        openBrowser();
    }
    @After
    public void closeReliance(){
        driver.quit();
    }
    @AfterAll
    public static void closeReport(){
        reports.flush();
        Emails.sendEmail();
    }
}
 
 