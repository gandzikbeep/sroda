//NIE DZIAŁA


import Pages.HomePage;
import Pages.LoginPage;
import Pages.WelcomePage;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class US05_CorrectLogout<correctUsername, correctPassword> {
    WebDriver driver;

    @Before
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "C:\\PLIKI\\sroda2608\\src\\test\\java\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
        driver.manage().window().maximize();
        driver.get("http://automationpractice.com/index.php");
    }

    @Test
    //HomePage homePage = new HomePage(driver);
    //  LoginPage loginPage = new LoginPage(driver);

    public void correctLoginWithLogout() throws InterruptedException {
        String correctUsername = "correctUsername@pl.pl";
        String correctPassword = "1234567";

        HomePage homePage = new HomePage(driver);
        homePage.goToSignInButton();
        LoginPage loginPage = new LoginPage(driver);

        loginPage.setEmailLogin(correctUsername);
        loginPage.setPassword(correctPassword);
        loginPage.clickLoginBtn();

        WelcomePage welcomePage = new WelcomePage(driver);
        Thread.sleep(200);
        welcomePage.setLogout();

        Assert.assertTrue(loginPage.IsSignInButtonIsVisibleOnLoginPage());

    }

    @After
    public void endTest() {
        driver.quit();
    }
}
