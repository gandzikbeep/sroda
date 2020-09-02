package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Dresses_Cat {
    WebDriver driver;

    public Dresses_Cat(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[@id=\"subcategories\"]/ul/li[1]/div[1]/a/img")
    WebElement casualDresses;

    @FindBy(xpath = "//*[@id=\"subcategories\"]/ul/li[2]/div[1]/a/img")
    WebElement eveningDresses;

    @FindBy(xpath = "//*[@id=\"subcategories\"]/ul/li[3]/div[1]/a/img")
    WebElement summerDresses;

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




