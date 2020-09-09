package Pages.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactUsAfterSendMsgPage {
    WebDriver driver;

    public ContactUsAfterSendMsgPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[contains(text(),'Your message has been successfully sent to our team.')]")
    WebElement alertSuccessText;

    @FindBy(xpath = "//*[@id=\"center_column\"]")
    WebElement alertSuccessSection;

    public String getAlertSuccessText() {
        return alertSuccessText.getText();
    }

    public boolean isAlertSuccessSectionIsDisplayed() {
        return alertSuccessSection.isDisplayed();
    }

}