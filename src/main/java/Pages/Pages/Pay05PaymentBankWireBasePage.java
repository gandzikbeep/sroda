package Pages.Pages;

import Pages.Config.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Pay05PaymentBankWireBasePage extends BasePage {


    @FindBy(xpath = "//*[@id=\"cart_navigation\"]/button/span")
    WebElement confirmBtn;

    public Pay05PaymentBankWireBasePage(WebDriver driver) {
        super(driver);
    }

    public void setConfirmBtn() {
        confirmBtn.click();
    }
}






