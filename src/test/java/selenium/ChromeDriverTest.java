package selenium;

import org.junit.After;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Created by dpuscasu on 12-Jan-17.
 */
public class ChromeDriverTest {

    WebDriver driver;
    @Test
    public void testChrome(){
        String exePath = "C:\\drivers\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", exePath);
        driver = new ChromeDriver();
        driver.get("http://www.yahoo.com");
    }

    @After
    public void tearDown(){
        driver.quit();
    }
}
