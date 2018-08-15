import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class home {
    @FindBy(xpath = "/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[2]/td/table/tbody/tr/td[2]/a")
    private WebElement reg;

    public void register(){
        reg.click();
    }


}
