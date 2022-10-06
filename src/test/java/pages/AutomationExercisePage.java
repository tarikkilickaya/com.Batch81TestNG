package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class AutomationExercisePage {
    public AutomationExercisePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//*[@href='/products']")
    public WebElement urunlerButonu;

    @FindBy(xpath = "//*[@class='title text-center']")
    public WebElement tumUrunlerYazisi;

    @FindBy(xpath = "//*[@id='search_product']")
    public WebElement aramaKutusu;

    @FindBy(xpath = "//*[@id='submit_search']")
    public WebElement buyutec;

    @FindBy(xpath = "//*[@class='title text-center']")
    public WebElement arananUrunler;

    @FindBy(linkText = "View Product")
    public WebElement viewProduct;

    @FindBy(xpath = "(//h2)[3]")
    public WebElement urunIsmi;

    @FindBy(xpath = "//*[@class='product-image-wrapper']")
    public List<WebElement> urunlerList;

}