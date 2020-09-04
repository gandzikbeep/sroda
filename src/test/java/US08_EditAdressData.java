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
    public void editAndSaveAddress() {

        WelcomePage welcomePage = new WelcomePage(driver);
        MyAddressPage myAddressPage = new MyAddressPage(driver);
        MyAddress_UpdatePage myAddress_updatePage = new MyAddress_UpdatePage(driver);
        DataFakerPage faker = new DataFakerPage();


        // dane testowe:
        String newFirstName = faker.getFakeFirstName();
        String newLastName = faker.getFakeLastName();
        String newCompany = faker.getFakeCompany();
        String newAddress1 = faker.getFakeAddress();
        String newAddress2 = faker.getFakeNumber();
        String newCity = faker.getFakeCity();
        String newZipCode = faker.getFakeZipCode();
        String newHomePhone = faker.getFakeHomeNumber();
        String newMobilePhone = faker.getFakeMobilePhone();
        String newAddInfo = faker.getFakeAddInfo();
        String newAlias = "jakis_nowy";
        String newState = "30";
        String newCountry = "United States";

        //TEST:

        login();
        welcomePage.navigateWelcomePageToMyAddress();
        myAddressPage.setUpdateBtn();
        myAddress_updatePage.fillAllForm(newFirstName, newLastName, newCompany, newAddress1, newAddress2,
                newCity, newState, newZipCode, newCountry, newHomePhone,
                newMobilePhone, newAddInfo, newAlias);
        myAddress_updatePage.setSaveBtn();
        //myAddressPage.checkWelcomeText();

        //ASERCJE:
        Assert.assertTrue(myAddressPage.checkWelcomeText().contains("Please configure your default billing and delivery addresses when placing an order. You may also add additional addresses, which can be useful for sending gifts or receiving an order at your office.")); // cos zmienic

        // Assert.assertTrue(welcomePage.getWelcomeTxt().contains(""));
        Assert.assertEquals("Name is incorrect", newFirstName, myAddressPage.getTextFromFirstName());
        Assert.assertEquals("message", newCity + ",", myAddressPage.setCity());
        Assert.assertEquals(newZipCode, myAddressPage.setZipCode());

    }

    @Test


    public void editWithoutSaveAddress() {
        WelcomePage welcomePage = new WelcomePage(driver);
        MyAddressPage myAddressPage = new MyAddressPage(driver);
        MyAddress_UpdatePage myAddress_updatePage = new MyAddress_UpdatePage(driver);
        DataFakerPage faker = new DataFakerPage();

        // dane testowe:
        String newFirstName = faker.getFakeFirstName();
        String newLastName = faker.getFakeLastName();
        String newCompany = faker.getFakeCompany();
        String newAddress1 = faker.getFakeAddress();
        String newAddress2 = faker.getFakeNumber();
        String newCity = faker.getFakeCity();
        String newZipCode = faker.getFakeZipCode();
        String newHomePhone = faker.getFakeHomeNumber();
        String newMobilePhone = faker.getFakeMobilePhone();
        String newAddInfo = faker.getFakeAddInfo();
        String newAlias = "jakis_nowy";
        String newState = "30";
        String newCountry = "United States";

        login();
        welcomePage.navigateWelcomePageToMyAddress();
        myAddressPage.setUpdateBtn();
        myAddress_updatePage.fillAllForm(newFirstName, newLastName, newCompany, newAddress1, newAddress2,
                newCity, newState, newZipCode, newCountry, newHomePhone,
                newMobilePhone, newAddInfo, newAlias);
        myAddress_updatePage.setBackBtn();

        //ASERCJE
        Assert.assertNotEquals("Name is incorrect", newFirstName, myAddressPage.getTextFromFirstName());

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
