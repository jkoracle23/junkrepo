package cucumbersoapuiautomation;

import com.eviware.soapui.impl.wsdl.WsdlProject;
import com.eviware.soapui.impl.wsdl.testcase.WsdlTestCase;
import com.eviware.soapui.impl.wsdl.testcase.WsdlTestCaseRunner;
import com.eviware.soapui.impl.wsdl.teststeps.WsdlTestStep;
import com.eviware.soapui.support.types.StringToObjectMap;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class stepDef1 {

	
	@Given("^get endpoints$")
	public void get_endpoints() throws Throwable {

	}

	@When("^this is the data step$")
	public void this_is_the_data_step() throws Throwable {

	}

	@Then("^set the data/properties$")
	public void set_the_data_properties() throws Throwable {
	 
	}

	@Then("^run the request test step$")
	public void run_the_request_test_step() throws Throwable {
		try{
		WsdlProject project = new WsdlProject("src/test/resources/Project-1-soapui-project.xml");
		WsdlTestCase testCase = project.getTestSuiteByName("WeathersoapRegression").getTestCaseByName("GetCityForecastByZip");
		//System.out.println(testCase);
		//System.out.println(project);
		//WsdlTestStep testStep = testCase.getTestStepAt(2) ;//   getTestStepByName( "Properties1" );
		WsdlTestStep testStepreq = testCase.getTestStepByName( "simplegetCityForecastByZip" );
		//System.out.println(testStepreq);
		//WsdlResponseMessageExchange responsemsg=new WsdlResponseMessageExchange(testStep);
		WsdlTestCaseRunner runner = new WsdlTestCaseRunner( testCase, new StringToObjectMap() );
		
		//runner.runTestStep( testStepreq );//we can run a particular teststep like this as well.
		testStepreq.run(runner,runner.getRunContext());//we can run a test step like this also.
		//runner.run();
		//testStepname.setPropertyValue("properties", "value");//we can set and get value of property like this.
		WsdlTestStep proptranfer = testCase.getTestStepByName( "PropertyTransfer" );
		WsdlTestStep  Properties2setting= testCase.getTestStepByName( "Properties2" );
		runner.runTestStep(proptranfer);
		Properties2setting.setPropertyValue("2prop2", "love you jitu");
		//runner.getRunContext().setProperty("${Properties2#2prop2}", "love you jitu");
		System.out.println(runner.getRunContext().expand("${Properties2#2prop1}"));
		
		//System.out.println(runner.getRunContext().expand("${Request#Response}"));
		System.out.println(runner.getRunContext().expand("${Properties2#2prop2}"));
		
		System.out.println("This is the endpoint value jitendra:"+testStepreq.getPropertyValue("Endpoint"));
		// hey you can directly access all the testcase,teststep,testsuite and project properties by using the above method and adding $sign like ("${Properties2#2prop2}") as discussed 
		//in my soap ui notes....and also access global properties like that.
		//runner.getRunContext().values();//it prints the request as well
		System.out.println(runner.getRunContext());
		//System.out.println(runner.getReason());
		//System.out.println(runner.getResultCount());
		//System.out.println(runner.getResults());
		//Response res=new Response();
		//System.out.println(runner.getResults());
		System.out.println(runner.getRunContext());
	
     } 
catch (Exception e) 
	{

		//  System.err.println("checking " + zipCode + " failed!");

    	//failureCount++;

    	//zipCodes.append(zipCode + " [" + city +"] ");

    	e.printStackTrace();

    }



	}

	@Then("^Validate the response with the this data$")
	public void validate_the_response_with_the_this_data() throws Throwable {

		
	}


}
