package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(features= "features/steps.feature", 
glue={"stepDefinitions/OlxSteps"})
public class RunnerClass {

}
