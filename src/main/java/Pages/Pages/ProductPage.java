package Pages.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.internal.WebElementToJsonConverter;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class ProductPage {
    WebDriver driver;

    public ProductPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//div[contains(@id,'image-block')]")
    WebElement bigImg;

    @FindBy(xpath = "//*[@title='Close']")
    WebElement closeBtnOnPopup;

    @FindBy(xpath = "//*[@id=\"our_price_display\"]")
    WebElement priceForOneProduct;

    @FindBy(xpath = "//*[@id = 'quantity_wanted']")
    WebElement qtyField;
    @FindBy(xpath = "//*[@class='icon-minus']")
    WebElement minusQty;

    @FindBy(xpath = "//*[@class='icon-plus']")
    WebElement plusQty;

    @FindBy(xpath = "//*[@class='form-control attribute_select no-print']")
    WebElement drpSize;

    @FindBy(xpath = "//*[@id='color_to_pick_list']")
    WebElement setColor;

    @FindBy(xpath = "//*[@name='Submit']")
    WebElement addToCart;

    @FindBy(xpath = "//*[@title ='Add to my wishlist']")
    WebElement addToWishlist;

    @FindBy(xpath = " //*[@id=\"center_column\"]/div/div/div[3]/h1")
    WebElement productTitle;


    @FindBy(xpath = "//*[@title='Proceed to checkout']")
    WebElement proceedToCheckoutBtn;

    @FindBy(xpath = "//*[@id=\"color_to_pick_list\"]")
    WebElement colors;

    @FindBy(xpath = "//*[@id=\"color_11\"]")
    WebElement blackColor;

    public void getColorName(String color) {
        colors.getText();
    }

    public void selectBlackColor(String color){
        blackColor.click();
    }


    public String getQtyFromQtyField() {
        return qtyField.getText();
    }

    public String setProductTitle() {
        return productTitle.getText().toLowerCase();
    }

    public void setProductPhoto() throws InterruptedException {
        bigImg.click();
        Thread.sleep(2000);
        closeBtnOnPopup.click();
    }


    public void checkPriceForOneProduct() {
        priceForOneProduct.getText();
    }

    public void changeQtyOfProducts() {
        qtyField.clear();
        qtyField.sendKeys();
    }

    public void subtractionQty() {
        minusQty.click();
    }

    public void additionQty() {
        plusQty.click();
    }

    public void setSize(String size) {
        Select select = new Select(drpSize);
        select.selectByValue(size);
    }


    public void setAddToCart() {
        addToCart.click();
        proceedToCheckoutBtn.click();

    }
    public boolean addToCartIsVisible(){
        return addToCart.isDisplayed();
    }


}

