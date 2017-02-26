package selenium;

import org.junit.After;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

/**
 * Created by dpuscasu on 12-Jan-17.
 */
public class HTMLUnitDriverTest {

    WebDriver driver;
    @Test
    public void testHTMLUnit(){
        driver = new HtmlUnitDriver();
        driver.get("http://www.yahoo.com");
        System.out.println(driver.getTitle());
    }

    @After
    public void tearDown(){
        driver.quit();
    }
}
