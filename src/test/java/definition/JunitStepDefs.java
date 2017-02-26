package definition;

import applications.Calculator;
import applications.TextParser;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created by dpuscasu on 13-Jan-17.
 */
public class JunitStepDefs {

    WebDriver driver;
    int a,b;
    int result;
    String text;
    String email;

    Calculator calculator = new Calculator();
    TextParser parser = new TextParser();

    @Given("^that i have numbers \"([^\"]*)\" and \"([^\"]*)\"$")
    public void that_i_have_numbers_and(int nr1, int nr2){
        a = nr1;
        b = nr2;
    }

    @When("^i call \"([^\"]*)\" function from calculator$")
    public void i_call_function_from_calculator(String method){
        switch (method) {
            case "sum":
                result = calculator.sum(a,b);
                break;
            case "multiply":
                result = calculator.multiply(a,b);
                break;
            case "average":
                result = calculator.average(a,b);
                break;
        }
    }

    @Then("^the received response is \"([^\"]*)\"$")
    public void the_received_response_is(int expectedResult){
        assertTrue(result==expectedResult);
    }


    @Given("^that i have the text \"([^\"]*)\"$")
    public void that_i_have_the_text(String givenText){
        text = givenText;
    }

    @When("^I call the email extract method$")
    public void i_call_the_email_extract_method(){
        email = parser.emailExtractor(text);
    }

    @Then("^the returned response is \"([^\"]*)\"$")
    public void the_returned_response_is(String expectedEmail){
        assertTrue(email.equalsIgnoreCase(expectedEmail));
    }



    @Before
    public void setUp(){
//        driver = new FirefoxDriver();
        System.setProperty("webdriver.chrome.driver", "c:/apps/SeleniumDrivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }


    @Given("^that i am on emag page$")
    public void that_i_am_on_emag_page(){
        driver.get("http://www.emag.ro");
    }

    @When("^I search for \"([^\"]*)\"$")
    public void i_search_for(String keyword){
        WebElement searchBox = driver.findElement(By.id("emg-input-autosuggest"));
        searchBox.sendKeys(keyword);
        searchBox.submit();
    }

    @When("^I see the details for a phone$")
    public void i_see_the_details_for_a_phone(){
        driver.findElement(By.id("imgb1222671")).click();
    }

    @Then("^the price is smaller than \"([^\"]*)\"$")
    public void the_price_is_smaller_than(String pret){
        WebElement iphonePrice = driver.findElement(By.xpath("(.//*[@class='product-new-price'])[2]"));
        String numar = iphonePrice.getText().substring(0,4);

        assertTrue("Pretul este diferit. Actual pret este: " + numar,numar.equalsIgnoreCase(pret));
    }

     @After
    public void tearDown(){
        driver.quit();
    }

}
