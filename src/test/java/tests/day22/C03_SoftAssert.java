package tests.day22;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import utilities.TestBaseBeforeAfter;
import utilities.TestBaseBeforeClassAfterClass;
import utilities.TestBaseCross;

public class C03_SoftAssert extends TestBaseCross {
    @Test
    public void test01() {
        /*
        SoftAssert başlangıç ve bitiş satırları arasındaki tüm assertionları yapıp
        bitiş olarak belirtmemiz gereken assertAll() methoduyla test methodumuzdaki bütün assertionları kontrol eder.
        Failed olan olursa assertion yaptığımız methodun sonuna yazdığımız mesajı konsolda verir.
         */
        SoftAssert softAssert = new SoftAssert();
        //1-amazon anasayfaya gidin
        driver.get("https://amazon.com");
        //2-title in Amazon içerdigini test edin
        softAssert.assertTrue(driver.getTitle().contains("Amazon"), "Girdiğiniz kelimeyi içermiyor");
        //3-arama kutusunun erişilebilir oldugunu test edin
        WebElement aramaKutusu = driver.findElement(By.id("twotabsearchtextbox"));
        softAssert.assertTrue(aramaKutusu.isEnabled(), "Web elementi erişilemez");
        //4-arama kutusuna Nutella yazıp aratın
        aramaKutusu.sendKeys("Nutella", Keys.ENTER);
        //5-arama yapıldıgını test edin
        WebElement aramaSonucu = driver.findElement(By.xpath("//*[@class='a-section a-spacing-small a-spacing-top-small']"));
        softAssert.assertTrue(aramaSonucu.isDisplayed(), "Sonuç web elementi görüntülenemiyor");
        //6-arama sonucunun Nutella içerdigini test edin
        softAssert.assertTrue(aramaSonucu.getText().contains("Nutella"), "Nutella içermiyor");
        softAssert.assertAll();
        System.out.println("Hata varsa burası çalışmaz");
    }
}