import Pages.Config.BaseTest;
import Pages.Pages.HomeBasePage;
import Pages.utilty.MyRunner;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(MyRunner.class)

public class US04CheckElementsOnHomePage extends BaseTest {


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

}