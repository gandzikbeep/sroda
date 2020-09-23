package Pages.Config;

import Pages.utilty.DriveFactory;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;

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
        System.out.println("After test");
        if (null != driver) {
            driver.quit();
        }
        driver = null;
    }
}