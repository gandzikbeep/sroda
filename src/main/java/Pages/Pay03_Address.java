package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pay03_Address {
    WebDriver driver;

    public Pay03_Address(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//*[@id=\"center_column\"]/form/p/button/span")
    WebElement proceedToCheckoutBtn;

    public void setProceedToCheckoutBtn(){
        proceedToCheckoutBtn.click();
    }

}




