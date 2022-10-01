package tests.day20;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HotelMyCampPage;
import utilities.ConfigReader;
import utilities.Driver;

public class C02_SmokeNegatifTest {
    @Test(priority = 1)
    public void yanlisKullanici() {
        //https://www.hotelmycamp.com/ adresine git
        Driver.getDriver().get(ConfigReader.getProperty("hotelMyCampUrl"));

        //login butonuna bas
        HotelMyCampPage hotelMyCampObje = new HotelMyCampPage();
        hotelMyCampObje.login.click();

        //test data username: manager1 ,
        //test data password : manager1!
        hotelMyCampObje.userName.sendKeys(ConfigReader.getProperty("hotelMyCampWrongUserName"));
        Driver.actions.sendKeys(Keys.TAB).sendKeys(ConfigReader.getProperty("hotelMyCampPassword")).sendKeys(Keys.ENTER).perform();

        //Degerleri girildiginde sayfaya girilemedigini test et
        Assert.assertTrue(hotelMyCampObje.girisYapilamadi.isDisplayed());

        Driver.quitDriver();
    }

    @Test(priority = 2)
    public void yanlisSifre() {
        //https://www.hotelmycamp.com/ adresine git
        Driver.getDriver().get(ConfigReader.getProperty("hotelMyCampUrl"));

        //login butonuna bas
        HotelMyCampPage hotelMyCampObje = new HotelMyCampPage();
        hotelMyCampObje.login.click();

        //test data username: manager1 ,
        //test data password : manager1!
        hotelMyCampObje.userName.sendKeys(ConfigReader.getProperty("hotelMyCampUserName"));
        hotelMyCampObje.password.sendKeys(ConfigReader.getProperty("hotelMyCampWrongPassword"), Keys.ENTER);

        //Degerleri girildiginde sayfaya girilemedigini test et
        Assert.assertTrue(hotelMyCampObje.girisYapilamadi.isDisplayed());

        Driver.quitDriver();

    }

    @Test (priority = 3)
    public void yanlisKullaniciSifre() {
        //https://www.hotelmycamp.com/ adresine git
        Driver.getDriver().get(ConfigReader.getProperty("hotelMyCampUrl"));

        //login butonuna bas
        HotelMyCampPage hotelMyCampObje = new HotelMyCampPage();
        hotelMyCampObje.login.click();

        //test data username: manager1 ,
        //test data password : manager1!
        hotelMyCampObje.userName.sendKeys(ConfigReader.getProperty("hotelMyCampWrongUserName"));
        hotelMyCampObje.password.sendKeys(ConfigReader.getProperty("hotelMyCampWrongPassword"), Keys.ENTER);

        //Degerleri girildiginde sayfaya girilemedigini test et
        Assert.assertTrue(hotelMyCampObje.girisYapilamadi.isDisplayed());

        Driver.quitDriver();
    }
}