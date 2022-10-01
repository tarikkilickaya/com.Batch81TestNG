package tests.day20;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HotelMyCampPage;
import utilities.ConfigReader;
import utilities.Driver;

public class C01_SmokePozitifTest {
    @Test
    public void pozitifTest() {
        //https://www.hotelmycamp.com/ adresine git
        Driver.getDriver().get(ConfigReader.getProperty("hotelMyCampUrl"));

        //login butonuna bas
        HotelMyCampPage hotelMyCampPage = new HotelMyCampPage();
        hotelMyCampPage.login.click();

        //test data username: manager
        //test data password : Manager1!
        hotelMyCampPage.userName.sendKeys(ConfigReader.getProperty("hotelMyCampUserName"));
        Driver.actions.sendKeys(Keys.TAB).sendKeys(ConfigReader.getProperty("hotelMyCampPassword"), Keys.ENTER).perform();

        //Degerleri girildiginde sayfaya basarili sekilde girilebildigini test et
        Assert.assertTrue(hotelMyCampPage.girisYapildi.isDisplayed());

        Driver.quitDriver();
    }
}