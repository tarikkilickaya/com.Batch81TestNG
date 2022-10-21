package pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class C4PearlyMarketPage {
    public C4PearlyMarketPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//*[text()='Sign In']")
    public WebElement signIn;

    @FindBy(xpath = "(//*[@id='username'])[1]")
    public WebElement username;

    @FindBy(xpath = "//*[@id='password']")
    public WebElement password;

    @FindBy(xpath = "//*[@value='Sign In']")
    public WebElement signIn2;

    @FindBy(xpath = "(//*[@href='/shop/'])[2]")
    public WebElement shopNow;

    @FindBy(xpath = "(//*[text()='Shop Now'])[2]")
    public WebElement shopNow2;

    @FindBy(xpath = "(//*[text()='Shop Now'])[2]")
    public WebElement shopNow3;


    @FindBy(xpath = "(//*[text()='Add to cart'])[1]")
    public WebElement addToCartButton;

    @FindBy(xpath = "(//*[@class='w-icon-cart'])[1]")
    public WebElement cardButton;

    @FindBy(xpath = "(//*[@href='https://pearlymarket.com/urun/black-winter-skating/'])[1]")
    public WebElement urun;

    @FindBy(xpath = "//*[@class='button checkout wc-forward']")
    public WebElement checkOutButton;

    @FindBy(xpath = "//*[@id='billing_first_name']")
    public WebElement firstName;


    @FindBy(xpath = "//*[@id='billing_last_name']")
    public WebElement lastName;

    @FindBy(xpath = "//*[@id='select2-billing_country-container']")
    public WebElement countryDropDown;

    @FindBy(xpath = "//*[@id='billing_address_1']")
    public WebElement streetAddress;

    @FindBy(xpath = "//*[@id='billing_city']")
    public WebElement townCity;

    @FindBy(xpath = "//*[@id='select2-billing_state-container']")
    public WebElement stateDropDown;

    @FindBy(xpath = "//*[@id='billing_postcode']")
    public WebElement zipcode;

    @FindBy(xpath = "//*[@id='billing_phone']")
    public WebElement phone;














    @FindBy(xpath = "//*[@id='place_order']")
    public WebElement placeOrderbttn;

    @FindBy(xpath = "//*[text()='Thank you. Your order has been received.']")
    public WebElement orderReceived;

    @FindBy(xpath = "//*[text()='Add to cart']")
    public WebElement yastikAddToCart;


    @FindBy(xpath = "(//*[@class='woocommerce-LoopProduct-link woocommerce-loop-product__link'])[2]")
    public WebElement yastik;


}