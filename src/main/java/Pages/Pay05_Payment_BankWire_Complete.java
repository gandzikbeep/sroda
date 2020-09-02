package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.awt.*;

public class Pay05_Payment_BankWire_Complete {
    //    public Label amountPrice;
    WebDriver driver;

    public Pay05_Payment_BankWire_Complete(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }


    @FindBy(xpath = "//*[@id=\"center_column\"]/div/p/strong")  //  //*[@id="center_column"]/div/span
    WebElement completeOrderSection;

    @FindBy(xpath = "//*[@id=\"center_column\"]/p/a")
    WebElement backToOrdersBtn;

    @FindBy(xpath = "//*[@id=\"center_column\"]/div/span")
    WebElement amountPrice;

    public boolean isVisibleCompleteOrderSection() {
        return completeOrderSection.isDisplayed();
    }

    public void setBackToOrdersBtn() {
        backToOrdersBtn.click();
    }

    public void checkAmount() {
        amountPrice.getText();
    }
}






