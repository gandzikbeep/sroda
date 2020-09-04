package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

    private final WebDriver driver;
   // private Object LoginPage;
    //private Object WomenTab;

    //konst
    public HomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[@id=\"header_logo\"]/a/img")
    WebElement yourLogo;
    @FindBy(xpath = "//*[@id=\"contact-link\"]/a")
    WebElement contactLink;
    @FindBy(xpath = "//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a")
    WebElement signIn;

    @FindBy(xpath = "//*[@id=\"home-page-tabs\"]/li[1]/a")
    WebElement popularTab;
    @FindBy(xpath = "//*[@id=\"home-page-tabs\"]/li[2]/a")
    WebElement bestSellersTab;
    @FindBy(xpath = "//*[@id=\"slider_row\"]")
    WebElement sliderContener;
    @FindBy(xpath = "//*[@id=\"block_top_menu\"]/ul/li[1]/a")
    WebElement womenTab;

public void setContactLink()
{
    contactLink.click();
}

    public void goToWomenTab() {
        womenTab.click();
    }

    public boolean checkLogo() {
        return yourLogo.isDisplayed();
    }

    public boolean checkElementPopular() {
        return popularTab.isDisplayed();
    }

    public boolean checkElementBestSellers() {
        return bestSellersTab.isDisplayed();
    }

    public boolean checkSliderContener() {
        return sliderContener.isDisplayed();
    }

//    public Object goToLoginPage() {
//        return LoginPage;
//    }

    public boolean isSignInButtonIsVisible() {
        return signIn.isDisplayed();
    }

    public void goToSignInButton() {
        signIn.click();
    }
}
