package Day7.MethodOveriding;
/*To demonstrate Method Overriding using Music application Eg.*/

public class BaseMusic
{
	public String strUserName;
	public String strPassword;
	public String strSignUpButton;
	public String strAppName;
	public String strGaanaLogo ="gaana";
	public String strMenuBar[] = {"HOME","BROWSER","DISCOVER","RADIO","MY MUSIC","PODCASTS","SEARCH"};
	public String strSongsQueue[] = {"Song 1","Song 2","Song 3","Song 3"};
	
	
	//Parent class constructor
	BaseMusic()
	{
		
		System.out.println("This is parent Music Constructor:");
	}
	
	
	public void logInApplication(String strUserName,String strPassword,String strSignUpButton,String strAppName)
	{
		System.out.println("User Name:"+strUserName);
		System.out.println("Password :"+strPassword);
		System.out.println("\t"+strSignUpButton);
		System.out.println("Application Opened Is--->"+strAppName+"\n");

		
		
	}
	
	
	
	

}
