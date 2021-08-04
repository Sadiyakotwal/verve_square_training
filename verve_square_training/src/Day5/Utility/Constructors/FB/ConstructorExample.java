package Day5.Utility.Constructors.FB;

/*To demonstrate Constructor using Gmail Login*/

public class ConstructorExample
{
	//For default
	static String strEmail ="sdaiyakotwal10@gamil.com";
	//For no arguments constructor
	String strEmail1;
	String strPhoneNo;
	public ConstructorExample()
	{
		
		strEmail1 = "sdaiyakotwal10@gamil.com";
		strPhoneNo = "7588573782";	
		this.signInSection1();
		
	}
	
	public void signInSection1()
	{
		System.out.println("\tGoogle");
		System.out.println("Sign in to continue to Gmail ");
		System.out.println("---------------------------------");
		if(strEmail1.equals("sdaiyakotwal10@gamil.com"))
		{
			System.out.println("Email :"+strEmail1+"\n");
		}
		else if(strPhoneNo.contentEquals(strPhoneNo))
		{
			System.out.println("Phone Number :"+strPhoneNo);
		}
		else
		{
			System.out.println("Invalid Login :");
		}
		
	}
	
	
	//For parameterized constructor
	String strPassword;
	public ConstructorExample(String Password)
	{
		strPassword = Password;
		this.signInSection2();
		
	}
	public void signInSection2()
	{
		strEmail1 = "sdaiyakotwal10@gamil.com";
		System.out.println("\tGoogle");
		System.out.println("\tWelcome ");
		System.out.println("---------------------");
		System.out.println(" "+strEmail1);
		System.out.println("  Password :"+strPassword+"\n");
		
		
	}
	
	
	//By parameterized constructor
	String strInboxSection;
	String strlogout;
	public ConstructorExample(String strInboxSection1,String strlogout1)
	{
		strInboxSection = strInboxSection1;
		strlogout = strlogout1;
		this.checkLoggedInOrNot();
		
	}
	public void checkLoggedInOrNot()
	{
		System.out.println("------------------------");
		System.out.println("\t"+strInboxSection);
		System.out.println("\t\t"+strlogout);
		System.out.println("Logged in successfully: ");
	}

	public static void main(String[] args)
	{
		//Default constructor 
		ConstructorExample objConstructorExample = new ConstructorExample();
		System.out.println("Default Constructor:\n"+objConstructorExample.strEmail+"\n");
		//No argument constructor
		System.out.println("No argument Constructor:\n");
		ConstructorExample obj1ConstructorExample = new ConstructorExample();
		//Parameterized constructor
		System.out.println("Parameterized Constructor:\n");
		ConstructorExample obj2ConstructorExample = new ConstructorExample("xyz@782687");
		//To verify the login 
		System.out.println("To check Home page:");
		ConstructorExample obj3ConstructorExample = new ConstructorExample("Search mail","Logout");



	}

}
