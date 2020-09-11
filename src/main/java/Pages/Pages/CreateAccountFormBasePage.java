package Pages.Pages;

import Pages.Config.BasePage;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;


public class CreateAccountFormBasePage extends BasePage {

    WebDriver driver;



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

    @FindBy(id = "days")
    WebElement drpDateOfBirthDays;

    @FindBy(id = "months")
    WebElement drpDateOfBirthMonths;

    @FindBy(id = "years")
    WebElement drpDateOfBirthYears;

    @FindBy(id = "uniform-newsletter")
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

    @FindBy(id = "id_country")
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

    public CreateAccountFormBasePage(WebDriver driver) {
        super(driver);
    }


    public void setGender(boolean isMale) {
        if (isMale) {
            rdbGenderMale.click();
        } else {
            rdbGenderFemale.click();
        }
    }

    public void createAnAccountFillForm(String correctDay, String correctMonth, String correctYear, String firstName,
                                        String lastName, String password, String correctAddress1, String correctAddress2,
                                        String city, String state, String country, String zipcode, String addInfo,
                                        String homePhone, String mobilePhone, String alias) {
       // JavascriptExecutor js = (JavascriptExecutor) driver;

        this.firstName.sendKeys(firstName);
        this.lastName.sendKeys(lastName);
        emailInput.click();
        createPassword.sendKeys(password);
       // js.executeScript(("window.scrollBy(0,200)"));
        Select daysSelect = new Select(drpDateOfBirthDays);
        daysSelect.selectByValue(correctDay);
        Select monthSelect = new Select(drpDateOfBirthMonths);
        monthSelect.selectByValue(correctMonth);
        Select yearSelect = new Select(drpDateOfBirthYears);
        yearSelect.selectByValue(correctYear);
       // js.executeScript(("window.scrollBy(0,300)"));
        checkboxNews.click();
        checkBoxSpecialOffers.click();
        address1.sendKeys(correctAddress1);
        address2.sendKeys(correctAddress2);
        this.city.sendKeys(city);
        Select stateSelect = new Select(drpState);
        stateSelect.selectByValue(state);
        Select countrySelect = new Select(drpCountry);
        countrySelect.selectByValue(country);
        zipCode.sendKeys(zipcode);
        this.addInfo.sendKeys(addInfo);
        this.homePhone.sendKeys(homePhone);
        this.mobilePhone.sendKeys(mobilePhone);
        this.alias.clear();
        this.alias.sendKeys(alias);
        btnSubmitAccount.click();
    }
}


