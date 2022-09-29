package tests.day18;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HotelMyCampPage;
import utilities.ConfigReader;
import utilities.Driver;

public class C03_ConfigReader {
    @Test
    public void test01() {

        //https://www.hotelmycamp.com/ adresine git
        Driver.getDriver().get(ConfigReader.getProperty("hotelMyCampUrl"));

        //login butonuna bas
        HotelMyCampPage hotelMyCampPage = new HotelMyCampPage();
        hotelMyCampPage.loginButonu.click();

        //test data username: manager
        //test data password : Manager1!
        hotelMyCampPage.userName.sendKeys("manager");
        hotelMyCampPage.password.sendKeys("Manager1!", Keys.ENTER);

        //Degerleri girildiginde sayfaya basarili sekilde girilebildigini test et
        Assert.assertTrue(hotelMyCampPage.girisYapildi.isDisplayed());

        Driver.quitDriver();
    }
}