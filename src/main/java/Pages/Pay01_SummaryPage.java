package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pay01_SummaryPage {
    WebDriver driver;

    public Pay01_SummaryPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath ="//*[@id='center_column']/p[2]/a[1]/span")
    WebElement proceedToCheckoutBtn;
    ////*[@id="layer_cart"]/div[1]/div[2]/div[4]/a/span
    ////*[@id="center_column"]/p[2]/a[1]
            // stara  "//*[@id=\"center_column\"]/p[2]/a[1]/span")

    public void setProceedToCheckoutBtn(){
        proceedToCheckoutBtn.click();
    }
}




