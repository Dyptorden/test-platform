
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

/**
 * Created by dpuscasu on 13-Jan-17.
 */

@RunWith(Cucumber.class)
@CucumberOptions(
        monochrome = true,
        tags = "@tags",
        features = "src/test/java/features/",
        plugin = { "pretty","html: cucumber-html-reports",
                "json: cucumber-html-reports/cucumber.json" },
        glue = "definition"
)

public class CucumberRunner {


}
