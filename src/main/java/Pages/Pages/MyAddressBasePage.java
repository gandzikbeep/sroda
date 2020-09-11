package Pages.Pages;

import Pages.Config.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyAddressBasePage extends BasePage {

    @FindBy(xpath = "//*[@id=\"center_column\"]/div[1]/div/div/ul/li[2]/span[1]")
    WebElement firstName;

    @FindBy(xpath = "//*[@id=\"center_column\"]/div[1]/div/div/ul/li[2]/span[2]")
    WebElement lastName;

    @FindBy(xpath = "//*[@id=\"center_column\"]/div[1]/div/div/ul/li[5]/span[1]")
    WebElement city;

    @FindBy(xpath = "//*[@id=\"center_column\"]/div[1]/div/div/ul/li[5]/span[3]")
    WebElement zipCode;

    @FindBy(xpath = "//*[@id=\"center_column\"]/div[1]/div/div/ul/li[9]/a[1]/span")
    WebElement updateBtn;

    @FindBy(xpath = "//*[@id=\"center_column\"]/p")
    WebElement textConfigure;

    public MyAddressBasePage(WebDriver driver) {
        super(driver);
    }

    public String getTextFromFirstName() {
        return firstName.getText();
    }

    public String getTextFromLastName() {
        return lastName.getText();
    }

    public String checkWelcomeText() {
        return textConfigure.getText();
    }

    public String setCity() {
        return city.getText();
    }

    public String setZipCode() {
        return zipCode.getText();
    }

    public void setUpdateBtn() {
        updateBtn.click();
    }

}




