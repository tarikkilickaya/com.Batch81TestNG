package tests.day22;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.BlueRentalCarsPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseRapor;

public class C01_RaporluTest extends TestBaseRapor {

    BlueRentalCarsPage blueRentalCarsObje = new BlueRentalCarsPage();

    @Test
    public void test01() {
        extentTest = extentReports.createTest("Pozitif Test", "Geçerli kullanıcı adı ve şifre ile giriş yapıldı");

        //-https://www.bluerentalcars.com/ adresine git
        Driver.getDriver().get(ConfigReader.getProperty("blueRentalCarsUrl"));
        extentTest.info("Blue RentalCar sitesine gidildi");

        //-login butonuna bas
        blueRentalCarsObje.login.click();
        extentTest.info("Login butonuna basıldı");

        //-test data user email: customer@bluerentalcars.com ,
        //-test data password : 12345 dataları girip login e basın
        blueRentalCarsObje.emailAdres.sendKeys(ConfigReader.getProperty("blueRentalCarsEmail"));
        blueRentalCarsObje.password.sendKeys(ConfigReader.getProperty("blueRentalCarsPassword"));
        extentTest.info("Doğru email ve şifre girildi");

        //-login butonuna tiklayin
        blueRentalCarsObje.login2.click();
        extentTest.info("İkinci login butonuna basıldı");

        //-Degerleri girildiginde sayfaya basarili sekilde girilebildigini test et
        String expectedUserName = "John Walker";
        String actualUserName = blueRentalCarsObje.oturumAcildi.getText();
        Assert.assertEquals(expectedUserName, actualUserName);
        extentTest.pass("Sayfaya başarılı bir şekilde girildi");
    }
}