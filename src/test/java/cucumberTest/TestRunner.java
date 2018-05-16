package cucumberTest;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.AfterClass;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(plugin = { "pretty", "html:target/cucumber-reports",
        "json:target/surefire-reports/cucumberOriginal.json"},
        features = {"C:\\Users\\HK\\Demo\\src\\test\\java\\com\\rsComponents\\features\\endToEndTests.feature"},
        glue = {"com.rsComponents.stepDefs"})

public class TestRunner {
}
