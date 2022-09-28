package utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Driver {

    static WebDriver driver;

    public static WebDriver getDriver() {


        /*
Testleri calistirdigimizda her seferinde yeni driver olusturdugu icin her test methodu icin yeni
bir pencere (driver) aciyor.Eger driver'a bir deger atanmamissa yani driver==null ise
bir kere driver'i calistir diyerek bir kere if icini calistiracak ve driver artik bir kere
 calistigi icin ve deger atandigi icin null olmayacak ve direk return edecek ve diger testlerimiz
 ayni pencerede (driver) uzerinde calisacak

 */

        /*
        Testlerimizi çalıştırdığımızda her seferinde yeni driver oluşturduğu için her test methodu için yeni bir
        pencere açıyor. Eğer driver'a bir değer atanmamışsa driver'ı bir kere çalıştır diyerek bir kere if içini çalıştıracak.
        Driver bir
         */

        if (driver == null) {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        }
        return driver;
    }

    public static void closeDriver() {
        if (driver != null) {
            driver.close();
            driver = null;
        }
    }

    public static void quitDriver() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }
}