package Pages.Pages;

import Pages.Config.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DressesCatBasePage extends BasePage {


    @FindBy(xpath = "//*[@id=\"subcategories\"]/ul/li[1]/div[1]/a/img")
    WebElement casualDresses;

    @FindBy(xpath = "//*[@id=\"subcategories\"]/ul/li[2]/div[1]/a/img")
    WebElement eveningDresses;

    @FindBy(xpath = "//*[@id=\"subcategories\"]/ul/li[3]/div[1]/a/img")
    WebElement summerDresses;

    public DressesCatBasePage(WebDriver driver) {
        super(driver);
    }

    public void setCasualDresses() {
        casualDresses.click();
    }

    public void setEveningDresses() {
        eveningDresses.click();
    }

    public void setSummerDresses() {
        summerDresses.click();
    }
}