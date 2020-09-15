package Pages.Pages;

import Pages.Config.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ContactUsAfterSendMsgBasePage extends BasePage {
    WebDriver driver;

    @FindBy(xpath = "//*[contains(text(),'Your message has been successfully sent to our team.')]")
    WebElement alertSuccessText;

    @FindBy(xpath = "//*[@id=\"center_column\"]")
    WebElement alertSuccessSection;

    public  ContactUsAfterSendMsgBasePage(WebDriver driver) {
        super(driver);
    }
    public ContactUsAfterSendMsgBasePage ContactUsAfterSendMsgBasePage(){
        ContactUsAfterSendMsgBasePage contactUsAfterSendMsgBasePage = new ContactUsAfterSendMsgBasePage(driver);
        return ContactUsAfterSendMsgBasePage();
    }

    public String getAlertSuccessText() {
        return alertSuccessText.getText();
    }

    public boolean isAlertSuccessSectionIsDisplayed() {
        return alertSuccessSection.isDisplayed();
    }

}