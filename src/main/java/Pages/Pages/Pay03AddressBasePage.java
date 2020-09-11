package Pages.Pages;

import Pages.Config.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Pay03AddressBasePage extends BasePage {


    @FindBy(xpath = "//*[@id=\"center_column\"]/form/p/button/span")
    WebElement proceedToCheckoutBtn;

    public Pay03AddressBasePage(WebDriver driver) {
        super(driver);
    }

    public void setProceedToCheckoutBtn() {
        proceedToCheckoutBtn.click();
    }
}