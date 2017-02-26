package selenium;

import org.junit.After;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by dpuscasu on 12-Jan-17.
 */
public class FirefoxDriverTest {

    WebDriver driver;
    @Test
    public void testFirefox() {
        driver = new FirefoxDriver();
        driver.get("http://www.yahoo.com");
    }

    @After
    public void tearDown(){
        driver.quit();
    }
}
