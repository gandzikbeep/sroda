import Pages.Config.BasePage;
import Pages.Config.BaseTest;
import Pages.Pages.*;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class US07LoggedUser_AddDressToCart extends BaseTest {


    @Test
    public void addDressToChartAndPayByWire() {

        HomeBasePage homePage = new HomeBasePage(driver);
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

        homePage.setSignInButton();
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

}