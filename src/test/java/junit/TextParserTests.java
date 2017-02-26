package junit;

import applications.TextParser;
import org.junit.Test;

import static org.junit.Assert.assertTrue;


/**
 * Created by dpuscasu on 12-Jan-17.
 */
public class TextParserTests {

    TextParser parser = new TextParser();
    String emailExtractorText = "For additional information please contact dragos.puscasu@endava.com while i am out of the office";

    @Test
    public void testEmailExtractor(){
        assertTrue("The email extractor method is incorrect",parser.emailExtractor(emailExtractorText).equalsIgnoreCase("dragos.puscasu@endava.com"));
    }
}
