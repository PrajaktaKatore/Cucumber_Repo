import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/Features/demoblaze.feature", // Path to the feature files
        glue = "stepDefination", // Path to the step definitions package
        plugin = {"pretty", "html:target/cucumber-reports"} // Report options
)
public class RunCucumberTest 
{
        
}

