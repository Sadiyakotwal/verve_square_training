package Day5.Utility.Constructors.FB;

import java.util.Random;

public class FacebookSignIn 
{
	String strFirstname;
	String strLastName;
	String strEmail;
	String strMobile;
	String strMobile1 = "91";
	String strMobile2 = "75";
	String strMobile3 = "98";
	String strYear;
	String strPassFirst;
	String strPassLast;
	String strType;
	//String strDate;
	
	
	//Utilities class
	FacebookUtilities objFacebookUtilities = new FacebookUtilities();
	
	
	public void openURL() {
		System.out.println("https://www.facebook.com\n");
	}

	public void verifySignedOrNot() {

		System.out.println(" Create a new account");
		System.out.println("-------------------------------");
	}
	public void setName(String strFirstname)
	{
		this.strFirstname = strFirstname;
		System.out.println("First Name:"+"\t"+"Last Name:");
		System.out.print(strFirstname+"_"+objFacebookUtilities.getRandomFirstName(6));
	}
	public void setLastName(String strLastName)
	{
		this.strLastName = strLastName;
		System.out.print(strLastName+"_"+objFacebookUtilities.getRandomLirstName(6)+"\n");
	}
	
	public void setEmail(String strEmail)
	{
		this.strEmail = strEmail;
		System.out.println("\nGmail:");
		System.out.println(strEmail+"__"+objFacebookUtilities.getRandomEmail(10)+"@gamil.com");
	}
	public void setMobileNo(String strMobile)
	{
		this.strMobile = strMobile;
		System.out.println("\nMobile Number:");
		System.out.println(strMobile+"_"+objFacebookUtilities.getMobileNO(8)+"\n");
	}
	public void setPassword(String strPassFirst,String strPassLast)
	{
		this.strPassFirst = strPassFirst;
		this.strPassLast = strPassLast;
		System.out.println("Password:");
		System.out.println(strPassFirst+"_"+objFacebookUtilities.getRandomPassword(6)+"_"+strPassLast);
	}
	public void setDate()
	{
		
		System.out.println("\nDate of Birth :");
		System.out.println("Date:"+"\t"+"Month:"+"\t"+"Year:");
		System.out.print(+objFacebookUtilities.getRandomDate(31));
	}
	public void setMonth()
	{
		
		System.out.print("\t"+objFacebookUtilities.getRandomMonth());
	}
	public void setYear(String strYear)
	{
		this.strYear = strYear;
		System.out.println(strYear+objFacebookUtilities.getRandomYear(2)+"\n");
	}
	public void setGender()
	{
		System.out.println("Gender:");
		System.out.println(objFacebookUtilities.getRandomGender()+"\n");
	}
	public void clickSignUpButton() {
		System.out.println("\tSign up");
	}
}
