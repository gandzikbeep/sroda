import Pages.HomePage;
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

        HomePage homePage = new HomePage(driver);

        homePage.checkElementPopular();

        Assert.assertTrue(homePage.checkElementPopular());
        Assert.assertTrue(homePage.checkElementBestSellers());

    }

    @Test
    public void checkElementBestSeller() {

        HomePage homePage = new HomePage(driver);

        homePage.checkElementBestSellers();

        Assert.assertTrue(homePage.checkElementBestSellers());

    }

    @Test
    public void checkSliderContener() {

        HomePage homePage = new HomePage(driver);
        homePage.checkSliderContainer();

        Assert.assertTrue(homePage.checkSliderContainer());
    }

    @After
    public void endTest() {
        driver.quit();
    }

}
