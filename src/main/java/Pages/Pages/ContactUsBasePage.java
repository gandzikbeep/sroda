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

    public ContactUsBasePage contactUsBasePage(){
        ContactUsBasePage contactUsBasePage = new ContactUsBasePage(driver);
        return contactUsBasePage;
    }

    public ContactUsBasePage setSubject(String setSubject) {
        Select drpSubject = new Select(subjectHeading);
        drpSubject.selectByValue(setSubject);
        return this;
    }

    public ContactUsBasePage setEmailAddress() {
        email.click();
        return this;
    }

    public ContactUsBasePage setOrderRef(String orderRefValue) {
        Select drpOrderRef = new Select(orderRef);
        drpOrderRef.selectByValue(orderRefValue);
        return this;
    }

    public ContactUsBasePage setMsgText(String textMsg) {
        msgText.sendKeys(textMsg);
        return this;
    }

    public void setSendBtn() {
        sendBtn.click();

    }
}

