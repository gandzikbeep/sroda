package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;


public class CreateAccountFormPage {
    private DataFakerPage faker = new DataFakerPage();

    WebDriver driver;

    public CreateAccountFormPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "id_gender1")
    WebElement rdbGenderMale;

    @FindBy(id = "id_gender2")
    WebElement rdbGenderFemale;

    @FindBy(id = "customer_firstname")
    WebElement firstName;

    @FindBy(id = "customer_lastname")
    WebElement lastName;

    @FindBy(id = "email")
    WebElement emailInput;

    @FindBy(id = "passwd")
    WebElement createPassword;

    @FindBy(id = "days")                        //dropdowny
    WebElement drpDateOfBirthDays;

    @FindBy(id = "months")
    WebElement drpDateOfBirthMonths;

    @FindBy(id = "years")
    WebElement drpDateOfBirthYears;

    @FindBy(id = "uniform-newsletter")             //checkboxy x 2
    WebElement checkboxNews;

    @FindBy(id = "optin")
    WebElement checkBoxSpecialOffers;

    @FindBy(id = "address1")
    WebElement address1;

    @FindBy(id = "address2")
    WebElement address2;

    @FindBy(id = "city")
    WebElement city;

    @FindBy(id = "id_state")
    WebElement drpState;

    @FindBy(id = "postcode")
    WebElement zipCode;

    @FindBy(id = "id_country")   ///drpCountry
    WebElement drpCountry;

    @FindBy(id = "other")
    WebElement addInfo;

    @FindBy(id = "phone")
    WebElement homePhone;

    @FindBy(id = "phone_mobile")
    WebElement mobilePhone;

    @FindBy(id = "alias")
    WebElement alias;

    @FindBy(id = "submitAccount")
    WebElement btnSubmitAccount;

    public void setGender(boolean isMale) {
        if (isMale) {
            rdbGenderMale.click();
        } else {
            rdbGenderFemale.click();
        }
    }

    public void enterFirstName(String correctFirstName) {
        firstName.sendKeys(correctFirstName);
    }

    public void enterLastName(String correctLastName) {
        lastName.sendKeys(correctLastName);
    }

    public void enterEmailLogin(String correctEmail) {
        emailInput.click();
    }

    public void setPassword(String correctPassword) {
        createPassword.sendKeys(faker.getFakePassword());
    }

    public void setDayOfBirth(String correctDay) {
        Select daysSelect = new Select(drpDateOfBirthDays);
        daysSelect.selectByValue(correctDay);
    }

    public void setMonthOfBirth(String correctMonth) {
        Select monthSelect = new Select(drpDateOfBirthMonths);
        monthSelect.selectByValue(correctMonth);
    }

    public void setYearOfBirth(String correctYear) {      //dropdown
        Select yearSelect = new Select(drpDateOfBirthYears);
        yearSelect.selectByValue(correctYear);
    }

    public void setCheckCheckboxNews() {
        checkboxNews.click();
    }

    public void setCheckCheckboxSpecialOffers() {
        checkBoxSpecialOffers.click();
    }

    public void setAddressLine1(String addressLine1) {
        address1.sendKeys(addressLine1);
    }

    public void setAddressLine2(String addressLine2) {
        address2.sendKeys(addressLine2);
    }

    public void setCity(String cityName) {
        city.sendKeys(cityName);
    }

    public void setState(String state) {
        Select stateSelect = new Select(drpState);
        stateSelect.selectByValue(state);
    }

    public void setCountry(String country) {
        Select countrySelect = new Select(drpCountry);
        countrySelect.selectByValue(country);
    }

    public void setZipCode(String zipCode1) {
        zipCode.sendKeys(zipCode1);
    }

    public void setAddInfo(String addInfo1) {
        addInfo.sendKeys(addInfo1);
    }

    public void setHomePhone(String homePhone1) {
        homePhone.sendKeys(homePhone1);
    }

    public void setMobilePhone(String mobilePhone1) {
        mobilePhone.sendKeys(mobilePhone1);
    }

    public void setAlias(String alias1) {
        alias.clear();
        alias.sendKeys(alias1);
    }

    public void setBtnSubmitAccount() {
        btnSubmitAccount.click();
    }
}

