package Pages.Pages;

import Pages.Config.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class ProductBasePage extends BasePage {


    @FindBy(xpath = "//div[contains(@id,'image-block')]")
    WebElement bigImg;

    @FindBy(xpath = "//*[@title='Close']")
    WebElement closeBtnOnPopup;

    @FindBy(xpath = "//*[@class='icon-plus']")
    WebElement plusQty;

    @FindBy(xpath = "//*[@class='form-control attribute_select no-print']")
    WebElement drpSize;

    @FindBy(xpath = "//*[@name='Submit']")
    WebElement addToCart;

    @FindBy(xpath = " //*[@id=\"center_column\"]/div/div/div[3]/h1")
    WebElement productTitle;

    public ProductBasePage(WebDriver driver) {
        super(driver);
    }


    public String setProductTitle() {
        return productTitle.getText().toLowerCase();
    }

    public void setProductPhoto() {
        bigImg.click();
        closeBtnOnPopup.click();
    }

    public void additionQty() {
        plusQty.click();
    }

    public void setSize(String size) {
        Select select = new Select(drpSize);
        select.selectByValue(size);
    }

    public boolean addToCartIsVisible() {
        return addToCart.isDisplayed();
    }

}

