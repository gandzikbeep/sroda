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
        // dane do zmiany:
        String newFirstName = "AnnaABC";
        String newLastName = "TestABC";
        String newCompany = "newComINC";
        String newAddress1 = "nowyAdres";
        String newAddress2 = "second line";
        String newCity = "New York Test2";
        String newZipCode = "10111";
        String newHomePhone = "505505123";
        String newMobilePhone = "9180000000";
        String newAddInfo = "nowy test do testu";
        String newAlias = "jakis_nowy";
        String newState = "30";
        String newCountry = "United States";


        login();

        WelcomePage welcomePage = new WelcomePage(driver);
        welcomePage.navigateWelcomePageToMyAddress();

        MyAddressPage myAddressPage = new MyAddressPage(driver);
        myAddressPage.setUpdateBtn();


        MyAddress_Update myAddress_update = new MyAddress_Update(driver);
        myAddress_update.setFirstName(newFirstName);
        myAddress_update.setLastName(newLastName);
        myAddress_update.setCompany(newCompany);
        myAddress_update.setAddress1(newAddress1);
        myAddress_update.setAddress2(newAddress2);
        myAddress_update.setCity(newCity);
        myAddress_update.setCountry(newCountry); //  city, country, state
        myAddress_update.setState(newState);
        myAddress_update.setZipCode(newZipCode);

        myAddress_update.setHomePhone(newHomePhone);
        myAddress_update.setMobilePhone(newMobilePhone);
        myAddress_update.setAddInfo(newAddInfo);
        myAddress_update.setAlias(newAlias);
        myAddress_update.setSaveBtn();

        myAddressPage.checkText();


        Assert.assertTrue(myAddressPage.checkText());
        Assert.assertEquals(newFirstName, myAddress_update.getTextFromFirstName());

    }


    private void login() {
        String correctUsername = "anna@test.pl";
        String correctPassword = "111111";

        LoginPage loginPage = new LoginPage(driver);

        loginPage.setEmailLogin(correctUsername);
        loginPage.setPassword(correctPassword);
        loginPage.clickLoginBtn();
    }

    @After
    public void endTest() {
        driver.quit();
    }

}
