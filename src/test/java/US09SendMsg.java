import Pages.Config.BaseTest;
import Pages.Pages.*;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class US09SendMsg extends BaseTest {


    @Test
    public void sendMsgAsALoggedUser() {

        HomeBasePage homePage = new HomeBasePage(driver);
        LoginBasePage loginPage = new LoginBasePage(driver);
        WelcomeBasePage welcomePage = new WelcomeBasePage(driver);
        ContactUsBasePage contactUsPage = new ContactUsBasePage(driver);
        ContactUsAfterSendMsgBasePage contactUs_afterSendMsgPage = new ContactUsAfterSendMsgBasePage(driver);

        String email = "anna@test.pl";
        String password = "111111";
        String setSubject = "2";
        String textMsg = "jakas wiadomosc";
        String orderRefValue = "231608";

        homePage.setSignInButton();
        loginPage.logIn(email, password);
        welcomePage.getContactUs();
        contactUsPage.setSubject(setSubject);
        contactUsPage.setEmailAddress();
        contactUsPage.setOrderRef(orderRefValue);
        contactUsPage.setMsgText(textMsg);
        contactUsPage.setSendBtn();
        contactUs_afterSendMsgPage.getAlertSuccessText();
        contactUs_afterSendMsgPage.isAlertSuccessSectionIsDisplayed();

        Assert.assertTrue(contactUs_afterSendMsgPage.isAlertSuccessSectionIsDisplayed());
        Assert.assertTrue(contactUs_afterSendMsgPage.getAlertSuccessText().contains("Your"));
    }

}