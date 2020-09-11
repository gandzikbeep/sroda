import Pages.Config.BaseTest;
import Pages.Pages.HomeBasePage;
import Pages.Pages.LoginBasePage;
import Pages.Pages.WelcomeBasePage;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class US01CorrectLoginTest  {
    WebDriver driver;

    @Before
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "C:\\PLIKI\\sroda2608\\src\\test\\java\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
        driver.get("http://automationpractice.com/index.php");
    }



    @Test
    public void correctLogin() {

        HomeBasePage homePage = new HomeBasePage(driver);
        LoginBasePage loginPage = new LoginBasePage(driver);
        WelcomeBasePage welcomePage = new WelcomeBasePage(driver);

        String correctUsername = "correctUsername@pl.pl";
        String correctPassword = "1234567";

        homePage.setSignInButton();
        loginPage.logIn(correctUsername, correctPassword);

        Assert.assertTrue(welcomePage.getWelcomeTxt().contains("Welcome to your account. Here you can manage all of your personal information and orders."));
        Assert.assertTrue(welcomePage.isLoggedUserIsVisibleSection());
        Assert.assertTrue(welcomePage.isLogoutButtonVisible());

    }
    @After

    public void endTest() {
        //WebDriver driver = new ChromeDriver();
        driver.quit();
    }


}
