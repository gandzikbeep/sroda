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

    @FindBy(xpath = "//*[@id=\"block_top_menu\"]/ul/li[1]/a")
    WebElement womenTab;

    @FindBy(xpath = "//*[@id=\"contact-link\"]/a")
    WebElement contactUs;

    public void getContactUs(){
        contactUs.click();
    }


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

    public void setLogout() {
        logoutButton.click();
    }

    public void goToWomenTab() {
        womenTab.click();
    }

    String getWelcomePageUrl = "http://automationpractice.com/index.php?controller=my-account";
    String getOderHistoryUrl = "http://automationpractice.com/index.php?controller=history";
    String getCreditSlipsUrl = "http://automationpractice.com/index.php?controller=order-slip";
    String getMyAddressUrl = "http://automationpractice.com/index.php?controller=addresses";
    String getMyPersonalInfoUrl = "http://automationpractice.com/index.php?controller=identity";
    String getMyWishlistUrl = "http://automationpractice.com/index.php?fc=module&module=blockwishlist&controller=mywishlist";

    public void navigateWelcomePageToOrderHistory() {
        driver.navigate().to(getWelcomePageUrl);
        driver.navigate().to(getOderHistoryUrl);  //order history
    }

    public void navigateWelcomePageToMyCreditSlips() {
        driver.navigate().to(getWelcomePageUrl);  //my account
        driver.navigate().to(getCreditSlipsUrl);
    }

    public void navigateWelcomePageToMyAddress() {
        driver.navigate().to(getWelcomePageUrl);
        driver.navigate().to(getMyAddressUrl);
    }

    public void navigateWelcomePageToMyPersonalInfo() {
        driver.navigate().to(getWelcomePageUrl);
        driver.navigate().to(getMyPersonalInfoUrl);
    }

    public void navigateWelcomePageToMyWishlist() {
        driver.navigate().to(getWelcomePageUrl);
        driver.navigate().to(getMyWishlistUrl);
    }
}

