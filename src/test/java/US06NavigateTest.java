import Pages.Config.BaseTest;
import Pages.Pages.HomeBasePage;
import Pages.Pages.LoginBasePage;
import Pages.Pages.WelcomeBasePage;
import Pages.utilty.MyRunner;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.Marker;

@RunWith(MyRunner.class)

public class US06NavigateTest extends BaseTest {


    @Test
    public void testNavigateOrderHistoryTab() {

        HomeBasePage homePage = new HomeBasePage(driver);
        LoginBasePage loginPage = new LoginBasePage(driver);
        WelcomeBasePage welcomePage = new WelcomeBasePage(driver);

        String expectedURL = "http://automationpractice.com/index.php?controller=history";

        homePage.setSignInButton();
        loginPage.logIn("correctUsername@pl.pl", "1234567");
        welcomePage.navigateWelcomePageToOrderHistory();

        Assert.assertEquals("URL is not correct", expectedURL, driver.getCurrentUrl());
    }

    @Test
    public void testNavigateCreditSlips() {

        HomeBasePage homePage = new HomeBasePage(driver);
        LoginBasePage loginPage = new LoginBasePage(driver);
        WelcomeBasePage welcomePage = new WelcomeBasePage(driver);

        String correctUsername = "correctUsername@pl.pl";
        String correctPassword = "1234567";
        String expectedURL = "http://automationpractice.com/index.php?controller=order-slip";

        homePage.setSignInButton();
        loginPage.logIn(correctUsername, correctPassword);
        welcomePage.navigateWelcomePageToMyCreditSlips();

        Assert.assertEquals("URL is not correct", expectedURL, driver.getCurrentUrl());
    }

    @Test
    public void testNavigateToMyAddress() {

        HomeBasePage homePage = new HomeBasePage(driver);
        LoginBasePage loginPage = new LoginBasePage(driver);
        WelcomeBasePage welcomePage = new WelcomeBasePage(driver);

        String correctUsername = "correctUsername@pl.pl";
        String correctPassword = "1234567";
        String expectedURL = "http://automationpractice.com/index.php?controller=addresses";

        homePage.setSignInButton();
        loginPage.logIn(correctUsername, correctPassword);
        welcomePage.navigateWelcomePageToMyAddress();

        Assert.assertEquals("URL is not correct", expectedURL, driver.getCurrentUrl());
    }

    @Test
    public void testNavigateToMyPersonalInfo() {

        HomeBasePage homePage = new HomeBasePage(driver);
        LoginBasePage loginPage = new LoginBasePage(driver);
        WelcomeBasePage welcomePage = new WelcomeBasePage(driver);

        String correctUsername = "correctUsername@pl.pl";
        String correctPassword = "1234567";
        String expectedURL = "http://automationpractice.com/index.php?controller=identity";

        homePage.setSignInButton();
        loginPage.logIn(correctUsername, correctPassword);
        welcomePage.navigateWelcomePageToMyPersonalInfo();

        Assert.assertEquals("URL is not correct", expectedURL, driver.getCurrentUrl());
    }

    @Test
    public void testNavigateToWishlist() {

        HomeBasePage homePage = new HomeBasePage(driver);
        LoginBasePage loginPage = new LoginBasePage(driver);
        WelcomeBasePage welcomePage = new WelcomeBasePage(driver);

        String correctUsername = "correctUsername@pl.pl";
        String correctPassword = "1234567";
        String expectedURL = "http://automationpractice.com/index.php?fc=module&module=blockwishlist&controller=mywishlist";

        homePage.setSignInButton();
        loginPage.logIn(correctUsername, correctPassword);
        welcomePage.navigateWelcomePageToMyWishlist();

        Assert.assertEquals("URL is not correct", expectedURL, driver.getCurrentUrl());
    }

}


