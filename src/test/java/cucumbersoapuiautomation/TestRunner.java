package cucumbersoapuiautomation;
import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
 
@RunWith(Cucumber.class)
@CucumberOptions(
		features = "cucumberfeatures"
		,glue={"cucumbersoapuiautomation"}
		,monochrome = false
		,plugin = {"pretty","html:target/cucumber-html-report", "json:target/cucumber-json-report.json"}
		)

public class TestRunner {


}
