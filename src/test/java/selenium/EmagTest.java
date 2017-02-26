package selenium;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertTrue;

/**
 * Created by dpuscasu on 12-Jan-17.
 */
public class EmagTest {

    WebDriver driver;

    @Before
    public void setUp(){
        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }

    @Test
    public void verifyPrice(){

        driver.get("http://www.emag.ro");
        WebElement searchBox = driver.findElement(By.id("emg-input-autosuggest"));
        searchBox.sendKeys("iphone 7");
        searchBox.submit();

        WebElement iphoneImage = driver.findElement(By.id("imgb1222671"));
        iphoneImage.click();

        WebElement iphonePrice = driver.findElement(By.xpath("(.//*[@class='product-new-price'])[2]"));
        System.out.println(iphonePrice.getText());
        assertTrue(iphonePrice.getText().equalsIgnoreCase("3.26991 Lei"));
    }

    @After
    public void tearDown(){
        driver.quit();
    }
}
