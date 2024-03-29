package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Features",
glue= {"StepDefinition","AppHooks"},
plugin= {"pretty","json:target/cucumber-reports/cucumber.json", "html:target/cucumber-reports/cucumberreport.html",
		"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
monochrome=true,
publish=true,
dryRun=false
)
public class Run {

}
