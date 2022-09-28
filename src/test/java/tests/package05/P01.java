package tests.package05;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import utilities.TestBaseBeforeClassAfterClass;


public class P01 extends TestBaseBeforeClassAfterClass {
    @Test
    public void test01() {
        // ...Exercise3...
        // go to url : https://www.techlistic.com/p/selenium-practice-form.html
        driver.get("https://www.techlistic.com/p/selenium-practice-form.html");
        //fill the firstname
        driver.findElement(By.xpath("//*[@name='firstname']")).sendKeys("Tarık");
        //fill the lastname
        driver.findElement(By.xpath("//*[@name='lastname']")).sendKeys("KILIÇKAYA");
        //check the gender
        driver.findElement(By.xpath("//*[@id='sex-0']")).click();
        //check the experience
        driver.findElement(By.xpath("//*[@id='exp-0']")).click();
        //fill the date
        driver.findElement(By.xpath("//*[@id='datepicker']")).sendKeys("28.09.2022");
        //choose your profession -> Automation Tester
        driver.findElement(By.xpath("//*[@id='profession-1']")).click();
        //choose your tool -> Selenium Webdriver
        driver.findElement(By.xpath("//*[@id='tool-2']")).click();
        //choose your continent -> Antartica
        WebElement dropDownContinent = driver.findElement(By.xpath("//*[@id='continents']"));
        dropDownContinent.click();
        Select select = new Select(dropDownContinent);
        select.selectByVisibleText("Antartica");
        //choose your command  -> Browser Commands
        driver.findElement(By.xpath("//*[@id='selenium_commands']/option[1]")).click();
        //click submit button
        driver.findElement(By.xpath("//*[@id='submit']")).click();
    }
}