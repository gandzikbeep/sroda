import Pages.Pages.HomePage;
import Pages.Pages.Pay01SummaryPage;
import Pages.Pages.ProductPage;
import Pages.Pages.SearchPage;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class US011SelectProductwithChangingQuantitySizeColor {
    WebDriver driver;

    @Before
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "C:\\PLIKI\\sroda2608\\src\\test\\java\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
        driver.manage().window().maximize();
        driver.get("http://automationpractice.com/index.php?");

    }



    @Test
    public void setQtySizeColor() throws InterruptedException {

        ProductPage productPage = new ProductPage(driver);
        HomePage homePage = new HomePage(driver);
        SearchPage searchPage = new SearchPage(driver);
       // Pay01SummaryPage pay01SummaryPage = new Pay01SummaryPage(driver);

        String size = "2";
        String color = "Black";
        String searchItem = "summer";

        homePage.searchProductSearchBox(searchItem);
        Thread.sleep(4000);
        searchPage.setFirstProductOnWebsite();
        Thread.sleep(4000);
        productPage.setSize(size);
        productPage.additionQty();
//        productPage.setColor(color);
        productPage.setProductPhoto();
        Thread.sleep(3000);
        productPage.setProductTitle();

       // Assert.assertTrue(productPage.setProductTitle().contains(searchItem));
        Assert.assertTrue("nie widac buttona add to cart", productPage.addToCartIsVisible());


    }

    @After
    public void endTest() {
        driver.quit();
    }
}