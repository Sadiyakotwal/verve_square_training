package Day6.Inheritance.Single;

/*To demonstrate Single level Inheritance using Mobile Example*/

public class AmazonLoginPage
{
	
	public String strEmail;
	public String strPassword;
	public String strSignInButton = "Sign-In";
	public String strMobile;
	public String strLaptop;
	public int intMobileBill;
	public int intLaptopBill;
	public int intTotalBill=0;
	public String strLogout;
	public void loginPage(String strEmail,String strPassword)
	{
		System.out.println("\tAmazon.in\n");
		
		//Step 1:Enter Email Address
		System.out.println("Email Address: "+strEmail);
		
		//Step 2 :Enter password
		System.out.println("Password:"+strPassword);
		
		//Step 3:Sign In
		System.out.println("\n\t"+strSignInButton);
		
	}
	

}
