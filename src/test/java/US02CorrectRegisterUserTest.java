import Pages.Config.BaseTest;
import Pages.Pages.*;
import Pages.utilty.DataFakerPage;
import org.junit.Assert;
import org.junit.Test;


public class US02CorrectRegisterUserTest extends BaseTest {


    @Test
    public void correctRegister() {

        HomeBasePage homeBasePage = new HomeBasePage(driver);
        DataFakerPage faker = new DataFakerPage();
        WelcomeBasePage welcomePage = new WelcomeBasePage(driver);
        LoginBasePage loginPage = new LoginBasePage(driver);
        CreateAccountFormBasePage createAccountFormPage = new CreateAccountFormBasePage(driver);

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
        String zipcode = "11223";
        String addInfo = "jakies info";
        String homePhone = faker.getFakeMobilePhone();
        String mobilePhone = faker.getFakeMobilePhone();
        String alias = "jakisAlias";


        homeBasePage.setSignInButton();
        loginPage.createAnAccount(faker.getFakeEmail());
        createAccountFormPage.setGender(false);
        createAccountFormPage.createAnAccountFillForm(correctDay, correctMonth, correctYear, firstName, lastName, password,
                correctAddress1, correctAddress2, city, state, country, zipcode, addInfo, homePhone, mobilePhone, alias);
        welcomePage.getWelcomeTxt();

        Assert.assertTrue(welcomePage.getWelcomeTxt().contains("Welcome to your account. Here "));
        Assert.assertTrue(welcomePage.isLoggedUserIsVisibleSection());
        Assert.assertTrue(welcomePage.isLogoutButtonVisible());
    }

}
