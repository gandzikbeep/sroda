package Pages.Pages;

import Pages.Config.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class MyAddressUpdateBasePage extends BasePage {


    @FindBy(xpath = "//*[@id=\"firstname\"]")
    WebElement firstName;

    @FindBy(xpath = "//*[@id=\"lastname\"]")
    WebElement lastName;

    @FindBy(xpath = "//*[@id=\"company\"]")
    WebElement company;

    @FindBy(xpath = "//*[@id=\"address1\"]")
    WebElement address1;

    @FindBy(xpath = "//*[@id=\"address2\"]")
    WebElement address2;

    @FindBy(xpath = "//*[@id=\"city\"]")
    WebElement city;

    @FindBy(xpath = "//*[@id=\"id_state\"]")
    WebElement state;

    @FindBy(xpath = "//*[@id=\"postcode\"]")
    WebElement zipCode;

    @FindBy(xpath = "//*[@id=\"id_country\"]")
    WebElement country;

    @FindBy(xpath = "//*[@id=\"phone\"]")
    WebElement homePhone;

    @FindBy(xpath = "//*[@id=\"phone_mobile\"]")
    WebElement mobilePhone;

    @FindBy(xpath = "//*[@id=\"other\"]")
    WebElement addInfo;

    @FindBy(xpath = "//*[@id=\"alias\"]")
    WebElement alias;

    @FindBy(xpath = "//*[@id=\"submitAddress\"]/span")
    WebElement saveBtn;

    @FindBy(xpath = "//*[@id=\"center_column\"]/ul/li/a/span")
    WebElement backBtn;

    public MyAddressUpdateBasePage(WebDriver driver) {
        super(driver);
    }

    public void fillAllForm(String newFirstName, String newLastName, String newCompany, String newAddress1, String newAddress2,
                            String newCity, String newState, String newZipCode, String newCountry, String newHomePhone,
                            String newMobilePhone, String newAddInfo, String newAlias) {
        firstName.clear();
        firstName.sendKeys(newFirstName);
        lastName.clear();
        lastName.sendKeys(newLastName);
        company.clear();
        company.sendKeys(newCompany);
        address1.clear();
        address1.sendKeys(newAddress1);
        address2.clear();
        address2.sendKeys(newAddress2);
        city.clear();
        city.sendKeys(newCity);
        Select drpState = new Select(state);
        drpState.selectByValue(newState);
        zipCode.clear();
        zipCode.sendKeys(newZipCode);
        Select drpCountry = new Select(country);
        drpCountry.selectByVisibleText(newCountry);
        homePhone.clear();
        homePhone.sendKeys(newHomePhone);
        mobilePhone.clear();
        mobilePhone.sendKeys(newMobilePhone);
        addInfo.clear();
        addInfo.sendKeys(newAddInfo);
        alias.clear();
        alias.sendKeys(newAlias);
    }

    public void setSaveBtn() {
        saveBtn.click();
    }

    public void setBackBtn() {
        backBtn.click();
    }
}








