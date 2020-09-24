import Pages.Config.BaseTest;
import Pages.Pages.HomeBasePage;
import Pages.Pages.SearchBasePage;
import Pages.utilty.MyRunner;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

@RunWith(MyRunner.class)

public class US010SearchBox extends BaseTest {




    @Test                       //sortowanie od najnizszej ceny
    public void sortingBy() {
        HomeBasePage homePage = new HomeBasePage(driver);
        SearchBasePage searchPage = new SearchBasePage(driver);

        String searchItem = "dress";
        String valueSortOf = "price:asc";

        homePage.searchProductSearchBox(searchItem);
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
    public void searchRealProduct() {
        HomeBasePage homePage = new HomeBasePage(driver);
        SearchBasePage searchPage = new SearchBasePage(driver);

        String searchItem = "dress";

        homePage.searchProductSearchBox(searchItem);
        searchPage.isQtyItemsIsVisible();

        Assert.assertTrue("Qty Items is not visible", searchPage.isQtyItemsIsVisible());
    }

    @Test
    public void searchFakeProduct() {

        HomeBasePage homePage = new HomeBasePage(driver);
        SearchBasePage searchPage = new SearchBasePage(driver);

        String searchItem = "fakbge";

        homePage.searchProductSearchBox(searchItem);
        searchPage.isAlertMsgIsVisible();

        Assert.assertTrue(searchPage.isAlertMsgIsVisible());
        Assert.assertTrue(searchPage.getTextFromAlert(searchItem).contains(searchItem));
    }

}