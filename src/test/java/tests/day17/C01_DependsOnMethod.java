package tests.day17;

import org.testng.annotations.Test;
import utilities.TestBaseBeforeClassAfterClass;

public class C01_DependsOnMethod extends TestBaseBeforeClassAfterClass {
    @Test
    public void test01() {
        driver.get("https://amazon.com");
    }

    @Test(dependsOnMethods = "test01")
    public void test02() {
        driver.get("https://facebook.com");
    }

    @Test(dependsOnMethods = "test02")
    public void test03() {
        driver.get("https://bestbuy.com");
    }

    @Test (priority = -1)
    public void test04() {
        driver.get("https://youtube.com");
    }
}