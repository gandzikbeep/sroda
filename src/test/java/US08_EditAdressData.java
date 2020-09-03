import Pages.*;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class US08_EditAdressData {
    WebDriver driver;

    @Before
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "C:\\PLIKI\\sroda2608\\src\\test\\java\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
        driver.manage().window().maximize();
        driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
    }

    @Test
    public void editAddress() {

        login();

        WelcomePage welcomePage = new WelcomePage(driver);
        welcomePage.navigateWelcomePageToMyAddress();
//
//


    }
    





    private void login() {
        String correctUsername = "anna@test.pl";
        String correctPassword = "111111";

        LoginPage loginPage = new LoginPage(driver);

        loginPage.setEmailLogin(correctUsername);
        loginPage.setPassword(correctPassword);
        loginPage.login();
    }

    @After
    public void endTest() {
        driver.quit();
    }

}
