import Pages.LoginPage;
import Pages.WelcomePage;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class US06_NavigateTest {
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
        //LOGOWANIE
        onlyCorrectLogin();

        WelcomePage welcomePage = new WelcomePage(driver);
        welcomePage.navigateWelcomePageToOrderHistory();

        String expectedURL = "http://automationpractice.com/index.php?controller=history";

        Assert.assertEquals("URL is not correct", expectedURL, driver.getCurrentUrl());
    }

    @Test
    public void testNavigateCreditSlips() {
        //LOGOWANIE
        onlyCorrectLogin();

        WelcomePage welcomePage = new WelcomePage(driver);
        welcomePage.navigateWelcomePageToMyCreditSlips();

        String expectedURL = "http://automationpractice.com/index.php?controller=order-slip";

        Assert.assertEquals("URL is not correct", expectedURL, driver.getCurrentUrl());
    }

    @Test
    public void testNavigateToMyAddress() {
        onlyCorrectLogin();
        WelcomePage welcomePage = new WelcomePage(driver);
        welcomePage.navigateWelcomePageToMyAddress();
        String expectedURL = "http://automationpractice.com/index.php?controller=addresses";
        Assert.assertEquals("URL is not correct", expectedURL, driver.getCurrentUrl());
    }

    @Test
    public void testNavigateToMyPersonalInfo() {
        onlyCorrectLogin();
        WelcomePage welcomePage = new WelcomePage(driver);
        welcomePage.navigateWelcomePageToMyPersonalInfo();
        String expectedURL = "http://automationpractice.com/index.php?controller=identity";
        Assert.assertEquals("URL is not correct", expectedURL, driver.getCurrentUrl());
    }

    @Test
    public void testNavigateToWishlist() {
        onlyCorrectLogin();
        WelcomePage welcomePage = new WelcomePage(driver);
        welcomePage.navigateWelcomePageToMyWishlist();
        String expectedURL = "http://automationpractice.com/index.php?fc=module&module=blockwishlist&controller=mywishlist";
        Assert.assertEquals("URL is not correct", expectedURL, driver.getCurrentUrl());
    }

    //LOGOWANIE
    private void onlyCorrectLogin() {
        LoginPage loginPage = new LoginPage(driver);
        String correctUsername = "correctUsername@pl.pl";
        String correctPassword = "1234567";
        loginPage.setEmailLogin(correctUsername);
        loginPage.setPassword(correctPassword);
        loginPage.clickLoginBtn();
    }

    @After
    public void endTest() {
        driver.quit();
    }

}
