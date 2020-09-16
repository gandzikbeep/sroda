package Pages.Pages;

import Pages.Config.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomeBasePage extends BasePage {

    @FindBy(xpath = "//*[@id=\"header_logo\"]/a/img")
    WebElement yourLogo;

    @FindBy(xpath = "//*[@title = 'Log in to your customer account']")
    WebElement signIn;

    @FindBy(xpath = "//*[@id=\"home-page-tabs\"]/li[1]/a")
    WebElement popularTab;

    @FindBy(xpath = "//*[@id=\"home-page-tabs\"]/li[2]/a")
    WebElement bestSellersTab;

    @FindBy(xpath = "//*[@id=\"slider_row\"]")
    WebElement sliderContainer;

    @FindBy(xpath = "//*[@id='search_query_top']")
    WebElement searchBox;

    @FindBy(xpath = "//*[@id=\"searchbox\"]/button")
    WebElement searchBoxFind;

    public HomeBasePage(WebDriver driver) {
        super(driver);
           }

    public void setSignInButton() {
        signIn.click();
    }

    public void searchProductSearchBox(String searchItem) {
        searchBox.sendKeys(searchItem);
        searchBoxFind.click();
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

    public boolean checkSliderContainer() {
        return sliderContainer.isDisplayed();
    }

    public boolean isSignInButtonIsVisible() {
        return signIn.isDisplayed();
    }


}

