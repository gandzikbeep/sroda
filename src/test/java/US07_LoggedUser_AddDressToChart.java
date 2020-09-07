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
    public void addDressToChartAndPayByWire() {

        LoginPage loginPage = new LoginPage(driver);
        WelcomePage welcomePage = new WelcomePage(driver);
        WomenTabPage womenTabPage = new WomenTabPage(driver);
        Dresses_CatPage dresses_catPage = new Dresses_CatPage(driver);
        Dresses_Cat_SummerPage dresses_cat_summerPage = new  Dresses_Cat_SummerPage(driver);
        Pay01_SummaryPage pay01_summaryPage = new Pay01_SummaryPage(driver);
        Pay03_AddressPage pay03_addressPage = new Pay03_AddressPage(driver);
        Pay04_ShippingPage pay04_shippingPage = new Pay04_ShippingPage(driver);
        Pay05_PaymentPage pay05_paymentPage = new Pay05_PaymentPage(driver);
        Pay05_Payment_BankWirePage pay05_payment_bankWirePage = new Pay05_Payment_BankWirePage(driver);
        Pay05_Payment_BankWire_CompletePage pay05_payment_bankWire_completePage = new Pay05_Payment_BankWire_CompletePage(driver);


        String correctUsername = "anna@test.pl";
        String correctPassword = "111111";

        loginPage.logIn(correctUsername, correctPassword);
        welcomePage.goToWomenTab();
        womenTabPage.setDressesSubCat();
        dresses_catPage.setSummerDresses();
        dresses_cat_summerPage.setSecondDress();
        dresses_cat_summerPage.setSecondDressAddToChart();
        dresses_cat_summerPage.setProceedTocheckoutOnPopup();
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
