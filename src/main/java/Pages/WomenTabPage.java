package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WomenTabPage {
    WebDriver driver;

    public WomenTabPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[@id=\"subcategories\"]/ul/li[2]/div[1]/a/img")
    WebElement dressesSubCat;

//    @FindBy(xpath = "//*[@id=\"block_top_menu\"]/ul/li[1]/a")
//    WebElement womenTab;      //jeszcze nie uzyte

    @FindBy(xpath = "//*[@id=\"center_column\"]/ul/li[1]/div/div[2]/div[2]/a[1]/span")
    WebElement addToCartBtn_FirstDress;

    @FindBy(xpath = "//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/a/span/text()")
    WebElement proceedToCheckoutBtn;

    public void setDressesSubCat() {
        dressesSubCat.click();
    }
    public void setAddToCartBtn_FirstDress() {
        addToCartBtn_FirstDress.click();
    }

    public void setProceedToCheckoutBtn() {
        proceedToCheckoutBtn.click();
    }

}




