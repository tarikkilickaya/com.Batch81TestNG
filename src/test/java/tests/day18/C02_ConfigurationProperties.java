package tests.day18;

import org.testng.annotations.Test;
import utilities.ConfigReader;
import utilities.Driver;

public class C02_ConfigurationProperties {
    @Test
    public void test01() {
        // Amazon sayfasına ve Facebook sayfasına gidiniz
        String amazon = ConfigReader.getProperty("amazonUrl");
        String facebook = ConfigReader.getProperty("facebookUrl");
        Driver.getDriver().get(amazon);
        Driver.getDriver().get(facebook);
        Driver.quitDriver();
    }
}