package tests.practice08;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HerokuTestPage;
import utilities.Driver;

import java.util.List;

public class P01 {

    HerokuTestPage herokuTestObje = new HerokuTestPage();
    Actions actions = new Actions(Driver.getDriver());

    @Test
    public void test01() throws InterruptedException {
        //Go to https://testpages.herokuapp.com/styled/events/javascript-events.html
        Driver.getDriver().get("https://testpages.herokuapp.com/styled/events/javascript-events.html");
        //Click all the buttons and verify they are all clicked
        herokuTestObje.onBlur.click();
        herokuTestObje.onClick.click();
        herokuTestObje.onClick.click();
        actions.contextClick(herokuTestObje.onContextMenu).
                doubleClick(herokuTestObje.onDoubleClick).
                click(herokuTestObje.onFocus).sendKeys(Keys.ENTER).
                click(herokuTestObje.onKeyUp).sendKeys(Keys.ENTER).
                click(herokuTestObje.onKeyDown).sendKeys(Keys.ENTER).
                click(herokuTestObje.onKeyPress).sendKeys(Keys.ENTER).
                moveToElement(herokuTestObje.onMouseOver).
                moveToElement(herokuTestObje.onMouseLeave).moveToElement(herokuTestObje.onMouseOver).
                click(herokuTestObje.onMouseDown).perform();



        Driver.quitDriver();
    }

    @Test(dependsOnMethods = "test01")
    public void test02() {
        List<WebElement> list = herokuTestObje.eventTriggered;
        Assert.assertEquals(11, list.size());
    }
}