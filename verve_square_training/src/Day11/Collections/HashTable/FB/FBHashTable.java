package Day11.Collections.HashTable.FB;

import java.util.Hashtable;

public class FBHashTable 
{
	//Creating object of utility class
	UtilityFB objUtilityFB = new UtilityFB();
	//Creating reference of hashtable class through which we fetch values
	public Hashtable<String, String> objHashTable;

	//Creating constructor and creating object of class in constructor as const. gets invoked initially.
	public FBHashTable()
	{
		
		objHashTable = new Hashtable<String,String>();
	
	}
	
	
	//Creating test data 
	public Hashtable<String,String> createAccountTestData()
	{
		objHashTable.put("FirstName"," ");
		objHashTable.put("LastName",objUtilityFB.getRandomLirstName() );
		objHashTable.put("EmailAddress",objUtilityFB.getRandomEmail());
		objHashTable.put("Password", objUtilityFB.getRandomPassword());
		objHashTable.put("Date",objUtilityFB.getRandomDate());
		objHashTable.put("Month", objUtilityFB.getRandomMonth());
		objHashTable.put("Year", objUtilityFB.getRandomYear());
		objHashTable.put("Gender", objUtilityFB.getRandomGender());
		objHashTable.put("Sign-Up","Sign-Up");
		objHashTable.put("Logout Text Visible","Logout");
		return objHashTable;
	}


}
