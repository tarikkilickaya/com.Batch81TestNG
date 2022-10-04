package tests.day21;

import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import pages.AmazonPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.io.IOException;

public class C01_ScreenShotReusableMethods {
    @Test
    public void test01() throws IOException {
        // Hepsiburada sayfasına gidiniz
        Driver.getDriver().get("https://hepsiburada.com");
        // Ve sayfanın resmini alınız
        ReusableMethods.getScreenshot("hepsiburada");
        // Sayfayı kapatınız
        Driver.quitDriver();
    }

    @Test
    public void test02() throws IOException {
        // Amazon sayfasına gidiniz
        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));
        // Nutella aratınız
        AmazonPage amazonObje = new AmazonPage();
        amazonObje.aramaKutusu.sendKeys("Nutella", Keys.ENTER);
        // Arama sonuç yazısı web elementinin resmini alınız
        ReusableMethods.getScreenshotWebElement("aramaSonucu", amazonObje.aramaKutusu);
        // Sayfayı kapatın
        Driver.quitDriver();
    }
}