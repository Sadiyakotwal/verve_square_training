package Day5.Utility.Constructors.FB;

import java.awt.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class FacebookUtilities
{
	//Random class
	Random objRandom = new Random();
	
	public String getRandomFirstName(int strLength)
	{
		String name = "abcdefghijklmnopqrstuvwxyz";
		String randomChar ="";
		for (int i = 0; i < strLength; i++) 
		{
			int randomindex = (int) (Math.random()*name.length());
			randomChar = randomChar + name.substring(randomindex, randomindex+1);
			
		}
		return randomChar;
	}
	public String getRandomLirstName(int strLength)
	{
		String name = "abcdefghijklmnopqrstuvwxyz";
		String randomChar ="";
		for (int i = 0; i < strLength; i++) 
		{
			int randomindex = (int) (Math.random()*name.length());
			randomChar = randomChar + name.substring(randomindex, randomindex+1);
			
		}
		return randomChar;
	}
	public String getRandomEmail(int strLength)
	{
		String name = "abcdefghijklmnopqrstuvwxyz";
		String randomMail ="";
		for (int i = 0; i < strLength; i++) 
		{
			int randomindex = (int) (Math.random()*name.length());
			randomMail = randomMail + name.substring(randomindex, randomindex+1);
			
		}
		return randomMail;
		
		
	}
	public String getMobileNO(int strLength) 
	{
		String strMobileNo = "123456789";
		String randMObile = " ";
		for (int i = 0; i < strLength; i++) 
		{
			int randomindex = (int) (Math.random()*strMobileNo.length());
			randMObile =  randMObile + strMobileNo.substring(randomindex, randomindex+1);
			
		}
		return randMObile;
	}
	public String getRandomPassword(int strLength)
	{
		String strPassword ="abcdefghijklmnopqrstuvwxyz@#%$&^*123456789";
		String randomPassword ="";
		for (int i = 0; i < strLength; i++) 
		{
			int randomindex = (int) (Math.random()*strPassword.length());
			randomPassword =  randomPassword + strPassword.substring(randomindex, randomindex+1);
			
		}
		return randomPassword;
		
	}
	public int getRandomDate(int intLength)
	{
		
		int randDay = objRandom.nextInt(30);
		if(randDay == 0)
		{
			randDay = objRandom.nextInt(30);
		}
		return randDay ;
		
	}
	public String getRandomMonth()
	{
		ArrayList<String> strMonth = new ArrayList<String>(Arrays.asList("January","February","March","April","May","june","July","August","Sep","October","November","Dec"));
		String randomMonth = " ";
		for (int i = 0; i < strMonth.size(); i++) {
			int randomIndex = objRandom.nextInt(strMonth.size());
			randomMonth = strMonth.get(randomIndex);
		}
	   return randomMonth;
	}
	public String getRandomYear(int strLength) 
	{
		String strYear = "1234567890";
		String randomYear = "";
		for (int i = 0; i < strLength; i++) 
		{
			int randomindex = (int) (Math.random()*strYear.length());
			randomYear =  randomYear + strYear.substring(randomindex, randomindex+1);
			
		}
		return randomYear;
	}
	public String getRandomGender()
	{
		ArrayList<String> strGender = new ArrayList<String>(Arrays.asList("Male","Female","Custom"));
		String randomGender = " ";
		for (int i = 0; i < strGender.size(); i++) {
			int randomIndex = objRandom.nextInt(strGender.size());
			randomGender = strGender.get(randomIndex);
		}
		return randomGender;
	}

}
