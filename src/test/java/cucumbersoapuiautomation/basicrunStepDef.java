package cucumbersoapuiautomation;
import java.util.ArrayList;
import java.util.List;
import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class basicrunStepDef {
	jValidation validationobj=new jValidation();
	
	@Given("^Do all the excel file setup$")
	public void do_all_the_excel_file_setup() throws Throwable {
		setupTeardown.filesetup();
		
	}
	

	@Given("^Write to report excel file and close the file$")
	public void write_to_report_excel_file_and_close_the_file() throws Throwable {
	
		setupTeardown.closingSteps();	
	}

	
	

	@Given("^The WSDL project name \"([^\"]*)\" and Testsuite name \"([^\"]*)\"$")
	public void the_WSDL_project_name_and_Testsuite_name(String arg1, String arg2) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		System.out.println("jitu in background");
		jProjectContext.getProjectAndSuiteName(arg1,arg2);
		
	}

	@Given("^The testcasename \"([^\"]*)\" and TestStepname \"([^\"]*)\"$")
	public void the_testcasename_and_TestStepname(String arg1, String arg2) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		jProjectContext.createRunner(arg1);
		jProjectContext.createRequestStep(arg2);
		System.out.println("jitendra1");
	}

	@Given("^The request Endpoint is \"([^\"]*)\"$")
	public void the_request_Endpoint_is(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		jProjectContext.getSetEndpoint(arg1);
		//jProjectContext.runStep();
		System.out.println("jitendra2");
		
	}

	@When("^Input data with node <>$")
	public void input_data_with_node(DataTable arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
	    // E,K,V must be a scalar (String, Integer, Date, enum etc)
	    //throw new PendingException();
	
		validationobj.inputRequestData(arg1.raw());
		
		/*
		 validationobj.ListRequest=arg1.raw();
		validationobj.ListRequest.toString();
		System.out.println(validationobj.ListRequest.size());
		Integer  tempstring=validationobj.ListRequest.get(0).size();
		System.out.println(tempstring);
		*/
		System.out.println("jitendra3");
		
	}
	
	@When("^Expected xpath of nodes are$")
	public void expected_xpath_of_nodes_are(DataTable arg1) throws Throwable {
        validationobj.inputResponseNodes(arg1.raw());
		System.out.println("jitendra4");
	}
	

	@When("^Expected result represented by table$")
	public void expected_result_represented_by_table(DataTable arg1) throws Throwable {
	    validationobj.inputResponseData(arg1.raw());
		System.out.println("jitendra5");
		
	}

	@Then("^Run the step and validate the result$")
	public void run_the_step_and_validate_the_result() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new PendingException();
		validationobj.run();
		System.out.println("jitendra6");
	}

}
