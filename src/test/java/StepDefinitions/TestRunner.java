package StepDefinitions;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Features",glue= {"StepDefinitions"},
monochrome= true,
plugin = {"pretty","junit:target/JUNITRerports/report.xml",
		"html:target/HtmlRerports",
		"json:target/JSONRerports/login.json"},
tags="@smoketest"
)
public class TestRunner {	
}

