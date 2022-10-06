package tests.day23;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.BlueRentalCarsPage;
import utilities.ConfigReader;
import utilities.Driver;

public class C02_DataProvider {

    BlueRentalCarsPage blueRentalCarsObje = new BlueRentalCarsPage();

    @DataProvider
    public static Object[][] kullanicilar() {
        return new Object[][]{{"tarik@gmail.com", "12345"}, {"kilic@gmail.com", "45678"}, {"kaya@gmail.com", "98765"}};
    }


    @Test(dataProvider = "kullanicilar")
    public void test01(String email, String password) {
        //https://www.bluerentalcars.com/ adresine git
        Driver.getDriver().get(ConfigReader.getProperty("blueRentalCarsUrl"));
        //login butonuna bas
        blueRentalCarsObje.login.click();
        //Data provider ile 3 farklı userEmail ve 3 farklı password girelim
        blueRentalCarsObje.emailAdres.sendKeys(email);
        blueRentalCarsObje.password.sendKeys(password);
        //login butonuna tiklayin
        blueRentalCarsObje.login2.click();
        //Degerleri girildiginde sayfaya basarili sekilde girilemedigini test et
        Assert.assertTrue(blueRentalCarsObje.login2.isDisplayed());
    }
}