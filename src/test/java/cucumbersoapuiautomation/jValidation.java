package cucumbersoapuiautomation;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import com.eviware.soapui.impl.wsdl.teststeps.WsdlTestStep;

/*
 * This class will define methods which will take request input,get arraysize of main list as well as
 * sublist
 * method to create and Set property value
 * inherit all the methods of jProjoectContext
 * 
 */
public class jValidation extends jProjectContext{
  //all the list here
	public List<List<String>> ListRequest = new ArrayList<List<String>>();
	public List<List<String>> ListResponseNodes = new ArrayList<List<String>>();
	public List<List<String>> ListExpectedResponse = new ArrayList<List<String>>();
	public List<String> requestNodes=new ArrayList<String>();
//all the list here	
//all variables hare   
	public int listRequestRownum=0;
	public int listRequestColnum=0;
	public int listResponseRownum=0;
	public int listResponseColnum=0;
	public int requestNodesSize=0;
	public int listResponsNodeseRownum=0;
	public void inputRequestData(List<List<String>> locallist)
	{
		ListRequest=locallist;
		ListRequest.toString();
		listRequestRownum=ListRequest.size();
		listRequestColnum=ListRequest.get(0).size();
		
	}

	public void inputResponseNodes(List<List<String>> locallist)
	{
		ListResponseNodes=locallist;
		ListResponseNodes.toString();
		listResponsNodeseRownum=ListExpectedResponse.size();
		/*
		System.out.println(ListResponseNodes.get(0).get(0));
		System.out.println(ListResponseNodes.get(1).get(0));
		System.out.println(ListResponseNodes.get(2).get(0));
		
		*/
		
	}
	public void inputResponseData(List<List<String>> locallist)
	{
		ListExpectedResponse=locallist;
		ListExpectedResponse.toString();
		listResponseRownum=ListExpectedResponse.size();
		listResponseColnum=ListExpectedResponse.get(0).size();
		
	}
	
	
	public void run()
	{
		//for each request node, create property and set property value as ""

		for(int col=0;col<listRequestColnum;col++)
		{
			ListRequest.get(0).get(col);
			requestProperties= testCase.getTestStepByName( "requestProperties" );
			requestProperties.setPropertyValue(ListRequest.get(0).get(col),"");
					
		}
		
		//set the properties value and validate each response set starting from row 2
		for(int row=1;row<listRequestRownum;row++)
		{
			//traverse through each property and set value
			//System.out.println(row);
			for(int col=0;col<listRequestColnum;col++)
			{
			requestProperties.setPropertyValue(ListRequest.get(0).get(col),ListRequest.get(row).get(col));//property value is set for this run
			//System.out.println("ListRequest.get(row).get(col)"+(ListRequest.get(row).get(col)));
			jrunner.runTestStep(testRequestStep);
			//System.out.println(jrunner.getRunContext().expand("${simplegetCityForecastByZip#Response#//ns1:GetCityForecastByZIPResult/ns1:City}"));//it gives the count of number of
				//get the response nodes xpath which needs to be validated
					for(int xpathNodesCount=0;xpathNodesCount<ListResponseNodes.size();xpathNodesCount++)
						{
							String responseValue=jrunner.getRunContext().expand(ListResponseNodes.get(xpathNodesCount).get(0));
			 				
							//System.out.println(ListExpectedResponse.get(xpathNodesCount).get(row-1).toString());
							//System.out.println(responseValue);
							
							if(responseValue.equals(ListExpectedResponse.get(xpathNodesCount).get(row-1).toString()))
			 				{
			 					System.out.println("Expected value :"+ListExpectedResponse.get(xpathNodesCount).get(row-1) +"is equal to the actual value:"+responseValue);
			 				}
			 				else
			 				{
			 					System.out.println("Expected value :"+ListExpectedResponse.get(xpathNodesCount).get(row-1) +"IS NOT EQUAL to the actual value:"+responseValue);
			 				}
			 				
			 				
						}
			
			}
			//run the request
			
			
			//System.out.println(jrunner.getRunContext().expand("${simplegetCityForecastByZip#Response}"));
			
		}
		
	}

	

}
