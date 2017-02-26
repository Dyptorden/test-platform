package selenium;

import org.junit.After;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

/**
 * Created by dpuscasu on 12-Jan-17.
 */
public class IEDriverTest {

    WebDriver driver;
    @Test
    public void testIEDriver() {

        String service = "C:\\drivers\\IEDriverServer.exe";
        System.setProperty("webdriver.ie.driver", service);
        driver = new InternetExplorerDriver();
        driver.get("http://yahoo.com");
    }

    @After
    public void tearDown(){
        driver.quit();
    }
}
