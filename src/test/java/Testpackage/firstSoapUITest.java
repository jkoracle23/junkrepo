package Testpackage;

import org.junit.Test;

import com.eviware.soapui.impl.wsdl.WsdlProject;
import com.eviware.soapui.impl.wsdl.testcase.WsdlTestCase;
import com.eviware.soapui.impl.wsdl.testcase.WsdlTestCaseRunner;
import com.eviware.soapui.impl.wsdl.teststeps.WsdlResponseMessageExchange;
import com.eviware.soapui.impl.wsdl.teststeps.WsdlTestStep;
import com.eviware.soapui.model.iface.Response;
import com.eviware.soapui.model.testsuite.TestCase;
import com.eviware.soapui.model.testsuite.TestCaseRunner;
import com.eviware.soapui.model.testsuite.TestRunner;
import com.eviware.soapui.support.types.StringToObjectMap;
import com.eviware.soapui.tools.SoapUITestCaseRunner;

public class firstSoapUITest {
	
	//@SuppressWarnings("null") //this was added as irunner.runTestStepByName("simplegetCityForecastByZip"); was giving null warning. To supress this null warnign , this code change was suggested by eclipse.
	@Test
	public void learning()
	{
		try {

			//SoapUITestCaseRunner jrunner= new SoapUITestCaseRunner();
            
            //TestCaseRunner irunner=null;
			    
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
				
			
			
			/*
            	SoapUITestCaseRunner jrunner= new SoapUITestCaseRunner();
            	           	
               TestCaseRunner irunner=null;
               jrunner.setProjectFile("src/test/resources/Project-1-soapui-project.xml");
               jrunner.setTestSuite("WeathersoapRegression");
               irunner.runTestStepByName("simplegetCityForecastByZip");
               System.out.println(irunner.getResults());
            	//jrunner.printReport(10);
            	
            	//jrunner.runTestCase("GetCityForecastByZip");
            	//runSuite(WsdlTestSuite suite)
            	//runProject(WsdlProject project) 
            	//printReport(long timeTaken) 
            	//System.out.println((jrunner.printReport(10)));
            	 * 
            	 * 
            	 */
             } 
		catch (Exception e) 
			{

				//  System.err.println("checking " + zipCode + " failed!");

            	//failureCount++;

            	//zipCodes.append(zipCode + " [" + city +"] ");

            	e.printStackTrace();

            }

   }

		
}