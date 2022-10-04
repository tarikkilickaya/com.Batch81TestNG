package tests.day16;

import org.testng.annotations.Test;
import utilities.TestBaseBeforeClassAfterClass;

public class C03_Priority extends TestBaseBeforeClassAfterClass {
    @Test (priority = 1)
    public void youtubeTest() {
        driver.get("https://www.youtube.com");
    }

    @Test (priority = 3)
    public void bestbuyTest() {
        driver.get("https://www.bestbuy.com");
    }

    @Test (priority = 2)
    public void amazonTest() {
        driver.get("https://www.amazon.com");
    }

    @Test (priority = -1, groups = "grup1")
    public void hepsiburadaTest() {
        driver.get("https://www.hepsiburada.com");
    }
}