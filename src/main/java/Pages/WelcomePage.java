package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WelcomePage {
    WebDriver driver;

    public WelcomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[contains(text(),'Welcome to your account. Here you can manage all of your personal information and orders.')]")
    WebElement welcomeText;


    @FindBy(xpath = "//*[@id=\"header\"]/div[2]//a")
    WebElement loggedUser;

    @FindBy(xpath = "//a[@href='http://automationpractice.com/index.php?mylogout=']")   //(xpath = "//*[@id=\"header\"]/div[2]/div/div/nav/div[2]/a")
    WebElement logoutButton;


    public String getWelcomeTxt() {
        return welcomeText.getText();
    }

    //czy jest widoczna sekcja z imieniem usera
    public boolean getLoggedUser() {
        return loggedUser.isDisplayed();
    }

    //czy jest button Logout?:
    public boolean isLogoutButtonVisible() {
        return logoutButton.isDisplayed();
    }

    public void setLogout(){
        logoutButton.click();

    }

}
