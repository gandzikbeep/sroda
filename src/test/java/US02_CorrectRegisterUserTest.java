import Pages.*;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.JavascriptExecutor;
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
        driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
    }

    @Test
    public void correctRegister() {

        DataFakerPage faker = new DataFakerPage();
        WelcomePage welcomePage = new WelcomePage(driver);
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        CreateAccountFormPage createAccountFormPage = new CreateAccountFormPage(driver);
        JavascriptExecutor js = (JavascriptExecutor) driver;

        String correctDay = "4";
        String correctMonth = "4";
        String correctYear = "1990";
        String correctAddress1 = "adres1";
        String correctAddress2 = "adress22";
        String city = "New York";
        String state = "32";
        String country = "21";
        String zipcode = "10100";
        String addInfo = "jakies info";
        String homePhone = "918918";
        String mobilePhone = "9189189187";
        String alias = "jakisAlias";
        boolean setGenderAsMale = false;
        String correctUsername2 = faker.getFakeEmail();

        loginPage.createAnAccount(correctUsername2);
        createAccountFormPage.setGender(setGenderAsMale);
        createAccountFormPage.enterFirstName(faker.getFakeFirstName());
        createAccountFormPage.enterLastName(faker.getFakeLastName());
        createAccountFormPage.enterEmailLogin(correctUsername2);
        createAccountFormPage.setPassword(faker.getFakePassword());
        js.executeScript(("window.scrollBy(0,200)"));
        createAccountFormPage.setDayOfBirth(correctDay);
        createAccountFormPage.setMonthOfBirth(correctMonth);
        createAccountFormPage.setYearOfBirth(correctYear);
        js.executeScript(("window.scrollBy(0,300)"));
        createAccountFormPage.setCheckCheckboxNews();
        createAccountFormPage.setCheckCheckboxSpecialOffers();
        createAccountFormPage.setAddressLine1(correctAddress1);
        createAccountFormPage.setAddressLine2(correctAddress2);
        createAccountFormPage.setCity(city);
        createAccountFormPage.setCountry(country);
        createAccountFormPage.setState(state);
        createAccountFormPage.setZipCode(zipcode);
        createAccountFormPage.setAddInfo(addInfo);
        createAccountFormPage.setHomePhone(homePhone);
        createAccountFormPage.setMobilePhone(mobilePhone);
        createAccountFormPage.setAlias(alias);
        createAccountFormPage.setBtnSubmitAccount();
        welcomePage.getWelcomeTxt();

//ASERCJE
        Assert.assertTrue(welcomePage.getWelcomeTxt().contains("Welcome to your account. Here "));
        Assert.assertTrue(welcomePage.isLoggedUserIsVisibleSection());
        Assert.assertTrue(welcomePage.isLogoutButtonVisible());
        Assert.assertTrue(homePage.isSignInButtonIsVisible());
    }

    @After
    public void endTest() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();
    }
}
