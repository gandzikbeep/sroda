//NIE DZIAŁA


import Pages.Config.BaseTest;
import Pages.Pages.HomeBasePage;
import Pages.Pages.LoginBasePage;
import Pages.Pages.WelcomeBasePage;
import org.junit.Assert;
import org.junit.Test;


public class US05CorrectLogout extends BaseTest {


    @Test

    public void correctLoginWithLogout() {

        HomeBasePage homePage = new HomeBasePage(driver);
        LoginBasePage loginPage = new LoginBasePage(driver);
        WelcomeBasePage welcomePage = new WelcomeBasePage(driver);

        String correctUsername = "correctUsername@pl.pl";
        String correctPassword = "1234567";

        homePage.setSignInButton();
//        new LoginBasePage(driver)
//                .logIn(correctUsername, correctPassword);
        loginPage.logIn(correctUsername, correctPassword);

        welcomePage.setLogout();

        Assert.assertTrue(loginPage.IsSignInButtonIsVisibleOnLoginPage());
    }

}
