import Pages.Config.BaseTest;
import Pages.Pages.HomeBasePage;
import Pages.Pages.ProductBasePage;
import Pages.Pages.SearchBasePage;
import org.junit.Assert;
import org.junit.Test;

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