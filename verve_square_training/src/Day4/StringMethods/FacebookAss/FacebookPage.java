package Day4.StringMethods.FacebookAss;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class FacebookPage
{
	Random rand = new Random();
	String[] strFirstName = {"Sadiya","Ray","Shital","Raj","Riya"};
	int index1 = rand.nextInt(strFirstName.length);
	String[] strLastName= {"Kotwal","Kevin","Mane","Sharma","Patel"};
	int index2 = rand.nextInt(strLastName.length);
	String strMobileNo[] = {"9479884758","9856876895","9858763487","7356735688","848723674"};
	int index3 = rand.nextInt(strMobileNo.length);
	String strPassword[] = {"ksjyjhs16534","ldjfkjfd7","dhfiu879","dsjfhkj77","kdhgfks8"};
	int index4 = rand.nextInt(strPassword.length);
	int randDay = rand.nextInt(30);
	String strMonth[] = {"January","February","March","April","May","june","July","August","Sep","October","November","Dec"};
	int index5 =rand.nextInt(strMonth.length);
	int randYear = rand.nextInt(2021);
	String strGender[] = {"Male","Female","Custom"};
	
	
	
	public void linkClickFB()
	{
		System.out.println("https://en-gb.facebook.com");
	}
	public void checkLoggedInOrNOt()
	{
		System.out.println("Create a new account");
	}
	
	
	
	public void getFields()
	{
		
		System.out.println("First name: "+strFirstName[index1]+"\t"+"LastName: "+strLastName[index2]);
		System.out.println("Mobile Number: "+strMobileNo[index3]);
		System.out.println("Password: "+strPassword[index4]);
		System.out.println("Date: "+randDay+"\t"+"Month: "+strMonth[index5]+"\t"+"Year:"+randYear);
		System.out.println("Gender: \n"+strGender[1]);
		

	}
	
	
	public void clickSignIn()
	{
		System.out.println("Sign In");
		
	}

	public static void main(String[] args) 
	{
		FacebookPage objFacebookPage =new FacebookPage();
		objFacebookPage.linkClickFB();
		objFacebookPage.checkLoggedInOrNOt();
		objFacebookPage.getFields();
		objFacebookPage.clickSignIn();
		

	}

}
