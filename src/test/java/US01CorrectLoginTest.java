import Pages.Pages.HomePage;
import Pages.Pages.LoginPage;
import Pages.Pages.WelcomePage;
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
        driver.manage().window().maximize();
        driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
    }

    @Test
    public void correctLogin() {

        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        WelcomePage welcomePage = new WelcomePage(driver);

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
        driver.quit();
    }
}
