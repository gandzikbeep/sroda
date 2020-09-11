package Pages.Pages;

import Pages.Config.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WelcomeBasePage extends BasePage {




    @FindBy(xpath = "//*[contains(text(),'Welcome to your account. Here you can manage all of your personal information and orders.')]")
    WebElement welcomeText;

    @FindBy(xpath = "//*[@id=\"header\"]/div[2]//a")
    WebElement loggedUser;

    @FindBy(xpath = "//*[@class='logout']")
    WebElement logoutButton;

    @FindBy(xpath = "//*[@id=\"block_top_menu\"]/ul/li[1]/a")
    WebElement womenTab;

    @FindBy(xpath = "//*[@id=\"contact-link\"]/a")
    WebElement contactUs;

    String getOderHistoryUrl = "http://automationpractice.com/index.php?controller=history";
    String getCreditSlipsUrl = "http://automationpractice.com/index.php?controller=order-slip";
    String getMyAddressUrl = "http://automationpractice.com/index.php?controller=addresses";
    String getMyPersonalInfoUrl = "http://automationpractice.com/index.php?controller=identity";
    String getMyWishlistUrl = "http://automationpractice.com/index.php?fc=module&module=blockwishlist&controller=mywishlist";

    public WelcomeBasePage(WebDriver driver) {
        super(driver);
    }

    public void getContactUs() {
        contactUs.click();
    }

    public String getWelcomeTxt() {
        return welcomeText.getText();
    }

    public boolean isLoggedUserIsVisibleSection() {
        return loggedUser.isDisplayed();
    }

    public boolean isLogoutButtonVisible() {
        return logoutButton.isDisplayed();
    }

    public void setLogout() {
        logoutButton.click();
    }

    public void goToWomenTab() {
        womenTab.click();
    }

    public void navigateWelcomePageToOrderHistory() {
        driver.navigate().to(getOderHistoryUrl);  //order history
    }

    public void navigateWelcomePageToMyCreditSlips() {
        driver.navigate().to(getCreditSlipsUrl);
    }

    public void navigateWelcomePageToMyAddress() {
        driver.navigate().to(getMyAddressUrl);
    }

    public void navigateWelcomePageToMyPersonalInfo() {
        driver.navigate().to(getMyPersonalInfoUrl);
    }

    public void navigateWelcomePageToMyWishlist() {
        driver.navigate().to(getMyWishlistUrl);
    }
}