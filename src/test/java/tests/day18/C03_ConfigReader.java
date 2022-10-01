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
        hotelMyCampPage.login.click();

        //test data username: manager
        //test data password : Manager1!
        hotelMyCampPage.userName.sendKeys(ConfigReader.getProperty("hotelMyCampUserName"));
        hotelMyCampPage.password.sendKeys(ConfigReader.getProperty("hotelMyCampPassword"));
        hotelMyCampPage.login2.click();

        //Driver.actions.sendKeys(Keys.TAB).sendKeys(ConfigReader.getProperty("hotelMyCampPassword"), Keys.ENTER).perform();

        //Degerleri girildiginde sayfaya basarili sekilde girilebildigini test et
        Assert.assertTrue(hotelMyCampPage.girisYapildi.isDisplayed());

        Driver.quitDriver();
    }
}