package cucumbersoapuiautomation;
import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
 
@RunWith(Cucumber.class)
@CucumberOptions(
		features = "cucumberfeatures"
		,glue={"src/test/java/cucumbersoapuiautomation/stepDef1"}
		,monochrome = false
		)
public class TestRunner {


}
