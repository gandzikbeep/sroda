import Pages.*;
import Pages.SearchPage;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class US010SearchBox {
    WebDriver driver;

    @Before
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "C:\\PLIKI\\sroda2608\\src\\test\\java\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
        driver.manage().window().maximize();
        driver.get("http://automationpractice.com/index.php?");
    }

    @Test                                                    //sortowanie od najnizszej ceny
    public void sortingBy() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        SearchPage searchPage = new SearchPage(driver);

        String searchItem = "dress";
        String valueSortOf = "price:asc";

        homePage.setSearchBox(searchItem);
        searchPage.setDrpSortBy(valueSortOf);
        searchPage.qtyItems();

        Assert.assertTrue(searchPage.qtyItems().contains("7"));

}

        //Values do sortowania
//
//        position:asc
//        value="price:asc" Price: Lowest first
//        price:desc   Price: Highest first
//        name:asc   Product Name: A to Z
//        name:desc Product Name: Z to A
//        quantity:desc   In stock
//        reference:asc Reference: Lowest first
//        reference:desc Reference: Highest first

    @Test
    public void searchRealProduct(){
        HomePage homePage = new HomePage(driver);
        SearchPage searchPage = new SearchPage(driver);

        String searchItem = "dress";

        homePage.setSearchBox(searchItem);
        searchPage.isQtyItemsIsVisible();

        Assert.assertTrue("mess",searchPage.isQtyItemsIsVisible());
    }

    @Test
    public void searchFakeProduct(){

        HomePage homePage = new HomePage(driver);
        SearchPage searchPage = new SearchPage(driver);

        String searchItem = "fakbge";

        homePage.setSearchBox(searchItem);
        searchPage.isAlertMsgIsVisible();

        Assert.assertTrue(searchPage.isAlertMsgIsVisible());
        Assert.assertTrue(searchPage.getTextFromAlert(searchItem).contains(searchItem));
    }

    @After
    public void endTest() {
        driver.quit();
    }
}
