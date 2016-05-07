package cucumbersoapuiautomation;

import com.eviware.soapui.impl.wsdl.WsdlProject;
import com.eviware.soapui.impl.wsdl.testcase.WsdlTestCase;
import com.eviware.soapui.impl.wsdl.testcase.WsdlTestCaseRunner;
import com.eviware.soapui.impl.wsdl.teststeps.WsdlTestStep;
import com.eviware.soapui.support.types.StringToObjectMap;

public class jProjectContext {
	public static WsdlProject project ;
	public static WsdlTestCase testCase;
	public static WsdlTestCaseRunner jrunner;
	public static WsdlTestStep testRequestStep; 
	public static WsdlTestStep  requestProperties;
    //project properties
	public static String suiteName;
	public static String Endpointinput;
	

	public static boolean getProjectAndSuiteName(String projectName,String suiteNameArg)
	
	{
		try{
			
			project = new WsdlProject(projectName);
			suiteName=suiteNameArg;
			return true;//at the end return true if no exception
		}
		catch(Exception e)
		{
			return false;
		}
		
	}
	
	public static boolean createRunner(String testCaseNameArg)
	
	{
		try{
			
			testCase = project.getTestSuiteByName(suiteName).getTestCaseByName(testCaseNameArg);
			jrunner = new WsdlTestCaseRunner( testCase, new StringToObjectMap() );
			
			return true;//at the end return true if no exception
		}
		catch(Exception e)
			{
			return false;
			}
	}	
/*
	public static boolean runStep()
		
		{
			try{
				
				testRequestStep.run(jrunner,jrunner.getRunContext());
				System.out.println(jrunner.getRunContext().expand("${simplegetCityForecastByZip#Response#count(//ns1:GetCityForecastByZIPResult/ns1:City)}"));//it gives the count of number of
				return true;//at the end return true if no exception
			}
			catch(Exception e)
			{
				return false;
			}
	
		}
	*/
	
	public static boolean createRequestStep(String testStepNameArg)
	
		{
			try{
				
				testRequestStep = testCase.getTestStepByName(testStepNameArg);
				return true;//at the end return true if no exception
		}
		catch(Exception e)
		{
			return false;
		}
		
	}
	public static boolean getSetEndpoint(String arg1)
	{
		try{
			Endpointinput=arg1;
			testRequestStep.setPropertyValue("Endpoint" ,Endpointinput);
			return true;//at the end return true if no exception
	       }
		catch(Exception e)
		{
		return false;
		}
	
	}

}
