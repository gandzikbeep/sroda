package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    WebDriver driver;

    // klasa sklada sie z 1. konstr, 2. metody  3. zmienne
    //konstruktor tworzy obiekt klasy
    public LoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[@id='email']")
    WebElement emailInput;

    @FindBy(id = "passwd")
    WebElement passwordInput;

    @FindBy(id = "SubmitLogin")
    WebElement signInButton;

    @FindBy(xpath = "//*[@id=\"email_create\"]")
    WebElement emailCreateInput;

    @FindBy(xpath = "//*[@id=\"SubmitCreate\"]")
    WebElement submitCreateBtn;

    public void setEmailCreateInput(String correctUsername2) {
        emailCreateInput.sendKeys(correctUsername2);
    }



    public void setEmailLogin(String emailLogin) {
        emailInput.sendKeys(emailLogin);
    }

    public void setPassword(String password) {
        passwordInput.sendKeys(password);
    }

    public void login() {
        signInButton.click();
    }

    public void goToCreateAccountFormPage() {submitCreateBtn.click();}

//    public void enterUsernameEmailCreate(String emailLogin) {
//        emailCreateInput.sendKeys(emailLogin);
//    }

    public void signIn() {
        submitCreateBtn.click();
    }



}
