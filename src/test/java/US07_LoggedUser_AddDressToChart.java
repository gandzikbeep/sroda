import Pages.*;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class US07_LoggedUser_AddDressToChart {
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
    public void addDresstoChartandPayByWire()  {
        String correctUsername = "anna@test.pl";
        String correctPassword = "111111";
        boolean isVisibleCompleteOrderSection = true;

        LoginPage loginPage = new LoginPage(driver);

        loginPage.setEmailLogin(correctUsername);
        loginPage.setPassword(correctPassword);
        loginPage.login();

        WelcomePage welcomePage = new WelcomePage(driver);
        welcomePage.goToWomenTab();

        WomenTab womenTab = new WomenTab(driver);
        womenTab.setDressesSubCat();

        Dresses_Cat dresses_cat = new Dresses_Cat(driver);
        dresses_cat.setSummerDresses();

        Dresses_Cat_Summer dresses_cat_summer = new Dresses_Cat_Summer(driver);
        dresses_cat_summer.setSecondDress();
        dresses_cat_summer.setSecondDressAddToChart();
        dresses_cat_summer.setProceedTocheckoutOnPopup();

        Pay01_Summary pay01_summary = new Pay01_Summary(driver);
        pay01_summary.setProceedToCheckoutBtn();

        Pay03_Address pay03_address = new Pay03_Address(driver);
        pay03_address.setProceedToCheckoutBtn();

        Pay04_Shipping pay04_shipping = new Pay04_Shipping(driver);
        pay04_shipping.setCheckboxIAgree();
        pay04_shipping.setProceedToCheckoutBtn();

        Pay05_Payment pay05_payment = new Pay05_Payment(driver);
        pay05_payment.setPayByBankWire();

        Pay05_Payment_BankWire pay05_payment_bankWire = new Pay05_Payment_BankWire(driver);
        pay05_payment_bankWire.setConfirmBtn();

        Pay05_Payment_BankWire_Complete pay05_payment_bankWire_complete = new Pay05_Payment_BankWire_Complete(driver);
        pay05_payment_bankWire_complete.isVisibleCompleteOrderSection();

        Assert.assertTrue(pay05_payment_bankWire_complete.isVisibleCompleteOrderSection());

//        Assert.assertTrue(welcomePage.getWelcomeTxt().contains("Welcome to your account. Here you can manage all of your personal information and orders."));
//        Assert.assertTrue(welcomePage.getLoggedUser());
//        Assert.assertTrue(welcomePage.isLogoutButtonVisible());
//        Thread.sleep(2000);

    }
    @After
    public void endTest(){
        driver.quit();
    }

}
