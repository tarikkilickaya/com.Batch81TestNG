package tests.US_017;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import pages.C4PearlyMarketPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class AirFrayer {
    C4PearlyMarketPage obje = new C4PearlyMarketPage();
    JavascriptExecutor jse = (JavascriptExecutor) Driver.getDriver();

    Actions actions = new Actions(Driver.getDriver());

    @Test
    public void test01() throws InterruptedException {
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
        jse.executeScript("arguments[0].click();", obje.shopNow);


        jse.executeScript("arguments[0].scrollIntoView(true);", obje.airfrayer);
        Thread.sleep(2000);
        actions.moveToElement(obje.airfrayer).perform();
        ReusableMethods.waitForVisibility(obje.airfrayerAddToCart, 15);
        jse.executeScript("arguments[0].scrollIntoView(true);", obje.airfrayerAddToCart);
        jse.executeScript("arguments[0].click();", obje.airfrayerAddToCart);


    }
}