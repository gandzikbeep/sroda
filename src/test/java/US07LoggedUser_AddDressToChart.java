import Pages.*;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class US07LoggedUser_AddDressToChart {
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
    public void addDressToChartAndPayByWire() {

        LoginPage loginPage = new LoginPage(driver);
        WelcomePage welcomePage = new WelcomePage(driver);
        WomenTabPage womenTabPage = new WomenTabPage(driver);
        DressesCatPage dresses_catPage = new DressesCatPage(driver);
        DressesCatSummerPage dresses_cat_summerPage = new DressesCatSummerPage(driver);
        Pay01SummaryPage pay01_summaryPage = new Pay01SummaryPage(driver);
        Pay03AddressPage pay03_addressPage = new Pay03AddressPage(driver);
        Pay04ShippingPage pay04_shippingPage = new Pay04ShippingPage(driver);
        Pay05PaymentPage pay05_paymentPage = new Pay05PaymentPage(driver);
        Pay05PaymentBankWirePage pay05_payment_bankWirePage = new Pay05PaymentBankWirePage(driver);
        Pay05PaymentBankWireCompletePage pay05_payment_bankWire_completePage = new Pay05PaymentBankWireCompletePage(driver);

        String correctUsername = "anna@test.pl";
        String correctPassword = "111111";

        loginPage.logIn(correctUsername, correctPassword);
        welcomePage.goToWomenTab();
        womenTabPage.setDressesSubCat();
        dresses_catPage.setSummerDresses();
        dresses_cat_summerPage.setSecondDress();
        dresses_cat_summerPage.setSecondDressAddToChart();
        dresses_cat_summerPage.setProceedToCheckoutOnPopup();
        pay01_summaryPage.setProceedToCheckoutBtn();
        pay03_addressPage.setProceedToCheckoutBtn();
        pay04_shippingPage.setCheckboxIAgree();
        pay04_shippingPage.setProceedToCheckoutBtn();
        pay05_paymentPage.setPayByBankWire();
        pay05_payment_bankWirePage.setConfirmBtn();
        pay05_payment_bankWire_completePage.isVisibleCompleteOrderSection();

        Assert.assertTrue(pay05_payment_bankWire_completePage.isVisibleCompleteOrderSection());

    }

    @After
    public void endTest() {
        driver.quit();
    }
}