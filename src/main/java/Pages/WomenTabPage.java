package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WomenTabPage {
    WebDriver driver;

    public WomenTabPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[@id=\"subcategories\"]/ul/li[2]/div[1]/a/img")
    WebElement dressesSubCat;

//    @FindBy(xpath = "//*[@id=\"subcategories\"]/ul/li[1]/div[1]/a/img")
//    WebElement topsSubCat;

    public void setDressesSubCat() {
        dressesSubCat.click();
    }

//    public void setTopsSubCat(){
//        topsSubCat.click();
//    }
}
