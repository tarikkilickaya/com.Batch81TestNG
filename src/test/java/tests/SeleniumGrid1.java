package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;
import utilities.ConfigReader;


import java.net.MalformedURLException;
import java.net.URL;

public class SeleniumGrid1 {


    WebDriver driver;

    @Test
    public void test1() throws InterruptedException, MalformedURLException {
        driver = new RemoteWebDriver(new URL("http://192.168.1.38:4444"), new ChromeOptions());
        driver.manage().window().maximize();
        driver.get(ConfigReader.getProperty("blueRentalCarsUrl"));
        Thread.sleep(3000);
        String customerService = driver.findElement(By.xpath("//*[text()='Customer Services']")).getText();
        System.out.println(customerService);
        Thread.sleep(3000);
        System.out.println("Current Thread : " + Thread.currentThread());
        System.out.println("Blue Rental Title : " + driver.getTitle());
        driver.quit();

    }
}