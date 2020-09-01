//import Pages.*;
//import org.junit.After;
//import org.junit.Assert;
//import org.junit.Before;
//import org.junit.Test;
//import org.openqa.selenium.JavascriptExecutor;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import java.util.concurrent.TimeUnit;
//
//public class US08_RegisterNewUser_Actions {
//    WebDriver driver;
//
//    @Before
//    public void setup() {
//        System.setProperty("webdriver.chrome.driver", "C:\\PLIKI\\sroda2608\\src\\test\\java\\chromedriver.exe");
//        driver = new ChromeDriver();
//        driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
//        driver.manage().window().maximize();
//        driver.get("http://automationpractice.com/index.php?");
//    }
//
//    @Test
//    public void registerNewUserAndAddToCart() throws InterruptedException {
//
//        CreateAccountFormPage createAccountFormPage = new CreateAccountFormPage(driver);
//
//        String correctDay = "2";
//        String correctMonth = "2";
//        String correctYear = "1990";
//        String correctAddress1 = "adr22es1";
//        String correctAddress2 = "adress22";
//        String city = "New York";
//        String state = "32";
//        String country = "21";
//        String zipcode = "10100";
//        String addInfo = "jakies info";
//        String homePhone = "918918";
//        String mobilePhone = "9189189187";
//        String alias = "jakisAlias";
//        boolean setGenderAsMale = false;
//        String correctusername2 = null;
//
//        HomePage homePage = new HomePage(driver);
//        homePage.goToLoginPage();
//
//        DataFaker faker = new DataFaker();
//        String correctEmail = faker.getFakeEmail();
//        LoginPage loginPage = new LoginPage(driver);
//        Thread.sleep(5000);
//        loginPage.setEmailCreateInput(correctEmail);
//        Thread.sleep(5000);
//        loginPage.goToCreateAccountFormPage();
//
//        createAccountFormPage.setGender(setGenderAsMale);
//        createAccountFormPage.enterFirstName(faker.getFakeFirstName());   //imię
//        createAccountFormPage.enterLastName(faker.getFakeLastName());   //nazwisko
//
//        createAccountFormPage.enterEmailLogin(correctusername2);
//        createAccountFormPage.setPassword(faker.getFakePassword());
//
//        JavascriptExecutor js = (JavascriptExecutor) driver;
//        js.executeScript(("window.scrollBy(0,250)"));
//        createAccountFormPage.setDayOfBirth(correctDay);
//        createAccountFormPage.setMonthOfBirth(correctMonth);
//        createAccountFormPage.setYearOfBirth(correctYear);
//        js.executeScript(("window.scrollBy(0,250)"));
//
//        createAccountFormPage.setCheckCheckboxNews();
//        createAccountFormPage.setCheckCheckboxSpecialOffers();
//
//        createAccountFormPage.setAddressLine1(correctAddress1);
//        createAccountFormPage.setAddressLine2(correctAddress2);
//
//        createAccountFormPage.setCity(city);
//        createAccountFormPage.setCountry(country);
//        createAccountFormPage.setState(state);
//        createAccountFormPage.setZipCode(zipcode);
//
//        createAccountFormPage.setAddInfo(addInfo);
//        createAccountFormPage.setHomePhone(homePhone);
//        createAccountFormPage.setMobilePhone(mobilePhone);
//        createAccountFormPage.setAlias(alias);
//
//        createAccountFormPage.setBtnSubmitAccount();
//        WelcomePage welcomePage = new WelcomePage(driver);
//        welcomePage.goToWomenTab();
//        WomenTab womenTab = new WomenTab(driver);
//        womenTab.
//
//        //na welcome -> click na logo -> zrobic Shopping page -> dodac jakis zakup do koszyka
//
//    }
//
//
//    @After
//    public void endTest() {
//        driver.quit();
//    }
//
//}
