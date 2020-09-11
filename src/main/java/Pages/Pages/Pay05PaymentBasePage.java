package Pages.Pages;

import Pages.Config.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Pay05PaymentBasePage extends BasePage {

    @FindBy(xpath = "//*[@id=\"HOOK_PAYMENT\"]/div[1]/div/p/a")
    WebElement payByBankWire;

    public Pay05PaymentBasePage(WebDriver driver) {
        super(driver);
    }

//    @FindBy(xpath = "//*[@id=\"HOOK_PAYMENT\"]/div[2]/div/p/a")
//    WebElement payByCheck;

    public void setPayByBankWire() {
        payByBankWire.click();
    }

//    public void setPayByCheck() {
//        payByCheck.click();
//    }
}




