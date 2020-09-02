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

public class US03_CheckLogoTest {
    WebDriver driver;

    @Before
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "C:\\PLIKI\\sroda2608\\src\\test\\java\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
        driver.get("http://automationpractice.com/index.php");
    }

    @Test
    public void checkLogo() {

        HomePage homePage = new HomePage(driver);
        homePage.checkLogo();

        Assert.assertTrue(homePage.checkLogo());

    }

    @After
    public void endTest() {
        driver.quit();
    }

}
