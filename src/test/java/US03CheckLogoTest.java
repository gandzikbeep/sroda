import Pages.Config.BaseTest;
import Pages.Pages.HomeBasePage;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class US03CheckLogoTest extends BaseTest {


    @Test
    public void checkLogo() {

        HomeBasePage homePage = new HomeBasePage(driver);

        homePage.checkLogo();

        Assert.assertTrue(homePage.checkLogo());

    }

}
