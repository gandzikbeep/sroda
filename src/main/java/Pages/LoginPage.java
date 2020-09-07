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

    private DataFakerPage faker = new DataFakerPage();

    @FindBy(xpath = "//*[@id='email']")       //"//*[@id='email']")
    WebElement emailInput;

    @FindBy(id = "passwd")
    WebElement passwordInput;

    @FindBy(id = "SubmitLogin")
    WebElement signInButton;

    @FindBy(xpath = "//*[@id=\"email_create\"]")
    WebElement emailCreateInput;

    @FindBy(xpath = "//*[@id=\"SubmitCreate\"]")
    WebElement submitCreateBtn;

    @FindBy(id = "SubmitLogin")  //     //  "//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a"
    WebElement setSignInButton;



   //nowa metoda create an account
    public void createAnAccount(String correctusername2){
        emailCreateInput.sendKeys(faker.getFakeEmail());
        submitCreateBtn.click();
            }
    // nowa metoda logIn
    public void logIn(String correctUsername, String correctPassword){
        emailInput.sendKeys(correctUsername);
        passwordInput.sendKeys(correctPassword);
        setSignInButton.click();
    }
// do usuniecia pojedyncze metody
//    public void setEmailCreateInput(String correctUsername2) {
//        emailCreateInput.sendKeys(faker.getFakeEmail());
//    }

    public void setEmailLogin(String emailLogin) {
        emailInput.sendKeys(emailLogin);
    }

    public void setPassword(String password) {
        passwordInput.sendKeys(password);
    }

    public void clickLoginBtn() {   ////zmiana!!!!!
        signInButton.click();
    }

    public void goToCreateAccountFormPage() {
        submitCreateBtn.click();
    }

    public boolean IsSignInButtonIsVisibleOnLoginPage() {
        setSignInButton.isDisplayed();
        return true;
    }




}
