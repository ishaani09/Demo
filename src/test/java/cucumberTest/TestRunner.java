package cucumberTest;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = { "pretty", "html:target/cucumber-reports",
        "json:target/surefire-reports/cucumberOriginal.json"},
        features = {"C:\\Users\\HK\\Demo\\src\\test\\java\\com\\rsComponents\\features\\endToEndTests.feature"},
        glue = {"stepDefs"})

public class TestRunner {
}
