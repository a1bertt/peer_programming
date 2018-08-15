import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.concurrent.TimeUnit;
import java.util.logging.XMLFormatter;

public class login {
    @FindBy(xpath = "/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[1]/td[2]/input")
    private WebElement signinusername;

    @FindBy(xpath = "/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[2]/td[2]/input")
    private WebElement signinpassword;

    @FindBy(xpath = "/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[4]/td/input")
    private WebElement siginsumbit;

    @FindBy(xpath = "/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[2]/td/table/tbody/tr/td[1]/a")
    private WebElement signoff;

    public void loginuserdetails(WebDriver driver){

        Excel excel = new Excel();
        excel.setRow(1);

        signinusername.sendKeys(excel.pullExcelData(9));
        signinpassword.sendKeys(excel.pullExcelData(10));

        siginsumbit.click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        signoff.click();
    }
}
