import Pages.*;
import com.github.javafaker.Faker;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import java.util.Random;
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
    public void correctRegister() throws InterruptedException {

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
        String correctusername2 = null;

        DataFaker faker = new DataFaker();
        WelcomePage welcomePage = new WelcomePage(driver);

        HomePage homePage = new HomePage(driver);
//        homePage.goToLoginPage();
        LoginPage loginPage = new LoginPage(driver);
        loginPage.setEmailCreateInput(correctusername2);
        loginPage.goToCreateAccountFormPage();

        CreateAccountFormPage createAccountFormPage = new CreateAccountFormPage(driver);
        createAccountFormPage.setGender(setGenderAsMale);
        createAccountFormPage.enterFirstName(faker.getFakeFirstName());
        createAccountFormPage.enterLastName(faker.getFakeLastName());

        createAccountFormPage.enterEmailLogin(correctusername2);
        createAccountFormPage.setPassword(faker.getFakePassword());
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript(("window.scrollBy(0,250)"));
        createAccountFormPage.setDayOfBirth(correctDay);
        createAccountFormPage.setMonthOfBirth(correctMonth);
        createAccountFormPage.setYearOfBirth(correctYear);
        js.executeScript(("window.scrollBy(0,250)"));
        Thread.sleep(3000);

        createAccountFormPage.setCheckCheckboxNews();
        createAccountFormPage.setCheckCheckboxSpecialOffers();

        createAccountFormPage.setAddressLine1(correctAddress1);
        createAccountFormPage.setAddressLine2(correctAddress2);

        createAccountFormPage.setCity(city);
        createAccountFormPage.setCountry(country);
        createAccountFormPage.setState(state);
        createAccountFormPage.setZipCode(zipcode);
        Thread.sleep(3000);

        createAccountFormPage.setAddInfo(addInfo);
        createAccountFormPage.setHomePhone(homePhone);
        createAccountFormPage.setMobilePhone(mobilePhone);
        createAccountFormPage.setAlias(alias);
        Thread.sleep(3000);
        createAccountFormPage.setBtnSubmitAccount();
        Thread.sleep(3000);
        welcomePage.getWelcomeTxt();

//ASERCJE

        Assert.assertTrue(welcomePage.getWelcomeTxt().contains("Welcome to your account. Here "));
        Assert.assertTrue(welcomePage.getLoggedUser());
        Assert.assertTrue(welcomePage.isLogoutButtonVisible());
        Assert.assertTrue(homePage.isSignInButtonIsVisible());

    }

    @After
    public void endTest() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();
    }

}
