package Pages.Config;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {

    public WebDriver driver;
    public final int timeOut = 10;

    public BasePage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }
    protected void waitForElementToBeVisible(WebElement webElement){
        WebDriverWait wait = new WebDriverWait(this.driver, timeOut);
        wait.until(ExpectedConditions.visibilityOf(webElement));
    }
    protected void waitForElementToBeClickable(WebElement webElement){
        WebDriverWait wait = new WebDriverWait(this.driver, timeOut);
        wait.until(ExpectedConditions.elementToBeClickable(webElement));
    }

    protected void click(WebElement webElement) {
        webElement.click();
    }

}
