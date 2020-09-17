import Pages.Config.BaseTest;
import Pages.Pages.*;
import org.junit.Assert;
import org.junit.Test;

public class US09SendMsg extends BaseTest {


    @Test
    public void sendMsgAsALoggedUser() {

        HomeBasePage homePage = new HomeBasePage(driver);
        LoginBasePage loginPage = new LoginBasePage(driver);
        WelcomeBasePage welcomePage = new WelcomeBasePage(driver);
        ContactUsAfterSendMsgBasePage contactUs_afterSendMsgPage = new ContactUsAfterSendMsgBasePage(driver);

        String email = "anna@test.pl";
        String password = "111111";
        String setSubject = "2";
        String textMsg = "jakas wiadomosc";
        String orderRefValue = "231608";

        homePage.setSignInButton();
        loginPage.logIn(email, password);
        welcomePage.getContactUs();
        new ContactUsBasePage(driver)
                .setSubject(setSubject)
                .setEmailAddress()
                .setOrderRef(orderRefValue)
                .setMsgText(textMsg)
                .setSendBtn();


//        contactUsPage.setSubject(setSubject);
//        contactUsPage.setEmailAddress();
//        contactUsPage.setOrderRef(orderRefValue);
//        contactUsPage.setMsgText(textMsg);
//        contactUsPage.setSendBtn();

        contactUs_afterSendMsgPage.getAlertSuccessText();
        contactUs_afterSendMsgPage.isAlertSuccessSectionIsDisplayed();

        Assert.assertTrue(contactUs_afterSendMsgPage.isAlertSuccessSectionIsDisplayed());
        Assert.assertTrue(contactUs_afterSendMsgPage.getAlertSuccessText().contains("Your"));
    }

}