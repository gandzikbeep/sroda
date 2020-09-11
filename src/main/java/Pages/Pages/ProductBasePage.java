package Pages.Pages;

import Pages.Config.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class ProductBasePage extends BasePage {


    @FindBy(xpath = "//div[contains(@id,'image-block')]")
    WebElement bigImg;

    @FindBy(xpath = "//*[@title='Close']")
    WebElement closeBtnOnPopup;

    @FindBy(xpath = "//*[@id=\"our_price_display\"]")
    WebElement priceForOneProduct;



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

//    @FindAll({
//           @FindBy(xpath = "//ul[@id=\"color_to_pick_list\"]")
//    })
//            public List<WebElement> allColors;

    @FindBy(xpath = "//ul[@id=\"color_to_pick_list\"]")
    WebElement colors;

    @FindBy(xpath = "//*[@id=\"color_11\"]")
    WebElement blackColor;

    @FindBy(xpath = "//*[@id = 'quantity_wanted']")
    WebElement qtyField;

    public ProductBasePage(WebDriver driver) {
        super(driver);
    }

    public String getQtyFromQtyField() {
        return qtyField.getText();
    }

//    public void selectCol(String color){
//        allColors.toString();
//    }

//    String currentColor = colors.getText();
//
//    public String getColorName(String color) {
//        return currentColor = getColorName(currentColor);
//    }


    public void selectBlackColor(String color) {
        blackColor.click();
    }



    public String setProductTitle() {
        return productTitle.getText().toLowerCase();
    }

    public void setProductPhoto()  {
        bigImg.click();
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

    public boolean addToCartIsVisible() {
        return addToCart.isDisplayed();
    }


}

