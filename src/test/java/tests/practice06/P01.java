package tests.practice06;

import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import pages.DhtmlgoodiesPage;
import utilities.Driver;

public class P01 {


    @Test
    public void test01() {
        // Go to URL : http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html
        Driver.getDriver().get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");

        DhtmlgoodiesPage dhtmlgoodiesPage = new DhtmlgoodiesPage();
        Actions actions = new Actions(Driver.getDriver());

        // Fill in capitals by country.

        //actions.dragAndDrop(dhtmlgoodiesPage.oslo, dhtmlgoodiesPage.norway).perform();
        //actions.dragAndDrop(dhtmlgoodiesPage.stockholm, dhtmlgoodiesPage.sweden).perform();
        //actions.dragAndDrop(dhtmlgoodiesPage.washington, dhtmlgoodiesPage.unitedStates).perform();
        //actions.dragAndDrop(dhtmlgoodiesPage.copenhagen, dhtmlgoodiesPage.denmark).perform();
        //actions.dragAndDrop(dhtmlgoodiesPage.seoul, dhtmlgoodiesPage.southKorea).perform();
        //actions.dragAndDrop(dhtmlgoodiesPage.rome, dhtmlgoodiesPage.italy).perform();
        //actions.dragAndDrop(dhtmlgoodiesPage.madrid, dhtmlgoodiesPage.spain).perform();

        actions.dragAndDrop(dhtmlgoodiesPage.oslo, dhtmlgoodiesPage.norway).
                dragAndDrop(dhtmlgoodiesPage.stockholm, dhtmlgoodiesPage.sweden).
                dragAndDrop(dhtmlgoodiesPage.washington, dhtmlgoodiesPage.unitedStates).
                dragAndDrop(dhtmlgoodiesPage.copenhagen, dhtmlgoodiesPage.denmark).
                dragAndDrop(dhtmlgoodiesPage.seoul, dhtmlgoodiesPage.southKorea).
                dragAndDrop(dhtmlgoodiesPage.rome, dhtmlgoodiesPage.italy).
                dragAndDrop(dhtmlgoodiesPage.madrid, dhtmlgoodiesPage.spain).perform();
        Driver.closeDriver();

        /*
        Frameworkler büyüdükçe yeni classlar, yeni test methodları, yeni web elementler oluşturdukça
        içinden çıkılmaz, anlaşılmaz, tekrar bakımı yapılamaz, güncellemesi çok zor hatta imkansız bir hal alır.

        Uzmanlar; reusable, maintainable, rahat manipüle bir framework için bir design pattern olarak
        POM (Page Object Model)'de karar kılmışlar.

        Olmazsa olmazlar:
        1) Driver classı
        2) Page classı
        3) Test classı
        *) utilities

        Aradığımız bir web elementi veya methodu kolayca bulabilmek ve güncellemek için Javadan öğrendiğimiz OOP konsept
        Selenium ile Page Object Modelde birleştirilmiş oluyor.
         */

        /*
        PageFactory bizlere nesne deposu oluşturmaya imkan veren, sürdürülebilir,
        yeniden kullanılabilir ve elementleri tek bir yerden yönetmeyi sağlayan bir Page object model konseptidir.
        Page Factory’i kullanımına bakacak olursak PageFactory model, Web elementlerini
        @FindBy annotionu ile algılar. How kalıbı ile birlikte elementlerin ayırt edici
        locator’ından hangisini kullanacaksak belirtilir. Sonrasında ise o ayırt edici
        locator’ın adı tanımlanır. Public WebElement ile birlikte test senaryolarında
        kullanmak üzere isimlendirmesi yaparız. Burada isimlendirme daha sonra baktığında
        anlayabilmek için önemlidir, okunaklı olmalıdır.
         */
    }
}