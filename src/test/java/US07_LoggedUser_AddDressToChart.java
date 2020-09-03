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

        login();

        selectDress();

        Pay05_Payment_BankWire_CompletePage pay05_payment_bankWire_completePage = getPay05_payment_bankWire_complete();

        Assert.assertTrue(pay05_payment_bankWire_completePage.isVisibleCompleteOrderSection());

        //Assert.assertEquals("Ceny nie sa takie same", driver.findElement(By.id("total_price")), driver.findElement(By.id("amount")));

    }


    private Pay05_Payment_BankWire_CompletePage getPay05_payment_bankWire_complete() {
        Pay01_SummaryPage pay01_summaryPage = new Pay01_SummaryPage(driver);
        pay01_summaryPage.setProceedToCheckoutBtn();

        Pay03_AddressPage pay03_addressPage = new Pay03_AddressPage(driver);
        pay03_addressPage.setProceedToCheckoutBtn();

        Pay04_ShippingPage pay04_shippingPage = new Pay04_ShippingPage(driver);
        pay04_shippingPage.setCheckboxIAgree();
        pay04_shippingPage.setProceedToCheckoutBtn();

        Pay05_PaymentPage pay05_paymentPage = new Pay05_PaymentPage(driver);
        pay05_paymentPage.checkTotalPrice();
        pay05_paymentPage.setPayByBankWire();

        Pay05_Payment_BankWirePage pay05_payment_bankWirePage = new Pay05_Payment_BankWirePage(driver);
        pay05_payment_bankWirePage.setConfirmBtn();

        Pay05_Payment_BankWire_CompletePage pay05_payment_bankWire_completePage = new Pay05_Payment_BankWire_CompletePage(driver);
        pay05_payment_bankWire_completePage.isVisibleCompleteOrderSection();
       // pay05_payment_bankWire_complete.checkAmount();
        return pay05_payment_bankWire_completePage;
    }

    private void selectDress() {
        WelcomePage welcomePage = new WelcomePage(driver);
        welcomePage.goToWomenTab();

        WomenTabPage womenTabPage = new WomenTabPage(driver);
        womenTabPage.setDressesSubCat();

        Dresses_CatPage dresses_catPage = new Dresses_CatPage(driver);
        dresses_catPage.setSummerDresses();

        Dresses_Cat_SummerPage dresses_cat_summerPage = new Dresses_Cat_SummerPage(driver);
        dresses_cat_summerPage.setSecondDress();
        // dresses_cat_summer.setPriceSecondDress();  //cena drugiej sukienki
        dresses_cat_summerPage.setSecondDressAddToChart();
        dresses_cat_summerPage.setProceedTocheckoutOnPopup();
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
