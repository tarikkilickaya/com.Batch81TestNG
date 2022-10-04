package tests.day20;

import com.github.javafaker.Faker;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HotelMyCampPage;
import utilities.ConfigReader;
import utilities.Driver;

public class C03_E2ETest {

    public static Faker faker = new Faker();

    @Test
    public void e2eTest() throws InterruptedException {

        //3. https://www.hotelmycamp.com adresine git.
        Driver.getDriver().get(ConfigReader.getProperty("hotelMyCampUrl"));

        //4. Username textbox ve password metin kutularını locate edin ve asagidaki verileri
        //a. Username : manager
        //b. Password : Manager1!
        HotelMyCampPage hotelMyCampObje = new HotelMyCampPage();
        hotelMyCampObje.login.click();
        hotelMyCampObje.userName.sendKeys(ConfigReader.getProperty("hotelMyCampUserName"));
        Driver.actions.sendKeys(Keys.TAB).sendKeys(ConfigReader.getProperty("hotelMyCampPassword")).perform();

        //5. Login butonuna tıklayın.
        hotelMyCampObje.login2.click();

        //6. Hotel Management/Room Reservation menusunden ADD ROOM RESERVATION butonuna tiklayin
        hotelMyCampObje.hotelManagement.click();
        hotelMyCampObje.roomResevervation.click();
        hotelMyCampObje.addRoomReservation.click();

        //7. Açılan sayfadaki tüm metin kutularına istediğiniz verileri girin.
        hotelMyCampObje.idUser.sendKeys("manager");
        Driver.actions.sendKeys(Keys.TAB, "Happy Hotel").sendKeys(Keys.TAB, "15000").
                sendKeys(Keys.TAB, "10/12/2022").sendKeys(Keys.TAB, Keys.TAB, "10/13/2022").
                sendKeys(Keys.TAB, Keys.TAB, "2").sendKeys(Keys.TAB, "2").
                sendKeys(Keys.TAB).sendKeys(faker.name().fullName()).sendKeys(Keys.TAB).
                sendKeys(faker.phoneNumber().cellPhone()).sendKeys(Keys.TAB).
                sendKeys(faker.internet().emailAddress()).sendKeys(Keys.TAB, "bu bir nottur").
                sendKeys(Keys.TAB, Keys.SPACE, Keys.TAB, Keys.SPACE).perform();
        //8. Save butonuna tıklayın.
        hotelMyCampObje.saveButonu.click();
        //9. “RoomReservation was inserted successfully” textinin göründüğünü test edin.
        Thread.sleep(1000);
        Assert.assertTrue(hotelMyCampObje.roomReservationText.isDisplayed());
        //10. OK butonuna tıklayın.
        hotelMyCampObje.okButonu.click();

        Driver.quitDriver();
    }
}