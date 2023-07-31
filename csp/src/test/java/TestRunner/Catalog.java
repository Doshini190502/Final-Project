package TestRunner;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java", glue = "StepDefinition.Catalog")
public class Catalog {
    // Optional: You can add additional configurations here
}
