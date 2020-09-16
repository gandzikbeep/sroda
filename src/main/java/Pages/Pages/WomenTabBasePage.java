package Pages.Pages;

import Pages.Config.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WomenTabBasePage extends BasePage {


    @FindBy(xpath = "//*[@id=\"subcategories\"]/ul/li[2]/div[1]/a/img")
    WebElement dressesSubCat;

    public WomenTabBasePage(WebDriver driver) {
        super(driver);
    }

    public void setDressesSubCat() {
        dressesSubCat.click();
    }

}
