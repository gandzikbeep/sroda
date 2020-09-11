package Pages.Pages;

import Pages.Config.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Pay04ShippingBasePage extends BasePage {


    @FindBy(xpath = "//*[@id=\"cgv\"]")
    WebElement checkboxIAgree;

    @FindBy(xpath = "//*[@id=\"form\"]/p/button/span")
    WebElement proceedToCheckoutBtn;

    public Pay04ShippingBasePage(WebDriver driver) {
        super(driver);
    }

    public void setCheckboxIAgree() {
        checkboxIAgree.click();
    }

    public void setProceedToCheckoutBtn() {
        proceedToCheckoutBtn.click();
    }
}