package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith (Cucumber.class)
@CucumberOptions (features= "ProjectFeatures", glue= "stepsDefinition")

public class PrincipalRunner {

}