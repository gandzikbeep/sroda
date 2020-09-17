import Pages.Config.BaseTest;
import Pages.Pages.HomeBasePage;
import Pages.Pages.LoginBasePage;
import Pages.Pages.WelcomeBasePage;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;


public class US01CorrectLoginTest extends BaseTest {


    @Test
    public void correctLogin()   {

        HomeBasePage homePage = new HomeBasePage(driver);
        LoginBasePage loginPage = new LoginBasePage(driver);
        WelcomeBasePage welcomePage = new WelcomeBasePage(driver);

        String correctUsername = "correctUsername@pl.pl";
        String correctPassword = "1234567";

        homePage.setSignInButton();
        loginPage.logIn(correctUsername, correctPassword);

        Assert.assertTrue(welcomePage.getWelcomeTxt().contains("Welcome to your account. Here you can manage all of your personal information and orders."));
        Assert.assertTrue(welcomePage.isLoggedUserIsVisibleSection());
        Assert.assertTrue(welcomePage.isLogoutButtonVisible());
    }

}
