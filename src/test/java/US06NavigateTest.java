import Pages.Pages.LoginPage;
import Pages.Pages.WelcomePage;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class US06NavigateTest {
    WebDriver driver;
//    private Object webdriver;
//    TakesScreenshot scrShot =((TakesScreenshot)webdriver);
//    File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);

    @Before
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "C:\\PLIKI\\sroda2608\\src\\test\\java\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
        driver.manage().window().maximize();
        driver.get("http://automationpractice.com/index.php?controller=my-account");
    }

    @Test
    public void testNavigateOrderHistoryTab() {

        LoginPage loginPage = new LoginPage(driver);
        WelcomePage welcomePage = new WelcomePage(driver);

        String correctUsername = "correctUsername@pl.pl";
        String correctPassword = "1234567";
        String expectedURL = "http://automationpractice.com/index.php?controller=history";

        loginPage.logIn(correctUsername, correctPassword);
        welcomePage.navigateWelcomePageToOrderHistory();

        Assert.assertEquals("URL is not correct", expectedURL, driver.getCurrentUrl());
    }

    @Test
    public void testNavigateCreditSlips() {

        LoginPage loginPage = new LoginPage(driver);
        WelcomePage welcomePage = new WelcomePage(driver);

        String correctUsername = "correctUsername@pl.pl";
        String correctPassword = "1234567";
        String expectedURL = "http://automationpractice.com/index.php?controller=order-slip";

        loginPage.logIn(correctUsername, correctPassword);
        welcomePage.navigateWelcomePageToMyCreditSlips();

        Assert.assertEquals("URL is not correct", expectedURL, driver.getCurrentUrl());
    }

    @Test
    public void testNavigateToMyAddress() {

        LoginPage loginPage = new LoginPage(driver);
        WelcomePage welcomePage = new WelcomePage(driver);
        String correctUsername = "correctUsername@pl.pl";
        String correctPassword = "1234567";
        String expectedURL = "http://automationpractice.com/index.php?controller=addresses";

        loginPage.logIn(correctUsername, correctPassword);
        welcomePage.navigateWelcomePageToMyAddress();

        Assert.assertEquals("URL is not correct", expectedURL, driver.getCurrentUrl());
    }

    @Test
    public void testNavigateToMyPersonalInfo() {
        LoginPage loginPage = new LoginPage(driver);
        WelcomePage welcomePage = new WelcomePage(driver);

        String correctUsername = "correctUsername@pl.pl";
        String correctPassword = "1234567";
        String expectedURL = "http://automationpractice.com/index.php?controller=identity";

        loginPage.logIn(correctUsername, correctPassword);
        welcomePage.navigateWelcomePageToMyPersonalInfo();

        Assert.assertEquals("URL is not correct", expectedURL, driver.getCurrentUrl());
    }

    @Test
    public void testNavigateToWishlist() {

        LoginPage loginPage = new LoginPage(driver);
        WelcomePage welcomePage = new WelcomePage(driver);

        String correctUsername = "correctUsername@pl.pl";
        String correctPassword = "1234567";
        String expectedURL = "http://automationpractice.com/index.php?fc=module&module=blockwishlist&controller=mywishlist";

        loginPage.logIn(correctUsername, correctPassword);
        welcomePage.navigateWelcomePageToMyWishlist();

        Assert.assertEquals("URL is not correct", expectedURL, driver.getCurrentUrl());
    }

    @After
    public void endTest() {
        driver.quit();
    }
}