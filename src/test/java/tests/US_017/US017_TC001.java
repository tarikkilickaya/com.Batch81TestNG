package tests.US_017;


import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
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
        obje.username.sendKeys("trkklckya@gmail.com");
        Thread.sleep(3000);
        obje.password.sendKeys("tarik123");
        obje.signIn2.click();
        //  Kullanıcı sepete ürün/ürünler ekler
        wait.until(ExpectedConditions.elementToBeSelected(obje.shopNow));
        //jse.executeScript("arguments[0].scrollIntoView(true);", obje.shopNow);
        jse.executeScript("arguments[0].click();", obje.shopNow);
        // c4PearlyMarketPage.shopNow.click();
        Thread.sleep(5000);
        actions.moveToElement(obje.yastik);
        obje.yastikAddToCart.click();
        //  jse.executeScript("arguments[0].scrollIntoView(true);", c4PearlyMarketPage.atToCardButton);
        //  jse.executeScript("arguments[0].click();", c4PearlyMarketPage.atToCardButton);

        obje.CardButton.click();
        obje.CheckOutButton.click();

        //  Kullanıcı Billing Address bilgilerini doğru girer
        obje.firstName.sendKeys("Cuneyt");
        actions.sendKeys(Keys.TAB).sendKeys("Erdemir").sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys("United States").sendKeys(Keys.TAB).
                sendKeys("41. Street").sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys("Dolapdere").sendKeys(Keys.TAB).sendKeys("Massachusetts").
                sendKeys(Keys.TAB).sendKeys("38400").sendKeys(Keys.TAB).sendKeys("1234567").perform();
        // Shipping Address seçeneğini tıklamadan sipariş verir

        obje.placeOrderbttn.click();
        // Alışverişin tamamlandığı bilgisi görüntülenir
        Assert.assertTrue(obje.orderReceived.isDisplayed());


    }

}