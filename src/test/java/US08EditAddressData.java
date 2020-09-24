import Pages.Config.BaseTest;
import Pages.Pages.*;
import Pages.utilty.DataFakerPage;
import Pages.utilty.ExecutionListener;
import Pages.utilty.MyRunner;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(MyRunner.class)
public class US08EditAddressData extends BaseTest {

    @Test
    public void editAndSaveAddress() {

        HomeBasePage homePage = new HomeBasePage(driver);
        WelcomeBasePage welcomePage = new WelcomeBasePage(driver);
        MyAddressBasePage myAddressPage = new MyAddressBasePage(driver);
        MyAddressUpdateBasePage myAddress_updatePage = new MyAddressUpdateBasePage(driver);
        LoginBasePage loginPage = new LoginBasePage(driver);
        DataFakerPage faker = new DataFakerPage();

        String newFirstName = faker.getFakeFirstName();
        String newLastName = faker.getFakeLastName();
        String newCompany = faker.getFakeCompany();
        String newAddress1 = faker.getFakeAddress();
        String newAddress2 = faker.getFakeNumber();
        String newCity = faker.getFakeCity();
        String newZipCode = "45454";
        String newHomePhone = faker.getFakeHomeNumber();
        String newMobilePhone = faker.getFakeMobilePhone();
        String newAddInfo = faker.getFakeAddInfo();
        String newAlias = "jakis_nowy";
        String newState = "30";
        String newCountry = "United States";
        String correctUsername = "anna@test.pl";
        String correctPassword = "111111";

        homePage.setSignInButton();
        loginPage.logIn(correctUsername, correctPassword);
        welcomePage.navigateWelcomePageToMyAddress();
        myAddressPage.setUpdateBtn();
        myAddress_updatePage.fillAllForm(newFirstName, newLastName, newCompany, newAddress1, newAddress2,
                newCity, newState, newZipCode, newCountry, newHomePhone,
                newMobilePhone, newAddInfo, newAlias);
        myAddress_updatePage.setSaveBtn();

        Assert.assertTrue(myAddressPage.checkWelcomeText().contains("Please configure your default billing and delivery addresses when placing an order. You may also add additional addresses, which can be useful for sending gifts or receiving an order at your office.")); // cos zmienic
        Assert.assertEquals("Name is incorrect", newFirstName, myAddressPage.getTextFromFirstName());
        Assert.assertEquals("message", newCity + ",", myAddressPage.setCity());
        Assert.assertEquals(newZipCode, myAddressPage.setZipCode());

    }

    @Test

    public void editWithoutSaveAddress()  {

        HomeBasePage homePage = new HomeBasePage(driver);
        WelcomeBasePage welcomePage = new WelcomeBasePage(driver);
        MyAddressBasePage myAddressPage = new MyAddressBasePage(driver);
        MyAddressUpdateBasePage myAddress_updatePage = new MyAddressUpdateBasePage(driver);
        LoginBasePage loginPage = new LoginBasePage(driver);
        DataFakerPage faker = new DataFakerPage();

        String newFirstName = faker.getFakeFirstName();
        String newLastName = faker.getFakeLastName();
        String newCompany = faker.getFakeCompany();
        String newAddress1 = faker.getFakeAddress();
        String newAddress2 = faker.getFakeNumber();
        String newCity = faker.getFakeCity();
        String newZipCode = "10111";
        String newHomePhone = faker.getFakeHomeNumber();
        String newMobilePhone = faker.getFakeMobilePhone();
        String newAddInfo = faker.getFakeAddInfo();
        String newAlias = "jakis_nowy";
        String newState = "30";
        String newCountry = "United States";
        String correctUsername = "anna@test.pl";
        String correctPassword = "111111";

        homePage.setSignInButton();
        loginPage.logIn(correctUsername, correctPassword);
        welcomePage.navigateWelcomePageToMyAddress();
        myAddressPage.setUpdateBtn();
        myAddress_updatePage.fillAllForm(newFirstName, newLastName, newCompany, newAddress1, newAddress2,
                newCity, newState, newZipCode, newCountry, newHomePhone,
                newMobilePhone, newAddInfo, newAlias);
        myAddress_updatePage.setBackBtn();

        Assert.assertNotEquals("Name is incorrect", newFirstName, myAddressPage.getTextFromFirstName());
        Assert.assertNotEquals("Last name is not the same", newLastName, myAddressPage.getTextFromLastName());
    }

}