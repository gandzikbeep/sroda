package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    private DataFakerPage faker = new DataFakerPage();

    @FindBy(xpath = "//*[@id='email']")
    WebElement emailInput;

    @FindBy(id = "passwd")
    WebElement passwordInput;

    @FindBy(xpath = "//*[@id=\"email_create\"]")
    WebElement emailCreateInput;

    @FindBy(xpath = "//*[@id=\"SubmitCreate\"]")
    WebElement submitCreateBtn;

    @FindBy(id = "SubmitLogin")
    WebElement setSignInButton;

    //nowa metoda create an account
    public void createAnAccount(String correctUsername2) {
        emailCreateInput.sendKeys(faker.getFakeEmail());
        submitCreateBtn.click();
    }

    // nowa metoda logIn
    public void logIn(String correctUsername, String correctPassword) {
        emailInput.sendKeys(correctUsername);
        passwordInput.sendKeys(correctPassword);
        setSignInButton.click();
    }

    public boolean IsSignInButtonIsVisibleOnLoginPage() {
        setSignInButton.isDisplayed();
        return true;
    }

}
