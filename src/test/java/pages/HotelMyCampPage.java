package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class HotelMyCampPage {

    public HotelMyCampPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//*[text()='Log in']")
    public WebElement login;

    @FindBy(xpath = "//*[@id='btnSubmit']")
    public WebElement login2;

    @FindBy(xpath = "//*[@id='UserName']")
    public WebElement userName;

    @FindBy(xpath = "//*[@id='Password']")
    public WebElement password;

    @FindBy(xpath = "//*[@class='username username-hide-on-mobile']")
    public WebElement girisYapildi;

    @FindBy(xpath = "//*[@id='divMessageResult']")
    public WebElement girisYapilamadi;

    @FindBy(xpath = "//*[text()='Hotel Management']")
    public WebElement hotelManagement;

    @FindBy(xpath = "//*[@href='/admin/RoomReservationAdmin']")
    public WebElement roomResevervation;

    @FindBy(xpath = "//*[text()='Add Room Reservation ']")
    public WebElement addRoomReservation;

    @FindBy(xpath = "//*[@id='IDUser']")
    public WebElement idUser;

    @FindBy(xpath = "//*[@id='IDHotelRoom']")
    public WebElement idHotelRoom;

    @FindBy(xpath = "//*[@id='btnSubmit']")
    public WebElement saveButonu;

    @FindBy(xpath = "//*[@class='bootbox-body']")
    public WebElement roomReservationText;

    @FindBy(xpath = "//*[@class='btn btn-primary']")
    public WebElement okButonu;

}