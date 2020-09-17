package Pages.Pages;

import Pages.Config.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DressesCatSummerBasePage extends BasePage {

    public DressesCatSummerBasePage(WebDriver driver) {
        super(driver);
    }


    @FindBy(xpath = "//*[@id=\"center_column\"]/ul/li[2]/div/div[2]")
    WebElement selectSecondDress;

    @FindBy(xpath = "//*[@id=\"center_column\"]/ul/li[2]/div/div[2]/div[2]/a[1]/span")
    WebElement addToCart_secondDress;

    @FindBy(xpath = "//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/a/span")
    WebElement proceedToCheckoutOnPopup;



    public DressesCatSummerBasePage setSecondDress() {
        selectSecondDress.click();
        return this;
    }

    public DressesCatSummerBasePage setSecondDressAddToCart() {
        addToCart_secondDress.click();
        return this;
    }

    public DressesCatSummerBasePage setProceedToCheckoutOnPopup() {
        proceedToCheckoutOnPopup.click();
        return this;
    }
}




