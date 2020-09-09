package Pages.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pay04ShippingPage {
    WebDriver driver;

    public Pay04ShippingPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[@id=\"cgv\"]")
    WebElement checkboxIAgree;

    @FindBy(xpath = "//*[@id=\"form\"]/p/button/span")
    WebElement proceedToCheckoutBtn;

    public void setCheckboxIAgree() {
        checkboxIAgree.click();
    }

    public void setProceedToCheckoutBtn() {
        proceedToCheckoutBtn.click();
    }
}