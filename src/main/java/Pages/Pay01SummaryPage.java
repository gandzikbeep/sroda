package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pay01SummaryPage {
    WebDriver driver;

    public Pay01SummaryPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[@id='center_column']/p[2]/a[1]/span")
    WebElement proceedToCheckoutBtn;

    public void setProceedToCheckoutBtn() {
        proceedToCheckoutBtn.click();
    }
}