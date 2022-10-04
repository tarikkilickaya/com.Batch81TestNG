package tests.day16;

import org.testng.annotations.Test;
import utilities.TestBaseBeforeAfter;

public class C01_BeforeMethodAfterMethod extends TestBaseBeforeAfter {
    @Test
    public void amazonTesti() {
        driver.get("https://www.amazon.com");
    }

    @Test (groups = "grup1")
    public void bestbuyTesti() {
        driver.get("https://www.bestbuy.com");
    }

    @Test
    public void techpro() {
        driver.get("https://www.techproeducation.com");
    }
}