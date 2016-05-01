package Testpackage;

import java.io.File;
import java.io.IOException;

import org.apache.xmlbeans.XmlException;
import org.junit.Test;

import com.eviware.soapui.SoapUI;
import com.eviware.soapui.StandaloneSoapUICore;
import com.eviware.soapui.impl.wsdl.WsdlInterface;
import com.eviware.soapui.impl.wsdl.WsdlOperation;
import com.eviware.soapui.impl.wsdl.WsdlProject;
import com.eviware.soapui.impl.wsdl.WsdlRequest;
import com.eviware.soapui.impl.wsdl.WsdlSubmit;
import com.eviware.soapui.impl.wsdl.WsdlSubmitContext;
import com.eviware.soapui.impl.wsdl.support.wsdl.WsdlImporter;
import com.eviware.soapui.model.iface.Response;
import com.eviware.soapui.model.support.PropertiesMap;
import com.eviware.soapui.model.testsuite.TestCase;
import com.eviware.soapui.model.testsuite.TestRunner;
import com.eviware.soapui.model.testsuite.TestSuite;
import com.eviware.soapui.support.SoapUIException;
import com.eviware.soapui.model.testsuite.TestRunner.Status;
import com.eviware.soapui.tools.SoapUITestCaseRunner;

public class TestjituTest 
{
	
	
	public void myTest()
	{
		
		System.out.println("hello jitu");
		
    }
	
	public void anotherTest()
	{
		
		System.out.println("another test method jitu");
		
    }
	

	
	public void soapTest() throws Exception

	{

		 System.out.println("hi**************************");
	File projectFile =new File("D:/SOAPFramework/Project-1-soapui-project");

	SoapUI.setSoapUICore(new StandaloneSoapUICore(true));

	WsdlProject project = new WsdlProject("Project-1");
    
	WsdlInterface[] wsdls = WsdlImporter.importWsdl(project, "http://www.webservicex.com/globalweather.asmx?wsdl");

	System.out.println("The wsdl count ="+wsdls.length); //To get the number of  wsdl interfaces

	for(int j=0;j<wsdls.length;j++)

	{

		WsdlInterface wsdl = wsdls[j];

		String soapVersion = wsdl.getSoapVersion().toString();

//		System.out.println("The SOAP version ="+soapVersion);
//
	//	System.out.println("The binding name = "+wsdl.getBindingName());

		//System.out.println("The binding type ="+wsdl.getBinding());

		int c = wsdl.getOperationCount();

		System.out.println("The total number of operations ="+c);

		String reqContent="";

		String result="";

		for(int i=0;i<c;i++)

		{

			WsdlOperation op = wsdl.getOperationAt(i);

			String opName = op.getName();

			//System.out.println("OP:"+opName);

			reqContent = op.createRequest(true);

			WsdlRequest req = op.addNewRequest("Req_"+soapVersion+"_"+opName);

			//System.out.println("Req_"+soapVersion+"_"+opName);

			req.setRequestContent(reqContent);
			System.out.println("Jitu experiment done below:::;:::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
		/*	
			WsdlSubmitContext wsdlSubmitContext = new WsdlSubmitContext(req);
			WsdlSubmit<?> submit = (WsdlSubmit<?>) req.submit(wsdlSubmitContext, false);

			Response response = submit.getResponse();
			*/
			 //String[] prop ={"usePropertyFileFlag=true","zipCode="+zipCode, "city="+city};
			 //SoapUITestCaseRunner SoapUITestCaseRunner= new SoapUITestCaseRunner();
		    //Testrunner testrunner=new TestRunner();
			System.out.println("Jitu exper"
					+ ""
					+ ""
					+ ""
					+ ""
					+ ""
					+ ""
					+ ""
					+ "i");
			System.out.println(req.getRequestParts());
			SoapUITestCaseRunner runner=new SoapUITestCaseRunner();
			//runner.setTestCase(testCase);
			//runner.run(arg0)
			System.out.println("Jitu experiment ending::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
			//TestRunner tr=new TestRunner();
			

		}
	//	System.out.println("this is prefinal print jitu");

	}

	project.saveIn(projectFile);
	//System.out.println("this is final print jitu");

  }//end of method



}


