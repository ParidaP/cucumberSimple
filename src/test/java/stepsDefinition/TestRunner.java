package stepsDefinition;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Features/GoogleSearch.feature",
glue= {"stepsDefinition"},
monochrome =true,
dryRun=true,
plugin={"pretty","junit:target/JUnitReport/reports.xml",
		"json:target/JSonReport/reports.json",
		"html:target/htmlReport/reports.html"}

)
public class TestRunner {

}
