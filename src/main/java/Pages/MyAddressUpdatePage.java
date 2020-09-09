package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class MyAddressUpdatePage {
    WebDriver driver;

    public MyAddressUpdatePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

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

//----------//zrobienie jednej metody z wielu//-------------------------------------------------------//
//    public void setFirstName(String newFirstName) {
//        firstName.clear();
//        firstName.sendKeys(newFirstName);
//    }
//
//    public void setLastName(String newLastName) {
//        lastName.clear();
//        lastName.sendKeys(newLastName);
//    }
//
//    public void setCompany(String newCompany) {
//        company.clear();
//        company.sendKeys(newCompany);
//    }
//
//    public void setAddress1(String newAddress1) {
//        address1.clear();
//        address1.sendKeys(newAddress1);
//    }
//
//    public void setAddress2(String newAddress2) {
//        address2.clear();
//        address2.sendKeys(newAddress2);
//    }
//
//    public void setCity(String newCity) {
//        city.clear();
//        city.sendKeys(newCity);
//    }
//
//
//    public void setState(String newState) {
//        Select drpState = new Select(state);
//        drpState.selectByValue(newState);
//    }
//
//    public void setZipCode(String newZipCode) {
//        zipCode.clear();
//        zipCode.sendKeys(newZipCode);
//    }
//
//    public void setCountry(String newCountry) {
//        Select drpCountry = new Select(country);
//        drpCountry.selectByVisibleText(newCountry);
//    }
//
//    public void setHomePhone(String newHomePhone) {
//        homePhone.clear();
//        homePhone.sendKeys(newHomePhone);
//    }
//
//    public void setMobilePhone(String newMobilePhone) {
//        mobilePhone.clear();
//        mobilePhone.sendKeys(newMobilePhone);
//    }
//
//    public void setAddInfo(String newAddInfo) {
//        addInfo.clear();
//        addInfo.sendKeys(newAddInfo);
//    }
//
//    public void setAlias(String newAlias) {
//        alias.clear();
//        alias.sendKeys(newAlias);
//    }







