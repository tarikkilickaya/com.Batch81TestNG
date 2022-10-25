package tests.US_017;


import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import pages.C4PearlyMarketPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.time.Duration;

public class US017_TC001 {
    JavascriptExecutor jse = (JavascriptExecutor) Driver.getDriver();
    C4PearlyMarketPage obje = new C4PearlyMarketPage();

    Actions actions = new Actions(Driver.getDriver());

    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(15));


    @Test
    public void US017_TC001() throws InterruptedException {

        // Kullanıcı https://pearlymarket.com/ sitesine gider
        Driver.getDriver().get(ConfigReader.getProperty("pearlyUrl"));
        obje.signIn.click();
        ReusableMethods.waitForVisibility(obje.username, 15);
        obje.username.sendKeys("bunedirya@gmail.com");
        obje.password.sendKeys("Muzaffer");
        obje.signIn2.click();

        //  Kullanıcı sepete ürün/ürünler ekler
        Thread.sleep(5000);
        jse.executeScript("arguments[0].scrollIntoView(true);", obje.shopNow);
        jse.executeScript("arguments[0].scrollIntoView(true);", obje.shopNow);
        wait.until(ExpectedConditions.elementToBeClickable(obje.shopNow));
        jse.executeScript("arguments[0].click();", obje.shopNow);
        obje.yastik.click();
        wait.until(ExpectedConditions.visibilityOf(obje.yastikAddToCart));
        obje.yastikAddToCart.click();
        obje.cardButton.click();
        obje.checkOutButton.click();


        //  Kullanıcı Billing Address bilgilerini doğru girer
        Select select = new Select(obje.countryDropDown);
        obje.firstName.sendKeys("Cuneyt");
        obje.lastName.sendKeys("Erdemir");
        obje.countryDropDown.click();
        select.selectByVisibleText("United States (US)");
        obje.streetAddress.sendKeys("41. cadde");
        obje.townCity.sendKeys("Dolapdere");
        select = new Select(obje.stateDropDown);
        obje.stateDropDown.click();
        select.selectByVisibleText("Massachusetts");
        obje.zipcode.sendKeys("38400");
        obje.phone.sendKeys("123456789");

        // Shipping Address seçeneğini tıklamadan sipariş verir
        //obje.placeOrderbttn.click();

        // Alışverişin tamamlandığı bilgisi görüntülenir
        //Assert.assertTrue(obje.orderReceived.isDisplayed());

    }
}