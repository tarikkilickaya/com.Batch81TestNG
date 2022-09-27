package tests.day16;

import org.testng.annotations.Test;
import utilites.TestBaseBeforeClassAfterClass;

public class C02_BeforeClassAfterClass extends TestBaseBeforeClassAfterClass {
    @Test
    public void testAmazon() {
        driver.get("https://www.amazon.com");
    }

    @Test
    public void testBestBuy() {
        driver.get("https://www.bestbuy.com");
    }

    @Test
    public void testTechproed() {
        driver.get("https://www.techproeducation.com");
    }
}