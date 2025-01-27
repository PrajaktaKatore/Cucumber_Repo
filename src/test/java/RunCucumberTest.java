import org.junit.runner.RunWith;
import io.cucumber.junit.CucumberOptions;

@RunWith(io.cucumber.junit.Cucumber.class)
@CucumberOptions(
        features = "src/test/Features", // Path to the feature files
        glue = "src/test/java/StepDefinitions/Login.java", // Path to the step definitions package
        plugin = {"pretty", "html:target/cucumber-reports"} // Report options
)
public class RunCucumberTest {
}

