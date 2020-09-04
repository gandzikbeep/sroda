package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class ContactUs_AfterSendMsgPage {
    WebDriver driver;

    public ContactUs_AfterSendMsgPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }


    @FindBy(xpath = "//*[@id=\"center_column\"]")
    WebElement alertSuccess;

    @FindBy(xpath = "//*[@id=\"center_column\"]/ul/li/a" )
    WebElement homeBtn;

    public String getAlertSuccessText() {  // //*[@id="center_column"]/p
        return alertSuccess.getText();
    }
    public boolean isAlertSuccessSection(){
        return alertSuccess.isDisplayed();
    }
    public void getHomeBtn() {
        homeBtn.click();
    }

}

