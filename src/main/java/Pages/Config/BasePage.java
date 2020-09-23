package Pages.Config;

import Pages.Pages.*;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BasePage  {

    protected WebDriver driver;
    public final int timeOut = 10;

    public BasePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(new AjaxElementLocatorFactory(driver, 5), this);

    }

    protected void click(WebElement webElement) {
        webElement.click();
    }

    protected void waitForElementToBeVisible(WebElement webElement) {
        WebDriverWait wait = new WebDriverWait(this.driver, timeOut);
        wait.until(ExpectedConditions.visibilityOf(webElement));
    }
    public void waitForElement(By locator) {
        FluentWait<WebDriver> wait = new FluentWait<>(driver);
        wait.pollingEvery(Duration.ofMillis(500));
        wait.withTimeout(Duration.ofSeconds(10L));
        wait.ignoring(NoSuchElementException.class);
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }



}
