import Pages.CreateAccountFormPage;
import Pages.LoginPage;
import org.junit.After;
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
        driver.manage().timeouts().implicitlyWait(300, TimeUnit.MILLISECONDS);
        driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account#account-creation");

    }

    @Test
    public void correctRegister() throws InterruptedException {


        CreateAccountFormPage createAccountFormPage = new CreateAccountFormPage(driver);


        String correctUsername2 = "c22123orrectUsername@pl.pl";
        String correctFirstName = "Tomasz";
        String correctLastName = "Kowalski";
        //String correctUsername = "co34rrectUsername@pl.pl";
        String correctPassword = "1234567";
        String correctDay = "4";
        String correctMonth = "4";
        String correctYear = "1988";
        String correctAddress1 = "adres1";
        String correctAddress2 = "adress22";
        String city = "New York";
        String state = "New York";
        String country = "United States";
        String zipcode = "10100";
        String addInfo = "jakies info";
        String homePhone = "918918";
        String mobilePhone = "54545454";
        String alias = "jakisAlias";
        //boolean setGenderAsMale = false;

//        HomePage homePage = new HomePage(driver);
//        homePage.goToLoginPage();
        LoginPage loginPage = new LoginPage(driver);
        loginPage.setEmailCreateInput(correctUsername2);
        loginPage.goToCreateAccountFormPage();


        Thread.sleep(3000);
      // createAccountFormPage.setGender(setGenderAsMale);
        createAccountFormPage.enterFirstName(correctFirstName);
        createAccountFormPage.enterLastName(correctLastName);
        Thread.sleep(3000);


        createAccountFormPage.enterEmailLogin(correctUsername2);
        createAccountFormPage.setPassword(correctPassword);
        Thread.sleep(3000);

        createAccountFormPage.setDayOfBirth(correctDay);
        createAccountFormPage.setMonthOfBirth(correctMonth);
        createAccountFormPage.userSelectYearOfBirth(correctYear);
        //createAccountFormPage.setCheckCheckboxNews();
       // createAccountFormPage.setCheckCheckboxSpecialOffers();
        createAccountFormPage.setAddressLine1(correctAddress1);
        createAccountFormPage.setAddressLine2(correctAddress2);
        createAccountFormPage.setCity(city);
        createAccountFormPage.setState(state);
        createAccountFormPage.setZipCode(zipcode);
        createAccountFormPage.setCountry(country);
        createAccountFormPage.setAddInfo(addInfo);
        createAccountFormPage.setHomePhone(homePhone);
        createAccountFormPage.setMobilePhone(mobilePhone);
        createAccountFormPage.setAlias(alias);
        createAccountFormPage.setBtnSubmitAccount();

//   c22123orrectUsername@pl.plc22123orrectUsername@pl.pl
//
//ASERCJE




//        WelcomePage welcomePage = new WelcomePage(driver);
//        Assert.assertTrue(welcomePage.getWelcomeTxt().contains("Welcome to your account. Here you can manage all of your personal information and orders."));
//        Assert.assertTrue(welcomePage.getLoggedUser());
//        Assert.assertTrue(welcomePage.logout());

    }

    @After
    public void endTest() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();
    }

}
