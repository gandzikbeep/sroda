import Pages.Config.BaseTest;
import Pages.Pages.HomeBasePage;
import Pages.Pages.LoginBasePage;
import Pages.Pages.WelcomeBasePage;
import Pages.utilty.MyRunner;
import Pages.utilty.Screenshots;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.io.IOException;

@RunWith(MyRunner.class)


public class US01CorrectLoginTest extends BaseTest {

    public US01CorrectLoginTest() {
    }


    @Test
    public void correctLogin() throws IOException {

        HomeBasePage homePage = new HomeBasePage(driver);
        LoginBasePage loginPage = new LoginBasePage(driver);
        WelcomeBasePage welcomePage = new WelcomeBasePage(driver);
        //Screenshots screenshots = new Screenshots(driver);


        String correctUsername = "correctUsername@pl.pl";
        String correctPassword = "1234567";
        Screenshots.takesScreenshot(driver);
        homePage.setSignInButton();

        loginPage.logIn(correctUsername, correctPassword);
        //screenshots.takeScreenshot();


        Assert.assertTrue(welcomePage.getWelcomeTxt().contains("Welcome to your account. Here you can manage all of your personal information and orders."));
        Assert.assertTrue(welcomePage.isLoggedUserIsVisibleSection());
        Assert.assertTrue(welcomePage.isLogoutButtonVisible());
    }

}
