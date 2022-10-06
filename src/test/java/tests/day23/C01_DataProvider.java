package tests.day23;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.AmazonPage;
import utilities.ConfigReader;
import utilities.Driver;

public class C01_DataProvider {


    @DataProvider
    public static Object[][] aranacakKelimeler() {
        return new Object[][]{{"java"}, {"selenium"}, {"samsung"}, {"iphone"}};
    }

    @Test(dataProvider = "aranacakKelimeler")
    public void test01(String kelimeler) {
        AmazonPage amazonObje = new AmazonPage();
        //amazona gidelim
        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));
        //java, selenium, samsung ve iphone icin arama yapalim
        amazonObje.aramaKutusu.sendKeys(kelimeler, Keys.ENTER);
        //sonuclarin aradigimiz kelime icerdigini test edelim
        String actualKelime = amazonObje.aramaSonucu.getText();
        Assert.assertTrue(actualKelime.contains(kelimeler));
        //sayfayi kapatalim

    }

    @Test(dependsOnMethods = "test01")
    public void test02() {
        Driver.closeDriver();
    }
}