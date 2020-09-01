import Pages.LoginPage;
import Pages.WelcomePage;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class US01_CorrectLoginTest {
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
    public void correctLogin() throws InterruptedException {
        String correctUsername = "correctUsername@pl.pl";
        String correctPassword = "1234567";

        LoginPage loginPage = new LoginPage(driver);

        loginPage.setEmailLogin(correctUsername);
        loginPage.setPassword(correctPassword);
        loginPage.login();

        WelcomePage welcomePage = new WelcomePage(driver);
        Assert.assertTrue(welcomePage.getWelcomeTxt().contains("Welcome to your account. Here you can manage all of your personal information and orders."));
        Assert.assertTrue(welcomePage.getLoggedUser());
        Assert.assertTrue(welcomePage.isLogoutButtonVisible());
        Thread.sleep(2000);

    }
    @After
    public void endTest(){
        driver.quit();
    }

}
