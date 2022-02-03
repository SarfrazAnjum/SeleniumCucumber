package runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/features/",
		glue = {"steps"},
		dryRun = false,
		monochrome = true,
		 plugin = {
		"pretty", "summary", "html:target/cucumber.html","json:target/cucumber.json",
		"rerun:target/failed.txt" }// , snippets = CAMELCASE	tags = "@all",

)
public class TestRunner {
}