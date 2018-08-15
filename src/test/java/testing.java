import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

import static junit.framework.TestCase.assertEquals;

public class testing {
    ChromeDriver driver;
    static ExtentReports reports = new ExtentReports("C:\\Users\\Admin\\Downloads\\SeleniumExamples-master\\SeleniumExamples-master\\peer_programming\\Automated Reports/Mercury_tours_test.html", true);
    static ExtentTest test;
    Actions action;

    @Before
    public void setup() {
        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\Admin\\Downloads\\chromedriver_win32/chromedriver.exe");
        driver = new ChromeDriver();
        action = new Actions(driver);
        driver.manage().window().maximize();
    }

    @After
    public void teardown() {

        driver.quit();
    }

    @AfterClass
    public static void teardownclass(){
        reports.endTest(test);
        reports.flush();}

    @Test
    public void methodtest(){
        driver.get("http://newtours.demoaut.com/mercurywelcome.php");
        home homepage = PageFactory.initElements(driver, home.class);
        homepage.register();

        register newuserreg = PageFactory.initElements(driver, register.class);
        newuserreg.newuser();
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

        login userlogin = PageFactory.initElements(driver, login.class);
        userlogin.loginuserdetails(driver);

        test = reports.startTest("Mercury Tours");
        test.log(LogStatus.INFO, "Browser started");
        test.log(LogStatus.PASS, "User Register and Log-in");
    }

}
