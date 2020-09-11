package Pages.Pages;

import Pages.Config.BasePage;
import Pages.utilty.DataFakerPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginBasePage extends BasePage {



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

    public LoginBasePage(WebDriver driver) {
        super(driver);
    }

    public void createAnAccount(String email) {
        emailCreateInput.sendKeys(faker.getFakeEmail());
        submitCreateBtn.click();
    }

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
