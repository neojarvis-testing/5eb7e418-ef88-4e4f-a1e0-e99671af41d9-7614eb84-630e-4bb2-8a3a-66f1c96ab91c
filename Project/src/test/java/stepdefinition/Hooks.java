package stepdefinition;
import com.aventstack.extentreports.ExtentReports;
import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;
import utils.Base;
import utils.Emails;
import utils.Reporter;
public class Hooks extends Base{
    static ExtentReports reports;
    @BeforeAll
    public static void createReport(){
        System.out.println("Starting Report");
        reports = Reporter.generateTestReport("Reliance_Report");
    }
    @Before
    public void openReliance(){
        openBrowser();
    }
    @After
    public void closeReliance(){
        driver.quit();
    }
    @AfterAll
    public static void closeReport(){
        System.out.println("Flushing report");
        reports.flush();
        Emails.sendEmail();
    }
}