package Day5.Utility.Constructors.FB;

public class TestFacebookSignIn {

	public static void main(String[] args)
	{
		
		//object of FacebookSigIn class
		FacebookSignIn objFacebookSignIn =new FacebookSignIn();
		//To open UrL
		objFacebookSignIn.openURL();
		//To check Signed or not 
		objFacebookSignIn.verifySignedOrNot();
		//To set First Name
		objFacebookSignIn.setName("abc");
		//To set last name
		objFacebookSignIn.setLastName("\txyz");
		//If person entered mail get email
		objFacebookSignIn.setEmail("ABC");
		//If person entered mobile number
		if(objFacebookSignIn.strMobile1.equals("91"))
		{
			objFacebookSignIn.setMobileNo("91");
		}
		else if(objFacebookSignIn.strMobile2.equals("75"))
		{
			objFacebookSignIn.setMobileNo("75");
		}
		else
		{
			objFacebookSignIn.setMobileNo("98");
		}
		//To set password
		objFacebookSignIn.setPassword("abc","xyz" );
		
		//To set date
		objFacebookSignIn.setDate();
		//To set Month
		objFacebookSignIn.setMonth();
		//To set year
		objFacebookSignIn.setYear("\t19");
		//To get gender
		objFacebookSignIn.setGender();
		//Sign in
		objFacebookSignIn.clickSignUpButton();
	}

}
