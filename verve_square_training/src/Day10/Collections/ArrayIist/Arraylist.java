package Day10.Collections.ArrayIist;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

/*To book a flight from make my trip application*/

public class Arraylist 
{
		//Random class
		Random objRandom = new Random();
		
		//Arraylist
		List<String> list = new ArrayList<String>();
		List<String> list1 = new ArrayList<String>();

		List<String> list2 = new ArrayList<String>(Arrays.asList("Adults","Childrens","Infants"));
		List<String> list3 = new ArrayList<String>(Arrays.asList("Senior Citizens"));
		List<String> list4= new ArrayList<String>(Arrays.asList("Economy","Business"));

	
	public void applicationInfo()
	{
		System.out.println("\tMakemy Trip Website...... ");
		System.out.println("=================================");
		System.out.println("\tTo Book a flight");
		System.out.println("----------------------------------");

	}
	
	
	//Use add method.for each loop to iterate
	public void departurePlace()
	{
		System.out.println("Departure Places list:");
		list.add("Mumbai");
		list.add("Pune");
		list.add("Solapur");
		list.add("Banglore");
		list.add("Delhi");
		list.add("Kolkata");
		list.add("Chennai");
		list.add("Goa");
		for(String str:list)
		{
			System.out.println(str);
		}

	}
	
	//Use shuffle method and iterator 
	public void destinationPlace()
	{
		System.out.println("\nDestination Places list:");
		 Collections.shuffle(list);
		 	 list1 = list;

		
		Iterator iter = list1.iterator();
		while(iter.hasNext())
		{
			System.out.println(iter.next());
		}
		
	}
	
	
	public void departureDate()
	{
		System.out.println("\nDeparture Date/Month/Year selected:");
		int randDay = objRandom.nextInt(30);
		if(randDay == 0)
		{
			randDay = objRandom.nextInt(30);
		}
		ArrayList<String> strMonth = new ArrayList<String>(Arrays.asList("January","February","March","April","May","june","July","August","Sep","October","November","Dec"));
		String randomMonth = " ";
		for (int i = 0; i < strMonth.size(); i++) {
			int randomIndex = objRandom.nextInt(strMonth.size());
			randomMonth = strMonth.get(randomIndex);
		}
		String strYear = "2021";
		System.out.println(randDay+"/"+randomMonth+"/"+strYear);
		
	}
	public void returnDate()
	{
		System.out.println("\nReturn Date/Month/Year selected:");
		int randDay = objRandom.nextInt(30);
		if(randDay == 0)
		{
			randDay = objRandom.nextInt(30);
		}
		ArrayList<String> strMonth = new ArrayList<String>(Arrays.asList("January","February","March","April","May","june","July","August","Sep","October","November","Dec"));
		String randomMonth = " ";
		for (int i = 0; i < strMonth.size(); i++) {
			int randomIndex = objRandom.nextInt(strMonth.size());
			randomMonth = strMonth.get(randomIndex);
		}
		String strYear = "2021";
		System.out.println(randDay+"/"+randomMonth+"/"+strYear);	
	}
	
	//Use add all method
	public void travellersTpyeWithNumber()
	{
		System.out.println("\nTravellers involved :");
		list2.addAll(list3);
		System.out.println(list2);
		
		
	}
	public void flightClass()
	{
		System.out.println("\nTravellers Class :");
		 Collections.shuffle(list4);
		System.out.println(list4);

		
	}
	
	//Use get method
	public void bookFlight()
	{
		System.out.println("\nThe flight is booked for 2 Adults........");
		System.out.println("-------------------------------------");
		System.out.println("Departure Place:"+"\tDestination Place:");
		System.out.println(list.get(2)+"\t\t\t"+list1.get(5));
		System.out.print("\nDeparture Date:");
		this.departureDate();
		System.out.print("\nReturn Date:");
		this.returnDate();
		System.out.println("\nTravellers type: "+list2.get(0));
		System.out.println("\nTravellers Class: "+list4.get(0));
		
		
	}



}
