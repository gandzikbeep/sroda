import Pages.*;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class US09_SendMsg {
    WebDriver driver;

    @Before
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "C:\\PLIKI\\sroda2608\\src\\test\\java\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
        driver.manage().window().maximize();
        driver.get("http://automationpractice.com/index.php?");
    }

    @Test
    public void sendMsgAsALoggedUser() throws InterruptedException {
        String email = "anna@test.pl";
        String password = "111111";
        String setSubject = "2";
        String msg = "jakas wiadomosc";
        boolean isAlertSuccessSection = true;

        HomePage homePage = new HomePage(driver);
        homePage.goToSignInButton();
        LoginPage loginPage = new LoginPage(driver);
        loginPage.setEmailLogin(email);
        loginPage.setPassword(password);
        loginPage.clickLoginBtn();
        WelcomePage welcomePage = new WelcomePage(driver);
        welcomePage.getContactUs();
        ContactUsPage contactUsPage = new ContactUsPage(driver);
        contactUsPage.setSubject(setSubject);
        contactUsPage.setEmailAddress();
        contactUsPage.setOrderRef();
        contactUsPage.setMsgText(msg);
        contactUsPage.setSendBtn();
        Thread.sleep(5000);

        ContactUsAfterSendMsgPage contactUs_afterSendMsgPage = new ContactUsAfterSendMsgPage(driver);
        contactUs_afterSendMsgPage.getAlertSuccessText();
        contactUs_afterSendMsgPage.isAlertSuccessSectionIsDisplayed();


String expected = "Your message has been successfully sent to our team.";
    // dziala:
        Assert.assertTrue(contactUs_afterSendMsgPage.isAlertSuccessSectionIsDisplayed());

        //assert nie dziala:

  // Assert.assertEquals(expected,contactUs_afterSendMsgPage.getAlertSuccessText().contains("Your"));
   Assert.assertTrue(contactUs_afterSendMsgPage.getAlertSuccessText().contains("Your"));

   //       // Assert.assertTrue(welcomePage.getWelcomeTxt().contains("Welcome to your account. Here you can manage all of your personal information and orders."));
    }



    @After
    public void endTest() {
        driver.quit();
    }

}
