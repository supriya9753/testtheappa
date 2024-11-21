package StepDefinations;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
	@CucumberOptions(features="src/test/resources/Features/login.feature",glue= {"StepDefinations"},
	monochrome=true,
	plugin={"preety","junit:target/JUnitReports/report.xml",
	"json:target/JSONReports/report.json", 
	"html:target/HtmlReports"})
			
	public class TestRunner 
	{			
}
