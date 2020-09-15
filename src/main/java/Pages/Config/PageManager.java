//package Pages.Config;
//
//import Pages.Pages.HomeBasePage;
//import Pages.Pages.LoginBasePage;
//import Pages.Pages.WelcomeBasePage;
//import org.openqa.selenium.WebDriver;
//
//import pageObjects.CartPage;
//
//import pageObjects.CheckoutPage;
//
//import pageObjects.ConfirmationPage;
//
//import pageObjects.HomePage;
//
//import pageObjects.ProductListingPage;
//
//
//
//public class PageObjectManager {
//
//    private WebDriver driver;
//
//    private LoginBasePage loginBasePage;
//
//    private HomeBasePage homeBasePage;
//
//    private WelcomeBasePage welcomeBasePage;
//
////    private CheckoutPage checkoutPage;
////
////    private ConfirmationPage confirmationPage;
//
//
//
//
//    public PageObjectManager(WebDriver driver) {
//        this.driver = driver;
//    }
//
//
//    public HomeBasePage getHomePage(){
//
//        return (homeBasePage == null) ? homeBasePage = new HomeBasePage(driver) : homeBasePage;
//
//    }
//
//
//
//    public LoginBasePage getLoginBasePage() {
//
//        return (loginBasePage == null) ? loginBasePage = new LoginBasePage(driver) : loginBasePage;
//
//    }
//
//
//
//    public WelcomeBasePage getWelcomeBasePage() {
//
//        return (welcomeBasePage == null) ? welcomeBasePage = new WelcomeBasePage(driver) : welcomeBasePage;
//
//    }
//
//
//
//
//    public CheckoutPage getCheckoutPage() {
//
//        return (checkoutPage == null) ? checkoutPage = new CheckoutPage(driver) : checkoutPage;
//
//    }
//}
//
//
//
//
//import Pages.Pages.*;
//import org.openqa.selenium.WebDriver;
//
//public class PageManager {
//    public WebDriver driver;
//
//    public LoginBasePage loginBasePage;
//    public ContactUsAfterSendMsgBasePage contactUsAfterSendMsgBasePage;
//    public ContactUsBasePage contactUsBasePage;
//    public CreateAccountFormBasePage createAccountFormBasePage;
//    public DressesCatBasePage dressesCatBasePage;
//    public DressesCatSummerBasePage dressesCatSummerBasePage;
//    public HomeBasePage homeBasePage;
//    public MyAddressBasePage myAddressBasePage;
//    public MyAddressUpdateBasePage myAddressUpdateBasePage;
//    public Pay01SummaryBasePage pay01SummaryBasePage;
//    public Pay03AddressBasePage pay03AddressBasePage;
//    public Pay04ShippingBasePage pay04ShippingBasePage;
//    public Pay05PaymentBankWireBasePage pay05PaymentBankWireBasePage;
//    public Pay05PaymentBankWireCompleteBasePage pay05PaymentBankWireCompleteBasePage;
//    public Pay05PaymentBasePage pay05PaymentBasePage;
//    public ProductBasePage productBasePage;
//    public SearchBasePage searchBasePage;
//    public WelcomeBasePage welcomeBasePage;
//    public WomenTabBasePage womenTabBasePage;
//
//    public PageManager(WebDriver driver) {
//        this.driver = driver;
//        loginBasePage = initElements(new LoginBasePage(this));
//        contactUsAfterSendMsgBasePage = initElements(new ContactUsAfterSendMsgBasePage(this));
//        contactUsBasePage = initElements(new ContactUsBasePage(this));
//        createAccountFormBasePage = initElements(new CreateAccountFormBasePage(this));
//        dressesCatBasePage = initElements(new DressesCatBasePage(this));
//        dressesCatBasePage = initElements(new DressesCatSummerBasePage(this));
//        homeBasePage = initElements(new HomeBasePage(this));
//        myAddressBasePage = initElements(new MyAddressBasePage(this));
//        myAddressUpdateBasePage = initElements(new MyAddressUpdateBasePage(this));
//        pay01SummaryBasePage = initElements(new Pay01SummaryBasePage(this));
//        pay03AddressBasePage = initElements(new Pay01SummaryBasePage(this));
//       // Pay04ShippingBasePage pay04ShippingBasePage = new Pay04ShippingBasePage(driver);
//        pay04ShippingBasePage = initElements(new Pay04ShippingBasePage(this));
//
//
////    public Pay03AddressBasePage pay03AddressBasePage;
////    public Pay04ShippingBasePage pay04ShippingBasePage;
////    public Pay05PaymentBankWireBasePage pay05PaymentBankWireBasePage;
////    public Pay05PaymentBankWireCompleteBasePage pay05PaymentBankWireCompleteBasePage;
////    public Pay05PaymentBasePage pay05PaymentBasePage;
////    public ProductBasePage productBasePage;
////    public SearchBasePage searchBasePage;
////    public WelcomeBasePage welcomeBasePage;
////    public WomenTabBasePage womenTabBasePage;
//
//
//    }
//
//    private <T extends Page> T initElements(T page) {
//        // PageFactory.initElements(driver, page);
//        // PageFactory.initElements(new AjaxElementLocatorFactory(driver, 10),
//        // page);
//        PageFactory.initElements(
//                new DisplayedElementLocatorFactory(driver, 30), page);
//        return page;
//    }
//
//    public WebDriver getWebDriver() {
//        return driver;
//    }
//
//}
//}
