package Pages;

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
//     DODAC dla pozniejszych testow:
//     ADD A NEW ADDRESS
//     BACK BUTON
//     HOME BUTTON

    @FindBy(xpath = "//*[@id=\"center_column\"]/div[1]/div/div/ul/li[2]/span[1]")
    WebElement firstName;

    @FindBy(xpath = "//*[@id=\"center_column\"]/div[1]/div/div/ul/li[2]/span[2]")
    WebElement lastName;

    @FindBy(xpath = "//*[@id=\"center_column\"]/div[1]/div/div/ul/li[3]/span")
    WebElement company;

    @FindBy(xpath = "//*[@id=\"center_column\"]/div[1]/div/div/ul/li[4]/span[1]")
    WebElement address1;

    @FindBy(xpath = "//*[@id=\"center_column\"]/div[1]/div/div/ul/li[4]/span[2]")
    WebElement address2;

    @FindBy(xpath = "//*[@id=\"center_column\"]/div[1]/div/div/ul/li[5]/span[1]")
    WebElement city;

    @FindBy(xpath = "//*[@id=\"center_column\"]/div[1]/div/div/ul/li[5]/span[2]")
    WebElement state;

    @FindBy(xpath = "//*[@id=\"center_column\"]/div[1]/div/div/ul/li[5]/span[3]")
    WebElement zipCode;

    @FindBy(xpath = "//*[@id=\"center_column\"]/div[1]/div/div/ul/li[6]/span")
    WebElement country;

    @FindBy(xpath = "//*[@id=\"center_column\"]/div[1]/div/div/ul/li[7]/span")
    WebElement homePhone;

    @FindBy(xpath = "//*[@id=\"center_column\"]/div[1]/div/div/ul/li[8]/span")
    WebElement mobilePhone;

    @FindBy(xpath = "//*[@id=\"center_column\"]/div[1]/div/div/ul/li[9]/a[1]/span")
    WebElement updateBtn;

    @FindBy(xpath = "//*[@id=\"center_column\"]/div[1]/div/div/ul/li[9]/a[2]/span")
    WebElement deleteBtn;

    @FindBy(xpath = "//*[@id=\"center_column\"]/p")
    WebElement textConfigure;


    public String getTextFromFirstName() {
        return firstName.getText();
    }

    public String checkWelcomeText() {
        return textConfigure.getText();
    }

    public String setCity() {
        return city.getText();
    }
// void zamineic na string!!!!!

    public void setFirstName() {
        firstName.getText();
    }

    public void setCompany() {
        company.getText();
    }

    public void setAddress1() {
        address1.getText();
    }

    public void setAddress2() {
        address2.getText();
    }

    public void setState() {
        state.getText();
    }

    public String setZipCode() {
        return zipCode.getText();
    }

    public void setCountry() {
        country.getText();
    }

    public void setMobilePhone() {
        mobilePhone.getText();
    }

    public void setHomePhonePhone() {
        homePhone.getText();
    }

    public void setUpdateBtn() {
        updateBtn.click();
    }

    public void setDeleteBtn() {
        deleteBtn.click();
    }
}




