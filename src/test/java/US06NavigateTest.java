import Pages.Config.BaseTest;
import Pages.Pages.HomeBasePage;
import Pages.Pages.LoginBasePage;
import Pages.Pages.WelcomeBasePage;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class US06NavigateTest extends BaseTest {


    @Test
    public void testNavigateOrderHistoryTab() {

        HomeBasePage homePage = new HomeBasePage(driver);
        LoginBasePage loginPage = new LoginBasePage(driver);
        WelcomeBasePage welcomePage = new WelcomeBasePage(driver);

        String correctUsername = "correctUsername@pl.pl";
        String correctPassword = "1234567";
        String expectedURL = "http://automationpractice.com/index.php?controller=history";

        homePage.setSignInButton();
        loginPage.logIn(correctUsername, correctPassword);
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