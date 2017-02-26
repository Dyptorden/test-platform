package junit;

import applications.Calculator;
import org.junit.Test;
import static org.junit.Assert.assertTrue;

/**
 * Created by dpuscasu on 12-Jan-17.
 */
public class CalculatorTests {

    Calculator calculator = new Calculator();

    @Test
    public void testSum(){
        assertTrue("The Calculator sum method is not correct!",calculator.sum(23,32)==55);
    }


    @Test
    public void testMultiply(){
        assertTrue("The Calculator multiply method is not correct!",calculator.multiply(172,374)==64328);
    }

    @Test
    public void testAverage(){
        assertTrue("The Calculator average method is not correct!",calculator.average(10,6)==8);
    }


}
