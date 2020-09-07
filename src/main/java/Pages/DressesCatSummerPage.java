package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.awt.*;

public class DressesCatSummerPage {    // DO USUNIĘCIA
    public Label priceSecondDress;
    WebDriver driver;

    public DressesCatSummerPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[@id=\"center_column\"]/ul/li[2]/div/div[2]")
    WebElement selectSecondDress;
    ////*[@id="center_column"]/ul/li[2]/div/div[2]/div[2]/a[1]/span

    @FindBy(xpath = "//*[@id=\"center_column\"]/ul/li[2]/div/div[2]/div[2]/a[1]/span")
    WebElement addToCart_secondDress;
    //                 //*[@id="center_column"]/ul/li[2]/div/div[2]/div[2]/a[1]/span
                      ////*[@id="center_column"]/ul/li[2]/div/div[2]/div[2]/a[1]/span

    @FindBy(xpath = "//*[@id=\"layer_cart\"]/div[1]")
    WebElement popup_successAddtoCart;

    @FindBy(xpath = "//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/a/span")
    WebElement proceedTocheckoutOnPopup;

//    @FindBy(xpath = "//*[@id=\"center_column\"]/ul/li[2]/div/div[2]/div[1]/span")
//    WebElement priceSecondDress;

    public void setSecondDress() {
        selectSecondDress.click();
    }

    public void setSecondDressAddToChart() {

        addToCart_secondDress.click();
    }

    public void setProceedTocheckoutOnPopup() {

        proceedTocheckoutOnPopup.click();
    }

//    public void setPriceSecondDress() {
//        priceSecondDress.getText();
//    }


}




