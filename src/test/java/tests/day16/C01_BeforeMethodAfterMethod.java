package tests.day16;

import org.testng.annotations.Test;
import utilites.TestBaseBeforeAfter;

public class C01_BeforeMethodAfterMethod extends TestBaseBeforeAfter {
    @Test
    public void amazonTesti() {
        driver.get("https://www.amazon.com");
    }

    @Test
    public void bestbuyTesti() {
        driver.get("https://www.bestbuy.com");
    }

    @Test
    public void techpro() {
        driver.get("https://www.techproeducation.com");
    }
}