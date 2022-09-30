package tests.day19;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HotelMyCampPage;
import utilities.ConfigReader;
import utilities.Driver;

public class C02_HotelMyCampNegativeLoginTest {
    @Test
    public void negativeTest() {

        //https://www.hotelmycamp.com/ adresine git
        Driver.getDriver().get(ConfigReader.getProperty("hotelMyCampUrl"));

        //login butonuna bas
        HotelMyCampPage hotelMyCampObje = new HotelMyCampPage();
        hotelMyCampObje.loginButonu.click();

        //test data username: manager1 ,
        //test data password : manager1!
        hotelMyCampObje.userName.sendKeys(ConfigReader.getProperty("hotelMyCampWrongUserName"));
        Driver.actions.sendKeys(Keys.TAB).sendKeys(ConfigReader.getProperty("hotelMyCampWrongPassword")).sendKeys(Keys.ENTER).perform();

        //Degerleri girildiginde sayfaya girilemedigini test et
        Assert.assertTrue(hotelMyCampObje.girisYapilamadi.isDisplayed());

        Driver.quitDriver();
    }
}