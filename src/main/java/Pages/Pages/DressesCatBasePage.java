package Pages.Pages;

import Pages.Config.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DressesCatBasePage extends BasePage {


    @FindBy(xpath = "//*[@id=\"subcategories\"]/ul/li[3]/div[1]/a/img")
    WebElement summerDresses;

    public DressesCatBasePage(WebDriver driver) {
        super(driver);
    }

    public void setSummerDresses() {
        summerDresses.click();
    }
}