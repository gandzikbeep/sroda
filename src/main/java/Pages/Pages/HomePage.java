package Pages.Pages;

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
    WebElement signIn;

    @FindBy(xpath = "//*[@id=\"home-page-tabs\"]/li[1]/a")
    WebElement popularTab;

    @FindBy(xpath = "//*[@id=\"home-page-tabs\"]/li[2]/a")
    WebElement bestSellersTab;

    @FindBy(xpath = "//*[@id=\"slider_row\"]")
    WebElement sliderContainer;

    @FindBy(xpath = "//*[@id='search_query_top']")
            //       //*[@id='search_query_top']
    WebElement searchBox;

    @FindBy(xpath = "//*[@id=\"searchbox\"]/button")
    WebElement searchBoxFind;

    ////*[@id="search_query_top"]//*[@name='search_query']
          //*[@name='search_query']//*[@id='searchbox']

    // dobra   //*[@id="search_query_top"]

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

    public void setSignInButton() {
        signIn.click();
    }
}
