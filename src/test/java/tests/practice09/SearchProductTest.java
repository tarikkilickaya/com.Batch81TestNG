package tests.practice09;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AutomationExercisePage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseRapor;

import java.util.List;

public class SearchProductTest extends TestBaseRapor {

    AutomationExercisePage automationExerciseObje = new AutomationExercisePage();

    @Test
    public void searchProductPage() {
        extentTest = extentReports.createTest("Automationexercise", "Web automation");
        // 1. Tarayıcıyı başlat
        // 2. 'http://automationexercise.com' url'sine gidin
        extentTest.info("// 1. Tarayıcıyı başlat\n" +
                "        // 2. 'http://automationexercise.com' url'sine gidin");
        Driver.getDriver().get(ConfigReader.getProperty("automationExerciseUrl"));
        // 3. Ana sayfanın başarıyla görünür olduğunu doğrulayın
        String actualUrl = Driver.getDriver().getCurrentUrl();
        String expectedUrl = "https://automationexercise.com/";
        Assert.assertEquals(actualUrl, expectedUrl);
        extentTest.info("3. Ana sayfanın başarıyla görünür olduğunu doğrulayın");
        // 4. 'Ürünler' butonuna tıklayın
        automationExerciseObje.urunlerButonu.click();
        extentTest.info("'Ürünler' butonuna tıklayın");
        // 5. Kullanıcının TÜM ÜRÜNLER sayfasına başarıyla gittiğini doğrulayın
        Assert.assertTrue(automationExerciseObje.tumUrunlerYazisi.isDisplayed());
        // 6. Arama girişine ürün adını girin ve ara düğmesine tıklayın
        automationExerciseObje.aramaKutusu.sendKeys("blue");
        automationExerciseObje.buyutec.click();
        // 7. 'ARARAN ÜRÜNLER'in görünür olduğunu doğrulayın
        Assert.assertTrue(automationExerciseObje.arananUrunler.isDisplayed());
        List<WebElement> urunListesi = automationExerciseObje.urunlerList;
        for (WebElement each : urunListesi) {
            Assert.assertTrue(each.isDisplayed());
        }
        // 8. Aramayla ilgili ürünün ("blue top") görünür olduğunu doğrulayın
        extentTest.pass("Aramayla ilgili ürünün (\"blue top\") görünür olduğu doğrulandı");
        automationExerciseObje.viewProduct.click();
        Assert.assertTrue(automationExerciseObje.urunIsmi.isDisplayed());

        Driver.quitDriver();
    }
}