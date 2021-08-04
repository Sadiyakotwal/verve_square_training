package Day7.MethodOveriding;

public class GaanaApplication extends BaseMusic
{

	//Child class constructor
	GaanaApplication()
	{
		System.out.println("This is GaanaApplication Music Constructor:\n");
	}

	//Method overriden of parent class music
	@Override
	public void logInApplication(String strUserName, String strPassword, String strSignUpButton, String strAppName)
	{
		System.out.println("\tEnter LogIn Details:");
		super.logInApplication(strUserName, strPassword, strSignUpButton, strAppName);
	}
	
	
	
	public void uiGaanaApplication()
	{
		System.out.println("\tUI of Gaana Application:");
		System.out.print("\tGaana Logo:"+"---->"+strGaanaLogo+"\tMenu Bar:"+"-->");
		for(int i=0;i<strMenuBar.length;i++)
		{
		System.out.print(" "+strMenuBar[i]);
		}
		System.out.println("\n");
		for(int i=0;i<strSongsQueue.length;i++)
		{
		System.out.println("\t\t\t"+strSongsQueue[i]);
		}
		
	}
	
	
}
