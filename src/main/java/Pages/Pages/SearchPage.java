package Pages.Pages;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SearchPage {
    WebDriver driver;

    public SearchPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[@class='selectProductSort form-control']")
    WebElement drpSortBy;

    @FindBy(xpath = "//*[@id=\"center_column\"]/div[1]/div[2]/div[2]")
    WebElement qtyItems;

    @FindBy(xpath = "//*[@id=\"center_column\"]/p")
    WebElement alertWarning;


    @FindBy(xpath = "//*[@id=\"center_column\"]/ul/li[1]/div/div[2]")
    WebElement firstProductOnWebsite;

    @FindBy(xpath = "//*[@id=\"center_column\"]/ul/li[1]/div/div[2]/div[2]/a[2]")
    WebElement moreBtn;



    public void setFirstProductOnWebsite(){
        firstProductOnWebsite.click();
        moreBtn.click();
           }



    public void setDrpSortBy(String valueSortOf) {
        Select sortBy = new Select(drpSortBy);
        sortBy.selectByValue(valueSortOf);
    }

    public String qtyItems() {
        return qtyItems.getText();
    }

    public boolean isQtyItemsIsVisible() {
        return qtyItems.isDisplayed();
    }

    public boolean isAlertMsgIsVisible() {
        return alertWarning.isDisplayed();
    }

    public String getTextFromAlert(String searchItem) {
        return alertWarning.getText();
    }


}