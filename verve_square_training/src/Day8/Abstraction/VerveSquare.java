package Day8.Abstraction;

public class VerveSquare extends BaseTest
{

	@Override
	public void usClientApplication()
	{
		System.out.println("\tTo check Speed:");
		int intUsers = 3000;
		if(intUsers>1000)
		{
			System.out.println("Users: "+intUsers);
			System.out.println("Response time should  not be more than: "+strResponseTime);
			
		}
		System.out.println("\tTo check performance:");
		int intRecords = 100000;
		if(intRecords>10000)
		{
			System.out.println("Database Records:"+intRecords);
			System.out.println("Volume Testing  :"+strVolumeTesting);
		}
		
		System.out.println("\tTo check Load");
		int intCurrentLoadUsers = 500;
		int intLoadIncreasedUsers = 1000;
		if(intCurrentLoadUsers > intLoadIncreasedUsers)
		{
			System.out.println("Load Is:"+intCurrentLoadUsers);
			
		}
		else
		{
			System.out.println("Load Is Increased: "+intLoadIncreasedUsers);
			System.out.println("Load Testing :"+strLoadTesting);
		}	
	}

	@Override
	public void canadaClientApplication() 
	{
		
		System.out.println("1.Unit Testing:"+strUnitTesting);
		System.out.println(strUnitTestTools);
		System.out.println("2.Integration Testing:"+strIntegrationTesting);
		System.out.println(strIntegrationTestTools);
		
		
	}
	

}
