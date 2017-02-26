package junit;

import applications.Calculator;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * Created by dpuscasu on 13-Jan-17.
 */


@RunWith(Suite.class)

@Suite.SuiteClasses({
        CalculatorTests.class,
        SelectionSortTests.class,
        TextParserTests.class
})

public class JunitTestSuite {
}
