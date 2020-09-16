package Pages.Pages;

import Pages.Config.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Pay05PaymentBankWireCompleteBasePage extends BasePage {


    @FindBy(xpath = "//*[@id=\"center_column\"]/div/p")
    WebElement completeOrderSection;

    public Pay05PaymentBankWireCompleteBasePage(WebDriver driver) {
        super(driver);
    }

    public boolean isVisibleCompleteOrderSection() {
        return completeOrderSection.isDisplayed();
    }
}