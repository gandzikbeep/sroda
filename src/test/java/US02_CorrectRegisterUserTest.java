import Pages.*;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import java.util.concurrent.TimeUnit;

public class US02_CorrectRegisterUserTest {
    WebDriver driver;

    @Before
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "C:\\PLIKI\\sroda2608\\src\\test\\java\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
        driver.manage().window().maximize();
        driver.get("http://automationpractice.com/index.php");
    }

    @Test
    public void correctRegister() {

        HomePage homePage = new HomePage(driver);
        DataFakerPage faker = new DataFakerPage();
        WelcomePage welcomePage = new WelcomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        CreateAccountFormPage createAccountFormPage = new CreateAccountFormPage(driver);

        String email = faker.getFakeEmail();
        String correctDay = "4";
        String correctMonth = "4";
        String correctYear = "1990";
        String firstName = faker.getFakeFirstName();
        String lastName = faker.getFakeLastName();
        String password = faker.getFakePassword();
        String correctAddress1 = faker.getFakeAddress();
        String correctAddress2 = faker.getFakeHomeNumber();
        String city = faker.getFakeCity();
        String state = "32";
        String country = "21";
        String zipcode = "10100";
        String addInfo = "jakies info";
        String homePhone = faker.getFakeMobilePhone();
        String mobilePhone = faker.getFakeMobilePhone();
        String alias = "jakisAlias";

        homePage.goToSignInButton();
        loginPage.createAnAccount(email);
        createAccountFormPage.setGender(false);
        createAccountFormPage.createAnAccountFillForm(correctDay, correctMonth, correctYear, firstName, lastName, password,
                correctAddress1, correctAddress2, city, state, country, zipcode, addInfo, homePhone, mobilePhone, alias);
        welcomePage.getWelcomeTxt();

        Assert.assertTrue(welcomePage.getWelcomeTxt().contains("Welcome to your account. Here "));
        Assert.assertTrue(welcomePage.isLoggedUserIsVisibleSection());
        Assert.assertTrue(welcomePage.isLogoutButtonVisible());
        Assert.assertTrue(homePage.isSignInButtonIsVisible());
    }

    @After
    public void endTest() {
        driver.quit();
    }
}
