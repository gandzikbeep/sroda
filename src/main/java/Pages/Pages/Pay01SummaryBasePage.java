package Pages.Pages;

import Pages.Config.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Pay01SummaryBasePage extends BasePage {


    @FindBy(xpath = "//*[@id='center_column']/p[2]/a[1]/span")
    WebElement proceedToCheckoutBtn;

    public Pay01SummaryBasePage(WebDriver driver) {
        super(driver);
    }

    public void setProceedToCheckoutBtn() {
        proceedToCheckoutBtn.click();
    }
}