package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/java/Features", glue = { "StepDefinations" }, plugin = {
		"html:target/cucumber-reports/cucumber-html-report.html",
		 }, dryRun = false)
public class RunCucumber extends AbstractTestNGCucumberTests {}
