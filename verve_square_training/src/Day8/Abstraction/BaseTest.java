package Day8.Abstraction;

import java.util.ArrayList;
import java.util.Arrays;

/* To demonstrate Abstraction 
 * 2 Clients want a application for their company 
 * USClient Wants -----Application which focuses on performance  
 * CanadaClient Wants-----Application which focuses on Functionality
 * VerveSquare =======Providing application on Performance testing and Functional testing */


//Rule 1:Before class use abstract keyword
public abstract class BaseTest
{
	//Rule 3:Abstract can have variable declarations and initialization
	public String strLocation;
	public String strResponseTime ="4 sec";
	public String strVolumeTesting = "Large No. of Data : 1Lakh";
	public String strLoadTesting = "Current Load to Increased Load";
	public String strUnitTesting ="Unit Testing Tools";
	ArrayList<String> strUnitTestTools = new ArrayList<String>(Arrays.asList("JUnit"," TestNG"," JTest"));
	public String strIntegrationTesting = "Integration Testing Tools";
	ArrayList<String> strIntegrationTestTools = new ArrayList<String>(Arrays.asList("Citrus"," Tessy"," Protractor"));



	//Rule 4: Abstract class can have private and public and protected modifiers
	private String strUSCompanyCode ="1201";
	
	//Can have Constructors
	public BaseTest()
	{
		System.out.println("Constructor : Parent class---->Base Test");
	}
	
	
	
	//Rule 5: Abstract class can have abstract method and concrete method
	public void clientLoaction(String strLocation)
	{
		System.out.println("Client From : "+strLocation);
		
	}
	
	
	public abstract void usClientApplication();
	public abstract void canadaClientApplication();




	

}
