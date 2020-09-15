package Pages.Config;

import org.apache.commons.io.FileUtils;
import org.junit.After;
import org.junit.Before;
import org.junit.runner.Description;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class BaseTest {

    public static WebDriver driver;

    @Before
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "C:\\PLIKI\\sroda2608\\src\\test\\java\\chromedriver.exe");
        String baseUrl = "http://automationpractice.com/index.php";

        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
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

