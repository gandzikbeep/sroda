package Pages.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyAddressPage {
    WebDriver driver;

    public MyAddressPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

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




