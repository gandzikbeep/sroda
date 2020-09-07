package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.awt.*;

public class Pay05PaymentBankWireCompletePage {

    WebDriver driver;

    public Pay05PaymentBankWireCompletePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }


    @FindBy(xpath = "//*[@id=\"center_column\"]/div/p")
    WebElement completeOrderSection;

    @FindBy(xpath = "//*[@id=\"center_column\"]/p/a")
    WebElement backToOrdersBtn;

    public boolean isVisibleCompleteOrderSection() {
        return completeOrderSection.isDisplayed();
    }

    public void setBackToOrdersBtn() {
        backToOrdersBtn.click();
    }
}






