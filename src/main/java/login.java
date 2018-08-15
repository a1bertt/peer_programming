import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class login {
    @FindBy(xpath = "/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[1]/td[2]/input")
    private WebElement signinusername;

    @FindBy(xpath = "/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[2]/td[2]/input")
    private WebElement signinpassword;

    public void loginuserdetails(){
        signinusername.sendKeys("j.b.");
        signinpassword.sendKeys("jamesB");
    }
}
