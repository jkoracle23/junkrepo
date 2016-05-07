package cucumbersoapuiautomation;
import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
 
@RunWith(Cucumber.class)
@CucumberOptions(
		features = "cucumberfeatures"
		,glue={"cucumbersoapuiautomation"}
		,monochrome = false
		,plugin = {"html:target/cucumber-html-report", "json:target/cucumber-json-report.json"}
		)

/*
@CucumberOptions(
		features = "cucumberfeatures"
		,glue={"src/test/java/cucumbersoapuiautomation/basicrunStepDef.java"}
		,monochrome = false
		,plugin = {"html:target/cucumber-html-report", "json:target/cucumber-json-report.json"}
		//you can give anypath..here targe is the target folderS
		)
*/
public class TestRunner {


}
