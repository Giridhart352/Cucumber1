package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
	features="C:\\Users\\girid\\eclipse-workspace\\Cucumber1\\Features\\login.feature",
	//features= ".//Feature//Login.feature",
	glue= {"StepDefinitions"},
	plugin= {"pretty",
	"html:reports/myreports.html",
	"html:reports/myreports.json",
	//"rerun:target/rerun.txt",
	},
	dryRun=false,
	monochrome=true
	//tags="@Sanity"
	)
public class testrunner {

}
