package Pages.Config;

import Pages.utilty.DriveFactory;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class BaseTest {

    public static WebDriver driver;

    @Before
    public void setup() {

        System.out.println("Before test");
        String baseUrl = "http://automationpractice.com/index.php";
        driver = DriveFactory.getDriver();
        driver.get(baseUrl);

    }

    @After
    public void endTest() {
        if (null != driver) {
            driver.quit();
        }
        driver = null;
    }
}