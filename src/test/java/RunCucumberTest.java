import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/Features", // Path to the feature files
        glue = "stepDefination", // Path to the step definitions package
        plugin = {"json:target/cucumber-reports/Cucumber.json"}
        )
public class RunCucumberTest 
{
        
}

