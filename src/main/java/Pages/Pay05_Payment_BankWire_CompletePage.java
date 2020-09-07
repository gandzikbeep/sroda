package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.awt.*;

public class Pay05_Payment_BankWire_CompletePage {
    //    public Label amountPrice;
    WebDriver driver;

    public Pay05_Payment_BankWire_CompletePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }


    @FindBy(xpath = "//*[@id=\"center_column\"]/div/p")
            //"//*[@id=\"center_column\"]/div/span")
    WebElement completeOrderSection;   ////*[@id="center_column"]/div/p/strong
    ////*[@id="center_column"]/div/p

    @FindBy(xpath = "//*[@id=\"center_column\"]/p/a")
    WebElement backToOrdersBtn;

    @FindBy(xpath = "//*[@id=\"amount\"]")
    WebElement amountPrice;

    public boolean isVisibleCompleteOrderSection() {
        return completeOrderSection.isDisplayed();
    }

    public void setBackToOrdersBtn() {
        backToOrdersBtn.click();
    }

//    public void checkAmount() {
//        amountPrice.getText();
//    }
}






