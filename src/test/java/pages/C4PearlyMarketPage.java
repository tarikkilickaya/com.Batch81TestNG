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
    @FindBy(xpath ="(//*[@href='?add-to-cart=13861'])[1]")
    public WebElement atToCardButton;

    @FindBy(xpath ="//*[@data-id='fbb1175']")
    public WebElement CardButton;

    @FindBy(xpath="//*[@class='button checkout wc-forward']")
    public WebElement CheckOutButton;

    @FindBy(xpath = "//*[@id='billing_first_name']")
    public WebElement firstName;

    @FindBy(xpath = "//*[@id='place_order']")
    public WebElement placeOrderbttn;

    @FindBy(xpath = "//*[text()='Thank you. Your order has been received.']")
    public WebElement orderReceived;
    @FindBy(xpath = "//*[@href='?add-to-cart=15242']")
    public WebElement yastikAddToCart;

    @FindBy(xpath = "(//*[@href='/shop/'])[2]")
    public WebElement shopNow;

    @FindBy(xpath = "(//*[@src='https://pearlymarket.com/wp-content/uploads/2022/10/yastik-kilifi-1-300x300.jpg'])[1]")
    public WebElement yastik;


}