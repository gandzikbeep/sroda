package Pages.Pages;

import Pages.Config.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class SearchBasePage extends BasePage {


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

    public SearchBasePage(WebDriver driver) {
        super(driver);
    }


    public void setFirstProductOnWebsite()  {
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