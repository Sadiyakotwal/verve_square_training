package Day7.Super.Keyword;

import java.util.ArrayList;
import java.util.Arrays;

public class JavaTPointHomePage 
{
	//Instance Variables
	String strHomePageLogo ="Java T Point";
	ArrayList<String> strList = new ArrayList<String>(Arrays.asList("Cloud Tutorials","Python Tutorials","Java Technology","Database Tutorials"));
	ArrayList<String> strJavaTechnology = new ArrayList<String>(Arrays.asList("Maven","Core Java","Sprint Boot","Jenkins"));

	//Super Class Constructor
	JavaTPointHomePage()
	{
		System.out.println("This is Super class Constructor: JavaTPointHomePage");
		
	}
	
	
	public void homepgaeList()
	{
		System.out.println("\tTo print Home page List:");
		System.out.println("Tutorials:"+strList);
		
	}
	
	public void javaTechnology()
	{
		System.out.println("\tTo print Java Technology List:");
		System.out.println("Java Technology:"+strJavaTechnology);
		
	}
	
	
	
	
	
	
	
	
	

}
