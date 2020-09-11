package Pages.Pages;

import Pages.Config.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class ContactUsBasePage extends BasePage {


    @FindBy(xpath = "//*[@id=\"id_contact\"]")
    WebElement subjectHeading;

    @FindBy(xpath = "//*[@id=\"email\"]")
    WebElement email;

    @FindBy(xpath = "//*[@id=\"center_column\"]/form/fieldset/div[1]/div[1]/div[2]/div/select")
    WebElement orderRef;

    @FindBy(xpath = "//*[@id=\"message\"]")
    WebElement msgText;

    @FindBy(xpath = "//*[@id=\"submitMessage\"]")
    WebElement sendBtn;

    public ContactUsBasePage(WebDriver driver) {
        super(driver);
    }

    public void setSubject(String setSubject) {
        Select drpSubject = new Select(subjectHeading);
        drpSubject.selectByValue(setSubject);
    }

    public void setEmailAddress() {
        email.click();
    }

    public void setOrderRef(String orderRefValue) {
        Select drpOrderRef = new Select(orderRef);
        drpOrderRef.selectByValue(orderRefValue);
    }

    public void setMsgText(String textMsg) {
        msgText.sendKeys(textMsg);
    }

    public void setSendBtn() {
        sendBtn.click();
    }
}

