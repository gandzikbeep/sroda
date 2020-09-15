package Pages.Config;

import Pages.Pages.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.openqa.selenium.support.pagefactory.ElementLocatorFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage  {

    protected WebDriver driver;
    private WebDriverWait wait;
    public final int timeOut = 10;

    public BasePage(WebDriver driver){
        this.driver = driver;
        wait = new WebDriverWait(driver, timeOut);
       // waitForElementToBeVisible();
        PageFactory.initElements(new AjaxElementLocatorFactory(driver, 5), this);
            }
//    public BasePage(WebDriver driver){
//        this.driver = driver;
//        PageFactory.initElements(driver,this);

//    public BasePage(WebDriver driver) {
////        super();
//        if(driver == null)
//            throw new IllegalArgumentException("Driver object is null");


    protected void click(WebElement webElement) {
        webElement.click();
    }
    protected void waitForElementToBeVisible(WebElement webElement){
        //WebDriverWait wait = new WebDriverWait(this.driver, timeOut);
        wait.until(ExpectedConditions.visibilityOf(webElement));
    }



//    protected void waitForElementToBeClickable(WebElement webElement){
//        WebDriverWait wait = new WebDriverWait(this.driver, timeOut);
//        wait.until(ExpectedConditions.elementToBeClickable(webElement));
//    }


}
