package Day7.MethodOveriding;

public class SpotifyApplication extends BaseMusic
{

	//Child class constructor
	SpotifyApplication()
	{
		System.out.println("This is SpotifyApplication Music Constructor:");
	}

	//Method overriden of parent class music
	@Override
	public void logInApplication(String strUserName, String strPassword, String strSignUpButton, String strAppName) 
	{
		
		System.out.println("\tEnter LogIn Details:");
		super.logInApplication(strUserName, strPassword, strSignUpButton, strAppName);
	}

}
