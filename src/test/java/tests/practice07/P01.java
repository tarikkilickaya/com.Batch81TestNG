package tests.practice07;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.WebUniversityPage;
import utilities.Driver;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class P01 {

    WebUniversityPage webUniversityObje = new WebUniversityPage();

    Actions actions = new Actions(Driver.getDriver());

    @Test
    public void test01() throws InterruptedException {
        // http://webdriveruniversity.com/To-Do-List/index.html adresine gidin
        Driver.getDriver().get("http://webdriveruniversity.com/To-Do-List/index.html");

        // Todos ekle: (Kahvaltıyı hazırla, Bulaşıkları yıka, Bebekle ilgilen, Çocuğunun ödevine yardım et, Selenyum çalış, Uyu)
        List<String> workList = new ArrayList<>(Arrays.asList("Kahvaltıyı hazırla", "Bulaşıkları yıka", "Bebekle ilgilen",
                "Çocuğunun ödevine yardım et", "Selenyum çalış", "Uyu"));

        for (String each : workList) {
            actions.click(webUniversityObje.addNewTodo).sendKeys(each, Keys.ENTER).perform();
        }

        // Tüm yapılacakların üzerini çiz.
        for (WebElement each : webUniversityObje.todos) {
            actions.click(each).perform();
        }

        // Tüm yapılacakları sil.
        for (WebElement each : webUniversityObje.silButonu) {
            actions.click(each).perform();
        }

        // Tüm yapılacakların silindiğini doğrulayın.
        //Assert.assertTrue(webUniversityObje.todos.isEmpty());
        //Driver.quitDriver();

    }

    //EXPLORATORY testing demek kesif testing demek yani sayfayi manuel olarak tanima testidir
}