package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

    public HomePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[@id=\"header_logo\"]/a/img")
    WebElement yourLogo;

    @FindBy(xpath = "//*[@class='login']")
    //(xpath = "//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a")
    WebElement signIn;

    @FindBy(xpath = "//*[@id=\"home-page-tabs\"]/li[1]/a")
    WebElement popularTab;

    @FindBy(xpath = "//*[@id=\"home-page-tabs\"]/li[2]/a")
    WebElement bestSellersTab;

    @FindBy(xpath = "//*[@id=\"slider_row\"]")
    WebElement sliderContainer;

    @FindBy(xpath = "//*[@id=\"search_query_top\"]")
    WebElement searchBox;

    @FindBy(xpath = "//*[@id=\"searchbox\"]/button")
    WebElement searchBoxFind;

    public void setSearchBox(String searchItem) {
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

    public void setSignInButton() {
        signIn.click();
    }
}
