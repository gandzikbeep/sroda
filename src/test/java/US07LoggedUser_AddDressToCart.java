import Pages.Pages.*;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class US07LoggedUser_AddDressToCart {
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

        LoginBasePage loginPage = new LoginBasePage(driver);
        WelcomeBasePage welcomePage = new WelcomeBasePage(driver);
        WomenTabBasePage womenTabPage = new WomenTabBasePage(driver);
        DressesCatBasePage dresses_catPage = new DressesCatBasePage(driver);
        DressesCatSummerBasePage dresses_cat_summerPage = new DressesCatSummerBasePage(driver);
        Pay01SummaryBasePage pay01_summaryPage = new Pay01SummaryBasePage(driver);
        Pay03AddressBasePage pay03_addressPage = new Pay03AddressBasePage(driver);
        Pay04ShippingBasePage pay04_shippingPage = new Pay04ShippingBasePage(driver);
        Pay05PaymentBasePage pay05_paymentPage = new Pay05PaymentBasePage(driver);
        Pay05PaymentBankWireBasePage pay05_payment_bankWirePage = new Pay05PaymentBankWireBasePage(driver);
        Pay05PaymentBankWireCompleteBasePage pay05_payment_bankWire_completePage = new Pay05PaymentBankWireCompleteBasePage(driver);

        String correctUsername = "anna@test.pl";
        String correctPassword = "111111";

        loginPage.logIn(correctUsername, correctPassword);
        welcomePage.goToWomenTab();
        womenTabPage.setDressesSubCat();
        dresses_catPage.setSummerDresses();
        dresses_cat_summerPage.setSecondDress();
        dresses_cat_summerPage.setSecondDressAddToCart();
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