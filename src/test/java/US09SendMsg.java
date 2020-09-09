import Pages.Pages.*;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class US09SendMsg {
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
    public void sendMsgAsALoggedUser() {

        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        WelcomePage welcomePage = new WelcomePage(driver);
        ContactUsPage contactUsPage = new ContactUsPage(driver);
        ContactUsAfterSendMsgPage contactUs_afterSendMsgPage = new ContactUsAfterSendMsgPage(driver);

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

    @After
    public void endTest() {
        driver.quit();
    }
}