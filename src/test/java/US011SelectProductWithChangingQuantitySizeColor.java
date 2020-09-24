import Pages.Config.BaseTest;
import Pages.Pages.HomeBasePage;
import Pages.Pages.ProductBasePage;
import Pages.Pages.SearchBasePage;
import Pages.utilty.MyRunner;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(MyRunner.class)

public class US011SelectProductWithChangingQuantitySizeColor extends BaseTest {


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
        productPage.additionQty();
        productPage.setProductPhoto();
        productPage.setProductTitle();

        Assert.assertTrue(productPage.setProductTitle().contains(searchItem));
        Assert.assertTrue("nie widac buttona add to cart", productPage.addToCartIsVisible());

    }

}