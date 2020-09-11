import Pages.Pages.HomeBasePage;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class US04CheckElementsOnHomePage {
    WebDriver driver;

    @Before
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "C:\\PLIKI\\sroda2608\\src\\test\\java\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
        driver.get("http://automationpractice.com/index.php");
    }

    @Test
    public void checkElementPopular() {

        HomeBasePage homePage = new HomeBasePage(driver);

        homePage.checkElementPopular();

        Assert.assertTrue(homePage.checkElementPopular());
        Assert.assertTrue(homePage.checkElementBestSellers());

    }

    @Test
    public void checkElementBestSeller() {

        HomeBasePage homePage = new HomeBasePage(driver);

        homePage.checkElementBestSellers();

        Assert.assertTrue(homePage.checkElementBestSellers());

    }

    @Test
    public void checkSliderContainer() {

        HomeBasePage homePage = new HomeBasePage(driver);

        homePage.checkSliderContainer();

        Assert.assertTrue(homePage.checkSliderContainer());
    }

    @After
    public void endTest() {
        driver.quit();
    }
}