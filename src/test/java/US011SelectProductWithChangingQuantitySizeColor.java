import Pages.Pages.HomeBasePage;
import Pages.Pages.ProductBasePage;
import Pages.Pages.SearchBasePage;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class US011SelectProductWithChangingQuantitySizeColor {
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
    public void setQtySize()  {

        ProductBasePage productPage = new ProductBasePage(driver);
        HomeBasePage homePage = new HomeBasePage(driver);
        SearchBasePage searchPage = new SearchBasePage(driver);

        String size = "2";
        String searchItem = "summer";

        homePage.searchProductSearchBox(searchItem);
        searchPage.setFirstProductOnWebsite();
        productPage.setSize(size);
        int numberAddItem= 1;
        productPage.additionQty(numberAddItem);
        productPage.setProductPhoto();
        productPage.setProductTitle();

        Assert.assertTrue(productPage.setProductTitle().contains(searchItem));
        Assert.assertTrue("nie widac buttona add to cart", productPage.addToCartIsVisible());

    }
//    @Test
//    public void addQtyOfProduct() throws InterruptedException {
//
//        ProductBasePage productPage = new ProductBasePage(driver);
//        HomeBasePage homePage = new HomeBasePage(driver);
//        SearchBasePage searchPage = new SearchBasePage(driver);
//
//        String searchItem = "summer";
//        int numberAddItem = 2;
//
//        homePage.searchProductSearchBox(searchItem);
//        searchPage.setFirstProductOnWebsite();
//        productPage.additionQty(numberAddItem);
//
//
//
//
//        productPage.getQtyFromQtyField();
//        // add button to findby proceed to checkout
//
//        Assert.assertTrue(productPage.getQtyFromQtyField().contains("3"));
//
//    }


// public void changeQtyOfProducts() {
//        qtyField.clear();
//        qtyField.sendKeys();
//    }
//
//    public void subtractionQty() {
//        minusQty.click();
//    }
//
//    public void additionQty() {
//        plusQty.click();
//    }

    //aser   getQtyFromQtyField



    @After
    public void endTest() {
        driver.quit();
    }
}