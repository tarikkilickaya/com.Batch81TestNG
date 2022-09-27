package tests.day16;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilites.TestBaseBeforeClassAfterClass;

public class C04_DependsOnMethod extends TestBaseBeforeClassAfterClass {
    @Test
    public void test1() {
        // amazon ana sayfasına gidin
        driver.get("https://Wamazon1.com");
    }

    @Test(dependsOnMethods = "test1")
    public void test2() {
        // nutella aratın
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("nuttela" + Keys.ENTER);
    }

    @Test (dependsOnMethods = "test2")
    public void test3() {
        // sonuç yazısının amazon içerdiğini test edin
        WebElement sonuc = driver.findElement(By.xpath("//*[@class='a-section a-spacing-small a-spacing-top-small']"));
        Assert.assertFalse(sonuc.getText().contains("amazon"));
    }
}