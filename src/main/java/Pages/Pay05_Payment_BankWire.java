package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pay05_Payment_BankWire {
    WebDriver driver;

    public Pay05_Payment_BankWire(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[@id=\"cart_navigation\"]/button/span")
    WebElement confirmBtn;

    public void setConfirmBtn() {
        confirmBtn.click();
    }

}






