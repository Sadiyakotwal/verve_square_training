package Day3.controlStatemt.array;

import java.util.Scanner;

public class JavaControlStatement
{
	
	
	
	//To check the rainfall rate from year 2015 to 2020
	//Using For Loop
	String strRainfallRate[] = {"60mm","45mm","75mm","80mm","90mm","115mm"};
	String strYear[] = {"2015","2016","2017","2018","2019","2020"};
	
	public void checkForLoop()
	{
		System.out.println("The Rainfall rate from  years 2015 to 2020 is as follows:");
		for(int i=0; i<strRainfallRate.length; i++)
		{
			System.out.println("Year:"+strYear[i]+"\t"+"Rainfall Rate: "+strRainfallRate[i]);
		}
		System.out.println("To check if a particular amount of rainfall is present yes or no ? : ");
		for(int i=0; i<strRainfallRate.length; i++)
		{
			System.out.println("Year:"+strYear[i]+"\t"+"Rainfall Rate: "+strRainfallRate[i]);
			if(strRainfallRate[i].equals("75mm"))
			{
				System.out.println("Yes the rainfall of amount "+strRainfallRate[i]+ " is recorded in year: "+strYear[i]);
				break;
				
			}
		}
	}
	
	
	//To maintain a food inventory
	//Using While loop
	String strfoodGroup[] = {"Fruits","Vegitables","Grains","Protein","Dairy "};
	String strItems[] = {"Apple","Potato","Wheat", "Egg","Milk",};
	int i=0;
	
	public void checkWhileLoop()
	{
		
		System.out.println("The food groups and food items are :");
		while(strfoodGroup.length > i)
		{
			System.out.println("Food group: "+strfoodGroup[i]+"\t "+"Food Items: "+strItems[i]);
			i++;
		}
		i=0;
		System.out.println("The Food Group skiped is:");
		while(strfoodGroup.length > i)
		{
			
			if(strfoodGroup[i].equals("Grains"))
			{
				i++;
				continue;	
			}
			System.out.println("Food Item : "+strfoodGroup[i]);
			i++;
		}
		i=0;
		System.out.println("The Food item skiped is:");
		while(strfoodGroup.length > i)
		{
			
			if(strItems[i].equals("Wheat"))
			{
				i++;
				continue;	
			}
			System.out.println("Food Item : "+strItems[i]);
			i++;
		}	
	}
	
	
	//To check the number of entries in the mall
	//String strPeople[] = new String[5] ;
	String strPeople[] = {"Aman","Sadiya","Geeta","Ray","Raj"};
	public void checkDoWhileLoop()
	{
		int count=0;
		do
		{
			System.out.println("The people in mall are: ");
			if(strPeople[count] == null)
			{
				System.out.println("The mall is empty: ");
				count++;
			}
			
			else
			{
				System.out.println(strPeople[count]);
				count++;
			}
			
		}while(strPeople.length > count);
			
	}
	
	
	
	public void checkForEachLoop()
	{
		
		String strColourAr[] = {"Violet","Indigo","Blue","Green","Yellow","Orange","Red"};
		System.out.println("The rainbow colours are: ");
		for(String str:strColourAr)
		{
			System.out.println(str);
		}
		
	}
	public static void main(String[] args) 
	{
		
		JavaControlStatement objJavaControlStatement = new JavaControlStatement();
		//Verify For loop
		System.out.println("For loop");
		System.out.println("------------------------------------");
		objJavaControlStatement.checkForLoop();
		//Verify while loop
		System.out.println("While loop: ");
		System.out.println("-------------------------------------");
		objJavaControlStatement.checkWhileLoop();
		System.out.println("Do While loop: ");
		System.out.println("-------------------------------------");
		objJavaControlStatement.checkDoWhileLoop();
		System.out.println("For Each loop: ");
		System.out.println("-------------------------------------");
		objJavaControlStatement.checkForEachLoop();
	
		
		
		
		
		
		
		
		
		
		
		
	}

}
